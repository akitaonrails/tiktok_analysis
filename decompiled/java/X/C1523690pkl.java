package X;

import com.ss.android.ugc.aweme.ecommerce.service.IEcomLogEventHandleService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pkl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1523690pkl implements IEcomLogEventHandleService {
    public static final C1523690pkl LIZIZ = new C1523690pkl();
    public final /* synthetic */ IEcomLogEventHandleService LIZ = (IEcomLogEventHandleService) ServiceManager.get().getService(IEcomLogEventHandleService.class);

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEcomLogEventHandleService
    public final void LIZ(String str, JSONObject jSONObject) {
        this.LIZ.LIZ(str, jSONObject);
    }
}
