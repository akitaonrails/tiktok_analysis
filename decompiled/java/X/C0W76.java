package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.api.IActivityStackService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0W76, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W76 {
    public static final C0W76 LIZ = new C0W76();

    public static final String LIZ() {
        StringBuilder sb = new StringBuilder();
        Activity[] activityStack = ((IActivityStackService) ServiceManager.get().getService(IActivityStackService.class)).getActivityStack();
        int iMin = Math.min(activityStack.length, 10);
        for (int i = 0; i < iMin; i++) {
            if (i > 0) {
                sb.append("\n");
            }
            sb.append(activityStack[i].getClass().getCanonicalName());
        }
        return sb.toString();
    }
}
