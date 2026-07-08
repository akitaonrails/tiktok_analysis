package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1043290dFv {
    public static Map LIZ(JSONObject jSONObject) {
        AbstractC1043430dG9 abstractC1043430dG9;
        if (jSONObject != null && jSONObject.length() != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (next != null && jSONObjectOptJSONObject != null) {
                    C1043360dG2 c1043360dG2 = new C1043360dG2();
                    c1043360dG2.LIZ.getClass();
                    c1043360dG2.LIZ.LIZ = jSONObjectOptJSONObject.optString("fileName");
                    jSONObjectOptJSONObject.optString("fileMd5");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optLong("fileSize");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optString("resourceType");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optString("url");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optString("type");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optBoolean("isRedirect");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optString("charset");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optInt("important");
                    c1043360dG2.LIZ.getClass();
                    jSONObjectOptJSONObject.optInt("resourceSource");
                    c1043360dG2.LIZ.getClass();
                    c1043360dG2.LIZ.LIZIZ = jSONObjectOptJSONObject.optJSONObject("respHeader");
                    JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("cacheStrategy");
                    ArrayList arrayList = new ArrayList();
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString = jSONObjectOptJSONObject2.optString("hitStrategy");
                        if (Intrinsics.LJFF("hitStrategy", "hitStrategy")) {
                            if (Intrinsics.LJFF(strOptString, "once")) {
                                abstractC1043430dG9 = new AbstractC1043430dG9() { // from class: X.0dG7
                                    public boolean LIZ;

                                    @Override // X.AbstractC1043430dG9
                                    public final boolean LIZ() {
                                        if (this.LIZ) {
                                            return false;
                                        }
                                        this.LIZ = true;
                                        return true;
                                    }
                                };
                            } else {
                                abstractC1043430dG9 = new AbstractC1043430dG9() { // from class: X.0dG8
                                    @Override // X.AbstractC1043430dG9
                                    public final boolean LIZ() {
                                        return true;
                                    }
                                };
                            }
                        } else {
                            abstractC1043430dG9 = new AbstractC1043430dG9() { // from class: X.0dG6
                                @Override // X.AbstractC1043430dG9
                                public final boolean LIZ() {
                                    return true;
                                }
                            };
                        }
                        arrayList.add(abstractC1043430dG9);
                    }
                    C1043350dG1 c1043350dG1 = c1043360dG2.LIZ;
                    c1043350dG1.LIZJ = arrayList;
                    linkedHashMap.put(next, c1043350dG1);
                }
            }
            return linkedHashMap;
        }
        return null;
    }
}
