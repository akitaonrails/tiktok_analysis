package X;

/* JADX INFO: renamed from: X.0Wvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838990Wvh {
    public static final C838990Wvh LIZ = new C838990Wvh();
    public static volatile int LIZIZ;
    public static volatile boolean LIZJ;

    public static final boolean LIZ() {
        return C0WP5.LIZ && LIZJ;
    }

    public static C839010Wvj LIZIZ(int i) {
        Object data;
        C839010Wvj c839010Wvj;
        if (LIZ()) {
            C0W9T c0w9tLIZJ = C0W9U.LIZJ();
            if (c0w9tLIZJ != null) {
                data = c0w9tLIZJ.getData(i);
            } else {
                data = null;
            }
            if ((data instanceof C839010Wvj) && (c839010Wvj = (C839010Wvj) data) != null) {
                return c839010Wvj;
            }
        }
        return null;
    }

    public static Object LIZJ(int i) {
        Object data;
        C839010Wvj c839010Wvj;
        if (!LIZ()) {
            return null;
        }
        C0W9T c0w9tLIZJ = C0W9U.LIZJ();
        if (c0w9tLIZJ != null) {
            data = c0w9tLIZJ.getData(i);
        } else {
            data = null;
        }
        if (!(data instanceof C839010Wvj) || (c839010Wvj = (C839010Wvj) data) == null) {
            return null;
        }
        C0W9U.LIZ(i, c839010Wvj.LIZIZ, c0w9tLIZJ);
        return c839010Wvj.LIZ;
    }

    public static boolean LIZLLL(int i, Object obj) {
        Object data;
        if (!LIZ()) {
            return false;
        }
        C0W9T c0w9tLIZJ = C0W9U.LIZJ();
        C839010Wvj c839010Wvj = null;
        if (c0w9tLIZJ != null) {
            data = c0w9tLIZJ.getData(i);
        } else {
            data = null;
        }
        if (data instanceof C839010Wvj) {
            c839010Wvj = (C839010Wvj) data;
        }
        return C0W9U.LIZ(i, new C839010Wvj(obj, c839010Wvj), c0w9tLIZJ);
    }
}
