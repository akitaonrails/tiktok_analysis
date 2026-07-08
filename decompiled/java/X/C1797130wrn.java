package X;

import android.content.Context;
import com.bytedance.android.live.wallet.model.recharge.RechargeRequestParams;
import com.bytedance.android.livesdk.livesetting.wallet.LiveWalletGPInsufficientFundGuidanceSetting;
import com.bytedance.android.livesdk.wallet.Diamond;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS108S0201000_27;
import kotlin.jvm.internal.AwS122S0400000_27;
import kotlin.jvm.internal.AwS29S1400000_27;
import kotlin.jvm.internal.AwS606S0100000_27;
import kotlin.jvm.internal.AwS71S0301000_12;

/* JADX INFO: renamed from: X.0wrn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1797130wrn implements InterfaceC1796910wrR {
    public final InterfaceC1797160wrq LIZ;
    public final InterfaceC1796910wrR LIZIZ;
    public final Context LIZJ;
    public final Diamond LIZLLL;
    public final String LJ;
    public final C1802730x0p LJFF;
    public final Function0<Unit> LJI;
    public boolean LJII;

    @Override // X.InterfaceC1796910wrR
    public final InterfaceC1797050wrf LIZ() {
        return this.LIZIZ.LIZ();
    }

    @Override // X.InterfaceC1796910wrR
    public final void LIZIZ(int i, C1797200wru c1797200wru) {
        this.LIZIZ.LIZIZ(i, c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LIZJ(int i, C1797010wrb c1797010wrb) {
        this.LIZIZ.LIZJ(i, c1797010wrb);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LIZLLL(int i, C1797200wru c1797200wru) {
        this.LIZIZ.LIZLLL(i, c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJFF(int i, C1797200wru c1797200wru) {
        this.LIZIZ.LJFF(i, c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJI(int i, C1797010wrb c1797010wrb) {
        this.LIZIZ.LJI(i, c1797010wrb);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJII(C1796960wrW c1796960wrW) {
        this.LIZIZ.LJII(c1796960wrW);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIIIZZ(int i, C1797010wrb c1797010wrb) {
        this.LIZIZ.LJIIIIZZ(i, c1797010wrb);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIIZ(int i, C1797200wru c1797200wru) {
        this.LIZIZ.LJIIIZ(i, c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIJ(boolean z) {
        this.LIZIZ.LJIIJ(z);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIJJI(C1777440wM2 c1777440wM2) {
        this.LIZIZ.LJIIJJI(c1777440wM2);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILJJIL(int i, C1797010wrb c1797010wrb) {
        this.LIZIZ.LJIILJJIL(i, c1797010wrb);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILL(int i, C1797200wru c1797200wru) {
        this.LIZIZ.LJIILL(i, c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILLIIL(int i, C1797010wrb c1797010wrb) {
        this.LIZIZ.LJIILLIIL(i, c1797010wrb);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIZILJ(int i, C1797200wru c1797200wru) {
        this.LIZIZ.LJIIZILJ(i, c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final String getPayload() {
        return this.LIZIZ.getPayload();
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIILIIL(C1797010wrb c1797010wrb) {
        if (this.LJII) {
            this.LJII = false;
            if (C1797030wrd.LIZIZ) {
                C1797030wrd.LJIIL = true;
            }
            this.LIZIZ.LJIILIIL(new C1797010wrb(c1797010wrb.LIZ, c1797010wrb.LIZIZ, c1797010wrb.LIZJ, c1797010wrb.LIZLLL, c1797010wrb.LJ, c1797010wrb.LJFF, c1797010wrb.LJI, c1797010wrb.LJII, true));
            return;
        }
        this.LIZIZ.LJIILIIL(c1797010wrb);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJ(int i, C1797200wru c1797200wru) {
        int i2;
        String str;
        Boolean boolValueOf;
        C1802730x0p c1802730x0p;
        String str2;
        C1802730x0p c1802730x0p2;
        String str3;
        boolean z;
        String message;
        if (LiveWalletGPInsufficientFundGuidanceSetting.INSTANCE.getValue() != 0 && i == 2 && this.LIZJ != null && c1797200wru.getErrorCode() == 203 && c1797200wru.getInternalCode() == 11) {
            C1797250wrz c1797250wrzLIZ = C1797210wrv.LIZ(c1797200wru);
            C1802410x0J c1802410x0J = new C1802410x0J();
            c1802410x0J.LJFF = this.LIZLLL.count;
            c1802410x0J.LJ = this.LJ;
            c1797250wrzLIZ.LJIIIIZZ = c1802410x0J;
            RechargeRequestParams rechargeRequestParams = new RechargeRequestParams();
            rechargeRequestParams.LIZ = this.LJFF;
            c1797250wrzLIZ.LJII = rechargeRequestParams;
            Context context = this.LIZJ;
            AwS108S0201000_27 awS108S0201000_27 = new AwS108S0201000_27(this, c1797200wru, i, 2);
            C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
            C1802410x0J c1802410x0J2 = c1797250wrzLIZ.LJIIIIZZ;
            if (c1802410x0J2 != null) {
                i2 = c1802410x0J2.LJFF;
            } else {
                i2 = 0;
            }
            Integer numValueOf = Integer.valueOf(i2);
            C1802410x0J c1802410x0J3 = c1797250wrzLIZ.LJIIIIZZ;
            String str4 = "";
            if (c1802410x0J3 == null || (str = c1802410x0J3.LJ) == null) {
                str = "";
            }
            int i3 = c1797250wrzLIZ.LIZ;
            int i4 = c1797250wrzLIZ.LIZIZ;
            int i5 = c1797250wrzLIZ.LJI;
            Exception exc = c1797250wrzLIZ.LIZJ;
            if (exc != null && (message = exc.getMessage()) != null) {
                str4 = message;
            }
            AwS29S1400000_27 awS29S1400000_27 = null;
            String strLIZ = C1797420wsG.LIZ(context, c1797250wrzLIZ);
            String strLIZIZ = C1797420wsG.LIZIZ(c1797250wrzLIZ);
            String str5 = c1797250wrzLIZ.LIZLLL;
            RechargeRequestParams rechargeRequestParams2 = c1797250wrzLIZ.LJII;
            if (rechargeRequestParams2 != null && (c1802730x0p2 = rechargeRequestParams2.LIZ) != null && (str3 = c1802730x0p2.LIZJ) != null) {
                if (str3.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            C1803800x2Y.LJIJ(c1803800x2Y, numValueOf, "pay", "google-apple", str, "popup", i3, i4, i5, str4, null, strLIZ, strLIZIZ, str5, boolValueOf, 8704);
            AwS122S0400000_27 awS122S0400000_27 = new AwS122S0400000_27(this, context, c1797250wrzLIZ, awS108S0201000_27, 14);
            RechargeRequestParams rechargeRequestParams3 = c1797250wrzLIZ.LJII;
            if (rechargeRequestParams3 != null && (c1802730x0p = rechargeRequestParams3.LIZ) != null && (str2 = c1802730x0p.LIZJ) != null && str2.length() > 0) {
                awS29S1400000_27 = new AwS29S1400000_27(this, context, c1797250wrzLIZ, str2, awS108S0201000_27, 3);
            }
            DialogC1802700x0m dialogC1802700x0m = new DialogC1802700x0m(context, c1797250wrzLIZ, awS122S0400000_27, awS29S1400000_27, new AwS606S0100000_27(awS108S0201000_27, 380));
            dialogC1802700x0m.show();
            C785410UrT.LIZIZ(dialogC1802700x0m);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(dialogC1802700x0m);
            C816490W1f.LIZ(dialogC1802700x0m);
            return;
        }
        this.LIZIZ.LJ(i, c1797200wru);
    }

    @Override // X.InterfaceC1796910wrR
    public final void LJIIL(int i, C1797200wru c1797200wru) {
        if (this.LJII) {
            this.LJII = false;
            this.LJI.invoke();
        } else {
            this.LIZIZ.LJIIL(i, c1797200wru);
        }
    }

    public static void LJIJ(Context context, C1797250wrz c1797250wrz, String str) {
        int i;
        String str2;
        Boolean boolValueOf;
        C1802730x0p c1802730x0p;
        String str3;
        String message;
        C1803800x2Y c1803800x2Y = C1803800x2Y.LIZ;
        C1802410x0J c1802410x0J = c1797250wrz.LJIIIIZZ;
        boolean z = false;
        if (c1802410x0J != null) {
            i = c1802410x0J.LJFF;
        } else {
            i = 0;
        }
        String str4 = "";
        if (c1802410x0J == null || (str2 = c1802410x0J.LJ) == null) {
            str2 = "";
        }
        int i2 = c1797250wrz.LIZ;
        int i3 = c1797250wrz.LIZIZ;
        int i4 = c1797250wrz.LJI;
        Exception exc = c1797250wrz.LIZJ;
        if (exc != null && (message = exc.getMessage()) != null) {
            str4 = message;
        }
        String strLIZ = C1797420wsG.LIZ(context, c1797250wrz);
        String strLIZIZ = C1797420wsG.LIZIZ(c1797250wrz);
        String str5 = c1797250wrz.LIZLLL;
        Boolean bool = Boolean.TRUE;
        RechargeRequestParams rechargeRequestParams = c1797250wrz.LJII;
        if (rechargeRequestParams != null && (c1802730x0p = rechargeRequestParams.LIZ) != null && (str3 = c1802730x0p.LIZJ) != null) {
            if (str3.length() > 0) {
                z = true;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        C1803800x2Y.LJIIZILJ(c1803800x2Y, i, "pay", "google-apple", str2, i2, i3, i4, str4, str, strLIZ, strLIZIZ, str5, bool, boolValueOf, 512);
    }

    public C1797130wrn(C1797100wrk c1797100wrk, InterfaceC1796910wrR interfaceC1796910wrR, Context context, Diamond diamond, String str, C1802730x0p c1802730x0p, AwS71S0301000_12 awS71S0301000_12) {
        this.LIZ = c1797100wrk;
        this.LIZIZ = interfaceC1796910wrR;
        this.LIZJ = context;
        this.LIZLLL = diamond;
        this.LJ = str;
        this.LJFF = c1802730x0p;
        this.LJI = awS71S0301000_12;
    }
}
