package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZoB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C910770ZoB implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C0YMW LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C910770ZoB)) {
            return false;
        }
        C910770ZoB c910770ZoB = (C910770ZoB) obj;
        return this.LL == c910770ZoB.LL && this.LLILLJJLI == c910770ZoB.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c910770ZoB.LLILLL) && Intrinsics.LJFF(this.LLILZ, c910770ZoB.LLILZ);
    }

    public final int hashCode() {
        int iZ2 = ((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31;
        C0YMW c0ymw = this.LLILZ;
        return iZ2 + (c0ymw == null ? 0 : c0ymw.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChangeGroupNameState(isButtonLoading=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isEditTextFocusable=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", updateSuccess=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateError=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C910770ZoB(boolean z, boolean z2, C291001Au<Boolean> c291001Au, C0YMW c0ymw) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = c291001Au;
        this.LLILZ = c0ymw;
    }

    public static C910770ZoB LIZ(C910770ZoB c910770ZoB, boolean z, boolean z2, C291001Au c291001Au, C0YMW c0ymw, int i) {
        if ((i & 1) != 0) {
            z = c910770ZoB.LL;
        }
        if ((i & 2) != 0) {
            z2 = c910770ZoB.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c910770ZoB.LLILLL;
        }
        if ((i & 8) != 0) {
            c0ymw = c910770ZoB.LLILZ;
        }
        c910770ZoB.getClass();
        return new C910770ZoB(z, z2, c291001Au, c0ymw);
    }
}
