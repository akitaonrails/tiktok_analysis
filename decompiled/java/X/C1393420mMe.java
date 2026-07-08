package X;

import com.ss.android.ugc.aweme.feed.service.IFeedComponentService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0mMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393420mMe {
    public static volatile IFeedComponentService LIZ;

    public static IFeedComponentService LIZIZ() {
        if (LIZ == null) {
            LIZ = (IFeedComponentService) ServiceManager.get().getService(IFeedComponentService.class);
        }
        return LIZ;
    }

    public static InterfaceC1291910jiv LIZ(float f) {
        return LIZIZ().LIZ(f);
    }
}
