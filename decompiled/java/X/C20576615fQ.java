package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15fQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20576615fQ {
    public final JSONObject LIZ;
    public final long LIZIZ;
    public final long LIZJ;

    public C20576615fQ(JSONObject jSONObject) {
        this.LIZ = jSONObject;
        Pattern patternCompile = PatternProtector.compile("[0-9]{1,}");
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (patternCompile.matcher(next).matches()) {
                    this.LIZ = jSONObject.optJSONObject(next);
                }
            }
        }
        JSONObject jSONObject2 = this.LIZ;
        if (jSONObject2 != null) {
            long jOptLong = jSONObject2.optLong("StartTime");
            long j = LSPassThroughRecordSizeConfig.DEFAULT;
            this.LIZIZ = jOptLong / j;
            long jOptLong2 = jSONObject2.optLong("EndTime");
            this.LIZJ = jOptLong2 != -2 ? jOptLong2 / j : jOptLong2;
        }
    }
}
