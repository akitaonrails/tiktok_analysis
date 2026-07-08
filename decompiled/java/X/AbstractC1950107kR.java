package X;

import com.ss.android.ugc.aweme.deeplink.IDeepLinkService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;

/* JADX INFO: renamed from: X.07kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1950107kR<T> extends AbstractC1950207kS<T> {
    @Override // X.AbstractC1951007ka
    public final void LIZJ() {
        HashMap<String, Object> map = this.LIZJ;
        if (map != null) {
            if (map.containsKey("is_from_notification")) {
                ((Boolean) map.get("is_from_notification")).booleanValue();
            }
            if (map.containsKey("enter_from")) {
                map.get("enter_from");
            }
        }
    }

    @Override // X.AbstractC1951007ka
    public final void LIZIZ() {
        ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJ();
        ((IDeepLinkService) ServiceManager.get().getService(IDeepLinkService.class)).LJJJJZ(2000, LJFF(), "");
    }
}
