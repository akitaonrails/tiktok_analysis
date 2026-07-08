package X;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494230ozF {
    public static InterfaceC1494070oyz LIZ;
    public static InterfaceC1494290ozL LIZIZ;
    public static volatile boolean LIZJ;
    public static InterfaceC1494280ozK LIZLLL;
    public static InterfaceC1494550ozl LJ;
    public static InterfaceC1493490oy3 LJFF;
    public static C0X2U LJI;
    public static InterfaceC1493590oyD LJII;
    public static InterfaceC1339070kwz LJIIIIZZ;
    public static InterfaceC1495260p0u LJIIIZ;
    public static C08XC LJIILJJIL;
    public static C08XQ LJIILL;
    public static volatile InterfaceC2202708k5 LJIILLIIL;
    public static volatile InterfaceC837660WtY LJIJ;
    public static boolean LJIL;
    public static volatile AtomicBoolean LJIIJ = new AtomicBoolean(false);
    public static final Object LJIIJJI = new Object();
    public static CountDownLatch LJIIL = new CountDownLatch(1);
    public static String LJIILIIL = null;
    public static final Map<String, C08XE> LJIIZILJ = new ConcurrentHashMap();
    public static final AtomicBoolean LJIJI = new AtomicBoolean(false);
    public static int LJIJJ = 100;
    public static boolean LJIJJLI = true;

    public static void LJIIL() {
        if (!LJIIJ.get()) {
            LJIIJ.getAndSet(true);
            CountDownLatch countDownLatch = LJIIL;
            if (countDownLatch != null && countDownLatch.getCount() > 0) {
                LJIIL.countDown();
            }
        }
        C1150504el.LIZ().LJI("feed_network_init_cookie_duration", false);
    }

    public static CookieManager LJIILLIIL() {
        CookieManager cookieManagerA2;
        synchronized (LJIIJJI) {
            try {
                if (!LJIIJ.get()) {
                    try {
                        CountDownLatch countDownLatch = LJIIL;
                        if (countDownLatch != null) {
                            countDownLatch.await(Mp4ScreenVideoLoadTimeout.CONTROL, TimeUnit.MILLISECONDS);
                            if (LJIIL.getCount() == 1) {
                                LJIIL.countDown();
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    LJIIJ.getAndSet(true);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        try {
            cookieManagerA2 = C786410Ut5.A2();
        } catch (Throwable th2) {
            th = th2;
            cookieManagerA2 = null;
        }
        try {
            if (!cookieManagerA2.acceptCookie()) {
                cookieManagerA2.setAcceptCookie(true);
                return cookieManagerA2;
            }
        } catch (Throwable th3) {
            th = th3;
            TryCatchGuardChecker.doCheck(th);
        }
        return cookieManagerA2;
    }

    public static boolean LJ() {
        return LIZJ;
    }

    public static String LJFF() {
        return LJIILIIL;
    }

    public static boolean LJI() {
        return LJIL;
    }

    public static void LJIILL(C1494570ozn c1494570ozn) {
        InterfaceC1494070oyz interfaceC1494070oyz = LIZ;
        if (interfaceC1494070oyz != null) {
            if (c1494570ozn != null) {
                c1494570ozn.LJLJI.LIZIZ.LIZIZ();
            }
            try {
                interfaceC1494070oyz.LIZIZ();
                if (c1494570ozn != null) {
                    c1494570ozn.LJJIFFI();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (c1494570ozn != null) {
                    c1494570ozn.LJJIFFI();
                }
                throw th;
            }
        }
    }

    public static String LIZ(String str, C1494570ozn c1494570ozn) {
        if (LIZ != null) {
            if (c1494570ozn != null) {
                c1494570ozn.LJLILLLLZI.LIZIZ.LIZIZ();
            }
            try {
                str = LIZ.LIZ(str);
                if (c1494570ozn != null) {
                    c1494570ozn.LIZIZ();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (c1494570ozn != null) {
                    c1494570ozn.LIZIZ();
                }
                throw th;
            }
        }
        return str;
    }

    public static synchronized boolean LIZIZ(String str, C08XE c08xe) {
        if (C2093608Ic.LJ(str)) {
            return false;
        }
        Iterator it2 = ((ConcurrentHashMap) LJIIZILJ).keySet().iterator();
        while (it2.hasNext()) {
            if (((String) it2.next()).equalsIgnoreCase(str)) {
                return false;
            }
        }
        ((ConcurrentHashMap) LJIIZILJ).put(str, c08xe);
        return true;
    }

    public static boolean LIZJ(String str, C1494600ozq c1494600ozq) {
        if (c1494600ozq != null && !c1494600ozq.LJJJ && !C2093608Ic.LJ(c1494600ozq.LIZLLL.LJLJI.LJFF)) {
            C1494700p00 c1494700p00 = c1494600ozq.LIZLLL.LJLILLLLZI.LIZ;
            if (c1494700p00.LJIL - c1494700p00.LJIIJJI >= 0) {
                return !C2093608Ic.LJ(str);
            }
            return false;
        }
        return false;
    }

    public static void LIZLLL(String str, C1494570ozn c1494570ozn) {
        if (!C2093608Ic.LJ(str) && LJFF != null) {
            if (c1494570ozn != null) {
                c1494570ozn.LJLILLLLZI.LIZIZ.LIZIZ();
            }
            try {
                C1493400oxu c1493400oxu = (C1493400oxu) LJFF;
                c1493400oxu.getClass();
                if (!C2093608Ic.LJ(str)) {
                    try {
                        if (c1493400oxu.LL) {
                            c1493400oxu.LJIJJ();
                        } else {
                            c1493400oxu.LJIJI();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                if (c1494570ozn != null) {
                    C1494710p01 c1494710p01 = c1494570ozn.LJLILLLLZI.LIZIZ;
                    c1494710p01.LIZLLL = c1494710p01.LIZ();
                    c1494570ozn.LJJJI = C1494420ozY.LIZIZ(c1494570ozn.LJLILLLLZI.LIZIZ.LIZLLL);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (c1494570ozn != null) {
                    C1494710p01 c1494710p012 = c1494570ozn.LJLILLLLZI.LIZIZ;
                    c1494710p012.LIZLLL = c1494710p012.LIZ();
                    c1494570ozn.LJJJI = C1494420ozY.LIZIZ(c1494570ozn.LJLILLLLZI.LIZIZ.LIZLLL);
                }
                throw th2;
            }
        }
    }

    public static void LJIIJ(String str, C1494600ozq c1494600ozq) {
        if (LIZJ(str, c1494600ozq) && LIZIZ != null) {
            c1494600ozq.LIZLLL.LJIJJLI();
            InterfaceC1494290ozL interfaceC1494290ozL = LIZIZ;
            C1494700p00 c1494700p00 = c1494600ozq.LIZLLL.LJLILLLLZI.LIZ;
            long j = c1494700p00.LJIL;
            long j2 = c1494700p00.LJIIJJI;
            interfaceC1494290ozL.LIZ(j - j2, j2, str, c1494600ozq.LJJIJIIJIL, c1494600ozq);
        }
    }

    public static void LJIIJJI(String str, C1494600ozq c1494600ozq) {
        if (LIZJ(str, c1494600ozq) && LIZLLL != null) {
            c1494600ozq.LIZLLL.LJIJJLI();
            JSONObject jSONObject = new JSONObject();
            try {
                c1494600ozq.LIZLLL.LJJJJLI(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            InterfaceC1494280ozK interfaceC1494280ozK = LIZLLL;
            C1494700p00 c1494700p00 = c1494600ozq.LIZLLL.LJLILLLLZI.LIZ;
            long j = c1494700p00.LJIL;
            long j2 = c1494700p00.LJIIJJI;
            interfaceC1494280ozK.LIZJ(j - j2, j2, str, c1494600ozq.LJJIJIIJIL, c1494600ozq, jSONObject);
        }
    }

    public static void LJII(String str, C1494600ozq c1494600ozq, Throwable th) {
        if (LIZJ(str, c1494600ozq) && LIZIZ != null && th != null) {
            c1494600ozq.LIZLLL.LJIJJLI();
            InterfaceC1494290ozL interfaceC1494290ozL = LIZIZ;
            C1494700p00 c1494700p00 = c1494600ozq.LIZLLL.LJLILLLLZI.LIZ;
            long j = c1494700p00.LJIL;
            long j2 = c1494700p00.LJIIJJI;
            interfaceC1494290ozL.LIZIZ(j - j2, j2, str, c1494600ozq.LJJIJIIJIL, c1494600ozq, th);
        }
    }

    public static void LJIIIIZZ(String str, C1494600ozq c1494600ozq, Throwable th) {
        if (LIZJ(str, c1494600ozq) && LIZLLL != null && th != null) {
            c1494600ozq.LIZLLL.LJIJJLI();
            JSONObject jSONObject = new JSONObject();
            try {
                c1494600ozq.LIZLLL.LJJJJLI(jSONObject);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            InterfaceC1494280ozK interfaceC1494280ozK = LIZLLL;
            C1494700p00 c1494700p00 = c1494600ozq.LIZLLL.LJLILLLLZI.LIZ;
            long j = c1494700p00.LJIL;
            long j2 = c1494700p00.LJIIJJI;
            interfaceC1494280ozK.LIZLLL(j - j2, j2, str, c1494600ozq.LJJIJIIJIL, c1494600ozq, th, jSONObject);
        }
    }

    public static void LJIIIZ(String str, String str2, boolean z, C1494570ozn c1494570ozn) {
        if (!C2093608Ic.LJ(str) && !C2093608Ic.LJ(str2) && LJFF != null) {
            if (c1494570ozn != null) {
                if (!z) {
                    c1494570ozn.LJLILLLLZI.LIZIZ.LIZIZ();
                } else {
                    c1494570ozn.LJLILLLLZI.LIZIZ.LIZIZ();
                }
            }
            try {
                ((C1493400oxu) LJFF).LJIILIIL(str, str2, z);
                if (c1494570ozn != null) {
                    if (!z) {
                        C1494710p01 c1494710p01 = c1494570ozn.LJLILLLLZI.LIZIZ;
                        c1494710p01.LIZJ = c1494710p01.LIZ();
                    } else {
                        C1494710p01 c1494710p012 = c1494570ozn.LJLILLLLZI.LIZIZ;
                        c1494710p012.LJ = c1494710p012.LIZ();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                if (c1494570ozn != null) {
                    if (!z) {
                        C1494710p01 c1494710p013 = c1494570ozn.LJLILLLLZI.LIZIZ;
                        c1494710p013.LIZJ = c1494710p013.LIZ();
                    } else {
                        C1494710p01 c1494710p014 = c1494570ozn.LJLILLLLZI.LIZIZ;
                        c1494710p014.LJ = c1494710p014.LIZ();
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    public static C1494320ozO LJIILIIL(Request request, C1494600ozq c1494600ozq, int i, List<C080U> list, Map<String, List<String>> map, boolean z) {
        C1494110oz3 c1494110oz3;
        C825090WYh c825090WYh;
        Uri uri;
        C1494320ozO c1494320ozO = new C1494320ozO(false);
        if (z || c1494600ozq.LJJJIL || LJIJI.get() || LJIJ == null || (c1494110oz3 = c1494600ozq.LJJJJL) == null) {
            return c1494320ozO;
        }
        if (!((ArrayList) c1494110oz3.LIZ).isEmpty() && c1494110oz3.LIZIZ < ((ArrayList) c1494110oz3.LIZ).size()) {
            String url = request.getUrl();
            if (c1494110oz3.LIZIZ >= ((ArrayList) c1494110oz3.LIZ).size()) {
                c825090WYh = null;
            } else {
                List<C825090WYh> list2 = c1494110oz3.LIZ;
                int i2 = c1494110oz3.LIZIZ;
                c1494110oz3.LIZIZ = i2 + 1;
                c825090WYh = (C825090WYh) ListProtector.get(list2, i2);
            }
            if (!TextUtils.isEmpty(url) && c825090WYh != null) {
                String str = c825090WYh.LIZ;
                String str2 = c825090WYh.LIZIZ;
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || (uri = UriProtector.parse(url)) == null) {
                    return c1494320ozO;
                }
                String string = uri.buildUpon().authority(str).path(str2).toString();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                c1494600ozq.LIZLLL.LJLJI.LIZIZ.LIZIZ();
                try {
                    c1494320ozO = LJIJ.LIZ(c1494600ozq, i);
                } finally {
                    try {
                    } catch (Throwable th) {
                    }
                }
                c1494600ozq.LIZLLL.LJJIJLIJ();
                c1494110oz3.LIZIZ(request.getHost(), request.getPath(), i, SystemClock.elapsedRealtime() - jElapsedRealtime, c1494320ozO, c1494600ozq);
                if (c1494320ozO != null && c1494320ozO.LIZ) {
                    c1494600ozq.LJJJJJL = true;
                    if (!TextUtils.isEmpty(string)) {
                        c1494320ozO.LIZLLL = string;
                    }
                }
                return c1494320ozO;
            }
            return c1494320ozO;
        }
        c1494110oz3.LIZIZ(request.getHost(), request.getPath(), i, -1L, c1494320ozO, c1494600ozq);
        return c1494320ozO;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1494320ozO LJIILJJIL(com.bytedance.retrofit2.client.Request r17, int r18, X.C1494600ozq r19, java.util.List<X.C080U> r20, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r21, boolean r22, boolean r23) {
        /*
            Method dump skipped, instruction units count: 591
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1494230ozF.LJIILJJIL(com.bytedance.retrofit2.client.Request, int, X.0ozq, java.util.List, java.util.Map, boolean, boolean):X.0ozO");
    }
}
