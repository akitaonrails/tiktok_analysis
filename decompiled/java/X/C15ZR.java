package X;

import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.15ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15ZR {
    public static volatile C15ZR LIZLLL;
    public final C15ZZ LIZ;
    public C15ZQ LIZIZ;
    public long LIZJ;

    public final void LIZIZ() {
        C785860UsC c785860UsC;
        PthreadTimer pthreadTimer;
        C15ZQ c15zq = this.LIZIZ;
        if (c15zq != null && c15zq.LIZIZ.compareAndSet(false, true) && (c785860UsC = c15zq.LJ) != null && c785860UsC.scheduledExecutionTime() == 0 && (pthreadTimer = c15zq.LJFF) != null) {
            pthreadTimer.schedule(c15zq.LJ, 0L, c15zq.LIZ);
        }
        InterfaceC20541015Zg interfaceC20541015Zg = this.LIZ.LIZJ;
        if (interfaceC20541015Zg != null) {
            interfaceC20541015Zg.LIZ("pnsscreensdk_timer_initialize", new JSONObject().put("time_interval", this.LIZJ), null);
        }
        InterfaceC20540815Ze interfaceC20540815Ze = this.LIZ.LIZIZ;
        if (interfaceC20540815Ze != null) {
            interfaceC20540815Ze.LIZ("pnsscreensdk_timer_initialize", C2097908Jt.LIZJ(new Pair("time_interval", String.valueOf(this.LIZJ))));
        }
    }

    public C15ZR(C15ZZ c15zz) {
        this.LIZ = c15zz;
    }

    public final void LIZ(C20540515Zb c20540515Zb) {
        C15ZQ c15zq = this.LIZIZ;
        if (c15zq != null) {
            String str = c20540515Zb.LIZ;
            if (!c15zq.LIZJ.containsKey(str)) {
                c15zq.LIZJ.put(str, c20540515Zb);
            }
        }
        InterfaceC20541015Zg interfaceC20541015Zg = this.LIZ.LIZJ;
        if (interfaceC20541015Zg != null) {
            interfaceC20541015Zg.LIZ("pnsscreensdk_register_timerbox", new JSONObject().put("timerbox_key", c20540515Zb.LIZ), null);
        }
    }
}
