package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi;
import java.util.List;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.10SR, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10SR {
    public static final C10SR LIZ = new C10SR();

    public static final String LIZ() {
        String strLJ = ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJ();
        if (strLJ == null || strLJ.length() == 0) {
            return null;
        }
        try {
            Uri uri = UriProtector.parse(strLJ);
            if (TextUtils.equals(uri.getScheme(), "onboarding") && TextUtils.equals(uri.getHost(), "tts")) {
                return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ads_group_id");
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static final String LIZIZ() {
        String strLJ = ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJ();
        if (strLJ == null || strLJ.length() == 0) {
            return null;
        }
        try {
            Uri uri = UriProtector.parse(strLJ);
            if (TextUtils.equals(uri.getScheme(), "onboarding") && TextUtils.equals(uri.getHost(), "tts")) {
                return UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "product_ids");
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static final String LIZJ() {
        String strLJ = ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJ();
        if (strLJ == null || strLJ.length() == 0) {
            return null;
        }
        try {
            Uri uri = UriProtector.parse(strLJ);
            if (TextUtils.equals(uri.getScheme(), "onboarding") && TextUtils.equals(uri.getHost(), "tts")) {
                return "ecommerce";
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public static final List<String> LIZLLL() {
        String strLJ = ((IAppsflyerApi) ServiceManager.get().getService(IAppsflyerApi.class)).LJ();
        if (strLJ == null || strLJ.length() == 0) {
            return null;
        }
        try {
            Uri uri = UriProtector.parse(strLJ);
            if (!TextUtils.equals(uri.getScheme(), "onboarding") || !TextUtils.equals(uri.getHost(), "tts")) {
                C189200o6.m2constructorimpl(Unit.LIZ);
                return null;
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "product_ids");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                return a0.LJJLIIIJILLIZJL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, new String[]{","}, 0, 6);
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
