package X;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0WT9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WT9 {
    public static final C0WT9 LIZ = new C0WT9();

    public static void LIZJ() throws Throwable {
        Pair pair;
        C19895112sn c19895112sn;
        String[] stringArray = Keva.getRepo("IABClearCookieManager").getStringArray("record_url", new String[0]);
        if (stringArray.length == 0) {
            return;
        }
        C089E c089e = new C089E(stringArray);
        while (c089e.hasNext()) {
            String str = (String) c089e.next();
            try {
                str.getClass();
                C19895112sn c19895112sn2 = new C19895112sn(str);
                int i = c19895112sn2.LIZJ;
                if (i > 0) {
                    if (i == 1) {
                        c19895112sn = c19895112sn2;
                    } else {
                        C19864312np.LJIIL(c19895112sn2.LIZ, "Not under a public suffix: %s", i > 0);
                        int i2 = c19895112sn2.LIZJ - 1;
                        C823890WTr c823890WTr = C19895112sn.LJFF;
                        AbstractC19875512pd<String> abstractC19875512pd = c19895112sn2.LIZIZ;
                        String strLIZIZ = c823890WTr.LIZIZ(abstractC19875512pd.subList(i2, abstractC19875512pd.size()));
                        strLIZIZ.getClass();
                        c19895112sn = new C19895112sn(strLIZIZ);
                    }
                    pair = new Pair(c19895112sn.LIZ, String.valueOf(c19895112sn2.LIZIZ()));
                } else {
                    pair = new Pair(str, String.valueOf(c19895112sn2.LIZIZ()));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1490740otc c1490740otc = C1490740otc.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("extractMainDomain ");
                sbLIZ.append(str);
                sbLIZ.append(", exception ");
                sbLIZ.append(th.getMessage());
                sbLIZ.append('.');
                c1490740otc.LIZ(C2188811AlT.LIZIZ(sbLIZ), EnumC1490770otf.E, "SSPBase_");
                pair = new Pair(str, null);
            }
            String str2 = (String) pair.getFirst();
            if (str2 == null || (!a0.LJJIIZI(str2, "tiktok.", false) && !a0.LJJIIZI(str2, "tiktokv.", false))) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("https://");
                sbLIZ2.append(str);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ2), str);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("http://");
                sbLIZ3.append(str);
                LIZIZ(C2188811AlT.LIZIZ(sbLIZ3), str);
                if (str2 != null && str2.length() != 0 && !Intrinsics.LJFF(str2, str)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("https://");
                    sbLIZ4.append(str2);
                    LIZIZ(C2188811AlT.LIZIZ(sbLIZ4), str2);
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("http://");
                    sbLIZ5.append(str2);
                    LIZIZ(C2188811AlT.LIZIZ(sbLIZ5), str2);
                }
            }
        }
        C786410Ut5.A2().flush();
    }

    public static void LIZLLL(String str) {
        if (str == null) {
            return;
        }
        if ((!u.LJJIIJZLJL(str, "https://", false) && !u.LJJIIJZLJL(str, "http://", false)) || !((Boolean) C275680ArG.LIZ.getValue()).booleanValue()) {
            return;
        }
        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05XJ(str, null), 2);
    }

    public static void LIZIZ(String str, String str2) throws Throwable {
        char c = 1;
        char c2 = 0;
        char c3 = 3;
        char c4 = 2;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "opt_clear_cookie", true, false)) {
            CookieManager cookieManagerA2 = C786410Ut5.A2();
            String strLLIZ = C2204961BRm.LLIZ(cookieManagerA2, str, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbJTH2Xz1DVFwsJPxEzcGLeWznCA0beznSzQ=", null));
            if (strLLIZ != null && !a0.LJJJIL(strLLIZ)) {
                List listLJJLIIIJ = a0.LJJLIIIJ(strLLIZ, new char[]{';'}, false, 0, 6);
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ, 10));
                Iterator it2 = listLJJLIIIJ.iterator();
                while (it2.hasNext()) {
                    arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
                }
                ArrayList<String> arrayList2 = new ArrayList();
                for (Object obj : arrayList) {
                    String str3 = (String) obj;
                    if (str3.length() > 0 && a0.LJJIJ(str3, '=')) {
                        arrayList2.add(obj);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                for (String str4 : arrayList2) {
                    arrayList3.add(a0.LJLIIIL(a0.LJJLL('=', str4, str4)).toString());
                }
                if (!arrayList3.isEmpty()) {
                    List<String> listLJIIJJI = C1697810uHb.LJIIJJI("/", "/api", "/user", "/checkout", "/login", "/cart");
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append('.');
                    sbLIZ.append(str2);
                    List<String> listLJIIJJI2 = C1697810uHb.LJIIJJI(str2, C2188811AlT.LIZIZ(sbLIZ));
                    Iterator it3 = C13LP.LJJJJI(arrayList3).iterator();
                    while (it3.hasNext()) {
                        String str5 = ((String) it3.next()) + "=; Expires=Thu, 01 Jan 1970 00:00:00 GMT; Max-Age=0";
                        for (String str6 : listLJIIJJI) {
                            String[] strArr = new String[4];
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append(str5);
                            sbLIZ2.append("; Path=");
                            sbLIZ2.append(str6);
                            strArr[c2] = C2188811AlT.LIZIZ(sbLIZ2);
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append(str5);
                            sbLIZ3.append("; Path=");
                            sbLIZ3.append(str6);
                            sbLIZ3.append("; Secure");
                            strArr[c] = C2188811AlT.LIZIZ(sbLIZ3);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(str5);
                            sbLIZ4.append("; Path=");
                            sbLIZ4.append(str6);
                            sbLIZ4.append("; HttpOnly");
                            strArr[c4] = C2188811AlT.LIZIZ(sbLIZ4);
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(str5);
                            sbLIZ5.append("; Path=");
                            sbLIZ5.append(str6);
                            sbLIZ5.append("; Secure; HttpOnly");
                            strArr[c3] = C2188811AlT.LIZIZ(sbLIZ5);
                            Iterator it4 = C1697810uHb.LJIIJJI(strArr).iterator();
                            while (it4.hasNext()) {
                                LIZ(cookieManagerA2, str, (String) it4.next());
                            }
                            for (String str7 : listLJIIJJI2) {
                                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                                sbLIZ6.append(str5);
                                sbLIZ6.append("; Path=");
                                sbLIZ6.append(str6);
                                sbLIZ6.append("; Domain=");
                                sbLIZ6.append(str7);
                                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                                sbLIZ7.append(str5);
                                sbLIZ7.append("; Path=");
                                sbLIZ7.append(str6);
                                sbLIZ7.append("; Domain=");
                                sbLIZ7.append(str7);
                                sbLIZ7.append("; Secure");
                                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                                sbLIZ8.append(str5);
                                sbLIZ8.append("; Path=");
                                sbLIZ8.append(str6);
                                sbLIZ8.append("; Domain=");
                                sbLIZ8.append(str7);
                                sbLIZ8.append("; HttpOnly");
                                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                                sbLIZ9.append(str5);
                                sbLIZ9.append("; Path=");
                                sbLIZ9.append(str6);
                                sbLIZ9.append("; Domain=");
                                sbLIZ9.append(str7);
                                sbLIZ9.append("; Secure; HttpOnly");
                                c3 = 3;
                                Iterator it5 = C1697810uHb.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ6), C2188811AlT.LIZIZ(sbLIZ7), C2188811AlT.LIZIZ(sbLIZ8), C2188811AlT.LIZIZ(sbLIZ9)).iterator();
                                while (it5.hasNext()) {
                                    LIZ(cookieManagerA2, str, (String) it5.next());
                                }
                            }
                            c = 1;
                            c2 = 0;
                            c4 = 2;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        CookieManager cookieManagerA22 = C786410Ut5.A2();
        String strLLIZ2 = C2204961BRm.LLIZ(cookieManagerA22, str, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbJTH2Xz1DVFwsJPxEzcGLeWznCA0beznSzQ=", null));
        if (strLLIZ2 != null && !a0.LJJJIL(strLLIZ2)) {
            List listLJJLIIIJ2 = a0.LJJLIIIJ(strLLIZ2, new char[]{';'}, false, 0, 6);
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJ2, 10));
            Iterator it6 = listLJJLIIIJ2.iterator();
            while (it6.hasNext()) {
                arrayList4.add(a0.LJLIIIL((String) it6.next()).toString());
            }
            ArrayList<String> arrayList5 = new ArrayList();
            for (Object obj2 : arrayList4) {
                String str8 = (String) obj2;
                if (str8.length() > 0 && a0.LJJIJ(str8, '=')) {
                    arrayList5.add(obj2);
                }
            }
            ArrayList arrayList6 = new ArrayList(C15438062q.LJIJJ(arrayList5, 10));
            for (String str9 : arrayList5) {
                arrayList6.add(a0.LJLIIIL(a0.LJJLL('=', str9, str9)).toString());
            }
            if (arrayList6.isEmpty()) {
                return;
            }
            Iterator it7 = C13LP.LJJJJI(arrayList6).iterator();
            while (it7.hasNext()) {
                String str10 = ((String) it7.next()) + "=; Expires=Thu, 01 Jan 1970 00:00:00 GMT; Max-Age=0";
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append(str10);
                sbLIZ10.append("; Path=/");
                StringBuilder sbLIZ11 = C2188811AlT.LIZ();
                sbLIZ11.append(str10);
                sbLIZ11.append("; Path=/; Domain=");
                sbLIZ11.append(str2);
                StringBuilder sbLIZ12 = C2188811AlT.LIZ();
                sbLIZ12.append(str10);
                sbLIZ12.append("; Path=/; Domain=.");
                sbLIZ12.append(str2);
                Iterator it8 = C1697810uHb.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ10), C2188811AlT.LIZIZ(sbLIZ11), C2188811AlT.LIZIZ(sbLIZ12)).iterator();
                while (it8.hasNext()) {
                    LIZ(cookieManagerA22, str, (String) it8.next());
                }
            }
        }
    }

    public static void LIZ(CookieManager cookieManager, String str, String str2) throws Throwable {
        String strLLIZ;
        C2204961BRm.LLJ(cookieManager, str, str2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbJTH2Xz1DVFwsJPxEzcGLeWznCA0beznSzQ=", null));
        if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ() && (strLLIZ = C2204961BRm.LLIZ(CookieManager.getInstance(), C818020W7c.LIZIZ(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbJTH2Xz1DVFwsJPxEzcGLeWznCA0beznSzQ=", null))) != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
            C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
        }
    }

    public static void LJ(String str, String str2, String str3) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJFF("enter_from", str3);
        if (str2 != null) {
            c2344009Gk.LJFF("type", str2);
        }
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }
}
