package X;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.common.wschannel.app.IWsApp;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: X.0WK4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WK4 {
    public static volatile C0WKC LIZ;

    public static C0WKC LIZ(Context context) {
        HandlerThread handlerThread = new HandlerThread("wschannel");
        handlerThread.start();
        C0WK9 c0wk9 = new C0WK9();
        C0WK5 c0wk5 = new C0WK5(context, c0wk9);
        C0WKC c0wkc = new C0WKC(context, C786410Ut5.W2(handlerThread), new C0WKF() { // from class: X.0WK7
            @Override // X.C0WKF
            public final void LIZ(Map<Integer, IWsApp> map) {
            }

            @Override // X.C0WKF
            public final Map<Integer, IWsApp> LIZIZ() {
                return Collections.emptyMap();
            }
        }, c0wk9, c0wk5, new C0WKG() { // from class: X.0WKA
            @Override // X.C0WKG
            public final void LIZ() {
            }

            @Override // X.C0WKG
            public final void LIZIZ(C0WK3 c0wk3) {
            }

            @Override // X.C0WKG
            public final boolean isEnable() {
                return true;
            }
        });
        c0wk5.LJ = c0wkc;
        return c0wkc;
    }

    public static C0WKC LIZIZ(Context context) {
        if (LIZ == null) {
            synchronized (C0WKC.class) {
                try {
                    if (LIZ == null) {
                        LIZ = LIZ(context);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }
}
