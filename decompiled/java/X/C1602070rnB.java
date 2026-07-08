package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.main.ActivityResourceOptApiImpl;
import com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi;

/* JADX INFO: renamed from: X.0rnB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1602070rnB implements ActivityResourceOptApi {
    public static final C1602070rnB LIZIZ = new C1602070rnB();
    public final /* synthetic */ ActivityResourceOptApi LIZ;

    @Override // com.ss.android.ugc.aweme.performanceopt.api.ActivityResourceOptApi
    public final InterfaceC1602040rn8 LIZ(Activity activity) {
        return this.LIZ.LIZ(activity);
    }

    public C1602070rnB() {
        ActivityResourceOptApi activityResourceOptApi;
        Object objLIZ = C04TD.LIZ(ActivityResourceOptApi.class, false);
        if (objLIZ != null) {
            activityResourceOptApi = (ActivityResourceOptApi) objLIZ;
        } else {
            if (C04TD.c2 == null) {
                synchronized (ActivityResourceOptApi.class) {
                    if (C04TD.c2 == null) {
                        C04TD.c2 = new ActivityResourceOptApiImpl();
                    }
                }
            }
            activityResourceOptApi = C04TD.c2;
        }
        this.LIZ = activityResourceOptApi;
    }
}
