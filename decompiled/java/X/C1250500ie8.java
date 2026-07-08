package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ie8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1250500ie8 implements InterfaceC0148002o {
    public final boolean LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final AbstractC1623806Xk<Integer> LLILZIL;
    public final C291001Au<Integer> LLILZLL;
    public final C291001Au<User> LLIZ;
    public final User LLIZLLLIL;
    public final boolean LLJ;
    public final boolean LLJI;

    public C1250500ie8() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1250500ie8)) {
            return false;
        }
        C1250500ie8 c1250500ie8 = (C1250500ie8) obj;
        return this.LL == c1250500ie8.LL && this.LLILLJJLI == c1250500ie8.LLILLJJLI && this.LLILLL == c1250500ie8.LLILLL && this.LLILZ == c1250500ie8.LLILZ && Intrinsics.LJFF(this.LLILZIL, c1250500ie8.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1250500ie8.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1250500ie8.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c1250500ie8.LLIZLLLIL) && this.LLJ == c1250500ie8.LLJ && this.LLJI == c1250500ie8.LLJI;
    }

    public final int hashCode() {
        int iZ2 = ((((((((C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode()) * 31;
        C291001Au<Integer> c291001Au = this.LLILZLL;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<User> c291001Au2 = this.LLIZ;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        User user = this.LLIZLLLIL;
        return ((((iHashCode2 + (user != null ? user.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJ)) * 31) + C786410Ut5.Z2(this.LLJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserProfileUserCardVMState(isExpanded=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadReason=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", openIconStatus=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isAssemVisible=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", userCardState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", errorEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", triggerRefresh=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", hostUser=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isSimpleUser=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isPublishEmpty=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1250500ie8(int i) {
        this(false, -1, 0, false, C491101vh.LIZ, null, null, null, false, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1250500ie8(boolean z, int i, int i2, boolean z2, AbstractC1623806Xk<Integer> abstractC1623806Xk, C291001Au<Integer> c291001Au, C291001Au<? extends User> c291001Au2, User user, boolean z3, boolean z4) {
        this.LL = z;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = z2;
        this.LLILZIL = abstractC1623806Xk;
        this.LLILZLL = c291001Au;
        this.LLIZ = c291001Au2;
        this.LLIZLLLIL = user;
        this.LLJ = z3;
        this.LLJI = z4;
    }

    public static C1250500ie8 LIZ(C1250500ie8 c1250500ie8, boolean z, int i, int i2, boolean z2, AbstractC1623806Xk abstractC1623806Xk, C291001Au c291001Au, C291001Au c291001Au2, User user, boolean z3, boolean z4, int i3) {
        boolean z5 = z4;
        boolean z6 = z3;
        User user2 = user;
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        AbstractC1623806Xk abstractC1623806Xk2 = abstractC1623806Xk;
        boolean z7 = z2;
        int i4 = i2;
        int i5 = i;
        boolean z8 = z;
        if ((i3 & 1) != 0) {
            z8 = c1250500ie8.LL;
        }
        if ((i3 & 2) != 0) {
            i5 = c1250500ie8.LLILLJJLI;
        }
        if ((i3 & 4) != 0) {
            i4 = c1250500ie8.LLILLL;
        }
        if ((i3 & 8) != 0) {
            z7 = c1250500ie8.LLILZ;
        }
        if ((i3 & 16) != 0) {
            abstractC1623806Xk2 = c1250500ie8.LLILZIL;
        }
        if ((i3 & 32) != 0) {
            c291001Au4 = c1250500ie8.LLILZLL;
        }
        if ((i3 & 64) != 0) {
            c291001Au3 = c1250500ie8.LLIZ;
        }
        if ((i3 & 128) != 0) {
            user2 = c1250500ie8.LLIZLLLIL;
        }
        if ((i3 & 256) != 0) {
            z6 = c1250500ie8.LLJ;
        }
        if ((i3 & 512) != 0) {
            z5 = c1250500ie8.LLJI;
        }
        c1250500ie8.getClass();
        return new C1250500ie8(z8, i5, i4, z7, abstractC1623806Xk2, c291001Au4, c291001Au3, user2, z6, z5);
    }
}
