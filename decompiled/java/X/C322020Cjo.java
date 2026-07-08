package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tako.ccl.net.TemplateTabsResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cjo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.image.create.TakoImageCreateHelper$prefetchTemplateTabsInOpenImageCreate$1", f = "TakoImageCreateHelper.kt", l = {109}, m = "invokeSuspend")
public final class C322020Cjo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C322020Cjo(InterfaceC1364105Vn<? super C322020Cjo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322020Cjo(interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoImageCreateHelper@64b7.prefetchTemplateTabsInOpenImageCreate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1863980ybc c1863980ybc = C1863980ybc.LIZ;
                this.LL = 1;
                obj = c1863980ybc.LJIILIIL(0, null, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TakoImageCreateHelper@64b7.prefetchTemplateTabsInOpenImageCreate$1");
                    return objLJFF;
                }
            }
            TemplateTabsResponse templateTabsResponse = (TemplateTabsResponse) obj;
            if (templateTabsResponse != null) {
                C1860520yW2.LIZ.getClass();
                C1860520yW2.LJJIJLIJ(templateTabsResponse);
                C1860520yW2.LJJIL(System.currentTimeMillis());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoImageCreateHelper@64b7.prefetchTemplateTabsInOpenImageCreate$1");
        return unit;
    }
}
