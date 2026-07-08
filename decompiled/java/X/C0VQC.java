package X;

import com.ss.android.ugc.localnotify.CommonLocalNotifyService;
import com.ss.android.ugc.localnotifyapi.ILocalNotifyApi;

/* JADX INFO: renamed from: X.0VQC, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VQC implements ILocalNotifyApi {
    public static final C0VQC LIZIZ = new C0VQC();
    public final /* synthetic */ ILocalNotifyApi LIZ;

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.localnotifyapi.ILocalNotifyApi
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public C0VQC() {
        ILocalNotifyApi iLocalNotifyApi;
        Object objLIZ = C04TD.LIZ(ILocalNotifyApi.class, false);
        if (objLIZ != null) {
            iLocalNotifyApi = (ILocalNotifyApi) objLIZ;
        } else {
            if (C04TD.z6 == null) {
                synchronized (ILocalNotifyApi.class) {
                    if (C04TD.z6 == null) {
                        C04TD.z6 = new CommonLocalNotifyService();
                    }
                }
            }
            iLocalNotifyApi = C04TD.z6;
        }
        this.LIZ = iLocalNotifyApi;
    }
}
