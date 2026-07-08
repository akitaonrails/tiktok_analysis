package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.Charsets;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0NbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C597060NbM {
    public static final C0XN1 LIZ = new InterfaceC486470J5x() { // from class: X.0XN1
        @Override // X.InterfaceC486470J5x
        public final void LIZIZ(WsChannelMsg wsChannelMsg) {
            String str = new String(wsChannelMsg.LIZ(), Charsets.UTF_8);
            C0XPY.LIZ.getClass();
            C0XO0 c0xo0LIZLLL = C0XO0.LIZLLL(C0XPY.LIZ());
            c0xo0LIZLLL.getClass();
            if (C847630XMz.LIZLLL == null) {
                synchronized (C847630XMz.class) {
                    try {
                        if (C847630XMz.LIZLLL == null) {
                            C847630XMz.LIZLLL = new C847630XMz(c0xo0LIZLLL);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            C847630XMz.LIZLLL.LIZIZ(str);
        }
    };
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);

    public static void LIZ() {
        AtomicBoolean atomicBoolean = LIZIZ;
        if (atomicBoolean.get()) {
            return;
        }
        synchronized (atomicBoolean) {
            try {
                if (!atomicBoolean.get()) {
                    EventBus eventBusLIZLLL = EventBus.LIZLLL();
                    C0XN1 c0xn1 = LIZ;
                    if (!eventBusLIZLLL.LJIIJ(c0xn1)) {
                        atomicBoolean.set(true);
                        C2203431BLp.LIZIZ.LJI(3001, -10000, c0xn1);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
