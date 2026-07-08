package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07pZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1981907pZ {
    public static String LIZ(String str, JSONObject jSONObject) {
        InterfaceC1976507oh interfaceC1976507ohLIZ;
        if (!TextUtils.isEmpty(str) && jSONObject != null) {
            try {
                if (!str.startsWith("${") || !str.endsWith("}") || C1015570cXD.LIZ().LIZLLL == null) {
                    return str;
                }
                String strSubstring = str.substring(2, str.length() - 1);
                C20701089b c20701089b = new C1982007pa(strSubstring).LIZ;
                Object objValueOf = strSubstring;
                if (c20701089b != null) {
                    HashMap map = new HashMap();
                    map.put("default_key", jSONObject);
                    Object objLIZ = c20701089b.LIZIZ.LIZ(map);
                    boolean z = objLIZ instanceof String;
                    objValueOf = objLIZ;
                    if (!z) {
                        if (objLIZ instanceof C1981707pX) {
                            C1981707pX c1981707pX = (C1981707pX) objLIZ;
                            Object objLIZ2 = null;
                            if (c1981707pX != null && (interfaceC1976507ohLIZ = C1976007oc.LIZ(c1981707pX.LIZ)) != null) {
                                objLIZ2 = interfaceC1976507ohLIZ.LIZ(null, c1981707pX.LIZIZ);
                            }
                            objValueOf = String.valueOf(objLIZ2);
                        } else {
                            objValueOf = String.valueOf(objLIZ);
                        }
                    }
                }
                return (String) objValueOf;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return str;
    }
}
