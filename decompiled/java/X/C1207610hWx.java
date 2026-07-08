package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* JADX INFO: renamed from: X.0hWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207610hWx {
    public static final C1207610hWx LIZ = new C1207610hWx();

    public static final TokenCert LIZ() {
        return ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL() ? TokenCert.Companion.with("bpea-fyp_GPS_permission_dialog_for_precise") : TokenCert.Companion.with("bpea-fyp_GPS_permission_dialog");
    }
}
