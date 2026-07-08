package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I5f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C460810I5f implements InterfaceC1587906Jp {
    public final IMUser LL;
    public final boolean LLILLJJLI;
    public final C0I4Y<InterfaceC460300I3g> LLILLL;
    public final C0I5T LLILZ;
    public final C0I40 LLILZIL;
    public final boolean LLILZLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C460810I5f() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 63);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuotedItemUIState(quotedContentSender=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isSelf=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", content=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onClickUIState=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isShowNewDesign=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZIZ() {
        return (this.LLILLL instanceof C0I3V) || !(this.LLILZ instanceof C460520I4c);
    }

    public final int hashCode() {
        IMUser iMUser = this.LL;
        return ((((((((iMUser != null ? iMUser.hashCode() : 0) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode();
    }

    public final boolean equals(Object obj) {
        String uid;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C460810I5f)) {
            return false;
        }
        IMUser iMUser = this.LL;
        String uid2 = null;
        if (iMUser != null) {
            uid = iMUser.getUid();
        } else {
            uid = null;
        }
        C460810I5f c460810I5f = (C460810I5f) obj;
        IMUser iMUser2 = c460810I5f.LL;
        if (iMUser2 != null) {
            uid2 = iMUser2.getUid();
        }
        if (Intrinsics.LJFF(uid, uid2) && this.LLILLJJLI == c460810I5f.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c460810I5f.LLILLL) && Intrinsics.LJFF(this.LLILZ, c460810I5f.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c460810I5f.LLILZIL)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C460810I5f(C0I4Y c0i4y, C0I5T c0i5t, C0I40 c0i40, int i) {
        boolean z;
        C0I40 c0i402 = c0i40;
        C0I5T c0i5t2 = c0i5t;
        C0I4Y c0i4y2 = c0i4y;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this(null, z, (i & 4) != 0 ? C0I4H.LIZ : c0i4y2, (i & 8) != 0 ? C460520I4c.LIZ : c0i5t2, (i & 16) != 0 ? C0I3L.LIZ : c0i402, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C460810I5f(IMUser iMUser, boolean z, C0I4Y<? extends InterfaceC460300I3g> c0i4y, C0I5T c0i5t, C0I40 c0i40, boolean z2) {
        this.LL = iMUser;
        this.LLILLJJLI = z;
        this.LLILLL = c0i4y;
        this.LLILZ = c0i5t;
        this.LLILZIL = c0i40;
        this.LLILZLL = z2;
    }

    public static C460810I5f LIZ(C460810I5f c460810I5f, IMUser iMUser, boolean z, C0I4Y c0i4y, boolean z2, int i) {
        C0I5T c0i5t;
        boolean z3 = z2;
        C0I4Y c0i4y2 = c0i4y;
        boolean z4 = z;
        IMUser iMUser2 = iMUser;
        if ((i & 1) != 0) {
            iMUser2 = c460810I5f.LL;
        }
        if ((i & 2) != 0) {
            z4 = c460810I5f.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c0i4y2 = c460810I5f.LLILLL;
        }
        C0I40 c0i40 = null;
        if ((i & 8) != 0) {
            c0i5t = c460810I5f.LLILZ;
        } else {
            c0i5t = null;
        }
        if ((i & 16) != 0) {
            c0i40 = c460810I5f.LLILZIL;
        }
        if ((i & 32) != 0) {
            z3 = c460810I5f.LLILZLL;
        }
        return new C460810I5f(iMUser2, z4, c0i4y2, c0i5t, c0i40, z3);
    }
}
