package X;

import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1596040rdS implements InterfaceC1594910rbd, InterfaceC1595240rcA {
    public final FollowingInterestUser LL;
    public final int LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC1595240rcA
    public final String getCellType() {
        return "live_event";
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
        return true;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EcLiveEventSkylightItem(interestUser=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pos=");
        sbLIZ.append(this.LLILLJJLI);
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

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1596040rdS)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C1596040rdS) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1596040rdS) {
            return Intrinsics.LJFF(((C1596040rdS) interfaceC1891350zJl).LL.getUser().getUid(), this.LL.getUser().getUid());
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return areContentsTheSame((InterfaceC1891350zJl) obj);
    }

    public C1596040rdS(FollowingInterestUser followingInterestUser, int i) {
        this.LL = followingInterestUser;
        this.LLILLJJLI = i;
    }
}
