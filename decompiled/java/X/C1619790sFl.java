package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: X.0sFl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1619790sFl {
    public static final C1619790sFl LIZ = new C1619790sFl();

    public static Aweme LIZ() {
        Activity activity;
        ISpecActService iSpecActService = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
        if (iSpecActService != null && iSpecActService.LJJLL() != null) {
            ISpecActService iSpecActService2 = (ISpecActService) PluggableExtentionKt.pluggableSpi$default(ISpecActService.class, false, false, false, 14, null);
            if (iSpecActService2 != null) {
                return iSpecActService2.LJJLL();
            }
            return null;
        }
        C089E c089e = new C089E(ActivityStack.getActivityStack());
        while (true) {
            if (!c089e.hasNext()) {
                activity = null;
                break;
            }
            activity = (Activity) c089e.next();
            if (activity instanceof InterfaceC1603190roz) {
                break;
            }
        }
        if (activity instanceof C19EG) {
            return C740740T3w.LJFF((C19EG) activity);
        }
        return null;
    }
}
