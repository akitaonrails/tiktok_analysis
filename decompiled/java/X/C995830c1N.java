package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0c1N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C995830c1N implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final boolean LLILLJJLI;
    public final C291001Au<Integer> LLILLL;

    public C995830c1N() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C995830c1N)) {
            return false;
        }
        C995830c1N c995830c1N = (C995830c1N) obj;
        return Intrinsics.LJFF(this.LL, c995830c1N.LL) && this.LLILLJJLI == c995830c1N.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c995830c1N.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Boolean> c291001Au = this.LL;
        int iHashCode = (((c291001Au == null ? 0 : c291001Au.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31;
        C291001Au<Integer> c291001Au2 = this.LLILLL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArtistMusicAwemeListNavBarState(isLoadingEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", saveSuccess=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", toastMessageId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C995830c1N(int i) {
        this(null, null, false);
    }

    public C995830c1N(C291001Au c291001Au, C291001Au c291001Au2, boolean z) {
        this.LL = c291001Au;
        this.LLILLJJLI = z;
        this.LLILLL = c291001Au2;
    }

    public static C995830c1N LIZ(C995830c1N c995830c1N, C291001Au c291001Au, boolean z, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c995830c1N.LL;
        }
        if ((i & 2) != 0) {
            z = c995830c1N.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au2 = c995830c1N.LLILLL;
        }
        c995830c1N.getClass();
        return new C995830c1N(c291001Au, c291001Au2, z);
    }
}
