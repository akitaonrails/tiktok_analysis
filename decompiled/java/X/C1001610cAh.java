package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0cAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.ies.ugc.aweme.commercialize.search.arch.v2.detail.SearchAdDetailModule$resumePlayInDetail$1", f = "SearchAdDetailModule.kt", l = {273}, m = "invokeSuspend")
public final class C1001610cAh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1001610cAh(InterfaceC1364105Vn<? super C1001610cAh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1001610cAh(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchAdDetailModule@2dda.resumePlayInDetail$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(600L, this) == objLJFF) {
                C1C7U.LIZIZ("SearchAdDetailModule@2dda.resumePlayInDetail$1");
                return objLJFF;
            }
        }
        InterfaceC1008930cMV interfaceC1008930cMVLJ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZIZ().LJ();
        if (interfaceC1008930cMVLJ != null) {
            interfaceC1008930cMVLJ.LJJII(C995850c1P.LIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SearchAdDetailModule@2dda.resumePlayInDetail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1001610cAh(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
