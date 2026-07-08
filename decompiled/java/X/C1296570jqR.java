package X;

/* JADX INFO: renamed from: X.0jqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1296570jqR {
    public static final long LIZIZ(long j) {
        return (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final long LIZ(int i, int i2) {
        return (((long) i2) & 4294967295L) | (((long) i) << 32);
    }
}
