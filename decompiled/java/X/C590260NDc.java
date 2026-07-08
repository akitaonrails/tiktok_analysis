package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0NDc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C590260NDc {
    public static String LIZ = "";
    public static C0NHH LIZIZ;

    public static List LIZ(String str, C0NDM c0ndm) {
        C0N9C c0n9c;
        String str2;
        String str3;
        Aweme aweme;
        long j;
        String str4;
        boolean z;
        try {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{","}, 0, 6);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listLJJLIIIJILLIZJL) {
                if (((String) obj).length() <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(obj);
                }
            }
            C0NDV.LIZ.getClass();
            List<C590280NDe> listLJ = C0NDV.LJ(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (C590280NDe c590280NDe : listLJ) {
                C0NDM c0ndm2 = C0NDM.UNCONSUMED_CACHE;
                if (c0ndm == c0ndm2) {
                    c0n9c = C0N9C.FEED_UNCONSUMED;
                } else {
                    c0n9c = C0N9C.COLD_CACHE;
                }
                if (c590280NDe == null || (str2 = c590280NDe.LJIILL) == null) {
                    str2 = "";
                }
                if (c590280NDe == null || (str3 = c590280NDe.LIZ) == null) {
                    str3 = "";
                }
                if (c590280NDe != null) {
                    C0NDV c0ndv = C0NDV.LIZ;
                    List listSingletonList = Collections.singletonList(c590280NDe);
                    c0ndv.getClass();
                    aweme = (Aweme) C13LP.LJJJLL(C0NDV.LIZLLL(listSingletonList));
                } else {
                    aweme = null;
                }
                long j2 = 0;
                if (c590280NDe != null) {
                    j = c590280NDe.LJIIJ;
                } else {
                    j = 0;
                }
                if (c590280NDe != null) {
                    j2 = c590280NDe.LJIIIZ;
                }
                if (c0ndm != c0ndm2) {
                    str4 = "cold_cache";
                } else {
                    str4 = "unconsumed_cache";
                }
                arrayList2.add(new C0NHH(c0n9c, str3, str2, aweme, str4, j, j2, c590280NDe));
            }
            return arrayList2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (C797930VRv.LIZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("getCacheDBAwemeList e");
                sbLIZ.append(th);
                C797930VRv.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            }
            return C13BV.INSTANCE;
        }
    }
}
