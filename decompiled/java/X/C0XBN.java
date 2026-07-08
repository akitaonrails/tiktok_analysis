package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XBN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XBN implements Cloneable {
    public String LL = "";
    public String LLILLJJLI = "";
    public String LLILLL;
    public String LLILZ;
    public String LLILZIL;

    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final C0XBN clone() {
        try {
            return (C0XBN) super.clone();
        } catch (CloneNotSupportedException e) {
            TryCatchGuardChecker.doCheck(e);
            C844830XCf.LIZJ("clone error", e);
            return null;
        }
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{d='");
        sbLIZ.append(this.LL);
        sbLIZ.append('\'');
        sbLIZ.append(", i='");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append('\'');
        sbLIZ.append(", o='");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append('\'');
        sbLIZ.append(", c='");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append('\'');
        sbLIZ.append(", s='");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append('\'');
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C0XBN LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            C0XBN c0xbn = new C0XBN();
            c0xbn.LL = jSONObject.optString("did", "");
            c0xbn.LLILLJJLI = jSONObject.optString("iid", "");
            c0xbn.LLILLL = jSONObject.optString("openudid", "");
            c0xbn.LLILZ = jSONObject.optString("cliend_udid", "");
            c0xbn.LLILZIL = jSONObject.optString("ssid", "");
            return c0xbn;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
