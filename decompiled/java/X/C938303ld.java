package X;

import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.ECOspOrderEventSourceSettings;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03ld, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C938303ld {
    public static final C938303ld LIZ = new C938303ld();
    public static final List<ECOspOrderEventSourceSettings.OSPSourcePageTypeConfig> LIZIZ;
    public static final boolean LIZJ;

    static {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        ECOspOrderEventSourceSettings.ECOspOrderEventSourceConfig eCOspOrderEventSourceConfig = ECOspOrderEventSourceSettings.LIZ;
        ECOspOrderEventSourceSettings.ECOspOrderEventSourceConfig eCOspOrderEventSourceConfig2 = (ECOspOrderEventSourceSettings.ECOspOrderEventSourceConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_publish_order_created_event_source", ECOspOrderEventSourceSettings.ECOspOrderEventSourceConfig.class, eCOspOrderEventSourceConfig);
        if (eCOspOrderEventSourceConfig2 != null) {
            eCOspOrderEventSourceConfig = eCOspOrderEventSourceConfig2;
        }
        LIZIZ = eCOspOrderEventSourceConfig.typeList;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            C1AQS.LIZJ(jElapsedRealtime, 1, IBusinessDependencyService.class.getName(), anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        LIZJ = ((IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin).enableBxgyPageReturn();
    }

    public static boolean LIZ(String str) {
        List<ECOspOrderEventSourceSettings.OSPSourcePageTypeConfig> list;
        if (str == null || str.length() == 0 || (list = LIZIZ) == null || list.isEmpty()) {
            return false;
        }
        Iterator<ECOspOrderEventSourceSettings.OSPSourcePageTypeConfig> it2 = list.iterator();
        while (it2.hasNext()) {
            String str2 = it2.next().name;
            if (str2 != null && a0.LJJIIZI(str2, str, false)) {
                LIZ.getClass();
                if (!Intrinsics.LJFF(str, "buy_x_get_coupon") || LIZJ) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int LIZIZ(String str) {
        List<ECOspOrderEventSourceSettings.OSPSourcePageTypeConfig> list;
        if (str == null || str.length() == 0 || (list = LIZIZ) == null || list.isEmpty()) {
            return 0;
        }
        for (ECOspOrderEventSourceSettings.OSPSourcePageTypeConfig oSPSourcePageTypeConfig : list) {
            String str2 = oSPSourcePageTypeConfig.name;
            if (str2 != null && a0.LJJIIZI(str2, str, false)) {
                Integer num = oSPSourcePageTypeConfig.promotion_activity_type;
                if (num == null) {
                    return 0;
                }
                return num.intValue();
            }
        }
        return 0;
    }
}
