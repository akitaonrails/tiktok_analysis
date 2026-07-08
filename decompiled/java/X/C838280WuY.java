package X;

import android.os.Handler;
import android.os.Message;
import ci3.a;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: X.0WuY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838280WuY {
    public static final Set<InterfaceC838350Wuf> LIZ = new LinkedHashSet();
    public static final Map<String, Set<InterfaceC838350Wuf>> LIZIZ = new LinkedHashMap();
    public static final HandlerThreadC838290WuZ LIZJ;
    public static Handler LIZLLL;
    public static final ConcurrentLinkedQueue<C838310Wub> LJ;

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0WuZ, java.lang.Thread] */
    static {
        ?? r1 = new a() { // from class: X.0WuZ
            @Override // android.os.HandlerThread
            public final void onLooperPrepared() {
                boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                try {
                    bpea_origin_onLooperPrepared();
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (zLJ) {
                        C0W9U.LJFF();
                    }
                    throw th;
                }
            }

            public final void bpea_origin_onLooperPrepared() {
                super.onLooperPrepared();
                Set<InterfaceC838350Wuf> set = C838280WuY.LIZ;
                C838280WuY.LIZLLL = new Handler(C838280WuY.LIZJ.getLooper(), new Handler.Callback() { // from class: X.0Wua
                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        C1C7U.LIZ("EventCenter$EventHandlerThread@151.bpea_origin_onLooperPrepared$1L");
                        try {
                            if (message.what == 1 && (HandlerHook.getMessageObj(message.obj) instanceof C838310Wub)) {
                                C838310Wub c838310Wub = (C838310Wub) HandlerHook.getMessageObj(message.obj);
                                C838310Wub c838310WubLIZ = c838310Wub.LIZ();
                                c838310Wub.LIZIZ();
                                Iterator<InterfaceC838350Wuf> it2 = C838280WuY.LIZ.iterator();
                                while (it2.hasNext()) {
                                    try {
                                        it2.next().onEvent(c838310WubLIZ);
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                    }
                                }
                                Set set2 = (Set) ((LinkedHashMap) C838280WuY.LIZIZ).get(c838310WubLIZ.LIZIZ);
                                if (set2 != null) {
                                    Iterator it3 = set2.iterator();
                                    while (it3.hasNext()) {
                                        ((InterfaceC838350Wuf) it3.next()).onEvent(c838310WubLIZ);
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                        }
                        return true;
                    }
                });
                try {
                    if (C838280WuY.LIZLLL != null) {
                        Iterator<C838310Wub> it2 = C838280WuY.LJ.iterator();
                        while (it2.hasNext()) {
                            C838280WuY.LIZ(it2.next());
                        }
                    }
                    C838280WuY.LJ.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        };
        LIZJ = r1;
        LJ = new ConcurrentLinkedQueue<>();
        r1.start();
    }

    public static void LIZ(C838310Wub c838310Wub) {
        Handler handler = LIZLLL;
        if (handler == null) {
            ConcurrentLinkedQueue<C838310Wub> concurrentLinkedQueue = LJ;
            if (concurrentLinkedQueue.size() >= 1024) {
                return;
            }
            concurrentLinkedQueue.add(c838310Wub);
            return;
        }
        C786410Ut5.LJLJJL(handler, handler.obtainMessage(1, c838310Wub));
    }
}
