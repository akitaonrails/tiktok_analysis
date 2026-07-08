package X;

import com.ss.android.ugc.aweme.relation.experiment.FFPAggregateEntranceExpData;
import java.util.List;
import kotlin.jvm.internal.AFwS207S0000000_19;

/* JADX INFO: renamed from: X.0izF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1263590izF {
    public static final FFPAggregateEntranceExpData LIZ = new FFPAggregateEntranceExpData(null, null, null, null, null, 31, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(625));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(627));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(626));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(624));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(623));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(622));

    public static boolean LIZ() {
        return LIZLLL() || LIZIZ() || LIZJ();
    }

    public static boolean LIZIZ() {
        List list;
        return C1251110if7.LIZLLL() && (list = (List) LIZJ.getValue()) != null && list.contains(EnumC1261960iwc.FOLLOWING_LIST.getValue());
    }

    public static boolean LIZJ() {
        List list;
        return C1251110if7.LJ() && (list = (List) LIZJ.getValue()) != null && list.contains(EnumC1261960iwc.FRIEND_LIST.getValue());
    }

    public static boolean LIZLLL() {
        List list;
        return C1251110if7.LIZIZ() && (list = (List) LIZJ.getValue()) != null && list.contains(EnumC1261960iwc.INBOX_PAGE.getValue());
    }
}
