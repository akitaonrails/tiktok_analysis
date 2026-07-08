package X;

import android.os.Handler;
import android.os.Message;
import ci3.a;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18JM, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18JM implements InterfaceC21315218bG {
    public static Handler LIZIZ;
    public static final C18JM LIZ = new C18JM();
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final C18JH LIZLLL = new a() { // from class: X.18JH
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
            try {
                super.onLooperPrepared();
                C18JM c18jm = C18JM.LIZ;
                C18JM.LIZIZ = new Handler(C18JM.LIZLLL.getLooper(), new Handler.Callback() { // from class: X.18JL
                    @Override // android.os.Handler.Callback
                    public final boolean handleMessage(Message message) {
                        try {
                            if (message.what == 1 && (HandlerHook.getMessageObj(message.obj) instanceof C18JN)) {
                                C21312818as.LIZIZ.getValue().LIZIZ((C18JN) HandlerHook.getMessageObj(message.obj));
                                return true;
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C21312918at.LIZ(EnumC1205980hUK.POI_REALTIME_FEATURE, "dispatch_event_error", C2097608Jq.LJ(), e);
                        }
                        return true;
                    }
                });
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
    };
    public static final ConcurrentLinkedQueue<C18JN> LJ = new ConcurrentLinkedQueue<>();

    @Override // X.InterfaceC21315218bG
    public final void onEvent(String str, JSONObject jSONObject) {
        try {
            if (C286720BLq.LIZ() && str != null && jSONObject != null) {
                C18K1.Companion.getClass();
                C18K1 c18k1 = C18K1.findMap.get(str);
                if (c18k1 == null) {
                    return;
                }
                C18JN c18jn = new C18JN(c18k1, jSONObject);
                Handler handler = LIZIZ;
                if (handler == null) {
                    AtomicBoolean atomicBoolean = LIZJ;
                    if (!atomicBoolean.get() && atomicBoolean.compareAndSet(false, true)) {
                        LIZLLL.start();
                    }
                    ConcurrentLinkedQueue<C18JN> concurrentLinkedQueue = LJ;
                    if (concurrentLinkedQueue.size() < 1024) {
                        concurrentLinkedQueue.add(c18jn);
                        return;
                    }
                    return;
                }
                C786410Ut5.LJLJJL(handler, handler.obtainMessage(1, c18jn));
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C21312918at.LIZ(EnumC1205980hUK.POI_REALTIME_FEATURE, "parse_event_error", C2097608Jq.LJ(), e);
        }
    }
}
