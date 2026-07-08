package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IMainService;

/* JADX INFO: renamed from: X.083R, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C083R {
    public static final Class<? extends Activity> LIZ() {
        Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IMainService.class, false, false, false, 14, null);
        if (objPluggableSpi$default != null) {
            return ((IMainService) objPluggableSpi$default).getMainActivityClass();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
