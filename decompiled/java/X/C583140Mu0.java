package X;

import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0Mu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583140Mu0 {
    public final Map<String, Object> LIZ = new ConcurrentHashMap();
    public final Map<String, List<C001N>> LIZIZ = new ConcurrentHashMap();
    public final C0NBT LIZJ = new Object() { // from class: X.0NBT
        public final ExecutorService LIZ;
        public final ExecutorService LIZIZ;

        {
            new BPEAHandler(Looper.getMainLooper());
            this.LIZ = C786410Ut5.i4(new ThreadFactoryC638870P4b(2));
            this.LIZIZ = C807400Vlq.LIZ();
        }
    };
    public final List<InterfaceC582400Mso> LIZLLL = new CopyOnWriteArrayList();

    public final void LIZ(Object obj, String str) {
        ((ConcurrentHashMap) this.LIZ).put(str, obj);
        List list = (List) ((ConcurrentHashMap) this.LIZIZ).get(str);
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        if (!it2.hasNext()) {
            return;
        }
        Object next = it2.next();
        C0NBT c0nbt = this.LIZJ;
        next.getClass();
        c0nbt.getClass();
        int[] iArr = C584300Mvs.LIZ;
        throw null;
    }
}
