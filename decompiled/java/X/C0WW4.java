package X;

import com.ss.android.ugc.aweme.api.InAppPreciseUploadApi;
import com.ss.android.ugc.aweme.app.api.Api;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* JADX INFO: renamed from: X.0WW4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WW4 {
    public static final /* synthetic */ C0WW4 LIZ = new C0WW4();

    public static void LIZ(int i) {
        Object objCreate;
        InterfaceC2661011f interfaceC2661011fLIZ = C09S2.LIZLLL().LIZ(Api.LIZ);
        if (interfaceC2661011fLIZ != null) {
            objCreate = interfaceC2661011fLIZ.create(InAppPreciseUploadApi.class);
        } else {
            objCreate = null;
        }
        C0NBH.LIZ(((InAppPreciseUploadApi) objCreate).uploadInAppStatusInner("precise_gps_mode", i)).LJJLL(new C09JN() { // from class: X.0UwP
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InAppPreciseUploadApi$Companion@632b.uploadInAppStatus$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null) {
                    baseResponse.toString();
                }
                C1C7U.LIZIZ("InAppPreciseUploadApi$Companion@632b.uploadInAppStatus$1");
            }
        }, new C09JN() { // from class: X.0UwO
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("InAppPreciseUploadApi$Companion@632b.uploadInAppStatus$2");
                Throwable th = (Throwable) obj;
                if (th != null) {
                    th.toString();
                }
                C1C7U.LIZIZ("InAppPreciseUploadApi$Companion@632b.uploadInAppStatus$2");
            }
        });
    }
}
