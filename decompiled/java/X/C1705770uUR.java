package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uUR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.applog.priority.original.Worker$run$4$1$1$1", f = "Worker.kt", l = {181}, m = "invokeSuspend")
public final class C1705770uUR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RunnableC2191761AqE LLILLJJLI;
    public final /* synthetic */ InterfaceC2191781AqG LLILLL;
    public final /* synthetic */ C2190751Aob<JSONObject> LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705770uUR(RunnableC2191761AqE runnableC2191761AqE, InterfaceC2191781AqG interfaceC2191781AqG, C2190751Aob<JSONObject> c2190751Aob, long j, InterfaceC1364105Vn<? super C1705770uUR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = runnableC2191761AqE;
        this.LLILLL = interfaceC2191781AqG;
        this.LLILZ = c2190751Aob;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705770uUR(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Worker@ead6.run$4$1$1$1");
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
            RunnableC2191761AqE runnableC2191761AqE = this.LLILLJJLI;
            InterfaceC2191781AqG interfaceC2191781AqG = this.LLILLL;
            C2190751Aob<JSONObject> c2190751Aob = this.LLILZ;
            long j = this.LLILZIL;
            this.LL = 1;
            runnableC2191761AqE.getClass();
            Object objLIZ = interfaceC2191781AqG.LIZ(c2190751Aob, j, this);
            if (objLIZ != C099R.LJFF()) {
                objLIZ = Unit.LIZ;
            }
            if (objLIZ == objLJFF) {
                C1C7U.LIZIZ("Worker@ead6.run$4$1$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Worker@ead6.run$4$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
