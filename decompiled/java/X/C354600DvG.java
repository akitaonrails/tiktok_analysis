package X;

import com.bytedance.ies.nle.editor_jni.NLEAIMatting;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentAIMatting;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.interfaces.ITemplateInsertMediaService;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0DvG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354600DvG {
    public static final C354600DvG LIZ = new C354600DvG();

    public static List LIZLLL(List list) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NLENode nLENode = (NLENode) it2.next();
            String extra = nLENode.getExtra("same_asset_group");
            if (extra != null && extra.length() != 0) {
                String extra2 = nLENode.getExtra("same_asset_group");
                Object arrayList2 = linkedHashMap.get(extra2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    arrayList.add(arrayList2);
                    linkedHashMap.put(extra2, arrayList2);
                }
                ((List) arrayList2).add(nLENode);
            } else {
                arrayList.add(Collections.singletonList(nLENode));
            }
        }
        return arrayList;
    }

    public static void LIZ(NLESegmentVideo nLESegmentVideo, NLETrackSlot nLETrackSlot) {
        NLESegmentAIMatting segment;
        if (nLETrackSlot.getAIMatting() != null) {
            NLEAIMatting aIMatting = nLETrackSlot.getAIMatting();
            if (aIMatting != null) {
                segment = aIMatting.getSegment();
            } else {
                segment = null;
            }
            NLESegmentAIMatting nLESegmentAIMattingDynamicCast = NLESegmentAIMatting.dynamicCast(segment);
            if (nLESegmentAIMattingDynamicCast != null) {
                nLESegmentAIMattingDynamicCast.setAiMattingCilpStart(nLESegmentVideo.getTimeClipStart());
                nLESegmentAIMattingDynamicCast.setAiMattingCilpEnd(nLESegmentVideo.getTimeClipEnd());
            }
        }
    }

    public static List LIZJ(int i, List list) {
        if (list.isEmpty()) {
            return C13BV.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            Object objLJJJLZIJ = C13LP.LJJJLZIJ(i2 % list.size(), list);
            if (objLJJJLZIJ != null) {
                arrayList.add(objLJJJLZIJ);
            }
        }
        return arrayList;
    }

    public static void LIZIZ(Integer num, NLETemplateModel nLETemplateModel, List list) {
        int i;
        if (nLETemplateModel == null || list.isEmpty()) {
            return;
        }
        VecNLETrackSlotSPtr mutableAssetItems = nLETemplateModel.getMutableAssetItems();
        ArrayList arrayList = new ArrayList();
        Iterator<NLETrackSlot> it2 = mutableAssetItems.iterator();
        while (true) {
            i = 0;
            if (!it2.hasNext()) {
                break;
            }
            NLETrackSlot next = it2.next();
            if (NLESegmentVideo.dynamicCast((NLENode) next.getMainSegment()) != null) {
                arrayList.add(next);
            }
        }
        for (Object obj : (ArrayList) LIZLLL(arrayList)) {
            int i2 = i + 1;
            if (i >= 0) {
                C0E4S c0e4s = (C0E4S) ListProtector.get(list, i % list.size());
                for (NLETrackSlot nLETrackSlot : (List) obj) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
                    if (nLESegmentVideoDynamicCast != null) {
                        NLEResourceNode resource = nLESegmentVideoDynamicCast.getResource();
                        if (resource != null) {
                            resource.setResourceFile(c0e4s.LIZ);
                        }
                        NLEResourceNode resource2 = nLESegmentVideoDynamicCast.getResource();
                        if (resource2 != null) {
                            resource2.setResourceType(c0e4s.LIZIZ);
                        }
                        if (c0e4s.LIZIZ == NLEResType.VIDEO) {
                            C2356009La c2356009La = C2356009La.LIZ;
                            String str = c0e4s.LIZ;
                            c2356009La.getClass();
                            VEUtils.VEVideoFileInfo vEVideoFileInfoLIZ = C2356009La.LIZ(str);
                            if (vEVideoFileInfoLIZ != null) {
                                nLESegmentVideoDynamicCast.getResource().setDuration(C352310DrZ.LIZJ(vEVideoFileInfoLIZ.duration));
                            }
                        }
                        long jLIZLLL = C352310DrZ.LIZLLL(c0e4s.LJ);
                        long jLIZLLL2 = C352310DrZ.LIZLLL(c0e4s.LJFF) - jLIZLLL;
                        if (0 == jLIZLLL2 || c0e4s.LIZIZ == NLEResType.IMAGE) {
                            jLIZLLL2 = nLESegmentVideoDynamicCast.getRawDuration();
                        }
                        long j = jLIZLLL + jLIZLLL2;
                        ITemplateInsertMediaService iTemplateInsertMediaService = (ITemplateInsertMediaService) ServiceManager.get().getService(ITemplateInsertMediaService.class);
                        if (iTemplateInsertMediaService != null) {
                            iTemplateInsertMediaService.LIZIZ(num, nLETemplateModel, jLIZLLL, j, nLETrackSlot);
                        }
                        LIZ.getClass();
                        LIZ(nLESegmentVideoDynamicCast, nLETrackSlot);
                    }
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }
}
