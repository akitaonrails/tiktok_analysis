package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.01jq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C417601jq {
    public final InterfaceC1631620sYq<String, String, String, String> LIZ;
    public String LIZIZ;
    public final Uri LIZJ;
    public final LinkedHashMap<String, List<String>> LIZLLL;

    public C417601jq(String str, C487901vB c487901vB) {
        Uri uri;
        String strSubstring;
        String strSubstring2;
        this.LIZ = c487901vB;
        this.LIZIZ = str;
        LinkedHashMap<String, List<String>> linkedHashMap = null;
        try {
            uri = UriProtector.parse(str);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            uri = null;
        }
        this.LIZJ = uri;
        if (uri != null) {
            String encodedQuery = uri.getEncodedQuery();
            linkedHashMap = new LinkedHashMap<>();
            if (encodedQuery != null && encodedQuery.length() != 0) {
                for (String str2 : a0.LJJLIIIJ(encodedQuery, new char[]{'&'}, false, 0, 6)) {
                    if (str2.length() != 0) {
                        int iLJJIZ = a0.LJJIZ(str2, '=', 0, false, 6);
                        if (iLJJIZ >= 0) {
                            strSubstring = str2.substring(0, iLJJIZ);
                            strSubstring2 = str2.substring(iLJJIZ + 1);
                        } else {
                            strSubstring = str2;
                            strSubstring2 = "";
                        }
                        String strDecode = Uri.decode(strSubstring);
                        if (strDecode.length() != 0) {
                            String strDecode2 = Uri.decode(strSubstring2);
                            List<String> arrayList = linkedHashMap.get(strDecode);
                            if (arrayList == null) {
                                arrayList = new ArrayList<>();
                                linkedHashMap.put(strDecode, arrayList);
                            }
                            arrayList.add(strDecode2);
                        }
                    }
                }
            }
        }
        this.LIZLLL = linkedHashMap;
    }

    public final void LIZ(String str, String str2) {
        LinkedHashMap<String, List<String>> linkedHashMap = this.LIZLLL;
        if (linkedHashMap == null) {
            this.LIZIZ = this.LIZ.invoke(this.LIZIZ, str, str2);
            return;
        }
        List<String> list = linkedHashMap.get(str);
        if (list == null) {
            linkedHashMap.put(str, C1697810uHb.LJIILJJIL(str2));
        } else {
            list.clear();
            list.add(str2);
        }
    }
}
