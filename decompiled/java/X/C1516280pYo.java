package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1516280pYo {
    public final String LIZ;
    public final Long LIZIZ;

    public final boolean LIZ() {
        return (TextUtils.isEmpty(this.LIZ) || this.LIZIZ == null || System.currentTimeMillis() >= this.LIZIZ.longValue() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) ? false : true;
    }

    public final String toString() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ip", this.LIZ);
        jSONObject.put("validTime", this.LIZIZ);
        return C786410Ut5.J3(jSONObject);
    }

    public C1516280pYo(String str, Long l) {
        this.LIZ = str;
        this.LIZIZ = l;
    }
}
