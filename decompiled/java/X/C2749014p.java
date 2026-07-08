package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.BcmKeyEntryPath;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.014p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2749014p {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str) {
        boolean z;
        String str2;
        String strOptString;
        boolean z2;
        boolean z3;
        String strOptString2;
        boolean z4;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return C2097608Jq.LJ();
        }
        List<BcmKeyEntryPath> list = C2751014r.LIZ().deepLinkBcmKeyList;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (BcmKeyEntryPath bcmKeyEntryPath : list) {
            Iterator<String> it2 = bcmKeyEntryPath.locationList.iterator();
            do {
                str2 = null;
                if (!it2.hasNext()) {
                    break;
                }
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(it2.next(), new String[]{e3.d}, 0, 6);
                try {
                    strOptString = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), (String) C13LP.LJJJJZI(listLJJLIIIJILLIZJL));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strOptString = null;
                }
                for (String str3 : C13LP.LJLLILLLL(listLJJLIIIJILLIZJL, C13LZ.LJIILJJIL(1, listLJJLIIIJILLIZJL.size()))) {
                    if (strOptString != null && strOptString.length() != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        break;
                    }
                    try {
                        strOptString2 = new JSONObject(strOptString).optString(str3);
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        strOptString2 = null;
                    }
                    if (strOptString2 != null && strOptString2.length() != 0) {
                        z4 = false;
                    } else {
                        z4 = true;
                    }
                    if (z4) {
                        try {
                            strOptString = new JSONObject(URLDecoder.decode(strOptString, "UTF-8")).optString(str3);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                            strOptString = null;
                        }
                    } else {
                        strOptString = strOptString2;
                    }
                }
                if (strOptString != null && strOptString.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    str2 = strOptString;
                }
            } while (str2 == null);
            if (str2 != null) {
                linkedHashMap.put(bcmKeyEntryPath.bcmKey, str2);
            }
        }
        return linkedHashMap;
    }
}
