package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS593S0100000_14;
import kotlin.jvm.internal.AwS628S0100000_14;
import kotlin.jvm.internal.AwS663S0100000_14;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0YEC, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEC extends C0YEM {
    public static final /* synthetic */ int LJIIL = 0;
    public final C0YET LIZIZ;
    public final int LIZJ;
    public final C871360YGg LIZLLL;
    public final C0YEG LJ;
    public final C0YEF LJFF;
    public final C0YEO LJI;
    public final C0YOT LJII;
    public final C0Y0K LJIIIIZZ;
    public final C870810YEd LJIIIZ;
    public final C0YDB LJIIJ;
    public final C0YDB LJIIJJI;

    @Override // X.InterfaceC863730XuV
    public final C870830YEf LJIIIZ() {
        C0YF0 c0yf0;
        C870830YEf c870830YEf;
        C0YED c0yed = this.LJFF.LJII;
        return (c0yed == null || (c0yf0 = c0yed.LJ) == null || (c870830YEf = c0yf0.LIZIZ) == null) ? new C870830YEf() : c870830YEf;
    }

    @Override // X.C0YEM
    public final void LJIILLIIL() {
        C0YED c0yed = this.LJFF.LJII;
        if (c0yed != null) {
            c0yed.LJIILLIIL();
        } else {
            C868780Y6i.LJIILLIIL(LIZLLL(), "SessionAwareClientContext", "checkRecover: no active session", 4);
        }
    }

    @Override // X.C0YEM
    public final InterfaceC864790XwD LJIIZILJ() {
        C0YDJ c0ydj;
        C0YED c0yed = this.LJFF.LJII;
        if (c0yed != null && (c0ydj = c0yed.LJIIIIZZ) != null) {
            return c0ydj;
        }
        "No active session: dependencyContainer accessed before login".toString();
        throw new IllegalStateException("No active session: dependencyContainer accessed before login");
    }

    @Override // X.C0YEM
    public final C0YEZ LJIJ() {
        C0YEZ c0yezLJIJ;
        C0YED c0yed = this.LJFF.LJII;
        if (c0yed != null && (c0yezLJIJ = c0yed.LJIJ()) != null) {
            return c0yezLJIJ;
        }
        "No active session: imDataResetManager accessed before login".toString();
        throw new IllegalStateException("No active session: imDataResetManager accessed before login");
    }

    @Override // X.C0YHC
    public final long getUid() {
        C0YED c0yed = this.LJFF.LJII;
        if (c0yed != null) {
            return c0yed.LIZLLL;
        }
        return 0L;
    }

    @Override // X.InterfaceC863730XuV
    public final boolean isLogin() {
        C0YF0 c0yf0;
        C0YED c0yed = this.LJFF.LJII;
        if (c0yed == null || (c0yf0 = c0yed.LJ) == null) {
            return false;
        }
        return c0yf0.LIZ;
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

    @Override // X.C0YHC
    public final void logout() {
        C868780Y6i.LJIILJJIL(LIZLLL(), "SessionAwareClientContext", "logout", 4);
        C0YDB c0ydb = this.LJIIJ;
        C0Y6Z c0y6z = c0ydb.LIZJ;
        C868780Y6i c868780Y6i = c0y6z.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSessionDeactivated: ");
        sbLIZ.append(c0y6z.LIZJ.size());
        sbLIZ.append(" observers retained at client level");
        C868780Y6i.LJIILJJIL(c868780Y6i, "MessageRequestManagerProxy", C2188811AlT.LIZIZ(sbLIZ), 4);
        C868730Y6d c868730Y6d = c0ydb.LIZLLL;
        C868780Y6i c868780Y6i2 = c868730Y6d.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onSessionDeactivated: ");
        sbLIZ2.append(c868730Y6d.LIZJ.size());
        sbLIZ2.append(" observers retained at client level");
        C868780Y6i.LJIILJJIL(c868780Y6i2, "UnreadCountHelperProxy", C2188811AlT.LIZIZ(sbLIZ2), 4);
        C0Y61 c0y61 = c0ydb.LJ;
        C868780Y6i c868780Y6i3 = c0y61.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onSessionDeactivated: ");
        sbLIZ3.append(c0y61.LIZJ.size());
        sbLIZ3.append(" observers, ");
        sbLIZ3.append(c0y61.LIZLLL.size());
        sbLIZ3.append(" page observers retained");
        C868780Y6i.LJIILJJIL(c868780Y6i3, "ConvListModelProxy", C2188811AlT.LIZIZ(sbLIZ3), 4);
        C0Y60 c0y60LIZIZ = c0y61.LIZIZ();
        for (InterfaceC867280Y0o interfaceC867280Y0o : c0y61.LIZJ) {
            if (c0y60LIZIZ != null) {
                c0y60LIZIZ.LJJII(interfaceC867280Y0o);
            }
        }
        for (C0Y6L c0y6l : c0y61.LIZLLL) {
            if (c0y60LIZIZ != null) {
                c0y60LIZIZ.LJIIL(c0y6l);
            }
        }
        C868780Y6i.LJIILJJIL(c0ydb.LJFF.LIZIZ, "ObserverUtilsProxy", "onSessionDeactivated: all observers retained at client level", 4);
        this.LJFF.LIZ();
    }

    @Override // X.C0YHC
    public final InterfaceC872640YLe LIZ() {
        return this.LJI;
    }

    @Override // X.C0YHC
    public final /* bridge */ /* synthetic */ InterfaceC866310Xyf LIZIZ() {
        return this.LJIIIIZZ;
    }

    @Override // X.C0YHC
    public final /* bridge */ /* synthetic */ C0YOZ LJFF() {
        return this.LJII;
    }

    @Override // X.C0YHC
    public final InterfaceC876290YZf LJIILJJIL() {
        return this.LJIIIZ;
    }

    @Override // X.C0YEM
    public final C0YDA LJIJI() {
        return this.LJIIJJI;
    }

    @Override // X.C0YHC
    public final int getBizId() {
        return this.LIZJ;
    }

    @Override // X.C0YHC
    public final InterfaceC789170UxX LJI(C870830YEf c870830YEf) {
        Pair pair;
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("login with inbox: ");
        sbLIZ.append(Arrays.toString(c870830YEf.LJIIJJI));
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SessionAwareClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        LIZLLL().LIZJ = !c870830YEf.LJIL;
        C0YEF c0yef = this.LJFF;
        AwS593S0100000_14 awS593S0100000_14 = new AwS593S0100000_14(this, 352);
        synchronized (c0yef.LJI) {
            try {
                long uid = c0yef.LIZJ.LJ().getUid();
                if (uid == 0) {
                    C868780Y6i.LJIILJJIL(c0yef.LIZIZ, "IMSessionManager", "loginSession skipped: uid is 0", 4);
                    pair = new Pair(null, new InterfaceC789170UxX() { // from class: X.0YFO
                    });
                } else {
                    C0YED c0yed = c0yef.LJII;
                    if (c0yed != null && c0yed.LIZLLL == uid && c0yed.LJ.LIZ) {
                        C868780Y6i c868780Y6i = c0yef.LIZIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("loginSession reusing active session for uid=");
                        sbLIZ2.append(uid);
                        C868780Y6i.LJIILJJIL(c868780Y6i, "IMSessionManager", C2188811AlT.LIZIZ(sbLIZ2), 4);
                        c0yed.LJ.LIZIZ = c870830YEf;
                        pair = new Pair(null, new InterfaceC789170UxX() { // from class: X.0YFQ
                        });
                    } else {
                        C868780Y6i c868780Y6i2 = c0yef.LIZIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("loginSession for uid=");
                        sbLIZ3.append(uid);
                        C868780Y6i.LJIILJJIL(c868780Y6i2, "IMSessionManager", C2188811AlT.LIZIZ(sbLIZ3), 4);
                        c0yef.LIZ();
                        C0YED c0yedInvoke = c0yef.LJFF.invoke(Long.valueOf(uid), c0yef.LIZ, c870830YEf);
                        c0yef.LJII = c0yedInvoke;
                        try {
                            awS593S0100000_14.invoke(c0yedInvoke);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c0yef.LIZIZ.LJIIIIZZ("IMSessionManager", "onSessionPrepared threw; continuing with session.login()", th);
                        }
                        InterfaceC789170UxX interfaceC789170UxXLJI = c0yedInvoke.LJI(c870830YEf);
                        c0yef.LIZLLL.LJII = 0L;
                        pair = new Pair(c0yedInvoke, interfaceC789170UxXLJI);
                    }
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                throw th2;
            }
        }
        C0YEM c0yem = (C0YEM) pair.getFirst();
        InterfaceC789170UxX interfaceC789170UxX = (InterfaceC789170UxX) pair.getSecond();
        if (c0yem != null && c0yem.LJIJ().LIZLLL(c870830YEf)) {
            C868780Y6i.LJIILJJIL(LIZLLL(), "SessionAwareClientContext", "login with reset", 4);
            c0yem.LJIJ().LIZJ();
        }
        return interfaceC789170UxX;
    }

    @Override // X.C0YJA
    public final void LJII(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("imcloud_biz_id", this.LIZJ);
            C0YED c0yed = this.LJFF.LJII;
            if (c0yed != null) {
                jSONObject.put("is_encrypted", c0yed.LJIIIIZZ.LIZJ.LIZIZ.LJIIJ());
            }
            jSONObject.put("network_level", LJ().LIZ().LIZ());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [X.0YEO] */
    public C0YEC(int i, C0YET c0yet) {
        super(c0yet);
        this.LIZIZ = c0yet;
        this.LIZJ = i;
        final C871360YGg c871360YGg = new C871360YGg();
        this.LIZLLL = c871360YGg;
        C0YEG c0yeg = new C0YEG(new AwS558S0100000_14(this, 1633), new AwS558S0100000_14(this, 1634), new AwS628S0100000_14(this, 79), LIZLLL(), new C0YEK(this, LIZLLL(), getEventTracker(), this), new AwS558S0100000_14(this, 1635));
        this.LJ = c0yeg;
        final C0YEF c0yef = new C0YEF(this, LIZLLL(), LJ(), c0yeg, new AwS558S0100000_14(this, 1636), new AwS663S0100000_14(this, 7));
        this.LJFF = c0yef;
        c0yet.LIZJ = new AwS558S0100000_14(this, 1629);
        C868780Y6i c868780Y6iLIZLLL = LIZLLL();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionAwareClientContext init, context: ");
        sbLIZ.append(LJ().LJ().getApplicationContext());
        C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SessionAwareClientContext", C2188811AlT.LIZIZ(sbLIZ), 4);
        this.LJI = new InterfaceC872640YLe(c0yef, c871360YGg) { // from class: X.0YEO
            public final C0YEF LIZ;
            public final C0YF7 LIZIZ;

            @Override // X.InterfaceC872640YLe
            public final C0YF7 getEvents() {
                return this.LIZIZ;
            }

            @Override // X.InterfaceC872640YLe
            public final boolean LIZ(int i2) {
                C0YER c0yer;
                C0YED c0yed = this.LIZ.LJII;
                if (c0yed != null && (c0yer = (C0YER) c0yed.LJIIIZ.getValue()) != null && c0yer.LIZ.LJIIJJI(i2)) {
                    return true;
                }
                return false;
            }

            {
                this.LIZ = c0yef;
                this.LIZIZ = c871360YGg;
            }

            @Override // X.InterfaceC872640YLe
            public final void LIZIZ(int i2, boolean z, Map map, int i3) {
                C0YER c0yer;
                C0YED c0yedLIZIZ = this.LIZ.LIZIZ("InboxManagerProxy.pullMessages");
                if (c0yedLIZIZ != null && (c0yer = (C0YER) c0yedLIZIZ.LJIIIZ.getValue()) != null) {
                    c0yer.LIZ(i2, z, map, i3);
                }
            }
        };
        this.LJII = new C0YOT(c0yef);
        this.LJIIIIZZ = new C0Y0K(c0yef);
        this.LJIIIZ = new C870810YEd(new AwS558S0100000_14(this, 1630), new AwS558S0100000_14(this, 1631), LIZLLL(), new AwS558S0100000_14(this, 1632));
        C0YDB c0ydb = new C0YDB(this, c0yef, LIZLLL());
        this.LJIIJ = c0ydb;
        this.LJIIJJI = c0ydb;
    }

    @Override // X.C0YEM
    public final void LJIJJLI(String str, boolean z, boolean z2) {
        C0YED c0yed = this.LJFF.LJII;
        if (c0yed != null) {
            c0yed.LJIJJLI(str, z, z2);
        } else {
            C868780Y6i.LJIILLIIL(LIZLLL(), "SessionAwareClientContext", "recover: no active session", 4);
        }
    }
}
