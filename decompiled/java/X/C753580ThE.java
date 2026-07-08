package X;

import com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ThE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel$fetchProps$2$onSuccess$1", f = "SinglePropsViewModel.kt", l = {42}, m = "invokeSuspend")
public final class C753580ThE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SinglePropsViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC753640ThK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753580ThE(SinglePropsViewModel singlePropsViewModel, AbstractC753640ThK abstractC753640ThK, InterfaceC1364105Vn<? super C753580ThE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singlePropsViewModel;
        this.LLILLL = abstractC753640ThK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753580ThE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SinglePropsViewModel@2f4.fetchProps$2$onSuccess$1");
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
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLILLJJLI;
            AbstractC753640ThK abstractC753640ThK = this.LLILLL;
            this.LL = 1;
            c2252321DDq.setValue(abstractC753640ThK);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("SinglePropsViewModel@2f4.fetchProps$2$onSuccess$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SinglePropsViewModel@2f4.fetchProps$2$onSuccess$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
