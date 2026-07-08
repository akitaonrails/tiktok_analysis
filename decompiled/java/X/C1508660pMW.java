package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0pMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508660pMW {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public final String[] LIZ = {"CN", "MR", "SA", "FR", "AE"};

    public final void LIZ(StringBuilder sb) {
        String strEncode;
        if (sb.toString().indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append("&");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZJ(linkedHashMap);
        ArrayList<Pair> arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue()));
        }
        StringBuilder sb2 = new StringBuilder();
        for (Pair pair : arrayList) {
            try {
                String strEncode2 = URLEncoder.encode((String) pair.first, "UTF-8");
                String str = (String) pair.second;
                if (str != null) {
                    try {
                        strEncode = URLEncoder.encode(str, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IllegalArgumentException(e);
                    }
                } else {
                    strEncode = "";
                }
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append(strEncode2);
                sb2.append("=");
                sb2.append(strEncode);
            } catch (UnsupportedEncodingException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalArgumentException(e2);
            }
        }
        sb.append(sb2.toString());
    }

    public final C1508680pMY LIZIZ(C1508680pMY c1508680pMY) {
        String str = c1508680pMY.LIZ;
        if (!TextUtils.isEmpty(str)) {
            StringBuilder sb = new StringBuilder(str);
            LIZ(sb);
            c1508680pMY.LIZ = sb.toString();
        }
        return c1508680pMY;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.util.Map<java.lang.String, java.lang.String> r6) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1508660pMW.LIZJ(java.util.Map):void");
    }
}
