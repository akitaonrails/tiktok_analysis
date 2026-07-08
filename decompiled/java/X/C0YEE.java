package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS558S0100000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YEE, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEE extends C0YEM implements InterfaceC863730XuV {
    public static final /* synthetic */ int LJIILJJIL = 0;
    public final C0YF0 LIZIZ;
    public final C0YF4 LIZJ;
    public final int LIZLLL;
    public final C01GW LJ;
    public final C0YDJ LJFF;
    public final C0YDJ LJI;
    public final C01GW LJII;
    public volatile boolean LJIIIIZZ;
    public volatile boolean LJIIIZ;
    public final C873390YOb LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;

    @Override // X.C0YHC
    public final InterfaceC872640YLe LIZ() {
        return (InterfaceC872640YLe) this.LJIILIIL.getValue();
    }

    @Override // X.C0YHC
    public final InterfaceC866310Xyf LIZIZ() {
        return (InterfaceC866310Xyf) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC863730XuV
    public final C870830YEf LJIIIZ() {
        return this.LIZIZ.LIZIZ;
    }

    @Override // X.C0YHC
    public final InterfaceC876290YZf LJIILJJIL() {
        return (InterfaceC876290YZf) this.LJIIL.getValue();
    }

    @Override // X.C0YEM
    public final void LJIILLIIL() {
        if (this.LJIIIIZZ) {
            return;
        }
        this.LJIIIIZZ = true;
        this.LIZIZ.LIZIZ.getClass();
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkRecover version invalid:");
        sbLIZ.append(0);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (this.LJIIIZ) {
            return;
        }
        this.LJIIIZ = true;
        int i = this.LIZIZ.LIZIZ.LJJJJZI.LIZIZ;
        if (i <= 0) {
            C868780Y6i c868780Y6iLIZLLL2 = LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkReadBadgeRecover version invalid:");
            sbLIZ2.append(i);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ2), 4);
            return;
        }
        C0YEI c0yei = this.LJI.LIZJ.LIZ;
        int i2 = c0yei.LJJLIIJ().getInt(c0yei.LJJLJLI("read_badge_recovery_version"));
        if (i <= i2) {
            C868780Y6i c868780Y6iLIZLLL3 = LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkReadBadgeRecover already recover, version:");
            sbLIZ3.append(i);
            sbLIZ3.append(", lastVersion:");
            sbLIZ3.append(i2);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ3), 4);
            return;
        }
        C868780Y6i c868780Y6iLIZLLL4 = LIZLLL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("checkReadBadgeRecover start, version:");
        sbLIZ4.append(i);
        sbLIZ4.append(", lastVersion:");
        sbLIZ4.append(i2);
        c868780Y6iLIZLLL4.LJIIIIZZ("DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ4), null);
        boolean zLJJJJIZL = this.LJI.LIZJ.LIZLLL.LJIIJJI().LJJJJIZL();
        C0YEI c0yei2 = this.LJI.LIZJ.LIZ;
        c0yei2.LJJLIIJ().putInt(c0yei2.LJJLJLI("read_badge_recovery_version"), i);
        C868780Y6i c868780Y6iLIZLLL5 = LIZLLL();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("checkReadBadgeRecover finished, version:");
        sbLIZ5.append(i);
        sbLIZ5.append(", result: ");
        sbLIZ5.append(zLJJJJIZL);
        c868780Y6iLIZLLL5.LJIIIIZZ("DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ5), null);
    }

    @Override // X.C0YEM
    public final C0YEZ LJIJ() {
        return (C0YEZ) this.LJ.getValue();
    }

    @Override // X.C0YEM
    public final C0YDA LJIJI() {
        return (C0YDA) this.LJII.getValue();
    }

    @Override // X.InterfaceC863730XuV
    public final boolean isLogin() {
        return this.LIZIZ.LIZ;
    }

    @Override // X.C0YJA
    public final C0YJ8 LJIIJ() {
        return LJ().getEvent();
    }

    @Override // X.C0YEM
    public final boolean LJIJJ() {
        LJ();
        return false;
    }

    public final void LJIL() {
        LJIIL().LJ();
        LJIIIIZZ().LIZ();
        C23118094a.LJ(LIZJ().getCoroutineContext());
        this.LJI.LJFF.LIZIZ.LIZLLL();
        this.LJI.LJI.LIZ.clear();
        this.LJI.LIZLLL.LIZIZ.LIZ();
        this.LJI.LJIIIZ.LIZIZ().LJ();
        this.LJI.LJI.LJI().V4(false);
        LJIIJJI().LIZ();
    }

    @Override // X.C0YHC
    public final long getUid() {
        return LJ().LJ().getUid();
    }

    @Override // X.C0YHC
    public final void logout() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C868780Y6i.LJIILJJIL(LIZLLL(), "DefaultIMClientContext", "logout", 4);
        LJIILIIL().LIZ();
        try {
            this.LIZIZ.LIZ = false;
            this.LIZIZ.LIZIZ = new C870830YEf();
            this.LJIIIIZZ = false;
            C870180YBs c870180YBsLIZ = this.LJI.LJFF.LIZ();
            c870180YBsLIZ.getClass();
            C0YEM c0yem = c870180YBsLIZ.LLILLL;
            new C0YEY(c0yem);
            c0yem.LJIIZILJ().getDomain().LIZ().LL.removeCallbacksAndMessages(null);
            this.LJI.LJI.LIZJ().LIZIZ = null;
            this.LJI.LJII.LJIIIIZZ().LIZIZ = null;
            this.LJI.LJIIIIZZ.LIZJ().getClass();
            this.LJI.LIZLLL.LIZIZ().clean();
            C0YEI c0yei = this.LJI.LIZJ.LIZ;
            c0yei.getClass();
            C0YEI.LIZLLL = -1L;
            c0yei.LIZ = null;
            this.LJI.LJFF.LIZJ().LIZIZ();
            C870460YCu c870460YCuLIZ = this.LJI.LJIIIIZZ.LIZ();
            c870460YCuLIZ.LIZ = true;
            ((ConcurrentHashMap) c870460YCuLIZ.LIZIZ).clear();
            this.LJI.LJIIIIZZ.LIZLLL().LIZIZ.clear();
            this.LJI.LJI.LJII().LIZLLL();
            this.LJI.LJI.LIZIZ.LJ();
            this.LJI.LJII.LIZIZ().LIZ();
            LJIL();
            this.LJI.LJIIIIZZ.LIZ().LJIIJ(jUptimeMillis, false, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL().LJIIIIZZ("DefaultIMClientContext", "logout error", th);
            this.LJI.LJIIIIZZ.LIZ().LJIIJJI(false, th, LJ().LJ().getApplicationContext());
            this.LJI.LJIIIIZZ.getEventTracker().LJ(th);
            C0YCR c0ycrLJIILIIL = LJIILIIL();
            String message = th.getMessage();
            if (message == null) {
                message = "unknown logout failure";
            }
            c0ycrLJIILIIL.LIZJ(message);
            this.LJI.LJIIIIZZ.LIZ().LJIIJ(jUptimeMillis, false, false);
        }
    }

    @Override // X.C0YHC
    public final C0YOZ LJFF() {
        return this.LJIIJ;
    }

    @Override // X.C0YEM
    public final InterfaceC864790XwD LJIIZILJ() {
        return this.LJI;
    }

    @Override // X.C0YHC
    public final int getBizId() {
        return this.LIZLLL;
    }

    @Override // X.C0YHC
    public final InterfaceC789170UxX LJI(C870830YEf c870830YEf) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("login with inbox: ");
        sbLIZ.append(Arrays.toString(c870830YEf.LJIIJJI));
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        LJIILIIL().LJFF(C0YCU.LOGIN);
        this.LIZIZ.LIZIZ = c870830YEf;
        LIZLLL().LIZJ = !c870830YEf.LJIL;
        if (!LJIJ().LIZLLL(c870830YEf)) {
            C868780Y6i.LJIILJJIL(LIZLLL(), "DefaultIMClientContext", "login with no reset", 4);
            return LJJ(jUptimeMillis);
        }
        C868780Y6i.LJIILJJIL(LIZLLL(), "DefaultIMClientContext", "login and reset", 4);
        if (LJIJ().LIZJ()) {
            return LJJ(jUptimeMillis);
        }
        return new InterfaceC789170UxX() { // from class: X.0YFP
        };
    }

    @Override // X.C0YJA
    public final void LJII(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("imcloud_biz_id", this.LIZLLL);
            jSONObject.put("is_encrypted", this.LJI.LIZJ.LIZIZ.LJIIJ());
            jSONObject.put("network_level", LJ().LIZ().LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final InterfaceC789170UxX LJJ(long j) {
        try {
            this.LIZIZ.LIZ = true;
            C0YDJ c0ydj = this.LJFF;
            c0ydj.LJFF.LIZJ();
            c0ydj.LJFF.getClass();
            c0ydj.LJIIIIZZ.LIZ();
            C0YF4 c0yf4 = this.LIZJ;
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1641);
            C870460YCu c870460YCuLIZ = this.LJFF.LJIIIIZZ.LIZ();
            c0yf4.LJIIJJI().LJI = this;
            c0yf4.LJIIJJI().LJII = c870460YCuLIZ;
            c0yf4.LJIILIIL().LJIJI = awS558S0100000_14;
            c0yf4.LJIILIIL().LJIJJ = this;
            LJIL();
            C870830YEf c870830YEf = this.LIZIZ.LIZIZ;
            LJIILIIL().LJFF(C0YCU.DATA_SYNC);
            this.LJI.LJFF.LIZ().LJFF();
            this.LJI.LJFF.LIZJ().LJIIJ();
            this.LJI.LJI.LIZJ().LIZ();
            this.LJI.LJII.LJIIIIZZ().LIZ();
            this.LJI.LJIIIIZZ.LIZJ().LIZ();
            this.LJI.LJI.LJII().LJ();
            if (!c870830YEf.LJJLIIIIJ.LJJJJJL) {
                this.LJI.LJII.LIZJ().LIZLLL();
            }
            this.LJI.LJIIIIZZ.LIZ().LJIIJ(j, true, true);
            return C789180UxY.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL().LJIIIIZZ("DefaultIMClientContext", "login error", th);
            this.LJI.LJIIIIZZ.LIZ().LJIIJJI(true, th, LJ().LJ().getApplicationContext());
            this.LJI.LJIIIIZZ.getEventTracker().LJ(th);
            C0YCR c0ycrLJIILIIL = LJIILIIL();
            String message = th.getMessage();
            if (message == null) {
                message = "unknown login error";
            }
            c0ycrLJIILIIL.LIZJ(message);
            this.LJI.LJIIIIZZ.LIZ().LJIIJ(j, true, false);
            return new C789160UxW(th);
        }
    }

    public C0YEE(int i, C0YF0 c0yf0, C0YF4 c0yf4) {
        super(c0yf4);
        this.LIZIZ = c0yf0;
        this.LIZJ = c0yf4;
        this.LIZLLL = i;
        this.LJ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1639));
        C0YDJ c0ydj = new C0YDJ(this, null, null);
        this.LJFF = c0ydj;
        this.LJI = c0ydj;
        this.LJII = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1642));
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DefaultIMClientContext init, context: ");
        sbLIZ.append(LJ().LJ().getApplicationContext());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        this.LJIIJ = new C873390YOb(this);
        this.LJIIJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1638));
        this.LJIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1637));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1640));
    }

    @Override // X.C0YEM
    public final void LJIJJLI(final String str, final boolean z, final boolean z2) {
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recover, deleteDB:");
        sbLIZ.append(z);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "DefaultIMClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        this.LJI.LJFF.LIZ().LJ(new Runnable() { // from class: X.0YEJ
            public final void LIZ() {
                C0YJ9 c0yj9 = new C0YJ9(this.LL);
                c0yj9.LIZJ("imsdk_reset_data");
                c0yj9.LIZ(str, "reason");
                c0yj9.LJ(1.0f);
                C870830YEf c870830YEf = this.LL.LIZIZ.LIZIZ;
                this.LL.logout();
                if (z && !this.LL.LJI.LIZJ.LIZIZ.LIZLLL(z2)) {
                    this.LL.LJI.LJIIIIZZ.getEventTracker().LJFF("DefaultIMClientContext recover failed", new Exception("delete db failed"), new HashMap());
                }
                this.LL.LJI.LIZJ.LIZ.LJJZ(z2);
                this.LL.LJI(c870830YEf);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DefaultIMClientContext@dd05.recover$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DefaultIMClientContext@dd05.recover$1");
            }
        });
    }
}
