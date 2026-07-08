package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.1BEx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2201691BEx {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, UrlModel urlModel, Long l, String str2) {
        List<String> urlList;
        boolean zLJI = MethodIDManager.LJI(137676);
        if (urlModel != null) {
            urlList = urlModel.getUrlList();
        } else {
            urlList = null;
        }
        LIZIZ(str, urlList, l, str2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZIZ(String str, List list, Long l, String str2) {
        Boolean bool;
        long jLongValue;
        boolean zLJI = MethodIDManager.LJI(137676);
        if (list != null && !list.isEmpty() && 0 == 0 && (bool = Boolean.TRUE) != null) {
            bool.booleanValue();
            C2201711BEz c2201711BEz = new C2201711BEz();
            c2201711BEz.LJFF = str;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            c2201711BEz.LIZ = jLongValue;
            c2201711BEz.LIZJ = list;
            c2201711BEz.LIZLLL = str2;
            c2201711BEz.LIZIZ = true;
            c2201711BEz.LJ = null;
            c2201711BEz.LJI = true;
            C2201531BEh.LIZ().LIZJ(c2201711BEz.LIZ());
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public static void LIZJ(String str, List list, Long l, String str2) {
        boolean zLJI = MethodIDManager.LJI(137676);
        LIZIZ(str, list, l, str2);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
