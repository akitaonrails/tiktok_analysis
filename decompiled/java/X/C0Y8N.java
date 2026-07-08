package X;

import android.os.SystemClock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Y8N, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.receivebuffer.WsMsgBurstGate$scheduleBurstTrackingStop$1", f = "WsMsgBurstGate.kt", l = {134}, m = "invokeSuspend")
public final class C0Y8N extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0Y8O LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Y8N(C0Y8O c0y8o, InterfaceC1364105Vn<? super C0Y8N> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y8o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Y8N(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WsMsgBurstGate@b5d6.scheduleBurstTrackingStop$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            long j = this.LLILLJJLI.LJ.wsBurstTimeoutMs;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("WsMsgBurstGate@b5d6.scheduleBurstTrackingStop$1");
                return objLJFF;
            }
        }
        C0Y8O c0y8o = this.LLILLJJLI;
        if (c0y8o.LJIIJ) {
            C868780Y6i.LJ(c0y8o.LIZ.LIZLLL(), "WsMsgBurstGate", "Burst tracking timeout reached, stop tracking", 4);
            C0Y8O c0y8o2 = this.LLILLJJLI;
            c0y8o2.LJIIJ = false;
            c0y8o2.LJIIIZ.clear();
            this.LLILLJJLI.LIZ.LJIIZILJ().LIZIZ().LIZJ().LJJLIIIJJIZ(this.LLILLJJLI.LIZIZ, SystemClock.uptimeMillis());
            C0Y8O c0y8o3 = this.LLILLJJLI;
            int i2 = c0y8o3.LIZIZ;
            int i3 = c0y8o3.LJIIJJI;
            int i4 = c0y8o3.LJIIL;
            int i5 = c0y8o3.LJIILIIL;
            int i6 = c0y8o3.LJIILJJIL;
            int i7 = c0y8o3.LJIILL;
            if (c0y8o3.LIZ.LJIIZILJ().LJFF().getEventTracker().LIZJ(c0y8o3.LJ.simpleBurstTrackingSampleRate)) {
                C0YJ9 c0yj9 = new C0YJ9(c0y8o3.LIZ);
                c0yj9.LIZJ(c0y8o3.LJ.burstTrackingEventName);
                c0yj9.LIZ(Integer.valueOf(i2), "inbox_type");
                c0yj9.LIZ(Integer.valueOf(i3), "msg_count");
                c0yj9.LIZ(Integer.valueOf(i4), "max_ws_queue_size");
                c0yj9.LIZ(Integer.valueOf(i5), "max_http_queue_size");
                c0yj9.LIZ(Integer.valueOf(i6), "max_message_request_count");
                c0yj9.LIZ(Integer.valueOf(i7), "max_in_memory_conversation_count");
                c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - c0y8o3.LJIIIIZZ), "duration");
                c0yj9.LIZ("ws_burst", "source");
                c0yj9.LIZLLL();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WsMsgBurstGate@b5d6.scheduleBurstTrackingStop$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
