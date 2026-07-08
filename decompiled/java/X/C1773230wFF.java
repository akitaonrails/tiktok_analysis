package X;

import Y.AgS306S0100000_26;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wFF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.container.ECMMKContainerController$6", f = "ECMMKContainerController.kt", l = {232}, m = "invokeSuspend")
public final class C1773230wFF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ECMMKContainerController LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773230wFF(ECMMKContainerController eCMMKContainerController, InterfaceC1364105Vn<? super C1773230wFF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = eCMMKContainerController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1773230wFF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKContainerController@62a3.<init>$6");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            ECMMKContainerController eCMMKContainerController = this.LLILLJJLI;
            C2252321DDq c2252321DDq = eCMMKContainerController.LLJJJJJIL.LLJJIJI;
            AgS306S0100000_26 agS306S0100000_26 = new AgS306S0100000_26(eCMMKContainerController, 4);
            this.LL = 1;
            if (c2252321DDq.collect(agS306S0100000_26, this) == objLJFF) {
                C1C7U.LIZIZ("ECMMKContainerController@62a3.<init>$6");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
