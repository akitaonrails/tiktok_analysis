package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1556690qbz implements InterfaceC0148002o {
    public final C1556680qby LL;
    public final int LLILLJJLI;
    public final boolean LLILLL;

    public C1556690qbz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1556690qbz)) {
            return false;
        }
        C1556690qbz c1556690qbz = (C1556690qbz) obj;
        return Intrinsics.LJFF(this.LL, c1556690qbz.LL) && this.LLILLJJLI == c1556690qbz.LLILLJJLI && this.LLILLL == c1556690qbz.LLILLL;
    }

    public final int hashCode() {
        C1556680qby c1556680qby = this.LL;
        return ((((c1556680qby == null ? 0 : c1556680qby.hashCode()) * 31) + this.LLILLJJLI) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FootNoteRatingCardState(toggleAnimationState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rateResult=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", resetCleanModeFlag=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1556690qbz(int i) {
        this(null, 0, false);
    }

    public C1556690qbz(C1556680qby c1556680qby, int i, boolean z) {
        this.LL = c1556680qby;
        this.LLILLJJLI = i;
        this.LLILLL = z;
    }

    public static C1556690qbz LIZ(C1556690qbz c1556690qbz, C1556680qby c1556680qby, int i, int i2) {
        boolean z;
        if ((i2 & 1) != 0) {
            c1556680qby = c1556690qbz.LL;
        }
        if ((i2 & 2) != 0) {
            i = c1556690qbz.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            z = c1556690qbz.LLILLL;
        } else {
            z = false;
        }
        c1556690qbz.getClass();
        return new C1556690qbz(c1556680qby, i, z);
    }
}
