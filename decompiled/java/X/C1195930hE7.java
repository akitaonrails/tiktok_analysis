package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* JADX INFO: renamed from: X.0hE7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195930hE7 {
    public static final TokenCert LIZ() {
        return ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL() ? TokenCert.Companion.with("bpea-poi_detail_auto_for_precise") : TokenCert.Companion.with("bpea-poi_detail_auto");
    }

    public static final TokenCert LIZIZ(boolean z) {
        if (z) {
            return TokenCert.Companion.with("bpea-poi-detail-precise-manual_popup_android");
        }
        return TokenCert.Companion.with("bpea-poi-detail-precise-auto_popup_android");
    }
}
