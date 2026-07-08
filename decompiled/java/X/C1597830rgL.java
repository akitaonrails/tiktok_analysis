package X;

import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.SkylightFollowingUserRedDot;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1597830rgL implements InterfaceC1595940rdI, InterfaceC1595240rcA, InterfaceC1596350rdx, InterfaceC1596280rdq {
    public final FollowingInterestUser LL;
    public final List<FollowingInterestUser> LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public SkylightFollowingUserRedDot LLILZIL;
    public boolean LLILZLL;
    public final long LLIZ;
    public final boolean LLIZLLLIL;

    public C1597830rgL() {
        throw null;
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

    @Override // X.InterfaceC1595240rcA
    public final boolean isSingleUser() {
        return false;
    }

    @Override // X.InterfaceC1596280rdq
    public final void setRankState(int i) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveSkylightDoubleBigAvatarItem(interestUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", interestUsers=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", pos=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", skylightRankState=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", followingFeedRedDot=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", isCache=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", receiveTime=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595240rcA
    public final User getUser() {
        FollowingInterestUser followingInterestUser = this.LL;
        if (followingInterestUser != null) {
            return followingInterestUser.getUser();
        }
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC1595240rcA
    public final String getUid() {
        return C1595950rdJ.LIZ(this);
    }

    @Override // X.InterfaceC1595240rcA
    public final boolean isUnfollow() {
        return C1595950rdJ.LIZIZ(this);
    }

    @Override // X.InterfaceC1596350rdx
    public final boolean LIZ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1595940rdI
    public final SkylightFollowingUserRedDot LJJJI() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1595940rdI
    public final int LJJLIIIJLJLI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1595940rdI
    public final FollowingInterestUser LLIILZL() {
        return this.LL;
    }

    @Override // X.InterfaceC1595940rdI
    public final boolean LLIIZ() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC1595940rdI
    public final List<FollowingInterestUser> LLJJJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1595940rdI
    public final long getReceiveTime() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC1595940rdI
    public final void LJIJ(boolean z) {
        this.LLILZLL = true;
    }

    @Override // X.InterfaceC1595940rdI
    public final void LJJIJIIJI(SkylightFollowingUserRedDot skylightFollowingUserRedDot) {
        this.LLILZIL = skylightFollowingUserRedDot;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1597830rgL)) {
            return false;
        }
        C1597830rgL c1597830rgL = (C1597830rgL) interfaceC1891350zJl;
        if (!Intrinsics.LJFF(this.LL, c1597830rgL.LL) || !Intrinsics.LJFF(this.LLILLJJLI, c1597830rgL.LLILLJJLI) || this.LLILLL != c1597830rgL.LLILLL) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1597830rgL) {
            return Intrinsics.LJFF(((C1597830rgL) interfaceC1891350zJl).LL.getUser().getUid(), this.LL.getUser().getUid());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return areContentsTheSame((InterfaceC1891350zJl) obj);
    }

    public C1597830rgL(FollowingInterestUser followingInterestUser, List list, int i) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.LL = followingInterestUser;
        this.LLILLJJLI = list;
        this.LLILLL = i;
        this.LLILZ = 0;
        this.LLILZIL = null;
        this.LLILZLL = false;
        this.LLIZ = jCurrentTimeMillis;
        this.LLIZLLLIL = true;
    }
}
