package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.03fq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C902403fq {
    public static final C902403fq LIZ = new C902403fq();

    public static String LIZ(String str, String str2, Cashier cashier, String str3, int i, String str4) {
        String str5;
        String str6;
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        boolean z;
        Pair[] pairArr = new Pair[6];
        String name = null;
        if (cashier != null) {
            str5 = cashier.merchantUserId;
        } else {
            str5 = null;
        }
        pairArr[0] = new Pair("muid", str5);
        if (cashier != null) {
            str6 = cashier.countryOrRegion;
        } else {
            str6 = null;
        }
        pairArr[1] = new Pair("country_or_region", str6);
        pairArr[2] = new Pair("payment_currency", str3);
        pairArr[3] = new Pair("marketing_info_list", str4);
        pairArr[4] = new Pair("is_stored", Integer.valueOf(i));
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IAppSettingDependencyService.class.getName();
            if (anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
        }
        pairArr[5] = new Pair("language", ((IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin).getAppLanguage());
        return C919503ib.LIZLLL(str, C2097608Jq.LJI(new Pair("url", C919503ib.LIZLLL(str2, C2097608Jq.LJI(pairArr)).toString()))).toString();
    }
}
