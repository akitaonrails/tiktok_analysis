package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LivePreCreateNextRoomPlayer;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.DnsResolveResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ow1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class RunnableC1492230ow1 implements Runnable {
    public final DetectorParam LL;
    public final C1492280ow6 LLILLJJLI;
    public final ArrayList<InterfaceC1492190ovx> LLILLL;
    public final CopyOnWriteArrayList<Pair<Function2<EnumC1492290ow7, HashMap<String, HashMap<String, Object>>, Unit>, Function1<HashMap<String, Object>, Unit>>> LLILZ;
    public final CopyOnWriteArrayList<Long> LLILZIL;
    public final HashMap<String, HashMap<String, Object>> LLILZLL;
    public final HashMap<String, C1492220ow0> LLIZ;

    /* JADX WARN: Type inference failed for: r0v3, types: [T, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.concurrent.CountDownLatch] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void LIZ() {
        String str;
        DetectorParam detectorParam = this.LL;
        String[] strArr = detectorParam.targetList;
        final long j = detectorParam.dnsTimeout;
        final C259800zU c259800zU = new C259800zU();
        c259800zU.element = new CountDownLatch(strArr.length);
        final C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = new ConcurrentHashMap();
        for (final String str2 : strArr) {
            new BPEAThread(new Runnable() { // from class: X.0802
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i;
                    String str3 = str2;
                    C259800zU c259800zU3 = c259800zU2;
                    long j2 = j;
                    C259800zU c259800zU4 = c259800zU;
                    C1C7U.LIZ("DetectTask@1336.parseTargetList$1L");
                    try {
                        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str3, new String[]{":"}, 0, 6);
                        if (listLJJLIIIJILLIZJL.size() == 2 && 1 <= (i = Integer.parseInt((String) listLJJLIIIJILLIZJL.get(1))) && i <= 65534) {
                            ((Map) c259800zU3.element).put(str3, new Pair(Netecho.INSTANCE.resolveDns((String) listLJJLIIIJILLIZJL.get(0), j2), Integer.valueOf(i)));
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("dns return ");
                            Pair pair = (Pair) ((ConcurrentHashMap) c259800zU3.element).get(str3);
                            sbLIZ.append(pair == null ? null : (DnsResolveResult) pair.getFirst());
                            sbLIZ.append(' ');
                            Pair pair2 = (Pair) ((ConcurrentHashMap) c259800zU3.element).get(str3);
                            sbLIZ.append(pair2 != null ? (Integer) pair2.getSecond() : null);
                            C2188811AlT.LIZIZ(sbLIZ);
                        }
                    } finally {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                    ((CountDownLatch) c259800zU4.element).countDown();
                    C1C7U.LIZIZ("DetectTask@1336.parseTargetList$1L");
                }
            }).start();
        }
        try {
            ((CountDownLatch) c259800zU.element).await(j + ((long) LSPassThroughRecordSizeConfig.DEFAULT), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        for (Map.Entry entry : ((Map) c259800zU2.element).entrySet()) {
            DnsResolveResult dnsResolveResult = (DnsResolveResult) ((Pair) entry.getValue()).getFirst();
            this.LLILZLL.put((String) entry.getKey(), new HashMap<>());
            HashMap<String, Object> map = this.LLILZLL.get(entry.getKey());
            if (map != null) {
                map.put("dns_result", dnsResolveResult);
            }
            if (dnsResolveResult.getSuccess() && dnsResolveResult.getIp() != null) {
                this.LLIZ.put((String) entry.getKey(), new C1492220ow0(((DnsResolveResult) ((Pair) entry.getValue()).getFirst()).getIp(), ((Number) ((Pair) entry.getValue()).getSecond()).intValue()));
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        EnumC1492290ow7 enumC1492290ow7 = EnumC1492290ow7.UNKNOWN_STATUS;
        try {
            long jCurrentTimeMillis2 = -1;
            long jCurrentTimeMillis3 = -1;
            for (InterfaceC1492190ovx interfaceC1492190ovx : this.LLILLL) {
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                C1492210ovz c1492210ovzLIZ = interfaceC1492190ovx.LIZ();
                if (interfaceC1492190ovx instanceof C1492180ovw) {
                    jCurrentTimeMillis3 = System.currentTimeMillis() - jCurrentTimeMillis4;
                } else if (interfaceC1492190ovx instanceof C1492200ovy) {
                    jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis4;
                }
                if (Thread.interrupted()) {
                    return;
                }
                enumC1492290ow7 = c1492210ovzLIZ.LIZIZ;
                if (!c1492210ovzLIZ.LIZ) {
                    break;
                }
            }
            long jCurrentTimeMillis5 = System.currentTimeMillis();
            if (enumC1492290ow7 == EnumC1492290ow7.NETWORK_GOOD) {
                C1492240ow2.LIZ = jCurrentTimeMillis5;
            }
            if (enumC1492290ow7 == EnumC1492290ow7.NO_NETWORK && this.LLIZ.size() == 0) {
                enumC1492290ow7 = EnumC1492290ow7.UNKNOWN_STATUS;
                str = "2";
            } else {
                str = null;
            }
            long j2 = jCurrentTimeMillis5 - jCurrentTimeMillis;
            DetectorParam detectorParam2 = this.LL;
            if (j2 > ((long) detectorParam2.pingTimeout) + ((long) detectorParam2.tcpTimeout) + ((long) LivePreCreateNextRoomPlayer.ENABLE)) {
                enumC1492290ow7 = EnumC1492290ow7.UNKNOWN_STATUS;
                str = "3";
            }
            this.LLILZLL.put("extra_info", C1492270ow5.LIZ(str, this.LLILLJJLI));
            boolean z = false;
            for (Pair<Function2<EnumC1492290ow7, HashMap<String, HashMap<String, Object>>, Unit>, Function1<HashMap<String, Object>, Unit>> pair : this.LLILZ) {
                pair.getFirst().invoke(enumC1492290ow7, this.LLILZLL);
                if (!z) {
                    HashMap<String, Object> map2 = new HashMap<>();
                    map2.put("network_status", String.valueOf(enumC1492290ow7.ordinal()));
                    map2.put("detect_start", Long.valueOf(jCurrentTimeMillis));
                    if (jCurrentTimeMillis2 != -1) {
                        map2.put("tcp_cost", Long.valueOf(jCurrentTimeMillis2));
                    }
                    if (jCurrentTimeMillis3 != -1) {
                        map2.put("ping_cost", Long.valueOf(jCurrentTimeMillis3));
                    }
                    map2.put("total_cost", Long.valueOf(j2));
                    map2.put("network_status_detail", this.LLILZLL);
                    pair.getSecond().invoke(map2);
                    z = true;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("DetectTask@1336.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetectTask@1336.run");
    }

    public RunnableC1492230ow1(DetectorParam detectorParam, C1492280ow6 c1492280ow6) {
        this.LL = detectorParam;
        this.LLILLJJLI = c1492280ow6;
        ArrayList<InterfaceC1492190ovx> arrayList = new ArrayList<>();
        this.LLILLL = arrayList;
        this.LLILZ = new CopyOnWriteArrayList<>();
        this.LLILZIL = new CopyOnWriteArrayList<>();
        HashMap<String, HashMap<String, Object>> map = new HashMap<>();
        this.LLILZLL = map;
        HashMap<String, C1492220ow0> map2 = new HashMap<>();
        this.LLIZ = map2;
        arrayList.add(new C1492180ovw(map2, map, detectorParam.pingTimeout));
        arrayList.add(new C1492200ovy(map2, map, detectorParam.tcpTimeout));
    }
}
