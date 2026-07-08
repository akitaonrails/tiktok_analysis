package Y;

import X.C1175600ghK;
import X.C1176090gi7;
import X.C1195640hDe;
import X.C13LP;
import X.C1558520qew;
import X.InterfaceC2217461Bqa;
import android.view.View;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.assem.PoiDetailNearbyV2TabAssem;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.model.PoiNearbyV2Tab;
import com.ss.android.ugc.aweme.poi.detail.nearbyv2.vm.PoiDetailNearbyV2VM;
import com.ss.android.ugc.aweme.poi.mapdetail.model.PoiGeneralCard;
import com.ss.android.ugc.aweme.poi_api.model.PoiLocation;
import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.AwS384S0200000_18;

/* JADX INFO: loaded from: classes19.dex */
public class ACListenerS54S0101000_18 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1 A[PHI: r9
      0x00d1: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v8 java.lang.String) binds: [B:54:0x00ce, B:40:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5 A[PHI: r9 r10
      0x00d5: PHI (r9v2 java.lang.String) = (r9v1 java.lang.String), (r9v7 java.lang.String) binds: [B:57:0x00d2, B:43:0x00a4] A[DONT_GENERATE, DONT_INLINE]
      0x00d5: PHI (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v6 java.lang.String) binds: [B:57:0x00d2, B:43:0x00a4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d9 A[PHI: r9 r10 r11
      0x00d9: PHI (r9v3 java.lang.String) = (r9v2 java.lang.String), (r9v6 java.lang.String) binds: [B:60:0x00d6, B:46:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r10v2 java.lang.String) = (r10v1 java.lang.String), (r10v5 java.lang.String) binds: [B:60:0x00d6, B:46:0x00ac] A[DONT_GENERATE, DONT_INLINE]
      0x00d9: PHI (r11v1 java.lang.String) = (r11v0 java.lang.String), (r11v4 java.lang.String) binds: [B:60:0x00d6, B:46:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onClick$0(Y.ACListenerS54S0101000_18 r14, android.view.View r15) {
        /*
            Method dump skipped, instruction units count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ACListenerS54S0101000_18.onClick$0(Y.ACListenerS54S0101000_18, android.view.View):void");
    }

    public static final void onClick$1(ACListenerS54S0101000_18 aCListenerS54S0101000_18, View view) {
        PoiLocation poiLocation;
        PoiDetailNearbyV2TabAssem poiDetailNearbyV2TabAssem = (PoiDetailNearbyV2TabAssem) aCListenerS54S0101000_18.l0;
        int i = aCListenerS54S0101000_18.i1;
        if (i >= 0 && i < ((ArrayList) poiDetailNearbyV2TabAssem.LLJJJJLIIL).size()) {
            int i2 = poiDetailNearbyV2TabAssem.LLJJLIIIJLLLLLLLZ;
            if (i == i2) {
                poiDetailNearbyV2TabAssem.cp(i, true);
                return;
            }
            C1195640hDe c1195640hDe = (C1195640hDe) C13LP.LJJJLZIJ(i2, poiDetailNearbyV2TabAssem.LLJJL);
            if (c1195640hDe != null) {
                c1195640hDe.setSelected(false);
            }
            C1195640hDe c1195640hDe2 = (C1195640hDe) C13LP.LJJJLZIJ(i, poiDetailNearbyV2TabAssem.LLJJL);
            if (c1195640hDe2 != null) {
                c1195640hDe2.setSelected(true);
            }
            poiDetailNearbyV2TabAssem.LLJJLIIIJLLLLLLLZ = i;
            poiDetailNearbyV2TabAssem.cp(i, true);
            PoiNearbyV2Tab poiNearbyV2Tab = (PoiNearbyV2Tab) ListProtector.get(poiDetailNearbyV2TabAssem.LLJJJJLIIL, i);
            AssemVMLazy assemVMLazy = poiDetailNearbyV2TabAssem.LLJL;
            InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = PoiDetailNearbyV2TabAssem.LLJLILLLLZIIL;
            PoiDetailNearbyV2VM poiDetailNearbyV2VM = (PoiDetailNearbyV2VM) assemVMLazy.getValue();
            C1176090gi7 c1176090gi7 = poiDetailNearbyV2VM.getState().LLILLL;
            if (c1176090gi7 != null) {
                poiLocation = c1176090gi7.centerPoi;
            } else {
                poiLocation = null;
            }
            poiDetailNearbyV2VM.setStateImmediate(new AwS384S0200000_18(poiNearbyV2Tab, (PoiNearbyV2Tab) poiDetailNearbyV2VM.vQ2(poiLocation, poiNearbyV2Tab), (Map<Integer, PoiGeneralCard>) 295));
            C1175600ghK.LJIIIIZZ(PageFinder.via(poiDetailNearbyV2TabAssem), C1558520qew.LJIIL(poiDetailNearbyV2TabAssem), null, poiNearbyV2Tab.getTabKey());
            return;
        }
        poiDetailNearbyV2TabAssem.getClass();
    }

    public ACListenerS54S0101000_18(Object obj, int i, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
