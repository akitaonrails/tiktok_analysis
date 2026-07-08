package X;

import com.bytedance.bpea.cert.token.TokenCert;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;

/* JADX INFO: renamed from: X.0hSU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1204840hSU {
    public static final C1204840hSU LIZ = new C1204840hSU();

    public static TokenCert LIZIZ() {
        ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) PluggableExtentionKt.pluggableSpi$default(ILocationBaseServiceForMT.class, false, false, false, 14, null);
        return (iLocationBaseServiceForMT == null || !iLocationBaseServiceForMT.LJIILJJIL()) ? TokenCert.Companion.with("bpea-nearby_roaming_current_region_fetch_permission_for_coarse") : TokenCert.Companion.with("bpea-nearby_roaming_current_region_fetch_permission_for_precise");
    }

    public static TokenCert LIZ() {
        return ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJIILJJIL() ? TokenCert.Companion.with("bpea-nearby_feed_double_column_precise_gps") : TokenCert.Companion.with("bpea-nearby_feed_double_column_coarse_gps");
    }
}
