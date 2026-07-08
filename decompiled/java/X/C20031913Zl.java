package X;

/* JADX INFO: renamed from: X.13Zl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20031913Zl {
    public static final <T> void LIZ(C13ZP c13zp, int i, T t) {
        c13zp.LJ[(c13zp.LJFF - c13zp.LIZ[c13zp.LIZIZ - 1].LIZIZ) + i] = t;
    }

    public static final <T, U> void LIZIZ(C13ZP c13zp, int i, T t, int i2, U u) {
        int i3 = c13zp.LJFF - c13zp.LIZ[c13zp.LIZIZ - 1].LIZIZ;
        Object[] objArr = c13zp.LJ;
        objArr[i + i3] = t;
        objArr[i3 + i2] = u;
    }
}
