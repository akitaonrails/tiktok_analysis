package X;

import com.tiktok.ttm.ttmparam.ITTMParamData;
import com.tiktok.ttm.ttmparam.TTMJSONObjectParam;
import com.tiktok.ttm.ttmparam.TTMStringParam;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wgk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C829720Wgk extends TTMJSONObjectParam implements InterfaceC829710Wgj {
    public final String LIZIZ;
    public final JSONObject LIZJ;
    public ITTMParamData LIZLLL;
    public JSONObject LJ;

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final boolean addValue(String str, int i, Object obj) {
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean removeValue(String str, int i) {
        return false;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean replaceValue(String str, int i, Object obj) {
        return false;
    }

    @Override // X.InterfaceC829710Wgj
    /* JADX INFO: renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public C829720Wgk LIZIZ() {
        return new C829720Wgk(this.LIZIZ, this.LIZJ);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public String[] getDictKeys() {
        JSONObject jSONObject = this.LIZJ;
        int i = 2;
        String[] strArr = new String[(jSONObject != null ? jSONObject.length() : 0) + 2];
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        strArr[0] = "al_event_key";
        c829700Wgi.getClass();
        strArr[1] = "custom_param_key";
        JSONObject jSONObject2 = this.LIZJ;
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                strArr[i] = itKeys.next();
                i++;
            }
        }
        return strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final String[] getDictStringValuesImmediate() throws JSONException {
        JSONObject jSONObject = this.LIZJ;
        int i = 1;
        String[] strArr = new String[(jSONObject != null ? jSONObject.length() : 0) + 1];
        strArr[0] = this.LIZIZ;
        JSONObject jSONObject2 = this.LIZJ;
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                Object obj = this.LIZJ.get(itKeys.next());
                if (obj instanceof String) {
                    strArr[i] = obj;
                    i++;
                } else {
                    strArr[i] = 0;
                    i++;
                }
            }
        }
        return strArr;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final Object[] getDictValuesImmediate() {
        JSONObject jSONObject = this.LIZJ;
        Object[] objArr = new Object[(jSONObject != null ? jSONObject.length() : 0) + 1];
        objArr[0] = this.LIZIZ;
        JSONObject jSONObject2 = this.LIZJ;
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            objArr[1] = this.LIZIZ;
            int i = 2;
            while (itKeys.hasNext()) {
                objArr[i] = this.LIZJ.get(itKeys.next());
                i++;
            }
        }
        return objArr;
    }

    public static JSONObject LJ(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                jSONObject2.put(next, LJ((JSONObject) obj));
            } else {
                jSONObject2.put(next, obj);
            }
        }
        return jSONObject2;
    }

    @Override // X.InterfaceC829710Wgj
    public final boolean LIZ(Set<String> set) {
        if (!set.isEmpty() && !C13LP.LJJJJ(this.LIZIZ, set)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC829710Wgj
    public final void LIZJ(ITTMParamData iTTMParamData) {
        this.LIZLLL = iTTMParamData;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public boolean containsKey(String str) {
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        if (!Intrinsics.LJFF(str, "custom_param_key")) {
            c829700Wgi.getClass();
            if (!Intrinsics.LJFF(str, "al_event_key")) {
                return super.containsKey(str);
            }
            return true;
        }
        return true;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public double[] getAllDoubleValue(String str) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData == null) {
                    return null;
                }
                return iTTMParamData.getAllDoubleValue(null);
            }
        }
        return super.getAllDoubleValue(str);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public long[] getAllIntValue(String str) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData == null) {
                    return null;
                }
                return iTTMParamData.getAllIntValue(null);
            }
        }
        return super.getAllIntValue(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String[] getAllStringValue(java.lang.String r8) throws org.json.JSONException {
        /*
            r7 = this;
            org.json.JSONObject r0 = r7.LIZJ
            r5 = 0
            r6 = 1
            if (r0 == 0) goto L55
            com.tiktok.ttm.ttmparam.ITTMParamData r0 = r7.LIZLLL
            r1 = 0
            if (r0 == 0) goto L23
            X.0Wgi r0 = X.InterfaceC829710Wgj.LIZ
            r0.getClass()
            java.lang.String r0 = "custom_param_key"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r8, r0)
            if (r0 == 0) goto L23
            com.tiktok.ttm.ttmparam.ITTMParamData r0 = r7.LIZLLL
            if (r0 != 0) goto L3a
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = r7.LIZIZ
            r1[r5] = r0
            return r1
        L23:
            if (r8 == 0) goto L38
            org.json.JSONObject r0 = r7.LIZJ
            java.lang.Object r0 = r0.get(r8)
        L2b:
            com.tiktok.ttm.ttmparam.ITTMParamData r0 = X.C829660Wge.LIZ(r0)
            if (r0 != 0) goto L3a
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = r7.LIZIZ
            r1[r5] = r0
            return r1
        L38:
            r0 = r1
            goto L2b
        L3a:
            java.lang.String[] r4 = r0.getAllStringValue(r1)
            int r0 = r4.length
            int r0 = r0 + 1
            java.lang.String[] r3 = new java.lang.String[r0]
            java.lang.String r0 = r7.LIZIZ
            r3[r5] = r0
            int r2 = r4.length
        L48:
            if (r5 >= r2) goto L54
            r1 = r4[r5]
            int r0 = r6 + 1
            r3[r6] = r1
            int r5 = r5 + 1
            r6 = r0
            goto L48
        L54:
            return r3
        L55:
            java.lang.String[] r1 = new java.lang.String[r6]
            java.lang.String r0 = r7.LIZIZ
            r1[r5] = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C829720Wgk.getAllStringValue(java.lang.String):java.lang.String[]");
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public ITTMParamData getObjectItem(String str) {
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        if (Intrinsics.LJFF(str, "al_event_key")) {
            return new TTMStringParam(this.LIZIZ);
        }
        if (this.LIZLLL != null) {
            c829700Wgi.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                return this.LIZLLL;
            }
        }
        return super.getObjectItem(str);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public void removeData(String str) throws JSONException {
        Object inputData;
        JSONObject jSONObject;
        if (this.LJ == null && (jSONObject = this.LIZJ) != null) {
            this.LJ = LJ(jSONObject);
        }
        JSONObject jSONObject2 = this.LJ;
        if (jSONObject2 != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            jSONObject2.put("al_event_key", this.LIZIZ);
        }
        JSONObject jSONObject3 = this.LJ;
        if (jSONObject3 != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            ITTMParamData iTTMParamData = this.LIZLLL;
            if (iTTMParamData != null) {
                inputData = iTTMParamData.getInputData();
            } else {
                inputData = null;
            }
            jSONObject3.put("custom_param_key", inputData);
        }
        JSONObject jSONObject4 = this.LJ;
        if (jSONObject4 != null) {
            jSONObject4.remove(str);
        }
    }

    public C829720Wgk(String str, JSONObject jSONObject) {
        super(jSONObject);
        this.LIZIZ = str;
        this.LIZJ = jSONObject;
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final double getDoubleValue(String str, int i) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData != null) {
                    return iTTMParamData.getDoubleValue(str, i);
                }
                return Double.MAX_VALUE;
            }
        }
        return super.getDoubleValue(str, i);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public final long getIntValue(String str, int i) {
        if (this.LIZLLL != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData != null) {
                    return iTTMParamData.getIntValue(str, i);
                }
                return Long.MAX_VALUE;
            }
        }
        return super.getIntValue(str, i);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public String getStringValue(String str, int i) {
        C829700Wgi c829700Wgi = InterfaceC829710Wgj.LIZ;
        c829700Wgi.getClass();
        if (Intrinsics.LJFF(str, "al_event_key")) {
            return this.LIZIZ;
        }
        if (this.LIZLLL != null) {
            c829700Wgi.getClass();
            if (Intrinsics.LJFF(str, "custom_param_key")) {
                ITTMParamData iTTMParamData = this.LIZLLL;
                if (iTTMParamData != null) {
                    return iTTMParamData.getStringValue(str, i);
                }
                return null;
            }
        }
        return super.getStringValue(str, i);
    }

    @Override // com.tiktok.ttm.ttmparam.TTMJSONObjectParam, com.tiktok.ttm.ttmparam.ITTMParamData
    public void mergeDataAsSubData(String str, ITTMParamData iTTMParamData) throws JSONException {
        JSONObject jSONObject;
        Object inputData;
        JSONObject jSONObject2;
        if (this.LJ == null && (jSONObject2 = this.LIZJ) != null) {
            this.LJ = LJ(jSONObject2);
        }
        JSONObject jSONObject3 = this.LJ;
        if (jSONObject3 != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            jSONObject3.put("al_event_key", this.LIZIZ);
        }
        JSONObject jSONObject4 = this.LJ;
        if (jSONObject4 != null) {
            InterfaceC829710Wgj.LIZ.getClass();
            ITTMParamData iTTMParamData2 = this.LIZLLL;
            if (iTTMParamData2 != null) {
                inputData = iTTMParamData2.getInputData();
            } else {
                inputData = null;
            }
            jSONObject4.put("custom_param_key", inputData);
        }
        if (str != null && iTTMParamData != null && (jSONObject = this.LJ) != null) {
            jSONObject.put(str, iTTMParamData.getInputData());
        }
    }
}
