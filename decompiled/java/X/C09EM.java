package X;

import com.bytedance.pia.core.utils.GsonUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.google.gson.p;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Iterator;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: X.09EM, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09EM {
    public static final n LIZ(String str) {
        if (str == null) {
            str = "";
        }
        return LIZIZ(new ByteArrayInputStream(str.getBytes(Charsets.UTF_8)), null, 3);
    }

    public static n LIZIZ(InputStream inputStream, String str, int i) {
        int i2;
        int iMax;
        Object c098200Yq;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            i2 = 1024;
        } else {
            i2 = 0;
        }
        C09EN c09en = C09EN.LL;
        try {
            C1957407lc c1957407lcLIZ = C08KH.LIZ(i2, inputStream, str);
            StringBuilder sb = new StringBuilder();
            Iterator<Object> it2 = c1957407lcLIZ.iterator();
            do {
                C2152008bu c2152008bu = (C2152008bu) it2;
                if (c2152008bu.hasNext()) {
                    char[] cArr = (char[]) c2152008bu.next();
                    iMax = Math.max(0, sb.length() - 32);
                    sb.append(cArr);
                    if (C09EN.LL == c09en) {
                        Integer numValueOf = Integer.valueOf(sb.indexOf("<script pia-manifest", iMax));
                        if (numValueOf.intValue() != -1) {
                            int iIntValue = numValueOf.intValue();
                            c09en = C09EN.LLILLJJLI;
                            sb.delete(0, iIntValue + 20);
                            iMax = 0;
                        }
                    }
                    if (C09EN.LLILLJJLI == c09en) {
                        Integer numValueOf2 = Integer.valueOf(sb.indexOf("type=\"application/json\">", iMax));
                        if (numValueOf2.intValue() != -1) {
                            int iIntValue2 = numValueOf2.intValue();
                            c09en = C09EN.LLILLL;
                            sb.delete(0, iIntValue2 + 24);
                            iMax = 0;
                        }
                    }
                    if (C09EN.LLILLL == c09en) {
                        Integer numValueOf3 = Integer.valueOf(sb.indexOf("</script>", iMax));
                        if (numValueOf3.intValue() != -1) {
                            sb.delete(numValueOf3.intValue(), sb.length());
                            try {
                                p pVar = GsonUtils.LIZIZ;
                                String string = sb.toString();
                                pVar.getClass();
                                c098200Yq = p.LIZJ(string).LJIILIIL();
                                C189200o6.m2constructorimpl(c098200Yq);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                c098200Yq = new C098200Yq(th);
                                C189200o6.m2constructorimpl(c098200Yq);
                            }
                            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                                c098200Yq = null;
                            }
                            return (n) c098200Yq;
                        }
                    }
                } else {
                    C189200o6.m2constructorimpl(sb);
                    return null;
                }
            } while (sb.indexOf("</head>", iMax) == -1);
            return null;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
            return null;
        }
    }
}
