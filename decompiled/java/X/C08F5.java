package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.08F5, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08F5 {
    public static boolean LIZIZ(String str) {
        if (str != null) {
            String host = "";
            if (!str.equals("")) {
                try {
                    host = new URL(str).getHost();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    int i = C2187451AjH.LIZ;
                    TTVideoEngineLog.d(e);
                }
                if (PatternProtector.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(host).find()) {
                    return true;
                }
                int iIndexOf = str.indexOf(e3.e);
                int iIndexOf2 = str.indexOf(e3.f);
                if (iIndexOf > 0 && iIndexOf2 > iIndexOf && str.substring(iIndexOf, iIndexOf2).indexOf(":") > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static List<String> LIZ(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArrSplit = str.split("[?]");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[0];
        String str4 = strArrSplit[1];
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str2);
        sbLIZ.append("=");
        int iIndexOf = str4.indexOf(C2188811AlT.LIZIZ(sbLIZ));
        if (iIndexOf == -1) {
            return null;
        }
        arrayList.add(str3);
        arrayList.add("?");
        arrayList.add(str4.substring(0, iIndexOf));
        int iIndexOf2 = str4.indexOf("&", iIndexOf);
        if (iIndexOf2 == -1) {
            arrayList.add(str4.substring(iIndexOf));
            return arrayList;
        }
        arrayList.add(str4.substring(iIndexOf, iIndexOf2));
        arrayList.add(str4.substring(iIndexOf2));
        return arrayList;
    }
}
