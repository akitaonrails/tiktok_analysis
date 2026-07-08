package X;

/* JADX INFO: renamed from: X.1B7E, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1B7E {
    public static volatile C1B79 LIZ;
    public static volatile C1B7B LIZIZ;

    public static InterfaceC2199641B7a LIZ(boolean z) {
        if (z && C2199681B7e.LJFF != null) {
            if (LIZIZ == null) {
                synchronized (C1B7E.class) {
                    try {
                        if (LIZIZ == null) {
                            ((C1B7L) C2199681B7e.LJFF).getClass();
                            LIZIZ = new C1B7B();
                        }
                    } finally {
                    }
                }
            }
            return LIZIZ;
        }
        if (LIZ == null) {
            synchronized (C1B7E.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C1B79(false);
                    }
                } finally {
                }
            }
        }
        return LIZ;
    }
}
