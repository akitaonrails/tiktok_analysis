package X;

import Y.ACListenerS86S1100000_17;
import android.content.Context;
import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.model.GiftPanelBanner;
import kotlin.jvm.internal.AwS261S0300000_17;
import kotlin.jvm.internal.AwS482S0200000_17;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fN3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1124590fN3 {
    public static final C1123340fL2 LIZ(C1123340fL2 c1123340fL2, C1124680fNC c1124680fNC, String str, InterfaceC1124700fNE interfaceC1124700fNE) {
        C1100420ek4 c1100420ek4;
        C1128710fTh c1128710fTh;
        AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
        Fragment fragment = null;
        if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && !c1128710fTh.LLLLLLIL) {
            return null;
        }
        c1123340fL2.getClass();
        C495520Jby c495520Jby = new C495520Jby(str);
        c495520Jby.LIZJ("new_ui_container", String.valueOf(C1125810fP1.LIZJ()));
        String strLIZLLL = c495520Jby.LIZLLL();
        strLIZLLL.toString();
        AbstractC1100450ek7 abstractC1100450ek72 = c1124680fNC.LJIIJ;
        if (abstractC1100450ek72 != null && (c1100420ek4 = abstractC1100450ek72.LLILZIL) != null) {
            fragment = c1100420ek4.getFragment();
        }
        c1123340fL2.LIZIZ(strLIZLLL, null, fragment, new AwS596S0100000_17(c1124680fNC, 608), new AwS482S0200000_17(c1124680fNC, interfaceC1124700fNE, 3));
        return c1123340fL2;
    }

    public static final void LIZIZ(C1124780fNM c1124780fNM, Context context, GiftPanelBanner giftPanelBanner, C1124680fNC c1124680fNC) {
        C1128710fTh c1128710fTh;
        c1124780fNM.setData(giftPanelBanner);
        C786410Ut5.D8(c1124780fNM, new ACListenerS86S1100000_17(new AwS261S0300000_17(c1124680fNC, giftPanelBanner, context, 16), giftPanelBanner.schemaUrl, 3));
        C1127920fSQ c1127920fSQ = c1124680fNC.LJIIL;
        boolean z = false;
        if (c1127920fSQ == null || !c1127920fSQ.LIZ) {
            C1117830fC9.LIZ(0, c1124780fNM);
            c1124780fNM.requestLayout();
        }
        AbstractC1100450ek7 abstractC1100450ek7 = c1124680fNC.LJIIJ;
        if ((abstractC1100450ek7 instanceof C1128710fTh) && (c1128710fTh = (C1128710fTh) abstractC1100450ek7) != null && c1128710fTh.LLLLLLIL && !Intrinsics.LJFF(c1124680fNC.LIZJ, c1124680fNC.LIZIZ)) {
            long j = c1124680fNC.LJFF;
            if (c1124680fNC.LIZ == 16) {
                z = true;
            }
            C1123800fLm.LIZIZ(j, z);
        }
    }
}
