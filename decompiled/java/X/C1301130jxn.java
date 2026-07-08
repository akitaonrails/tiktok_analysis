package X;

import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.base.log.LynxLog;
import com.lynx.react.bridge.ReadableMap;
import com.lynx.tasm.LynxError;
import j27.s;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0jxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301130jxn {
    public static boolean LIZ(String str) {
        if (!str.endsWith(".woff") && !str.endsWith(".woff2")) {
            return false;
        }
        return true;
    }

    public static String LIZLLL(String str) {
        if (str == null) {
            return null;
        }
        int i = 0;
        while (i < str.length() && (str.charAt(i) == ' ' || str.charAt(i) == '\"' || str.charAt(i) == '\'')) {
            i++;
        }
        if (i >= str.length()) {
            return null;
        }
        int length = str.length() - 1;
        while (length > i && (str.charAt(length) == ' ' || str.charAt(length) == '\"' || str.charAt(length) == '\'')) {
            length--;
        }
        return str.substring(i, length + 1);
    }

    public static String LJ(String str) {
        int i;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (!str.startsWith("'") && !str.startsWith("\"")) {
            i = 0;
        } else {
            i = 1;
        }
        if (str.endsWith("'") || str.endsWith("\"")) {
            length--;
        }
        if (i > length) {
            return null;
        }
        return str.substring(i, length);
    }

    public static C1301160jxq LIZIZ(s sVar, String str) {
        ReadableMap readableMap;
        if (str == null) {
            LIZJ(sVar, "Font-family is empty", "");
            return null;
        }
        synchronized (sVar.LLILZLL) {
            try {
                if (((HashMap) sVar.LLILZLL).containsKey(str) && (readableMap = (ReadableMap) ((HashMap) sVar.LLILZLL).get(str)) != null) {
                    HashMap<String, Object> mapAsHashMap = readableMap.asHashMap();
                    if (mapAsHashMap != null) {
                        C1301160jxq c1301160jxq = new C1301160jxq();
                        boolean z = false;
                        for (Object obj : mapAsHashMap.values()) {
                            if (!(obj instanceof String)) {
                                LIZJ(sVar, "Src is not string", obj.toString());
                            } else {
                                String str2 = (String) obj;
                                int length = str2.length();
                                int i = 0;
                                while (i < length) {
                                    int iIndexOf = str2.indexOf("url(", i);
                                    int iIndexOf2 = str2.indexOf("local(", i);
                                    if (iIndexOf == -1) {
                                        if (iIndexOf2 == -1) {
                                            break;
                                        }
                                    } else if (iIndexOf != -1) {
                                        if (iIndexOf2 != -1) {
                                            if (iIndexOf < iIndexOf2) {
                                                int iIndexOf3 = str2.indexOf(")", iIndexOf);
                                                if (iIndexOf3 != -1) {
                                                    i = iIndexOf3 + 2;
                                                    String strLJ = LJ(str2.substring(iIndexOf + 4, iIndexOf3));
                                                    if (strLJ != null) {
                                                        if (!LIZ(strLJ)) {
                                                            ((ArrayList) c1301160jxq.LIZ).add(new Pair(EnumC1301150jxp.URL, strLJ));
                                                        } else {
                                                            z = true;
                                                        }
                                                    }
                                                }
                                                LIZJ(sVar, "Src format error", str2);
                                                break;
                                            }
                                            int iIndexOf4 = str2.indexOf(")", iIndexOf2);
                                            if (iIndexOf4 != -1) {
                                                i = iIndexOf4 + 2;
                                                String strLJ2 = LJ(str2.substring(iIndexOf2 + 6, iIndexOf4));
                                                if (strLJ2 != null) {
                                                    if (!LIZ(strLJ2)) {
                                                        ((ArrayList) c1301160jxq.LIZ).add(new Pair(EnumC1301150jxp.LOCAL, strLJ2));
                                                    } else {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            LIZJ(sVar, "Src format error", str2);
                                            break;
                                        }
                                        if (iIndexOf != -1) {
                                            int iIndexOf5 = str2.indexOf(")", iIndexOf);
                                            if (iIndexOf5 != -1) {
                                                i = iIndexOf5 + 2;
                                                String strLJ3 = LJ(str2.substring(iIndexOf + 4, iIndexOf5));
                                                if (strLJ3 != null) {
                                                    if (!LIZ(strLJ3)) {
                                                        ((ArrayList) c1301160jxq.LIZ).add(new Pair(EnumC1301150jxp.URL, strLJ3));
                                                    } else {
                                                        z = true;
                                                    }
                                                }
                                            }
                                            LIZJ(sVar, "Src format error", str2);
                                            break;
                                        }
                                    }
                                    int iIndexOf6 = str2.indexOf(")", iIndexOf2);
                                    if (iIndexOf6 != -1) {
                                        i = iIndexOf6 + 2;
                                        String strLJ4 = LJ(str2.substring(iIndexOf2 + 6, iIndexOf6));
                                        if (strLJ4 != null) {
                                            if (!LIZ(strLJ4)) {
                                                ((ArrayList) c1301160jxq.LIZ).add(new Pair(EnumC1301150jxp.LOCAL, strLJ4));
                                            } else {
                                                z = true;
                                            }
                                        }
                                    }
                                    LIZJ(sVar, "Src format error", str2);
                                    break;
                                }
                                if (z && ((ArrayList) c1301160jxq.LIZ).isEmpty()) {
                                    sVar.LJJIFFI(str2, "font", new LynxError(30204, "The woff file format is not supported on Android"));
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("The woff file format is not supported on Android");
                                    sbLIZ.append(",src:");
                                    sbLIZ.append(str2);
                                    LynxLog.e("FontFaceParser", C2188811AlT.LIZIZ(sbLIZ));
                                }
                            }
                        }
                        return c1301160jxq;
                    }
                }
                return null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LIZJ(s sVar, String str, String str2) {
        sVar.LJJIFFI(str2, "font", new LynxError(30201, str));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(",src:");
        sbLIZ.append(str2);
        LynxLog.e("FontFaceParser", C2188811AlT.LIZIZ(sbLIZ));
    }
}
