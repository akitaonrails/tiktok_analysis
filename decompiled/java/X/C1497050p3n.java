package X;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0p3n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497050p3n {
    public final C1497040p3m LIZ = new C1497040p3m(this);
    public final ExecutorService LIZIZ = C786410Ut5.h4();
    public final Map<String, FutureTask<JSONObject>> LIZJ = new HashMap();
    public final ConcurrentHashMap<String, C1488880oqc> LIZLLL = new ConcurrentHashMap<>();
    public String LJ;
    public String LJFF;
    public boolean LJI;

    public final void LIZ(final String str) {
        String scheme;
        if (this.LJI) {
            this.LJI = false;
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final C1497040p3m c1497040p3m = this.LIZ;
        c1497040p3m.getClass();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str) && (scheme = UriProtector.parse(str).getScheme()) != null) {
            if (scheme.equals("http") || scheme.equals("https")) {
                if (c1497040p3m.LIZ != null && c1497040p3m.LIZ.LIZIZ(str)) {
                    return;
                }
                C1488880oqc c1488880oqc = new C1488880oqc();
                c1488880oqc.LIZIZ = SystemClock.uptimeMillis();
                ((ConcurrentHashMap) c1488880oqc.LIZ).put("scc_cloudservice_url", str);
                c1497040p3m.LIZIZ.LIZLLL.put(str, c1488880oqc);
                FutureTask futureTask = new FutureTask(new Callable<JSONObject>(str) { // from class: X.0p3k
                    public final String LL;

                    /* JADX WARN: Removed duplicated region for block: B:77:0x0275  */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final org.json.JSONObject call() {
                        /*
                            Method dump skipped, instruction units count: 654
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.CallableC1497020p3k.call():java.lang.Object");
                    }

                    public static JSONObject LIZ(String str2) {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("code", 0);
                            jSONObject.put("message", "ok");
                            jSONObject.put("scc_reason", str2);
                            jSONObject.put("scc_passed_time", 0);
                            jSONObject.put("scc_logid", "");
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("label", "allow");
                            jSONObject.put("data", jSONObject2);
                            return jSONObject;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            return null;
                        }
                    }

                    {
                        this.LL = str;
                    }
                });
                ((HashMap) c1497040p3m.LIZIZ.LIZJ).put(str, futureTask);
                c1497040p3m.LIZIZ.LIZIZ.execute(futureTask);
            }
        }
    }

    public final JSONObject LIZIZ(String str) {
        JSONObject jSONObject;
        C1497040p3m c1497040p3m = this.LIZ;
        c1497040p3m.getClass();
        JSONObject jSONObject2 = null;
        if (!TextUtils.isEmpty(str)) {
            String strLIZIZ = C1934607hw.LIZIZ(str);
            if (((HashMap) c1497040p3m.LIZIZ.LIZJ).containsKey(strLIZIZ) && c1497040p3m.LIZ != null) {
                FutureTask futureTask = (FutureTask) ((HashMap) c1497040p3m.LIZIZ.LIZJ).get(strLIZIZ);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("will wait response, url: ");
                sbLIZ.append(strLIZIZ);
                C2188811AlT.LIZIZ(sbLIZ);
                C1488880oqc c1488880oqc = c1497040p3m.LIZIZ.LIZLLL.get(strLIZIZ);
                if (c1488880oqc != null && c1488880oqc.LIZJ != 0) {
                    c1488880oqc.LIZJ = SystemClock.uptimeMillis();
                }
                try {
                    jSONObject = (JSONObject) futureTask.get();
                    if (c1488880oqc != null) {
                        try {
                            c1488880oqc.LIZ("", true);
                        } catch (Exception e) {
                            e = e;
                            TryCatchGuardChecker.doCheck(e);
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("getCloudServiceLabel exception! ");
                            sbLIZ2.append(e);
                            C2188811AlT.LIZIZ(sbLIZ2);
                            if (c1488880oqc != null) {
                                c1488880oqc.LIZ(e.toString(), false);
                            }
                        }
                    }
                } catch (Exception e2) {
                    e = e2;
                    jSONObject = null;
                }
                jSONObject2 = jSONObject;
                c1497040p3m.LIZIZ.LIZLLL.remove(strLIZIZ);
                if (jSONObject2 != null) {
                    C786410Ut5.J3(jSONObject2);
                }
                ((HashMap) c1497040p3m.LIZIZ.LIZJ).remove(strLIZIZ);
            }
        }
        return jSONObject2;
    }

    public final void LIZJ(String str) {
        C1497040p3m c1497040p3m = this.LIZ;
        c1497040p3m.LIZIZ();
        C1497030p3l c1497030p3l = c1497040p3m.LIZ;
        c1497030p3l.getClass();
        if (!TextUtils.isEmpty(str)) {
            String strLIZIZ = C1934607hw.LIZIZ(str);
            ((ReentrantReadWriteLock) c1497030p3l.LJIIJ).writeLock().lock();
            ((ArrayDeque) c1497030p3l.LIZJ).offer(strLIZIZ);
            while (((ArrayDeque) c1497030p3l.LIZJ).size() > 10) {
                ((ArrayDeque) c1497030p3l.LIZJ).poll();
            }
            ((ReentrantReadWriteLock) c1497030p3l.LJIIJ).writeLock().unlock();
        }
    }

    public final void LIZLLL(String str) {
        String strLIZIZ = C1934607hw.LIZIZ(str);
        synchronized (this) {
            try {
                this.LJFF = strLIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strLIZIZ = C1934607hw.LIZIZ(str);
        synchronized (this) {
            try {
                if (!TextUtils.equals(this.LJFF, strLIZIZ)) {
                    return false;
                }
                this.LJFF = null;
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final WebResourceResponse LJFF(String str) {
        C1496950p3d c1496950p3dLIZIZ;
        String str2;
        C1497040p3m c1497040p3m = this.LIZ;
        if (c1497040p3m.LIZ != null) {
            C1497030p3l c1497030p3l = c1497040p3m.LIZ;
            synchronized (c1497030p3l) {
                try {
                    C1497060p3o c1497060p3o = c1497030p3l.LJFF;
                    if (c1497060p3o != null) {
                        c1496950p3dLIZIZ = c1497060p3o.LIZIZ(str);
                        c1497030p3l.LJFF.LIZJ(str);
                    } else {
                        c1496950p3dLIZIZ = null;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("will use scc prefetch response: ");
            if (c1496950p3dLIZIZ == null) {
                str2 = "null";
            } else {
                str2 = "not null";
            }
            sbLIZ.append(str2);
            C2188811AlT.LIZIZ(sbLIZ);
            if (c1496950p3dLIZIZ != null) {
                return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(c1496950p3dLIZIZ.LIZIZ));
            }
        }
        return null;
    }
}
