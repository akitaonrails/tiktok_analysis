package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bCN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C964210bCN extends AbstractC964230bCP {
    public final User LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C964210bCN)) {
            return false;
        }
        C964210bCN c964210bCN = (C964210bCN) obj;
        return Intrinsics.LJFF(this.LIZ, c964210bCN.LIZ) && this.LIZIZ == c964210bCN.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleUser(userInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isHost=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C964210bCN(User user, boolean z) {
        this.LIZ = user;
        this.LIZIZ = z;
    }
}
