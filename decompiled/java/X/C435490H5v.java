package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;

/* JADX INFO: renamed from: X.0H5v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C435490H5v {
    public static final /* synthetic */ C435490H5v LIZ = new C435490H5v();

    public static void LIZ() {
        LocalTestApi localTestApi = (LocalTestApi) PluggableExtentionKt.pluggableSpi$default(LocalTestApi.class, false, false, false, 14, null);
        if (localTestApi != null) {
            localTestApi.getSearchAutoTestService();
        }
    }
}
