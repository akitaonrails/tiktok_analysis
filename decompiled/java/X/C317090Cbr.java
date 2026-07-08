package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317090Cbr {
    public final String LIZ;
    public final List<C20611415l2> LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final float LJFF;
    public final float LJI;

    public C317090Cbr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C317090Cbr)) {
            return false;
        }
        C317090Cbr c317090Cbr = (C317090Cbr) obj;
        return Intrinsics.LJFF(this.LIZ, c317090Cbr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c317090Cbr.LIZIZ) && this.LIZJ == c317090Cbr.LIZJ && this.LIZLLL == c317090Cbr.LIZLLL && this.LJ == c317090Cbr.LJ && Float.compare(this.LJFF, c317090Cbr.LJFF) == 0 && Float.compare(this.LJI, c317090Cbr.LJI) == 0;
    }

    public C317090Cbr(int i) {
        this("", C13BV.INSTANCE, false, 0, false, 0.0f, 0.0f);
    }

    public C317090Cbr(String str, List<C20611415l2> list, boolean z, int i, boolean z2, float f, float f2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = z2;
        this.LJFF = f;
        this.LJI = f2;
    }
}
