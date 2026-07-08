package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712870Rxl implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;
    public final C291001Au<Unit> LLILZ;
    public final String LLILZIL;

    public C712870Rxl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C712870Rxl)) {
            return false;
        }
        C712870Rxl c712870Rxl = (C712870Rxl) obj;
        return Intrinsics.LJFF(this.LL, c712870Rxl.LL) && Intrinsics.LJFF(this.LLILLJJLI, c712870Rxl.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c712870Rxl.LLILLL) && Intrinsics.LJFF(this.LLILZ, c712870Rxl.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c712870Rxl.LLILZIL);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Unit> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Unit> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        String str = this.LLILZIL;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryGuideCardAvatarState(onClickRootEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onClickButtonEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onCardShowEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onCardHideEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", enterPosition=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C712870Rxl(int i) {
        this(null, null, null, null, null);
    }

    public C712870Rxl(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Unit> c291001Au3, C291001Au<Unit> c291001Au4, String str) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = str;
    }

    public static C712870Rxl LIZ(C712870Rxl c712870Rxl, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, String str, int i) {
        String str2 = str;
        C291001Au c291001Au5 = c291001Au4;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au8 = c712870Rxl.LL;
        }
        if ((i & 2) != 0) {
            c291001Au7 = c712870Rxl.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au6 = c712870Rxl.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au5 = c712870Rxl.LLILZ;
        }
        if ((i & 16) != 0) {
            str2 = c712870Rxl.LLILZIL;
        }
        c712870Rxl.getClass();
        return new C712870Rxl(c291001Au8, c291001Au7, c291001Au6, c291001Au5, str2);
    }
}
