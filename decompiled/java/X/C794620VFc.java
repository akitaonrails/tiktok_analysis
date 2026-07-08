package X;

/* JADX INFO: renamed from: X.0VFc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C794620VFc {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC794690VFj LIZLLL;
    public C794530VEt LJ;
    public final boolean LJFF;
    public boolean LJI;
    public boolean LJII;

    public final synchronized C794740VFo LIZ() {
        if (!this.LJII && this.LJI) {
            C794530VEt c794530VEt = this.LJ;
            c794530VEt.getClass();
            return new C794740VFo("test", "tracer_span", c794530VEt);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("test");
        sbLIZ.append(" is start after Trace finish or before Trace begin, it will be ignore!!!!");
        C2188811AlT.LIZIZ(sbLIZ);
        return null;
    }

    public final synchronized void LIZIZ(long j) {
        C794530VEt c794530VEt;
        if (this.LJI) {
            return;
        }
        if (this.LJ == null) {
            if (C794680VFi.LIZ[this.LIZLLL.ordinal()] != 1) {
                c794530VEt = null;
            } else {
                c794530VEt = new C794530VEt(this);
            }
            this.LJ = c794530VEt;
        }
        C794530VEt c794530VEt2 = this.LJ;
        if (c794530VEt2 != null) {
            c794530VEt2.LIZ = j;
            this.LJI = true;
        }
    }

    public C794620VFc(String str, EnumC794690VFj enumC794690VFj, boolean z, InterfaceC794630VFd interfaceC794630VFd, String str2) {
        this.LIZ = str;
        this.LIZJ = interfaceC794630VFd.generate();
        this.LIZLLL = enumC794690VFj;
        this.LJFF = z;
        this.LIZIZ = str2;
    }
}
