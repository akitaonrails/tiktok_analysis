package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995820c1M implements InterfaceC0148002o {
    public final boolean LL;
    public final String LLILLJJLI;
    public final C291001Au<Integer> LLILLL;

    public C995820c1M() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995820c1M)) {
            return false;
        }
        C995820c1M c995820c1M = (C995820c1M) obj;
        return this.LL == c995820c1M.LL && Intrinsics.LJFF(this.LLILLJJLI, c995820c1M.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c995820c1M.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode()) * 31;
        C291001Au<Integer> c291001Au = this.LLILLL;
        return iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProfileEditPronounsNavBarState(isUpdate=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newPronouns=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toastMessageId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995820c1M(int i) {
        this(null, "", false);
    }

    public C995820c1M(C291001Au c291001Au, String str, boolean z) {
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = c291001Au;
    }

    public static C995820c1M LIZ(C995820c1M c995820c1M, boolean z, String str, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            z = c995820c1M.LL;
        }
        if ((i & 2) != 0) {
            str = c995820c1M.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c995820c1M.LLILLL;
        }
        c995820c1M.getClass();
        return new C995820c1M(c291001Au, str, z);
    }
}
