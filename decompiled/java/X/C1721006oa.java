package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06oa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1721006oa implements InterfaceC111300bX {
    public final IMUser LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1721006oa)) {
            return false;
        }
        C1721006oa c1721006oa = (C1721006oa) obj;
        return Intrinsics.LJFF(this.LL, c1721006oa.LL) && this.LLILLJJLI == c1721006oa.LLILLJJLI && this.LLILLL == c1721006oa.LLILLL;
    }

    public final int hashCode() {
        IMUser iMUser = this.LL;
        return ((((iMUser == null ? 0 : iMUser.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleDetailHierarchyData(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isStranger=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isAuthorSupporter=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1721006oa(IMUser iMUser, boolean z, boolean z2) {
        this.LL = iMUser;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
