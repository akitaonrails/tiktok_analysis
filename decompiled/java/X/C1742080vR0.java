package X;

import android.net.Uri;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.lang.reflect.Type;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0vR0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1742080vR0 {
    public static final int LIZ;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = SettingsManager.LJ("ec_source_list_max_length", 2);
    }

    public static ArrayList LIZIZ(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(arrayList, i);
            if (obj instanceof Number) {
                arrayList2.add(Integer.valueOf(((Number) obj).intValue()));
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] LJ(com.ss.android.ugc.aweme.feed.model.Aweme r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L64
            java.util.HashMap r1 = r4.getMobParams()
            if (r1 == 0) goto L64
            java.lang.String r0 = "traffic_source_list"
            java.lang.Object r4 = r1.get(r0)
            if (r4 == 0) goto L64
            boolean r0 = r4 instanceof int[]
            if (r0 != 0) goto L21
            r0 = r3
        L16:
            int[] r0 = (int[]) r0
            if (r0 != 0) goto L63
            boolean r0 = r4 instanceof java.lang.String
            if (r0 == 0) goto L23
            java.lang.String r4 = (java.lang.String) r4
            goto L24
        L21:
            r0 = r4
            goto L16
        L23:
            r4 = r3
        L24:
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L5e
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L5e
            r0.getClass()     // Catch: com.google.gson.s -> L5e
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L5e
            if (r0 == 0) goto L39
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L5e
            r0 = 1
            if (r1 != r0) goto L39
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L3d
            goto L47
        L3d:
            X.0vR2 r0 = new X.0vR2     // Catch: com.google.gson.s -> L5e
            r0.<init>()     // Catch: com.google.gson.s -> L5e
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L5e
            goto L51
        L47:
            java.lang.Class<int[]> r0 = int[].class
            X.13JW r0 = X.C13LE.LJ(r0)     // Catch: com.google.gson.s -> L5e
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L5e
        L51:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r4, r0)     // Catch: com.google.gson.s -> L5e
            boolean r0 = r1 instanceof int[]     // Catch: com.google.gson.s -> L5e
            if (r0 != 0) goto L5a
            r1 = r3
        L5a:
            int[] r1 = (int[]) r1     // Catch: com.google.gson.s -> L5e
            r3 = r1
            goto L64
        L5e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L64
        L63:
            r3 = r0
        L64:
            r0 = 2
            int[] r0 = LIZ(r0, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1742080vR0.LJ(com.ss.android.ugc.aweme.feed.model.Aweme):int[]");
    }

    public static int[] LJFF(Map map) {
        Object obj;
        ArrayList arrayList;
        if (map != null) {
            try {
                if (map.containsKey("traffic_source_list") && (obj = map.get("traffic_source_list")) != null) {
                    if (obj instanceof ArrayList) {
                        if (obj instanceof ArrayList) {
                            arrayList = (ArrayList) obj;
                        } else {
                            arrayList = null;
                        }
                        if (arrayList != null) {
                            if (arrayList.isEmpty()) {
                                return null;
                            }
                            return C13LP.LLII(LIZIZ(arrayList));
                        }
                    }
                    if (obj instanceof int[]) {
                        return (int[]) obj;
                    }
                }
                return null;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] LJI(android.net.Uri r11) {
        /*
            java.lang.String r3 = "traffic_source_list"
            r10 = 0
            r6 = 2
            if (r11 == 0) goto Ld
            java.lang.String r0 = "trackParams"
            java.lang.String r2 = com.bytedance.mt.protector.impl.UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(r11, r0)     // Catch: java.lang.Exception -> L89
            goto Le
        Ld:
            r2 = r10
        Le:
            r7 = 1
            r9 = 0
            if (r2 == 0) goto L1a
            int r0 = r2.length()     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L1c
            r0 = 1
            goto L1d
        L1a:
            r0 = 0
            goto L20
        L1c:
            r0 = 0
        L1d:
            if (r0 != r7) goto L1a
            r0 = 1
        L20:
            r8 = 6
            if (r0 == 0) goto L2a
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L2a:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L89
            r1.<init>(r2)     // Catch: java.lang.Exception -> L89
            boolean r0 = r1.has(r3)     // Catch: java.lang.Exception -> L89
            if (r0 != 0) goto L3c
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L3c:
            org.json.JSONArray r5 = r1.optJSONArray(r3)     // Catch: java.lang.Exception -> L89
            if (r5 == 0) goto L82
            int r0 = r5.length()     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L82
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: java.lang.Exception -> L89
            r4.<init>()     // Catch: java.lang.Exception -> L89
            int r3 = r5.length()     // Catch: java.lang.Exception -> L89
            r2 = 0
        L52:
            if (r2 >= r3) goto L70
            java.lang.Object r1 = r5.get(r2)     // Catch: java.lang.Exception -> L89
            boolean r0 = r1 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L5f
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch: java.lang.Exception -> L89
            goto L60
        L5f:
            r1 = r10
        L60:
            if (r1 == 0) goto L6d
            int r0 = r1.intValue()     // Catch: java.lang.Exception -> L89
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Exception -> L89
            r4.add(r0)     // Catch: java.lang.Exception -> L89
        L6d:
            int r2 = r2 + 1
            goto L52
        L70:
            boolean r0 = r4.isEmpty()     // Catch: java.lang.Exception -> L89
            if (r0 == 0) goto L7d
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L7d:
            int[] r0 = X.C13LP.LLII(r4)     // Catch: java.lang.Exception -> L89
            return r0
        L82:
            int[] r0 = new int[r6]     // Catch: java.lang.Exception -> L89
            r0[r9] = r8     // Catch: java.lang.Exception -> L89
            r0[r7] = r7     // Catch: java.lang.Exception -> L89
            return r0
        L89:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            int[] r0 = new int[r6]
            r0 = {x0094: FILL_ARRAY_DATA , data: [6, 1} // fill-array
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1742080vR0.LJI(android.net.Uri):int[]");
    }

    public static String LJII(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        Type type;
        StringBuffer stringBuffer = new StringBuffer();
        if (str != null) {
            int i = 0;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int[] iArr = null;
                try {
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        if (!z3) {
                            type = new TypeToken<int[]>() { // from class: X.0vR3
                            }.getType();
                        } else {
                            type = C2371409Qy.LIZJ(C13LE.LJII(int[].class));
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type);
                        if (!(objLJIIIIZZ instanceof int[])) {
                            objLJIIIIZZ = null;
                        }
                        iArr = (int[]) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    if (iArr == null) {
                        iArr = new int[0];
                    }
                    if (iArr.length == 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        stringBuffer.append(e3.e);
                        stringBuffer.append(1);
                        stringBuffer.append(e3.f);
                        return stringBuffer.toString();
                    }
                    Integer numLJJJJI = C13LQ.LJJJJI(iArr);
                    if (numLJJJJI != null && numLJJJJI.intValue() == 1) {
                        List<Integer> listLJJZZIII = C13LQ.LJJZZIII(iArr);
                        stringBuffer.append(e3.e);
                        ArrayList arrayList = (ArrayList) listLJJZZIII;
                        int size = arrayList.size();
                        while (i < size) {
                            int iIntValue = ((Number) arrayList.get(i)).intValue();
                            if (i == arrayList.size() - 1) {
                                stringBuffer.append(iIntValue);
                            } else {
                                stringBuffer.append(iIntValue);
                                stringBuffer.append(",");
                            }
                            i++;
                        }
                        stringBuffer.append(e3.f);
                        return stringBuffer.toString();
                    }
                    ArrayList arrayList2 = (ArrayList) C13LQ.LJJZZIII(iArr);
                    if (arrayList2.size() >= LIZ) {
                        arrayList2.remove(0);
                    }
                    arrayList2.add(1);
                    stringBuffer.append(e3.e);
                    int size2 = arrayList2.size();
                    while (i < size2) {
                        int iIntValue2 = ((Number) arrayList2.get(i)).intValue();
                        if (i == arrayList2.size() - 1) {
                            stringBuffer.append(iIntValue2);
                        } else {
                            stringBuffer.append(iIntValue2);
                            stringBuffer.append(",");
                        }
                        i++;
                    }
                    stringBuffer.append(e3.f);
                    return stringBuffer.toString();
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    stringBuffer.append("[1]");
                    return stringBuffer.toString();
                }
            }
        }
        stringBuffer.append("[1]");
        return stringBuffer.toString();
    }

    public static String LJIIIIZZ(Aweme aweme) {
        HashMap<String, String> mobParams;
        if (aweme != null && (mobParams = aweme.getMobParams()) != null) {
            return mobParams.get("traffic_source_list");
        }
        return null;
    }

    public static String LJIIIZ(HashMap map) {
        if (map != null) {
            return (String) map.get("traffic_source_list");
        }
        return null;
    }

    public static String LJIIJ(Map map) {
        try {
            int[] iArrLJFF = LJFF(map);
            if (iArrLJFF != null) {
                return new JSONArray(iArrLJFF).toString();
            }
            return new JSONArray((Collection) new ArrayList()).toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return new JSONArray((Collection) new ArrayList()).toString();
        }
    }

    public static int[] LIZ(int i, int[] iArr) {
        boolean z;
        if (iArr != null) {
            try {
                if (iArr.length != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    Integer numLJJJJI = C13LQ.LJJJJI(iArr);
                    if (numLJJJJI == null || numLJJJJI.intValue() != i) {
                        List<Integer> listLJJZZIII = C13LQ.LJJZZIII(iArr);
                        ArrayList arrayList = (ArrayList) listLJJZZIII;
                        if (arrayList.size() >= LIZ) {
                            arrayList.remove(0);
                        }
                        arrayList.add(Integer.valueOf(i));
                        return C13LP.LLII(listLJJZZIII);
                    }
                    return iArr;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return new int[]{i};
            }
        }
        return new int[]{i};
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] LIZJ(int r4, java.lang.String r5) {
        /*
            r3 = 0
            com.google.gson.Gson r2 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> L3b
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> L3b
            r0.getClass()     // Catch: com.google.gson.s -> L3b
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> L3b
            if (r0 == 0) goto L16
            boolean r1 = r0.LJII     // Catch: com.google.gson.s -> L3b
            r0 = 1
            if (r1 != r0) goto L16
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L1a
            goto L24
        L1a:
            X.0vR1 r0 = new X.0vR1     // Catch: com.google.gson.s -> L3b
            r0.<init>()     // Catch: com.google.gson.s -> L3b
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> L3b
            goto L2e
        L24:
            java.lang.Class<int[]> r0 = int[].class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> L3b
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> L3b
        L2e:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r2, r5, r0)     // Catch: com.google.gson.s -> L3b
            boolean r0 = r1 instanceof int[]     // Catch: com.google.gson.s -> L3b
            if (r0 != 0) goto L37
            r1 = r3
        L37:
            int[] r1 = (int[]) r1     // Catch: com.google.gson.s -> L3b
            r3 = r1
            goto L3f
        L3b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L3f:
            int[] r0 = LIZ(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1742080vR0.LIZJ(int, java.lang.String):int[]");
    }

    public static int[] LIZLLL(int i, Map map) {
        boolean z;
        ArrayList arrayList;
        boolean z2;
        try {
            if (!map.containsKey("traffic_source_list")) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                return new int[]{i};
            }
            Object obj = map.get("traffic_source_list");
            if (obj instanceof ArrayList) {
                arrayList = (ArrayList) obj;
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && !arrayList.isEmpty()) {
                ArrayList arrayListLIZIZ = LIZIZ(arrayList);
                if (arrayListLIZIZ.isEmpty()) {
                    arrayListLIZIZ.add(Integer.valueOf(i));
                }
                Integer num = (Integer) C13LP.LJJLIIIJL(arrayListLIZIZ);
                if (num != null && num.intValue() == i) {
                    return C13LP.LLII(arrayListLIZIZ);
                }
                if (arrayListLIZIZ.size() >= LIZ) {
                    arrayListLIZIZ.remove(0);
                }
                arrayListLIZIZ.add(Integer.valueOf(i));
                return C13LP.LLII(arrayListLIZIZ);
            }
            return new int[]{i};
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new int[]{i};
        }
    }

    public static String LJIIJJI(int i, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        JSONArray jSONArray;
        String string;
        String string2;
        boolean z;
        String string3;
        try {
            Uri uri = UriProtector.parse(str);
            if (uri != null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "trackParams");
            } else {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = null;
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                boolean z2 = false;
                if (jSONObject.has("traffic_source_list")) {
                    JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("traffic_source_list");
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        jSONArray = new JSONArray(new int[]{i});
                    } else {
                        Object obj = jSONObject.get("traffic_source_list");
                        if (obj != null) {
                            string3 = obj.toString();
                        } else {
                            string3 = null;
                        }
                        jSONArray = new JSONArray(LIZJ(i, string3));
                    }
                } else {
                    jSONArray = new JSONArray(new int[]{i});
                }
                jSONObject.putOpt("traffic_source_list", jSONArray);
                if (uri != null && (string2 = uri.toString()) != null && a0.LJJIIZI(string2, "trackParams=", false)) {
                    z2 = true;
                }
                if (z2) {
                    if (uri == null || (string = uri.toString()) == null) {
                        return null;
                    }
                    Regex regex = new Regex("(trackParams=[^&]*)");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("trackParams=");
                    sbLIZ.append(URLEncoder.encode(C786410Ut5.J3(jSONObject), "UTF-8"));
                    str = regex.replace(string, C2188811AlT.LIZIZ(sbLIZ));
                    return str;
                }
            }
            return str;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return str;
        }
    }
}
