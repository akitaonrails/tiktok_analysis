package X;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0WY9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.performance.DefaultReceiveMsgPerfTracker$ImReceiveMsgFpsCallbackHandler$reportWhenReady$1", f = "DefaultReceiveMsgPerfTracker.kt", l = {}, m = "invokeSuspend")
public final class C0WY9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0WY8 LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WY9(C0WY8 c0wy8, long j, String str, InterfaceC1364105Vn<? super C0WY9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0wy8;
        this.LLILLJJLI = j;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WY9(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<String> itKeys;
        C0WYA c0wya;
        Integer numLJIIJJI;
        C1C7U.LIZ("DefaultReceiveMsgPerfTracker$ImReceiveMsgFpsCallbackHandler@58eb.reportWhenReady$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0WY8 c0wy8 = this.LL;
        JSONObject jSONObject = c0wy8.LLILZLL;
        c0wy8.getClass();
        if (jSONObject == null || (itKeys = jSONObject.keys()) == null) {
            c0wya = new C0WYA(0, 0, 0);
        } else {
            int i = 0;
            int i2 = 0;
            int iMax = 0;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (numLJIIJJI = C2095008Iq.LJIIJJI(next)) != null) {
                    int iIntValue = numLJIIJJI.intValue();
                    int iOptInt = jSONObject.optInt(next);
                    iMax = Math.max(iMax, iIntValue);
                    if (3 <= iIntValue) {
                        if (iIntValue < 7) {
                            i += iOptInt;
                        } else {
                            i2 += iOptInt;
                        }
                    }
                }
            }
            c0wya = new C0WYA(i, i2, iMax);
        }
        double d = C1BCA.LJIIIIZZ().LIZIZ / 1048576.0d;
        double d2 = (r2.LIZJ + r0) / 1048576.0d;
        double d3 = 0.0d;
        if (d2 > 0.0d) {
            d3 = d / d2;
        }
        C0WY8 c0wy82 = this.LL;
        c0wy82.LLILLL.sendEvent("im_receive_msg_perf", C2097608Jq.LJIIIIZZ(new Pair("fps", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{C2286608xc.LIZJ(c0wy82.LLIZLLLIL)}, 1))), new Pair("drop_3_count", String.valueOf(c0wya.LIZ)), new Pair("drop_7_count", String.valueOf(c0wya.LIZIZ)), new Pair("drop_max", String.valueOf(c0wya.LIZJ)), new Pair("msg_count", String.valueOf(this.LL.LL.LJ)), new Pair("max_ws_queue_size", String.valueOf(this.LL.LL.LJI)), new Pair("max_http_queue_size", String.valueOf(this.LL.LL.LJII)), new Pair("max_message_request_count", String.valueOf(this.LL.LL.LJIIIIZZ)), new Pair("max_in_memory_conversation_count", String.valueOf(this.LL.LL.LJIIIZ)), new Pair("inbox_type", String.valueOf(this.LL.LL.LIZJ)), new Pair("duration", String.valueOf(this.LLILLJJLI)), new Pair("receive_type", this.LL.LL.LIZIZ), new Pair("cpu_usage", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{C2286608xc.LIZJ(C1BCA.LIZLLL().LIZIZ)}, 1))), new Pair("available_memory_ratio", C786410Ut5.j4("%.2f", Arrays.copyOf(new Object[]{C2286608xc.LIZJ(d3)}, 1))), new Pair("available_memory_mb", C786410Ut5.j4("%.0f", Arrays.copyOf(new Object[]{C2286608xc.LIZJ(d)}, 1))), new Pair("source", this.LLILLL)));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DefaultReceiveMsgPerfTracker$ImReceiveMsgFpsCallbackHandler@58eb.reportWhenReady$1");
        return unit;
    }
}
