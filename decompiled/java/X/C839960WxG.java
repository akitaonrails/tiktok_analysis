package X;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WxG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C839960WxG implements InterfaceC839970WxH {
    public static final C839960WxG LIZ = new C839960WxG();
    public static InterfaceC839970WxH LIZIZ;

    @Override // X.InterfaceC839970WxH
    public final void LIZ(JSONObject jSONObject) {
        InterfaceC839970WxH interfaceC839970WxH = LIZIZ;
        if (interfaceC839970WxH != null) {
            interfaceC839970WxH.LIZ(jSONObject);
        }
    }

    @Override // X.InterfaceC839970WxH
    public final void LIZIZ(Throwable th, Map map) {
        InterfaceC839970WxH interfaceC839970WxH = LIZIZ;
        if (interfaceC839970WxH != null) {
            interfaceC839970WxH.LIZIZ(th, map);
        }
    }
}
