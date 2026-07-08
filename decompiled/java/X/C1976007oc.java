package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastDoubleProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07oc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1976007oc {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static InterfaceC1976507oh LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -652088201:
                if (str.equals("modArray")) {
                    return new InterfaceC1976507oh() { // from class: X.07oe
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            if (objArr != null && objArr.length >= 2) {
                                Object obj = objArr[0];
                                Object obj2 = objArr[1];
                                if ((obj instanceof JSONArray) && (obj2 instanceof Integer)) {
                                    JSONArray jSONArray = (JSONArray) obj;
                                    if (jSONArray.length() > 0) {
                                        return jSONArray.opt(((Integer) obj2).intValue() % jSONArray.length());
                                    }
                                    return null;
                                }
                                return null;
                            }
                            return null;
                        }
                    };
                }
                return null;
            case 3143097:
                if (str.equals("find")) {
                    return new InterfaceC1976507oh() { // from class: X.07oi
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            if (objArr != null && objArr.length >= 2) {
                                String strValueOf = String.valueOf(objArr[0]);
                                if (!TextUtils.isEmpty(strValueOf)) {
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(strValueOf);
                                        String strValueOf2 = String.valueOf(objArr[1]);
                                        if (!TextUtils.isEmpty(strValueOf2)) {
                                            C20701089b c20701089b = new C20701089b(strValueOf2);
                                            HashMap map = new HashMap();
                                            map.put("default_key", jSONObject2);
                                            Object objLIZ = c20701089b.LIZIZ.LIZ(map);
                                            if (TextUtils.isEmpty(String.valueOf(objLIZ))) {
                                                if (objArr.length >= 3) {
                                                    return String.valueOf(objArr[2]);
                                                }
                                                return null;
                                            }
                                            return String.valueOf(objLIZ);
                                        }
                                        return null;
                                    } catch (JSONException e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        return null;
                                    }
                                }
                                return null;
                            }
                            return null;
                        }
                    };
                }
                return null;
            case 94642797:
                if (str.equals("chunk")) {
                    return new InterfaceC1976507oh() { // from class: X.07od
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            if (objArr != null && objArr.length == 2) {
                                String strValueOf = String.valueOf(objArr[0]);
                                JSONArray jSONArray = new JSONArray();
                                try {
                                    JSONArray jSONArray2 = new JSONArray(strValueOf);
                                    int i = CastIntegerProtector.parseInt(String.valueOf(objArr[1]));
                                    for (int i2 = 0; i2 < jSONArray2.length(); i2 += i) {
                                        JSONObject jSONObject2 = new JSONObject();
                                        JSONArray jSONArray3 = new JSONArray();
                                        for (int i3 = 0; i3 < i; i3++) {
                                            int i4 = i2 + i3;
                                            if (i4 < jSONArray2.length()) {
                                                jSONArray3.put(jSONArray2.optJSONObject(i4));
                                            }
                                        }
                                        jSONObject2.put("$chunk", jSONArray3);
                                        jSONArray.put(jSONObject2);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                                return jSONArray;
                            }
                            return null;
                        }
                    };
                }
                return null;
            case 96955127:
                if (str.equals("exist")) {
                    return new InterfaceC1976507oh() { // from class: X.07ob
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            if (objArr != null && objArr.length > 0) {
                                for (Object obj : objArr) {
                                    String strValueOf = String.valueOf(obj);
                                    if (!TextUtils.isEmpty(strValueOf) && !TextUtils.equals(strValueOf, "null")) {
                                        return strValueOf;
                                    }
                                }
                            }
                            return null;
                        }
                    };
                }
                return null;
            case 515198113:
                if (str.equals("decodeUrl")) {
                    return new InterfaceC1976507oh() { // from class: X.07oZ
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            if (objArr == null || objArr.length <= 0) {
                                return null;
                            }
                            String strValueOf = String.valueOf(objArr[0]);
                            if (TextUtils.isEmpty(strValueOf)) {
                                return null;
                            }
                            return Uri.decode(strValueOf);
                        }
                    };
                }
                return null;
            case 1052832078:
                if (str.equals("translate")) {
                    return new InterfaceC1976507oh() { // from class: X.07of
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            JSONObject jSONObjectOptJSONObject;
                            JSONObject jSONObjectOptJSONObject2;
                            if (objArr != null && objArr.length == 0) {
                                String strValueOf = String.valueOf(objArr[2]);
                                String strValueOf2 = String.valueOf(objArr[1]);
                                String strValueOf3 = String.valueOf(objArr[0]);
                                if (TextUtils.isEmpty(strValueOf3) || jSONObject == null || (jSONObjectOptJSONObject = jSONObject.optJSONObject("i18n")) == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(strValueOf2)) == null) {
                                    return strValueOf;
                                }
                                String strOptString = jSONObjectOptJSONObject2.optString(strValueOf3);
                                if (TextUtils.isEmpty(strOptString)) {
                                    return strValueOf;
                                }
                                return strOptString;
                            }
                            return null;
                        }
                    };
                }
                return null;
            case 1508134777:
                if (str.equals("encodeUrl")) {
                    return new InterfaceC1976507oh() { // from class: X.07oa
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            if (objArr == null || objArr.length <= 0) {
                                return null;
                            }
                            String strValueOf = String.valueOf(objArr[0]);
                            if (TextUtils.isEmpty(strValueOf)) {
                                return null;
                            }
                            return Uri.encode(strValueOf);
                        }
                    };
                }
                return null;
            case 2056988195:
                if (str.equals("isDigit")) {
                    return new InterfaceC1976507oh() { // from class: X.07oY
                        @Override // X.InterfaceC1976507oh
                        public final Object LIZ(JSONObject jSONObject, Object[] objArr) {
                            if (objArr != null && objArr.length > 0) {
                                try {
                                    CastDoubleProtector.parseDouble(String.valueOf(objArr[0]));
                                    return Boolean.TRUE;
                                } catch (NumberFormatException e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    return Boolean.FALSE;
                                }
                            }
                            return Boolean.FALSE;
                        }
                    };
                }
                return null;
            default:
                return null;
        }
    }
}
