package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03IV, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IV implements InterfaceC1755100vm0 {
    public final UserRight LL;

    @Override // X.InterfaceC1755100vm0
    public final String LIZ() {
        return "user_rights";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C03IV) && Intrinsics.LJFF(this.LL, ((C03IV) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeaProductSelectUserRightVOV2(userRight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03IV(UserRight userRight) {
        this.LL = userRight;
    }
}
