package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZPR, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZPR implements InterfaceC0148002o {
    public final C0ZPU LL;
    public final CharSequence LLILLJJLI;
    public final C0ZPJ LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZPR)) {
            return false;
        }
        C0ZPR c0zpr = (C0ZPR) obj;
        return Intrinsics.LJFF(this.LL, c0zpr.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zpr.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0zpr.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        CharSequence charSequence = this.LLILLJJLI;
        return ((iHashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupTitleBarState(titleTextState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hint=");
        sbLIZ.append((Object) this.LLILLJJLI);
        sbLIZ.append(", activeStatusState=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ZPR(C0ZPU c0zpu, CharSequence charSequence, C0ZPJ c0zpj) {
        this.LL = c0zpu;
        this.LLILLJJLI = charSequence;
        this.LLILLL = c0zpj;
    }

    public static C0ZPR LIZ(C0ZPR c0zpr, C0ZPU c0zpu, CharSequence charSequence, C0ZPJ c0zpj, int i) {
        if ((i & 1) != 0) {
            c0zpu = c0zpr.LL;
        }
        if ((i & 2) != 0) {
            charSequence = c0zpr.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c0zpj = c0zpr.LLILLL;
        }
        c0zpr.getClass();
        return new C0ZPR(c0zpu, charSequence, c0zpj);
    }
}
