package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209971BeV extends AbstractC2209931BeR {
    public long LLJJJJLIIL;
    public String LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public String LLJLIL;
    public boolean LLJLILLLLZIIL = true;

    @Override // X.AbstractC2209931BeR
    public final String LJII() {
        return "launch";
    }

    @Override // X.AbstractC2209931BeR
    public final String LJIIIZ() {
        return "launch";
    }

    @Override // X.AbstractC2209931BeR
    public final String LJI() {
        return this.LLJJLIIIJLLLLLLLZ ? "bg" : "fg";
    }

    @Override // X.AbstractC2209931BeR
    public final JSONObject LJIJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("local_time_ms", this.LLILLJJLI);
        jSONObject.put("tea_event_index", this.LLILLL);
        jSONObject.put("session_id", this.LLILZ);
        LIZJ(jSONObject);
        if (!TextUtils.isEmpty(this.LLIZ)) {
            jSONObject.put("user_unique_id", this.LLIZ);
        }
        if (this.LLJJLIIIJLLLLLLLZ) {
            jSONObject.put("is_background", true);
        }
        jSONObject.put("datetime", this.LLJILLL);
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            jSONObject.put("ab_sdk_version", this.LLIZLLLIL);
        }
        if (!TextUtils.isEmpty(this.LLJL)) {
            jSONObject.put("uuid_changed", true);
            jSONObject.put("original_session_id", this.LLJL);
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
        if (!TextUtils.isEmpty(this.LLJLIL)) {
            try {
                JSONObject jSONObject2 = new JSONObject(this.LLJLIL);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (jSONObject.has(next)) {
                        LJIIIIZZ().LJ(4, this.LLJJIJIL, "Add params to launch conflict: {} - {}", next, jSONObject2.opt(next));
                    } else {
                        jSONObject.put(next, jSONObject2.opt(next));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIIIZZ().LJIILLIIL(4, this.LLJJIJIL, "Add flat params: {} to launch error", th, this.LLJLIL);
            }
        }
        return jSONObject;
    }

    @Override // X.AbstractC2209931BeR
    public final List<String> LJ() {
        List<String> listLJ = super.LJ();
        ArrayList arrayList = new ArrayList(listLJ.size());
        arrayList.addAll(listLJ);
        arrayList.addAll(Arrays.asList("ver_name", "varchar", "ver_code", "integer", "last_session", "varchar", "is_background", "integer", "flat_params", "varchar", "sendable", "integer"));
        return arrayList;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIIJ(Cursor cursor) {
        boolean z;
        super.LJIIJ(cursor);
        this.LLJJL = cursor.getString(18);
        this.LLJJJJLIIL = cursor.getLong(19);
        this.LLJL = cursor.getString(20);
        boolean z2 = false;
        if (cursor.getInt(21) == 1) {
            z = true;
        } else {
            z = false;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
        this.LLJLIL = cursor.getString(22);
        if (cursor.getInt(23) == 1) {
            z2 = true;
        }
        this.LLJLILLLLZIIL = z2;
    }

    @Override // X.AbstractC2209931BeR
    public final AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "read ipc not implemented", new Object[0]);
        return null;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILL(ContentValues contentValues) {
        super.LJIILL(contentValues);
        contentValues.put("ver_name", this.LLJJL);
        contentValues.put("ver_code", Long.valueOf(this.LLJJJJLIIL));
        contentValues.put("last_session", this.LLJL);
        contentValues.put("is_background", Integer.valueOf(this.LLJJLIIIJLLLLLLLZ ? 1 : 0));
        contentValues.put("flat_params", this.LLJLIL);
        contentValues.put("sendable", Integer.valueOf(this.LLJLILLLLZIIL ? 1 : 0));
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILLIIL(JSONObject jSONObject) {
        LJIIIIZZ().LJIILJJIL(4, this.LLJJIJIL, "write ipc not implemented", new Object[0]);
    }
}
