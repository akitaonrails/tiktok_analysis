package X;

import java.io.File;

/* JADX INFO: renamed from: X.1Bcf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2208831Bcf implements C1DMJ {
    public final C0VSJ LIZ;
    public final C0VSJ LIZIZ;
    public final C0VSJ LIZJ;
    public final C0VSJ LIZLLL;

    public C2208831Bcf() {
        C2216191BoX.LIZ.getClass();
        C0VSJ c0vsj = ((C2208821Bce) C2216191BoX.LIZIZ()).LJIIIZ;
        this.LIZ = c0vsj;
        C0VSJ c0vsj2 = new C0VSJ(((C2208821Bce) C2216191BoX.LIZIZ()).LJIIIZ, "segs");
        this.LIZIZ = c0vsj2;
        this.LIZJ = new C0VSJ(c0vsj2, "video");
        this.LIZLLL = new C0VSJ(c0vsj2, "audio");
        new C0VSJ(c0vsj, "photo");
    }

    @Override // X.C1DMJ
    public final File LIZ() {
        return this.LIZJ;
    }

    @Override // X.C1DMJ
    public final File LIZIZ() {
        return this.LIZLLL;
    }

    @Override // X.C1DMJ
    public final File LIZJ() {
        return this.LIZIZ;
    }

    @Override // X.C1DMJ
    public final File getWorkspace() {
        return this.LIZ;
    }
}
