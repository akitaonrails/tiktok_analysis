package X;

import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597850rgN implements InterfaceC1595940rdI, InterfaceC1595240rcA, InterfaceC1596350rdx, InterfaceC1596280rdq {
    public SkylightFollowingUserRedDot LL;
    public boolean LLILLJJLI;

    @Override // X.InterfaceC1596350rdx
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1595940rdI
    public final int LJJLIIIJLJLI() {
        return 0;
    }

    @Override // X.InterfaceC1595940rdI
    public final FollowingInterestUser LLIILZL() {
        return null;
    }

    @Override // X.InterfaceC1595940rdI
    public final List<FollowingInterestUser> LLJJJ() {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "live";
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final int getReRankSequence() {
        return -1;
    }

    @Override // X.InterfaceC1595240rcA
    public final Integer getReRankType() {
        return -1;
    }

    @Override // X.InterfaceC1595940rdI
    public final long getReceiveTime() {
        return 0L;
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        return null;
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return false;
    }

    @Override // X.InterfaceC1596280rdq
    public final void setRankState(int i) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveOnlySkylightDoubleBigAvatarItem(interestUser=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", interestUsers=");
        sbLIZ.append((Object) null);
        sbLIZ.append(", pos=");
        sbLIZ.append(0);
        sbLIZ.append(", skylightRankState=");
        sbLIZ.append(0);
        sbLIZ.append(", followingFeedRedDot=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isCache=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", receiveTime=");
        sbLIZ.append(0L);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1595940rdI
    public final SkylightFollowingUserRedDot LJJJI() {
        return this.LL;
    }

    @Override // X.InterfaceC1595940rdI
    public final boolean LLIIZ() {
        return this.LLILLJJLI;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // X.InterfaceC1595940rdI
    public final void LJIJ(boolean z) {
        this.LLILLJJLI = true;
    }

    @Override // X.InterfaceC1595940rdI
    public final void LJJIJIIJI(SkylightFollowingUserRedDot skylightFollowingUserRedDot) {
        this.LL = skylightFollowingUserRedDot;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1597850rgN)) {
            return false;
        }
        interfaceC1891350zJl.getClass();
        if (!Intrinsics.LJFF(null, null)) {
            return false;
        }
        interfaceC1891350zJl.getClass();
        if (!Intrinsics.LJFF(null, null)) {
            return false;
        }
        interfaceC1891350zJl.getClass();
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1597850rgN)) {
            return false;
        }
        interfaceC1891350zJl.getClass();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return areContentsTheSame((InterfaceC1891350zJl) obj);
    }
}
