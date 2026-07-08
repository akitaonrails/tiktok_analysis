package X;

import android.content.Context;
import com.bytedance.crash.ensure.EnsureApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Vd1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C801930Vd1 {
    public static boolean LIZ;
    public static volatile int LIZIZ;
    public static volatile String LIZJ;
    public static boolean LIZLLL;

    public static void LIZ() {
        if (C801940Vd2.LIZIZ == null) {
            synchronized (C801940Vd2.class) {
                try {
                    if (C801940Vd2.LIZIZ == null) {
                        C801940Vd2.LIZIZ = new C801940Vd2(C0VX9.LJ());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        C802770VeN c802770VeNLIZ = C802770VeN.LIZ();
        if (c802770VeNLIZ != null) {
            c802770VeNLIZ.LIZIZ();
        }
        EnsureApi.LIZ();
    }

    public static void LIZJ() {
        if (C800910VbN.LIZ == null) {
            synchronized (C800910VbN.class) {
                try {
                    if (C800910VbN.LIZ == null) {
                        C800910VbN.LIZ = new C800910VbN();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static boolean LIZLLL() {
        return C0VYP.LIZ != null;
    }

    public static void LIZIZ(Context context, C0VSJ c0vsj) {
        if (C0VYP.LIZ == null) {
            synchronized (C0VYP.class) {
                try {
                    if (C0VYP.LIZ == null) {
                        C0VYP.LIZ = new C0VYP(context, c0vsj);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
