package X;

/* JADX INFO: renamed from: X.18vj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21442118vj extends AbstractC21440018vO {
    public final C21439218vG LIZ;
    public final C21442718vp LIZIZ;

    public C21442118vj() {
        this(0);
    }

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LJII() {
        if (this.LIZIZ.LIZIZ.length() == 0) {
            this.LIZ.LJFF();
        }
    }

    @Override // X.InterfaceC21443518vx
    public final AbstractC21439018vE LIZIZ() {
        return this.LIZ;
    }

    public C21442118vj(int i) {
        this.LIZ = new C21439218vG();
        this.LIZIZ = new C21442718vp();
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[LOOP:0: B:6:0x0018->B:110:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0038 A[SYNTHETIC] */
    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.CharSequence r10) {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21442118vj.LIZJ(java.lang.CharSequence):void");
    }

    @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
    public final void LIZLLL(InterfaceC21429918tl interfaceC21429918tl) {
        StringBuilder sb = this.LIZIZ.LIZIZ;
        if (sb.length() > 0) {
            interfaceC21429918tl.LIZ(sb.toString(), this.LIZ);
        }
    }

    @Override // X.InterfaceC21443518vx
    public final C21445418wG LJFF(InterfaceC21449618ww interfaceC21449618ww) {
        C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
        if (!c21440618vU.LJII) {
            return C21445418wG.LIZ(c21440618vU.LIZIZ);
        }
        return null;
    }
}
