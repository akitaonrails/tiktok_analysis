package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0pPp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510710pPp {
    public static InterfaceC1510780pPw LIZ;
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static final /* synthetic */ C1510710pPp LIZLLL = new C1510710pPp();

    public static void LIZ(C1152704f7 c1152704f7) {
        boolean z;
        LIZ = c1152704f7;
        if (LIZJ && !(z = LIZIZ)) {
            synchronized (Boolean.valueOf(z)) {
                try {
                    InterfaceC1510780pPw interfaceC1510780pPw = LIZ;
                    if (interfaceC1510780pPw != null) {
                        LIZIZ = true;
                        interfaceC1510780pPw.tryInit();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }
}
