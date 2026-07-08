package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13BA, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13BA {
    public final C13BB LIZ;

    public C13BA(long[] jArr) {
        C13BB c13bb;
        if (jArr != null) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, jArr.length);
            c13bb = new C13BB(jArrCopyOf.length);
            int i = c13bb.LIZIZ;
            if (i >= 0) {
                if (jArrCopyOf.length != 0) {
                    int length = jArrCopyOf.length + i;
                    long[] jArr2 = c13bb.LIZ;
                    if (jArr2.length < length) {
                        c13bb.LIZ = Arrays.copyOf(jArr2, Math.max(length, (jArr2.length * 3) / 2));
                    }
                    long[] jArr3 = c13bb.LIZ;
                    int i2 = c13bb.LIZIZ;
                    if (i != i2) {
                        System.arraycopy(jArr3, i, jArr3, jArrCopyOf.length + i, i2 - i);
                    }
                    System.arraycopy(jArrCopyOf, 0, jArr3, i, jArrCopyOf.length);
                    c13bb.LIZIZ += jArrCopyOf.length;
                }
            } else {
                C19968313Az.LIZIZ("");
                throw null;
            }
        } else {
            c13bb = new C13BB();
        }
        this.LIZ = c13bb;
    }
}
