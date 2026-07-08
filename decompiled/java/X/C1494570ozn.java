package X;

import Y.ARunnableS56S0300000_23;
import android.os.Build;
import android.os.HandlerThread;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.ttnet.TTInternalInterceptor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ozn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494570ozn {
    public static InterfaceC1494880p0I LJLJL;
    public static HandlerThread LJLJLJ;
    public static volatile BPEAHandler LJLJLLL;
    public static InterfaceC1493340oxo LJLL;
    public static volatile boolean LJLLI;
    public static volatile boolean LJLLILLLL;
    public static volatile InterfaceC1490330osx LJLLJ;
    public URL LIZ;
    public transient WeakReference<InterfaceC1494730p03> LIZIZ;
    public JSONObject LJIIIZ;
    public boolean LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public long LJIILL;
    public long LJIILLIIL;
    public long LJIIZILJ;
    public long LJIJ;
    public long LJIJI;
    public long LJIJJ;
    public long LJIJJLI;
    public long LJIL;
    public String LJJI;
    public boolean LJJIFFI;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public long LJJIJIIJIL;
    public long LJJIJIL;
    public long LJJIJL;
    public long LJJIJLIJ;
    public transient Throwable LJJIL;
    public JSONArray LJJL;
    public long LJJLIIIIJ;
    public long LJJLIIIJ;
    public long LJJLIIIJILLIZJL;
    public JSONObject LJJLIIIJLLLLLLLZ;
    public int LJJLIIJ;
    public int LIZJ = -1;
    public int LIZLLL = -1;
    public C08HB LJ = C08HB.ENCRYPT_NONE;
    public int LJFF = -1;
    public String LJI = "";
    public int LJII = -1;
    public String LJIIIIZZ = "";
    public String LJIIJ = "";
    public int LJJ = -1;
    public long LJJII = -1;
    public long LJJIII = -1;
    public long LJJIIJ = -1;
    public long LJJIIJZLJL = -1;
    public long LJJIIZ = -1;
    public Map<String, Long> LJJIZ = new ConcurrentHashMap();
    public Map<String, Long> LJJJ = new ConcurrentHashMap();
    public long LJJJI = -1;
    public long LJJJIL = -1;
    public long LJJJJ = -1;
    public long LJJJJI = -1;
    public long LJJJJIZL = -1;
    public long LJJJJJ = -1;
    public long LJJJJJL = -1;
    public long LJJJJL = -1;
    public long LJJJJLI = -1;
    public long LJJJJLL = -1;
    public long LJJJJZ = -1;
    public long LJJJJZI = -1;
    public long LJJJLIIL = -1;
    public long LJJJLL = -1;
    public Map<String, Long> LJJJLZIJ = new HashMap();
    public String LJJJZ = "";
    public boolean LJJLI = true;
    public int LJJLIIIJJI = -1;
    public int LJJLIIIJJIZ = -1;
    public String LJJLIIIJL = "";
    public String LJJLIIIJLJLI = "";
    public long LJJLIL = -1;
    public long LJJLJ = -1;
    public long LJJLJLI = -1;
    public long LJJLL = -1;
    public long LJJZ = -1;
    public long LJJZZI = -1;
    public int LJJZZIII = -1;
    public Map<String, Object> LJL = new HashMap();
    public JSONObject LJLI = null;
    public int LJLIIIL = 0;
    public final List<C1494800p0A> LJLIIL = new ArrayList();
    public final List<C1494800p0A> LJLIL = new ArrayList();
    public C1494580ozo LJLILLLLZI = new C1494580ozo();
    public C1494650ozv LJLJI = new C1494650ozv();
    public boolean LJLJJI = false;
    public boolean LJLJJL = false;
    public boolean LJLJJLL = false;

    public final void LJIL() {
        this.LJLJJL = true;
        LJJI();
    }

    public final void LJJ() {
        this.LJLJJLL = true;
        LJJI();
    }

    public final void LJJIIZ() {
        this.LJLJJI = false;
        this.LJLJI.LIZ.LJII = System.nanoTime();
        C1494650ozv c1494650ozv = this.LJLJI;
        if (c1494650ozv.LJ.LIZJ) {
            return;
        }
        C1494680ozy c1494680ozy = c1494650ozv.LIZJ;
        if (c1494680ozy.LJIIIZ == -1) {
            c1494680ozy.LJIIIZ = 0L;
        }
        c1494680ozy.LJIIIZ += c1494680ozy.LIZ();
        if (this.LJLILLLLZI.LIZ.LJIJJLI != -1) {
            LJJI();
        }
    }

    public final void LJJIIZI() {
        this.LJLJJI = true;
        C1494650ozv c1494650ozv = this.LJLJI;
        C1494780p08 c1494780p08 = c1494650ozv.LJ;
        if (c1494780p08.LIZIZ == -1) {
            c1494780p08.LIZIZ = 0L;
        }
        c1494780p08.LIZIZ++;
        C1494750p05 c1494750p05 = c1494650ozv.LIZ;
        if (c1494750p05.LJI == -1) {
            c1494750p05.LJI = System.nanoTime();
        }
        C1494650ozv c1494650ozv2 = this.LJLJI;
        if (c1494650ozv2.LJ.LIZJ) {
            return;
        }
        C1494720p02 c1494720p02 = c1494650ozv2.LIZIZ;
        if (c1494720p02.LJII == -1) {
            long j = this.LJLILLLLZI.LIZ.LJIJI;
            if (j != -1) {
                long j2 = c1494650ozv2.LIZ.LJI;
                if (j2 > j) {
                    c1494720p02.LJII = j2 - j;
                }
            }
        }
        if (c1494650ozv2.LIZ.LJII != -1) {
            if (c1494720p02.LJIIIIZZ == -1) {
                c1494720p02.LJIIIIZZ = 0L;
            }
            c1494720p02.LJIIIIZZ += System.nanoTime() - this.LJLJI.LIZ.LJII;
        }
        this.LJLJI.LIZJ.LIZIZ();
    }

    public final void LIZIZ() {
        C1494710p01 c1494710p01 = this.LJLILLLLZI.LIZIZ;
        c1494710p01.LJFF = c1494710p01.LIZ();
        this.LJJJIL = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZIZ.LJFF);
    }

    public final void LIZLLL() {
        C1494720p02 c1494720p02 = this.LJLJI.LIZIZ;
        c1494720p02.LJ = c1494720p02.LIZ();
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJIIJ(C1494420ozY.LIZIZ(this.LJLJI.LIZIZ.LJ));
        }
    }

    public final void LJI() {
        this.LJLILLLLZI.LIZ.LJIJJ = System.currentTimeMillis();
        this.LJLILLLLZI.LIZ.LJIJI = System.nanoTime();
    }

    public final void LJII() {
        C1494710p01 c1494710p01 = this.LJLILLLLZI.LIZIZ;
        c1494710p01.LJIIIZ = c1494710p01.LIZ();
        this.LJJJJJL = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZIZ.LJIIIZ);
    }

    public final void LJIILIIL() {
        C1494710p01 c1494710p01 = this.LJLILLLLZI.LIZIZ;
        c1494710p01.LJIILIIL = c1494710p01.LIZ();
        this.LJJLIIIJ = SystemClock.uptimeMillis();
    }

    public final void LJIILJJIL() {
        this.LJLILLLLZI.LIZIZ.LIZIZ();
        this.LJJLIIIIJ = SystemClock.uptimeMillis();
    }

    public final void LJIILLIIL() {
        C1494670ozx c1494670ozx = this.LJLILLLLZI.LIZJ;
        c1494670ozx.LJFF = c1494670ozx.LIZ();
        this.LJJJJI = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZJ.LJFF);
    }

    public final JSONObject LJIIZILJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("fallback", this.LJFF);
            if (!TextUtils.isEmpty(this.LJI)) {
                jSONObject.put("fallbackMessage", this.LJI);
            }
            jSONObject.put("reqFallback", this.LJII);
            if (!TextUtils.isEmpty(this.LJIIIIZZ)) {
                jSONObject.put("reqFallbackMsg", this.LJIIIIZZ);
            }
            jSONObject.put("createRetrofitTime", this.LJIIL);
            jSONObject.put("appRequestStartTime", this.LJIILIIL);
            jSONObject.put("beforeAllInterceptTime", this.LJIILJJIL);
            jSONObject.put("callServerInterceptTime", this.LJIILL);
            jSONObject.put("callExecuteStartTime", this.LJIILLIIL);
            jSONObject.put("reportTime", this.LJIIZILJ);
            C08HB c08hb = this.LJ;
            if (c08hb != C08HB.ENCRYPT_NONE) {
                jSONObject.put("encrypt", c08hb.getValue());
            }
            if (!TextUtils.isEmpty(this.LJIIJ)) {
                jSONObject.put("transactionId", this.LJIIJ);
            }
            long j = this.LJJZ;
            if (j >= 0) {
                jSONObject.put("upper_add_cookie_us", j);
            }
            long j2 = this.LJJZZI;
            if (j2 >= 0) {
                jSONObject.put("upper_save_cookie_us", j2);
            }
            jSONObject.put("request_cookie_source", this.LJJZZIII);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean zLJJJLIIL = LJJJLIIL(jSONObject, "loadServiceMethod", this.LJIJ, this.LJIJI, true);
        long j3 = this.LJIJJLI;
        boolean zLJJJLIIL2 = j3 > 0 ? LJJJLIIL(jSONObject, "enqueueWait", j3, this.LJJIIZI, zLJJJLIIL) : LJJJLIIL(jSONObject, "executeWait", this.LJIL, this.LJJIIZI, zLJJJLIIL);
        C1494700p00 c1494700p00 = this.LJLILLLLZI.LIZ;
        LJJJLIIL(jSONObject, "biz_start_after_cronet_start", c1494700p00.LIZJ / 1000, c1494700p00.LJIIJ / 1000, true);
        C1494700p00 c1494700p002 = this.LJLILLLLZI.LIZ;
        LJJJLIIL(jSONObject, "biz_start_before_cronet_end", c1494700p002.LJIIL / 1000, c1494700p002.LIZLLL / 1000, true);
        LJJJLIIL(jSONObject, "responseParse", this.LJJIJL, this.LJJIJLIJ, LJJJLIIL(jSONObject, "requestParse", this.LJJIJ, this.LJJIJIIJI, LJJJLIIL(jSONObject, "executeCall", this.LJJIJIIJIL, this.LJJIJIL, zLJJJLIIL2)));
        return jSONObject;
    }

    public final JSONObject LJIJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("filterUrl", this.LJJJI);
            jSONObject.put("addCommonParam", this.LJJJIL);
            jSONObject.put("requestVerify", this.LJJJJ);
            jSONObject.put("encryptRequest", this.LJJJJIZL);
            jSONObject.put("genReqTicket", this.LJJJJJ);
            jSONObject.put("checkReqTicket", this.LJJJJJL);
            jSONObject.put("preCdnVerify", this.LJJJJL);
            jSONObject.put("postCdnVerify", this.LJJJJZ);
            jSONObject.put("addClientKey", this.LJJJJLI);
            jSONObject.put("updateClientKey", this.LJJJJLL);
            jSONObject.put("commandListener", this.LJJJJZI);
            jSONObject.put("filterDupQuery", this.LJJJJI);
            jSONObject.put("queryFilter", this.LJJJLIIL);
            long j = this.LJJJLL;
            if (j >= 0) {
                jSONObject.put("bodyEncrypt", j);
            }
            jSONObject.put("setSpeed", this.LJJLIL);
            jSONObject.put("tryInit", this.LJJLJ);
            jSONObject.put("openConn", this.LJJLJLI);
            jSONObject.put("prepareReq", this.LJJLL);
            return jSONObject;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    public final JSONObject LJIJI() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.LJJIZ.isEmpty()) {
                JSONObject jSONObject2 = new JSONObject();
                for (Map.Entry<String, Long> entry : this.LJJIZ.entrySet()) {
                    jSONObject2.put(entry.getKey(), entry.getValue());
                }
                jSONObject.put("request", jSONObject2);
            }
            if (!this.LJJJ.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                for (Map.Entry<String, Long> entry2 : this.LJJJ.entrySet()) {
                    jSONObject3.put(entry2.getKey(), entry2.getValue());
                }
                jSONObject.put("response", jSONObject3);
                return jSONObject;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return jSONObject;
    }

    public final String LJIJJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.LJFF != -1) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("model", Build.MODEL);
                    String string = "";
                    String[] strArr = Build.SUPPORTED_ABIS;
                    if (strArr != null && strArr.length > 0) {
                        string = Arrays.asList(strArr).toString();
                    }
                    jSONObject2.put("abis", string);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                jSONObject.put("model", jSONObject2);
            }
            JSONObject jSONObject3 = this.LJIIIZ;
            if (jSONObject3 != null) {
                jSONObject.put("concurrentRequest", jSONObject3);
            }
            jSONObject.put("concurrent", this.LJIIJJI);
            jSONObject.put("base", LJIIZILJ());
            jSONObject.put("callback", LJIJ());
            jSONObject.put("interceptor", LJIJI());
            jSONObject.put("ttnetVersion", this.LJJJZ);
            JSONArray jSONArray = this.LJJL;
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject.put("actionInfo", this.LJJL);
            }
            JSONObject jSONObject4 = this.LJJLIIIJLLLLLLLZ;
            if (jSONObject4 != null) {
                jSONObject.put("compress", jSONObject4);
            }
            int i = this.LJJLIIJ;
            if (i > 0) {
                jSONObject.put("postBufferSize", i);
            }
            int i2 = this.LJLIIIL;
            if (i2 > 0) {
                jSONObject.put("blockingQueueSize", i2);
            }
            long j = this.LJLJI.LJ.LIZIZ;
            if (j > 0) {
                jSONObject.put("apiStreamReadCount", j);
            }
            jSONObject.put("stateDelayed", this.LJJIFFI);
            jSONObject.put("stateDelayTime", this.LJJII);
            jSONObject.put("syncCount", this.LJJIII);
            jSONObject.put("asyncCount", this.LJJIIJ);
            jSONObject.put("delayState", this.LJJ);
            jSONObject.put("random", this.LJJIIZ);
            if (!TextUtils.isEmpty(this.LJJI)) {
                jSONObject.put("stateName", this.LJJI);
            }
            if (this.LJJJJLI >= 0) {
                jSONObject.put("cli_key", true);
            }
            int i3 = this.LIZJ;
            if (i3 >= 0) {
                jSONObject.put("cp_cnt", i3);
            }
            int i4 = this.LIZLLL;
            if (i4 >= 0) {
                jSONObject.put("read_type", i4);
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public final void LJIJJLI() {
        this.LJLILLLLZI.LIZ.LJJ = System.nanoTime();
        this.LJIIZILJ = LIZ(this.LJLILLLLZI.LIZ.LJJ);
    }

    public final void LJJI() {
        WeakReference<InterfaceC1494730p03> weakReference;
        if (this.LJLJJLL && this.LJLJJL) {
            this.LJLILLLLZI.LIZ.LJIJJLI = System.nanoTime();
            this.LJLILLLLZI.LIZ.LJIL = System.currentTimeMillis();
            WeakReference<InterfaceC1494730p03> weakReference2 = this.LIZIZ;
            if (weakReference2 != null) {
                weakReference2.get().LIZJ(this.LJLILLLLZI.LIZ.LJIL);
            }
            if (this.LJLJJI) {
                return;
            }
            long j = C1493360oxq.LIZ;
            this.LJLILLLLZI.LJ.LJFF = j;
            WeakReference<InterfaceC1494730p03> weakReference3 = this.LIZIZ;
            if (weakReference3 != null) {
                weakReference3.get().LJ(j);
            }
            if (LJLL == null || (weakReference = this.LIZIZ) == null || weakReference.get() == null) {
                return;
            }
            final InterfaceC1494730p03 interfaceC1494730p03 = this.LIZIZ.get();
            WeakReference<Throwable> weakReference4 = this.LJLILLLLZI.LJ.LIZLLL;
            final Throwable th = weakReference4 != null ? weakReference4.get() : null;
            if (LJLLILLLL) {
                LJIIL(interfaceC1494730p03, th);
                return;
            }
            if (LJLLJ != null) {
                InterfaceC1490330osx interfaceC1490330osx = LJLLJ;
                final ARunnableS56S0300000_23 aRunnableS56S0300000_23 = new ARunnableS56S0300000_23(this, interfaceC1494730p03, th, 11);
                interfaceC1490330osx.getClass();
                C1490010osR.LIZ(EnumC1490030osT.NETWORK).LIZIZ(new AbstractRunnableC1490020osS() { // from class: X.0osH
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("NetworkLogReporter@7f0a.postDelayed$1");
                        try {
                            aRunnableS56S0300000_23.run();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("NetworkLogReporter@7f0a.postDelayed$1");
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(100L, 0L);
                    }
                });
                return;
            }
            if (LJLJLLL == null) {
                synchronized (C1494570ozn.class) {
                    try {
                        if (LJLJLLL == null) {
                            HandlerThread handlerThread = new HandlerThread("TTNet-Log-Report");
                            LJLJLJ = handlerThread;
                            handlerThread.start();
                            LJLJLLL = new BPEAHandler(C786410Ut5.W2(LJLJLJ));
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        throw th2;
                    }
                }
            }
            C786410Ut5.LJLIIL(100L, LJLJLLL, new Runnable() { // from class: X.0ose
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("RetrofitMetrics@e460.maybeReportRequestLog$2");
                    try {
                        this.LLILLL.LJIIL(interfaceC1494730p03, th);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("RetrofitMetrics@e460.maybeReportRequestLog$2");
                }
            });
        }
    }

    public final void LJJIFFI() {
        C1494720p02 c1494720p02 = this.LJLJI.LIZIZ;
        c1494720p02.LIZJ = c1494720p02.LIZ();
        if (this.LJJLJ == -1) {
            this.LJJLJ = 0L;
        }
        this.LJJLJ += C1494420ozY.LIZIZ(this.LJLJI.LIZIZ.LIZJ);
    }

    public final void LJJII() {
        C1494680ozy c1494680ozy = this.LJLJI.LIZJ;
        c1494680ozy.LJIIIIZZ = c1494680ozy.LIZ();
    }

    public final void LJJIII() {
        this.LJLJI.LIZ.LIZIZ = System.nanoTime();
    }

    public final void LJJIIJ() {
        this.LJLJI.LIZ.LJFF = System.nanoTime();
        C1494680ozy c1494680ozy = this.LJLJI.LIZJ;
        c1494680ozy.LJII = c1494680ozy.LIZ();
    }

    public final void LJJIIJZLJL() {
        C1494680ozy c1494680ozy = this.LJLJI.LIZJ;
        c1494680ozy.LIZIZ = c1494680ozy.LIZ();
        this.LJJJLIIL = C1494420ozY.LIZIZ(this.LJLJI.LIZJ.LIZIZ);
    }

    public final void LJJIJ() {
        if (this.LJLIIL.size() <= 0) {
            return;
        }
        ((C1494800p0A) ListProtector.get(this.LJLIIL, r1.size() - 1)).LIZJ = SystemClock.uptimeMillis();
    }

    public final void LJJIJLIJ() {
        C1494720p02 c1494720p02 = this.LJLJI.LIZIZ;
        if (c1494720p02.LJI == -1) {
            c1494720p02.LJI = 0L;
        }
        c1494720p02.LJI += c1494720p02.LIZ();
    }

    public final void LJJJJJL() {
        this.LJLILLLLZI.LIZ.LJIIL = System.nanoTime();
        this.LJJLIIIJILLIZJL = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZ.LJIIL);
    }

    public final void LJJJJLL() {
        C1494670ozx c1494670ozx = this.LJLILLLLZI.LIZJ;
        c1494670ozx.LIZLLL = c1494670ozx.LIZ();
        this.LJLILLLLZI.LIZ.LJIIIIZZ = System.nanoTime();
        this.LJJIJIIJI = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZ.LJIIIIZZ);
    }

    public final void LJJJJZ() {
        this.LJLILLLLZI.LIZJ.LIZIZ();
        this.LJLILLLLZI.LIZ.LJII = System.nanoTime();
        this.LJJIJ = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZ.LJII);
    }

    public final void LJJJJZI() {
        C1494720p02 c1494720p02 = this.LJLJI.LIZIZ;
        c1494720p02.LIZLLL = c1494720p02.LIZ();
        if (this.LJJLJ == -1) {
            this.LJJLJ = 0L;
        }
        this.LJJLJ += C1494420ozY.LIZIZ(this.LJLJI.LIZIZ.LIZLLL);
    }

    public C1494570ozn() {
        new C1494570ozn(null);
    }

    public final void LJJIJL() {
        long jNanoTime = System.nanoTime();
        C1494580ozo c1494580ozo = this.LJLILLLLZI;
        C1494700p00 c1494700p00 = c1494580ozo.LIZ;
        c1494700p00.LJIIIZ = jNanoTime;
        C1494670ozx c1494670ozx = c1494580ozo.LIZJ;
        long j = c1494700p00.LJIIJ;
        long j2 = jNanoTime - j;
        c1494670ozx.LJ = j2;
        if (c1494700p00.LJII > j) {
            long j3 = c1494670ozx.LIZLLL;
            if (j3 != -1) {
                c1494670ozx.LJ = j2 - j3;
            }
        }
    }

    public C1494570ozn(InterfaceC1494730p03 interfaceC1494730p03) {
        this.LIZIZ = new WeakReference<>(interfaceC1494730p03);
    }

    public final long LIZ(long j) {
        C1494700p00 c1494700p00 = this.LJLILLLLZI.LIZ;
        long j2 = c1494700p00.LJ;
        long j3 = c1494700p00.LJFF;
        if (j2 < 0 || j3 < 0 || j < 0 || j3 > j) {
            return -1L;
        }
        return C1494420ozY.LIZIZ(j - j3) + j2;
    }

    public final void LIZJ(Throwable th) {
        long jNanoTime = System.nanoTime();
        C1494770p07 c1494770p07 = this.LJLILLLLZI.LIZLLL;
        c1494770p07.getClass();
        try {
            C1494760p06 c1494760p06 = (C1494760p06) ((ArrayDeque) c1494770p07.LIZ).pop();
            ((ArrayDeque) c1494770p07.LIZIZ).push(c1494760p06);
            if (c1494760p06 != null) {
                if (c1494760p06.LIZLLL == -1) {
                    c1494760p06.LIZLLL = jNanoTime;
                    if (th != null) {
                        c1494760p06.LJI = th.getClass().getSimpleName();
                    }
                } else if (c1494760p06.LJ != -1) {
                    c1494760p06.LJFF = jNanoTime;
                    if (th != null) {
                        c1494760p06.LJI = th.getClass().getSimpleName();
                    }
                }
                if (!c1494760p06.LIZIZ) {
                    long j = c1494760p06.LJ;
                    if (j != -1) {
                        long j2 = c1494760p06.LJFF;
                        if (j2 != -1) {
                            C1494710p01 c1494710p01 = this.LJLILLLLZI.LIZIZ;
                            if (c1494710p01.LJIIL == -1) {
                                c1494710p01.LJIIL = 0L;
                            }
                            c1494710p01.LJIIL += j2 - j;
                        }
                    }
                }
            }
        } catch (NoSuchElementException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        C1494760p06 c1494760p062 = (C1494760p06) ((ArrayDeque) this.LJLILLLLZI.LIZLLL.LIZ).peek();
        if (c1494760p062 == null) {
            this.LJLILLLLZI.LIZ.LJIJ = jNanoTime;
        } else {
            if (th != null) {
                return;
            }
            c1494760p062.LJ = jNanoTime;
        }
    }

    public final void LJ(InterfaceC1904907d9 interfaceC1904907d9) {
        String name = interfaceC1904907d9.getClass().getName();
        if (!TextUtils.isEmpty(name)) {
            long jNanoTime = System.nanoTime();
            C1494760p06 c1494760p06 = (C1494760p06) ((ArrayDeque) this.LJLILLLLZI.LIZLLL.LIZ).peek();
            if (c1494760p06 != null) {
                if (c1494760p06.LIZLLL == -1) {
                    c1494760p06.LIZLLL = jNanoTime;
                }
                if (!c1494760p06.LIZIZ) {
                    C1494710p01 c1494710p01 = this.LJLILLLLZI.LIZIZ;
                    if (c1494710p01.LJIIJJI == -1) {
                        c1494710p01.LJIIJJI = 0L;
                    }
                    c1494710p01.LJIIJJI += c1494760p06.LIZLLL - c1494760p06.LIZJ;
                }
            } else {
                this.LJLILLLLZI.LIZ.LJIILIIL = jNanoTime;
                this.LJJIIZI = C1494420ozY.LIZIZ(jNanoTime);
                this.LJIILJJIL = LIZ(jNanoTime);
            }
            ((ArrayDeque) this.LJLILLLLZI.LIZLLL.LIZ).push(new C1494760p06(name.substring(name.lastIndexOf(46) + 1), interfaceC1904907d9 instanceof TTInternalInterceptor, jNanoTime));
        }
    }

    public final void LJFF(boolean z) {
        C1494700p00 c1494700p00 = this.LJLILLLLZI.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1494700p00.LJ = jCurrentTimeMillis;
        this.LJIIL = jCurrentTimeMillis;
        this.LJLILLLLZI.LIZ.LJFF = System.nanoTime();
        long jLIZIZ = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZ.LJFF);
        this.LJIJJ = jLIZIZ;
        if (z) {
            this.LJIJI = jLIZIZ;
            this.LJIJ = jLIZIZ;
        }
    }

    public final void LJIIIIZZ(long j) {
        this.LJLJI.LIZJ.LIZLLL = System.nanoTime() - j;
        this.LJJLL = C1494420ozY.LIZIZ(this.LJLJI.LIZJ.LIZLLL);
    }

    public final void LJIIJ(long j) {
        this.LJLJI.LIZJ.LIZJ = System.nanoTime() - j;
        this.LJJLJLI = C1494420ozY.LIZIZ(this.LJLJI.LIZJ.LIZJ);
    }

    public final void LJIIJJI(C1494570ozn c1494570ozn) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        if (c1494570ozn == null) {
            return;
        }
        try {
            if (this.LIZ != null) {
                c1494570ozn.LIZ = new URL(this.LIZ.toString());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        c1494570ozn.LIZJ = this.LIZJ;
        c1494570ozn.LIZLLL = this.LIZLLL;
        c1494570ozn.LJ = this.LJ;
        c1494570ozn.LJFF = this.LJFF;
        c1494570ozn.LJI = this.LJI;
        c1494570ozn.LJII = this.LJII;
        c1494570ozn.LJIIIIZZ = this.LJIIIIZZ;
        JSONObject jSONObject3 = null;
        try {
            if (this.LJIIIZ != null) {
                jSONObject2 = new JSONObject(C786410Ut5.J3(this.LJIIIZ));
            } else {
                jSONObject2 = null;
            }
            c1494570ozn.LJIIIZ = jSONObject2;
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        c1494570ozn.LJIIJ = this.LJIIJ;
        c1494570ozn.LJIIJJI = this.LJIIJJI;
        c1494570ozn.LJIIL = this.LJIIL;
        c1494570ozn.LJIILIIL = this.LJIILIIL;
        c1494570ozn.LJIILJJIL = this.LJIILJJIL;
        c1494570ozn.LJIILL = this.LJIILL;
        c1494570ozn.LJIILLIIL = this.LJIILLIIL;
        c1494570ozn.LJIIZILJ = this.LJIIZILJ;
        c1494570ozn.LJIJ = this.LJIJ;
        c1494570ozn.LJIJI = this.LJIJI;
        c1494570ozn.LJIJJ = this.LJIJJ;
        c1494570ozn.LJIJJLI = this.LJIJJLI;
        c1494570ozn.LJIL = this.LJIL;
        c1494570ozn.LJJ = this.LJJ;
        c1494570ozn.LJJI = this.LJJI;
        c1494570ozn.LJJIFFI = this.LJJIFFI;
        c1494570ozn.LJJII = this.LJJII;
        c1494570ozn.LJJIII = this.LJJIII;
        c1494570ozn.LJJIIJ = this.LJJIIJ;
        c1494570ozn.LJJIIJZLJL = this.LJJIIJZLJL;
        c1494570ozn.LJJIIZ = this.LJJIIZ;
        c1494570ozn.LJJIIZI = this.LJJIIZI;
        c1494570ozn.LJJIJ = this.LJJIJ;
        c1494570ozn.LJJIJIIJI = this.LJJIJIIJI;
        c1494570ozn.LJJIJIIJIL = this.LJJIJIIJIL;
        c1494570ozn.LJJIJIL = this.LJJIJIL;
        c1494570ozn.LJJIJL = this.LJJIJL;
        c1494570ozn.LJJIJLIJ = this.LJJIJLIJ;
        if (this.LJJIL != null) {
            Throwable th = new Throwable(this.LJJIL.getMessage());
            th.setStackTrace(this.LJJIL.getStackTrace());
            c1494570ozn.LJJIL = th;
        }
        if (this.LJJIZ != null) {
            c1494570ozn.LJJIZ = new ConcurrentHashMap();
            for (Map.Entry entry : ((ConcurrentHashMap) this.LJJIZ).entrySet()) {
                ((ConcurrentHashMap) c1494570ozn.LJJIZ).put(entry.getKey(), entry.getValue());
            }
        }
        if (this.LJJJ != null) {
            c1494570ozn.LJJJ = new ConcurrentHashMap();
            for (Map.Entry entry2 : ((ConcurrentHashMap) this.LJJJ).entrySet()) {
                ((ConcurrentHashMap) c1494570ozn.LJJJ).put(entry2.getKey(), entry2.getValue());
            }
        }
        c1494570ozn.LJJJI = this.LJJJI;
        c1494570ozn.LJJJIL = this.LJJJIL;
        c1494570ozn.LJJJJ = this.LJJJJ;
        c1494570ozn.LJJJJI = this.LJJJJI;
        c1494570ozn.LJJJJIZL = this.LJJJJIZL;
        c1494570ozn.LJJJJJ = this.LJJJJJ;
        c1494570ozn.LJJJJJL = this.LJJJJJL;
        c1494570ozn.LJJJJL = this.LJJJJL;
        c1494570ozn.LJJJJLI = this.LJJJJLI;
        c1494570ozn.LJJJJLL = this.LJJJJLL;
        c1494570ozn.LJJJJZ = this.LJJJJZ;
        c1494570ozn.LJJJJZI = this.LJJJJZI;
        c1494570ozn.LJJJLIIL = this.LJJJLIIL;
        c1494570ozn.LJJJLL = this.LJJJLL;
        if (this.LJJJLZIJ != null) {
            c1494570ozn.LJJJLZIJ = new ConcurrentHashMap();
            for (Map.Entry<String, Long> entry3 : this.LJJJLZIJ.entrySet()) {
                c1494570ozn.LJJJLZIJ.put(entry3.getKey(), entry3.getValue());
            }
        }
        c1494570ozn.LJJJZ = this.LJJJZ;
        try {
            if (this.LJJL != null) {
                c1494570ozn.LJJL = new JSONArray(this.LJJL.toString());
            }
        } catch (JSONException e3) {
            TryCatchGuardChecker.doCheck(e3);
        }
        c1494570ozn.LJJLI = this.LJJLI;
        c1494570ozn.LJJLIIIIJ = this.LJJLIIIIJ;
        c1494570ozn.LJJLIIIJ = this.LJJLIIIJ;
        c1494570ozn.LJJLIIIJILLIZJL = this.LJJLIIIJILLIZJL;
        c1494570ozn.LJJLIIIJJI = this.LJJLIIIJJI;
        c1494570ozn.LJJLIIIJJIZ = this.LJJLIIIJJIZ;
        c1494570ozn.LJJLIIIJL = this.LJJLIIIJL;
        c1494570ozn.LJJLIIIJLJLI = this.LJJLIIIJLJLI;
        try {
            if (this.LJJLIIIJLLLLLLLZ != null) {
                jSONObject = new JSONObject(C786410Ut5.J3(this.LJJLIIIJLLLLLLLZ));
            } else {
                jSONObject = null;
            }
            c1494570ozn.LJJLIIIJLLLLLLLZ = jSONObject;
        } catch (JSONException e4) {
            TryCatchGuardChecker.doCheck(e4);
        }
        c1494570ozn.LJJLIIJ = this.LJJLIIJ;
        c1494570ozn.LJJLIL = this.LJJLIL;
        c1494570ozn.LJJLJ = this.LJJLJ;
        c1494570ozn.LJJLJLI = this.LJJLJLI;
        c1494570ozn.LJJLL = this.LJJLL;
        c1494570ozn.LJJZ = this.LJJZ;
        c1494570ozn.LJJZZI = this.LJJZZI;
        c1494570ozn.LJJZZIII = this.LJJZZIII;
        if (this.LJL != null) {
            c1494570ozn.LJL = new HashMap();
            for (Map.Entry entry4 : ((HashMap) this.LJL).entrySet()) {
                ((HashMap) c1494570ozn.LJL).put(entry4.getKey(), entry4.getValue());
            }
        }
        try {
            if (this.LJLI != null) {
                jSONObject3 = new JSONObject(C786410Ut5.J3(this.LJLI));
            }
            c1494570ozn.LJLI = jSONObject3;
        } catch (JSONException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        c1494570ozn.LJLIIIL = this.LJLIIIL;
        List<C1494800p0A> list = this.LJLIIL;
        if (list != null) {
            for (C1494800p0A c1494800p0A : (ArrayList) list) {
                C1494800p0A c1494800p0A2 = new C1494800p0A(c1494800p0A.LIZ, c1494800p0A.LIZIZ);
                c1494800p0A2.LIZJ = c1494800p0A.LIZJ;
                ((ArrayList) c1494570ozn.LJLIIL).add(c1494800p0A2);
            }
        }
        List<C1494800p0A> list2 = this.LJLIL;
        if (list2 != null) {
            for (C1494800p0A c1494800p0A3 : (ArrayList) list2) {
                C1494800p0A c1494800p0A4 = new C1494800p0A(c1494800p0A3.LIZ, c1494800p0A3.LIZIZ);
                c1494800p0A4.LIZJ = c1494800p0A3.LIZJ;
                ((ArrayList) c1494570ozn.LJLIL).add(c1494800p0A4);
            }
        }
        c1494570ozn.LJLJJL = this.LJLJJL;
        c1494570ozn.LJLJJLL = this.LJLJJLL;
        c1494570ozn.LIZIZ = this.LIZIZ;
        C1494580ozo c1494580ozo = this.LJLILLLLZI;
        c1494580ozo.getClass();
        C1494580ozo c1494580ozo2 = new C1494580ozo();
        C1494700p00 c1494700p00 = c1494580ozo.LIZ;
        c1494700p00.getClass();
        C1494700p00 c1494700p002 = new C1494700p00();
        c1494700p002.LIZ = c1494700p00.LIZ;
        c1494700p002.LIZIZ = c1494700p00.LIZIZ;
        c1494700p002.LIZJ = c1494700p00.LIZJ;
        c1494700p002.LIZLLL = c1494700p00.LIZLLL;
        c1494700p002.LJ = c1494700p00.LJ;
        c1494700p002.LJFF = c1494700p00.LJFF;
        c1494700p002.LJI = c1494700p00.LJI;
        c1494700p002.LJIIJJI = c1494700p00.LJIIJJI;
        c1494700p002.LJIIIZ = c1494700p00.LJIIIZ;
        c1494700p002.LJIIJ = c1494700p00.LJIIJ;
        c1494700p002.LJIIL = c1494700p00.LJIIL;
        c1494700p002.LJIILIIL = c1494700p00.LJIILIIL;
        c1494700p002.LJIILJJIL = c1494700p00.LJIILJJIL;
        c1494700p002.LJIILL = c1494700p00.LJIILL;
        c1494700p002.LJIILLIIL = c1494700p00.LJIILLIIL;
        c1494700p002.LJIIZILJ = c1494700p00.LJIIZILJ;
        c1494700p002.LJIJ = c1494700p00.LJIJ;
        c1494700p002.LJIJI = c1494700p00.LJIJI;
        c1494700p002.LJIJJ = c1494700p00.LJIJJ;
        c1494700p002.LJIJJLI = c1494700p00.LJIJJLI;
        c1494700p002.LJIL = c1494700p00.LJIL;
        c1494700p002.LJJ = c1494700p00.LJJ;
        c1494580ozo2.LIZ = c1494700p002;
        C1494710p01 c1494710p01 = c1494580ozo.LIZIZ;
        c1494710p01.getClass();
        C1494710p01 c1494710p012 = new C1494710p01();
        c1494710p012.LIZ = c1494710p01.LIZ;
        c1494710p012.LIZIZ = c1494710p01.LIZIZ;
        c1494710p012.LIZJ = c1494710p01.LIZJ;
        c1494710p012.LIZLLL = c1494710p01.LIZLLL;
        c1494710p012.LJ = c1494710p01.LJ;
        c1494710p012.LJFF = c1494710p01.LJFF;
        c1494710p012.LJI = c1494710p01.LJI;
        c1494710p012.LJII = c1494710p01.LJII;
        c1494710p012.LJIIIIZZ = c1494710p01.LJIIIIZZ;
        c1494710p012.LJIIIZ = c1494710p01.LJIIIZ;
        c1494710p012.LJIIJ = c1494710p01.LJIIJ;
        c1494710p012.LJIIJJI = c1494710p01.LJIIJJI;
        c1494710p012.LJIIL = c1494710p01.LJIIL;
        c1494710p012.LJIILIIL = c1494710p01.LJIILIIL;
        c1494580ozo2.LIZIZ = c1494710p012;
        C1494670ozx c1494670ozx = c1494580ozo.LIZJ;
        c1494670ozx.getClass();
        C1494670ozx c1494670ozx2 = new C1494670ozx();
        if (!((ArrayDeque) c1494670ozx.LIZ).isEmpty()) {
            c1494670ozx2.LIZ = new ArrayDeque();
            Iterator it2 = ((ArrayDeque) c1494670ozx.LIZ).iterator();
            while (it2.hasNext()) {
                ((ArrayDeque) c1494670ozx2.LIZ).push(it2.next());
            }
        }
        c1494670ozx2.LIZIZ = c1494670ozx.LIZIZ;
        c1494670ozx2.LIZJ = c1494670ozx.LIZJ;
        c1494670ozx2.LIZLLL = c1494670ozx.LIZLLL;
        c1494670ozx2.LJFF = c1494670ozx.LJFF;
        c1494670ozx2.LJI = c1494670ozx.LJI;
        c1494670ozx2.LJII = c1494670ozx.LJII;
        c1494670ozx2.LJIIIIZZ = c1494670ozx.LJIIIIZZ;
        c1494670ozx2.LJIIIZ = c1494670ozx.LJIIIZ;
        c1494670ozx2.LJIIJ = c1494670ozx.LJIIJ;
        c1494580ozo2.LIZJ = c1494670ozx2;
        C1494770p07 c1494770p07 = c1494580ozo.LIZLLL;
        c1494770p07.getClass();
        C1494770p07 c1494770p072 = new C1494770p07();
        c1494770p072.LIZ = new ArrayDeque();
        for (C1494760p06 c1494760p06 : (ArrayDeque) c1494770p07.LIZ) {
            Deque<C1494760p06> deque = c1494770p072.LIZ;
            c1494760p06.getClass();
            C1494760p06 c1494760p062 = new C1494760p06(c1494760p06.LIZ, c1494760p06.LIZIZ, c1494760p06.LIZJ);
            c1494760p062.LIZLLL = c1494760p06.LIZLLL;
            c1494760p062.LJ = c1494760p06.LJ;
            c1494760p062.LJFF = c1494760p06.LJFF;
            c1494760p062.LJI = c1494760p06.LJI;
            ((ArrayDeque) deque).push(c1494760p062);
        }
        c1494770p072.LIZIZ = new ArrayDeque();
        for (C1494760p06 c1494760p063 : (ArrayDeque) c1494770p07.LIZIZ) {
            Deque<C1494760p06> deque2 = c1494770p072.LIZIZ;
            c1494760p063.getClass();
            C1494760p06 c1494760p064 = new C1494760p06(c1494760p063.LIZ, c1494760p063.LIZIZ, c1494760p063.LIZJ);
            c1494760p064.LIZLLL = c1494760p063.LIZLLL;
            c1494760p064.LJ = c1494760p063.LJ;
            c1494760p064.LJFF = c1494760p063.LJFF;
            c1494760p064.LJI = c1494760p063.LJI;
            ((ArrayDeque) deque2).push(c1494760p064);
        }
        c1494580ozo2.LIZLLL = c1494770p072;
        C1494740p04 c1494740p04 = c1494580ozo.LJ;
        c1494740p04.getClass();
        C1494740p04 c1494740p042 = new C1494740p04();
        c1494740p042.LIZ = c1494740p04.LIZ;
        c1494740p042.LIZIZ = c1494740p04.LIZIZ;
        c1494740p042.LJ = c1494740p04.LJ;
        c1494740p042.LJFF = c1494740p04.LJFF;
        if (c1494740p04.LIZJ != null) {
            Throwable th2 = new Throwable(c1494740p04.LIZJ.getMessage());
            c1494740p042.LIZJ = th2;
            th2.setStackTrace(c1494740p04.LIZJ.getStackTrace());
        }
        WeakReference<Throwable> weakReference = c1494740p04.LIZLLL;
        if (weakReference != null && weakReference.get() != null) {
            WeakReference<Throwable> weakReference2 = new WeakReference<>(new Throwable(c1494740p04.LIZLLL.get().getMessage()));
            c1494740p042.LIZLLL = weakReference2;
            weakReference2.get().setStackTrace(c1494740p04.LIZLLL.get().getStackTrace());
        }
        c1494580ozo2.LJ = c1494740p042;
        c1494570ozn.LJLILLLLZI = c1494580ozo2;
        C1494650ozv c1494650ozv = this.LJLJI;
        c1494650ozv.getClass();
        C1494650ozv c1494650ozv2 = new C1494650ozv();
        C1494750p05 c1494750p05 = c1494650ozv.LIZ;
        c1494750p05.getClass();
        C1494750p05 c1494750p052 = new C1494750p05();
        c1494750p052.LIZ = c1494750p05.LIZ;
        c1494750p052.LIZIZ = c1494750p05.LIZIZ;
        c1494750p052.LIZJ = c1494750p05.LIZJ;
        c1494750p052.LIZLLL = c1494750p05.LIZLLL;
        c1494750p052.LJ = c1494750p05.LJ;
        c1494750p052.LJFF = c1494750p05.LJFF;
        c1494750p052.LJI = c1494750p05.LJI;
        c1494750p052.LJII = c1494750p05.LJII;
        c1494650ozv2.LIZ = c1494750p052;
        C1494720p02 c1494720p02 = c1494650ozv.LIZIZ;
        c1494720p02.getClass();
        C1494720p02 c1494720p022 = new C1494720p02();
        c1494720p022.LIZ = c1494720p02.LIZ;
        c1494720p022.LIZIZ = c1494720p02.LIZIZ;
        c1494720p022.LIZJ = c1494720p02.LIZJ;
        c1494720p022.LIZLLL = c1494720p02.LIZLLL;
        c1494720p022.LJ = c1494720p02.LJ;
        c1494720p022.LJFF = c1494720p02.LJFF;
        c1494720p022.LJI = c1494720p02.LJI;
        c1494720p022.LJII = c1494720p02.LJII;
        c1494720p022.LJIIIIZZ = c1494720p02.LJIIIIZZ;
        c1494720p022.LJIIIZ = c1494720p02.LJIIIZ;
        c1494650ozv2.LIZIZ = c1494720p022;
        C1494680ozy c1494680ozy = c1494650ozv.LIZJ;
        c1494680ozy.getClass();
        C1494680ozy c1494680ozy2 = new C1494680ozy();
        c1494680ozy2.LIZIZ = c1494680ozy.LIZIZ;
        c1494680ozy2.LIZJ = c1494680ozy.LIZJ;
        c1494680ozy2.LIZLLL = c1494680ozy.LIZLLL;
        c1494680ozy2.LJFF = c1494680ozy.LJFF;
        c1494680ozy2.LJI = c1494680ozy.LJI;
        c1494680ozy2.LJII = c1494680ozy.LJII;
        c1494680ozy2.LJIIIIZZ = c1494680ozy.LJIIIIZZ;
        c1494680ozy2.LJIIIZ = c1494680ozy.LJIIIZ;
        c1494680ozy2.LJ = c1494680ozy.LJ;
        if (!((ArrayDeque) c1494680ozy.LIZ).isEmpty()) {
            c1494680ozy2.LIZ = new ArrayDeque();
            Iterator it3 = ((ArrayDeque) c1494680ozy.LIZ).iterator();
            while (it3.hasNext()) {
                ((ArrayDeque) c1494680ozy2.LIZ).push(it3.next());
            }
        }
        c1494650ozv2.LIZJ = c1494680ozy2;
        C1494810p0B c1494810p0B = c1494650ozv.LIZLLL;
        c1494810p0B.getClass();
        C1494810p0B c1494810p0B2 = new C1494810p0B();
        c1494810p0B2.LIZ = c1494810p0B.LIZ;
        c1494810p0B2.LIZIZ = c1494810p0B.LIZIZ;
        c1494810p0B2.LIZJ = c1494810p0B.LIZJ;
        c1494810p0B2.LIZLLL = c1494810p0B.LIZLLL;
        c1494650ozv2.LIZLLL = c1494810p0B2;
        C1494780p08 c1494780p08 = c1494650ozv.LJ;
        c1494780p08.getClass();
        C1494780p08 c1494780p082 = new C1494780p08();
        c1494780p082.LIZIZ = c1494780p08.LIZIZ;
        c1494780p082.LIZJ = c1494780p08.LIZJ;
        c1494780p082.LIZLLL = c1494780p08.LIZLLL;
        try {
            if (c1494780p08.LIZ != null) {
                c1494780p082.LIZ = new JSONObject(C786410Ut5.J3(c1494780p08.LIZ));
            }
        } catch (JSONException e6) {
            TryCatchGuardChecker.doCheck(e6);
        }
        c1494650ozv2.LJ = c1494780p082;
        c1494650ozv2.LJFF = c1494650ozv.LJFF;
        c1494570ozn.LJLJI = c1494650ozv2;
    }

    public final void LJIILL(long j) {
        long jNanoTime = System.nanoTime();
        C1494650ozv c1494650ozv = this.LJLJI;
        c1494650ozv.LIZ.LIZLLL = jNanoTime;
        c1494650ozv.LIZJ.LJFF = jNanoTime - j;
    }

    public final void LJJIJIIJI(InterfaceC1904907d9 interfaceC1904907d9) {
        String name = interfaceC1904907d9.getClass().getName();
        if (!TextUtils.isEmpty(name)) {
            String strSubstring = name.substring(name.lastIndexOf(46) + 1);
            ((ArrayList) this.LJLIIL).add(new C1494800p0A(strSubstring, SystemClock.uptimeMillis()));
        }
    }

    public final void LJJIJIIJIL(Exception exc) {
        if (((ArrayList) this.LJLIL).size() <= 0) {
            return;
        }
        ((C1494800p0A) ListProtector.get((ArrayList) this.LJLIL, r1.size() - 1)).LIZJ = SystemClock.uptimeMillis();
        if (exc != null) {
            ListProtector.get((ArrayList) this.LJLIL, r1.size() - 1).getClass();
        }
    }

    public final void LJJIJIL(InterfaceC1904907d9 interfaceC1904907d9) {
        String name = interfaceC1904907d9.getClass().getName();
        if (!TextUtils.isEmpty(name)) {
            String strSubstring = name.substring(name.lastIndexOf(46) + 1);
            ((ArrayList) this.LJLIL).add(new C1494800p0A(strSubstring, SystemClock.uptimeMillis()));
        }
    }

    public final void LJJIL(long j) {
        this.LJLJI.LIZJ.LJI = System.nanoTime() - j;
    }

    public final void LJJIZ(long j) {
        this.LJLJI.LIZLLL.getClass();
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LIZIZ(j);
        }
    }

    public final void LJJJ(long j) {
        this.LJLJI.LIZLLL.LIZJ = j;
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJIIL(j);
        }
    }

    public final void LJJJI(long j) {
        this.LJLJI.LIZLLL.LIZIZ = j;
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LIZ(j);
        }
    }

    public final void LJJJIL(long j) {
        this.LJLJI.LIZLLL.LIZ = j;
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJIIJJI(j);
        }
    }

    public final void LJJJJ(long j) {
        this.LJLJI.LIZLLL.getClass();
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJIIIIZZ(j);
        }
    }

    public final void LJJJJI(long j) {
        this.LJLJI.LIZLLL.getClass();
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJI(j);
        }
    }

    public final void LJJJJIZL(long j) {
        this.LJLJI.LIZLLL.LIZLLL = j;
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LIZLLL(j);
        }
    }

    public final void LJJJJJ(String str) {
        this.LJLJI.LJFF = str;
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJIIIZ(str);
        }
    }

    public final void LJJJJL(boolean z) {
        C1494700p00 c1494700p00 = this.LJLILLLLZI.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1494700p00.LJIIJJI = jCurrentTimeMillis;
        this.LJIILIIL = jCurrentTimeMillis;
        this.LJLILLLLZI.LIZ.LJIIJ = System.nanoTime();
        if (z) {
            this.LJIJJLI = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZ.LJIIJ);
        } else {
            this.LJIL = C1494420ozY.LIZIZ(this.LJLILLLLZI.LIZ.LJIIJ);
        }
        this.LJLILLLLZI.LJ.LJ = C1493360oxq.LIZ;
        C1494580ozo c1494580ozo = this.LJLILLLLZI;
        C1494710p01 c1494710p01 = c1494580ozo.LIZIZ;
        C1494700p00 c1494700p002 = c1494580ozo.LIZ;
        long j = c1494700p002.LJIIJ;
        long j2 = j - c1494700p002.LJI;
        c1494710p01.LIZIZ = j2;
        long j3 = c1494700p002.LJIIIIZZ;
        if (j3 != -1 && j3 < j) {
            long j4 = c1494580ozo.LIZJ.LIZLLL;
            if (j4 != -1) {
                c1494710p01.LIZIZ = j2 - j4;
            }
        }
    }

    public final void LJJJJLI(JSONObject jSONObject) {
        WeakReference<InterfaceC1494730p03> weakReference = this.LIZIZ;
        if (weakReference != null) {
            weakReference.get().LJII(jSONObject);
        }
        if (LJLLI) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("retrofit", this.LJLILLLLZI.LIZ());
            jSONObject2.put("networklib", this.LJLJI.LIZ());
            jSONObject.put("ttnet", jSONObject2);
        }
    }

    public final void LJIIL(Object obj, Throwable th) {
        String string;
        URL url = this.LIZ;
        if (url != null) {
            string = url.toString();
        } else {
            string = "";
        }
        if (th == null) {
            C1493800oyY.LIZIZ(obj, string);
            return;
        }
        if (th instanceof C1494460ozc) {
            C1494460ozc c1494460ozc = (C1494460ozc) th;
            if (c1494460ozc.reportMonitorOk) {
                C1493800oyY.LIZIZ(obj, string);
            }
            if (!c1494460ozc.reportMonitorError) {
                return;
            }
            C1493800oyY.LIZ(obj, string, th);
            return;
        }
        C1494740p04 c1494740p04 = this.LJLILLLLZI.LJ;
        if (c1494740p04.LIZ) {
            c1494740p04.LIZJ = th;
            this.LJJIL = th;
            C1493800oyY.LIZIZ(obj, string);
        } else {
            LJLL.getClass();
            InterfaceC1494550ozl interfaceC1494550ozl = C1494230ozF.LJ;
            if (interfaceC1494550ozl == null) {
                return;
            }
            interfaceC1494550ozl.LIZ();
            C1493800oyY.LIZ(obj, string, th);
        }
    }

    public static boolean LJJJLIIL(JSONObject jSONObject, String str, long j, long j2, boolean z) {
        try {
            if (z && j <= j2) {
                jSONObject.put(str, j2 - j);
                return true;
            }
            jSONObject.put(str, -1);
            return false;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
