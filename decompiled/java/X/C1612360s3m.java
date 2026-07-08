package X;

import com.ss.android.ugc.aweme.model.PaidVideoItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0s3m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612360s3m {
    public final PaidVideoItem LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1612360s3m)) {
            return false;
        }
        C1612360s3m c1612360s3m = (C1612360s3m) obj;
        return Intrinsics.LJFF(this.LIZ, c1612360s3m.LIZ) && this.LIZIZ == c1612360s3m.LIZIZ && this.LIZJ == c1612360s3m.LIZJ && this.LIZLLL == c1612360s3m.LIZLLL && this.LJ == c1612360s3m.LJ && this.LJFF == c1612360s3m.LJFF && this.LJI == c1612360s3m.LJI && this.LJII == c1612360s3m.LJII;
    }

    public static C1612360s3m LIZ(C1612360s3m c1612360s3m, PaidVideoItem paidVideoItem, boolean z, boolean z2, boolean z3, int i) {
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        PaidVideoItem paidVideoItem2 = paidVideoItem;
        if ((i & 1) != 0) {
            paidVideoItem2 = c1612360s3m.LIZ;
        }
        if ((i & 2) != 0) {
            z4 = c1612360s3m.LIZIZ;
        } else {
            z4 = false;
        }
        if ((i & 4) != 0) {
            z10 = c1612360s3m.LIZJ;
        }
        if ((i & 8) != 0) {
            z9 = c1612360s3m.LIZLLL;
        }
        if ((i & 16) != 0) {
            z5 = c1612360s3m.LJ;
        } else {
            z5 = false;
        }
        if ((i & 32) != 0) {
            z8 = c1612360s3m.LJFF;
        }
        if ((i & 64) != 0) {
            z6 = c1612360s3m.LJI;
        } else {
            z6 = false;
        }
        if ((i & 128) != 0) {
            z7 = c1612360s3m.LJII;
        } else {
            z7 = false;
        }
        return new C1612360s3m(paidVideoItem2, z4, z10, z9, z5, z8, z6, z7);
    }

    public C1612360s3m(PaidVideoItem paidVideoItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.LIZ = paidVideoItem;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = z6;
        this.LJII = z7;
    }

    public /* synthetic */ C1612360s3m(PaidVideoItem paidVideoItem, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        this(paidVideoItem, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? false : z4, (i & 32) != 0 ? false : z5, (i & 64) != 0 ? false : z6, (i & 128) != 0 ? false : z7);
    }
}
