package X;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMainService;
import java.util.Set;

/* JADX INFO: renamed from: X.10Xp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19262710Xp {
    public static boolean LIZ() {
        return ((IMainService) ServiceManager.get().getService(IMainService.class)).isAppHot();
    }

    public static boolean LIZIZ(Uri uri) {
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null && queryParameterNames.contains("_t")) {
            return !TextUtils.isEmpty(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_t"));
        }
        return false;
    }

    public static void LIZJ(Uri uri, final String str) {
        final String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        Application applicationLIZ;
        if (TextUtils.equals(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "gd_label"), "retarget") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "toast")) != null && (applicationLIZ = C1BWL.LIZ()) != null) {
            applicationLIZ.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) { // from class: X.0N0G
                public int LL;
                public final String LLILLJJLI;
                public final String LLILLL;

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityDestroyed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityPaused(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityResumed(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStarted(Activity activity) {
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityStopped(Activity activity) {
                }

                {
                    this.LLILLJJLI = str;
                    this.LLILLL = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    Application applicationLIZ2;
                    if (TextUtils.equals(activity.getClass().getName(), this.LLILLJJLI)) {
                        C844470XAv.LIZ.getClass();
                        C1233040iBy c1233040iBy = new C1233040iBy(C844470XAv.LIZ());
                        c1233040iBy.LIZJ(this.LLILLL);
                        c1233040iBy.LIZLLL();
                        Application applicationLIZ3 = C1BWL.LIZ();
                        if (applicationLIZ3 != null) {
                            applicationLIZ3.unregisterActivityLifecycleCallbacks(this);
                            return;
                        }
                        return;
                    }
                    int i = this.LL + 1;
                    this.LL = i;
                    if (i <= 5 || (applicationLIZ2 = C1BWL.LIZ()) == null) {
                        return;
                    }
                    applicationLIZ2.unregisterActivityLifecycleCallbacks(this);
                }
            });
        }
    }
}
