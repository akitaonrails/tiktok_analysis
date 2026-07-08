package X;

import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResType;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.NLETrackType;
import com.bytedance.ies.nle.editor_jni.VecNLEStringFloatPairSPtr;
import com.bytedance.ies.nle.editor_jni.VecString;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Dog, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C350520Dog extends C350680Dow implements InterfaceC354920Dvm {
    public C350520Dog(C0E48 c0e48) {
        super(c0e48);
    }

    public static final NLESegmentComposerFilter LLJJIJIIJIL(C350540Doi c350540Doi) {
        float second;
        NLEStringFloatPair nLEStringFloatPair;
        float fFloatValue;
        NLESegmentComposerFilter nLESegmentComposerFilter = new NLESegmentComposerFilter();
        NLEResourceNode nLEResourceNode = new NLEResourceNode();
        nLEResourceNode.setResourceFile(c350540Doi.LIZJ);
        nLEResourceNode.setResourceId(c350540Doi.LJ);
        nLEResourceNode.setResourceType(NLEResType.COMPOSER);
        nLEResourceNode.setResourceName(c350540Doi.LIZIZ);
        nLESegmentComposerFilter.setEffectSDKFilter(nLEResourceNode);
        nLESegmentComposerFilter.setFilterName("color_filter");
        nLESegmentComposerFilter.setStatus(1);
        nLESegmentComposerFilter.setNodePaths(new VecString(C1697810uHb.LJ(c350540Doi.LIZJ)));
        String[] strArr = new String[1];
        String str = c350540Doi.LJIIIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        strArr[0] = str;
        nLESegmentComposerFilter.setEffectTags(new VecString(C1697810uHb.LJ(strArr)));
        String str3 = c350540Doi.LJIIIZ;
        if (str3 != null) {
            str2 = str3;
        }
        List<Pair<String, Integer>> listLJJJJIZL = C351220Dpo.LJJJJIZL(str2);
        if (listLJJJJIZL != null) {
            for (Pair<String, Integer> pair : listLJJJJIZL) {
                NLEStringFloatPair nLEStringFloatPair2 = new NLEStringFloatPair();
                int i = 100;
                if (pair.getSecond().intValue() != 100) {
                    if (pair.getSecond().intValue() == 0) {
                        i = 0;
                    } else {
                        i = 80;
                    }
                }
                nLESegmentComposerFilter.setExtra("filter_business_intensity", String.valueOf(i));
                nLEStringFloatPair2.setFirst(pair.getFirst());
                Float f = c350540Doi.LJIIIIZZ;
                if (f != null) {
                    fFloatValue = f.floatValue();
                } else {
                    fFloatValue = i / 100.0f;
                }
                nLEStringFloatPair2.setSecond(fFloatValue);
                nLESegmentComposerFilter.addEffectNodeKeyValuePair(nLEStringFloatPair2);
            }
        }
        VecNLEStringFloatPairSPtr effectNodeKeyValuePairs = nLESegmentComposerFilter.getEffectNodeKeyValuePairs();
        if (effectNodeKeyValuePairs != null && (nLEStringFloatPair = (NLEStringFloatPair) C13LP.LJJJLL(effectNodeKeyValuePairs)) != null) {
            second = nLEStringFloatPair.getSecond();
        } else {
            second = 0.8f;
        }
        nLESegmentComposerFilter.setIntensity(second);
        nLESegmentComposerFilter.setExtra("filter_category", c350540Doi.LIZ);
        nLESegmentComposerFilter.setExtra("key_filter_id", c350540Doi.LIZLLL);
        return nLESegmentComposerFilter;
    }

    public final NLETrackSlot LLJJIJIL(C350540Doi c350540Doi) {
        NLETrackSlot nLETrackSlot = new NLETrackSlot();
        nLETrackSlot.setMainSegment(LLJJIJIIJIL(c350540Doi));
        nLETrackSlot.setStartTime(c350540Doi.LJI);
        nLETrackSlot.setEndTime(c350540Doi.LJI + c350540Doi.LJII);
        nLETrackSlot.setExtra("global_filter_type", "color_filter");
        return nLETrackSlot;
    }

    public final boolean LLJJIJI(C350540Doi c350540Doi, EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotLLJJI;
        if (LLJJIII() == null || (nLETrackSlotLLJJI = LLJJI()) == null) {
            return false;
        }
        NLEFilter nLEFilterLJJJI = C351220Dpo.LJJJI(nLETrackSlotLLJJI);
        if (nLEFilterLJJJI != null) {
            nLETrackSlotLLJJI.removeFilter(nLEFilterLJJJI);
            if (TextUtils.isEmpty(c350540Doi.LIZJ)) {
                return true;
            }
        }
        NLEFilter nLEFilter = new NLEFilter();
        if (TextUtils.isEmpty(c350540Doi.LIZJ)) {
            return false;
        }
        nLEFilter.setSegment(LLJJIJIIJIL(c350540Doi));
        nLEFilter.setStartTime(-2L);
        nLEFilter.setEndTime(-2L);
        nLEFilter.setExtra("part_filter_type", "color_filter");
        nLEFilter.setExtra("icon_url", c350540Doi.LJFF);
        nLETrackSlotLLJJI.addFilter(nLEFilter);
        LLJJ(null, enumC356070Dxd);
        return true;
    }

    @Override // X.InterfaceC354920Dvm
    public final NLETrackSlot LJII(NLETrack nLETrack, C350470Dob c350470Dob, EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotDynamicCast;
        NLETrackSlot nLETrackSlotLLJJI = c350470Dob.LIZ;
        if (nLETrackSlotLLJJI == null) {
            nLETrackSlotLLJJI = LLJJI();
        }
        if (nLETrackSlotLLJJI == null || (nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLJJI.deepClone(true))) == null) {
            return null;
        }
        nLETrackSlotDynamicCast.setStartTime(c350470Dob.LIZIZ);
        nLETrackSlotDynamicCast.setEndTime(c350470Dob.LIZIZ + c350470Dob.LIZJ);
        nLETrackSlotDynamicCast.setTransformZ(nLETrack.getLayer() + 20000);
        nLETrackSlotDynamicCast.setExtra("is_ep_copy_global_color_filter", "true");
        nLETrack.addSlot(nLETrackSlotDynamicCast);
        LLJJ(null, enumC356070Dxd);
        return nLETrackSlotDynamicCast;
    }

    @Override // X.InterfaceC354920Dvm
    public final Pair<NLETrack, NLETrackSlot> LJIJ(boolean z, NLETrackSlot nLETrackSlot, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        NLEFilter filterByName;
        NLETrack trackBySlot;
        if (z) {
            if (nLEModel == null) {
                nLEModel = C350870DpF.LJI(this.LIZ);
            }
            if (nLETrackSlot == null) {
                nLETrackSlot = LLJJI();
                trackBySlot = LLJJIII();
            } else {
                trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
            }
            if (trackBySlot != null && C351220Dpo.LLJI(trackBySlot)) {
                trackBySlot.removeSlot(nLETrackSlot);
                LLJJ(null, enumC356070Dxd);
                return new Pair<>(trackBySlot, nLETrackSlot);
            }
            return new Pair<>(null, null);
        }
        if ((nLETrackSlot != null || (nLETrackSlot = LLJJI()) != null) && (filterByName = nLETrackSlot.getFilterByName("color_filter")) != null) {
            nLETrackSlot.removeFilter(filterByName);
            nLETrackSlot.removeExtraWithKey("filter_position");
            nLETrackSlot.removeExtraWithKey("filter_intensity");
            LLJJ(null, enumC356070Dxd);
        }
        return new Pair<>(LLJJIII(), LLJJI());
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007a  */
    @Override // X.InterfaceC354920Dvm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJJLZIJ(boolean r7, com.bytedance.ies.nle.editor_jni.NLETrackSlot r8, float r9, boolean r10, X.EnumC356070Dxd r11) {
        /*
            r6 = this;
            r1 = 0
            if (r8 != 0) goto La
            com.bytedance.ies.nle.editor_jni.NLETrackSlot r8 = r6.LLJJI()
            if (r8 != 0) goto La
            return r1
        La:
            r2 = 0
            if (r7 == 0) goto L18
            com.bytedance.ies.nle.editor_jni.NLESegment r0 = r8.getMainSegment()
            com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter r5 = com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter.dynamicCast(r0)
        L15:
            if (r5 != 0) goto L3d
            return r1
        L18:
            java.lang.String r0 = "color_filter"
            com.bytedance.ies.nle.editor_jni.NLEFilter r0 = r8.getFilterByName(r0)
            if (r0 == 0) goto L3b
            com.bytedance.ies.nle.editor_jni.NLESegmentFilter r0 = r0.getSegment()
        L24:
            com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter r5 = com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter.dynamicCast(r0)
            if (r5 != 0) goto L3d
            com.bytedance.ies.nle.editor_jni.NLEFilter r0 = X.C351220Dpo.LJJJI(r8)
            if (r0 == 0) goto L39
            com.bytedance.ies.nle.editor_jni.NLESegmentFilter r0 = r0.getSegment()
        L34:
            com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter r5 = com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter.dynamicCast(r0)
            goto L15
        L39:
            r0 = r2
            goto L34
        L3b:
            r0 = r2
            goto L24
        L3d:
            com.bytedance.ies.nle.editor_jni.VecNLEStringFloatPairSPtr r0 = r5.getEffectNodeKeyValuePairs()
            java.lang.String r4 = "Filter_intensity"
            if (r0 == 0) goto L67
            java.util.Iterator r3 = r0.iterator()
        L49:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L88
            java.lang.Object r1 = r3.next()
            r0 = r1
            com.bytedance.ies.nle.editor_jni.NLEStringFloatPair r0 = (com.bytedance.ies.nle.editor_jni.NLEStringFloatPair) r0
            java.lang.String r0 = r0.getFirst()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r4)
            if (r0 == 0) goto L49
        L60:
            com.bytedance.ies.nle.editor_jni.NLEStringFloatPair r1 = (com.bytedance.ies.nle.editor_jni.NLEStringFloatPair) r1
            if (r1 == 0) goto L67
            r5.removeEffectNodeKeyValuePair(r1)
        L67:
            com.bytedance.ies.nle.editor_jni.NLEStringFloatPair r0 = new com.bytedance.ies.nle.editor_jni.NLEStringFloatPair
            r0.<init>()
            r0.setFirst(r4)
            r0.setSecond(r9)
            r5.addEffectNodeKeyValuePair(r0)
            r5.setIntensity(r9)
            if (r7 == 0) goto L83
            java.lang.String r1 = "is_ep_update_global_color_filter_intensity"
            java.lang.String r0 = java.lang.String.valueOf(r10)
            r8.setExtra(r1, r0)
        L83:
            r6.LLJJ(r2, r11)
            r0 = 1
            return r0
        L88:
            r1 = r2
            goto L60
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C350520Dog.LJJJLZIJ(boolean, com.bytedance.ies.nle.editor_jni.NLETrackSlot, float, boolean, X.0Dxd):boolean");
    }

    @Override // X.InterfaceC354920Dvm
    public final NLETrackSlot LJZI(boolean z, C350540Doi c350540Doi, NLETrack nLETrack, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel) {
        NLEModel nLEModelLJI;
        int i;
        int iLJ;
        int layer;
        if (z) {
            NLETrackSlot nLETrackSlotLLJJIJIL = LLJJIJIL(c350540Doi);
            if (nLEModel == null) {
                nLEModelLJI = C350870DpF.LJI(this.LIZ);
            } else {
                nLEModelLJI = nLEModel;
            }
            if (nLETrack != null) {
                if (C351420Dq8.LIZLLL(nLEModelLJI)) {
                    layer = C351420Dq8.LJ(nLEModelLJI, EnumC355980DxU.FILTER);
                } else {
                    layer = nLETrack.getLayer() + 20000;
                }
                nLETrackSlotLLJJIJIL.setTransformZ(layer);
                nLETrack.addSlot(nLETrackSlotLLJJIJIL);
            } else {
                if (nLEModel == null) {
                    nLEModel = C350870DpF.LJI(this.LIZ);
                }
                if (C351220Dpo.LJJIIZ(nLEModel).isEmpty()) {
                    i = 0;
                } else {
                    Iterator<NLETrack> it2 = C351220Dpo.LJJIIZ(nLEModel).iterator();
                    if (it2.hasNext()) {
                        int layer2 = it2.next().getLayer();
                        while (it2.hasNext()) {
                            int layer3 = it2.next().getLayer();
                            if (layer2 < layer3) {
                                layer2 = layer3;
                            }
                        }
                        i = layer2 + 1;
                    } else {
                        throw new NoSuchElementException();
                    }
                }
                boolean zLIZLLL = C351420Dq8.LIZLLL(nLEModel);
                NLETrack nLETrack2 = new NLETrack();
                nLETrack2.setMainTrack(false);
                nLETrack2.setLayer(i);
                nLETrack2.setExtra("track_type", "type_filter_filter");
                nLETrack2.setExtraTrackType(NLETrackType.FILTER);
                nLETrack2.setExtra("FilterTrackType", "COLOR");
                nLETrack2.setExtra("biz_extra_type", "color_filter");
                C351220Dpo.LLLLJI(nLETrack2);
                if (zLIZLLL) {
                    iLJ = C351420Dq8.LJ(nLEModel, EnumC355980DxU.FILTER);
                } else {
                    iLJ = i + 20000;
                }
                nLETrackSlotLLJJIJIL.setTransformZ(iLJ);
                nLETrack2.addSlot(nLETrackSlotLLJJIJIL);
                nLEModel.addTrack(nLETrack2);
            }
            LLJJ(null, enumC356070Dxd);
            return nLETrackSlotLLJJIJIL;
        }
        LLJJIJI(c350540Doi, enumC356070Dxd);
        return LLJJI();
    }

    @Override // X.InterfaceC354920Dvm
    public final NLETrackSlot LL(NLETrackSlot nLETrackSlot, C350540Doi c350540Doi, EnumC356070Dxd enumC356070Dxd, NLEModel nLEModel, boolean z) {
        int layer;
        if (nLETrackSlot == null) {
            nLETrackSlot = LLJJI();
        }
        if (nLETrackSlot != null) {
            if (nLEModel == null) {
                nLEModel = C350870DpF.LJI(this.LIZ);
            }
            NLETrack trackBySlot = nLEModel.getTrackBySlot(nLETrackSlot);
            if (trackBySlot != null) {
                trackBySlot.removeSlot(nLETrackSlot);
                NLETrackSlot nLETrackSlotLLJJIJIL = LLJJIJIL(c350540Doi);
                if (C351420Dq8.LIZLLL(nLEModel)) {
                    layer = nLETrackSlot.getTransformZ();
                } else {
                    layer = trackBySlot.getLayer() + 20000;
                }
                nLETrackSlotLLJJIJIL.setTransformZ(layer);
                nLETrackSlotLLJJIJIL.setExtra("is_ep_replaced_global_color_filter", String.valueOf(z));
                nLETrackSlotLLJJIJIL.setExtra("is_ep_update_global_color_filter_intensity", String.valueOf(z));
                nLETrackSlotLLJJIJIL.setExtra("is_ep_clip_global_color_filter", String.valueOf(z));
                nLETrackSlotLLJJIJIL.setExtra("is_ep_global_color_filter", String.valueOf(z));
                trackBySlot.addSlot(nLETrackSlotLLJJIJIL);
                LLJJ(null, enumC356070Dxd);
                return nLETrackSlotLLJJIJIL;
            }
        }
        return null;
    }
}
