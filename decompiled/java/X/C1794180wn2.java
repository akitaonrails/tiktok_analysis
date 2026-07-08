package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wn2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794180wn2 implements InterfaceC1792440wkE {
    public static volatile C1794180wn2 LIZ;
    public static volatile C1794420wnQ LIZIZ;
    public static volatile C1794170wn1 LIZJ;
    public static volatile C1794520wna LIZLLL;

    public static InterfaceC1792440wkE LIZJ() {
        if (LIZ == null) {
            synchronized (C1794180wn2.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1794180wn2();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public final InterfaceC1792450wkF LIZ() {
        if (LIZLLL == null) {
            synchronized (this) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new C1794520wna();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0wn1] */
    public final AbstractC1794110wmv LIZIZ() {
        if (LIZJ == null) {
            synchronized (this) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new AbstractC1794110wmv() { // from class: X.0wn1
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }
}
