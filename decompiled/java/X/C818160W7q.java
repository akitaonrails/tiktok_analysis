package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0W7q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C818160W7q extends AbstractC818190W7t {
    public static final /* synthetic */ int LJIIJ = 0;
    public final Locale LIZ;
    public long LIZIZ;
    public long LIZLLL;
    public long LJ;
    public long LJFF;
    public long LJI;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public String LIZJ = "";
    public boolean LJII = true;

    @Override // X.AbstractC818190W7t
    public final JSONObject LIZ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "manager_event");
        jSONObject.put("message", this.LIZJ);
        jSONObject.put("code", this.LJIIIIZZ);
        jSONObject.put("locale", this.LIZ);
        long j = this.LIZLLL - this.LIZIZ;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        jSONObject.put("time", j / j2);
        jSONObject.put("load_other_time", (this.LJFF - this.LJ) / j2);
        jSONObject.put("load_default_time", this.LJI);
        jSONObject.put("load_default_from_init", this.LJII);
        jSONObject.put("release_build", this.LJIIIZ);
        return jSONObject;
    }

    @Override // X.AbstractC818190W7t
    public final EnumC818210W7v LIZIZ() {
        return EnumC818210W7v.RewordManagerMonitor;
    }

    public C818160W7q(Locale locale) {
        this.LIZ = locale;
    }
}
