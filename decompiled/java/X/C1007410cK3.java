package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0cK3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.slideslip.SlideSlipIdleReportingComponent$onIdle$1", f = "SlideSlipIdleReportingComponent.kt", l = {81}, m = "invokeSuspend")
public final class C1007410cK3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<InterfaceC1626470sQX> LLILLJJLI;
    public final /* synthetic */ C1626840sR8 LLILLL;
    public final /* synthetic */ Iterable<Integer> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1007410cK3(List<? extends InterfaceC1626470sQX> list, C1626840sR8 c1626840sR8, Iterable<Integer> iterable, InterfaceC1364105Vn<? super C1007410cK3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = c1626840sR8;
        this.LLILZ = iterable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1007410cK3(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1627120sRa interfaceC1627120sRa;
        C1C7U.LIZ("SlideSlipIdleReportingComponent@cdeb.onIdle$1");
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
            List<InterfaceC1626470sQX> list = this.LLILLJJLI;
            Iterable<Integer> iterable = this.LLILZ;
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (InterfaceC1626470sQX interfaceC1626470sQX : list) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    InterfaceC1626470sQX interfaceC1626470sQX2 = interfaceC1626470sQX;
                    if (!C13LP.LJJJJ(C2286608xc.LJ(i2), iterable) || !(interfaceC1626470sQX2 instanceof InterfaceC1627120sRa)) {
                        interfaceC1626470sQX2 = null;
                    }
                    if ((interfaceC1626470sQX2 instanceof InterfaceC1627120sRa) && (interfaceC1627120sRa = (InterfaceC1627120sRa) interfaceC1626470sQX2) != null) {
                        arrayList.add(new C1007420cK4(interfaceC1627120sRa, i2));
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            InterfaceC332260D0u<Collection<C1007420cK4>> interfaceC332260D0uI0 = this.LLILLL.i0();
            this.LL = 1;
            if (interfaceC332260D0uI0.emit(arrayList, this) == objLJFF) {
                C1C7U.LIZIZ("SlideSlipIdleReportingComponent@cdeb.onIdle$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SlideSlipIdleReportingComponent@cdeb.onIdle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
