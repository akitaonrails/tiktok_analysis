package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gH7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159350gH7 implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;

    public C1159350gH7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159350gH7)) {
            return false;
        }
        C1159350gH7 c1159350gH7 = (C1159350gH7) obj;
        return Intrinsics.LJFF(this.LL, c1159350gH7.LL) && this.LLILLJJLI == c1159350gH7.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1159350gH7.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecUserPopupState(scrollToTop=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", privacyVisible=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", triggerLoad=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1159350gH7(int i) {
        this(null, null, false);
    }

    public C1159350gH7(C291001Au c291001Au, C291001Au c291001Au2, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au2;
    }

    public static C1159350gH7 LIZ(C1159350gH7 c1159350gH7, C291001Au c291001Au, boolean z, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1159350gH7.LL;
        }
        if ((i & 2) != 0) {
            z = c1159350gH7.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c1159350gH7.LLILLL;
        }
        c1159350gH7.getClass();
        return new C1159350gH7(c291001Au, c291001Au2, z);
    }
}
