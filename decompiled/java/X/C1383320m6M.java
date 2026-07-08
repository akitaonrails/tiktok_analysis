package X;

import com.ss.android.ugc.aweme.commercialize.promote.interfaces.ICommercePromoteService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0m6M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1383320m6M {
    public static final C1383320m6M LIZ = new C1383320m6M();

    public static final boolean LIZIZ() {
        return !C0BJD.LIZ();
    }

    public static final boolean LIZ(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme) && !C289640BWw.LIZ() && !((ICommercePromoteService) ServiceManager.get().getService(ICommercePromoteService.class)).LJJIIJZLJL(aweme)) {
            return true;
        }
        return false;
    }
}
