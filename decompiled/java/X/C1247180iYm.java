package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247180iYm implements InterfaceC111300bX {
    public final User LL;
    public final EnumC1247210iYp LLILLJJLI;
    public final boolean LLILLL;
    public final String LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1247180iYm)) {
            return false;
        }
        C1247180iYm c1247180iYm = (C1247180iYm) obj;
        return Intrinsics.LJFF(this.LL, c1247180iYm.LL) && this.LLILLJJLI == c1247180iYm.LLILLJJLI && this.LLILLL == c1247180iYm.LLILLL && Intrinsics.LJFF(this.LLILZ, c1247180iYm.LLILZ);
    }

    public final int hashCode() {
        User user = this.LL;
        int iHashCode = (((((user == null ? 0 : user.hashCode()) * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31;
        String str = this.LLILZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RelationListHierarchyData(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMyself=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", pageSource=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1247180iYm(User user, EnumC1247210iYp enumC1247210iYp, boolean z, String str) {
        this.LL = user;
        this.LLILLJJLI = enumC1247210iYp;
        this.LLILLL = z;
        this.LLILZ = str;
    }
}
