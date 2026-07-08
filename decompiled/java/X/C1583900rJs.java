package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.libra.EcShopTabIconConfigSettings;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.offline.mocktime.IMockTimeService;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS213S0000000_24;

/* JADX INFO: renamed from: X.0rJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583900rJs {
    public static final C1583900rJs LIZ = new C1583900rJs();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(759));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(757));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(758));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS213S0000000_24.get$arr$(470));
    public static C1303740k20 LJFF;

    public static EcShopTabIconConfigSettings.TimeRangeModel LIZ(boolean z) {
        List<EcShopTabIconConfigSettings.TimeRangeModel> list;
        Long l;
        if (z) {
            list = ((EcShopTabIconConfigSettings.EcShopTabIconConfigModel) LJ.getValue()).topEffectiveTimeRangeList;
        } else {
            list = ((EcShopTabIconConfigSettings.EcShopTabIconConfigModel) LJ.getValue()).bottomEffectiveTimeRangeList;
        }
        if (list != null) {
            LIZ.getClass();
            IMockTimeService iMockTimeService = (IMockTimeService) PluggableExtentionKt.pluggableSpi$default(IMockTimeService.class, false, false, false, 14, null);
            if (iMockTimeService != null) {
                iMockTimeService.LIZ();
            }
            long jCurrentTimeMillis = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            for (EcShopTabIconConfigSettings.TimeRangeModel timeRangeModel : list) {
                Long l2 = timeRangeModel.startTime;
                if (l2 != null && l2.longValue() <= jCurrentTimeMillis && (l = timeRangeModel.endTime) != null && l.longValue() > jCurrentTimeMillis) {
                    return timeRangeModel;
                }
            }
            return null;
        }
        return null;
    }

    public static Integer LIZIZ(Context context, String str) {
        int iN3 = C786410Ut5.n3(context.getResources(), str, "drawable", context.getPackageName());
        if (iN3 != 0) {
            return Integer.valueOf(iN3);
        }
        return null;
    }

    public static void LIZJ(Context context, long j, Function0 function0) {
        C1303740k20 c1303740k20 = new C1303740k20(j, function0);
        LJFF = c1303740k20;
        if (c1303740k20.LIZLLL > 0) {
            c1303740k20.LIZ(context);
        }
    }
}
