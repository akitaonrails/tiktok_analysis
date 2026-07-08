package X;

import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLERenderProxySegment;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideo;
import com.bytedance.ies.nle.editor_jni.NLETemplateModel;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSlotSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Dud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354210Dud extends AbstractC354420Duy {
    @Override // X.AbstractC354420Duy
    public final void LIZLLL(C354540DvA c354540DvA, C354550DvB c354550DvB) {
        String extra;
        NLESegmentVideo nLESegmentVideoDynamicCast;
        NLEResourceAV aVFile;
        C354240Dug c354240Dug = c354540DvA.LIZIZ;
        C354510Dv7 c354510Dv7 = c354240Dug.LIZ;
        String str = c354510Dv7.LIZIZ;
        String str2 = c354510Dv7.LIZJ;
        NLETrackSlot nLETrackSlot = c354240Dug.LIZIZ;
        NLETrackSlot renderProxy = nLETrackSlot.getRenderProxy();
        if (renderProxy != null && renderProxy.hasExtra("ep_magic_resource_id") && (extra = renderProxy.getExtra("ep_magic_resource_id")) != null && (!a0.LJJJIL(extra)) && Intrinsics.LJFF(str, extra)) {
            nLETrackSlot.setRenderProxy(null);
            nLETrackSlot.setProcessor(new VecString());
            nLETrackSlot.removeExtraWithKey("from_ep_create");
            C354260Dui.LIZ.getClass();
            C354260Dui.LJ(nLETrackSlot, str, str2);
            nLETrackSlot.removeExtraWithKey("ep_magic_category_id");
            NLESegmentVideo nLESegmentVideoDynamicCast2 = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment());
            if (nLESegmentVideoDynamicCast2 != null && (nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot.getMainSegment())) != null && (aVFile = nLESegmentVideoDynamicCast.getAVFile()) != null) {
                if (aVFile.getResourceType() == NLEResType.IMAGE) {
                    nLESegmentVideoDynamicCast2.setAbsSpeed(1.0f);
                    aVFile.setDuration(nLETrackSlot.getDuration());
                    nLESegmentVideoDynamicCast2.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast2.setTimeClipEnd(nLETrackSlot.getDuration());
                } else if (aVFile.getResourceType() == NLEResType.VIDEO) {
                    float fLIZ = C351220Dpo.LIZ(nLESegmentVideoDynamicCast2);
                    if (nLETrackSlot.getDuration() * fLIZ > aVFile.getDuration()) {
                        nLETrackSlot.setDuration((long) (aVFile.getDuration() / fLIZ));
                        nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + ((long) (aVFile.getDuration() / fLIZ)));
                        nLESegmentVideoDynamicCast2.setTimeClipStart(0L);
                        nLESegmentVideoDynamicCast2.setTimeClipEnd(aVFile.getDuration());
                    } else if (nLESegmentVideoDynamicCast2.getTimeClipEnd() > aVFile.getDuration()) {
                        if (nLESegmentVideoDynamicCast2.getTimeClipStart() >= aVFile.getDuration() - ((long) 100000)) {
                            nLESegmentVideoDynamicCast2.setTimeClipStart(aVFile.getDuration() - (nLESegmentVideoDynamicCast2.getTimeClipEnd() - nLESegmentVideoDynamicCast2.getTimeClipStart()));
                            nLESegmentVideoDynamicCast2.setTimeClipEnd(aVFile.getDuration());
                        } else {
                            nLESegmentVideoDynamicCast2.setTimeClipEnd(aVFile.getDuration());
                            long duration = (long) ((aVFile.getDuration() - nLESegmentVideoDynamicCast2.getTimeClipStart()) / fLIZ);
                            nLETrackSlot.setDuration(duration);
                            nLETrackSlot.setEndTime(nLETrackSlot.getStartTime() + duration);
                        }
                    }
                }
            }
        }
        if (nLETrackSlot.hasExtra("ep_magic_resource_id")) {
            String extra2 = nLETrackSlot.getExtra("ep_magic_resource_id");
            if (extra2 != null && extra2.length() != 0 && Intrinsics.LJFF(extra2, str)) {
                C354260Dui.LIZ.getClass();
                C354260Dui.LJ(nLETrackSlot, str, str2);
                nLETrackSlot.removeExtraWithKey("is_from_ep_magic");
            }
        } else {
            nLETrackSlot.removeExtraWithKey("is_from_ep_magic");
        }
        c354550DvB.LIZ(new C354570DvD(true, null, null, 6));
    }

    @Override // X.AbstractC354420Duy
    public final void LIZJ(C354540DvA c354540DvA, C354550DvB c354550DvB, C354570DvD c354570DvD) {
        NLETrack mainTrack;
        VecNLETrackSlotSPtr sortedSlots;
        NLETrackSlot nLETrackSlot;
        boolean z;
        NLEResourceAV aVFile;
        Map linkedHashMap;
        NLETemplateModel nLETemplateModel = c354540DvA.LIZJ;
        if (nLETemplateModel != null && (mainTrack = nLETemplateModel.getMainTrack()) != null && (sortedSlots = mainTrack.getSortedSlots()) != null && (nLETrackSlot = (NLETrackSlot) C13LP.LJJJLL(sortedSlots)) != null) {
            if (nLETrackSlot.getRenderProxy() != null) {
                z = true;
            } else {
                z = false;
            }
            C354240Dug c354240Dug = c354540DvA.LIZIZ;
            NLETrackSlot nLETrackSlot2 = c354240Dug.LIZIZ;
            Iterator it2 = C13LP.LJJJJI(c354240Dug.LIZ.LJ).iterator();
            int i = 0;
            while (true) {
                int i2 = 2;
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (next != EnumC356200Dxq.VIDEO) {
                    if (next == EnumC356200Dxq.PHOTO) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                }
                i += i2;
            }
            nLETrackSlot2.setExtra("is_from_ep_magic", "true");
            nLETrackSlot2.setExtra("from_ep_create", "true");
            nLETrackSlot2.setExtra("biz_magic_support_type", String.valueOf(i));
            if (!z) {
                if (c354570DvD == null || (linkedHashMap = c354570DvD.LIZJ) == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                c354550DvB.LIZ(new C354570DvD(true, null, linkedHashMap, 2));
                return;
            }
            NLETrackSlot nLETrackSlot3 = c354540DvA.LIZIZ.LIZIZ;
            NLERenderProxySegment nLERenderProxySegmentDynamicCast = NLERenderProxySegment.dynamicCast(nLETrackSlot.getRenderProxy().getMainSegment());
            if (nLERenderProxySegmentDynamicCast != null) {
                C354510Dv7 c354510Dv7 = c354540DvA.LIZIZ.LIZ;
                String str = c354510Dv7.LIZIZ;
                String str2 = c354510Dv7.LIZJ;
                String str3 = c354510Dv7.LJII;
                String str4 = c354510Dv7.LIZ;
                String str5 = c354510Dv7.LJIIIIZZ;
                nLETrackSlot3.setRenderProxy(nLETrackSlot.getRenderProxy());
                nLETrackSlot3.setProcessor(nLETrackSlot.getProcessor());
                C354260Dui.LIZ.getClass();
                C354260Dui.LIZIZ(nLETrackSlot3, str, str2, str4, str5);
                nLETrackSlot3.setExtra("ep_magic_category_id", str3);
                nLETrackSlot3.getRenderProxy().setExtra("ep_magic_resource_id", str);
                nLETrackSlot3.getRenderProxy().setExtra("is_from_ep_magic", "true");
                nLETrackSlot3.setExtra("from_ep_create", "true");
                NLEResourceAV aVFile2 = nLERenderProxySegmentDynamicCast.getAVFile();
                NLEResType resourceType = aVFile2.getResourceType();
                NLEResType nLEResType = NLEResType.IMAGE;
                if (resourceType == nLEResType) {
                    NLERenderProxySegment nLERenderProxySegmentDynamicCast2 = NLERenderProxySegment.dynamicCast(nLETrackSlot3.getRenderProxy().getMainSegment());
                    if (nLERenderProxySegmentDynamicCast2 != null && (aVFile = nLERenderProxySegmentDynamicCast2.getAVFile()) != null) {
                        aVFile.setDuration(nLETrackSlot3.getDuration());
                    }
                } else if (resourceType == NLEResType.VIDEO) {
                    NLESegmentVideo nLESegmentVideoDynamicCast = NLESegmentVideo.dynamicCast((NLENode) nLETrackSlot3.getMainSegment());
                    long duration = aVFile2.getDuration();
                    long jLIZ = (long) (duration / C351220Dpo.LIZ(nLESegmentVideoDynamicCast));
                    nLETrackSlot3.setDuration(jLIZ);
                    nLETrackSlot3.setEndTime(nLETrackSlot3.getStartTime() + jLIZ);
                    nLESegmentVideoDynamicCast.setTimeClipStart(0L);
                    nLESegmentVideoDynamicCast.setTimeClipEnd(duration);
                    if (nLESegmentVideoDynamicCast.getResource().getResourceType() == nLEResType) {
                        nLESegmentVideoDynamicCast.getResource().setDuration(duration);
                    }
                }
                c354550DvB.LIZ(new C354570DvD(true, null, null, 6));
                return;
            }
        }
        c354550DvB.LIZ(new C354570DvD(false, null, null, 6));
    }
}
