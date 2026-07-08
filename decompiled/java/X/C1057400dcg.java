package X;

import Y.AgS297S0100000_16;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0dcg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel$subscribeContactState$1", f = "MultiViewModel.kt", l = {543}, m = "invokeSuspend")
public final class C1057400dcg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MultiViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1057400dcg(MultiViewModel multiViewModel, InterfaceC1364105Vn<? super C1057400dcg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = multiViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1057400dcg(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MultiViewModel@a25.subscribeContactState$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C01S9<C1071570dzX> c01s9LJI = C1071540dzU.LIZIZ.LJI(EnumC1070340dxY.CONTACT);
            AgS297S0100000_16 agS297S0100000_16 = new AgS297S0100000_16(this.LLILLJJLI, 23);
            this.LL = 1;
            if (c01s9LJI.collect(agS297S0100000_16, this) == objLJFF) {
                C1C7U.LIZIZ("MultiViewModel@a25.subscribeContactState$1");
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
