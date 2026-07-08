package X;

import com.bytedance.globalpayment.iap.common.ability.model.api.entity.JsonName;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wrG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1796800wrG {
    public static Object LIZ(Class cls, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Object objNewInstance = cls.newInstance();
            for (Field field : cls.getFields()) {
                JsonName jsonName = (JsonName) field.getAnnotation(JsonName.class);
                if (jsonName != null) {
                    Object objOpt = jSONObject.opt(jsonName.value());
                    if (objOpt instanceof JSONObject) {
                        field.set(objNewInstance, LIZ(field.getType(), objOpt.toString()));
                    } else if (!(objOpt instanceof JSONArray)) {
                        field.set(objNewInstance, objOpt);
                    }
                }
            }
            return objNewInstance;
        } catch (IllegalAccessException | InstantiationException | JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
