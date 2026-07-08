package X;

import com.bytedance.android.livesdkapi.ws.LiveWsMessage;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2221901Bxk implements InterfaceC1528010prj {
    public C2221861Bxg LIZ;

    @Override // X.InterfaceC1528010prj
    public final void LIZ(LiveWsMessage liveWsMessage) {
        boolean zLJI = MethodIDManager.LJI(71924);
        C2221861Bxg c2221861Bxg = this.LIZ;
        if (c2221861Bxg != null) {
            c2221861Bxg.LIZ(liveWsMessage);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1528010prj
    public final void LIZIZ(EnumC1527990prh enumC1527990prh, JSONObject jSONObject) {
        C2221861Bxg c2221861Bxg = this.LIZ;
        if (c2221861Bxg != null) {
            c2221861Bxg.LIZIZ(enumC1527990prh, jSONObject);
        }
    }
}
