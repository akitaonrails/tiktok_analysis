package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.011C, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C011C {
    public final Map<String, String> LIZ;
    public final Map<String, String> LIZIZ;
    public String LIZJ;
    public String LIZLLL;

    public C011C(String str) {
        Object c098200Yq;
        String strLIZIZ;
        String str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = linkedHashMap;
        this.LIZIZ = linkedHashMap;
        try {
            c098200Yq = UriProtector.parse(Uri.decode(str));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Uri uri = (Uri) (C189200o6.m7isFailureimpl(c098200Yq) ? null : c098200Yq);
        if (uri != null) {
            String scheme = uri.getScheme();
            String host = uri.getHost();
            if (Intrinsics.LJFF(scheme, "aweme") && Intrinsics.LJFF(host, "myna")) {
                ((LinkedHashMap) this.LIZ).clear();
                Iterator<T> it2 = UriProtector.getQueryParameterNames(uri).iterator();
                while (true) {
                    str2 = "";
                    if (!it2.hasNext()) {
                        break;
                    }
                    String str3 = (String) it2.next();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str3);
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                        str2 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
                    }
                    this.LIZ.put(str3, str2);
                }
                String str4 = (String) ((LinkedHashMap) this.LIZ).get("biz");
                str4 = (str4 == null || str4.length() <= 0) ? "" : str4;
                str4.toString();
                this.LIZJ = str4;
                String str5 = (String) ((LinkedHashMap) this.LIZ).get("url");
                if (str5 != null && str5.length() > 0) {
                    str2 = str5;
                }
                str2.toString();
                this.LIZLLL = str2;
                return;
            }
            if (!Intrinsics.LJFF(uri, Uri.EMPTY)) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(scheme == null ? "null" : scheme);
                sbLIZ.append("://");
                sbLIZ.append(host == null ? "null" : host);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                strLIZIZ = "empty or malformed URI";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Invalid schema: expected aweme://myna, got ");
            sbLIZ2.append(strLIZIZ);
            throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
