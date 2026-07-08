package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.08Sq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C2121008Sq {
    public static /* synthetic */ void LIZ(Throwable th, Throwable th2) {
        try {
            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
