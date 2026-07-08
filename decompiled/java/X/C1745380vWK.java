package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.edit.AddressEditViewModel;
import eha.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vWK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.address.edit.helper.RegionSearchInputHelper$onBind$3$5$4$2", f = "RegionSearchInputHelper.kt", l = {271}, m = "invokeSuspend")
public final class C1745380vWK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ c LLILLJJLI;
    public final /* synthetic */ C1745680vWo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1745380vWK(c cVar, C1745680vWo c1745680vWo, InterfaceC1364105Vn<? super C1745380vWK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = cVar;
        this.LLILLL = c1745680vWo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1745380vWK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RegionSearchInputHelper@c1cf.onBind$3$5$4$2");
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
            AddressEditViewModel addressEditViewModel = this.LLILLJJLI.LLILLL;
            C1745680vWo c1745680vWo = this.LLILLL;
            this.LL = 1;
            obj = addressEditViewModel.yS2(c1745680vWo, null, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("RegionSearchInputHelper@c1cf.onBind$3$5$4$2");
                return objLJFF;
            }
        }
        c cVar = this.LLILLJJLI;
        cVar.LLILLL.KR2(cVar.LL, this.LLILLL, (C1745340vWG) obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RegionSearchInputHelper@c1cf.onBind$3$5$4$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
