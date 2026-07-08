package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0VBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C793730VBr {
    public final byte[] LIZ;
    public final int LIZIZ;

    public final boolean LIZ() {
        return this.LIZ == null || this.LIZIZ == 0;
    }

    public final byte[] LIZIZ() {
        byte[] bArr = this.LIZ;
        int length = bArr.length;
        int i = this.LIZIZ;
        return length == i ? bArr : Arrays.copyOf(bArr, i);
    }

    public C793730VBr(byte[] bArr) {
        this.LIZ = bArr;
        this.LIZIZ = bArr.length;
    }

    public C793730VBr(byte[] bArr, int i) {
        this.LIZ = bArr;
        this.LIZIZ = i;
    }
}
