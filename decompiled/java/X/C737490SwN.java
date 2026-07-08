package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SwN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737490SwN implements InterfaceC1891350zJl {
    public final User LL;
    public final C737470SwL LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C737490SwN)) {
            return false;
        }
        C737490SwN c737490SwN = (C737490SwN) obj;
        return Intrinsics.LJFF(this.LL, c737490SwN.LL) && Intrinsics.LJFF(this.LLILLJJLI, c737490SwN.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C737470SwL c737470SwL = this.LLILLJJLI;
        return iHashCode + (c737470SwL == null ? 0 : c737470SwL.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FeedTaggedListItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", param=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C737490SwN(User user, C737470SwL c737470SwL) {
        this.LL = user;
        this.LLILLJJLI = c737470SwL;
    }
}
