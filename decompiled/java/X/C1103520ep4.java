package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ep4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1103520ep4 {
    public static final C1103520ep4 LIZ = new C1103520ep4();
    public static final C098J<String, C1103510ep3> LIZIZ = new C098J<>(5);

    public static boolean LJ(String str) {
        if (str == null || str.length() == 0 || Intrinsics.LJFF(str, CardStruct.IStatusCode.DEFAULT) || Intrinsics.LJFF(str, "null")) {
            return false;
        }
        return true;
    }

    public final synchronized C1103510ep3 LIZIZ(String str) {
        C1103510ep3 c1103510ep3;
        C098J<String, C1103510ep3> c098j = LIZIZ;
        c1103510ep3 = c098j.get(str);
        if (c1103510ep3 == null) {
            c1103510ep3 = new C1103510ep3();
            c098j.put(str, c1103510ep3);
        }
        return c1103510ep3;
    }

    public static String LIZ(String str, String str2) {
        String[] strArr = new String[2];
        if (str2 == null || !LJ(str2)) {
            str2 = null;
        }
        strArr[0] = str2;
        if (str == null || !LJ(str)) {
            str = null;
        }
        strArr[1] = str;
        List listLJIJI = C13LQ.LJIJI(strArr);
        if (!(!((ArrayList) listLJIJI).isEmpty())) {
            return null;
        }
        return C13LP.LJJLIIIJ(listLJIJI, ":", null, null, 0, null, null, 62);
    }

    public static C1822320xWQ LIZJ(String str, String str2) {
        C1103510ep3 c1103510ep3;
        String strLIZ = LIZ(str, str2);
        if (strLIZ == null || (c1103510ep3 = LIZIZ.get(strLIZ)) == null) {
            return null;
        }
        return c1103510ep3.LIZ;
    }

    public static AbstractC1103480ep0 LIZLLL(String str, String str2) {
        C11PQ<AbstractC1103480ep0> c11pq;
        AbstractC1103480ep0 abstractC1103480ep0LJLZ;
        String strLIZ = LIZ(str, str2);
        if (strLIZ == null) {
            return C1103380eoq.LIZ;
        }
        C1103510ep3 c1103510ep3 = LIZIZ.get(strLIZ);
        if (c1103510ep3 != null && (c11pq = c1103510ep3.LIZIZ) != null && (abstractC1103480ep0LJLZ = c11pq.LJLZ()) != null) {
            return abstractC1103480ep0LJLZ;
        }
        return C1103380eoq.LIZ;
    }

    public static void LJI(String str, String str2, AbstractC1103480ep0 abstractC1103480ep0) {
        C1103510ep3 c1103510ep3;
        C11PQ<AbstractC1103480ep0> c11pq;
        String strLIZ = LIZ(str, str2);
        if (strLIZ != null && (c1103510ep3 = LIZIZ.get(strLIZ)) != null && (c11pq = c1103510ep3.LIZIZ) != null) {
            c11pq.onNext(abstractC1103480ep0);
        }
    }

    public final void LJFF(String str, String str2, C1822320xWQ c1822320xWQ) {
        String strLIZ = LIZ(str, str2);
        if (strLIZ == null) {
            return;
        }
        LIZIZ(strLIZ).LIZ = c1822320xWQ;
    }
}
