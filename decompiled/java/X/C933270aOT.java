package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;
import tikcast.linkmic.common.MultiGuestSpotExtra;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0aOT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C933270aOT implements InterfaceC951240arS<Object> {
    public final PosIdentity LIZ;
    public final MultiGuestSpotExtra LIZIZ;
    public final User LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C933270aOT)) {
            return false;
        }
        C933270aOT c933270aOT = (C933270aOT) obj;
        return Intrinsics.LJFF(this.LIZ, c933270aOT.LIZ) && Intrinsics.LJFF(this.LIZIZ, c933270aOT.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c933270aOT.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        MultiGuestSpotExtra multiGuestSpotExtra = this.LIZIZ;
        int iHashCode2 = (iHashCode + (multiGuestSpotExtra == null ? 0 : multiGuestSpotExtra.hashCode())) * 31;
        User user = this.LIZJ;
        return iHashCode2 + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchSpotUserInfo(posIdentity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", multiGuestExtra=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", user=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC951240arS
    public final boolean LIZIZ(Object obj) {
        if (obj instanceof C933270aOT) {
            return Intrinsics.LJFF(obj, this);
        }
        return false;
    }

    @Override // X.InterfaceC951240arS
    public final boolean LJII(Object obj) {
        return obj instanceof C933270aOT;
    }

    public C933270aOT(PosIdentity posIdentity, MultiGuestSpotExtra multiGuestSpotExtra, User user) {
        this.LIZ = posIdentity;
        this.LIZIZ = multiGuestSpotExtra;
        this.LIZJ = user;
    }
}
