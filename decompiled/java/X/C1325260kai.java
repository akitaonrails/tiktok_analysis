package X;

import java.io.InputStream;

/* JADX INFO: renamed from: X.0kai, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1325260kai extends InputStream {
    public final InterfaceC1327060kdc LL;
    public int LLILLJJLI;
    public int LLILLL;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LL.size() - this.LLILLJJLI;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.LLILLJJLI = this.LLILLL;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        InterfaceC1327060kdc interfaceC1327060kdc = this.LL;
        int i = this.LLILLJJLI;
        this.LLILLJJLI = i + 1;
        return interfaceC1327060kdc.read(i) & 255;
    }

    public C1325260kai(InterfaceC1327060kdc interfaceC1327060kdc) {
        C1322350kW1.LIZIZ(!interfaceC1327060kdc.isClosed());
        this.LL = interfaceC1327060kdc;
        this.LLILLJJLI = 0;
        this.LLILLL = 0;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LLILLL = this.LLILLJJLI;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C1322350kW1.LIZIZ(z);
        int iMin = Math.min((int) j, available());
        this.LLILLJJLI += iMin;
        return iMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int iAvailable = available();
            if (iAvailable <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int iMin = Math.min(iAvailable, i2);
            this.LL.read(this.LLILLJJLI, bArr, i, iMin);
            this.LLILLJJLI += iMin;
            return iMin;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("length=");
        sbLIZ.append(bArr.length);
        sbLIZ.append("; regionStart=");
        sbLIZ.append(i);
        sbLIZ.append("; regionLength=");
        sbLIZ.append(i2);
        throw new ArrayIndexOutOfBoundsException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
