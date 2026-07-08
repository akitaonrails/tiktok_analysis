package X;

import com.ss.android.ugc.aweme.account.org.create.OrgAccount;
import com.ss.android.ugc.aweme.account.org.create.OrgInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682570tt1 extends AbstractC1682580tt2 {
    public final OrgInfo LIZ;
    public final List<OrgAccount> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1682570tt1)) {
            return false;
        }
        C1682570tt1 c1682570tt1 = (C1682570tt1) obj;
        return Intrinsics.LJFF(this.LIZ, c1682570tt1.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1682570tt1.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Data(orgInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", accounts=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1682570tt1(OrgInfo orgInfo, List<OrgAccount> list) {
        this.LIZ = orgInfo;
        this.LIZIZ = list;
    }
}
