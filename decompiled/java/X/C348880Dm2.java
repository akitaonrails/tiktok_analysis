package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.filter.FilterBean;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dm2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public class C348880Dm2 {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C1463670oBx LIZ;

    public void LIZJ() {
        C348240Dl0 c348240Dl0LIZIZ = this.LIZ.LIZLLL().LJ().LIZIZ();
        if (c348240Dl0LIZIZ == null) {
            c348240Dl0LIZIZ = new C348240Dl0(EnumC356010DxX.COLOR);
        }
        c348240Dl0LIZIZ.LIZLLL.clear();
    }

    public C348880Dm2(C1463670oBx c1463670oBx) {
        this.LIZ = c1463670oBx;
    }

    public final void LIZLLL(List<String> list) {
        C348100Dkm c348100DkmLIZLLL = this.LIZ.LIZLLL();
        C348240Dl0 c348240Dl0LIZIZ = c348100DkmLIZLLL.LJ().LIZIZ();
        if (c348240Dl0LIZIZ != null) {
            Iterator<String> it2 = list.iterator();
            while (it2.hasNext()) {
                c348240Dl0LIZIZ.LIZ(it2.next());
            }
            c348100DkmLIZLLL.LJ().LJIJ(c348240Dl0LIZIZ, true, false);
        }
    }

    public final void LJFF(String[] strArr, float[] fArr) {
        C348240Dl0 c348240Dl0LIZIZ;
        String str;
        NLEModel model;
        VecNLETrackSPtr tracks;
        String resourceFile;
        String str2;
        NLEStringFloatPair next;
        NLEResourceNode resource;
        C348100Dkm c348100DkmLIZLLL = this.LIZ.LIZLLL();
        if (fArr.length >= 2 && strArr.length >= 2 && (c348240Dl0LIZIZ = c348100DkmLIZLLL.LJ().LIZIZ()) != null && (str = c348240Dl0LIZIZ.LIZIZ) != null && (model = c348100DkmLIZLLL.LIZ.getModel()) != null && (tracks = model.getTracks()) != null) {
            NLETrackSlot nLETrackSlot = null;
            NLETrackSlot nLETrackSlot2 = null;
            for (NLETrack nLETrack : tracks) {
                if (Intrinsics.LJFF(nLETrack.getUUID(), str)) {
                    for (NLETrackSlot nLETrackSlot3 : nLETrack.getSlots()) {
                        NLESegment mainSegment = nLETrackSlot3.getMainSegment();
                        if (mainSegment != null && (resource = mainSegment.getResource()) != null) {
                            resourceFile = resource.getResourceFile();
                        } else {
                            resourceFile = null;
                        }
                        if (Intrinsics.LJFF(resourceFile, strArr[0])) {
                            str2 = "leftSlidePosition";
                            nLETrackSlot = nLETrackSlot3;
                        } else if (Intrinsics.LJFF(resourceFile, strArr[1])) {
                            str2 = "rightSlidePosition";
                            nLETrackSlot2 = nLETrackSlot3;
                        }
                        NLESegmentComposerFilter nLESegmentComposerFilterDynamicCast = NLESegmentComposerFilter.dynamicCast((NLENode) nLETrackSlot3.getMainSegment());
                        if (nLESegmentComposerFilterDynamicCast != null) {
                            Iterator<NLEStringFloatPair> it2 = nLESegmentComposerFilterDynamicCast.getEffectNodeKeyValuePairs().iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    next = it2.next();
                                    if (Intrinsics.LJFF(next.getFirst(), str2)) {
                                        break;
                                    }
                                } else {
                                    next = null;
                                    break;
                                }
                            }
                            NLEStringFloatPair nLEStringFloatPair = next;
                            if (nLEStringFloatPair != null) {
                                nLESegmentComposerFilterDynamicCast.removeEffectNodeKeyValuePair(nLEStringFloatPair);
                            }
                            NLEStringFloatPair nLEStringFloatPair2 = new NLEStringFloatPair();
                            nLEStringFloatPair2.setFirst(str2);
                            nLEStringFloatPair2.setSecond(fArr[0]);
                            nLESegmentComposerFilterDynamicCast.addEffectNodeKeyValuePair(nLEStringFloatPair2);
                        }
                    }
                }
                c348100DkmLIZLLL.LIZIZ.getFilterApi().updateMultiComposerNodesInSwing(nLETrackSlot, nLETrackSlot2);
            }
        }
    }

    public void LJII(float f, String str) {
        C348100Dkm c348100DkmLIZLLL = this.LIZ.LIZLLL();
        C348240Dl0 c348240Dl0LIZIZ = c348100DkmLIZLLL.LJ().LIZIZ();
        if (c348240Dl0LIZIZ != null) {
            c348240Dl0LIZIZ.LJ(Float.valueOf(f), str, "Filter_intensity");
            c348100DkmLIZLLL.LJ().LJIJ(c348240Dl0LIZIZ, true, false);
        }
    }

    public void LJ(FilterBean filterBean, FilterBean filterBean2, float f, boolean z) {
        String filterFolder;
        if (filterBean == null || (filterFolder = filterBean.getFilterFolder()) == null) {
            filterFolder = "";
        }
        List listSingletonList = Collections.singletonList(filterFolder);
        List<String> listSingletonList2 = Collections.singletonList(C1643880ssc.LIZIZ(filterBean2, 0.8f));
        List<String> listSingletonList3 = Collections.singletonList(filterBean2.getExtra());
        List<Pair> listSingletonList4 = Collections.singletonList(new Pair(filterBean2.getFilterFolder(), filterBean2.getResId()));
        C348100Dkm c348100DkmLIZLLL = this.LIZ.LIZLLL();
        C348240Dl0 c348240Dl0LIZIZ = c348100DkmLIZLLL.LJ().LIZIZ();
        if (c348240Dl0LIZIZ != null) {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : listSingletonList) {
                int i2 = i + 1;
                if (i >= 0) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) obj);
                    sbLIZ.append(":Filter_intensity:0");
                    ListProtector.add(arrayList, i, C2188811AlT.LIZIZ(sbLIZ));
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            c348240Dl0LIZIZ.LIZIZ(arrayList, listSingletonList2, listSingletonList3);
            for (Pair pair : listSingletonList4) {
                c348240Dl0LIZIZ.LJFF((String) pair.getFirst(), (String) pair.getSecond());
            }
            if (((Boolean) C273160AnC.LIZ.getValue()).booleanValue()) {
                c348240Dl0LIZIZ.LJ(Float.valueOf(f), filterBean2.getFilterFolder(), "Filter_intensity");
            }
            c348100DkmLIZLLL.LJ().LJIJ(c348240Dl0LIZIZ, true, z);
        }
    }

    public void LIZ(String str, List<Pair<String, Float>> list, String str2, String str3, String str4, String str5, String str6, float f, boolean z) {
        C348100Dkm c348100DkmLIZLLL = this.LIZ.LIZLLL();
        C348240Dl0 c348240Dl0LIZIZ = c348100DkmLIZLLL.LJ().LIZIZ();
        if (c348240Dl0LIZIZ == null) {
            c348240Dl0LIZIZ = new C348240Dl0(EnumC356010DxX.COLOR);
        }
        c348240Dl0LIZIZ.LJFF(str, str5);
        for (Pair<String, Float> pair : list) {
            c348240Dl0LIZIZ.LJ(pair.getSecond(), str, pair.getFirst());
        }
        if (str6 != null) {
            c348240Dl0LIZIZ.LIZJ(str, str6);
        }
        c348100DkmLIZLLL.LJ().LJIJ(c348240Dl0LIZIZ, true, z);
    }
}
