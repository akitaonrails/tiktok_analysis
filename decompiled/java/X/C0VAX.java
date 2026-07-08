package X;

import Y.ARunnableS32S0110000_13;

/* JADX INFO: renamed from: X.0VAX, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VAX extends C0VAW {
    public long LIZJ;

    @Override // X.C0VAV
    public final void LIZLLL() {
        C787900UvU.LIZ.LIZJ(new ARunnableS32S0110000_13(this, this.LIZ, 3));
        this.LIZ = true;
    }

    @Override // X.C0VAV
    public final void LJIJ() {
        C787900UvU.LIZ.LIZJ(new ARunnableS32S0110000_13(this, this.LIZ, 3));
        this.LIZ = false;
    }

    @Override // X.C0VAV
    public final void LJFF(C793380VAi c793380VAi, C793390VAj c793390VAj) {
        if (c793390VAj.LIZIZ) {
            c793380VAi.LIZJ += (long) ((c793390VAj.LJI / C08OX.LJFF()) * 1000.0d);
        } else {
            c793380VAi.LJII += (long) ((c793390VAj.LJI / C08OX.LJFF()) * 1000.0d);
        }
    }
}
