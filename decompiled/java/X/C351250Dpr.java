package X;

import com.bytedance.ies.nle.editor_jni.NLEFilter;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentFilter;
import com.bytedance.ies.nle.editor_jni.NLEStringFloatPair;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.ies.nle.editor_jni.VecNLEFilterSPtr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Dpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C351250Dpr {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZJ(NLEModel nLEModel, NLETrackSlot nLETrackSlot) {
        ArrayList<NLESegmentFilter> arrayList;
        EnumC355950DxR enumC355950DxR;
        NLESegment mainSegment;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C351220Dpo.LLJJIJIIJIL(nLETrackSlot)) {
            List listLJIIIIZZ = C351220Dpo.LJIIIIZZ(nLEModel, nLETrackSlot);
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLJIIIIZZ, 10));
            Iterator it2 = ((ArrayList) listLJIIIIZZ).iterator();
            while (it2.hasNext()) {
                NLETrackSlot nLETrackSlot2 = (NLETrackSlot) C13LP.LJJJLL(((NLETrack) it2.next()).getSlots());
                if (nLETrackSlot2 != null) {
                    mainSegment = nLETrackSlot2.getMainSegment();
                } else {
                    mainSegment = null;
                }
                arrayList2.add(NLESegmentFilter.dynamicCast(mainSegment));
            }
            arrayList = new ArrayList(arrayList2);
            arrayList.add(NLESegmentFilter.dynamicCast(nLETrackSlot.getMainSegment()));
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
                arrayList.add(((NLEFilter) it3.next()).getSegment());
            }
        }
        for (NLESegmentFilter nLESegmentFilter : arrayList) {
            if (nLESegmentFilter != null) {
                for (NLEStringFloatPair nLEStringFloatPair : nLESegmentFilter.getAdjustParamss()) {
                    EnumC355950DxR enumC355950DxR2 = (EnumC355950DxR) ((Map) C351330Dpz.LIZIZ.getValue()).get(nLEStringFloatPair.getFirst());
                    if (enumC355950DxR2 != null) {
                        linkedHashMap.put(enumC355950DxR2, new C351400Dq6(nLESegmentFilter, enumC355950DxR2, nLEStringFloatPair.getSecond(), null));
                    }
                }
                if (nLESegmentFilter.getAdjustParamss().isEmpty() && (enumC355950DxR = (EnumC355950DxR) ((Map) C351330Dpz.LIZ.getValue()).get(nLESegmentFilter.getFilterName())) != null) {
                    linkedHashMap.put(enumC355950DxR, new C351400Dq6(nLESegmentFilter, enumC355950DxR, nLESegmentFilter.getIntensity(), null));
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0130, code lost:
    
        if (r2 != null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0123 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot r7, com.bytedance.ies.nle.editor_jni.NLEModel r8, X.C351270Dpt r9) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351250Dpr.LIZ(com.bytedance.ies.nle.editor_jni.NLETrackSlot, com.bytedance.ies.nle.editor_jni.NLEModel, X.0Dpt):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.ies.nle.editor_jni.NLETrack LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel r5, long r6, boolean r8) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351250Dpr.LIZIZ(com.bytedance.ies.nle.editor_jni.NLEModel, long, boolean):com.bytedance.ies.nle.editor_jni.NLETrack");
    }
}
