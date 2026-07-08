package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NYC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusReporter$doReport$1", f = "ActivityStatusReporter.kt", l = {124}, m = "invokeSuspend")
public final class C0NYC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NYA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NYC(C0NYA c0nya, InterfaceC1364105Vn<? super C0NYC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nya;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NYC(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusReporter@261e.doReport$1");
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
            C0NYF c0nyf = (C0NYF) this.LLILLJJLI.LJII.getValue();
            this.LL = 1;
            obj = c0nyf.LIZ(null, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusReporter@261e.doReport$1");
                return objLJFF;
            }
        }
        List<C595220NWe> list = ((C0NYG) obj).LIZ;
        if (list != null && C595320NWo.LIZ(this.LLILLJJLI.LIZIZ).LJIIJJI) {
            C0NYA c0nya = this.LLILLJJLI;
            Iterator<C595220NWe> it2 = list.iterator();
            while (it2.hasNext()) {
                c0nya.LIZJ.offer(it2.next());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ActivityStatusReporter@261e.doReport$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
