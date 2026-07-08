package X;

/* JADX INFO: renamed from: X.10ii, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19323010ii extends C14JV implements InterfaceC20244014Ja {
    public int LIZJ;
    public boolean LIZLLL;
    public C20244614Jg LJ;
    public boolean LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public final /* synthetic */ C19322910ih LJIIJ;

    public C19323010ii(C19322910ih c19322910ih) {
        this.LJIIJ = c19322910ih;
    }

    @Override // X.C14JV
    public final void LIZIZ(C14JT c14jt) {
        if (this.LIZLLL && (c14jt.LIZ() & 8) != 0) {
            this.LIZLLL = false;
            if (this.LJII) {
                this.LJIIIZ = false;
                this.LJIIJ.getClass();
            }
        }
    }

    @Override // X.C14JV
    public final void LIZJ(C14JT c14jt) {
        if ((c14jt.LIZ() & 8) != 0) {
            this.LIZLLL = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0120  */
    @Override // X.InterfaceC20244014Ja
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20244614Jg LIZ(android.view.View r10, X.C20244614Jg r11) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19323010ii.LIZ(android.view.View, X.14Jg):X.14Jg");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003b, code lost:
    
        return r4;
     */
    @Override // X.C14JV
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C20244614Jg LIZLLL(X.C20244614Jg r4, java.util.List<X.C14JT> r5) {
        /*
            r3 = this;
            java.util.Iterator r1 = r5.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L3b
            java.lang.Object r0 = r1.next()
            X.14JT r0 = (X.C14JT) r0
            int r0 = r0.LIZ()
            r2 = 8
            r0 = r0 & 8
            if (r0 == 0) goto L4
            r0 = 2
            X.14Ji r0 = r4.LIZ(r0)
            int r1 = r0.LIZLLL
            X.14Ji r0 = r4.LIZ(r2)
            int r2 = r0.LIZLLL
            int r2 = r2 - r1
            r1 = 0
            if (r2 < 0) goto L2f
            r0 = 1
            if (r2 <= r0) goto L2f
            r1 = r2
        L2f:
            int r0 = r3.LIZJ
            if (r0 != 0) goto L3c
            boolean r0 = r3.LJIIIZ
            if (r0 != 0) goto L3c
            int r0 = r3.LJIIIIZZ
            if (r0 != 0) goto L3c
        L3b:
            return r4
        L3c:
            r3.LJIIIIZZ = r1
            boolean r0 = r3.LJFF
            r0 = r0 ^ 1
            r3.LJII = r0
            X.10ih r0 = r3.LJIIJ
            r0.getClass()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19323010ii.LIZLLL(X.14Jg, java.util.List):X.14Jg");
    }

    @Override // X.C14JV
    public final C14JR LJ(C14JT c14jt, C14JR c14jr) {
        if ((c14jt.LIZ() & 8) != 0) {
            this.LJII = false;
        }
        return c14jr;
    }
}
