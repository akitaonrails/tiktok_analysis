package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.ug.perf.MallLandingPerfConfigModel;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0uRh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1704070uRh {
    public static final MallLandingPerfConfigModel LIZ = new MallLandingPerfConfigModel(Boolean.FALSE, null, null, null, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(328));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(327));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(325));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(326));
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(329));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(330));

    public static boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }

    public static MallLandingPerfConfigModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        MallLandingPerfConfigModel mallLandingPerfConfigModel = LIZ;
        MallLandingPerfConfigModel mallLandingPerfConfigModel2 = (MallLandingPerfConfigModel) settingsManagerLIZLLL.LJIIIIZZ("mall_landing_perf_config", MallLandingPerfConfigModel.class, mallLandingPerfConfigModel);
        return mallLandingPerfConfigModel2 != null ? mallLandingPerfConfigModel2 : mallLandingPerfConfigModel;
    }
}
