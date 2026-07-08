package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07tn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2008107tn implements InterfaceC0148002o {
    public final List<C0O27> LL;

    public C2008107tn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2008107tn) && Intrinsics.LJFF(this.LL, ((C2008107tn) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ReadUserListState(readUserList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2008107tn(int i) {
        this(C13BV.INSTANCE);
    }

    public C2008107tn(List<C0O27> list) {
        this.LL = list;
    }
}
