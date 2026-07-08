package X;

import com.bytedance.helios.network.api.service.INetworkApiService;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0WzD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C841170WzD {
    public final C841010Wyx LIZ;

    public C841170WzD(C841010Wyx c841010Wyx) {
        this.LIZ = c841010Wyx;
    }

    public final void LIZ(Map<String, String> map) {
        INetworkApiService iNetworkApiService;
        C841010Wyx c841010Wyx = this.LIZ;
        C840660WyO c840660WyO = c841010Wyx.LIZIZ;
        if (c840660WyO != null && (iNetworkApiService = c841010Wyx.LIZJ) != null) {
            iNetworkApiService.addHeaders(c840660WyO, map);
        }
    }

    public static void LIZIZ(C841170WzD c841170WzD, List list) {
        INetworkApiService iNetworkApiService;
        C841010Wyx c841010Wyx = c841170WzD.LIZ;
        C840660WyO c840660WyO = c841010Wyx.LIZIZ;
        if (c840660WyO != null && (iNetworkApiService = c841010Wyx.LIZJ) != null) {
            iNetworkApiService.removeHeaders(c840660WyO, list, true);
        }
    }
}
