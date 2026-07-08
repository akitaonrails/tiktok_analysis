package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS663S0100000_14;

/* JADX INFO: renamed from: X.0YEF, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YEF {
    public final C0YEM LIZ;
    public final C868780Y6i LIZIZ;
    public final InterfaceC870750YDx LIZJ;
    public final C0YEG LIZLLL;
    public final Function0<Boolean> LJ;
    public final InterfaceC1631620sYq<Long, C0YEM, C870830YEf, C0YED> LJFF;
    public final Object LJI = new Object();
    public volatile C0YED LJII;

    public final void LIZ() {
        synchronized (this.LJI) {
            try {
                C0YED c0yed = this.LJII;
                if (c0yed == null) {
                    return;
                }
                C868780Y6i c868780Y6i = this.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("destroyCurrentSession for uid=");
                sbLIZ.append(c0yed.LIZLLL);
                C868780Y6i.LJIILJJIL(c868780Y6i, "IMSessionManager", C2188811AlT.LIZIZ(sbLIZ), 4);
                c0yed.logout();
                this.LJII = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final C0YED LIZIZ(String str) {
        C0YED c0yed = this.LJII;
        if (c0yed == null) {
            C0YEG c0yeg = this.LIZLLL;
            if (str == null) {
                str = "IMSessionManager";
            }
            C868780Y6i c868780Y6i = c0yeg.LIZLLL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str);
            sbLIZ.append("] no active session");
            c868780Y6i.LJIIIIZZ("InvalidSessionNotifier", C2188811AlT.LIZIZ(sbLIZ), new IllegalStateException("No active session"));
            C0YEK c0yek = c0yeg.LJFF;
            if (c0yek != null) {
                c0yek.LIZ("session_not_available", String.valueOf(c0yeg.LIZ.invoke().longValue()), String.valueOf(c0yeg.LIZIZ.invoke().longValue()), str);
            }
            c0yeg.LIZ(str);
            return null;
        }
        if (!this.LJ.invoke().booleanValue()) {
            return c0yed;
        }
        long uid = this.LIZJ.LJ().getUid();
        if (uid != 0) {
            long j = c0yed.LIZLLL;
            if (j != uid) {
                C0YEG c0yeg2 = this.LIZLLL;
                if (str == null) {
                    str = "IMSessionManager";
                }
                C868780Y6i c868780Y6i2 = c0yeg2.LIZLLL;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('[');
                sbLIZ2.append(str);
                sbLIZ2.append("] session UID mismatch: expected=");
                sbLIZ2.append(uid);
                sbLIZ2.append(", actual=");
                sbLIZ2.append(j);
                c868780Y6i2.LJIIIIZZ("InvalidSessionNotifier", C2188811AlT.LIZIZ(sbLIZ2), new IllegalStateException("Session UID mismatch"));
                C0YEK c0yek2 = c0yeg2.LJFF;
                if (c0yek2 != null) {
                    c0yek2.LIZ("session_uid_mismatch", String.valueOf(uid), String.valueOf(j), str);
                }
                c0yeg2.LIZ(str);
                return null;
            }
        }
        return c0yed;
    }

    public C0YEF(C0YEM c0yem, C868780Y6i c868780Y6i, InterfaceC870750YDx interfaceC870750YDx, C0YEG c0yeg, AwS558S0100000_14 awS558S0100000_14, AwS663S0100000_14 awS663S0100000_14) {
        this.LIZ = c0yem;
        this.LIZIZ = c868780Y6i;
        this.LIZJ = interfaceC870750YDx;
        this.LIZLLL = c0yeg;
        this.LJ = awS558S0100000_14;
        this.LJFF = awS663S0100000_14;
    }
}
