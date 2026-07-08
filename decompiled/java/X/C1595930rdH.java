package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rdH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1595930rdH implements InterfaceC1891350zJl, InterfaceC1595980rdM {
    public final InterfaceC1595940rdI LL;
    public final User LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return this == interfaceC1891350zJl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1595930rdH)) {
            return false;
        }
        C1595930rdH c1595930rdH = (C1595930rdH) obj;
        return Intrinsics.LJFF(this.LL, c1595930rdH.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1595930rdH.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        InterfaceC1595940rdI interfaceC1595940rdI = this.LL;
        int iHashCode = (interfaceC1595940rdI == null ? 0 : interfaceC1595940rdI.hashCode()) * 31;
        User user = this.LLILLJJLI;
        return iHashCode + (user != null ? user.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowingInnerSkylightLiveItem(originLiveItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", followingUser=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1595980rdM
    public final void LIZ(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1595930rdH(InterfaceC1595940rdI interfaceC1595940rdI, User user) {
        this.LL = interfaceC1595940rdI;
        this.LLILLJJLI = user;
    }
}
