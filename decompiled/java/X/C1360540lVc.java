package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.utils.MafVideoLogger;
import com.ss.android.ugc.aweme.util.IMafVideoLogService;

/* JADX INFO: renamed from: X.0lVc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360540lVc implements IMafVideoLogService {
    public static final C1360540lVc LIZIZ = new C1360540lVc();
    public final /* synthetic */ IMafVideoLogService LIZ;

    @Override // com.ss.android.ugc.aweme.util.IMafVideoLogService
    public final Object LIZ(Aweme aweme, Object obj) {
        return this.LIZ.LIZ(aweme, obj);
    }

    public C1360540lVc() {
        IMafVideoLogService iMafVideoLogService;
        Object objLIZ = C04TD.LIZ(IMafVideoLogService.class, false);
        if (objLIZ != null) {
            iMafVideoLogService = (IMafVideoLogService) objLIZ;
        } else {
            if (C04TD.A0 == null) {
                synchronized (IMafVideoLogService.class) {
                    if (C04TD.A0 == null) {
                        C04TD.A0 = new MafVideoLogger();
                    }
                }
            }
            iMafVideoLogService = C04TD.A0;
        }
        this.LIZ = iMafVideoLogService;
    }
}
