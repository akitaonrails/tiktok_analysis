package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OH3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OH3 implements InterfaceC111300bX {
    public final String LL;
    public final String LLILLJJLI;
    public final List<Long> LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OH3)) {
            return false;
        }
        C0OH3 c0oh3 = (C0OH3) obj;
        return Intrinsics.LJFF(this.LL, c0oh3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0oh3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0oh3.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReadUserListData(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", conversationId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", readers=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OH3(String str, String str2, List<Long> list) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = list;
    }
}
