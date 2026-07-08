package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0v9J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1731110v9J implements InterfaceC0148002o {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public C1731110v9J() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1731110v9J)) {
            return false;
        }
        C1731110v9J c1731110v9J = (C1731110v9J) obj;
        return Intrinsics.LJFF(this.LL, c1731110v9J.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1731110v9J.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1731110v9J.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1731110v9J.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MultiTextTemplateEditState(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", content1=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", content2=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", content3=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1731110v9J(int i) {
        this("", "", "", "");
    }

    public C1731110v9J(String str, String str2, String str3, String str4) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
    }

    public static C1731110v9J LIZ(C1731110v9J c1731110v9J, String str, String str2, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = c1731110v9J.LL;
        }
        if ((i & 2) != 0) {
            str2 = c1731110v9J.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            str3 = c1731110v9J.LLILLL;
        }
        if ((i & 8) != 0) {
            str4 = c1731110v9J.LLILZ;
        }
        c1731110v9J.getClass();
        return new C1731110v9J(str, str2, str3, str4);
    }
}
