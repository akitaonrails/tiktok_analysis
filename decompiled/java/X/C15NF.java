package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15NF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15NF implements InterfaceC0148002o {
    public final C291001Au<C15NH> LL;
    public final C291001Au<IMUser> LLILLJJLI;
    public final C291001Au<IMUser> LLILLL;
    public final C291001Au<C15NC> LLILZ;
    public final C291001Au<String> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;

    public C15NF() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15NF)) {
            return false;
        }
        C15NF c15nf = (C15NF) obj;
        return Intrinsics.LJFF(this.LL, c15nf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c15nf.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c15nf.LLILLL) && Intrinsics.LJFF(this.LLILZ, c15nf.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c15nf.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c15nf.LLILZLL);
    }

    public final int hashCode() {
        C291001Au<C15NH> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<IMUser> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<IMUser> c291001Au3 = this.LLILLL;
        int iHashCode3 = (iHashCode2 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<C15NC> c291001Au4 = this.LLILZ;
        int iHashCode4 = (iHashCode3 + (c291001Au4 == null ? 0 : c291001Au4.hashCode())) * 31;
        C291001Au<String> c291001Au5 = this.LLILZIL;
        int iHashCode5 = (iHashCode4 + (c291001Au5 == null ? 0 : c291001Au5.hashCode())) * 31;
        C291001Au<Boolean> c291001Au6 = this.LLILZLL;
        return iHashCode5 + (c291001Au6 != null ? c291001Au6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorState(allFriends=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", tagChangedUser=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", blockUser=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", toast=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", endSearchState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C15NF(int i) {
        this(null, null, null, null, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C15NF(C291001Au<C15NH> c291001Au, C291001Au<? extends IMUser> c291001Au2, C291001Au<? extends IMUser> c291001Au3, C291001Au<? extends C15NC> c291001Au4, C291001Au<String> c291001Au5, C291001Au<Boolean> c291001Au6) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
        this.LLILZIL = c291001Au5;
        this.LLILZLL = c291001Au6;
    }

    public static C15NF LIZ(C15NF c15nf, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, C291001Au c291001Au5, C291001Au c291001Au6, int i) {
        C291001Au c291001Au7 = c291001Au6;
        C291001Au c291001Au8 = c291001Au5;
        C291001Au c291001Au9 = c291001Au4;
        C291001Au c291001Au10 = c291001Au3;
        C291001Au c291001Au11 = c291001Au2;
        C291001Au c291001Au12 = c291001Au;
        if ((i & 1) != 0) {
            c291001Au12 = c15nf.LL;
        }
        if ((i & 2) != 0) {
            c291001Au11 = c15nf.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au10 = c15nf.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au9 = c15nf.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au8 = c15nf.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au7 = c15nf.LLILZLL;
        }
        c15nf.getClass();
        return new C15NF(c291001Au12, c291001Au11, c291001Au10, c291001Au9, c291001Au8, c291001Au7);
    }
}
