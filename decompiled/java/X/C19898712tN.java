package X;

import java.io.OutputStream;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.12tN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19898712tN extends OutputStream {
    public final int LL;
    public final ArrayList<AbstractC19922812xG> LLILLJJLI;
    public int LLILLL;
    public byte[] LLILZ;
    public int LLILZIL;

    public final String toString() {
        int i;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        synchronized (this) {
            i = this.LLILLL + this.LLILZIL;
        }
        objArr[1] = Integer.valueOf(i);
        return C786410Ut5.j4("<ByteString.Output@%s size=%d>", objArr);
    }

    public C19898712tN(int i) {
        if (i >= 0) {
            this.LL = i;
            this.LLILLJJLI = new ArrayList<>();
            this.LLILZ = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer size < 0");
    }

    public final void LIZ(int i) {
        this.LLILLJJLI.add(new C19922512xD(this.LLILZ));
        int length = this.LLILLL + this.LLILZ.length;
        this.LLILLL = length;
        this.LLILZ = new byte[Math.max(this.LL, Math.max(i, length >>> 1))];
        this.LLILZIL = 0;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.LLILZIL == this.LLILZ.length) {
            LIZ(1);
        }
        byte[] bArr = this.LLILZ;
        int i2 = this.LLILZIL;
        this.LLILZIL = i2 + 1;
        bArr[i2] = (byte) i;
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.LLILZ;
        int length = bArr2.length;
        int i3 = this.LLILZIL;
        if (i2 <= length - i3) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.LLILZIL += i2;
        } else {
            int length2 = bArr2.length - i3;
            System.arraycopy(bArr, i, bArr2, i3, length2);
            int i4 = i2 - length2;
            LIZ(i4);
            System.arraycopy(bArr, i + length2, this.LLILZ, 0, i4);
            this.LLILZIL = i4;
        }
    }
}
