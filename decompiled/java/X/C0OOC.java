package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OOC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OOC implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OOC)) {
            return false;
        }
        C0OOC c0ooc = (C0OOC) obj;
        return Intrinsics.LJFF(this.LL, c0ooc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0ooc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0ooc.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinPollCreateParam(bulletinBoardId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", previousPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enterMethod=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OOC(String str, String str2, String str3) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }
}
