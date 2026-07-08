package X;

import java.io.InputStream;

/* JADX INFO: renamed from: X.0pvU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1530340pvU implements InterfaceC1289770jfT {
    public final C1533790q13 LIZ;

    @Override // X.InterfaceC1289770jfT
    public final InputStream LIZIZ() {
        return this.LIZ.LJIIJJI(false);
    }

    @Override // X.InterfaceC1289770jfT
    public final Boolean LIZJ() {
        return Boolean.valueOf(this.LIZ.LIZIZ);
    }

    @Override // X.InterfaceC1289770jfT
    public final String LIZLLL() {
        return this.LIZ.LIZLLL.toString();
    }

    @Override // X.InterfaceC1289770jfT
    public final String getFilePath() {
        return this.LIZ.LIZLLL();
    }

    public C1530340pvU(C1533790q13 c1533790q13) {
        this.LIZ = c1533790q13;
    }
}
