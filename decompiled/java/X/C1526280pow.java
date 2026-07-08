package X;

import Y.ARunnableS123S0100000_23;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import android.util.LruCache;
import androidx.lifecycle.ProcessLifecycleOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.sync.model.SubscribeResponse;
import com.bytedance.sync.model.Topic;
import com.bytedance.sync.v4.compensate.CompensatorImplV4;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1526280pow implements InterfaceC1526780ppk, InterfaceC1525700po0 {
    public final Context LIZ;
    public final C1526570ppP LIZIZ;
    public final C1526350pp3 LIZJ;
    public final C1526360pp4 LIZLLL;
    public final C1526100poe LJ;
    public final C1526810ppn LJFF;
    public final C1525590pnp LJI;
    public final C1526560ppO LJII;
    public C1526230por LJIIIIZZ;
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public final C1526370pp5 LJIIJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0pny] */
    /* JADX WARN: Type inference failed for: r4v1, types: [X.0Vpm] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    public final InterfaceC809840Vpm LIZ(C809910Vpt c809910Vpt) {
        ?? r4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[SyncSDKImplV4] register business ");
        sbLIZ.append(c809910Vpt.LIZ);
        C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        this.LIZIZ.getClass();
        C1526350pp3 c1526350pp3 = this.LIZJ;
        synchronized (c1526350pp3) {
            try {
                C1525690pnz c1525690pnz = (C1525690pnz) ((ConcurrentHashMap) c1526350pp3.LLILLJJLI).get(Long.valueOf(c809910Vpt.LIZ));
                if (c1525690pnz != null) {
                    c1525690pnz.LIZ(c809910Vpt.LIZIZ);
                    r4 = ((C1525690pnz) ((ConcurrentHashMap) c1526350pp3.LLILLJJLI).get(Long.valueOf(c809910Vpt.LIZ))).LIZIZ;
                } else {
                    InterfaceC1526790ppl interfaceC1526790ppl = c1526350pp3.LL;
                    final Long lValueOf = Long.valueOf(c809910Vpt.LIZ);
                    C1526440ppC c1526440ppC = (C1526440ppC) interfaceC1526790ppl;
                    c1526440ppC.getClass();
                    final C1526350pp3 c1526350pp32 = c1526440ppC.LIZ.LIZJ;
                    ?? r42 = new InterfaceC809840Vpm(lValueOf, c1526350pp32) { // from class: X.0pny
                        public final Long LIZ;
                        public final C1526350pp3 LIZIZ;

                        @Override // X.InterfaceC809840Vpm
                        public final void remove() {
                            C1526350pp3 c1526350pp33 = this.LIZIZ;
                            long jLongValue = this.LIZ.longValue();
                            ((ConcurrentHashMap) c1526350pp33.LLILLJJLI).remove(Long.valueOf(jLongValue));
                        }

                        {
                            this.LIZ = lValueOf;
                            this.LIZIZ = c1526350pp32;
                        }
                    };
                    C1525690pnz c1525690pnz2 = new C1525690pnz(c809910Vpt, r42, c1526350pp3.LLILLL);
                    c1525690pnz2.LIZ(c809910Vpt.LIZIZ);
                    c1525690pnz2.LIZIZ(c809910Vpt.LIZJ);
                    ((ConcurrentHashMap) c1526350pp3.LLILLJJLI).put(Long.valueOf(c809910Vpt.LIZ), c1525690pnz2);
                    r4 = r42;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return r4;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0ppB] */
    /* JADX WARN: Type inference failed for: r0v26, types: [X.0ppO] */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0pp5, X.0pp6] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0VnY, X.0ppn] */
    public C1526280pow(final Context context, final C1526570ppP c1526570ppP) {
        ?? r2 = new AbstractC1526380pp6<Handler>() { // from class: X.0pp5
            @Override // X.AbstractC1526380pp6
            public final Handler LIZ(Object[] objArr) {
                return new BPEAHandler(((InterfaceC1525560pnm) C808470VnZ.LIZ(InterfaceC1525560pnm.class)).get());
            }
        };
        this.LJIIJ = r2;
        this.LIZ = context;
        this.LIZIZ = c1526570ppP;
        C1526350pp3 c1526350pp3 = new C1526350pp3(this, new C1526440ppC(this));
        this.LIZJ = c1526350pp3;
        C1525590pnp c1525590pnp = new C1525590pnp(c1526570ppP, c1526350pp3);
        this.LJI = c1525590pnp;
        final int i = c1526570ppP.LJ;
        final int i2 = c1526570ppP.LJFF;
        ?? r9 = new InterfaceC1526830ppp(i, i2) { // from class: X.0ppn
            public final int LL;
            public final int LLILLJJLI;

            @Override // X.InterfaceC1526830ppp
            public final C1527060pqC LJJIIJ(byte[] bArr) {
                if (bArr == null) {
                    return null;
                }
                try {
                    return C1527060pqC.ADAPTER.decode(bArr);
                } catch (IOException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.InterfaceC1526830ppp
            public final byte[] LJJIJLIJ(C1527060pqC c1527060pqC) {
                if (c1527060pqC == null) {
                    return null;
                }
                return C1527060pqC.ADAPTER.encode(c1527060pqC);
            }

            {
                this.LL = i;
                this.LLILLJJLI = i2;
            }

            @Override // X.InterfaceC1526830ppp
            public final WsChannelMsg LJJLIIIJLLLLLLLZ(Context context2, C1527060pqC c1527060pqC) {
                String str;
                byte[] bArrLIZ;
                int iIntValue;
                byte[] bArrEncode = C1527060pqC.ADAPTER.encode(c1527060pqC);
                if (C1526890ppv.LIZJ(context2).LIZIZ().LIZLLL() && (bArrLIZ = AbstractC808800Vo6.LIZ(bArrEncode)) != null && bArrLIZ.length != 0) {
                    int length = bArrEncode.length;
                    int length2 = bArrLIZ.length;
                    Integer numLIZ = C1527180pqO.LIZ(c1527060pqC);
                    if (numLIZ == null) {
                        iIntValue = -1;
                    } else {
                        iIntValue = numLIZ.intValue();
                    }
                    C1526300poy.LIZJ(length, length2, iIntValue);
                    str = "gzip";
                    bArrEncode = bArrLIZ;
                } else {
                    str = "pb";
                }
                C0WKM c0wkm = new C0WKM(this.LL);
                c0wkm.LJFF = bArrEncode;
                c0wkm.LJ = 2;
                c0wkm.LIZLLL = this.LLILLJJLI;
                c0wkm.LJII = str;
                c0wkm.LJI = str;
                return c0wkm.LIZIZ();
            }
        };
        this.LJFF = r9;
        C1526100poe c1526100poe = new C1526100poe(context);
        this.LJ = c1526100poe;
        this.LIZLLL = new C1526360pp4(context);
        final C1526290pox c1526290pox = new C1526290pox(context);
        C1526870ppt c1526870ppt = new C1526870ppt(context, c1526570ppP.LIZLLL);
        C808470VnZ.LIZIZ(InterfaceC1525760po6.class, new InterfaceC1525760po6(c1526570ppP) { // from class: X.0ppJ
            public final C1526570ppP LL;

            @Override // X.InterfaceC1525760po6
            public final C1526570ppP config() {
                return this.LL;
            }

            {
                this.LL = c1526570ppP;
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1526260pou.class, c1526870ppt);
        C808470VnZ.LIZIZ(InterfaceC1525560pnm.class, new InterfaceC1525560pnm() { // from class: X.0pp9
            public final C1526420ppA LL = new AbstractC1526380pp6<Looper>() { // from class: X.0ppA
                @Override // X.AbstractC1526380pp6
                public final Looper LIZ(Object[] objArr) {
                    HandlerThread handlerThread = new HandlerThread("sync-sdk-v4");
                    handlerThread.start();
                    return C786410Ut5.W2(handlerThread);
                }
            };

            @Override // X.InterfaceC1525560pnm
            public final Looper get() {
                return LIZIZ(new Object[0]);
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1526830ppp.class, r9);
        C808470VnZ.LIZIZ(InterfaceC1525900poK.class, new C1527670prB(context));
        C808470VnZ.LIZIZ(InterfaceC1526490ppH.class, new C1526580ppQ());
        final ?? r0 = new InterfaceC1527570pr1() { // from class: X.0ppB
            @Override // X.InterfaceC1527570pr1
            public final void LIZ(int i3, C1527060pqC c1527060pqC) {
                this.LIZ.LJ.LIZ(1, c1527060pqC);
            }
        };
        C808470VnZ.LIZIZ(InterfaceC1526270pov.class, new InterfaceC1526270pov(context, r0) { // from class: X.0pqd
            public CompensatorImplV4 LL;
            public final Context LLILLJJLI;
            public final C1526570ppP LLILLL = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
            public final InterfaceC1527570pr1 LLILZ;

            @Override // X.InterfaceC1526270pov
            public final void LIZ() {
                CompensatorImplV4 compensatorImplV4 = this.LL;
                if (compensatorImplV4 != null) {
                    compensatorImplV4.LLIZLLLIL.set(true);
                    if (compensatorImplV4.LLIZLLLIL.get()) {
                        if (compensatorImplV4.LLILZLL != null) {
                            compensatorImplV4.LLILZLL.LIZIZ();
                        } else if (compensatorImplV4.LLILLJJLI.LIZIZ(new Object[0]).hasCallbacks(compensatorImplV4.LLJI)) {
                            C1527890prX.LIZJ("[CompensatorV4] reset start delay task and run right now");
                            compensatorImplV4.LLILLJJLI.LIZIZ(new Object[0]).removeCallbacks(compensatorImplV4.LLJI);
                            C786410Ut5.LJJZZIII(compensatorImplV4.LLILLJJLI.LIZIZ(new Object[0]), compensatorImplV4.LLJI);
                        }
                    }
                }
            }

            @Override // X.InterfaceC1526270pov
            public final void LJJJJLI() {
                final CompensatorImplV4 compensatorImplV4 = new CompensatorImplV4(this.LLILLJJLI, this.LLILLL, this.LLILZ);
                Runnable runnable = new Runnable() { // from class: X.0pqg
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("CompensatorImplV4@ca22.registerLifeCycleListener$1");
                        try {
                            try {
                                ProcessLifecycleOwner.get().getLifecycle().addObserver(compensatorImplV4);
                            } catch (Exception e) {
                                TryCatchGuardChecker.doCheck(e);
                                C1527890prX.LIZIZ("there is something wrong when add life cycle Observer,maybe someone add addObserver in work thread");
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("CompensatorImplV4@ca22.registerLifeCycleListener$1");
                    }
                };
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), runnable);
                }
                InterfaceC1525970poR interfaceC1525970poRLIZIZ = C1526890ppv.LIZJ(compensatorImplV4.LL).LIZIZ();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[CompensatorV4] start compensator. compensator will run after ");
                sbLIZ.append((interfaceC1525970poRLIZIZ.LJIIIZ() * 1000) + 1000);
                sbLIZ.append("ms");
                C1527890prX.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                C786410Ut5.LJLIIL(interfaceC1525970poRLIZIZ.LJIIIIZZ() ? 1000 + (interfaceC1525970poRLIZIZ.LJIIIZ() * 1000) : 1000L, compensatorImplV4.LLILLJJLI.LIZIZ(new Object[0]), compensatorImplV4.LLJI);
                this.LL = compensatorImplV4;
            }

            @Override // X.InterfaceC1526270pov
            public final void reset() {
                CompensatorImplV4 compensatorImplV4 = this.LL;
                if (compensatorImplV4 != null) {
                    compensatorImplV4.LLILLJJLI.LIZIZ(new Object[0]).removeCallbacksAndMessages(null);
                    C1526890ppv c1526890ppvLIZJ = C1526890ppv.LIZJ(compensatorImplV4.LL);
                    synchronized (c1526890ppvLIZJ.LLILZ) {
                        try {
                            ((ArrayList) c1526890ppvLIZJ.LLILZ).remove(compensatorImplV4);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                    ARunnableS123S0100000_23 aRunnableS123S0100000_23 = new ARunnableS123S0100000_23(compensatorImplV4, 229);
                    if (Looper.getMainLooper() == Looper.myLooper()) {
                        aRunnableS123S0100000_23.run();
                    } else {
                        C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), aRunnableS123S0100000_23);
                    }
                    if (compensatorImplV4.LLILZLL != null) {
                        compensatorImplV4.LLILZLL.destroy();
                        compensatorImplV4.LLILZLL = null;
                    }
                    this.LL = null;
                }
            }

            @Override // X.InterfaceC1526270pov
            public final void LJIIJ(C1527060pqC c1527060pqC) {
                CompensatorImplV4 compensatorImplV4 = this.LL;
                if (compensatorImplV4 != null && compensatorImplV4.LLJ.get() && compensatorImplV4.LLILZLL != null) {
                    compensatorImplV4.LLILZLL.LJIIJ(c1527060pqC);
                }
            }

            {
                this.LLILLJJLI = context;
                this.LLILZ = r0;
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1526480ppG.class, new InterfaceC1526480ppG() { // from class: X.0pp7
            public final List<InterfaceC1526550ppN> LL = new ArrayList();

            @Override // X.InterfaceC1526480ppG
            public final void LJJJLIIL(WsChannelMsg wsChannelMsg) {
                for (InterfaceC1526550ppN interfaceC1526550ppN : (ArrayList) this.LL) {
                    if (interfaceC1526550ppN != null) {
                        interfaceC1526550ppN.LJJZ();
                    }
                }
            }

            @Override // X.InterfaceC1526480ppG
            public final void LJJLI(InterfaceC1526550ppN interfaceC1526550ppN) {
                if (interfaceC1526550ppN != null) {
                    ((ArrayList) this.LL).add(interfaceC1526550ppN);
                }
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1527530pqx.class, new C1526990pq5(context, c1526100poe));
        C808470VnZ.LIZIZ(InterfaceC1525730po3.class, new C1527000pq6(context, (InterfaceC1527530pqx) C808470VnZ.LIZ(InterfaceC1527530pqx.class)));
        C808470VnZ.LIZIZ(InterfaceC1526470ppF.class, c1526570ppP.LIZIZ);
        C808470VnZ.LIZIZ(InterfaceC1525530pnj.class, new InterfaceC1525530pnj(context) { // from class: X.0p5p
            public final Context LL;
            public final C1498320p5q LLILLJJLI = new LruCache<String, byte[]>() { // from class: X.0p5q
                @Override // android.util.LruCache
                public final int sizeOf(String str, byte[] bArr) {
                    return bArr.length;
                }
            };
            public final Map<String, Long> LLILLL = new HashMap();

            @Override // X.InterfaceC1525530pnj
            public final File LJLI() {
                return this.LL.getFileStreamPath("bd_sync_sdk");
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [X.0p5q] */
            {
                this.LL = context;
            }

            public static byte[] LJI(C0VSJ c0vsj) {
                C1496670p3B c1496670p3B;
                if (!c0vsj.exists()) {
                    return null;
                }
                try {
                    c1496670p3B = new C1496670p3B(new C1496660p3A(C1496330p2d.LIZIZ(c0vsj)));
                    try {
                        byte[] bArrLJZL = c1496670p3B.LJZL();
                        try {
                            c1496670p3B.close();
                            return bArrLJZL;
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            return bArrLJZL;
                        }
                    } catch (Throwable th) {
                        th = th;
                        try {
                            TryCatchGuardChecker.doCheck(th);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("read file throw exception : ");
                            sbLIZ.append(th);
                            C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                            if (c1496670p3B != null) {
                                try {
                                    c1496670p3B.close();
                                    return null;
                                } catch (IOException e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    return null;
                                }
                            }
                            return null;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            if (c1496670p3B != null) {
                                try {
                                    c1496670p3B.close();
                                    throw th2;
                                } catch (IOException e3) {
                                    TryCatchGuardChecker.doCheck(e3);
                                    throw th2;
                                }
                            }
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c1496670p3B = null;
                }
            }

            @Override // X.InterfaceC1525530pnj
            public final String LJIIL(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileCache  readCache ");
                sbLIZ.append(str);
                C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                C0VSJ c0vsj = new C0VSJ(str);
                String name = c0vsj.getName();
                byte[] bArrLJI = get(name);
                if (bArrLJI == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("FileCache  real readCache ");
                    sbLIZ2.append(str);
                    C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                    bArrLJI = LJI(c0vsj);
                }
                try {
                    String str2 = new String(bArrLJI, "UTF-8");
                    String strLIZIZ = C2084908Et.LIZIZ(str2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("_");
                    sbLIZ3.append(strLIZIZ);
                    if (name.endsWith(C2188811AlT.LIZIZ(sbLIZ3))) {
                        return str2;
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("read data throw exception: ");
                    sbLIZ4.append(th);
                    C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    return null;
                }
            }

            @Override // X.InterfaceC1525530pnj
            public final void LJJIZ(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileCache  delete ");
                sbLIZ.append(str);
                C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                try {
                    remove(new C0VSJ(str).getName());
                    C2260008tK.LIZLLL(str);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.InterfaceC1525530pnj
            public final void LJJLIIJ(long j) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileCache  deleteAllFiles ");
                sbLIZ.append(j);
                C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                Iterator it2 = ((HashMap) this.LLILLL).entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (entry.getValue() != null && ((Long) entry.getValue()).longValue() == j) {
                        it2.remove();
                    }
                }
                try {
                    C2260008tK.LJ(new C0VSJ(this.LL.getFileStreamPath("bd_sync_sdk"), String.valueOf(j)).getAbsolutePath());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }

            @Override // X.InterfaceC1525530pnj
            public final byte[] LJJZZI(String str) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileCache  readCache ");
                sbLIZ.append(str);
                C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                C0VSJ c0vsj = new C0VSJ(str);
                String name = c0vsj.getName();
                byte[] bArrLJI = get(name);
                if (bArrLJI == null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("FileCache  real readCache ");
                    sbLIZ2.append(str);
                    C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ2));
                    bArrLJI = LJI(c0vsj);
                }
                try {
                    String strLIZIZ = C2084908Et.LIZIZ(new String(bArrLJI, "UTF-8"));
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("_");
                    sbLIZ3.append(strLIZIZ);
                    if (name.endsWith(C2188811AlT.LIZIZ(sbLIZ3))) {
                        return bArrLJI;
                    }
                    return null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("read data throw exception: ");
                    sbLIZ4.append(th);
                    C1527890prX.LIZIZ(C2188811AlT.LIZIZ(sbLIZ4));
                    return null;
                }
            }

            @Override // X.InterfaceC1525530pnj
            public final String LJIIZILJ(long j, long j2, byte[] bArr) {
                try {
                    return LJJJLZIJ("synclog", bArr, C2084908Et.LIZIZ(new String(bArr, "UTF-8")), j, j2);
                } catch (UnsupportedEncodingException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return null;
                }
            }

            @Override // X.InterfaceC1525530pnj
            public final String LJJJLZIJ(String str, byte[] bArr, String str2, long j, long j2) {
                C1496710p3F c1496710p3F;
                C1498330p5r c1498330p5r;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("FileCache  putCache ");
                sbLIZ.append(j);
                sbLIZ.append(str2);
                C1527890prX.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append("_");
                sbLIZ2.append(j2);
                sbLIZ2.append("_");
                sbLIZ2.append(str2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                put(strLIZIZ, bArr);
                ((HashMap) this.LLILLL).put(strLIZIZ, Long.valueOf(j));
                File fileStreamPath = this.LL.getFileStreamPath("bd_sync_sdk");
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(j);
                sbLIZ3.append(File.separator);
                sbLIZ3.append(strLIZIZ);
                C0VSJ c0vsj = new C0VSJ(fileStreamPath, C2188811AlT.LIZIZ(sbLIZ3));
                String absolutePath = c0vsj.getAbsolutePath();
                try {
                    File parentFile = c0vsj.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    C2260008tK.LIZLLL(c0vsj.getAbsolutePath());
                    c0vsj.createNewFile();
                    c1496710p3F = new C1496710p3F(new InterfaceC1495590p1R(C1496330p2d.LIZ(new C0VSV((File) c0vsj, false))) { // from class: X.0p3H
                        public final C1496710p3F LL;
                        public final Deflater LLILLJJLI;
                        public final C1496740p3I LLILLL;
                        public boolean LLILZ;
                        public final CRC32 LLILZIL;

                        @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
                        public final void close() throws Throwable {
                            if (this.LLILZ) {
                                return;
                            }
                            try {
                                C1496740p3I c1496740p3I = this.LLILLL;
                                c1496740p3I.LLILLL.finish();
                                c1496740p3I.LIZ(false);
                                this.LL.LL((int) this.LLILZIL.getValue());
                                this.LL.LL((int) this.LLILLJJLI.getBytesRead());
                                th = null;
                            } catch (Throwable th) {
                                th = th;
                                TryCatchGuardChecker.doCheck(th);
                            }
                            try {
                                this.LLILLJJLI.end();
                            } catch (Throwable th2) {
                                TryCatchGuardChecker.doCheck(th2);
                                if (th == null) {
                                    th = th2;
                                }
                            }
                            try {
                                this.LL.close();
                            } catch (Throwable th3) {
                                TryCatchGuardChecker.doCheck(th3);
                                if (th == null) {
                                    th = th3;
                                }
                            }
                            this.LLILZ = true;
                            if (th != null) {
                                throw th;
                            }
                        }

                        @Override // X.InterfaceC1495590p1R, java.io.Flushable
                        public final void flush() {
                            this.LLILLL.flush();
                        }

                        @Override // X.InterfaceC1495590p1R
                        public final C1496250p2V timeout() {
                            return this.LL.timeout();
                        }

                        {
                            C1496710p3F c1496710p3F2 = new C1496710p3F(c1496650p39);
                            this.LL = c1496710p3F2;
                            Deflater deflater = new Deflater(-1, true);
                            this.LLILLJJLI = deflater;
                            this.LLILLL = new C1496740p3I(c1496710p3F2, deflater);
                            this.LLILZIL = new CRC32();
                            C1496690p3D c1496690p3D = c1496710p3F2.LL;
                            c1496690p3D.LJL(8075);
                            c1496690p3D.LJJJZ(8);
                            c1496690p3D.LJJJZ(0);
                            c1496690p3D.LJJLIL(0);
                            c1496690p3D.LJJJZ(0);
                            c1496690p3D.LJJJZ(0);
                        }

                        @Override // X.InterfaceC1495590p1R
                        public final void LLFF(C1496690p3D c1496690p3D, long j3) {
                            if (j3 >= 0) {
                                if (j3 == 0) {
                                    return;
                                }
                                C1496750p3J c1496750p3J = c1496690p3D.LL;
                                if (c1496750p3J == null) {
                                    Intrinsics.LJIIL();
                                }
                                long j4 = j3;
                                while (j4 > 0) {
                                    int iMin = (int) Math.min(j4, c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
                                    this.LLILZIL.update(c1496750p3J.LIZ, c1496750p3J.LIZIZ, iMin);
                                    j4 -= (long) iMin;
                                    c1496750p3J = c1496750p3J.LJFF;
                                    if (c1496750p3J == null) {
                                        Intrinsics.LJIIL();
                                    }
                                }
                                this.LLILLL.LLFF(c1496690p3D, j3);
                                return;
                            }
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("byteCount < 0: ");
                            sbLIZ4.append(j3);
                            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                            strLIZIZ2.toString();
                            throw new IllegalArgumentException(strLIZIZ2);
                        }
                    });
                } catch (Throwable th) {
                    th = th;
                    c1496710p3F = null;
                }
                try {
                    c1496710p3F.write(bArr);
                    c1496710p3F.flush();
                    c1498330p5r = new C1498330p5r(true, null);
                    try {
                        c1496710p3F.close();
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append(th.getClass().toString());
                        sbLIZ4.append(": ");
                        sbLIZ4.append(th.getMessage());
                        c1498330p5r = new C1498330p5r(false, C2188811AlT.LIZIZ(sbLIZ4));
                        if (c1496710p3F != null) {
                            try {
                                c1496710p3F.close();
                            } catch (IOException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        if (c1496710p3F != null) {
                            try {
                                c1496710p3F.close();
                                throw th3;
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                throw th3;
                            }
                        }
                        throw th3;
                    }
                }
                JSONObject jSONObject = new JSONObject();
                C1499090p75.LIZJ("file_path", absolutePath, jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("success", c1498330p5r.LIZ);
                } catch (JSONException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                }
                if (!c1498330p5r.LIZ) {
                    C1499090p75.LIZJ("error_msg", c1498330p5r.LIZIZ, jSONObject2);
                }
                C1526300poy.LIZ("sync_sdk_save_file_monitor", jSONObject2, null, jSONObject);
                if (!c1498330p5r.LIZ) {
                    return null;
                }
                return absolutePath;
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1525570pnn.class, new C1525490pnf(context, c1525590pnp));
        C808470VnZ.LIZIZ(InterfaceC1526020poW.class, new C1525920poM(context, c1526570ppP, c1526870ppt, c1526350pp3));
        C808470VnZ.LIZIZ(InterfaceC1525550pnl.class, new InterfaceC1525550pnl() { // from class: X.0po2
            @Override // X.InterfaceC1525550pnl
            public final void LJJLIIIJJIZ() {
                ((InterfaceC1525730po3) C808470VnZ.LIZ(InterfaceC1525730po3.class)).LJIILLIIL(0, false);
            }

            @Override // X.InterfaceC1525550pnl
            public final boolean LJJJJIZL(String str) {
                ((InterfaceC1525530pnj) C808470VnZ.LIZ(InterfaceC1525530pnj.class)).LJJLIIJ(CastLongProtector.parseLong(str));
                return ((InterfaceC1525900poK) C808470VnZ.LIZ(InterfaceC1525900poK.class)).LJJI(str);
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1526860pps.class, new InterfaceC1526860pps(context, c1526290pox) { // from class: X.0ppm
            public final Context LL;
            public final InterfaceC1526760ppi LLILLJJLI;
            public final C01GW LLILLL = C452501pT.LIZIZ(new C1771906wn());

            public static Uri LJI() {
                C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
                C1526570ppP c1526570ppPConfig = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
                return UriProtector.parse(c1526570ppPConfig.LJI).buildUpon().appendPath("v2/bytesync/api/pipeline").appendQueryParameter("device_id", c1526010poVLIZIZ.LIZ).appendQueryParameter("aid", c1526570ppPConfig.LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT).build();
            }

            @Override // X.InterfaceC1526860pps
            public final SubscribeResponse LJIL(Topic topic) {
                C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
                C1526570ppP c1526570ppPConfig = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
                return (SubscribeResponse) GsonProtectorUtils.fromJson((Gson) this.LLILLL.getValue(), LJLIL(UriProtector.parse(c1526570ppPConfig.LJI).buildUpon().appendPath("v2/bytesync/api/subscribe").appendQueryParameter("device_id", c1526010poVLIZIZ.LIZ).appendQueryParameter("aid", c1526570ppPConfig.LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT).build().toString(), GsonProtectorUtils.toJson((Gson) this.LLILLL.getValue(), topic).getBytes(Charsets.UTF_8)), SubscribeResponse.class);
            }

            @Override // X.InterfaceC1526860pps
            public final C1527060pqC LJJ(C1527060pqC c1527060pqC) {
                try {
                    Uri uriLJI = LJI();
                    return ((InterfaceC1526830ppp) C808470VnZ.LIZ(InterfaceC1526830ppp.class)).LJJIIJ(Base64.decode(LJJZ(uriLJI.toString(), c1527060pqC, C1526890ppv.LIZJ(this.LL).LIZIZ().LIZLLL()), 0));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1527890prX.LIZIZ(Log.getStackTraceString(th));
                    return null;
                }
            }

            @Override // X.InterfaceC1526860pps
            public final SubscribeResponse LJJIIZI(Topic topic) {
                C1526010poV c1526010poVLIZIZ = ((InterfaceC1526260pou) C808470VnZ.LIZ(InterfaceC1526260pou.class)).LIZIZ();
                C1526570ppP c1526570ppPConfig = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
                return (SubscribeResponse) GsonProtectorUtils.fromJson((Gson) this.LLILLL.getValue(), LJLIL(UriProtector.parse(c1526570ppPConfig.LJI).buildUpon().appendPath("v2/bytesync/api/unsubscribe").appendQueryParameter("device_id", c1526010poVLIZIZ.LIZ).appendQueryParameter("aid", c1526570ppPConfig.LIZ).appendQueryParameter("platform", CardStruct.IStatusCode.DEFAULT).build().toString(), GsonProtectorUtils.toJson((Gson) this.LLILLL.getValue(), topic).getBytes(Charsets.UTF_8)), SubscribeResponse.class);
            }

            {
                this.LL = context;
                this.LLILLJJLI = c1526290pox;
            }

            public static String LJLIL(String str, byte[] bArr) {
                boolean zLJI = MethodIDManager.LJI(137193);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (!C2093608Ic.LJ("application/json; charset=utf-8")) {
                    linkedHashMap.put("Content-Type", "application/json; charset=utf-8");
                }
                new C808790Vo5();
                try {
                    ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().getClass();
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1527890prX.LIZIZ(Intrinsics.LJIIJJI(th, "iRequestTagHeaderProvider err: "));
                    String strLJ = AbstractC808800Vo6.LIZ.LJ(str, bArr, linkedHashMap);
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return strLJ;
                }
            }

            public final String LJJZ(String str, C1527060pqC c1527060pqC, boolean z) throws Throwable {
                boolean z2;
                int iIntValue;
                String strLJ;
                boolean zLJI = MethodIDManager.LJI(137193);
                byte[] bArrLJJIJLIJ = ((InterfaceC1526830ppp) C808470VnZ.LIZ(InterfaceC1526830ppp.class)).LJJIJLIJ(c1527060pqC);
                if (bArrLJJIJLIJ == null) {
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return null;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (z) {
                    try {
                        byte[] bArrLIZ = AbstractC808800Vo6.LIZ(bArrLJJIJLIJ);
                        if (bArrLIZ != null) {
                            if (bArrLIZ.length != 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (!z2) {
                                int length = bArrLJJIJLIJ.length;
                                int length2 = bArrLIZ.length;
                                Integer numLIZ = C1527180pqO.LIZ(c1527060pqC);
                                if (numLIZ == null) {
                                    iIntValue = -1;
                                } else {
                                    iIntValue = numLIZ.intValue();
                                }
                                C1526300poy.LIZJ(length, length2, iIntValue);
                                linkedHashMap.put("Accept-Encoding", "gzip");
                                linkedHashMap.put("Content-Encoding", "gzip");
                                bArrLJJIJLIJ = bArrLIZ;
                            }
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        C829590WgX c829590WgX = new C829590WgX(0, e.getMessage());
                        if (zLJI) {
                            MethodIDManager.LJ();
                            throw c829590WgX;
                        }
                        throw c829590WgX;
                    }
                }
                if (!C2093608Ic.LJ("application/octet-stream")) {
                    linkedHashMap.put("Content-Type", "application/octet-stream");
                }
                C808790Vo5 c808790Vo5 = new C808790Vo5();
                c808790Vo5.LIZ = false;
                try {
                    ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().getClass();
                    throw null;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1527890prX.LIZIZ(Intrinsics.LJIIJJI(th, "iRequestTagHeaderProvider err: "));
                    try {
                        ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().getClass();
                        strLJ = ((C1526290pox) this.LLILLJJLI).LIZLLL(C2175908fl.LIZIZ(str, bArrLJJIJLIJ, linkedHashMap, c808790Vo5));
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C1527890prX.LIZIZ(Intrinsics.LJIIJJI(th2, "sync net service impl post err: "));
                        strLJ = AbstractC808800Vo6.LIZ.LJ(str, bArrLJJIJLIJ, linkedHashMap);
                    }
                    if (zLJI) {
                        MethodIDManager.LJ();
                    }
                    return strLJ;
                }
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1526030poX.class, new InterfaceC1526030poX() { // from class: X.0p6G
            public volatile AtomicInteger LL = new AtomicInteger(1);
            public volatile AtomicLong LLILLJJLI;

            @Override // X.InterfaceC1526030poX
            public final void LIZ() {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.LLILLJJLI.get();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("sync_cost", jCurrentTimeMillis);
                    C1526300poy.LIZ("sync_sdk_sync_cost", null, jSONObject, null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1526300poy.LIZLLL(null, e);
                }
            }

            @Override // X.InterfaceC1526030poX
            public final int LJJJJZ() {
                return this.LL.get();
            }

            {
                new AtomicBoolean(true);
                this.LLILLJJLI = new AtomicLong(0L);
            }

            @Override // X.InterfaceC1526030poX
            public final void LJJIIJZLJL(int i3, long j) {
                this.LL.set(i3);
                this.LLILLJJLI.set(j);
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1526530ppL.class, new InterfaceC1526530ppL() { // from class: X.0pp8
            public final C1526570ppP LL = ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();

            @Override // X.InterfaceC1526530ppL
            public final boolean LJJJJ(Context context2) {
                C1526570ppP c1526570ppP2 = this.LL;
                if (c1526570ppP2 != null) {
                    c1526570ppP2.getClass();
                }
                return C804420Vh2.LJFF(context2);
            }
        });
        C808470VnZ.LIZIZ(InterfaceC1526050poZ.class, new InterfaceC1526050poZ(context) { // from class: X.0poY
            public final C1525790po9 LL;

            @Override // X.InterfaceC1526050poZ
            public final C1525790po9 LJJLIL() {
                return this.LL;
            }

            {
                ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config();
                this.LL = new C1525790po9(context);
            }
        });
        this.LJII = new Object() { // from class: X.0ppO
        };
        C786410Ut5.LJJZZIII((Handler) r2.LIZIZ(new Object[0]), new Runnable() { // from class: X.0po7
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SyncSDKImplV4@dd70.<init>$4");
                try {
                    ((InterfaceC1525760po6) C808470VnZ.LIZ(InterfaceC1525760po6.class)).config().getClass();
                    throw null;
                } catch (Throwable th) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                    } finally {
                        if (!zLIZ) {
                        }
                        C1C7U.LIZIZ("SyncSDKImplV4@dd70.<init>$4");
                    }
                    C1C7U.LIZIZ("SyncSDKImplV4@dd70.<init>$4");
                }
            }
        });
    }
}
