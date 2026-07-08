package X;

import Y.ARunnableS15S0500000_23;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: X.0ovy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492200ovy implements InterfaceC1492190ovx {
    public final HashMap<String, C1492220ow0> LIZ;
    public final HashMap<String, HashMap<String, Object>> LIZIZ;
    public final long LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.util.concurrent.ConcurrentHashMap] */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.util.concurrent.CountDownLatch] */
    @Override // X.InterfaceC1492190ovx
    public final C1492210ovz LIZ() {
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new CountDownLatch(this.LIZ.size());
        C013C c013c = new C013C();
        C259800zU c259800zU2 = new C259800zU();
        c259800zU2.element = new ConcurrentHashMap();
        Iterator<Map.Entry<String, C1492220ow0>> it2 = this.LIZ.entrySet().iterator();
        while (it2.hasNext()) {
            new BPEAThread(new ARunnableS15S0500000_23(it2.next(), this, c259800zU2, c013c, c259800zU, 2)).start();
        }
        try {
            ((CountDownLatch) c259800zU.element).await(this.LIZJ + ((long) LSPassThroughRecordSizeConfig.DEFAULT), TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        boolean z = c013c.element;
        for (Map.Entry entry : ((Map) c259800zU2.element).entrySet()) {
            HashMap<String, Object> map = this.LIZIZ.get(entry.getKey());
            if (map != null) {
                map.put("tcp_result", entry.getValue());
            }
        }
        return new C1492210ovz(!z, z ? EnumC1492290ow7.NETWORK_GOOD : EnumC1492290ow7.NO_NETWORK);
    }

    public C1492200ovy(HashMap<String, C1492220ow0> map, HashMap<String, HashMap<String, Object>> map2, long j) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = j;
    }
}
