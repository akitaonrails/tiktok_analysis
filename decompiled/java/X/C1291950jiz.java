package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jiz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291950jiz {
    public static volatile C1291970jj1 LIZ;
    public static volatile C1291920jiw LIZIZ;

    public static C1291920jiw LIZ(Context context) {
        C1291920jiw c1291920jiw;
        Context contextN3 = C786410Ut5.N3(context);
        C1291920jiw c1291920jiw2 = LIZIZ;
        if (c1291920jiw2 == null) {
            synchronized (C1291920jiw.class) {
                try {
                    c1291920jiw = LIZIZ;
                    if (c1291920jiw == null) {
                        c1291920jiw = new C1291920jiw(new C1291940jiy(contextN3));
                        LIZIZ = c1291920jiw;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return c1291920jiw;
        }
        return c1291920jiw2;
    }
}
