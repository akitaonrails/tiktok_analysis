package X;

import android.text.TextUtils;
import com.bytedance.crash.jni.NativeBridge;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0VJG, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJG {
    public static String LIZ(String str) {
        StringBuilder sb = new StringBuilder();
        try {
            if (str.length() < 16) {
                sb.append(str);
            } else {
                sb.append(str.charAt(6));
                sb.append(str.charAt(7));
                sb.append(str.charAt(4));
                sb.append(str.charAt(5));
                sb.append(str.charAt(2));
                sb.append(str.charAt(3));
                sb.append(str.charAt(0));
                sb.append(str.charAt(1));
                sb.append(str.charAt(10));
                sb.append(str.charAt(11));
                sb.append(str.charAt(8));
                sb.append(str.charAt(9));
                sb.append(str.charAt(14));
                sb.append(str.charAt(15));
                sb.append(str.charAt(12));
                sb.append(str.charAt(13));
                if (str.length() >= 32) {
                    sb.append((CharSequence) str, 16, 32);
                    sb.append('0');
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return sb.toString().toUpperCase();
    }

    public static boolean LIZIZ(String str) {
        if (!str.startsWith("/system/lib") && !str.startsWith("/vendor/lib") && !str.startsWith("/apex/")) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(JSONObject jSONObject, Map<String, String> map) {
        String strSubstring;
        int iLastIndexOf;
        JSONArray jSONArray = new JSONArray();
        for (Map.Entry entry : ((HashMap) map).entrySet()) {
            try {
                String str = (String) entry.getKey();
                if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(47)) != -1) {
                    strSubstring = str.substring(iLastIndexOf + 1);
                    int iIndexOf = strSubstring.indexOf(".apk!");
                    if (iIndexOf != -1) {
                        strSubstring = strSubstring.substring(iIndexOf + 5);
                    }
                } else {
                    strSubstring = null;
                }
                if (!TextUtils.isEmpty(strSubstring)) {
                    JSONObject jSONObject2 = new JSONObject();
                    C0VJO.LJIIIIZZ(jSONObject2, "lib_name", strSubstring);
                    C0VJO.LJIIIIZZ(jSONObject2, "lib_uuid", LIZ((String) entry.getValue()));
                    jSONArray.put(jSONObject2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        C0VJO.LJIIIIZZ(jSONObject, "crash_lib_uuid", jSONArray);
    }

    public static void LIZJ(File file, JSONObject jSONObject, boolean z) {
        String strLIZ;
        BufferedReader bufferedReader;
        HashMap map = new HashMap();
        ArrayList<String> arrayList = new ArrayList();
        if (z) {
            C0VSJ c0vsj = new C0VSJ(file, "tombstone.txt");
            if (c0vsj.exists()) {
                Pattern patternCompile = PatternProtector.compile("^ {4}(/(?:[^/]+/)+[^.]+\\.so) \\(BuildId: ([0-9a-f]+)\\).*");
                try {
                    bufferedReader = new BufferedReader(new InputStreamReader(new C0VSP(c0vsj)));
                    while (true) {
                        try {
                            String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            if (line.startsWith("build id:")) {
                                while (true) {
                                    String line2 = bufferedReader.readLine();
                                    if (line2 == null || !line2.startsWith("    /")) {
                                        break;
                                    }
                                    Matcher matcher = patternCompile.matcher(line2);
                                    if (matcher.find() && matcher.groupCount() == 2) {
                                        String strGroup = matcher.group(1);
                                        String strGroup2 = matcher.group(2);
                                        if (strGroup != null && !LIZIZ(strGroup) && !map.containsKey(strGroup)) {
                                            map.put(strGroup, strGroup2);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            th = th;
                            TryCatchGuardChecker.doCheck(th);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader = null;
                }
                C2112008Pe.LIZ(bufferedReader);
            }
            final C0VSJ c0vsj2 = new C0VSJ(file, "nstack.txt");
            new C0VJC(c0vsj2) { // from class: X.0VJD
                @Override // X.C0VJC
                public final Pattern LIZ() {
                    return PatternProtector.compile("^#\\d{1,3} pc [0-9a-f]{8,16} {2}(/(?:[^/]+/)+.*\\.so).*");
                }

                @Override // X.C0VJC
                public final boolean LIZIZ(String str) {
                    return str.startsWith("#");
                }
            }.LIZJ(arrayList);
        }
        final C0VSJ c0vsj3 = new C0VSJ(file, "rountines.txt");
        new C0VJC(c0vsj3) { // from class: X.0VJE
            @Override // X.C0VJC
            public final Pattern LIZ() {
                return PatternProtector.compile("^0x[0-9a-f]{1,16}:(/(?:[^/]+/)+[^.]+\\.so):.*");
            }

            @Override // X.C0VJC
            public final boolean LIZIZ(String str) {
                return str.startsWith("0x");
            }
        }.LIZJ(arrayList);
        for (String str : arrayList) {
            if (!LIZIZ(str) && !map.containsKey(str) && (strLIZ = NativeBridge.LIZ(str)) != null) {
                map.put(str, strLIZ);
            }
        }
        LIZLLL(jSONObject, map);
    }
}
