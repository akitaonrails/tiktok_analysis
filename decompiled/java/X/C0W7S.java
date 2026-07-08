package X;

import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0W7S, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W7S {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(String str, Function0 function0) throws Throwable {
        String str2;
        String commerceAmazonApiKey = C0DHE.LIZ().getCommerceAmazonApiKey();
        String str3 = C0DHE.LIZ().domainList;
        if (str3.length() == 0) {
            str3 = ".shop-external.amazon,.social.amazon.com,.social.amazon.ca,social.amazon.com,social.amazon.ca";
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{","}, 0, 6);
        if (listLJJLIIIJILLIZJL.isEmpty()) {
            return;
        }
        CookieManager cookieManagerA2 = C786410Ut5.A2();
        ArrayList<String> arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        for (String str4 : arrayList) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("x-aa-api-key=");
            sbLIZ.append(commerceAmazonApiKey);
            sbLIZ.append("; max-age=");
            sbLIZ.append(3600);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("x-aa-customer-token=");
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            sbLIZ2.append(str2);
            sbLIZ2.append("; max-age=");
            sbLIZ2.append(3600);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("session-aa-os-name=ANDROID; max-age=");
            sbLIZ3.append(172800);
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("SameSite=None; max-age=");
            sbLIZ4.append(172800);
            String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ4);
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("session-aa-os-version=");
            sbLIZ5.append(Build.VERSION.RELEASE);
            sbLIZ5.append("; max-age=");
            sbLIZ5.append(172800);
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ5);
            LIZ(cookieManagerA2, str4, strLIZIZ);
            LIZ(cookieManagerA2, str4, strLIZIZ2);
            LIZ(cookieManagerA2, str4, strLIZIZ3);
            LIZ(cookieManagerA2, str4, strLIZIZ4);
            LIZ(cookieManagerA2, str4, strLIZIZ5);
        }
        cookieManagerA2.flush();
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static void LIZ(CookieManager cookieManager, String str, String str2) throws Throwable {
        String strLLIZ;
        C2204961BRm.LLJ(cookieManager, str, str2, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOulYoXB0nwCRDomivSPk2/uWNs4Kgqw", null));
        if (C2162308dZ.LJI(C1BWL.LIZ()) && C0C25.LIZ() && (strLLIZ = C2204961BRm.LLIZ(CookieManager.getInstance(), C818020W7c.LIZIZ(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOulYoXB0nwCRDomivSPk2/uWNs4Kgqw", null))) != null && !TextUtils.equals(strLLIZ, C818020W7c.LIZ())) {
            C818020W7c.LIZJ(C818020W7c.LIZIZ(), strLLIZ);
        }
    }
}
