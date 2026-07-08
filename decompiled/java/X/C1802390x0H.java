package X;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0x0H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1802390x0H {
    public static final C1802410x0J LIZ(Throwable th, final Runnable runnable, final Runnable runnable2, int i, int i2, String str) {
        int errorCode;
        Exception exc;
        if (th instanceof C501470JlZ) {
            errorCode = ((C501520Jle) th).getErrorCode();
        } else if (th instanceof C1811850xFX) {
            errorCode = ((C1811850xFX) th).statusCode;
        } else {
            errorCode = -1;
        }
        C1802410x0J c1802410x0J = new C1802410x0J();
        c1802410x0J.LIZIZ = errorCode;
        c1802410x0J.LJIIJJI = i;
        c1802410x0J.LJIIL = i2;
        c1802410x0J.LJIILIIL = false;
        if (th instanceof Exception) {
            exc = (Exception) th;
        } else {
            exc = null;
        }
        c1802410x0J.LIZLLL = exc;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("gift_enter_from", str);
        c1802410x0J.LJII = linkedHashMap;
        c1802410x0J.LJIIJ = new InterfaceC1802380x0G() { // from class: X.0x0I
            @Override // X.InterfaceC1802380x0G
            public final void LIZ() {
                Runnable runnable3 = runnable2;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }

            @Override // X.InterfaceC1802380x0G
            public final void LIZIZ() {
                Runnable runnable3 = runnable;
                if (runnable3 != null) {
                    runnable3.run();
                }
            }
        };
        return c1802410x0J;
    }
}
