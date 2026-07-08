package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;

/* JADX INFO: renamed from: X.0Qo9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C681430Qo9 {
    public static final C681430Qo9 LIZ = new C681430Qo9();

    public static final boolean LIZ() {
        boolean zLIZ;
        if (C0XQ7.LJFF().LIZ()) {
            return false;
        }
        if (C0XQ7.LJFF().getCurUser().getAccountType() == 3 && !((IMusicPublishBridgeService) ServiceManager.get().getService(IMusicPublishBridgeService.class)).enableBAUserMusicExperienceOpt()) {
            return false;
        }
        boolean z = C681420Qo8.LIZ;
        if (C681420Qo8.LIZ) {
            zLIZ = C681420Qo8.LIZIZ;
        } else {
            zLIZ = C682480Qpq.LIZ().LIZ();
            C681420Qo8.LIZIZ = zLIZ;
        }
        return zLIZ;
    }
}
