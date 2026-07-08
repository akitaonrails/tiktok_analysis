package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g8R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1153970g8R implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1153970g8R)) {
            return false;
        }
        C1153970g8R c1153970g8R = (C1153970g8R) obj;
        return Intrinsics.LJFF(this.LL, c1153970g8R.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1153970g8R.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1153970g8R.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MockHierarchyData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", permissionEnterFrom=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1153970g8R(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
