package X;

import com.ss.android.ugc.aweme.feed.api.IFeedModuleService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0hZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1209450hZv {
    public static final C1209450hZv LIZ = new C1209450hZv();
    public static volatile IFeedModuleService LIZIZ;

    public static IFeedModuleService LIZ() {
        if (LIZIZ == null) {
            LIZIZ = (IFeedModuleService) ServiceManager.get().getService(IFeedModuleService.class);
        }
        return LIZIZ;
    }

    public static final InterfaceC1209460hZw LIZIZ(C19EG c19eg) {
        LIZ.getClass();
        return LIZ().newTopNoticeFeedManager(c19eg);
    }
}
