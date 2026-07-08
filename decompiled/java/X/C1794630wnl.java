package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0wnl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1794630wnl implements InterfaceC1794440wnS {
    public static volatile C1794630wnl LIZ;
    public static volatile C1794640wnm LIZIZ;
    public static volatile C1794650wnn LIZJ;
    public static volatile C1795170wod LIZLLL;
    public static volatile C1794410wnP LJ;
    public static volatile C1795190wof LJFF;

    public static InterfaceC1794440wnS LIZLLL() {
        if (LIZ == null) {
            synchronized (C1794630wnl.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1794630wnl();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0wod] */
    public final InterfaceC1795230woj LIZ() {
        if (LIZLLL == null) {
            synchronized (this) {
                try {
                    if (LIZLLL == null) {
                        LIZLLL = new InterfaceC1795230woj() { // from class: X.0wod
                        };
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZLLL;
    }

    public final InterfaceC1794450wnT LIZIZ() {
        if (LIZJ == null) {
            synchronized (this) {
                try {
                    if (LIZJ == null) {
                        LIZJ = new C1794650wnn();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZJ;
    }

    public final InterfaceC1794460wnU LIZJ() {
        if (LIZIZ == null) {
            synchronized (this) {
                try {
                    if (LIZIZ == null) {
                        LIZIZ = new C1794640wnm();
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
