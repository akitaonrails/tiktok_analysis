package X;

import android.os.HandlerThread;
import android.util.LruCache;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import kotlin.jvm.internal.AwS102S1000000_18;

/* JADX INFO: renamed from: X.0gNG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163160gNG {
    public final String LIZ;
    public final LruCache<String, C1163170gNH> LIZIZ;
    public final BPEAHandler LIZJ;

    public C1163160gNG() {
        throw null;
    }

    public final long LIZLLL() {
        long jLIZJ = LIZJ("ssm_pre_layout_end", "ssm_pre_layout_start");
        long jLIZJ2 = LIZJ("ssm_first_screen_end", "ssm_first_on_screen_start");
        if (jLIZJ < 0 || jLIZJ2 < 0) {
            return -1L;
        }
        return jLIZJ + jLIZJ2;
    }

    public C1163160gNG(String str) {
        LruCache<String, C1163170gNH> lruCache = new LruCache<>(256);
        this.LIZ = str;
        this.LIZIZ = lruCache;
        HandlerThread handlerThread = new HandlerThread("RAVEN_TRACING");
        handlerThread.start();
        this.LIZJ = new BPEAHandler(C786410Ut5.W2(handlerThread));
    }

    public final void LIZIZ(String str) {
        if (this.LIZIZ.get(str) != null) {
            return;
        }
        this.LIZIZ.put(str, new C1163170gNH(Long.valueOf(System.currentTimeMillis())));
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenTracing", new AwS102S1000000_18(str, 23));
    }

    public final void LIZ(long j, String str) {
        if (this.LIZIZ.get(str) != null) {
            return;
        }
        this.LIZIZ.put(str, new C1163170gNH(Long.valueOf(j)));
        new C1043010dFT();
        C1043010dFT.LIZIZ("RavenTracing", new C006W(str, j));
    }

    public final long LIZJ(String str, String str2) {
        Object obj;
        Long l;
        long jLongValue;
        long jLongValue2;
        Long l2;
        C1163170gNH c1163170gNH = this.LIZIZ.get(str);
        Object obj2 = null;
        if (c1163170gNH != null) {
            obj = c1163170gNH.LIZ;
        } else {
            obj = null;
        }
        if (obj instanceof Long) {
            l = (Long) obj;
        } else {
            l = null;
        }
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C1163170gNH c1163170gNH2 = this.LIZIZ.get(str2);
        if (c1163170gNH2 != null) {
            obj2 = c1163170gNH2.LIZ;
        }
        if ((obj2 instanceof Long) && (l2 = (Long) obj2) != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        if (jLongValue > 0 && jLongValue2 > 0) {
            return jLongValue - jLongValue2;
        }
        return -1L;
    }
}
