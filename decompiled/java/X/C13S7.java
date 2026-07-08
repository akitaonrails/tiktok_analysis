package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.13S7, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13S7 extends C13SD {
    public final C13SD LIZIZ;
    public long LIZJ;

    @Override // X.C13SD
    public final void LIZ() throws IOException {
        this.LIZIZ.LIZ();
    }

    @Override // X.C13SD, X.C13SE
    public final void close() throws IOException {
        this.LIZIZ.close();
    }

    public C13S7(C13SD c13sd) {
        this.LIZIZ = c13sd;
    }

    @Override // X.C13SD
    public final void LIZIZ(byte[] bArr, int i) throws IOException {
        this.LIZIZ.LIZIZ(bArr, i);
        this.LIZJ += (long) i;
    }
}
