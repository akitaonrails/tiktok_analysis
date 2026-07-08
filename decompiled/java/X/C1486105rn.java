package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05rn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486105rn implements InterfaceC1891350zJl {
    public final User LL;
    public boolean LLILLJJLI = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1486105rn)) {
            return false;
        }
        C1486105rn c1486105rn = (C1486105rn) obj;
        return Intrinsics.LJFF(this.LL, c1486105rn.LL) && this.LLILLJJLI == c1486105rn.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectRecUserItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", select=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1486105rn(User user) {
        this.LL = user;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1486105rn c1486105rn;
        User user;
        String uid = this.LL.getUid();
        String uid2 = null;
        if ((interfaceC1891350zJl instanceof C1486105rn) && (c1486105rn = (C1486105rn) interfaceC1891350zJl) != null && (user = c1486105rn.LL) != null) {
            uid2 = user.getUid();
        }
        return Intrinsics.LJFF(uid, uid2);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C1486105rn c1486105rn;
        User user;
        String uid = this.LL.getUid();
        String uid2 = null;
        if ((interfaceC1891350zJl instanceof C1486105rn) && (c1486105rn = (C1486105rn) interfaceC1891350zJl) != null && (user = c1486105rn.LL) != null) {
            uid2 = user.getUid();
        }
        return Intrinsics.LJFF(uid, uid2);
    }
}
