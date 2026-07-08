package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS558S0100000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YED, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YED extends C0YEM {
    public static final /* synthetic */ int LJIIZILJ = 0;
    public final C0YEM LIZIZ;
    public final C0YEW LIZJ;
    public final long LIZLLL;
    public final C0YF0 LJ;
    public final C871360YGg LJFF;
    public final C0YEG LJI;
    public final int LJII;
    public final C0YDJ LJIIIIZZ;
    public final C01GW LJIIIZ;
    public final C873390YOb LJIIJ;
    public final C01GW LJIIJJI;
    public final C01GW LJIIL;
    public final C01GW LJIILIIL;
    public final C01GW LJIILJJIL;
    public volatile boolean LJIILL;
    public volatile boolean LJIILLIIL;

    @Override // X.C0YHC
    public final InterfaceC872640YLe LIZ() {
        return new InterfaceC872640YLe() { // from class: X.0YEN
            @Override // X.InterfaceC872640YLe
            public final C0YF7 getEvents() {
                return this.LIZ.LJIIIIZZ.LJFF.LIZLLL;
            }

            @Override // X.InterfaceC872640YLe
            public final boolean LIZ(int i) {
                return ((C0YER) this.LIZ.LJIIIZ.getValue()).LIZ.LJIIJJI(i);
            }

            @Override // X.InterfaceC872640YLe
            public final void LIZIZ(int i, boolean z, Map map, int i2) {
                ((C0YER) this.LIZ.LJIIIZ.getValue()).LIZ(i, z, map, i2);
            }
        };
    }

    @Override // X.C0YHC
    public final InterfaceC866310Xyf LIZIZ() {
        return (InterfaceC866310Xyf) this.LJIIJJI.getValue();
    }

    @Override // X.InterfaceC863730XuV
    public final C870830YEf LJIIIZ() {
        return this.LJ.LIZIZ;
    }

    @Override // X.C0YHC
    public final InterfaceC876290YZf LJIILJJIL() {
        return (InterfaceC876290YZf) this.LJIIL.getValue();
    }

    @Override // X.C0YEM
    public final void LJIILLIIL() {
        if (this.LJIILL) {
            return;
        }
        this.LJIILL = true;
        this.LJ.LIZIZ.getClass();
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkRecover version invalid:");
        sbLIZ.append(0);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SessionClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        if (this.LJIILLIIL) {
            return;
        }
        this.LJIILLIIL = true;
        int i = this.LJ.LIZIZ.LJJJJZI.LIZIZ;
        if (i <= 0) {
            C868780Y6i c868780Y6iLIZLLL2 = LIZLLL();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("checkReadBadgeRecover version invalid:");
            sbLIZ2.append(i);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL2, "SessionClientContext", C2188811AlT.LIZIZ(sbLIZ2), 4);
            return;
        }
        C0YEI c0yei = this.LJIIIIZZ.LIZJ.LIZ;
        int i2 = c0yei.LJJLIIJ().getInt(c0yei.LJJLJLI("read_badge_recovery_version"));
        if (i <= i2) {
            C868780Y6i c868780Y6iLIZLLL3 = LIZLLL();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("checkReadBadgeRecover already recover, version:");
            sbLIZ3.append(i);
            sbLIZ3.append(", lastVersion:");
            sbLIZ3.append(i2);
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL3, "SessionClientContext", C2188811AlT.LIZIZ(sbLIZ3), 4);
            return;
        }
        C868780Y6i c868780Y6iLIZLLL4 = LIZLLL();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("checkReadBadgeRecover start, version:");
        sbLIZ4.append(i);
        sbLIZ4.append(", lastVersion:");
        sbLIZ4.append(i2);
        c868780Y6iLIZLLL4.LJIIIIZZ("SessionClientContext", C2188811AlT.LIZIZ(sbLIZ4), null);
        boolean zLJJJJIZL = this.LJIIIIZZ.LIZJ.LIZLLL.LJIIJJI().LJJJJIZL();
        C0YEI c0yei2 = this.LJIIIIZZ.LIZJ.LIZ;
        c0yei2.LJJLIIJ().putInt(c0yei2.LJJLJLI("read_badge_recovery_version"), i);
        C868780Y6i c868780Y6iLIZLLL5 = LIZLLL();
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("checkReadBadgeRecover finished, version:");
        sbLIZ5.append(i);
        sbLIZ5.append(", result: ");
        sbLIZ5.append(zLJJJJIZL);
        c868780Y6iLIZLLL5.LJIIIIZZ("SessionClientContext", C2188811AlT.LIZIZ(sbLIZ5), null);
    }

    @Override // X.C0YEM
    public final C0YEZ LJIJ() {
        return (C0YEZ) this.LJIILJJIL.getValue();
    }

    @Override // X.C0YEM
    public final C0YDA LJIJI() {
        return (C0YDA) this.LJIILIIL.getValue();
    }

    @Override // X.C0YEM
    public final boolean LJIJJ() {
        return this.LIZIZ.LJIJJ();
    }

    public final void LJIL() {
        this.LJIIIIZZ.LJFF.LIZIZ.LIZLLL();
        this.LJIIIIZZ.LJI.LIZ.clear();
        this.LJIIIIZZ.LIZLLL.LIZIZ.LIZ();
        this.LJIIIIZZ.LJIIIZ.LIZIZ().LJ();
        this.LJIIIIZZ.LJI.LJI().V4(false);
    }

    @Override // X.InterfaceC863730XuV
    public final boolean isLogin() {
        return this.LJ.LIZ;
    }

    @Override // X.C0YJA
    public final C0YJ8 LJIIJ() {
        return LJ().getEvent();
    }

    @Override // X.C0YHC
    public final void logout() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logout session for uid=");
        sbLIZ.append(this.LIZLLL);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SessionClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        this.LIZJ.LJIILIIL().LIZ();
        try {
            this.LJ.LIZ = false;
            C870180YBs c870180YBsLIZ = this.LJIIIIZZ.LJFF.LIZ();
            c870180YBsLIZ.getClass();
            C0YEM c0yem = c870180YBsLIZ.LLILLL;
            new C0YEY(c0yem);
            c0yem.LJIIZILJ().getDomain().LIZ().LL.removeCallbacksAndMessages(null);
            this.LJIIIIZZ.LJI.LIZJ().LIZIZ = null;
            this.LJIIIIZZ.LJII.LJIIIIZZ().LIZIZ = null;
            this.LJIIIIZZ.LJIIIIZZ.LIZJ().getClass();
            this.LJIIIIZZ.LIZLLL.LIZIZ().clean();
            C0YEI c0yei = this.LJIIIIZZ.LIZJ.LIZ;
            c0yei.getClass();
            C0YEI.LIZLLL = -1L;
            c0yei.LIZ = null;
            this.LJIIIIZZ.LJFF.LIZJ().LIZIZ();
            C870460YCu c870460YCuLIZ = this.LJIIIIZZ.LJIIIIZZ.LIZ();
            c870460YCuLIZ.LIZ = true;
            ((ConcurrentHashMap) c870460YCuLIZ.LIZIZ).clear();
            this.LJIIIIZZ.LJIIIIZZ.LIZLLL().LIZIZ.clear();
            this.LJIIIIZZ.LJI.LJII().LIZLLL();
            this.LJIIIIZZ.LJI.LIZIZ.LJ();
            this.LJIIIIZZ.LJII.LIZIZ().LIZ();
            LJIL();
            C0YEW c0yew = this.LIZJ;
            c0yew.LIZJ.LJ();
            c0yew.LJIIIIZZ().LIZ();
            C23118094a.LJ(c0yew.LIZLLL.LL);
            c0yew.LJIIJJI().LIZ();
            this.LJIIIIZZ.LJIIIIZZ.LIZ().LJIIJ(jUptimeMillis, false, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL().LJIIIIZZ("SessionClientContext", "logout error", th);
            this.LJIIIIZZ.LJIIIIZZ.LIZ().LJIIJJI(false, th, LJ().LJ().getApplicationContext());
            this.LJIIIIZZ.LJIIIIZZ.getEventTracker().LJ(th);
            C0YCR c0ycrLJIILIIL = this.LIZJ.LJIILIIL();
            String message = th.getMessage();
            if (message == null) {
                message = "unknown logout failure";
            }
            c0ycrLJIILIIL.LIZJ(message);
            this.LJIIIIZZ.LJIIIIZZ.LIZ().LJIIJ(jUptimeMillis, false, false);
        }
    }

    @Override // X.C0YHC
    public final C0YOZ LJFF() {
        return this.LJIIJ;
    }

    @Override // X.C0YEM
    public final /* bridge */ /* synthetic */ InterfaceC864790XwD LJIIZILJ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0YHC
    public final int getBizId() {
        return this.LJII;
    }

    @Override // X.C0YHC
    public final long getUid() {
        return this.LIZLLL;
    }

    @Override // X.C0YHC
    public final InterfaceC789170UxX LJI(C870830YEf c870830YEf) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        try {
            this.LJ.LIZ = true;
            this.LJ.LIZIZ = c870830YEf;
            this.LIZJ.LJIILIIL().LJFF(C0YCU.LOGIN);
            C0YDJ c0ydj = this.LJIIIIZZ;
            c0ydj.LJFF.LIZJ();
            c0ydj.LJFF.getClass();
            c0ydj.LJIIIIZZ.LIZ();
            C0YEW c0yew = this.LIZJ;
            AwS558S0100000_14 awS558S0100000_14 = new AwS558S0100000_14(this, 1364);
            C870460YCu c870460YCuLIZ = this.LJIIIIZZ.LJIIIIZZ.LIZ();
            c0yew.LJIIJJI().LJI = this;
            c0yew.LJIIJJI().LJII = c870460YCuLIZ;
            c0yew.LJIILIIL().LJIJI = awS558S0100000_14;
            c0yew.LJIILIIL().LJIJJ = this;
            this.LIZJ.LJIILIIL().LJFF(C0YCU.DATA_SYNC);
            this.LJIIIIZZ.LJFF.LIZ().LJFF();
            this.LJIIIIZZ.LJFF.LIZJ().LJIIJ();
            this.LJIIIIZZ.LJI.LIZJ().LIZ();
            this.LJIIIIZZ.LJII.LJIIIIZZ().LIZ();
            this.LJIIIIZZ.LJIIIIZZ.LIZJ().LIZ();
            this.LJIIIIZZ.LJI.LJII().LJ();
            if (!c870830YEf.LJJLIIIIJ.LJJJJJL) {
                this.LJIIIIZZ.LJII.LIZJ().LIZLLL();
            }
            this.LJIIIIZZ.LJIIIIZZ.LIZ().LJIIJ(jUptimeMillis, true, true);
            return C789180UxY.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            LIZLLL().LJIIIIZZ("SessionClientContext", "login error", th);
            this.LJIIIIZZ.LJIIIIZZ.LIZ().LJIIJJI(true, th, LJ().LJ().getApplicationContext());
            this.LJIIIIZZ.LJIIIIZZ.getEventTracker().LJ(th);
            C0YCR c0ycrLJIILIIL = this.LIZJ.LJIILIIL();
            String message = th.getMessage();
            if (message == null) {
                message = "unknown login error";
            }
            c0ycrLJIILIIL.LIZJ(message);
            this.LJIIIIZZ.LJIIIIZZ.LIZ().LJIIJ(jUptimeMillis, true, false);
            return new C789160UxW(th);
        }
    }

    @Override // X.C0YJA
    public final void LJII(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("imcloud_biz_id", this.LJII);
            jSONObject.put("is_encrypted", this.LJIIIIZZ.LIZJ.LIZIZ.LJIIJ());
            jSONObject.put("network_level", LJ().LIZ().LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // X.C0YEM
    public final void LJIJJLI(final String str, final boolean z, final boolean z2) {
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("recover, deleteDB:");
        sbLIZ.append(z);
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SessionClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        final C0YDJ c0ydj = this.LJIIIIZZ;
        c0ydj.LJFF.LIZ().LJ(new Runnable() { // from class: X.0YEH
            public final void LIZ() {
                C0YJ9 c0yj9 = new C0YJ9(this.LL);
                c0yj9.LIZJ("imsdk_reset_data");
                c0yj9.LIZ(str, "reason");
                c0yj9.LJ(1.0f);
                C870830YEf c870830YEf = this.LL.LJ.LIZIZ;
                this.LL.LIZIZ.logout();
                if (z && !c0ydj.LIZJ.LIZIZ.LIZLLL(z2)) {
                    c0ydj.LJIIIIZZ.getEventTracker().LJFF("SessionClientContext recover failed", new Exception("delete db failed"), new HashMap());
                }
                c0ydj.LIZJ.LIZ.LJJZ(z2);
                this.LL.LIZIZ.LJI(c870830YEf);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SessionScopedClientContext@189f.recover$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SessionScopedClientContext@189f.recover$1");
            }
        });
    }

    public C0YED(C0YEM c0yem, C0YEW c0yew, long j, C0YF0 c0yf0, C871360YGg c871360YGg, C0YEG c0yeg) {
        super(c0yew);
        this.LIZIZ = c0yem;
        this.LIZJ = c0yew;
        this.LIZLLL = j;
        this.LJ = c0yf0;
        this.LJFF = c871360YGg;
        this.LJI = c0yeg;
        this.LJII = c0yem.getBizId();
        this.LJIIIIZZ = new C0YDJ(this, this.LJFF, this.LJI);
        this.LJIIIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1363));
        this.LJIIJ = new C873390YOb(this);
        this.LJIIJJI = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1361));
        this.LJIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1360));
        this.LJIILIIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1365));
        this.LJIILJJIL = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1362));
    }
}
