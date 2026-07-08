package X;

import com.bytedance.pia.core.utils.GsonUtils;
import com.google.gson.Gson;
import com.google.gson.a;
import com.google.gson.b;
import com.google.gson.e;
import kotlin.jvm.functions.Function0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09EJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EJ extends C09AY implements Function0<Gson> {
    public C09EJ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Gson invoke() {
        e eVar = new e();
        eVar.LIZJ(GsonUtils.JSONObjectAdapter.LIZ, JSONObject.class);
        eVar.LIZJ(GsonUtils.JSONArrayAdapter.LIZ, JSONArray.class);
        eVar.LJ(new a() { // from class: X.09EH
            @Override // com.google.gson.a
            public final boolean shouldSkipClass(Class<?> cls) {
                return false;
            }

            @Override // com.google.gson.a
            public final boolean shouldSkipField(b bVar) {
                if (bVar.LIZ(C09EI.class) != null) {
                    return true;
                }
                return false;
            }
        });
        eVar.LJI = true;
        return eVar.LIZ();
    }
}
