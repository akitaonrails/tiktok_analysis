package X;

import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fFQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1119860fFQ implements InterfaceC1119910fFV {
    public static final void LIZ(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        C1CC3 c1cc3MN2;
        ILoggerService iLoggerService = (ILoggerService) C1161920gLG.LIZJ(ILoggerService.class);
        if (iLoggerService == null || (c1cc3MN2 = iLoggerService.MN2()) == null) {
            return;
        }
        c1cc3MN2.LJIL("notify_component", str, jSONObject, jSONObject2, jSONObject3);
    }
}
