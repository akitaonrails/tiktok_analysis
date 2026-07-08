package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0eMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1086000eMo {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Runnable runnable) {
        try {
            runnable.run();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJFF(th, "safeRun error, please check!!");
        }
    }
}
