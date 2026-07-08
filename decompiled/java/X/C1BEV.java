package X;

import android.net.TrafficStats;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.1BEV, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEV {
    public final C1BEN LIZ;
    public final C1BEX LIZIZ;

    public C1BEV(C1BEN c1ben, List<InterfaceC2201661BEu> list) {
        C1BEP c1bep;
        this.LIZ = c1ben;
        list = list == null ? new ArrayList<>() : list;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            InterfaceC2201661BEu interfaceC2201661BEu = (InterfaceC2201661BEu) ListProtector.get(list, size);
            if (interfaceC2201661BEu instanceof C1BEP) {
                c1bep = (C1BEP) interfaceC2201661BEu;
                if (c1bep != null) {
                    list.remove(c1bep);
                }
            }
        }
        c1bep = new C1BEP() { // from class: X.0XId
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r5v0 */
            /* JADX WARN: Type inference failed for: r5v1 */
            /* JADX WARN: Type inference failed for: r5v2, types: [java.net.URLConnection] */
            /* JADX WARN: Type inference failed for: r5v3, types: [int] */
            /* JADX WARN: Type inference failed for: r5v4 */
            @Override // X.C1BEP
            public final C1BEW LIZLLL(C1BEZ c1bez, int i, boolean z) {
                String str = c1bez.LIZIZ;
                Map<String, List<String>> map = c1bez.LIZLLL;
                ?? r5 = 0;
                if (TextUtils.isEmpty(str)) {
                    return C1BEW.LIZ(new IllegalArgumentException("empty url"), null);
                }
                try {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) C2204961BRm.e0(new URL(str), new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+KI3kfbEHZhg7jir6VAyV6Of1RAWJ6K4rlNhPOF/o89sdm/ERHplTJB1goCaJn1L93okN4qlGhFQgqBWLeI=", null));
                    r5 = (i > 0L ? 1 : (i == 0L ? 0 : -1));
                    if (r5 > 0) {
                        try {
                            httpURLConnection.setConnectTimeout(i);
                            httpURLConnection.setReadTimeout(i);
                        } catch (Throwable th) {
                            th = th;
                            r5 = httpURLConnection;
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                th.getMessage();
                                C1BEW c1bewLIZ = C1BEW.LIZ(th, c1bez);
                                if (r5 != 0) {
                                    try {
                                        C846380XIe.LIZ(r5.getInputStream());
                                        return c1bewLIZ;
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                        return c1bewLIZ;
                                    }
                                }
                                return c1bewLIZ;
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                if (r5 != 0) {
                                    try {
                                        C846380XIe.LIZ(r5.getInputStream());
                                        throw th3;
                                    } catch (Throwable th4) {
                                        TryCatchGuardChecker.doCheck(th4);
                                        throw th3;
                                    }
                                }
                                throw th3;
                            }
                        }
                    }
                    httpURLConnection.setInstanceFollowRedirects(z);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod(c1bez.LIZJ);
                    if (map != null) {
                        for (String str2 : map.keySet()) {
                            List<String> list2 = map.get(str2);
                            if (list2 != null && list2.size() != 0) {
                                StringBuilder sb = new StringBuilder();
                                Iterator<String> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    sb.append(it2.next());
                                }
                                String string = sb.toString();
                                if (!TextUtils.isEmpty(string)) {
                                    httpURLConnection.setRequestProperty(str2, string);
                                }
                            }
                        }
                    }
                    TrafficStats.setThreadStatsTag(0);
                    httpURLConnection.connect();
                    C1BEW c1bew = new C1BEW(httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), c1bez, null);
                    try {
                        C846380XIe.LIZ(httpURLConnection.getInputStream());
                        return c1bew;
                    } catch (Throwable th5) {
                        TryCatchGuardChecker.doCheck(th5);
                        return c1bew;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        };
        C1BEN c1ben2 = this.LIZ;
        c1bep.LIZ = c1ben2;
        C1BEX c1bex = new C1BEX(c1ben2, c1bep);
        this.LIZIZ = c1bex;
        if (!list.isEmpty()) {
            Iterator<InterfaceC2201661BEu> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next() == null) {
                    it2.remove();
                }
            }
            if (!list.isEmpty()) {
                ((ArrayList) c1bex.LIZ).addAll(r1.size() - 1, list);
            }
        }
    }
}
