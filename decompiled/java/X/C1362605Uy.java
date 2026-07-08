package X;

/* JADX INFO: renamed from: X.05Uy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1362605Uy {
    public C1683130ttv LIZ;
    public C1683130ttv LIZIZ;
    public C1683130ttv LIZJ;
    public C1683130ttv LIZLLL;

    public C1362605Uy() {
        this(0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BoundsStateHolder(imageBoundsInParent=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", originalImageBoundsInParent=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", imageBoundsInWindow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", containerBounds=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1362605Uy(int i) {
        C1683130ttv c1683130ttv = C1683130ttv.LJ;
        this.LIZ = c1683130ttv;
        this.LIZIZ = c1683130ttv;
        this.LIZJ = c1683130ttv;
        this.LIZLLL = c1683130ttv;
        C1671460tb6.LIZ.LIZ("BoundsStateHolder init");
    }
}
