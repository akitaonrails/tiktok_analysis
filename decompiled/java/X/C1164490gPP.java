package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164490gPP implements InterfaceC1891350zJl {
    public final User LL;
    public final int LLILLJJLI;
    public final String LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164490gPP)) {
            return false;
        }
        C1164490gPP c1164490gPP = (C1164490gPP) obj;
        return Intrinsics.LJFF(this.LL, c1164490gPP.LL) && this.LLILLJJLI == c1164490gPP.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c1164490gPP.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MutualRelationItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", displayName=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        C1164490gPP c1164490gPP;
        User user;
        String uid2 = this.LL.getUid();
        if (!(interfaceC1891350zJl instanceof C1164490gPP) || (c1164490gPP = (C1164490gPP) interfaceC1891350zJl) == null || (user = c1164490gPP.LL) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return Intrinsics.LJFF(uid2, uid);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        String uid;
        C1164490gPP c1164490gPP;
        User user;
        String uid2 = this.LL.getUid();
        if (!(interfaceC1891350zJl instanceof C1164490gPP) || (c1164490gPP = (C1164490gPP) interfaceC1891350zJl) == null || (user = c1164490gPP.LL) == null || (uid = user.getUid()) == null) {
            uid = "";
        }
        return Intrinsics.LJFF(uid2, uid);
    }

    public C1164490gPP(int i, User user, String str) {
        this.LL = user;
        this.LLILLJJLI = i;
        this.LLILLL = str;
    }
}
