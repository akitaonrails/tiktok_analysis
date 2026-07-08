package X;

/* JADX INFO: renamed from: X.0u9i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692920u9i {
    public static final C1692220u8a LIZ(C1686970u07 c1686970u07) {
        C1692220u8a c1692220u8a = c1686970u07.LIZ;
        long j = c1686970u07.LIZIZ;
        c1692220u8a.getClass();
        return c1692220u8a.subSequence(C1692280u8g.LJI(j), C1692280u8g.LJFF(j));
    }

    public static final C1692220u8a LIZIZ(C1686970u07 c1686970u07, int i) {
        return c1686970u07.LIZ.subSequence(C1692280u8g.LJFF(c1686970u07.LIZIZ), Math.min(C1692280u8g.LJFF(c1686970u07.LIZIZ) + i, c1686970u07.LIZ.LLILLJJLI.length()));
    }

    public static final C1692220u8a LIZJ(C1686970u07 c1686970u07, int i) {
        return c1686970u07.LIZ.subSequence(Math.max(0, C1692280u8g.LJI(c1686970u07.LIZIZ) - i), C1692280u8g.LJI(c1686970u07.LIZIZ));
    }
}
