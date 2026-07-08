package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02t3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C729502t3 implements InterfaceC729102sz {
    public final EmailAuthorizationInfo LIZ;

    public C729502t3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C729502t3) && Intrinsics.LJFF(this.LIZ, ((C729502t3) obj).LIZ);
    }

    public final int hashCode() {
        EmailAuthorizationInfo emailAuthorizationInfo = this.LIZ;
        if (emailAuthorizationInfo == null) {
            return 0;
        }
        return emailAuthorizationInfo.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsEmailAuthorizationCompState(emailAuthorizationInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C729502t3(int i) {
        this.LIZ = null;
    }
}
