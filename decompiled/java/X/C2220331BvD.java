package X;

import Y.AObjectS103S0101000_34;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BvD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2220331BvD {
    public final C2220391BvJ LIZ;
    public final ConcurrentHashMap<Integer, Boolean> LIZIZ = new ConcurrentHashMap<>();
    public final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"", "base64", "ascii", "binary", "binaryle", "hex", "ucs2", "ucs-2", "utf16le", "utf-16le", "utf8", "utf-8", "latin1", "json"});

    public C2220331BvD(C2220391BvJ c2220391BvJ) {
        this.LIZ = c2220391BvJ;
    }

    public static C2220221Bv2 LIZ(C2220221Bv2 c2220221Bv2) {
        Map<String, Object> map;
        Object obj;
        Integer numLJIIJJI;
        int iIntValue;
        C2220231Bv3 c2220231Bv3 = c2220221Bv2.LIZIZ;
        if (!c2220231Bv3.LIZ || (map = c2220231Bv3.LIZLLL) == null || (obj = map.get("fd")) == null) {
            return c2220221Bv2;
        }
        if (obj instanceof Number) {
            iIntValue = ((Number) obj).intValue();
        } else {
            if (!(obj instanceof String) || (numLJIIJJI = C2095008Iq.LJIIJJI((String) obj)) == null) {
                return c2220221Bv2;
            }
            iIntValue = numLJIIJJI.intValue();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put("fd", String.valueOf(iIntValue));
        return C2220251Bv5.LIZJ(c2220221Bv2.LIZIZ.LIZIZ, linkedHashMap);
    }

    public static C2220221Bv2 LIZIZ(C2220221Bv2 c2220221Bv2) {
        byte[] bArr;
        C2220231Bv3 c2220231Bv3 = c2220221Bv2.LIZIZ;
        if (!c2220231Bv3.LIZ) {
            return c2220221Bv2;
        }
        Map<String, Object> map = c2220231Bv3.LIZLLL;
        Object obj = null;
        if (map != null) {
            obj = map.get("data");
        }
        if ((obj instanceof byte[]) && (bArr = (byte[]) obj) != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(c2220221Bv2.LIZIZ.LIZLLL);
            linkedHashMap.put("data", Base64.encodeToString(bArr, 2));
            linkedHashMap.put("dataType", "arraybuffer");
            return C2220251Bv5.LIZJ(c2220221Bv2.LIZIZ.LIZIZ, linkedHashMap);
        }
        return c2220221Bv2;
    }

    public static byte[] LIZLLL(Object obj) {
        if (obj != null && !Intrinsics.LJFF(obj, JSONObject.NULL)) {
            if (obj instanceof byte[]) {
                return (byte[]) obj;
            }
            if (obj instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) obj;
                byte[] bArr = new byte[jSONArray.length()];
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    int iOptInt = jSONArray.optInt(i, -1);
                    if (iOptInt >= 0 && iOptInt <= 255) {
                        bArr[i] = (byte) iOptInt;
                    } else {
                        return null;
                    }
                }
                return bArr;
            }
            if (obj instanceof String) {
                return LJIIJ((String) obj);
            }
            return null;
        }
        return null;
    }

    public static String LJ(Object obj) {
        if (obj != null && !Intrinsics.LJFF(obj, JSONObject.NULL)) {
            if (obj instanceof String) {
                return (String) obj;
            }
            if (!(obj instanceof Number) && !(obj instanceof Boolean)) {
                if (!(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                    if (obj instanceof byte[]) {
                        return Base64.encodeToString((byte[]) obj, 2);
                    }
                    return null;
                }
                return obj.toString();
            }
            return obj.toString();
        }
        return null;
    }

    public static byte[] LJIIJ(String str) {
        boolean z;
        String strReplace = new Regex("\\s").replace(str, "");
        if (strReplace.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new byte[0];
        }
        try {
            return Base64.decode(strReplace + u.LJJ((4 - (strReplace.length() % 4)) % 4, "="), 2);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static C2220181Buy LJIIL(EnumC2221121BwU enumC2221121BwU) {
        return C2220251Bv5.LIZ(enumC2221121BwU, "").LIZ();
    }

    public static String LJIJJ(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != 111113226) {
            if (iHashCode != 111607186) {
                if (iHashCode == 584837828 && lowerCase.equals("utf-16le")) {
                    return "utf16le";
                }
                return lowerCase;
            }
            if (!lowerCase.equals("utf-8")) {
                return lowerCase;
            }
            return "utf8";
        }
        if (!lowerCase.equals("ucs-2")) {
            return lowerCase;
        }
        return "ucs2";
    }

    public static Integer LJIL(JSONObject jSONObject) {
        if (!jSONObject.has("fd")) {
            return null;
        }
        Object objOpt = jSONObject.opt("fd");
        if (objOpt instanceof Number) {
            double dDoubleValue = ((Number) objOpt).doubleValue();
            if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue) || dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d || dDoubleValue % 1.0d != 0.0d) {
                return null;
            }
            return Integer.valueOf((int) dDoubleValue);
        }
        if (!(objOpt instanceof String)) {
            return null;
        }
        String string = a0.LJLIIIL((String) objOpt).toString();
        if (string.length() <= 0) {
            return null;
        }
        return C2095008Iq.LJIIJJI(string);
    }

    public static Pair LJJ(JSONObject jSONObject) {
        CharSequence charSequence = "r";
        if (jSONObject.has("flag")) {
            Object objOpt = jSONObject.opt("flag");
            if (!(objOpt instanceof String)) {
                return new Pair(Boolean.FALSE, "r");
            }
            Boolean bool = Boolean.TRUE;
            CharSequence charSequence2 = (CharSequence) objOpt;
            if (!a0.LJJJIL(charSequence2)) {
                charSequence = charSequence2;
            }
            return new Pair(bool, charSequence);
        }
        if (jSONObject.has("mode")) {
            Object objOpt2 = jSONObject.opt("mode");
            if (!(objOpt2 instanceof String)) {
                return new Pair(Boolean.FALSE, "r");
            }
            Boolean bool2 = Boolean.TRUE;
            CharSequence charSequence3 = (CharSequence) objOpt2;
            if (!a0.LJJJIL(charSequence3)) {
                charSequence = charSequence3;
            }
            return new Pair(bool2, charSequence);
        }
        return new Pair(Boolean.TRUE, "r");
    }

    public static Pair LJJIFFI(JSONObject jSONObject) {
        if (!jSONObject.has("position")) {
            return new Pair(Boolean.FALSE, null);
        }
        Object objOpt = jSONObject.opt("position");
        if (objOpt != null && objOpt != JSONObject.NULL) {
            if (!(objOpt instanceof Number)) {
                return null;
            }
            double dDoubleValue = ((Number) objOpt).doubleValue();
            if (Double.isInfinite(dDoubleValue) || Double.isNaN(dDoubleValue) || dDoubleValue < -2.147483648E9d || dDoubleValue > 2.147483647E9d || dDoubleValue % 1.0d != 0.0d) {
                return null;
            }
            return new Pair(Boolean.TRUE, Integer.valueOf((int) dDoubleValue));
        }
        return new Pair(Boolean.TRUE, null);
    }

    public static Pair LJJII(JSONObject jSONObject) {
        if (!jSONObject.has("length")) {
            return new Pair(Boolean.FALSE, null);
        }
        Object objOpt = jSONObject.opt("length");
        if (objOpt != null && objOpt != JSONObject.NULL) {
            if (!(objOpt instanceof Number)) {
                return new Pair(Boolean.TRUE, null);
            }
            double dDoubleValue = ((Number) objOpt).doubleValue();
            if (!Double.isInfinite(dDoubleValue) && !Double.isNaN(dDoubleValue)) {
                if (dDoubleValue >= -9.223372036854776E18d && dDoubleValue <= 9.223372036854776E18d) {
                    if (dDoubleValue % 1.0d == 0.0d) {
                        return new Pair(Boolean.TRUE, Long.valueOf((long) dDoubleValue));
                    }
                    return new Pair(Boolean.TRUE, null);
                }
                return new Pair(Boolean.TRUE, null);
            }
            return new Pair(Boolean.TRUE, null);
        }
        return new Pair(Boolean.TRUE, null);
    }

    public static void LJJIIZ(C2220181Buy c2220181Buy) {
        JSONObject jSONObject;
        C1525410pnX c1525410pnX = c2220181Buy.LIZ;
        if (!c1525410pnX.LIZ || (jSONObject = c1525410pnX.LIZIZ) == null) {
            return;
        }
        if (jSONObject.has("stats") && !jSONObject.has("stat")) {
            jSONObject.put("stat", jSONObject.opt("stats"));
        } else {
            if (!jSONObject.has("stat") || jSONObject.has("stats")) {
                return;
            }
            jSONObject.put("stats", jSONObject.opt("stat"));
        }
    }

    public final C2220221Bv2 LJFF(String str) {
        Object obj;
        Map map;
        C2220221Bv2 c2220221Bv2LJJLIIIJ = this.LIZ.LIZ.LJJLIIIJ(str);
        C2220231Bv3 c2220231Bv3 = c2220221Bv2LJJLIIIJ.LIZIZ;
        if (!c2220231Bv3.LIZ) {
            return c2220221Bv2LJJLIIIJ;
        }
        Map<String, Object> map2 = c2220231Bv3.LIZLLL;
        Object obj2 = null;
        if (map2 != null) {
            obj = map2.get("stats");
        } else {
            obj = null;
        }
        if ((obj instanceof Map) && (map = (Map) obj) != null) {
            Object obj3 = map.get("__amgMinigameIsDirectory");
            if (obj3 instanceof Boolean) {
                obj2 = obj3;
            }
            if (!Intrinsics.LJFF(obj2, Boolean.TRUE)) {
                return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("stats", map)));
            }
            ArrayList arrayList = new ArrayList();
            C2220221Bv2 c2220221Bv2LJI = LJI(this, arrayList, str);
            if (c2220221Bv2LJI != null) {
                return c2220221Bv2LJI;
            }
            return C2220251Bv5.LIZJ(null, C2097908Jt.LIZJ(new Pair("stats", arrayList)));
        }
        return C2220251Bv5.LIZ(EnumC2221121BwU.SYSTEM_ERROR, "");
    }

    public final boolean LJIJI(String str) {
        return this.LIZJ.contains(str.toLowerCase(Locale.ROOT));
    }

    public final Pair<byte[], EnumC2221121BwU> LJIJJLI(JSONObject jSONObject) {
        Object c098200Yq;
        String strOptString = jSONObject.optString("encoding", "utf8");
        if (!LJIJI(strOptString)) {
            return new Pair<>(null, EnumC2221121BwU.INVALID_ARG);
        }
        String strLJIJJ = LJIJJ(strOptString);
        Object objOpt = jSONObject.opt("data");
        if (Intrinsics.LJFF(jSONObject.optString("dataType", "string").toLowerCase(Locale.ROOT), "arraybuffer")) {
            byte[] bArrLIZLLL = LIZLLL(objOpt);
            if (bArrLIZLLL == null) {
                return new Pair<>(null, EnumC2221121BwU.BASE64_ERROR);
            }
            return new Pair<>(bArrLIZLLL, null);
        }
        String strLJ = LJ(objOpt);
        if (strLJ == null) {
            return new Pair<>(null, EnumC2221121BwU.INVALID_ARG);
        }
        if (Intrinsics.LJFF(strLJIJJ, "base64")) {
            byte[] bArrLJIIJ = LJIIJ(strLJ);
            if (bArrLJIIJ == null) {
                return new Pair<>(null, EnumC2221121BwU.BASE64_ERROR);
            }
            return new Pair<>(bArrLJIIJ, null);
        }
        try {
            c098200Yq = LJIIIIZZ(strLJ, strLJIJJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            return new Pair<>(c098200Yq, null);
        }
        return new Pair<>(null, EnumC2221121BwU.INVALID_ARG);
    }

    public final byte[] LJJIII(JSONObject jSONObject) {
        Number number;
        boolean z;
        Object c098200Yq;
        boolean z2;
        Object c098200Yq2;
        boolean z3;
        boolean z4;
        boolean z5;
        if (jSONObject.has("arrayBuffer")) {
            return LIZLLL(jSONObject.opt("arrayBuffer"));
        }
        Object obj = null;
        if (!jSONObject.has("data")) {
            return null;
        }
        Object objOpt = jSONObject.opt("data");
        String strOptString = jSONObject.optString("encoding", "utf8");
        if (!LJIJI(strOptString)) {
            return null;
        }
        String strLJIJJ = LJIJJ(strOptString);
        boolean zHas = jSONObject.has("dataType");
        Object objOpt2 = jSONObject.opt("length");
        if (objOpt2 instanceof Number) {
            number = (Number) objOpt2;
        } else {
            number = null;
        }
        boolean z6 = true;
        if (number != null && number.intValue() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (Intrinsics.LJFF(jSONObject.optString("dataType", "string").toLowerCase(Locale.ROOT), "arraybuffer")) {
            return LIZLLL(objOpt);
        }
        String strLJ = LJ(objOpt);
        if (strLJ == null) {
            return null;
        }
        if (Intrinsics.LJFF(strLJIJJ, "base64")) {
            return LJIIJ(strLJ);
        }
        if (!zHas && Intrinsics.LJFF(strLJIJJ, "utf8")) {
            if (strLJ.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (strLJ.length() % 4 == 0) {
                    int length = strLJ.length();
                    int i = 0;
                    boolean z7 = false;
                    boolean z8 = false;
                    boolean z9 = false;
                    boolean z10 = false;
                    while (true) {
                        if (i < length) {
                            char cCharAt = strLJ.charAt(i);
                            if ('A' <= cCharAt && cCharAt < '[') {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                z9 = true;
                            } else {
                                if ('a' <= cCharAt && cCharAt < '{') {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    z10 = true;
                                } else {
                                    if ('0' <= cCharAt && cCharAt < ':') {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        z8 = true;
                                    } else {
                                        if (cCharAt != '+' && cCharAt != '/' && cCharAt != '=') {
                                            break;
                                        }
                                        z7 = true;
                                    }
                                }
                            }
                            i++;
                        } else if (!z7 && (!z || !z8 || !z9 || !z10)) {
                            break;
                        }
                    }
                } else {
                    z6 = false;
                }
            }
            if (z6) {
                byte[] bArrLJIIJ = LJIIJ(strLJ);
                if (bArrLJIIJ == null) {
                    try {
                        c098200Yq2 = LJIIIIZZ(strLJ, strLJIJJ);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq2 = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq2);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
                        obj = c098200Yq2;
                    }
                    return (byte[]) obj;
                }
                return bArrLJIIJ;
            }
        }
        try {
            c098200Yq = LJIIIIZZ(strLJ, strLJIJJ);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (byte[]) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2221021BwK LJJIIJ(org.json.JSONObject r15) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2220331BvD.LJJIIJ(org.json.JSONObject):X.1BwK");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C2220221Bv2 LIZJ(X.C2220221Bv2 r6, java.lang.String r7) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2220331BvD.LIZJ(X.1Bv2, java.lang.String):X.1Bv2");
    }

    public static C2220181Buy LJII(C2220221Bv2 c2220221Bv2, boolean z) {
        Object obj;
        Map mapLJ;
        C1525420pnY c1525420pnY;
        Map mapLJ2;
        if (!c2220221Bv2.LIZIZ.LIZ) {
            return c2220221Bv2.LIZ();
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, Object> map = c2220221Bv2.LIZIZ.LIZLLL;
        if (map != null) {
            obj = map.get("entries");
        } else {
            obj = null;
        }
        if (!(obj instanceof Map) || (mapLJ = (Map) obj) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        int i = 0;
        for (Map.Entry entry : mapLJ.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            JSONObject jSONObject3 = new JSONObject();
            if (!(value instanceof Map) || (mapLJ2 = (Map) value) == null) {
                mapLJ2 = C2097608Jq.LJ();
            }
            Object obj2 = mapLJ2.get("data");
            if (obj2 instanceof byte[]) {
                jSONObject3.put("dataType", "arraybuffer");
                if (z) {
                    String str2 = "entry_" + i;
                    i++;
                    linkedHashMap.put(str2, obj2);
                    jSONObject3.put("data", str2);
                } else {
                    jSONObject3.put("data", Base64.encodeToString((byte[]) obj2, 2));
                }
            } else if (obj2 != null) {
                jSONObject3.put("data", obj2);
            }
            Object obj3 = mapLJ2.get("errMsg");
            if ((obj3 instanceof String) && obj3 != null) {
                jSONObject3.put("errMsg", obj3);
            }
            jSONObject2.put(str, jSONObject3);
        }
        jSONObject.put("entries", jSONObject2);
        C2220241Bv4 c2220241Bv4 = c2220221Bv2.LIZIZ.LIZJ;
        if (c2220241Bv4 != null) {
            c1525420pnY = new C1525420pnY(c2220241Bv4.LIZ, c2220241Bv4.LIZIZ);
        } else {
            c1525420pnY = new C1525420pnY(0, "");
        }
        int i2 = c2220221Bv2.LIZ;
        if (!z || !(!linkedHashMap.isEmpty())) {
            linkedHashMap = null;
        }
        return new C2220181Buy(new C1525410pnX(true, jSONObject, c1525420pnY, linkedHashMap), i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        if (r1.equals("binary") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r1.equals("latin1") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r1.equals("utf16le") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r1.equals("") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
    
        if (r1.equals("json") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0097, code lost:
    
        if (r1.equals("ucs2") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a1, code lost:
    
        if (r1.equals("utf8") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ba, code lost:
    
        return r5.getBytes(kotlin.text.Charsets.LIZJ);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d0, code lost:
    
        return r5.getBytes(java.nio.charset.Charset.forName("UTF-16LE"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00d7, code lost:
    
        return r5.getBytes(kotlin.text.Charsets.UTF_8);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] LJIIIIZZ(java.lang.String r5, java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2220331BvD.LJIIIIZZ(java.lang.String, java.lang.String):byte[]");
    }

    public static Pair LJIILIIL(List list, JSONObject jSONObject) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            if (jSONObject.has(str)) {
                Object objOpt = jSONObject.opt(str);
                if (!(objOpt instanceof String)) {
                    return new Pair(Boolean.TRUE, null);
                }
                String string = a0.LJLIIIL((String) objOpt).toString();
                if (string.length() == 0) {
                    return new Pair(Boolean.TRUE, null);
                }
                return new Pair(Boolean.TRUE, string);
            }
        }
        return new Pair(Boolean.FALSE, null);
    }

    public static String LJIILJJIL(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString(str);
        if (!(!a0.LJJJIL(strOptString))) {
            return null;
        }
        return strOptString;
    }

    public static Pair LJIILL(C2220331BvD c2220331BvD, JSONObject jSONObject) {
        c2220331BvD.getClass();
        for (String str : C1697810uHb.LJIIJJI("path", "filePath", "file", "dirPath", "destPath", "srcPath")) {
            if (jSONObject.has(str)) {
                return new Pair(Boolean.TRUE, jSONObject.optString(str));
            }
        }
        return new Pair(Boolean.FALSE, "");
    }

    public static Pair LJIILLIIL(C2220331BvD c2220331BvD, JSONObject jSONObject) {
        for (String str : C1697810uHb.LJIIJJI("path", "filePath", "file", "dirPath", "destPath", "srcPath")) {
            if (jSONObject.has(str)) {
                Object objOpt = jSONObject.opt(str);
                if (!(objOpt instanceof String)) {
                    return new Pair(Boolean.TRUE, null);
                }
                if ((!a0.LJJJIL((String) objOpt)) && objOpt != null) {
                    return new Pair(Boolean.TRUE, objOpt);
                }
                return new Pair(Boolean.TRUE, null);
            }
        }
        return new Pair(Boolean.FALSE, null);
    }

    public static String LJIIZILJ(C2220331BvD c2220331BvD, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("path");
        if (!(!a0.LJJJIL(strOptString)) || strOptString == null) {
            strOptString = jSONObject.optString("filePath");
            if (!(!a0.LJJJIL(strOptString)) || strOptString == null) {
                strOptString = jSONObject.optString("file");
                if (!(!a0.LJJJIL(strOptString)) || strOptString == null) {
                    strOptString = jSONObject.optString("dirPath");
                    if (!(!a0.LJJJIL(strOptString)) || strOptString == null) {
                        strOptString = jSONObject.optString("destPath");
                        if (!(!a0.LJJJIL(strOptString)) || strOptString == null) {
                            strOptString = jSONObject.optString("srcPath");
                            if (!(!a0.LJJJIL(strOptString))) {
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return strOptString;
    }

    public static Pair LJJI(String str, JSONObject jSONObject) {
        if (!jSONObject.has(str)) {
            return new Pair(Boolean.FALSE, null);
        }
        Object objOpt = jSONObject.opt(str);
        if (objOpt != null && objOpt != JSONObject.NULL) {
            if (!(objOpt instanceof Number)) {
                return new Pair(Boolean.TRUE, null);
            }
            return new Pair(Boolean.TRUE, Integer.valueOf(((Number) objOpt).intValue()));
        }
        return new Pair(Boolean.TRUE, null);
    }

    public final C2220181Buy LJIIIZ(int i, boolean z) {
        C2220391BvJ c2220391BvJ = this.LIZ;
        InterfaceC2220701Bvo interfaceC2220701Bvo = c2220391BvJ.LIZ;
        if (z) {
            interfaceC2220701Bvo.LJJJI(new AObjectS103S0101000_34(c2220391BvJ, i, 5));
            C2220181Buy c2220181Buy = C2220181Buy.LIZJ;
            return C2220181Buy.LJ;
        }
        C2220181Buy c2220181Buy2 = C2220181Buy.LIZJ;
        return C2220181Buy.LIZLLL;
    }

    public final C2220181Buy LJIIJJI(EnumC2221121BwU enumC2221121BwU, final int i) throws JSONException {
        final C2220181Buy c2220181BuyLIZ = C2220251Bv5.LIZ(enumC2221121BwU, "").LIZ();
        this.LIZ.LIZ.LJJJI(new Function0() { // from class: X.1BvI
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                C2220331BvD c2220331BvD = this.LL;
                int i2 = i;
                c2220331BvD.LIZ.LIZIZ.LJJLIIJ(Integer.valueOf(i2), c2220181BuyLIZ);
                return Unit.LIZ;
            }
        });
        return C2220181Buy.LJ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIJZLJL(X.C2220221Bv2 r5, java.lang.String r6) {
        /*
            r4 = this;
            X.1Bv3 r1 = r5.LIZIZ
            boolean r0 = r1.LIZ
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.LIZLLL
            if (r1 == 0) goto L4a
            java.lang.String r0 = "fd"
            java.lang.Object r1 = r1.get(r0)
            if (r1 == 0) goto L4a
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 == 0) goto L79
            java.lang.Number r1 = (java.lang.Number) r1
            int r0 = r1.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L21:
            if (r0 == 0) goto L4a
            int r0 = r0.intValue()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Boolean> r2 = r4.LIZIZ
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r6)
            java.lang.String r1 = r0.toString()
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            int r0 = r1.hashCode()
            switch(r0) {
                case 97: goto L73;
                case 114: goto L69;
                case 119: goto L66;
                case 3050: goto L63;
                case 3122: goto L60;
                case 3127: goto L5d;
                case 3577: goto L5a;
                case 3732: goto L57;
                case 3809: goto L54;
                case 96825: goto L51;
                case 96980: goto L4e;
                case 118122: goto L4b;
                default: goto L42;
            }
        L42:
            r0 = 1
        L43:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r0)
        L4a:
            return
        L4b:
            java.lang.String r0 = "wx+"
            goto L75
        L4e:
            java.lang.String r0 = "ax+"
            goto L75
        L51:
            java.lang.String r0 = "as+"
            goto L75
        L54:
            java.lang.String r0 = "wx"
            goto L75
        L57:
            java.lang.String r0 = "w+"
            goto L75
        L5a:
            java.lang.String r0 = "r+"
            goto L75
        L5d:
            java.lang.String r0 = "ax"
            goto L75
        L60:
            java.lang.String r0 = "as"
            goto L75
        L63:
            java.lang.String r0 = "a+"
            goto L75
        L66:
            java.lang.String r0 = "w"
            goto L75
        L69:
            java.lang.String r0 = "r"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
            r0 = 0
            goto L43
        L73:
            java.lang.String r0 = "a"
        L75:
            r1.equals(r0)
            goto L42
        L79:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L4a
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Integer r0 = X.C2095008Iq.LJIIJJI(r1)
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2220331BvD.LJJIIJZLJL(X.1Bv2, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C2220221Bv2 LJI(X.C2220331BvD r7, java.util.List<java.util.Map<java.lang.String, java.lang.Object>> r8, java.lang.String r9) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2220331BvD.LJI(X.1BvD, java.util.List, java.lang.String):X.1Bv2");
    }

    public static boolean LJIJ(Integer num, Integer num2, boolean z, boolean z2) {
        if (z && num == null) {
            return true;
        }
        if (z2 && num2 == null) {
            return true;
        }
        if (z && num.intValue() < 0) {
            return true;
        }
        if (z2) {
            if (num2.intValue() == 0 || num2.intValue() < -1) {
                return true;
            }
            return false;
        }
        return false;
    }
}
