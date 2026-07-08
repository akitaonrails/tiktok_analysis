package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gE9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157510gE9 implements InterfaceC111300bX {
    public final EnumC1157520gEA LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157510gE9)) {
            return false;
        }
        C1157510gE9 c1157510gE9 = (C1157510gE9) obj;
        return this.LL == c1157510gE9.LL && Intrinsics.LJFF(this.LLILLJJLI, c1157510gE9.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchCreatorInboxHierarchyData(enterMethod=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", prePreviousPage=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157510gE9(EnumC1157520gEA enumC1157520gEA, String str) {
        this.LL = enumC1157520gEA;
        this.LLILLJJLI = str;
    }
}
