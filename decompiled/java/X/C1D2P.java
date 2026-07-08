package X;

import java.util.Arrays;
import kotlin.jvm.internal.AwS149S1100000_35;
import kotlin.jvm.internal.AwS46S0001000_35;
import kotlin.jvm.internal.AwS56S0301000_35;
import kotlin.jvm.internal.AwS614S0100000_35;

/* JADX INFO: renamed from: X.1D2P, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D2P extends AbstractC1023470cjx implements C1D2S {
    public final C1023630ckD<?>[] LIZ;

    public final void LJJIIZ() {
        C1D2R.LIZ.getClass();
        logAd(C1023500ck0.LIZJ("draw_ad", "otherclick", "cip_push", new InterfaceC1023650ckF[0]));
    }

    public final void LJJIJ() {
        C1D2R.LIZ.getClass();
        logAd(C1023500ck0.LIZJ("draw_ad", "otherclick", "cip_halfscreen_policy_gotit", new InterfaceC1023650ckF[0]));
    }

    public final void LJJIJIIJI() {
        C1D2R.LIZ.getClass();
        logAd(C1023500ck0.LIZJ("draw_ad", "otherclick", "cip_halfscreen_policy_url", new InterfaceC1023650ckF[0]));
    }

    public final void LJJIL() {
        C1D2R.LIZ.getClass();
        logAd(C1023500ck0.LIZJ("draw_ad", "othershow", "cip_push", new InterfaceC1023650ckF[0]));
    }

    public final void LJJIZ() {
        C1D2R.LIZ.getClass();
        logAd(C1023500ck0.LIZJ("draw_ad", "othershow", "cip_halfscreen_policy", new InterfaceC1023650ckF[0]));
    }

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1D2P(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }

    public final void LJJIJIL(Integer num) {
        C1D2R c1d2r = C1D2R.LIZ;
        c1d2r.getClass();
        C1D2Q.LIZ.getClass();
        logAd(C1023500ck0.LIZLLL("draw_ad", "samsung_store_deeplink_success", new InterfaceC1023650ckF[]{c1d2r.LJI(C1D2Q.LJ)}), new AwS614S0100000_35(num, 240));
    }

    public final void LJJIJL(String str) {
        C1D2R.LIZ.getClass();
        logAd(C1023500ck0.LIZLLL("draw_ad", str, new InterfaceC1023650ckF[0]));
    }

    public final void LJJIJLIJ(int i) {
        C1D2R c1d2r = C1D2R.LIZ;
        c1d2r.getClass();
        C1D2Q.LIZ.getClass();
        logAd(C1023500ck0.LIZLLL("draw_ad", "cip_download_fail", new InterfaceC1023650ckF[]{c1d2r.LJI(C1D2Q.LIZIZ)}), new AwS46S0001000_35(i, 17));
    }

    @Override // X.C1D2S
    public final void LJIJJLI(int i, Integer num, Integer num2, Integer num3) {
        C1D2R c1d2r = C1D2R.LIZ;
        c1d2r.getClass();
        C1D2Q.LIZ.getClass();
        logAd(C1023500ck0.LIZLLL("draw_ad", "cip_execute_result", new InterfaceC1023650ckF[]{c1d2r.LJI(C1D2Q.LIZJ, C1D2Q.LIZLLL, C1D2Q.LJ, C1D2Q.LJFF)}), new AwS56S0301000_35(i, num, num2, num3, 1));
    }

    public final void LJJIIZI(Long l, String str, String str2, String str3) {
        C1D2R c1d2r = C1D2R.LIZ;
        c1d2r.getClass();
        if (str == null) {
            str = "draw_ad";
        }
        C1D2Q.LIZ.getClass();
        logAd(C1023500ck0.LIZJ(str, "otherclick", "button", new InterfaceC1023650ckF[]{c1d2r.LJI(C1D2Q.LJI, C1D2Q.LJII, C1D2Q.LJIIIIZZ)}), new C1D2O(str2, l, str3));
    }

    public final void LJJIJIIJIL(Long l, String str, String str2, String str3) {
        C1D2R c1d2r = C1D2R.LIZ;
        c1d2r.getClass();
        if (str == null) {
            str = "draw_ad";
        }
        if (str2 == null) {
            str2 = "cip_policy_label";
        }
        C1D2Q.LIZ.getClass();
        logAd(C1023500ck0.LIZJ(str, "otherclick", str2, new InterfaceC1023650ckF[]{c1d2r.LJI(C1D2Q.LJI, C1D2Q.LJII)}), new AwS149S1100000_35(str3, l, 11));
    }

    public final void LJJJ(Long l, String str, String str2, String str3) {
        C1D2R c1d2r = C1D2R.LIZ;
        c1d2r.getClass();
        if (str == null) {
            str = "draw_ad";
        }
        if (str2 == null) {
            str2 = "cip_policy_label";
        }
        C1D2Q.LIZ.getClass();
        logAd(C1023500ck0.LIZJ(str, "cip_policy_show", str2, new InterfaceC1023650ckF[]{c1d2r.LJI(C1D2Q.LJI, C1D2Q.LJII)}), new AwS149S1100000_35(str3, l, 12));
    }
}
