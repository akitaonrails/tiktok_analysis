package X;

import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;

/* JADX INFO: renamed from: X.0YvX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C889850YvX {
    public final boolean LIZ;
    public final C05RV LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final FilterTabType LJ;
    public final C889910Yvd LJFF;
    public final Boolean LJI;
    public final boolean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C889850YvX(String str, String str2, FilterTabType filterTabType, boolean z, int i) {
        C05RV c05rvLIZJ;
        String str3 = str2;
        String str4 = str;
        if ((i & 2) != 0) {
            c05rvLIZJ = C889930Yvf.LIZ.LIZJ();
        } else {
            c05rvLIZJ = null;
        }
        this(false, c05rvLIZJ, (i & 4) != 0 ? "notification_page" : str4, (i & 8) != 0 ? null : str3, (i & 16) == 0 ? filterTabType : null, null, null, z);
    }

    public C889850YvX(boolean z, C05RV c05rv, String str, String str2, FilterTabType filterTabType, C889910Yvd c889910Yvd, Boolean bool, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = c05rv;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = filterTabType;
        this.LJFF = c889910Yvd;
        this.LJI = bool;
        this.LJII = z2;
    }

    public static C889850YvX LIZ(C889850YvX c889850YvX, boolean z, C05RV c05rv, String str, String str2, C889910Yvd c889910Yvd, Boolean bool, boolean z2, int i) {
        FilterTabType filterTabType;
        boolean z3 = z2;
        Boolean bool2 = bool;
        C889910Yvd c889910Yvd2 = c889910Yvd;
        String str3 = str2;
        String str4 = str;
        C05RV c05rv2 = c05rv;
        boolean z4 = z;
        if ((i & 1) != 0) {
            z4 = c889850YvX.LIZ;
        }
        if ((i & 2) != 0) {
            c05rv2 = c889850YvX.LIZIZ;
        }
        if ((i & 4) != 0) {
            str4 = c889850YvX.LIZJ;
        }
        if ((i & 8) != 0) {
            str3 = c889850YvX.LIZLLL;
        }
        if ((i & 16) != 0) {
            filterTabType = c889850YvX.LJ;
        } else {
            filterTabType = null;
        }
        if ((i & 32) != 0) {
            c889910Yvd2 = c889850YvX.LJFF;
        }
        if ((i & 64) != 0) {
            bool2 = c889850YvX.LJI;
        }
        if ((i & 128) != 0) {
            z3 = c889850YvX.LJII;
        }
        return new C889850YvX(z4, c05rv2, str4, str3, filterTabType, c889910Yvd2, bool2, z3);
    }
}
