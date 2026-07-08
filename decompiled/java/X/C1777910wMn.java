package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777910wMn {
    public final User LIZ;
    public final C1777920wMo LIZIZ;
    public final C1777410wLz LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777910wMn)) {
            return false;
        }
        C1777910wMn c1777910wMn = (C1777910wMn) obj;
        return Intrinsics.LJFF(this.LIZ, c1777910wMn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1777910wMn.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1777910wMn.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        C1777920wMo c1777920wMo = this.LIZIZ;
        int iHashCode2 = (iHashCode + (c1777920wMo == null ? 0 : c1777920wMo.hashCode())) * 31;
        C1777410wLz c1777410wLz = this.LIZJ;
        return iHashCode2 + (c1777410wLz != null ? c1777410wLz.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomBarInteractionContext(ownerUser=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", buttonAction=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tracking=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777910wMn(User user, C1777920wMo c1777920wMo, C1777410wLz c1777410wLz) {
        this.LIZ = user;
        this.LIZIZ = c1777920wMo;
        this.LIZJ = c1777410wLz;
    }
}
