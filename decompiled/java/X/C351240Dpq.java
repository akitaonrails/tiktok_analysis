package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEHSLColorType;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentHSLFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import com.bytedance.ies.nle.editor_jni.VecNLETrackSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dpq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351240Dpq extends C350680Dow implements InterfaceC351310Dpx {
    public final C351250Dpr LJ;

    @Override // X.InterfaceC351310Dpx
    public final void LJJIJIL() {
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI != null) {
            C351250Dpr c351250Dpr = this.LJ;
            NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
            c351250Dpr.getClass();
            if (C351220Dpo.LLJJIJIIJIL(nLETrackSlotLLJJI)) {
                Iterator it2 = ((ArrayList) C351220Dpo.LJIIIIZZ(nLEModelLJI, nLETrackSlotLLJJI)).iterator();
                while (it2.hasNext()) {
                    nLEModelLJI.removeTrack((NLETrack) it2.next());
                }
                NLESegmentHSLFilter nLESegmentHSLFilterDynamicCast = NLESegmentHSLFilter.dynamicCast((NLENode) nLETrackSlotLLJJI.getMainSegment());
                if (nLESegmentHSLFilterDynamicCast != null) {
                    nLESegmentHSLFilterDynamicCast.setHue(0.5d);
                    nLESegmentHSLFilterDynamicCast.setSaturation(0.5d);
                    nLESegmentHSLFilterDynamicCast.setLightness(0.5d);
                }
                NLESegmentFilter nLESegmentFilterDynamicCast = NLESegmentFilter.dynamicCast(nLETrackSlotLLJJI.getMainSegment());
                if (nLESegmentFilterDynamicCast != null) {
                    for (NLEStringFloatPair nLEStringFloatPair : nLESegmentFilterDynamicCast.getAdjustParamss()) {
                        nLESegmentFilterDynamicCast.removeAdjustParams(nLEStringFloatPair);
                        NLEStringFloatPair nLEStringFloatPair2 = new NLEStringFloatPair();
                        nLEStringFloatPair2.setFirst(nLEStringFloatPair.getFirst());
                        nLEStringFloatPair2.setSecond(0.0f);
                        nLESegmentFilterDynamicCast.addAdjustParams(nLEStringFloatPair2);
                    }
                    nLESegmentFilterDynamicCast.setIntensity(0.0f);
                }
            } else {
                for (NLEFilter nLEFilter : nLETrackSlotLLJJI.getFilters()) {
                    if (C351220Dpo.LLIIL(nLEFilter)) {
                        nLETrackSlotLLJJI.removeFilter(nLEFilter);
                    }
                }
            }
        }
        LLJJ(null, EnumC356070Dxd.COMMIT);
    }

    public C351240Dpq(C0E48 c0e48) {
        super(c0e48);
        TimeUnit.SECONDS.toMicros(3L);
        this.LJ = new C351250Dpr();
    }

    @Override // X.InterfaceC351310Dpx
    public final Map<EnumC355950DxR, C351400Dq6> LJIIIIZZ(NLETrackSlot nLETrackSlot) {
        C351250Dpr c351250Dpr = this.LJ;
        NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
        c351250Dpr.getClass();
        return C351250Dpr.LIZJ(nLEModelLJI, nLETrackSlot);
    }

    @Override // X.InterfaceC351310Dpx
    public final NLETrackSlot LJJJJIZL(long j) {
        NLETrackSlot nLETrackSlotDynamicCast;
        Pair pair;
        int layer;
        NLETrackSlot nLETrackSlotLLJJI = LLJJI();
        if (nLETrackSlotLLJJI != null) {
            C351250Dpr c351250Dpr = this.LJ;
            NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
            c351250Dpr.getClass();
            long duration = nLETrackSlotLLJJI.getDuration();
            if (j < 0) {
                pair = new Pair(Long.valueOf(nLETrackSlotLLJJI.getStartTime()), Long.valueOf(nLETrackSlotLLJJI.getEndTime()));
            } else {
                if (duration <= j) {
                    j = duration;
                }
                pair = new Pair(Long.valueOf(nLETrackSlotLLJJI.getEndTime()), Long.valueOf(nLETrackSlotLLJJI.getEndTime() + j));
            }
            ArrayList arrayList = new ArrayList();
            VecNLETrackSPtr tracks = nLEModelLJI.getTracks();
            ArrayList arrayList2 = new ArrayList();
            for (NLETrack nLETrack : tracks) {
                if (C351220Dpo.LLIILZL(nLETrack)) {
                    arrayList2.add(nLETrack);
                }
            }
            arrayList.addAll(arrayList2);
            C351510DqH.LIZ.getClass();
            NLETrack nLETrackLJIILL = C351510DqH.LJIILL(pair, arrayList);
            if (nLETrackLJIILL == null) {
                nLETrackLJIILL = C351250Dpr.LIZIZ(nLEModelLJI, 0L, true);
            }
            nLETrackSlotDynamicCast = NLETrackSlot.dynamicCast(nLETrackSlotLLJJI.deepClone(true));
            nLETrackSlotDynamicCast.setStartTime(((Number) pair.getFirst()).longValue());
            nLETrackSlotDynamicCast.setEndTime(((Number) pair.getSecond()).longValue());
            if (C351420Dq8.LIZLLL(nLEModelLJI)) {
                nLETrackSlotDynamicCast.setTransformZ(C351420Dq8.LJ(nLEModelLJI, EnumC355980DxU.ADJUST));
            }
            nLETrackLJIILL.addSlot(nLETrackSlotDynamicCast);
            Iterator it2 = ((ArrayList) C351220Dpo.LJIIIIZZ(nLEModelLJI, nLETrackSlotLLJJI)).iterator();
            while (it2.hasNext()) {
                NLETrack nLETrackDynamicCast = NLETrack.dynamicCast(((NLENode) it2.next()).deepClone(true));
                if (nLETrackDynamicCast != null) {
                    nLETrackDynamicCast.setExtra("global_adjust_shadow", nLETrackSlotDynamicCast.getUUID());
                    NLETimeSpaceNode nLETimeSpaceNode = (NLETimeSpaceNode) C13LP.LJJJLL(nLETrackDynamicCast.getSlots());
                    if (nLETimeSpaceNode != null) {
                        nLETimeSpaceNode.setStartTime(nLETrackSlotDynamicCast.getStartTime());
                        nLETimeSpaceNode.setEndTime(nLETrackSlotDynamicCast.getEndTime());
                        if (C351420Dq8.LIZLLL(nLEModelLJI)) {
                            layer = nLETrackSlotDynamicCast.getTransformZ();
                        } else {
                            layer = nLETrackLJIILL.getLayer() + 10000;
                        }
                        nLETimeSpaceNode.setTransformZ(layer);
                    }
                    nLEModelLJI.addTrack(nLETrackDynamicCast);
                }
            }
        } else {
            nLETrackSlotDynamicCast = null;
        }
        C350870DpF.LIZ(this.LIZ, false);
        return nLETrackSlotDynamicCast;
    }

    @Override // X.InterfaceC351310Dpx
    public final NLETrack LJJJJZI(EnumC356070Dxd enumC356070Dxd) {
        long jLLLLLLJ = C351220Dpo.LLLLLLJ(this.LIZ.getPlayer().qq());
        NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
        this.LJ.getClass();
        NLETrack nLETrackLIZIZ = C351250Dpr.LIZIZ(nLEModelLJI, jLLLLLLJ, false);
        LLJJ(null, enumC356070Dxd);
        return nLETrackLIZIZ;
    }

    @Override // X.InterfaceC351310Dpx
    public final void LJL(EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotLLJJI;
        NLETrack nLETrackLLJJIII = LLJJIII();
        if (nLETrackLLJJIII != null && (nLETrackSlotLLJJI = LLJJI()) != null) {
            C351250Dpr c351250Dpr = this.LJ;
            NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
            c351250Dpr.getClass();
            nLETrackLLJJIII.removeSlot(nLETrackSlotLLJJI);
            if (nLETrackLLJJIII.getSlots().isEmpty()) {
                nLEModelLJI.removeTrack(nLETrackLLJJIII);
            }
            Iterator it2 = ((ArrayList) C351220Dpo.LJIIIIZZ(nLEModelLJI, nLETrackSlotLLJJI)).iterator();
            while (it2.hasNext()) {
                nLEModelLJI.removeTrack((NLETrack) it2.next());
            }
        }
        LLJJ(null, enumC356070Dxd);
    }

    @Override // X.InterfaceC351310Dpx
    public final Map<NLEHSLColorType, C351400Dq6> LJLZ(NLETrackSlot nLETrackSlot) {
        ArrayList<NLESegmentHSLFilter> arrayList;
        NLESegment mainSegment;
        C351250Dpr c351250Dpr = this.LJ;
        NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
        c351250Dpr.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C351220Dpo.LLJJIJIIJIL(nLETrackSlot)) {
            List listLJIIIIZZ = C351220Dpo.LJIIIIZZ(nLEModelLJI, nLETrackSlot);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
            Iterator it2 = ((ArrayList) listLJIIIIZZ).iterator();
            while (it2.hasNext()) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(((NLETrack) it2.next()).getSlots());
                if (nLETrackSlot2 != null) {
                    mainSegment = nLETrackSlot2.getMainSegment();
                } else {
                    mainSegment = null;
                }
                arrayList2.add(NLESegmentHSLFilter.dynamicCast((NLENode) mainSegment));
            }
            arrayList = new ArrayList(arrayList2);
            arrayList.add(NLESegmentHSLFilter.dynamicCast((NLENode) nLETrackSlot.getMainSegment()));
        } else {
            VecNLEFilterSPtr filters = nLETrackSlot.getFilters();
            ArrayList arrayList3 = new ArrayList();
            for (NLEFilter nLEFilter : filters) {
                if (C351220Dpo.LLIIL(nLEFilter)) {
                    arrayList3.add(nLEFilter);
                }
            }
            arrayList = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                arrayList.add(NLESegmentHSLFilter.dynamicCast((NLENode) ((NLEFilter) it3.next()).getSegment()));
            }
        }
        for (NLESegmentHSLFilter nLESegmentHSLFilter : arrayList) {
            if (nLESegmentHSLFilter != null) {
                linkedHashMap.put(nLESegmentHSLFilter.getColorType(), new C351400Dq6(nLESegmentHSLFilter, EnumC355950DxR.HSL, 0.0f, new C351280Dpu(nLESegmentHSLFilter.getColorType(), Double.valueOf(nLESegmentHSLFilter.getHue()), Double.valueOf(nLESegmentHSLFilter.getSaturation()), Double.valueOf(nLESegmentHSLFilter.getLightness()))));
            }
        }
        return linkedHashMap;
    }

    @Override // X.InterfaceC351310Dpx
    public final boolean LJIILLIIL(C351270Dpt c351270Dpt, EnumC356070Dxd enumC356070Dxd) {
        NLETrackSlot nLETrackSlotLLJJI;
        if (LLJJIII() != null && (nLETrackSlotLLJJI = LLJJI()) != null) {
            C351250Dpr c351250Dpr = this.LJ;
            NLEModel nLEModelLJI = C350870DpF.LJI(this.LIZ);
            c351250Dpr.getClass();
            C351250Dpr.LIZ(nLETrackSlotLLJJI, nLEModelLJI, c351270Dpt);
            LLJJ(null, enumC356070Dxd);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC351310Dpx
    public final void LJLL(NLESegmentFilter nLESegmentFilter, C351280Dpu c351280Dpu) {
        this.LJ.getClass();
        NLESegmentHSLFilter nLESegmentHSLFilterDynamicCast = NLESegmentHSLFilter.dynamicCast((NLENode) nLESegmentFilter);
        if (nLESegmentHSLFilterDynamicCast != null) {
            Double d = c351280Dpu.LIZIZ;
            if (d != null) {
                nLESegmentHSLFilterDynamicCast.setHue(d.doubleValue());
            }
            Double d2 = c351280Dpu.LIZJ;
            if (d2 != null) {
                nLESegmentHSLFilterDynamicCast.setSaturation(d2.doubleValue());
            }
            Double d3 = c351280Dpu.LIZLLL;
            if (d3 != null) {
                nLESegmentHSLFilterDynamicCast.setLightness(d3.doubleValue());
            }
        }
        C350870DpF.LIZ(this.LIZ, false);
    }

    @Override // X.InterfaceC351310Dpx
    public final void LJJIFFI(NLESegmentFilter nLESegmentFilter, float f, EnumC355950DxR enumC355950DxR) {
        NLEStringFloatPair next;
        this.LJ.getClass();
        if (enumC355950DxR.getAdjustParamsName() != null) {
            Iterator<NLEStringFloatPair> it2 = nLESegmentFilter.getAdjustParamss().iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.getFirst(), enumC355950DxR.getAdjustParamsName())) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            NLEStringFloatPair nLEStringFloatPair = next;
            if (nLEStringFloatPair != null) {
                nLESegmentFilter.removeAdjustParams(nLEStringFloatPair);
            }
            NLEStringFloatPair nLEStringFloatPair2 = new NLEStringFloatPair();
            nLEStringFloatPair2.setFirst(enumC355950DxR.getAdjustParamsName());
            nLEStringFloatPair2.setSecond(f);
            nLESegmentFilter.addAdjustParams(nLEStringFloatPair2);
        } else if (Intrinsics.LJFF(nLESegmentFilter.getFilterName(), enumC355950DxR.getNleName())) {
            nLESegmentFilter.setIntensity(f);
        }
        C350870DpF.LIZ(this.LIZ, false);
    }
}
