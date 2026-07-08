package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.017c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2814017c {
    public static final ConcurrentHashMap<String, C2814017c> LIZIZ = new ConcurrentHashMap<>();
    public final ArrayList<Pair<Integer, WeakReference<InterfaceC2815017d>>> LIZ = new ArrayList<>();

    public static final C2814017c LIZ() {
        ConcurrentHashMap<String, C2814017c> concurrentHashMap = LIZIZ;
        if (!concurrentHashMap.containsKey("live_room_ctr")) {
            synchronized (C2814017c.class) {
                try {
                    if (!concurrentHashMap.containsKey("live_room_ctr")) {
                        concurrentHashMap.put("live_room_ctr", new C2814017c());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return concurrentHashMap.get("live_room_ctr");
    }

    public final void LIZIZ(InterfaceC2815017d interfaceC2815017d, int i) {
        InterfaceC2815017d interfaceC2815017d2;
        if (interfaceC2815017d != null) {
            this.LIZ.add(new Pair<>(Integer.valueOf(i), new WeakReference(interfaceC2815017d)));
        }
        int size = this.LIZ.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((Number) ((Pair) ListProtector.get(this.LIZ, i2)).getFirst()).intValue() < i && (interfaceC2815017d2 = (InterfaceC2815017d) ((Reference) ((Pair) ListProtector.get(this.LIZ, i2)).getSecond()).get()) != null) {
                interfaceC2815017d2.kM();
            }
        }
    }
}
