package X;

import com.google.gson.h;
import com.google.gson.n;
import com.google.gson.q;
import com.tiktok.ttm.TTMParamData;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMCollectionParam;
import com.tiktok.ttm.ttmparam.TTMDefaultParamData;
import com.tiktok.ttm.ttmparam.TTMGsonJsonArrayParam;
import com.tiktok.ttm.ttmparam.TTMGsonJsonObjectParam;
import com.tiktok.ttm.ttmparam.TTMJSONArrayParam;
import com.tiktok.ttm.ttmparam.TTMJSONObjectParam;
import com.tiktok.ttm.ttmparam.TTMMapParam;
import com.tiktok.ttm.ttmparam.TTMNumberArrayParam;
import com.tiktok.ttm.ttmparam.TTMNumberObjectArrayParam;
import com.tiktok.ttm.ttmparam.TTMNumberParam;
import com.tiktok.ttm.ttmparam.TTMStringArrayParam;
import com.tiktok.ttm.ttmparam.TTMStringParam;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wge, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829660Wge {
    public static ITTMParamData LIZ(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return new TTMMapParam((Map) obj);
        }
        if (obj instanceof List) {
            return new TTMCollectionParam((List<Object>) obj);
        }
        if (obj instanceof Collection) {
            return new TTMCollectionParam((Collection<Object>) obj);
        }
        if (obj instanceof String) {
            return new TTMStringParam((String) obj);
        }
        if (obj instanceof Number) {
            return new TTMNumberParam((Number) obj);
        }
        if (obj instanceof JSONObject) {
            return new TTMJSONObjectParam((JSONObject) obj);
        }
        if (obj instanceof JSONArray) {
            return new TTMJSONArrayParam((JSONArray) obj);
        }
        if (obj instanceof String[]) {
            return new TTMStringArrayParam((String[]) obj);
        }
        if (obj instanceof ITTMParamData) {
            return (ITTMParamData) obj;
        }
        if (obj instanceof TTMParamData) {
            return ((TTMParamData) obj).getActualParamData();
        }
        if (obj instanceof Number[]) {
            return new TTMNumberObjectArrayParam((Number[]) obj);
        }
        if (obj instanceof n) {
            return new TTMGsonJsonObjectParam((n) obj);
        }
        if (obj instanceof h) {
            return new TTMGsonJsonArrayParam((h) obj);
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            Object obj2 = qVar.LL;
            if (obj2 instanceof Boolean) {
                return new TTMNumberParam(qVar.LJ() ? 1 : 0);
            }
            if (obj2 instanceof Number) {
                return new TTMNumberParam(qVar.LJIJ().longValue());
            }
            if (obj2 instanceof String) {
                return new TTMStringParam(qVar.LJIL());
            }
        }
        if (obj instanceof Boolean) {
            return new TTMNumberParam((Boolean) obj);
        }
        if (obj instanceof int[]) {
            return new TTMNumberArrayParam((int[]) obj);
        }
        if (obj instanceof long[]) {
            return new TTMNumberArrayParam((long[]) obj);
        }
        if (obj instanceof float[]) {
            return new TTMNumberArrayParam((float[]) obj);
        }
        if (obj instanceof double[]) {
            return new TTMNumberArrayParam((double[]) obj);
        }
        return new TTMDefaultParamData(obj);
    }

    public static TTMJSONObjectParam LIZIZ(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new TTMJSONObjectParam(jSONObject);
    }
}
