package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c18, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995680c18 implements InterfaceC0148002o {
    public final C291001Au<Integer> LL;
    public final String LLILLJJLI;
    public final C291001Au<Integer> LLILLL;

    public C995680c18() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995680c18)) {
            return false;
        }
        C995680c18 c995680c18 = (C995680c18) obj;
        return Intrinsics.LJFF(this.LL, c995680c18.LL) && Intrinsics.LJFF(this.LLILLJJLI, c995680c18.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c995680c18.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        String str = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C291001Au<Integer> c291001Au = this.LLILLL;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedAvatarDefaultState(followViewVisibility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", profileWidgetBadgeUrl=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", updateContainerViewVisibility=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995680c18(int i) {
        this(new C291001Au(0), null, null);
    }

    public C995680c18(C291001Au c291001Au, C291001Au c291001Au2, String str) {
        this.LL = c291001Au;
        this.LLILLJJLI = str;
        this.LLILLL = c291001Au2;
    }

    public static C995680c18 LIZ(C995680c18 c995680c18, C291001Au c291001Au, String str, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c995680c18.LL;
        }
        if ((i & 2) != 0) {
            str = c995680c18.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c995680c18.LLILLL;
        }
        c995680c18.getClass();
        return new C995680c18(c291001Au, c291001Au2, str);
    }
}
