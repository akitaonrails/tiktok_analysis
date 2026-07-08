package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W7r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818170W7r extends AbstractC818190W7t {
    public static final /* synthetic */ int LJFF = 0;
    public final Locale LIZ;
    public long LIZIZ;
    public long LIZJ;
    public int LIZLLL;
    public String LJ;

    @Override // X.AbstractC818190W7t
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "patch_event");
        jSONObject.put("code", this.LIZLLL);
        jSONObject.put("locale", this.LIZ);
        jSONObject.put("time", (this.LIZJ - this.LIZIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        jSONObject.put("message", this.LJ);
        return jSONObject;
    }

    @Override // X.AbstractC818190W7t
    public final EnumC818210W7v LIZIZ() {
        return EnumC818210W7v.ResourcePatchMonitor;
    }

    public C818170W7r(Locale locale) {
        this.LIZ = locale;
    }
}
