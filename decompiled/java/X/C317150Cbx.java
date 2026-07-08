package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cbx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317150Cbx implements InterfaceC1891350zJl {
    public final User LL;
    public final String LLILLJJLI;
    public final String LLILLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C317150Cbx() {
        this((User) null, (String) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C317150Cbx)) {
            return false;
        }
        C317150Cbx c317150Cbx = (C317150Cbx) obj;
        return Intrinsics.LJFF(this.LL, c317150Cbx.LL) && Intrinsics.LJFF(this.LLILLJJLI, c317150Cbx.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c317150Cbx.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabInviteEditItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fromSearchKeyword=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", userType=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C317150Cbx)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUid(), ((C317150Cbx) interfaceC1891350zJl).LL.getUid());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C317150Cbx(User user, String str, int i) {
        String str2;
        user = (i & 1) != 0 ? new User() : user;
        if ((i & 2) != 0) {
            str2 = "";
        } else {
            str2 = null;
        }
        this(user, str2, (i & 4) != 0 ? "all_user" : str);
    }

    public C317150Cbx(User user, String str, String str2) {
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
    }
}
