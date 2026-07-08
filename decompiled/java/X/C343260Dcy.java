package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dcy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C343260Dcy implements InterfaceC1891350zJl {
    public final int LL;
    public final User LLILLJJLI;
    public final boolean LLILLL;
    public final Aweme LLILZ;
    public final boolean LLILZIL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CollabFeedInvitedListItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shouldShowPostList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isPending=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C343260Dcy)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI.getUid(), ((C343260Dcy) interfaceC1891350zJl).LLILLJJLI.getUid());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C343260Dcy)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI.getUid(), ((C343260Dcy) obj).LLILLJJLI.getUid());
    }

    public /* synthetic */ C343260Dcy(int i, User user, Aweme aweme, boolean z) {
        this(i, user, false, aweme, z);
    }

    public C343260Dcy(int i, User user, boolean z, Aweme aweme, boolean z2) {
        this.LL = i;
        this.LLILLJJLI = user;
        this.LLILLL = z;
        this.LLILZ = aweme;
        this.LLILZIL = z2;
    }
}
