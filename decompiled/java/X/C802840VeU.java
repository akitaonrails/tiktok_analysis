package X;

import android.text.TextUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VeU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C802840VeU {
    public final Map<String, C803520Vfa> LIZ;
    public final JSONObject LIZIZ;
    public final File LIZJ;

    public C802840VeU(File file) {
        this(file, new InterfaceC803660Vfo() { // from class: X.1ESd
            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
            /* JADX WARN: Removed duplicated region for block: B:134:0x0197 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:4:0x0018  */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0021 A[RETURN] */
            @Override // X.InterfaceC803660Vfo
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.String LIZ(java.lang.String r11, java.lang.String r12) {
                /*
                    Method dump skipped, instruction units count: 540
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C2281571ESd.LIZ(java.lang.String, java.lang.String):java.lang.String");
            }
        });
    }

    public final String LIZ(int i) {
        long j;
        String str = null;
        long j2 = 0;
        for (Map.Entry entry : ((HashMap) this.LIZ).entrySet()) {
            C803520Vfa c803520Vfa = (C803520Vfa) entry.getValue();
            c803520Vfa.getClass();
            if (i >= 0 && i < 8) {
                j = c803520Vfa.LIZ[i];
            } else {
                j = 0;
            }
            if (j > j2) {
                str = (String) entry.getKey();
                j2 = j;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZIZ(org.json.JSONObject r12) {
        /*
            Method dump skipped, instruction units count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C802840VeU.LIZIZ(org.json.JSONObject):void");
    }

    public C802840VeU(File file, InterfaceC803660Vfo interfaceC803660Vfo) {
        JSONObject jSONObject;
        this.LIZ = new HashMap();
        NativeBridge.LJJIL(file.getAbsolutePath(), true);
        String strLJFF = C2112008Pe.LJFF(new C0VSJ(file, "maps_json.txt"));
        if (!TextUtils.isEmpty(strLJFF)) {
            try {
                jSONObject = new JSONObject(strLJFF);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        this.LIZIZ = jSONObject;
        this.LIZJ = file;
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object objOpt = this.LIZIZ.opt(next);
                if (objOpt instanceof JSONObject) {
                    JSONObject jSONObject2 = (JSONObject) objOpt;
                    Iterator<String> itKeys2 = jSONObject2.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(next2);
                        if (jSONArrayOptJSONArray != null) {
                            String strLIZ = interfaceC803660Vfo.LIZ(next, next2);
                            if (!TextUtils.isEmpty(strLIZ)) {
                                C803520Vfa c803520Vfa = (C803520Vfa) ((HashMap) this.LIZ).get(strLIZ);
                                if (c803520Vfa == null) {
                                    c803520Vfa = new C803520Vfa();
                                    ((HashMap) this.LIZ).put(strLIZ, c803520Vfa);
                                }
                                int i = 0;
                                do {
                                    long[] jArr = c803520Vfa.LIZ;
                                    jArr[i] = jArr[i] + jSONArrayOptJSONArray.optLong(i);
                                    i++;
                                } while (i < 8);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void LIZLLL(JSONObject jSONObject, C802910Veb c802910Veb, String str, String str2) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject2 = this.LIZIZ;
        if (jSONObject2 == null || (jSONObjectOptJSONObject = jSONObject2.optJSONObject(str2)) == null) {
            return;
        }
        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
        long j = 0;
        String str3 = null;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!next.equals("total") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(next)) != null) {
                long jOptLong = jSONArrayOptJSONArray.optLong(1);
                if (jOptLong > j) {
                    str3 = next;
                    j = jOptLong;
                }
            }
        }
        if (str3 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("_name");
            C0VJO.LJIIIIZZ(jSONObject, C2188811AlT.LIZIZ(sbLIZ), str3);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("_size");
            C0VJO.LJIIIIZZ(jSONObject, C2188811AlT.LIZIZ(sbLIZ2), c802910Veb.LIZ(j / 1024));
        }
    }

    public final void LIZJ(JSONObject jSONObject, C802910Veb c802910Veb, String str, String str2, String str3) {
        long jOptLong;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObject2 = this.LIZIZ;
        if (jSONObject2 == null) {
            return;
        }
        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(str2);
        if (jSONObjectOptJSONObject != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray(str3)) != null) {
            jOptLong = jSONArrayOptJSONArray.optLong(1);
        } else {
            jOptLong = -1;
        }
        long j = jOptLong / 1024;
        if (j >= 0) {
            C0VJO.LJIIIIZZ(jSONObject, str, c802910Veb.LIZ(j));
        }
    }
}
