package X;

import android.os.Build;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03l0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C934403l0 implements InterfaceC934103kx {
    public final InterfaceC932603ki LIZ;

    public C934403l0(InterfaceC932603ki interfaceC932603ki) {
        this.LIZ = interfaceC932603ki;
    }

    @Override // X.InterfaceC934103kx
    public void onEvent(String str) {
        JSONObject jSONObject = new JSONObject();
        InterfaceC932603ki interfaceC932603ki = this.LIZ;
        if (interfaceC932603ki == null) {
            AppLogNewUtils.onEventV3(str, jSONObject);
        } else {
            interfaceC932603ki.onEvent(str, jSONObject);
        }
    }

    public final void LIZ(C934203ky c934203ky, C934303kz c934303kz) throws JSONException {
        String str;
        String str2;
        if (c934203ky.LIZ.length() == 0) {
            throw new RuntimeException("SDK id is Empty");
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdk_aid", c934203ky.LIZ);
        jSONObject.put("sdk_version", c934203ky.LIZIZ);
        String str3 = "";
        if (c934303kz == null || (str = c934303kz.LIZ) == null) {
            str = "";
        }
        jSONObject.put("app_version", str);
        if (c934303kz != null && (str2 = c934303kz.LIZIZ) != null) {
            str3 = str2;
        }
        jSONObject.put("update_version_code", str3);
        jSONObject.put("os_version", Build.VERSION.RELEASE);
        InterfaceC932603ki interfaceC932603ki = this.LIZ;
        if (interfaceC932603ki == null) {
            AppLogNewUtils.onEventV3("sdk_session_launch", jSONObject);
        } else {
            interfaceC932603ki.onEvent("sdk_session_launch", jSONObject);
        }
    }
}
