package X;

import com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService;
import com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusContainer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0NYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C595820NYm extends C09AY implements Function0<ActivityStatusService> {
    public C595820NYm() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.im.activity.status.sdk.api.ActivityStatusService, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final ActivityStatusService invoke() {
        ?? LIZ = C04TD.LIZ(ActivityStatusService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C04TD.S0 == null) {
            synchronized (ActivityStatusService.class) {
                if (C04TD.S0 == null) {
                    C04TD.S0 = new ActivityStatusContainer();
                }
            }
        }
        return C04TD.S0;
    }
}
