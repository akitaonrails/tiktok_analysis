package X;

import java.io.OutputStream;

/* JADX INFO: renamed from: X.0WEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C820050WEx extends OutputStream {
    public long LL;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LL++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.LL += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i >= 0 && i <= bArr.length && i2 >= 0 && (i3 = i + i2) <= bArr.length && i3 >= 0) {
            this.LL += (long) i2;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
