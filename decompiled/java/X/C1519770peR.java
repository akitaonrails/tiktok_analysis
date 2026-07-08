package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0peR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519770peR {
    public static volatile C1519770peR LIZIZ;
    public final C1519760peQ<InterfaceC1528010prj> LIZ = new C1519760peQ<>();

    public static C1519770peR LIZ() {
        if (LIZIZ == null) {
            synchronized (LiveWsMessage.class) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1519770peR();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZIZ;
    }
}
