package X;

import android.database.Cursor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VO9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VO9 {
    public final Map<String, C0VOB> LIZ;

    public C0VO9() {
        HashMap map = new HashMap();
        this.LIZ = map;
        map.put("strategy_log", new C0VOB() { // from class: X.0VOA
            @Override // X.C0VOB
            public final JSONObject LIZ(Cursor cursor) {
                JSONObject jSONObject = new JSONObject();
                try {
                    int columnIndex = cursor.getColumnIndex("strategy_key");
                    if (columnIndex >= 0) {
                        jSONObject.put("strategy_key", cursor.getString(columnIndex));
                        if (cursor.getColumnIndex("count") >= 0) {
                            jSONObject.put("count", cursor.getFloat(r0));
                        } else {
                            jSONObject.put("count", 0);
                        }
                        if (cursor.getColumnIndex("value_index") >= 0) {
                            jSONObject.put("value_index", cursor.getFloat(r0));
                        } else {
                            jSONObject.put("value_index", 0);
                        }
                        if (cursor.getColumnIndex("cost_time") >= 0) {
                            jSONObject.put("cost_time", cursor.getFloat(r0));
                        } else {
                            jSONObject.put("cost_time", 0);
                        }
                        if (cursor.getColumnIndex("mode") >= 0) {
                            jSONObject.put("mode", cursor.getFloat(r0));
                        } else {
                            jSONObject.put("mode", 0);
                        }
                        if (cursor.getColumnIndex("libraid") >= 0) {
                            jSONObject.put("libraid", cursor.getFloat(r0));
                        } else {
                            jSONObject.put("libraid", 0);
                        }
                        if (cursor.getColumnIndex("strategy_version") >= 0) {
                            jSONObject.put("strategy_version", cursor.getFloat(r0));
                        } else {
                            jSONObject.put("strategy_version", 0);
                        }
                        int columnIndex2 = cursor.getColumnIndex("logid");
                        if (columnIndex2 >= 0) {
                            jSONObject.put("logid", cursor.getString(columnIndex2));
                            return jSONObject;
                        }
                        jSONObject.put("logid", "");
                        return jSONObject;
                    }
                    return jSONObject;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return jSONObject;
                }
            }
        });
        map.put("feature", new C0VOB() { // from class: X.0VO8
            @Override // X.C0VOB
            public final JSONObject LIZ(Cursor cursor) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("feature", cursor.getString(cursor.getColumnIndex("feature")));
                    jSONObject.put("number", cursor.getDouble(cursor.getColumnIndex("number")));
                    jSONObject.put("string", cursor.getString(cursor.getColumnIndex("string")));
                    jSONObject.put("time", cursor.getLong(cursor.getColumnIndex("time")));
                    return jSONObject;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    return jSONObject;
                }
            }
        });
    }
}
