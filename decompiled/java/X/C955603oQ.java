package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.UserRight;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03oQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C955603oQ implements InterfaceC1755100vm0 {
    public final UserRight LL;
    public final boolean LLILLJJLI = false;

    @Override // X.InterfaceC1755100vm0
    public final String LIZ() {
        return "user_rights";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C955603oQ)) {
            return false;
        }
        C955603oQ c955603oQ = (C955603oQ) obj;
        return Intrinsics.LJFF(this.LL, c955603oQ.LL) && this.LLILLJJLI == c955603oQ.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProductSelectUserRightVO(userRight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", needDivider=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C955603oQ(UserRight userRight) {
        this.LL = userRight;
    }
}
