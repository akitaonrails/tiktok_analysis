package X;

import com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ThF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodel.SinglePropsViewModel$fetchProps$2$onFail$1", f = "SinglePropsViewModel.kt", l = {48}, m = "invokeSuspend")
public final class C753590ThF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SinglePropsViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C753590ThF(SinglePropsViewModel singlePropsViewModel, InterfaceC1364105Vn<? super C753590ThF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singlePropsViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C753590ThF(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SinglePropsViewModel@2f4.fetchProps$2$onFail$1");
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
            C753620ThI c753620ThI = new C753620ThI();
            this.LL = 1;
            c2252321DDq.setValue(c753620ThI);
            if (Unit.LIZ == objLJFF) {
                C1C7U.LIZIZ("SinglePropsViewModel@2f4.fetchProps$2$onFail$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SinglePropsViewModel@2f4.fetchProps$2$onFail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
