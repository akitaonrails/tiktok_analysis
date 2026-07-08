package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209961BeU extends AbstractC2209931BeR {
    public String LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public String LLJL;
    public long LLJLIL;
    public long LLJLILLLLZIIL;

    @Override // X.AbstractC2209931BeR
    public final String LJIIIZ() {
        return "event";
    }

    @Override // X.AbstractC2209931BeR
    public final JSONObject LJIJ() throws JSONException {
        JSONObject jSONObject = !TextUtils.isEmpty(this.LLJL) ? new JSONObject(this.LLJL) : new JSONObject();
        jSONObject.put("local_time_ms", this.LLILLJJLI);
        jSONObject.put("tea_event_index", this.LLILLL);
        jSONObject.put("session_id", this.LLILZ);
        LIZJ(jSONObject);
        if (this.LLJ != EnumC804620VhM.UNKNOWN.getValue()) {
            jSONObject.put("nt", this.LLJ);
        }
        if (!TextUtils.isEmpty(this.LLIZ)) {
            jSONObject.put("user_unique_id", this.LLIZ);
        }
        jSONObject.put("category", this.LLJJJJLIIL);
        jSONObject.put("tag", this.LLJJL);
        jSONObject.put("value", this.LLJLIL);
        jSONObject.put("ext_value", this.LLJLILLLLZIIL);
        jSONObject.put("label", this.LLJJLIIIJLLLLLLLZ);
        jSONObject.put("datetime", this.LLJILLL);
        if (!TextUtils.isEmpty(this.LLIZLLLIL)) {
            jSONObject.put("ab_sdk_version", this.LLIZLLLIL);
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
        arrayList.addAll(Arrays.asList("category", "varchar", "tag", "varchar", "value", "integer", "ext_value", "integer", "params", "varchar", "label", "varchar"));
        return arrayList;
    }

    @Override // X.AbstractC2209931BeR
    public final String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(this.LLJJL);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2209961BeU() {
    }

    @Override // X.AbstractC2209931BeR
    public final String LJFF() {
        return this.LLJL;
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
        this.LLJLIL = cursor.getLong(20);
        this.LLJLILLLLZIIL = cursor.getLong(21);
        this.LLJL = cursor.getString(22);
        this.LLJJLIIIJLLLLLLLZ = cursor.getString(23);
    }

    @Override // X.AbstractC2209931BeR
    public final AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LLILLL = jSONObject.optLong("tea_event_index", 0L);
        this.LLJJJJLIIL = jSONObject.optString("category", null);
        this.LLJJL = jSONObject.optString("tag", null);
        this.LLJLIL = jSONObject.optLong("value", 0L);
        this.LLJLILLLLZIIL = jSONObject.optLong("ext_value", 0L);
        this.LLJL = jSONObject.optString("params", null);
        this.LLJJLIIIJLLLLLLLZ = jSONObject.optString("label", null);
        return this;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILL(ContentValues contentValues) {
        super.LJIILL(contentValues);
        contentValues.put("category", this.LLJJJJLIIL);
        contentValues.put("tag", this.LLJJL);
        contentValues.put("value", Long.valueOf(this.LLJLIL));
        contentValues.put("ext_value", Long.valueOf(this.LLJLILLLLZIIL));
        if (C2210531BfP.LIZ) {
            contentValues.put("params", C2210061Bee.LIZIZ(this.LLJILJILJ, EnumC2176421AFs.V1_EVENT, this.LLJJL, this.LLJL));
        } else {
            contentValues.put("params", this.LLJL);
        }
        contentValues.put("label", this.LLJJLIIIJLLLLLLLZ);
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILLIIL(JSONObject jSONObject) throws JSONException {
        super.LJIILLIIL(jSONObject);
        jSONObject.put("tea_event_index", this.LLILLL);
        jSONObject.put("category", this.LLJJJJLIIL);
        jSONObject.put("tag", this.LLJJL);
        jSONObject.put("value", this.LLJLIL);
        jSONObject.put("ext_value", this.LLJLILLLLZIIL);
        jSONObject.put("params", this.LLJL);
        jSONObject.put("label", this.LLJJLIIIJLLLLLLLZ);
    }

    public C2209961BeU(String str, String str2, String str3, String str4, long j, long j2, String str5) {
        LJIIL(0L);
        this.LLJJJJLIIL = str2;
        this.LLJJL = str3;
        this.LLJJLIIIJLLLLLLLZ = str4;
        this.LLJLIL = j;
        this.LLJLILLLLZIIL = j2;
        this.LLJL = str5;
        this.LLJILJILJ = str;
    }
}
