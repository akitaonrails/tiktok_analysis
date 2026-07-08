package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowRequestData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zZJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1900990zZJ implements InterfaceC1891350zJl, InterfaceC1890700zIi {
    public final FollowRequestData LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;
    public final Function1<FollowRequestData, Unit> LLILZIL;

    public C1900990zZJ() {
        throw null;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowRequestItem(followRequestData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", handleUnread=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPriority=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", onLongCLick=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL.hasRead) + this.LL.user.getUid().hashCode();
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("follow_");
        sbLIZ.append(this.LL.user.getUid());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return new C0ZB9() { // from class: X.0ZBE
        };
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1900990zZJ) {
            C1900990zZJ c1900990zZJ = (C1900990zZJ) interfaceC1891350zJl;
            FollowRequestData followRequestData = c1900990zZJ.LL;
            if (followRequestData.hasRead == this.LL.hasRead && Intrinsics.LJFF(followRequestData.user.getUid(), this.LL.user.getUid()) && c1900990zZJ.LL.user.getFollowStatus() == this.LL.user.getFollowStatus() && c1900990zZJ.LL.user.getFollowerStatus() == this.LL.user.getFollowerStatus() && c1900990zZJ.LL.user.getFriendsStatus() == this.LL.user.getFriendsStatus()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1900990zZJ) && Intrinsics.LJFF(((C1900990zZJ) interfaceC1891350zJl).LL.user.getUid(), this.LL.user.getUid())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1900990zZJ)) {
            return false;
        }
        FollowRequestData followRequestData = ((C1900990zZJ) obj).LL;
        if (followRequestData.hasRead != this.LL.hasRead) {
            return false;
        }
        return Intrinsics.LJFF(followRequestData.user.getUid(), this.LL.user.getUid());
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C1900990zZJ) {
            return C1600110rk1.LIZJ();
        }
        return C1600110rk1.LIZ("unknown");
    }

    public C1900990zZJ(FollowRequestData followRequestData, boolean z, AwS607S0100000_28 awS607S0100000_28) {
        this.LL = followRequestData;
        this.LLILLJJLI = true;
        this.LLILLL = z;
        this.LLILZ = "notification_page";
        this.LLILZIL = awS607S0100000_28;
    }
}
