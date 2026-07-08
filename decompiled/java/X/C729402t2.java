package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.EmailAuthorizationInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02t2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C729402t2 implements InterfaceC729102sz {
    public final EmailAuthorizationInfo LIZ;

    public C729402t2() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C729402t2) && Intrinsics.LJFF(this.LIZ, ((C729402t2) obj).LIZ);
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
        sbLIZ.append("UsCombinedSkuEmailAuthorizationCompState(emailAuthorizationInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C729402t2(int i) {
        this.LIZ = null;
    }
}
