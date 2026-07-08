package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2210011BeZ extends AbstractC2209931BeR {
    public long LLJJJJLIIL;
    public long LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public Integer LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;
    public Integer LLJLL;
    public String LLJLLIL;

    @Override // X.AbstractC2209931BeR
    public final List<String> LJ() {
        return null;
    }

    @Override // X.AbstractC2209931BeR
    public final String LJII() {
        return "terminate";
    }

    @Override // X.AbstractC2209931BeR
    public final String LJIIIZ() {
        return "terminate";
    }

    @Override // X.AbstractC2209931BeR
    public final String LJI() {
        return String.valueOf(this.LLJJJJLIIL);
    }

    @Override // X.AbstractC2209931BeR
    public final JSONObject LJIJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.LLILLJJLI);
        jSONObject.put("tea_event_index", this.LLILLL);
        jSONObject.put("session_id", this.LLILZ);
        jSONObject.put("stop_timestamp", this.LLJJL / 1000);
        jSONObject.put("duration", this.LLJJJJLIIL / 1000);
        jSONObject.put("datetime", this.LLJILLL);
        LIZJ(jSONObject);
        if (!TextUtils.isEmpty(this.LLIZ)) {
            jSONObject.put("user_unique_id", this.LLIZ);
        }
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            jSONObject.put("ab_sdk_version", this.LLIZLLLIL);
        }
        if (!TextUtils.isEmpty(this.LLJJLIIIJLLLLLLLZ)) {
            jSONObject.put("uuid_changed", true);
            if (!TextUtils.equals(this.LLJJLIIIJLLLLLLLZ, this.LLILZ)) {
                jSONObject.put("original_session_id", this.LLJJLIIIJLLLLLLLZ);
            }
        }
        Integer num = this.LLJL;
        if (num != null) {
            jSONObject.put("session_type", num);
        }
        if (!TextUtils.isEmpty(this.LLJLILLLLZIIL)) {
            jSONObject.put("from_session", this.LLJLILLLLZIIL);
        }
        if (!TextUtils.isEmpty(this.LLJLIL)) {
            jSONObject.put("to_session", this.LLJLIL);
        }
        Integer num2 = this.LLJLL;
        if (num2 != null) {
            jSONObject.put("bg_session", num2);
        }
        long j = this.LLJJIII;
        if (j > 0) {
            jSONObject.put("event_id", j);
        }
        long j2 = this.LLJJIJI;
        if (j2 > 0) {
            jSONObject.put("monitor_id", String.valueOf(j2));
        }
        int i = this.LLJJIJIIJIL;
        if (i > 0) {
            jSONObject.put("event_stained", i);
        }
        if (!TextUtils.isEmpty(this.LLJLLIL)) {
            try {
                JSONObject jSONObject2 = new JSONObject(this.LLJLLIL);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jSONObject.has(next)) {
                        LJIIIIZZ().LJ(4, this.LLJJIJIL, "Add flat params to terminate conflict: {} - {}", next, jSONObject2.opt(next));
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ().LJIILLIIL(4, this.LLJJIJIL, "Add params to terminate error", th, new Object[0]);
            }
        }
        return jSONObject;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIIJ(Cursor cursor) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "read db not implemented", new Object[0]);
    }

    @Override // X.AbstractC2209931BeR
    public final AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "read ipc not implemented", new Object[0]);
        return this;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILL(ContentValues contentValues) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "write db not implemented", new Object[0]);
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILLIIL(JSONObject jSONObject) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "write ipc not implemented", new Object[0]);
    }
}
