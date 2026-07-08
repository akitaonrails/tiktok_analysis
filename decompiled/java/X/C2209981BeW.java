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

/* JADX INFO: renamed from: X.1BeW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209981BeW extends AbstractC2209931BeR {
    public String LLJJJJLIIL;
    public String LLJJL;

    @Override // X.AbstractC2209931BeR
    public final String LJIIIZ() {
        return "event_misc";
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
        jSONObject.put("log_type", this.LLJJL);
        try {
            JSONObject jSONObject2 = new JSONObject(this.LLJJJJLIIL);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject2.get(next);
                if (jSONObject.opt(next) != null) {
                    LJIIIIZZ().LJ(4, this.LLJJIJIL, "misc event exists key already!", new Object[0]);
                }
                jSONObject.put(next, obj);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            LJIIIIZZ().LJIILIIL(4, "parse misc event params failed", e, new Object[0]);
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
        return jSONObject;
    }

    @Override // X.AbstractC2209931BeR
    public final List<String> LJ() {
        List<String> listLJ = super.LJ();
        ArrayList arrayList = new ArrayList(listLJ.size());
        arrayList.addAll(listLJ);
        arrayList.addAll(Arrays.asList("params", "varchar", "log_type", "varchar"));
        return arrayList;
    }

    @Override // X.AbstractC2209931BeR
    public final String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("logType:");
        sbLIZ.append(this.LLJJL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2209931BeR
    public final String LJFF() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC2209931BeR
    public final String LJII() {
        return this.LLJJL;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIIJ(Cursor cursor) {
        super.LJIIJ(cursor);
        this.LLJJJJLIIL = cursor.getString(18);
        this.LLJJL = cursor.getString(19);
    }

    @Override // X.AbstractC2209931BeR
    public final AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LLJJJJLIIL = jSONObject.optString("params", null);
        this.LLJJL = jSONObject.optString("log_type", null);
        return this;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILL(ContentValues contentValues) {
        super.LJIILL(contentValues);
        if (C2210531BfP.LIZ) {
            contentValues.put("params", C2210061Bee.LIZIZ(this.LLJILJILJ, EnumC2176421AFs.LOG_DATA, this.LLJJL, this.LLJJJJLIIL));
        } else {
            contentValues.put("params", this.LLJJJJLIIL);
        }
        contentValues.put("log_type", this.LLJJL);
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILLIIL(JSONObject jSONObject) throws JSONException {
        super.LJIILLIIL(jSONObject);
        jSONObject.put("params", this.LLJJJJLIIL);
        jSONObject.put("log_type", this.LLJJL);
    }

    public C2209981BeW(String str, String str2, JSONObject jSONObject) {
        this.LLJJL = str2;
        this.LLJJJJLIIL = C786410Ut5.J3(jSONObject);
        this.LLJILJILJ = str;
    }
}
