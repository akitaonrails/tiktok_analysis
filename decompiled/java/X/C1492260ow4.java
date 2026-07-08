package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.netecho.NetechoConfig;
import com.ss.android.ugc.network.observer.bean.DetectorParam;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0ow4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492260ow4 {
    public static final ConcurrentHashMap<Long, C1436780nUa> LIZ = new ConcurrentHashMap<>();
    public static volatile AtomicLong LIZIZ = new AtomicLong(10);

    static {
        NetechoConfig.INSTANCE.setLoadLibrary(C1492310ow9.LL);
    }

    public static void LIZIZ(long j) {
        BPEAThread bPEAThread;
        ConcurrentHashMap<Long, C1436780nUa> concurrentHashMap = LIZ;
        C1436780nUa c1436780nUa = concurrentHashMap.get(Long.valueOf(j));
        if (c1436780nUa != null) {
            c1436780nUa.LIZ();
            concurrentHashMap.remove(Long.valueOf(j));
        }
        RunnableC1492230ow1 runnableC1492230ow1 = C1492240ow2.LJFF;
        if (runnableC1492230ow1 != null && runnableC1492230ow1.LLILZIL.contains(Long.valueOf(j)) && (bPEAThread = C1492240ow2.LJ) != null) {
            bPEAThread.interrupt();
        }
    }

    public static long LIZ(DetectorParam detectorParam, C1492280ow6 c1492280ow6, Function2 function2, Function1 function1) {
        long jIncrementAndGet = LIZIZ.incrementAndGet();
        ConcurrentHashMap<Long, C1436780nUa> concurrentHashMap = LIZ;
        Long lValueOf = Long.valueOf(jIncrementAndGet);
        C1436780nUa c1436780nUa = new C1436780nUa();
        C11NZ.LJLJJLL(detectorParam.startTimeout, TimeUnit.MILLISECONDS).LIZIZ(new C1436920nUo(c1436780nUa, new C1492250ow3(jIncrementAndGet, detectorParam, c1492280ow6, function2, function1)));
        concurrentHashMap.put(lValueOf, c1436780nUa);
        return jIncrementAndGet;
    }
}
