package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uUQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.applog.priority.original.Worker$run$4", f = "Worker.kt", l = {}, m = "invokeSuspend")
public final class C1705760uUQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C09AE>, Object> {
    public final /* synthetic */ RunnableC2191761AqE LL;
    public final /* synthetic */ List<InterfaceC2191781AqG> LLILLJJLI;
    public final /* synthetic */ C2190751Aob<JSONObject> LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705760uUQ(long j, C2190751Aob c2190751Aob, RunnableC2191761AqE runnableC2191761AqE, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = runnableC2191761AqE;
        this.LLILLJJLI = list;
        this.LLILLL = c2190751Aob;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        RunnableC2191761AqE runnableC2191761AqE = this.LL;
        List<InterfaceC2191781AqG> list = this.LLILLJJLI;
        return new C1705760uUQ(this.LLILZ, this.LLILLL, runnableC2191761AqE, list, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Worker@ead6.run$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL.LLIZ.getValue();
        List<InterfaceC2191781AqG> list = this.LLILLJJLI;
        RunnableC2191761AqE runnableC2191761AqE = this.LL;
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1705750uUP(this.LLILZ, this.LLILLL, runnableC2191761AqE, list, null), 3);
        C1C7U.LIZIZ("Worker@ead6.run$4");
        return anonymousClass0956LIZLLL;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C09AE> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
