package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IBusinessPublishService;
import com.ss.android.ugc.aweme.services.IExternalService;

/* JADX INFO: renamed from: X.0Mfk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574300Mfk {
    public static boolean LIZ(Activity activity, String str, boolean z, boolean z2) {
        if (activity == null) {
            return false;
        }
        if (z) {
            ((IExternalService) ServiceManager.get().getService(IExternalService.class)).asyncService(activity, "notification", new C580810MqF(activity, 2));
            return true;
        }
        if (!z2 || TextUtils.isEmpty(str)) {
            return false;
        }
        IBusinessPublishService iBusinessPublishService = (IBusinessPublishService) PluggableExtentionKt.pluggableSpi(IBusinessPublishService.class);
        if (iBusinessPublishService != null) {
            iBusinessPublishService.goDuetWithMovie(str, activity, "notification");
        }
        return true;
    }
}
