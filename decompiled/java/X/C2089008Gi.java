package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.08Gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2089008Gi {
    public final Map<String, List<String>> LIZ = new LinkedHashMap();
    public final String LIZIZ;

    public final String LJ() {
        String strEncode;
        if (this.LIZ.isEmpty()) {
            return this.LIZIZ;
        }
        Map<String, List<String>> map = this.LIZ;
        Pattern pattern = C2088908Gh.LIZ;
        StringBuilder sb = new StringBuilder();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            try {
                String strEncode2 = URLEncoder.encode((String) entry.getKey(), "UTF-8");
                List<String> list = (List) entry.getValue();
                if (list != null && list.size() > 0) {
                    for (String str : list) {
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
                        if (sb.length() > 0) {
                            sb.append("&");
                        }
                        sb.append(strEncode2);
                        if (!strEncode.isEmpty()) {
                            sb.append("=");
                            sb.append(strEncode);
                        }
                    }
                }
            } catch (UnsupportedEncodingException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new IllegalArgumentException(e2);
            }
        }
        String string = sb.toString();
        String str2 = this.LIZIZ;
        if (str2 == null || str2.length() == 0) {
            return string;
        }
        if (this.LIZIZ.indexOf(63) >= 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append("&");
            sbLIZ.append(string);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(this.LIZIZ);
        sbLIZ2.append("?");
        sbLIZ2.append(string);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final String toString() {
        return LJ();
    }

    public C2089008Gi(String str) {
        this.LIZIZ = str;
    }

    public final void LIZ(double d, String str) {
        List<String> linkedList = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        linkedList.add(String.valueOf(d));
        this.LIZ.put(str, linkedList);
    }

    public final void LIZIZ(int i, String str) {
        List<String> linkedList = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        linkedList.add(String.valueOf(i));
        this.LIZ.put(str, linkedList);
    }

    public final void LIZJ(long j, String str) {
        List<String> linkedList = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        linkedList.add(String.valueOf(j));
        this.LIZ.put(str, linkedList);
    }

    public final void LIZLLL(String str, String str2) {
        List<String> linkedList = (List) ((LinkedHashMap) this.LIZ).get(str);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
        }
        linkedList.add(String.valueOf(str2));
        this.LIZ.put(str, linkedList);
    }
}
