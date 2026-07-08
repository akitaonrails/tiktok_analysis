package X;

import com.ss.android.ugc.aweme.ab.EcSearchDiversionSaleIntentFilterConfigModel;
import java.util.List;
import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0wAZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1770330wAZ {
    public static final EcSearchDiversionSaleIntentFilterConfigModel LIZ = new EcSearchDiversionSaleIntentFilterConfigModel(0, null, 0, 0, 0, 31, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(800));
    public static final boolean LIZJ;
    public static final List<String> LIZLLL;
    public static final boolean LJ;
    public static final int LJFF;
    public static final boolean LJI;

    static {
        LIZJ = LIZ().enable == 1;
        LIZLLL = LIZ().enterFromFilter;
        LJ = LIZ().disableTttFilter == 1;
        LJFF = LIZ().saleIntentFilter;
        LJI = LIZ().enableDevSaleIntent == 1;
    }

    public static EcSearchDiversionSaleIntentFilterConfigModel LIZ() {
        return (EcSearchDiversionSaleIntentFilterConfigModel) LIZIZ.getValue();
    }
}
