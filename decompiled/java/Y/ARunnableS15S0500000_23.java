package Y;

import X.C013C;
import X.C098200Yq;
import X.C1491510our;
import X.C1491550ouv;
import X.C1491570oux;
import X.C1492180ovw;
import X.C1492200ovy;
import X.C1492220ow0;
import X.C1533050pzr;
import X.C1535480q3m;
import X.C189200o6;
import X.C1C7U;
import X.C259800zU;
import X.C786410Ut5;
import X.EnumC1535440q3i;
import X.InterfaceC1039910dAT;
import X.InterfaceC1491560ouw;
import X.InterfaceC1530550pvp;
import X.InterfaceC1535470q3l;
import android.os.SystemClock;
import android.webkit.WebResourceResponse;
import com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNative;
import com.bytedance.android.monitorV2.spark_tracing.gen.SparkTracingNativeClient;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.librarian.Librarian;
import com.bytedance.netecho.Netecho;
import com.bytedance.netecho.result.IcmpDetectResult;
import com.bytedance.netecho.result.TcpDetectResult;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lancet.LoadSoLancet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import kotlin.Unit;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes24.dex */
public class ARunnableS15S0500000_23 implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        WebResourceResponse webResourceResponseShouldInterceptRequest;
        EnumC1535440q3i enumC1535440q3i = (EnumC1535440q3i) this.l0;
        EnumC1535440q3i enumC1535440q3i2 = EnumC1535440q3i.Offline;
        if ((enumC1535440q3i != enumC1535440q3i2 && enumC1535440q3i != EnumC1535440q3i.Auto) || (webResourceResponseShouldInterceptRequest = ((InterfaceC1039910dAT) this.l1).shouldInterceptRequest(null, new C1535480q3m((InterfaceC1535470q3l) this.l2))) == null) {
            InterfaceC1530550pvp interfaceC1530550pvp = (InterfaceC1530550pvp) this.l4;
            if (interfaceC1530550pvp != null) {
                interfaceC1530550pvp.accept(new Throwable("offline resource not exist."));
                return;
            }
            return;
        }
        C1533050pzr c1533050pzr = new C1533050pzr(webResourceResponseShouldInterceptRequest, enumC1535440q3i2);
        InterfaceC1530550pvp interfaceC1530550pvp2 = (InterfaceC1530550pvp) this.l3;
        if (interfaceC1530550pvp2 != null) {
            interfaceC1530550pvp2.accept(c1533050pzr);
        }
    }

    public static final void run$0(ARunnableS15S0500000_23 aRunnableS15S0500000_23) {
        Unit unit;
        List listLJJLIIIJILLIZJL;
        C1491550ouv c1491550ouv = (C1491550ouv) aRunnableS15S0500000_23.l0;
        C1491510our c1491510our = (C1491510our) aRunnableS15S0500000_23.l1;
        SparkTracingNativeClient sparkTracingNativeClient = (SparkTracingNativeClient) aRunnableS15S0500000_23.l2;
        JSONObject jSONObject = (JSONObject) aRunnableS15S0500000_23.l3;
        InterfaceC1491560ouw interfaceC1491560ouw = (InterfaceC1491560ouw) aRunnableS15S0500000_23.l4;
        C1C7U.LIZ("SparkTracingEngineV2@2bd4.initialize$1L");
        c1491550ouv.getClass();
        LoadSoLancet.LIZJ("bdhm_native");
        long jUptimeMillis = SystemClock.uptimeMillis();
        Librarian.LJFF("bdhm_native");
        LoadSoLancet.LJ(jUptimeMillis, "bdhm_native");
        LoadSoLancet.LIZLLL(jUptimeMillis, "bdhm_native");
        LoadSoLancet.LIZIZ("bdhm_native");
        SparkTracingNative sparkTracingNative = new SparkTracingNative(c1491510our, sparkTracingNativeClient);
        c1491550ouv.LIZIZ = sparkTracingNative;
        if (c1491550ouv.LIZ) {
            try {
                String usedReferences = sparkTracingNative.getUsedReferences();
                if (usedReferences != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(usedReferences, new String[]{","}, 0, 6)) != null) {
                    Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                    while (it2.hasNext()) {
                        c1491550ouv.LIZJ.add((String) it2.next());
                    }
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        long jOptLong = jSONObject.optLong("_exp_start_delay_ms", 0L);
        if (c1491550ouv.LJFF) {
            C1491570oux c1491570oux = C1491570oux.LIZ;
            ARunnableS92S0200000_23 aRunnableS92S0200000_23 = new ARunnableS92S0200000_23(c1491550ouv, interfaceC1491560ouw, 66);
            c1491570oux.getClass();
            BPEAHandler bPEAHandler = C1491570oux.LJII;
            if (bPEAHandler != null) {
                C786410Ut5.LJLIIL(jOptLong, bPEAHandler, aRunnableS92S0200000_23);
            }
        } else if (interfaceC1491560ouw != null) {
            interfaceC1491560ouw.onInit();
        }
        C1C7U.LIZIZ("SparkTracingEngineV2@2bd4.initialize$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$1(ARunnableS15S0500000_23 aRunnableS15S0500000_23) {
        Map.Entry entry = (Map.Entry) aRunnableS15S0500000_23.l0;
        C1492180ovw c1492180ovw = (C1492180ovw) aRunnableS15S0500000_23.l1;
        C259800zU c259800zU = (C259800zU) aRunnableS15S0500000_23.l2;
        C013C c013c = (C013C) aRunnableS15S0500000_23.l3;
        C259800zU c259800zU2 = (C259800zU) aRunnableS15S0500000_23.l4;
        C1C7U.LIZ("ICMPSubTask@92d1.doDetect$1L");
        try {
            IcmpDetectResult icmpDetectResultDetectIcmp = Netecho.INSTANCE.detectIcmp(((C1492220ow0) entry.getValue()).LIZ, c1492180ovw.LIZJ, 3);
            ((Map) c259800zU.element).put(entry.getKey(), icmpDetectResultDetectIcmp);
            if (icmpDetectResultDetectIcmp.getSuccess()) {
                c013c.element = true;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        ((CountDownLatch) c259800zU2.element).countDown();
        C1C7U.LIZIZ("ICMPSubTask@92d1.doDetect$1L");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void run$2(ARunnableS15S0500000_23 aRunnableS15S0500000_23) {
        Map.Entry entry = (Map.Entry) aRunnableS15S0500000_23.l0;
        C1492200ovy c1492200ovy = (C1492200ovy) aRunnableS15S0500000_23.l1;
        C259800zU c259800zU = (C259800zU) aRunnableS15S0500000_23.l2;
        C013C c013c = (C013C) aRunnableS15S0500000_23.l3;
        C259800zU c259800zU2 = (C259800zU) aRunnableS15S0500000_23.l4;
        C1C7U.LIZ("TCPSubTask@b6da.doDetect$1L");
        try {
            TcpDetectResult tcpDetectResultDetectTcp = Netecho.INSTANCE.detectTcp(((C1492220ow0) entry.getValue()).LIZ, ((C1492220ow0) entry.getValue()).LIZIZ, c1492200ovy.LIZJ);
            ((Map) c259800zU.element).put(entry.getKey(), tcpDetectResultDetectTcp);
            if (tcpDetectResultDetectTcp.getSuccess()) {
                c013c.element = true;
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        ((CountDownLatch) c259800zU2.element).countDown();
        C1C7U.LIZIZ("TCPSubTask@b6da.doDetect$1L");
    }

    public static final void run$3(ARunnableS15S0500000_23 aRunnableS15S0500000_23) {
        boolean zLIZ;
        C1C7U.LIZ("SparkHostApiImpl@c8fb.createAdPIAResourceLoader$1$loadAsync$1");
        try {
            aRunnableS15S0500000_23.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SparkHostApiImpl@c8fb.createAdPIAResourceLoader$1$loadAsync$1");
    }

    public ARunnableS15S0500000_23(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
        this.l3 = obj4;
        this.l4 = obj5;
    }
}
