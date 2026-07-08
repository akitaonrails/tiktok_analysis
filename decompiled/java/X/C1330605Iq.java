package X;

import Y.AgS284S0100000_3;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Iq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseAiContentFragment$observeDataChange$2", f = "ChooseAiContentFragment.kt", l = {853}, m = "invokeSuspend")
public final class C1330605Iq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C528760KoU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1330605Iq(C528760KoU c528760KoU, InterfaceC1364105Vn<? super C1330605Iq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c528760KoU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1330605Iq(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChooseAiContentFragment@d5f4.observeDataChange$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.LLZLI().LLILZLL;
            AgS284S0100000_3 agS284S0100000_3 = new AgS284S0100000_3(this.LLILLJJLI, 8);
            this.LL = 1;
            if (c2252321DDq.collect(agS284S0100000_3, this) == objLJFF) {
                C1C7U.LIZIZ("ChooseAiContentFragment@d5f4.observeDataChange$2");
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
