package X;

import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NYB, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.activity.status.sdk.core.ActivityStatusReporter$doReport$2", f = "ActivityStatusReporter.kt", l = {139}, m = "invokeSuspend")
public final class C0NYB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0NYA LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NYB(C0NYA c0nya, String str, String str2, InterfaceC1364105Vn<? super C0NYB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0nya;
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NYB(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ActivityStatusReporter@261e.doReport$2");
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
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            this.LL = 1;
            obj = c0nyf.LIZ(str, str2, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ActivityStatusReporter@261e.doReport$2");
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
        C1C7U.LIZIZ("ActivityStatusReporter@261e.doReport$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
