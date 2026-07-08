package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BeX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209991BeX extends AbstractC2209931BeR {
    public long LLJJJJLIIL;
    public String LLJJL;
    public String LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public String LLJLIL;
    public String LLJLILLLLZIIL;

    @Override // X.AbstractC2209931BeR
    public final String LJII() {
        return "";
    }

    @Override // X.AbstractC2209931BeR
    public final String LJIIIZ() {
        return "page";
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
        jSONObject.put("event", "bav2b_page");
        jSONObject.put("is_bav", 1);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("page_key", this.LLJJLIIIJLLLLLLLZ);
        jSONObject2.put("refer_page_key", this.LLJJL);
        jSONObject2.put("is_back", this.LLJL);
        jSONObject2.put("duration", this.LLJJJJLIIL);
        jSONObject.put("params", jSONObject2);
        jSONObject.put("datetime", this.LLJILLL);
        long j = this.LLJJIII;
        if (j > 0) {
            jSONObject.put("event_id", j);
        }
        return jSONObject;
    }

    @Override // X.AbstractC2209931BeR
    public final List<String> LJ() {
        List<String> listLJ = super.LJ();
        ArrayList arrayList = new ArrayList(listLJ.size());
        arrayList.addAll(listLJ);
        arrayList.addAll(Arrays.asList("page_key", "varchar", "refer_page_key", "varchar", "duration", "integer", "is_back", "integer", "last_session", "varchar", "flat_params", "varchar"));
        return arrayList;
    }

    @Override // X.AbstractC2209931BeR
    public final String LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LLJJLIIIJLLLLLLLZ);
        sbLIZ.append(", ");
        sbLIZ.append(this.LLJJJJLIIL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIIJ(Cursor cursor) {
        super.LJIIJ(cursor);
        this.LLJJLIIIJLLLLLLLZ = cursor.getString(18);
        this.LLJJL = cursor.getString(19);
        this.LLJJJJLIIL = cursor.getLong(20);
        this.LLJL = cursor.getInt(21);
        this.LLJLIL = cursor.getString(22);
        this.LLJLILLLLZIIL = cursor.getString(23);
    }

    @Override // X.AbstractC2209931BeR
    public final AbstractC2209931BeR LJIIJJI(JSONObject jSONObject) {
        super.LJIIJJI(jSONObject);
        this.LLJJLIIIJLLLLLLLZ = jSONObject.optString("page_key", null);
        this.LLJJL = jSONObject.optString("refer_page_key", null);
        this.LLJJJJLIIL = jSONObject.optLong("duration", 0L);
        this.LLJL = jSONObject.optInt("is_back", 0);
        return this;
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILL(ContentValues contentValues) {
        super.LJIILL(contentValues);
        contentValues.put("page_key", this.LLJJLIIIJLLLLLLLZ);
        contentValues.put("refer_page_key", this.LLJJL);
        contentValues.put("duration", Long.valueOf(this.LLJJJJLIIL));
        contentValues.put("is_back", Integer.valueOf(this.LLJL));
        contentValues.put("last_session", this.LLJLIL);
        contentValues.put("flat_params", this.LLJLILLLLZIIL);
    }

    @Override // X.AbstractC2209931BeR
    public final void LJIILLIIL(JSONObject jSONObject) throws JSONException {
        super.LJIILLIIL(jSONObject);
        jSONObject.put("page_key", this.LLJJLIIIJLLLLLLLZ);
        jSONObject.put("refer_page_key", this.LLJJL);
        jSONObject.put("duration", this.LLJJJJLIIL);
        jSONObject.put("is_back", this.LLJL);
    }
}
