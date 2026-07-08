package X;

import com.bytedance.geckox.model.UpdatePackage;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0pFS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504280pFS extends OutputStream {
    public final InterfaceC1550870qSb LL;
    public final AbstractC1552040qUU LLILLJJLI;
    public final UpdatePackage LLILLL;
    public final long LLILZ;
    public long LLILZIL;
    public C1504260pFQ LLILZLL;

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
    }

    public final void LIZ(int i) {
        this.LLILZIL += (long) i;
        if (this.LLILLJJLI == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("download progress, channel: ");
        sbLIZ.append(this.LLILLL.getChannel());
        sbLIZ.append(" total:");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(" current:");
        sbLIZ.append(this.LLILZIL);
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.LJIILIIL(this.LLILLL, this.LLILZ, this.LLILZIL);
    }

    public final void LIZIZ(long j) {
        this.LLILZIL = j;
        this.LL.position(j);
        if (this.LLILZIL != 0 && this.LLILLJJLI != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("download progress with breakpoint, channel: ");
            sbLIZ.append(this.LLILLL.getChannel());
            sbLIZ.append(" total:");
            sbLIZ.append(this.LLILZ);
            sbLIZ.append(" current:");
            sbLIZ.append(this.LLILZIL);
            C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLJJLI.LJIILIIL(this.LLILLL, this.LLILZ, this.LLILZIL);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.LL.write(i);
        LIZ(4);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.LL.write(bArr);
        LIZ(bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.LL.LJJIII(i, bArr, i2);
        LIZ(i2);
    }

    public C1504280pFS(InterfaceC1550870qSb interfaceC1550870qSb, AbstractC1552040qUU abstractC1552040qUU, UpdatePackage updatePackage, long j, long j2) {
        this.LL = interfaceC1550870qSb;
        this.LLILLJJLI = abstractC1552040qUU;
        this.LLILLL = updatePackage;
        this.LLILZ = j;
        this.LLILZIL = j2;
    }
}
