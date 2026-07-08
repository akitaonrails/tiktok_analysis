package X;

import com.ss.android.ugc.localnotify.NUGuideLocalNotifyService;
import com.ss.android.ugc.localnotifyapi.INULocalNotifyApi;

/* JADX INFO: renamed from: X.0VQ4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQ4 implements INULocalNotifyApi {
    public static final C0VQ4 LIZIZ = new C0VQ4();
    public final /* synthetic */ INULocalNotifyApi LIZ;

    @Override // com.ss.android.ugc.localnotifyapi.INULocalNotifyApi
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.localnotifyapi.INULocalNotifyApi
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public C0VQ4() {
        INULocalNotifyApi iNULocalNotifyApi;
        Object objLIZ = C04TD.LIZ(INULocalNotifyApi.class, false);
        if (objLIZ != null) {
            iNULocalNotifyApi = (INULocalNotifyApi) objLIZ;
        } else {
            if (C04TD.A6 == null) {
                synchronized (INULocalNotifyApi.class) {
                    if (C04TD.A6 == null) {
                        C04TD.A6 = new NUGuideLocalNotifyService();
                    }
                }
            }
            iNULocalNotifyApi = C04TD.A6;
        }
        this.LIZ = iNULocalNotifyApi;
    }
}
