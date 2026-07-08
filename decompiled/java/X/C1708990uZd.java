package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uZd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1708990uZd {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final EnumC992340bvk LJFF;
    public final EnumC992380bvo LJI;
    public final boolean LJII;
    public final EnumC992350bvl LJIIIIZZ;
    public final boolean LJIIIZ;
    public final boolean LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final boolean LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public final boolean LJIILLIIL;
    public final boolean LJIIZILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1708990uZd)) {
            return false;
        }
        C1708990uZd c1708990uZd = (C1708990uZd) obj;
        return Intrinsics.LJFF(this.LIZ, c1708990uZd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1708990uZd.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1708990uZd.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1708990uZd.LIZLLL) && Intrinsics.LJFF(this.LJ, c1708990uZd.LJ) && this.LJFF == c1708990uZd.LJFF && this.LJI == c1708990uZd.LJI && this.LJII == c1708990uZd.LJII && this.LJIIIIZZ == c1708990uZd.LJIIIIZZ && this.LJIIIZ == c1708990uZd.LJIIIZ && this.LJIIJ == c1708990uZd.LJIIJ && Intrinsics.LJFF(this.LJIIJJI, c1708990uZd.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c1708990uZd.LJIIL) && this.LJIILIIL == c1708990uZd.LJIILIIL && Intrinsics.LJFF(this.LJIILJJIL, c1708990uZd.LJIILJJIL) && this.LJIILL == c1708990uZd.LJIILL && this.LJIILLIIL == c1708990uZd.LJIILLIIL && this.LJIIZILJ == c1708990uZd.LJIIZILJ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + C786410Ut5.Z2(this.LJII)) * 31) + this.LJIIIIZZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31) + C786410Ut5.Z2(this.LJIIJ)) * 31;
        String str = this.LJIIJJI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJIIL;
        return ((((((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LJIILIIL)) * 31) + this.LJIILJJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILL)) * 31) + C786410Ut5.Z2(this.LJIILLIIL)) * 31) + C786410Ut5.Z2(this.LJIIZILJ);
    }

    public final String toString() {
        return "CashierStaticConfig(name=" + this.LIZ + ", sceneInSchema=" + this.LIZIZ + ", bhdmId=" + this.LIZJ + ", universalCashierTypeValueInTea=" + this.LIZLLL + ", configId=" + this.LJ + ", cbiType=" + this.LJFF + ", cbiCashierType=" + this.LJI + ", primaryPriorToDefault=" + this.LJII + ", indCashierBottomBtnBehavior=" + this.LJIIIIZZ + ", skipNotifyCheck=" + this.LJIIIZ + ", autoCloseWebView=" + this.LJIIJ + ", selectPaymentMethodEvent=" + this.LJIIJJI + ", refreshCashierEvent=" + this.LJIIL + ", refreshAfterBindSuccess=" + this.LJIILIIL + ", muidKeyInRisk=" + this.LJIILJJIL + ", supportDirectCheckout=" + this.LJIILL + ", supportIndependentCVV=" + this.LJIILLIIL + ", unregisterCashierListener=" + this.LJIIZILJ + ')';
    }

    public C1708990uZd(String str, String str2, String str3, String str4, String str5, EnumC992340bvk enumC992340bvk, EnumC992380bvo enumC992380bvo, boolean z, EnumC992350bvl enumC992350bvl, boolean z2, boolean z3, String str6, String str7, boolean z4, String str8, boolean z5, boolean z6, boolean z7, int i) {
        EnumC992380bvo enumC992380bvo2 = enumC992380bvo;
        String str9 = str6;
        boolean z8 = z3;
        boolean z9 = z2;
        EnumC992350bvl enumC992350bvl2 = enumC992350bvl;
        boolean z10 = z;
        boolean z11 = z6;
        boolean z12 = z5;
        String str10 = str8;
        boolean z13 = z4;
        EnumC992340bvk enumC992340bvk2 = (i & 32) != 0 ? EnumC992340bvk.CASHIER_PAYMENT_INFO : enumC992340bvk;
        enumC992380bvo2 = (i & 64) != 0 ? EnumC992380bvo.PAYIN_CASHIER : enumC992380bvo2;
        z10 = (i & 128) != 0 ? false : z10;
        enumC992350bvl2 = (i & 256) != 0 ? EnumC992350bvl.STANDARD : enumC992350bvl2;
        z9 = (i & 512) != 0 ? false : z9;
        z8 = (i & 1024) != 0 ? false : z8;
        str9 = (i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0 ? null : str9;
        String str11 = (i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0 ? str7 : null;
        z13 = (i & 8192) != 0 ? false : z13;
        str10 = (i & 16384) != 0 ? "wallet_user_id" : str10;
        z12 = (32768 & i) != 0 ? false : z12;
        z11 = (65536 & i) != 0 ? false : z11;
        boolean z14 = (i & 131072) == 0 ? z7 : false;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = str4;
        this.LJ = str5;
        this.LJFF = enumC992340bvk2;
        this.LJI = enumC992380bvo2;
        this.LJII = z10;
        this.LJIIIIZZ = enumC992350bvl2;
        this.LJIIIZ = z9;
        this.LJIIJ = z8;
        this.LJIIJJI = str9;
        this.LJIIL = str11;
        this.LJIILIIL = z13;
        this.LJIILJJIL = str10;
        this.LJIILL = z12;
        this.LJIILLIIL = z11;
        this.LJIIZILJ = z14;
    }
}
