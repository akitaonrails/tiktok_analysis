package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.07lL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1955707lL {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.HashMap, java.util.LinkedHashMap] */
    public static C1955807lM LIZ(String str) {
        String path;
        ?? LJ;
        List listLJJLIIIJILLIZJL;
        try {
            Uri uriLJ = C1946007jm.LJ(str);
            if (Intrinsics.LJFF(uriLJ, Uri.EMPTY)) {
                return null;
            }
            String strLIZJ = C1946007jm.LIZJ(uriLJ, "channel");
            String strLIZJ2 = C1946007jm.LIZJ(uriLJ, "bundle");
            if (strLIZJ != null && strLIZJ2 != null) {
                return new C1955807lM(strLIZJ, strLIZJ2, null, null);
            }
            String strLIZJ3 = C1946007jm.LIZJ(uriLJ, "url");
            if (strLIZJ3 == null && (strLIZJ3 = C1946007jm.LIZJ(uriLJ, "surl")) == null) {
                return null;
            }
            List listLJIILJJIL = C1697810uHb.LJIILJJIL("ecom_prefix");
            for (Pattern pattern : (ArrayList) C1553670qX7.LIZJ()) {
                if (pattern.toString().length() > 0) {
                    listLJIILJJIL.add(pattern.toString());
                }
            }
            Iterator it2 = listLJIILJJIL.iterator();
            while (it2.hasNext()) {
                C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(strLIZJ3, (String) it2.next());
                if (c1533510q0bLIZIZ != null) {
                    if (strLIZJ2 == null) {
                        strLIZJ2 = c1533510q0bLIZIZ.LIZJ;
                    }
                    if (strLIZJ == null) {
                        strLIZJ = c1533510q0bLIZIZ.LIZIZ;
                    }
                    return new C1955807lM(strLIZJ, strLIZJ2, null, null);
                }
            }
            if (strLIZJ == null && strLIZJ2 == null) {
                Uri uriLJ2 = C1946007jm.LJ(strLIZJ3);
                path = uriLJ2.getPath();
                String query = uriLJ2.getQuery();
                if (query != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(query, new String[]{"&"}, 0, 6)) != null) {
                    ArrayList<List> arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
                    Iterator it3 = listLJJLIIIJILLIZJL.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(a0.LJJLIIIJILLIZJL((String) it3.next(), new String[]{"="}, 0, 6));
                    }
                    int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList, 10));
                    if (iLIZIZ < 16) {
                        iLIZIZ = 16;
                    }
                    LJ = new LinkedHashMap(iLIZIZ);
                    for (List list : arrayList) {
                        Object obj = list.get(0);
                        String str2 = (String) C13LP.LJJJLZIJ(1, list);
                        if (str2 == null) {
                            str2 = "";
                        }
                        Pair pair = new Pair(obj, str2);
                        LJ.put(pair.getFirst(), pair.getSecond());
                    }
                } else {
                    LJ = C2097608Jq.LJ();
                }
            } else {
                path = null;
                LJ = 0;
            }
            return new C1955807lM(strLIZJ, strLIZJ2, path, LJ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1205490hTX.LIZ.LJ(C1EMR.SPARK_INTERCEPTOR_ERR, e);
            return null;
        }
    }
}
