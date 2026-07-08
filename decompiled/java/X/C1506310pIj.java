package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0pIj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1506310pIj extends AbstractC1506320pIk {
    public final byte[] LIZIZ = new byte[256];
    public final InputStream LIZJ;
    public final int LIZLLL;
    public int LJ;

    @Override // X.InterfaceC1516690pZT
    public final boolean LIZ() {
        return this.LIZLLL - this.LJ > 0;
    }

    @Override // X.InterfaceC1516690pZT
    public final byte readByte() {
        this.LJ++;
        return (byte) this.LIZJ.read();
    }

    public C1506310pIj(InputStream inputStream) {
        int iAvailable;
        this.LIZJ = inputStream;
        try {
            iAvailable = inputStream.available();
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            iAvailable = -1;
        }
        this.LIZLLL = iAvailable;
    }

    @Override // X.InterfaceC1516690pZT
    public final String LJJIIJ(long j) throws IOException {
        byte[] bArr;
        this.LJ = (int) (((long) this.LJ) + j);
        if (j > 256) {
            int i = (int) j;
            bArr = new byte[i];
            this.LIZJ.read(bArr, 0, i);
        } else {
            this.LIZJ.read(this.LIZIZ, 0, (int) j);
            bArr = this.LIZIZ;
        }
        return new String(bArr, 0, (int) j, AbstractC1506320pIk.LIZ);
    }

    @Override // X.InterfaceC1516690pZT
    public final byte[] LJJIJ(long j) throws IOException {
        this.LJ = (int) (((long) this.LJ) + j);
        byte[] bArr = new byte[(int) j];
        this.LIZJ.read(bArr);
        return bArr;
    }

    @Override // X.InterfaceC1516690pZT
    public final void skip(long j) throws IOException {
        this.LJ = (int) (((long) this.LJ) + j);
        this.LIZJ.skip(j);
    }
}
