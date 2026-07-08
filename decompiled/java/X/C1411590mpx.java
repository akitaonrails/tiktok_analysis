package X;

import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mpx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411590mpx implements InterfaceC20685415wy, InterfaceC495470Jbt {
    public final InterfaceC1631620sYq<String, JSONObject, Map<String, String>, Unit> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1411590mpx(InterfaceC1631620sYq<? super String, ? super JSONObject, ? super Map<String, String>, Unit> interfaceC1631620sYq) {
        this.LIZ = interfaceC1631620sYq;
    }

    @Override // X.InterfaceC20685415wy
    public void onEvent(String str) {
        this.LIZ.invoke(str, null, null);
    }

    @Override // X.InterfaceC20685415wy
    public final void LIZ(String str, Map<String, String> map) {
        this.LIZ.invoke(str, null, map);
    }

    @Override // X.InterfaceC20685415wy
    public final void onEvent(String str, JSONObject jSONObject) {
        this.LIZ.invoke(str, jSONObject, null);
    }
}
