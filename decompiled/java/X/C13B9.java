package X;

/* JADX INFO: renamed from: X.13B9, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13B9 {
    public static final long LIZ(float f, boolean z, boolean z2) {
        long j;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f);
        long j2 = 0;
        if (z) {
            j = 1;
        } else {
            j = 0;
        }
        if (z2) {
            j2 = 2;
        }
        return ((j | j2) & 4294967295L) | (jFloatToRawIntBits << 32);
    }
}
