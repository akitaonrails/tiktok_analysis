package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0uUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.applog.priority.original.Worker$run$4$1", f = "Worker.kt", l = {183}, m = "invokeSuspend")
public final class C1705750uUP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<InterfaceC2191781AqG> LLILLL;
    public final /* synthetic */ RunnableC2191761AqE LLILZ;
    public final /* synthetic */ C2190751Aob<JSONObject> LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705750uUP(long j, C2190751Aob c2190751Aob, RunnableC2191761AqE runnableC2191761AqE, List list, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = runnableC2191761AqE;
        this.LLILZIL = c2190751Aob;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        List<InterfaceC2191781AqG> list = this.LLILLL;
        RunnableC2191761AqE runnableC2191761AqE = this.LLILZ;
        C1705750uUP c1705750uUP = new C1705750uUP(this.LLILZLL, this.LLILZIL, runnableC2191761AqE, list, interfaceC1364105Vn);
        c1705750uUP.LLILLJJLI = obj;
        return c1705750uUP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Worker@ead6.run$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            List<InterfaceC2191781AqG> list = this.LLILLL;
            RunnableC2191761AqE runnableC2191761AqE = this.LLILZ;
            C2190751Aob<JSONObject> c2190751Aob = this.LLILZIL;
            long j = this.LLILZLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<InterfaceC2191781AqG> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(C23250099c.LIZIZ(interfaceC497601wk, null, null, new C1705770uUR(runnableC2191761AqE, it2.next(), c2190751Aob, j, null), 3));
                i2 = 1;
            }
            this.LL = i2;
            if (C1D9F.LIZ(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("Worker@ead6.run$4$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Worker@ead6.run$4$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
