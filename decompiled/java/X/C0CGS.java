package X;

import com.ss.android.ugc.aweme.ecommerce.sec.sensor.IEcomSecEventHandleService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CGS, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CGS implements IEcomSecEventHandleService {
    public static final C0CGS LIZIZ = new C0CGS();
    public final /* synthetic */ IEcomSecEventHandleService LIZ = (IEcomSecEventHandleService) ServiceManager.get().getService(IEcomSecEventHandleService.class);

    @Override // com.ss.android.ugc.aweme.ecommerce.sec.sensor.IEcomSecEventHandleService
    public final void LIZ(String str, JSONObject jSONObject) {
        this.LIZ.LIZ(str, jSONObject);
    }
}
