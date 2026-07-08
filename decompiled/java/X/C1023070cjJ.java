package X;

import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.0cjJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1023070cjJ {
    public final String LIZ;
    public final AbstractC1023200cjW LIZIZ;
    public final ConcurrentHashMap<String, Object> LIZJ;
    public final ConcurrentHashMap<String, Function1<AbstractC1023200cjW, Object>> LIZLLL;
    public long LJ;

    public final InterfaceC1023190cjV LIZ() {
        WeakReference<InterfaceC1023190cjV> weakReference;
        C582760MtO c582760MtO;
        AbstractC1023200cjW abstractC1023200cjW = this.LIZIZ;
        if (abstractC1023200cjW instanceof C582760MtO) {
            return ((C582760MtO) abstractC1023200cjW).LIZLLL();
        }
        if (!(abstractC1023200cjW instanceof C1023160cjS)) {
            if (!(abstractC1023200cjW instanceof C1010960cPm) || (weakReference = ((C1010960cPm) abstractC1023200cjW).LJII.get(this.LIZ)) == null) {
                return null;
            }
            return weakReference.get();
        }
        abstractC1023200cjW.getClass();
        AbstractC1023200cjW abstractC1023200cjWLJ = C1023060cjI.LJ(C623440Oco.LIZIZ);
        if (!(abstractC1023200cjWLJ instanceof C582760MtO) || (c582760MtO = (C582760MtO) abstractC1023200cjWLJ) == null) {
            return null;
        }
        return c582760MtO.LIZLLL();
    }

    public C1023070cjJ(String str, AbstractC1023200cjW abstractC1023200cjW) {
        this.LIZ = str;
        this.LIZIZ = abstractC1023200cjW;
        abstractC1023200cjW.LIZ();
        this.LIZJ = new ConcurrentHashMap<>();
        ConcurrentHashMap<String, Function1<AbstractC1023200cjW, Object>> concurrentHashMap = new ConcurrentHashMap<>();
        this.LIZLLL = concurrentHashMap;
        this.LJ = SystemClock.elapsedRealtime();
        concurrentHashMap.put("video_length", new AwS595S0100000_16(this, 379));
        concurrentHashMap.put("duration", new AwS595S0100000_16(this, 380));
        concurrentHashMap.put("play_order", new AwS595S0100000_16(this, 381));
    }
}
