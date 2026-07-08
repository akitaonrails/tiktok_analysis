package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cJp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1007270cJp implements InterfaceC0148002o {
    public final AbstractC1623806Xk<Boolean> LL;
    public final AbstractC1623806Xk<Integer> LLILLJJLI;
    public final AbstractC1623806Xk<Integer> LLILLL;

    public C1007270cJp() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1007270cJp)) {
            return false;
        }
        C1007270cJp c1007270cJp = (C1007270cJp) obj;
        return Intrinsics.LJFF(this.LL, c1007270cJp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1007270cJp.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1007270cJp.LLILLL);
    }

    public final int hashCode() {
        AbstractC1623806Xk<Boolean> abstractC1623806Xk = this.LL;
        int iHashCode = (abstractC1623806Xk == null ? 0 : abstractC1623806Xk.hashCode()) * 31;
        AbstractC1623806Xk<Integer> abstractC1623806Xk2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (abstractC1623806Xk2 == null ? 0 : abstractC1623806Xk2.hashCode())) * 31;
        AbstractC1623806Xk<Integer> abstractC1623806Xk3 = this.LLILLL;
        return iHashCode2 + (abstractC1623806Xk3 != null ? abstractC1623806Xk3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FindSchoolFriendsPageState(hasGroupChatRedDot=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", numberOfSchoolUsers=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", numberOfSchoolGroups=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1007270cJp(AbstractC1623806Xk<Boolean> abstractC1623806Xk, AbstractC1623806Xk<Integer> abstractC1623806Xk2, AbstractC1623806Xk<Integer> abstractC1623806Xk3) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
    }

    public static C1007270cJp LIZ(C1007270cJp c1007270cJp, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, int i) {
        if ((i & 1) != 0) {
            abstractC1623806Xk = c1007270cJp.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk2 = c1007270cJp.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk3 = c1007270cJp.LLILLL;
        }
        c1007270cJp.getClass();
        return new C1007270cJp(abstractC1623806Xk, abstractC1623806Xk2, abstractC1623806Xk3);
    }
}
