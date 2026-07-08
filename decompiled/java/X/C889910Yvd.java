package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yvd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889910Yvd {
    public static final /* synthetic */ int LJII = 0;
    public final FilterTabType LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final Integer LJFF;
    public final Integer LJI;

    public final int hashCode() {
        return Objects.hash(this.LIZ, this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InboxFilterTab(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", titleStr=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showDot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", showNum=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showIcon=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", dmUnreadCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", noticeUnreadCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C889910Yvd)) {
            return false;
        }
        C889910Yvd c889910Yvd = (C889910Yvd) obj;
        if (c889910Yvd.LIZ != this.LIZ || !Intrinsics.LJFF(c889910Yvd.LIZIZ, this.LIZIZ) || !Intrinsics.LJFF(this.LJI, c889910Yvd.LJI) || !Intrinsics.LJFF(this.LJFF, c889910Yvd.LJFF)) {
            return false;
        }
        return true;
    }

    public static C889910Yvd LIZ(C889910Yvd c889910Yvd, Integer num, Integer num2, int i) {
        FilterTabType filterTabType;
        boolean z;
        boolean z2;
        boolean z3;
        Integer num3 = num2;
        Integer num4 = num;
        String str = null;
        if ((i & 1) != 0) {
            filterTabType = c889910Yvd.LIZ;
        } else {
            filterTabType = null;
        }
        if ((i & 2) != 0) {
            str = c889910Yvd.LIZIZ;
        }
        if ((i & 4) != 0) {
            z = c889910Yvd.LIZJ;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            z2 = c889910Yvd.LIZLLL;
        } else {
            z2 = false;
        }
        if ((i & 16) != 0) {
            z3 = c889910Yvd.LJ;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            num4 = c889910Yvd.LJFF;
        }
        if ((i & 64) != 0) {
            num3 = c889910Yvd.LJI;
        }
        return new C889910Yvd(filterTabType, str, z, z2, z3, num4, num3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C889910Yvd(FilterTabType filterTabType, String str, boolean z, boolean z2, Integer num, Integer num2, int i) {
        int iLJI;
        int iLJI2;
        Integer num3 = num;
        boolean z3 = z2;
        boolean z4 = z;
        if ((i & 4) != 0) {
            if (C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && ((iLJI2 = C890110Yvx.LIZIZ.LJI()) == 2 || iLJI2 == 3)) {
                z4 = true;
            } else {
                z4 = false;
            }
        }
        if ((i & 8) != 0) {
            if (C889930Yvf.LIZ.LIZJ() == C05RV.BUSINESS_INBOX && ((iLJI = C890110Yvx.LIZIZ.LJI()) == 2 || iLJI == 3)) {
                z3 = false;
            } else {
                z3 = true;
            }
        }
        boolean z5 = (i & 16) != 0 && ((Number) C0ALB.LIZ.getValue()).intValue() > 0 && filterTabType == FilterTabType.REQUEST;
        Integer num4 = null;
        num3 = (i & 32) != 0 ? null : num3;
        if ((i & 64) != 0) {
            if (C889930Yvf.LIZ.LJI().getFirst() != filterTabType) {
                num4 = 0;
            }
        } else {
            num4 = num2;
        }
        this(filterTabType, str, z4, z3, z5, num3, num4);
    }

    public C889910Yvd(FilterTabType filterTabType, String str, boolean z, boolean z2, boolean z3, Integer num, Integer num2) {
        this.LIZ = filterTabType;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = num;
        this.LJI = num2;
    }
}
