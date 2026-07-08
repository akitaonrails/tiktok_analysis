package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869690Y9v {
    public static final /* synthetic */ int LJIIJ = 0;
    public final AbstractC1262404wo LIZ;
    public final AbstractC1262004wk LIZIZ;
    public final C0YB8 LIZJ;
    public final C1908707dl LIZLLL;
    public final C0YAS LJ;
    public final C0YAR LJFF;
    public final C0YBA LJI;
    public final C0YAN LJII;
    public final C873950YQf LJIIIIZZ;
    public final boolean LJIIIZ;

    public C869690Y9v() {
        this(null, null, null, null, null, null, 1023);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C869690Y9v)) {
            return false;
        }
        C869690Y9v c869690Y9v = (C869690Y9v) obj;
        return Intrinsics.LJFF(this.LIZ, c869690Y9v.LIZ) && Intrinsics.LJFF(this.LIZIZ, c869690Y9v.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c869690Y9v.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c869690Y9v.LIZLLL) && Intrinsics.LJFF(this.LJ, c869690Y9v.LJ) && Intrinsics.LJFF(this.LJFF, c869690Y9v.LJFF) && Intrinsics.LJFF(this.LJI, c869690Y9v.LJI) && Intrinsics.LJFF(this.LJII, c869690Y9v.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c869690Y9v.LJIIIIZZ) && this.LJIIIZ == c869690Y9v.LJIIIZ;
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31;
        C873950YQf c873950YQf = this.LJIIIIZZ;
        return ((iHashCode + (c873950YQf == null ? 0 : c873950YQf.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ConversationFilter(conversationId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conversationShortId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", category=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tags=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", readStatus=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", muteStatus=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", conversationType=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", deletedStatus=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", kvQuery=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", negated=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C869690Y9v(AbstractC1262404wo abstractC1262404wo, C0YB9 c0yb9, C1908707dl c1908707dl, C0YBB c0ybb, C0YAN c0yan, C873950YQf c873950YQf, int i) {
        C1262304wn c1262304wn;
        C0YAS c0yas;
        C0YAR c0yar;
        C0YAN c0yan2 = c0yan;
        C0YB8 c0yb8 = c0yb9;
        C0YBA c0yba = c0ybb;
        C1908707dl c1908707dl2 = c1908707dl;
        AbstractC1262404wo abstractC1262404wo2 = (i & 1) != 0 ? C1262504wp.LIZIZ : abstractC1262404wo;
        if ((i & 2) != 0) {
            c1262304wn = C1262304wn.LIZIZ;
        } else {
            c1262304wn = null;
        }
        c0yb8 = (i & 4) != 0 ? C0YBZ.LIZIZ : c0yb8;
        c1908707dl2 = (i & 8) != 0 ? new C1908707dl(null, null, 7) : c1908707dl2;
        if ((i & 16) != 0) {
            c0yas = new C0YAS(0);
        } else {
            c0yas = null;
        }
        if ((i & 32) != 0) {
            c0yar = new C0YAR(0);
        } else {
            c0yar = null;
        }
        this(abstractC1262404wo2, c1262304wn, c0yb8, c1908707dl2, c0yas, c0yar, (i & 64) != 0 ? C870000YBa.LIZIZ : c0yba, (i & 128) != 0 ? new C0YAN(0) : c0yan2, (i & 256) == 0 ? c873950YQf : null, false);
    }

    public C869690Y9v(AbstractC1262404wo abstractC1262404wo, AbstractC1262004wk abstractC1262004wk, C0YB8 c0yb8, C1908707dl c1908707dl, C0YAS c0yas, C0YAR c0yar, C0YBA c0yba, C0YAN c0yan, C873950YQf c873950YQf, boolean z) {
        this.LIZ = abstractC1262404wo;
        this.LIZIZ = abstractC1262004wk;
        this.LIZJ = c0yb8;
        this.LIZLLL = c1908707dl;
        this.LJ = c0yas;
        this.LJFF = c0yar;
        this.LJI = c0yba;
        this.LJII = c0yan;
        this.LJIIIIZZ = c873950YQf;
        this.LJIIIZ = z;
    }
}
