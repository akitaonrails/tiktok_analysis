package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.ss.ttlivestreamer.livestreamv2.tinyjson.JSONArrayTypeAdapter;
import com.ss.ttlivestreamer.livestreamv2.tinyjson.JSONObjectTypeAdapter;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09D3, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09D3 {
    public static Gson LIZ;

    public static e LIZ() {
        JSONObjectTypeAdapter jSONObjectTypeAdapter = new JSONObjectTypeAdapter();
        JSONArrayTypeAdapter jSONArrayTypeAdapter = new JSONArrayTypeAdapter();
        jSONObjectTypeAdapter.LIZ = jSONArrayTypeAdapter;
        jSONArrayTypeAdapter.LIZ = jSONObjectTypeAdapter;
        e eVar = new e();
        eVar.LJIIL = false;
        eVar.LIZJ(jSONObjectTypeAdapter, JSONObject.class);
        eVar.LIZJ(jSONArrayTypeAdapter, JSONArray.class);
        return eVar;
    }
}
