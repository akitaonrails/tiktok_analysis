package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0WFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820130WFf {
    public static C820140WFg LIZ(Context context) {
        if (C820140WFg.LIZIZ == null) {
            synchronized (C820140WFg.class) {
                try {
                    if (C820140WFg.LIZIZ == null) {
                        C820140WFg.LIZIZ = new C820140WFg(C786410Ut5.N3(context));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return C820140WFg.LIZIZ;
    }
}
