package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HXC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HXC implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Boolean> LLILZ;

    public C0HXC() {
        this(null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HXC)) {
            return false;
        }
        C0HXC c0hxc = (C0HXC) obj;
        return Intrinsics.LJFF(this.LL, c0hxc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hxc.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0hxc.LLILLL) && Intrinsics.LJFF(this.LLILZ, c0hxc.LLILZ);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLILZ;
        return iHashCode3 + (c291001Au4 != null ? c291001Au4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchEllipsisState(captionUpdateEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", descTranslationUpdateEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", descLanguageChangedEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", userClickSearchEllipsis=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HXC(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Boolean> c291001Au4) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
    }

    public static C0HXC LIZ(C0HXC c0hxc, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        if ((i & 1) != 0) {
            c291001Au = c0hxc.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c0hxc.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c0hxc.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c0hxc.LLILZ;
        }
        c0hxc.getClass();
        return new C0HXC(c291001Au, c291001Au2, c291001Au3, c291001Au4);
    }
}
