package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869670Y9t {
    public static final /* synthetic */ int LJIILLIIL = 0;
    public final AbstractC1262404wo LIZ;
    public final AbstractC1262004wk LIZIZ;
    public final AbstractC1262404wo LIZJ;
    public final AbstractC1262004wk LIZLLL;
    public final AbstractC1262004wk LJ;
    public final C869720Y9y LJFF;
    public final C1270104y3 LJI;
    public final C1270104y3 LJII;
    public final C1270104y3 LJIIIIZZ;
    public final C1270104y3 LJIIIZ;
    public final AbstractC1269804y0 LJIIJ;
    public final C869740YAa LJIIJJI;
    public final C0Y9R LJIIL;
    public final C1908807dm LJIILIIL;
    public final C0YAF LJIILJJIL;
    public final boolean LJIILL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869670Y9t)) {
            return false;
        }
        C869670Y9t c869670Y9t = (C869670Y9t) obj;
        return Intrinsics.LJFF(this.LIZ, c869670Y9t.LIZ) && Intrinsics.LJFF(this.LIZIZ, c869670Y9t.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c869670Y9t.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c869670Y9t.LIZLLL) && Intrinsics.LJFF(this.LJ, c869670Y9t.LJ) && Intrinsics.LJFF(this.LJFF, c869670Y9t.LJFF) && Intrinsics.LJFF(this.LJI, c869670Y9t.LJI) && Intrinsics.LJFF(this.LJII, c869670Y9t.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c869670Y9t.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c869670Y9t.LJIIIZ) && Intrinsics.LJFF(this.LJIIJ, c869670Y9t.LJIIJ) && Intrinsics.LJFF(this.LJIIJJI, c869670Y9t.LJIIJJI) && Intrinsics.LJFF(this.LJIIL, c869670Y9t.LJIIL) && Intrinsics.LJFF(this.LJIILIIL, c869670Y9t.LJIILIIL) && Intrinsics.LJFF(this.LJIILJJIL, c869670Y9t.LJIILJJIL) && this.LJIILL == c869670Y9t.LJIILL;
    }

    public final String toString() {
        return "MessageFilter(messageUuid=" + this.LIZ + ", serverId=" + this.LIZIZ + ", conversationId=" + this.LIZJ + ", conversationShortId=" + this.LIZLLL + ", senderUid=" + this.LJ + ", msgType=" + this.LJFF + ", index=" + this.LJI + ", orderIndex=" + this.LJII + ", createTime=" + this.LJIIIIZZ + ", ttl=" + this.LJIIIZ + ", sendStatus=" + this.LJIIJ + ", readStatus=" + this.LJIIJJI + ", deleted=" + this.LJIIL + ", scene=" + this.LJIILIIL + ", kvProperty=" + this.LJIILJJIL + ", negated=" + this.LJIILL + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C869670Y9t() {
        C1262504wp c1262504wp = C1262504wp.LIZIZ;
        C1262304wn c1262304wn = C1262304wn.LIZIZ;
        this(c1262504wp, c1262304wn, c1262504wp, c1262304wn, c1262304wn, new C869720Y9y(null, null, 255), new C1270104y3(null, false, null, false, 63), new C1270104y3(null, false, null, false, 63), new C1270104y3(null, false, null, false, 63), new C1270104y3(null, false, null, false, 63), C1269904y1.LIZIZ, new C869740YAa(0), new C0Y9R(-1), new C1908807dm(null, 3), new C0YAF(0), false);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode()) * 31) + this.LJIIIZ.hashCode()) * 31) + this.LJIIJ.hashCode()) * 31) + this.LJIIJJI.LIZ) * 31) + this.LJIIL.LIZ) * 31) + this.LJIILIIL.hashCode()) * 31) + this.LJIILJJIL.hashCode()) * 31) + C786410Ut5.Z2(this.LJIILL);
    }

    public C869670Y9t(AbstractC1262404wo abstractC1262404wo, AbstractC1262004wk abstractC1262004wk, AbstractC1262404wo abstractC1262404wo2, AbstractC1262004wk abstractC1262004wk2, AbstractC1262004wk abstractC1262004wk3, C869720Y9y c869720Y9y, C1270104y3 c1270104y3, C1270104y3 c1270104y32, C1270104y3 c1270104y33, C1270104y3 c1270104y34, AbstractC1269804y0 abstractC1269804y0, C869740YAa c869740YAa, C0Y9R c0y9r, C1908807dm c1908807dm, C0YAF c0yaf, boolean z) {
        this.LIZ = abstractC1262404wo;
        this.LIZIZ = abstractC1262004wk;
        this.LIZJ = abstractC1262404wo2;
        this.LIZLLL = abstractC1262004wk2;
        this.LJ = abstractC1262004wk3;
        this.LJFF = c869720Y9y;
        this.LJI = c1270104y3;
        this.LJII = c1270104y32;
        this.LJIIIIZZ = c1270104y33;
        this.LJIIIZ = c1270104y34;
        this.LJIIJ = abstractC1269804y0;
        this.LJIIJJI = c869740YAa;
        this.LJIIL = c0y9r;
        this.LJIILIIL = c1908807dm;
        this.LJIILJJIL = c0yaf;
        this.LJIILL = z;
    }
}
