package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pf2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520140pf2 {
    public static final Set<Character> LJI;
    public static final Set<Character> LJII;
    public static final Map<String, String> LJIIIIZZ;
    public static final Map<String, EnumC1514560pW2> LJIIIZ;
    public boolean LIZLLL;
    public boolean LJ;
    public final Map<String, List<String>> LIZ = new LinkedHashMap();
    public final LinkedBlockingQueue<String> LIZIZ = new LinkedBlockingQueue<>();
    public final LinkedBlockingQueue<String> LIZJ = new LinkedBlockingQueue<>();
    public final CountDownLatch LJFF = new CountDownLatch(1);

    static {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C19719612Di.LJJI(new C13LT('a', 'z'), linkedHashSet);
        C19719612Di.LJJI(new C13LT('A', 'Z'), linkedHashSet);
        linkedHashSet.addAll(C13LN.LLD("_-./%?=:&@"));
        LJI = linkedHashSet;
        LJII = C13LP.LLIIJI(new C13LT('0', '9'));
        LJIIIIZZ = C2097608Jq.LJIIJ(new Pair("nativeError", "native_error_ids"), new Pair("containerError", "container_error_ids"), new Pair("jsbError", "jsb_error_ids"), new Pair("res_loader_error_template", "res_template_error_ids"), new Pair("res_loader_error", "res_error_ids"), new Pair("fetchError", "fetch_error_ids"), new Pair("js_exception", "js_error_ids"), new Pair("static", "static_error_ids"));
        LJIIIZ = C2097608Jq.LJIIIIZZ(new Pair("lynx", EnumC1514560pW2.Lynx), new Pair("web", EnumC1514560pW2.Web));
    }

    public final JSONObject LIZLLL() {
        JSONObject jSONObject = new JSONObject();
        synchronized (this.LIZ) {
            try {
                for (Map.Entry entry : ((LinkedHashMap) this.LIZ).entrySet()) {
                    String str = (String) ((LinkedHashMap) LJIIIIZZ).get(entry.getKey());
                    if (str != null) {
                        jSONObject.put(str, C13LP.LJJLIIIJ(C13LP.LJLLJ(C13LP.LJJJJI((Iterable) entry.getValue())), ",", null, null, 0, null, null, 62));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jSONObject;
    }

    public static String LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList();
        int i = 0;
        String strLIZIZ = "";
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (LJI.contains(Character.valueOf(cCharAt))) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(cCharAt);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else if (LJII.contains(Character.valueOf(cCharAt))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ);
                sbLIZ2.append(cCharAt);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                i++;
            } else if (!a0.LJJIJ("\\", cCharAt) && strLIZIZ.length() > 0) {
                char[] charArray = "_-./%?=:&@".toCharArray();
                String strLJLIL = a0.LJLIL(strLIZIZ, Arrays.copyOf(charArray, charArray.length));
                if (strLJLIL.length() > 0 && (i == 0 || LJ(strLJLIL))) {
                    arrayList.add(strLJLIL);
                }
                i = 0;
                strLIZIZ = "";
            }
        }
        char[] charArray2 = "_-./%?=:&@".toCharArray();
        String strLJLIL2 = a0.LJLIL(strLIZIZ, Arrays.copyOf(charArray2, charArray2.length));
        if (strLJLIL2.length() > 0 && (i == 0 || LJ(strLJLIL2))) {
            arrayList.add(strLJLIL2);
        }
        ArrayList arrayList2 = new ArrayList();
        for (String strLJFF : arrayList) {
            if (LJ(strLJFF)) {
                strLJFF = LJFF(strLJFF);
                if (strLJFF != null) {
                    arrayList2.add(strLJFF);
                }
            } else if (strLJFF.length() > 0) {
                arrayList2.add(strLJFF);
            }
        }
        return C13LP.LJJLIIIJ(arrayList2, "", null, null, 0, null, null, 62);
    }

    public static boolean LJ(String str) {
        if (str != null) {
            if (u.LJJIIJZLJL(str, "http://", false) || u.LJJIIJZLJL(str, "https://", false)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LJFF(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return "";
        }
        try {
            URL url = new URL(str);
            List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(url.getPath(), new String[]{"/"}, 0, 6);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
            for (String str2 : listLJJLIIIJILLIZJL) {
                if (!u.LJIIZILJ(str2, ".js", false) && !u.LJIIZILJ(str2, ".css", false)) {
                    int i = 0;
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        if (LJII.contains(Character.valueOf(str2.charAt(i2)))) {
                            i++;
                        }
                    }
                    if (i > 6) {
                        str2 = "*";
                    }
                }
                arrayList.add(str2);
            }
            String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "/", null, null, 0, null, null, 62);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(url.getProtocol());
            sbLIZ.append("://");
            sbLIZ.append(url.getHost());
            sbLIZ.append(strLJJLIIIJ);
            return C2188811AlT.LIZIZ(sbLIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    public final int LIZIZ(String str) {
        ?? r3 = this.LIZLLL;
        if (Intrinsics.LJFF(str, "lynx")) {
            List listLJIIJJI = C1697810uHb.LJIIJJI("set", "upd");
            if (!(listLJIIJJI instanceof Collection) || !listLJIIJJI.isEmpty()) {
                Iterator it2 = listLJIIJJI.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (this.LIZIZ.contains(it2.next())) {
                        r3 = (r3 == true ? 1 : 0) | 2;
                        break;
                    }
                }
            }
        }
        if (this.LJ) {
            return r3 | 4;
        }
        return r3;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(X.C1520220pfA r10, java.lang.String r11) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1520140pf2.LIZJ(X.0pfA, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C1520560pfi r19, java.lang.String r20) throws java.lang.InterruptedException {
        /*
            Method dump skipped, instruction units count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1520140pf2.LJI(X.0pfi, java.lang.String):void");
    }
}
