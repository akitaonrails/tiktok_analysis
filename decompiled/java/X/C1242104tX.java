package X;

/* JADX INFO: renamed from: X.04tX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1242104tX {
    public static final long LIZ;
    public static final long LIZIZ;

    static {
        int iLJIIZILJ = C0C64.LJIILLIIL().LJIIZILJ(31744, 16, 2, "zl_native_long_stack_config", true);
        if (C2187451AjH.LJIIJ() && iLJIIZILJ == 16) {
            iLJIIZILJ = 16;
        }
        int i = (iLJIIZILJ >> 4) & 15;
        LIZ = i == 0 ? -1L : ((long) i) * 1000000;
        int i2 = iLJIIZILJ & 15;
        LIZIZ = i2 != 0 ? ((long) i2) * 1000000 : -1L;
    }
}
