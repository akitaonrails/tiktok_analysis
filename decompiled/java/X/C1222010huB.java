package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0huB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1222010huB implements InterfaceC0148002o {
    public final EnumC488160JCk LL;
    public final boolean LLILLJJLI;
    public final String LLILLL;

    public C1222010huB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1222010huB)) {
            return false;
        }
        C1222010huB c1222010huB = (C1222010huB) obj;
        return this.LL == c1222010huB.LL && this.LLILLJJLI == c1222010huB.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1222010huB.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        String str = this.LLILLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CAStepUIState(loadingStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadingModeIsFirst=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", postGuideJumpSchema=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1222010huB(int i) {
        this(EnumC488160JCk.LOADING, true, null);
    }

    public C1222010huB(EnumC488160JCk enumC488160JCk, boolean z, String str) {
        this.LL = enumC488160JCk;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    public static C1222010huB LIZ(C1222010huB c1222010huB, EnumC488160JCk enumC488160JCk, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            enumC488160JCk = c1222010huB.LL;
        }
        if ((i & 2) != 0) {
            z = c1222010huB.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str = c1222010huB.LLILLL;
        }
        c1222010huB.getClass();
        return new C1222010huB(enumC488160JCk, z, str);
    }
}
