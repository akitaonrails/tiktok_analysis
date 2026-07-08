package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.1BYe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2206701BYe {
    public static C2206691BYd LIZ(Context context) {
        if (C2206691BYd.LIZIZ == null) {
            synchronized (C13LE.LIZ(C2206691BYd.class)) {
                try {
                    if (C2206691BYd.LIZIZ == null) {
                        C2206691BYd.LIZIZ = new C2206691BYd(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C2206691BYd.LIZIZ;
    }
}
