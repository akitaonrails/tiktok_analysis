package X;

import com.ss.android.ugc.aweme.friendstab.experiment.FriendsTabTopExperiment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0C8J, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0C8J {
    public static final C0C8J LIZ = new C0C8J();
    public static List<String> LIZIZ;
    public static boolean LIZJ;
    public static final StringBuilder LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C01GW LJI;
    public static final C01GW LJII;
    public static boolean LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static final C01GW LJIIJ;

    static {
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        new ArrayList();
        LIZLLL = new StringBuilder();
        LJ = C452501pT.LIZIZ(new C0C8F());
        LJFF = C452501pT.LIZIZ(new C0C8E());
        LJI = C452501pT.LIZIZ(new C0C8L());
        LJII = C452501pT.LIZIZ(new C0C8I());
        LJIIIZ = C452501pT.LIZIZ(new C0C8G());
        LJIIJ = C452501pT.LIZIZ(new C0C8H());
    }

    public static void LIZ() {
        boolean z;
        C0LAB c0lab = new C0LAB();
        boolean z2 = true;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "enable_explore_feed", true);
        boolean z3 = iLJIJ == 2;
        C1585070rLl c1585070rLl = C1585070rLl.LIZ;
        EnumC1584360rKc enumC1584360rKc = EnumC1584360rKc.EXPLORE;
        c1585070rLl.getClass();
        if (z3 != C1585070rLl.LJFF(enumC1584360rKc, null)) {
            c0lab.LIZ(iLJIJ == 2 ? -1 : 1, "explore_top_has_diff");
            z = true;
        } else {
            c0lab.LIZ(0, "explore_top_has_diff");
            z = false;
        }
        C1606660rua c1606660rua = C1606660rua.LIZIZ;
        boolean z4 = c1606660rua.LJII() && !c1606660rua.LIZ();
        if (z4 != C1585070rLl.LJFF(EnumC1584360rKc.NEARBY, null)) {
            c0lab.LIZ(z4 ? -1 : 1, "nearby_top_has_diff");
            z = true;
        } else {
            c0lab.LIZ(0, "nearby_top_has_diff");
        }
        boolean z5 = ((FriendsTabTopExperiment.FriendsTabTopConfig) C1241804tU.LJ.getValue()).indexOnTop >= 0;
        EnumC1584360rKc enumC1584360rKc2 = EnumC1584360rKc.FRIENDS;
        if (z5 != C1585070rLl.LJFF(enumC1584360rKc2, null)) {
            c0lab.LIZ(z5 ? -1 : 1, "friends_top_has_diff");
            z = true;
        } else {
            c0lab.LIZ(0, "friends_top_has_diff");
        }
        if ((((Number) C1241804tU.LIZJ.getValue()).intValue() >= 0) != C1585070rLl.LIZLLL(c1585070rLl, enumC1584360rKc2)) {
            c0lab.LIZ(z5 ? -1 : 1, "friends_bottom_has_diff");
        } else {
            c0lab.LIZ(0, "friends_bottom_has_diff");
            z2 = z;
        }
        c0lab.LJFF("has_ab_diff", z2);
        C20684815ws.LJIILLIIL("tab_ab_diff_monitor", c0lab.LIZ);
    }
}
