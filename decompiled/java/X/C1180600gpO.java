package X;

/* JADX INFO: renamed from: X.0gpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1180600gpO {
    public final String LIZ;
    public final String LIZIZ;
    public final C1180560gpK LIZJ;
    public C1202680hP0 LIZLLL;
    public InterfaceC658750Psf LJ;
    public Object LJFF;

    public final C1189360h3W LIZ(Object obj) {
        this.LJFF = obj;
        return LIZJ(C1331660kl2.LJIIIIZZ(obj));
    }

    public final C1189360h3W LIZIZ(String str) {
        this.LJFF = str;
        return LIZJ(C1331660kl2.LJIIIZ(str));
    }

    public final C1189360h3W LIZJ(C1331670kl3 c1331670kl3) {
        String str = this.LIZ;
        String str2 = this.LIZIZ;
        C1202680hP0 c1202680hP0 = this.LIZLLL;
        InterfaceC658750Psf interfaceC658750Psf = this.LJ;
        C1180560gpK c1180560gpK = this.LIZJ;
        if (c1180560gpK != null) {
            c1180560gpK.LJ = this.LJFF;
        }
        return new C1189360h3W(c1331670kl3, str, str2, c1202680hP0, interfaceC658750Psf, c1180560gpK);
    }

    public C1180600gpO(String str, String str2, C1180560gpK c1180560gpK) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = c1180560gpK;
    }
}
