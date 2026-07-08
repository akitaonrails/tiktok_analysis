package X;

import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0j19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1264770j19 implements InterfaceC111300bX {
    public final User LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final C1722300uv6 LLILZ;
    public final Function0<String> LLILZIL;
    public final Function0<String> LLILZLL;
    public final Function2<C1749280vcc, Exception, Unit> LLIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1264770j19)) {
            return false;
        }
        C1264770j19 c1264770j19 = (C1264770j19) obj;
        return Intrinsics.LJFF(this.LL, c1264770j19.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1264770j19.LLILLJJLI) && this.LLILLL == c1264770j19.LLILLL && Intrinsics.LJFF(this.LLILZ, c1264770j19.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1264770j19.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1264770j19.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c1264770j19.LLIZ);
    }

    public final int hashCode() {
        User user = this.LL;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        String str = this.LLILLJJLI;
        return ((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode()) * 31) + this.LLIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FollowerListHierarchyData(user=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isMyself=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", emptyStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", getEnterFrom=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", getPreviousPage=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", updateErrorViewIfNeeded=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1264770j19(User user, String str, boolean z, C1722300uv6 c1722300uv6, C1264740j16 c1264740j16, C1264530j0l c1264530j0l, C1264730j15 c1264730j15) {
        this.LL = user;
        this.LLILLJJLI = str;
        this.LLILLL = z;
        this.LLILZ = c1722300uv6;
        this.LLILZIL = c1264740j16;
        this.LLILZLL = c1264530j0l;
        this.LLIZ = c1264730j15;
    }
}
