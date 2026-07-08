package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XGd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845850XGd {
    public static void LIZ(Context context, String str, String str2, JSONObject jSONObject) {
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C01VA(jSONObject, ((INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)).getEffectiveConnectionType(), C10ZL.LIZ(str2), str, context, null), 2);
    }
}
