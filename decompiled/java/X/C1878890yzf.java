package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0yzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878890yzf {
    public static final void LIZJ(String str) {
        try {
            String strOptString = new JSONObject(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "header_info")).optString("header_image_url");
            if (strOptString.length() == 0) {
                return;
            }
            C1819620xS4.LIZ().setUrl(strOptString).LJJIIJZLJL();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void LIZ(String str, String str2) {
        C1878910yzh c1878910yzh = C1878910yzh.LIZIZ;
        c1878910yzh.getClass();
        if (str.length() != 0) {
            ArrayList list = Collections.list(c1878910yzh.LIZ.keys());
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append('_');
                sbLIZ.append(str2);
                if (u.LJJIIJZLJL((String) obj, C2188811AlT.LIZIZ(sbLIZ), false)) {
                    arrayList.add(obj);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                InterfaceC1878900yzg interfaceC1878900yzgRemove = c1878910yzh.LIZ.remove(it2.next());
                if (interfaceC1878900yzgRemove != null) {
                    interfaceC1878900yzgRemove.destroy();
                }
            }
        }
    }

    public static final void LIZIZ(String str, Map<String, String> map) {
        C1878910yzh.LIZIZ.LIZ(str, map);
    }
}
