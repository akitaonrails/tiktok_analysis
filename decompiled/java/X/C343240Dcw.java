package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dcw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343240Dcw implements InterfaceC1891350zJl {
    public final User LL;
    public final Aweme LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabFeedInvitedPendingItem(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C343240Dcw)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUid(), ((C343240Dcw) interfaceC1891350zJl).LL.getUid());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C343240Dcw)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL.getUid(), ((C343240Dcw) obj).LL.getUid());
    }

    public C343240Dcw(Aweme aweme, User user) {
        this.LL = user;
        this.LLILLJJLI = aweme;
    }
}
