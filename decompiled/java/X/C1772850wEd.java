package X;

import Y.AgS306S0100000_26;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.logicslice.common.ECMMKScrollLogicSlice$reportFirstScreenSticky$1", f = "ECMMKScrollLogicSlice.kt", l = {286}, m = "invokeSuspend")
public final class C1772850wEd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1773150wF7 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772850wEd(C1773150wF7 c1773150wF7, InterfaceC1364105Vn<? super C1772850wEd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1773150wF7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1772850wEd(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECMMKScrollLogicSlice@defd.reportFirstScreenSticky$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C05YD<AbstractC1772290wDj> c05ydLJJIJ = this.LLILLJJLI.LIZIZ().LJIILIIL().LJJIJ();
            AgS306S0100000_26 agS306S0100000_26 = new AgS306S0100000_26(this.LLILLJJLI, 7);
            this.LL = 1;
            if (c05ydLJJIJ.collect(agS306S0100000_26, this) == objLJFF) {
                C1C7U.LIZIZ("ECMMKScrollLogicSlice@defd.reportFirstScreenSticky$1");
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
