package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.n;
import com.ss.android.ugc.aweme.pipo.cashier.common.pay.api.Configuration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: renamed from: X.0ufY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1712660ufY {
    public static final C1712660ufY LIZ = new C1712660ufY();

    public static String LIZ(List list, n nVar) {
        try {
            ArrayList arrayList = new ArrayList();
            h hVar = new h();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C1712690ufb c1712690ufb = (C1712690ufb) it2.next();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(c1712690ufb.LLJ);
                    sbLIZ.append(c1712690ufb.LL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    if (!arrayList.contains(strLIZIZ)) {
                        arrayList.add(strLIZIZ);
                        n nVar2 = new n();
                        nVar2.LJJIIJ("refund_payment_method_id", c1712690ufb.LLJ);
                        nVar2.LJJIIJ("title", c1712690ufb.LL);
                        nVar2.LJJIIJ("icon_url", c1712690ufb.LLILZ);
                        nVar2.LJJIIJ("dark_mode_icon_url", c1712690ufb.LLILZIL);
                        if (nVar != null) {
                            nVar2.LJJIFFI("refund_arriving_time", nVar);
                        }
                        hVar.LJJIFFI(nVar2);
                    }
                }
            }
            return hVar.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    public static String LIZIZ(String str, List list) {
        String str2 = str;
        String string = "";
        try {
            n nVar = new n();
            nVar.LJJIFFI("configuration", new Configuration(null, null, null, null, null, null, null, null, null, null, 1023, null).LIZ());
            if (str2 == null) {
                str2 = "";
            }
            nVar.LJJIIJ("credit_token", str2);
            h hVar = new h();
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C1712690ufb c1712690ufb = (C1712690ufb) it2.next();
                    n nVar2 = new n();
                    nVar2.LJJIIJ("payment_method_id", c1712690ufb.LLIZ);
                    nVar2.LJJIIJ("refund_decision_type", c1712690ufb.LLILZLL);
                    nVar2.LJJIIJ("refund_payment_method_id", c1712690ufb.LLJ);
                    nVar2.LJJIIJ("option_name", c1712690ufb.LLJILJIL);
                    hVar.LJJIFFI(nVar2);
                }
            }
            nVar.LJJIFFI("refund_method_details", hVar);
            string = nVar.toString();
            return string;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return string;
        }
    }

    public static String LIZJ(String str, EnumC1709240ua2 enumC1709240ua2) {
        Object c098200Yq;
        if (str == null) {
            return null;
        }
        try {
            c098200Yq = UriProtector.parse(str).buildUpon().appendQueryParameter("theme", enumC1709240ua2.name().toLowerCase(Locale.ROOT)).build().toString();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj = str;
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) == null) {
            obj = c098200Yq;
        }
        return (String) obj;
    }
}
