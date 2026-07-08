package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hk2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1215720hk2 implements InterfaceC0148002o {
    public final C2344009Gk LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public C1215720hk2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1215720hk2)) {
            return false;
        }
        C1215720hk2 c1215720hk2 = (C1215720hk2) obj;
        return Intrinsics.LJFF(this.LL, c1215720hk2.LL) && this.LLILLJJLI == c1215720hk2.LLILLJJLI && this.LLILLL == c1215720hk2.LLILLL && this.LLILZ == c1215720hk2.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditProfileSyncState(profileEditStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", shouldShowLoading=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isDeletingNonProfit=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", shouldImpersonationButtonEnable=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1215720hk2(int i) {
        this(new C2344009Gk(), false, false, false);
    }

    public C1215720hk2(C2344009Gk c2344009Gk, boolean z, boolean z2, boolean z3) {
        this.LL = c2344009Gk;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
    }

    public static C1215720hk2 LIZ(C1215720hk2 c1215720hk2, C2344009Gk c2344009Gk, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            c2344009Gk = c1215720hk2.LL;
        }
        if ((i & 2) != 0) {
            z = c1215720hk2.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1215720hk2.LLILLL;
        }
        if ((i & 8) != 0) {
            z3 = c1215720hk2.LLILZ;
        }
        c1215720hk2.getClass();
        return new C1215720hk2(c2344009Gk, z, z2, z3);
    }
}
