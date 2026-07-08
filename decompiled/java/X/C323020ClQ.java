package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ClQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.innerfeed.SeaPdpCreatorInnerListVM$manualListLoadMore$1", f = "SeaPdpCreatorInnerListVM.kt", l = {442}, m = "invokeSuspend")
public final class C323020ClQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SeaPdpCreatorInnerListVM LLILLJJLI;
    public final /* synthetic */ C323030ClR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C323020ClQ(SeaPdpCreatorInnerListVM seaPdpCreatorInnerListVM, C323030ClR c323030ClR, InterfaceC1364105Vn<? super C323020ClQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = seaPdpCreatorInnerListVM;
        this.LLILLL = c323030ClR;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323020ClQ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCreatorInnerListVM@3055.manualListLoadMore$1");
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
            SeaPdpCreatorInnerListVM seaPdpCreatorInnerListVM = this.LLILLJJLI;
            C323030ClR c323030ClR = this.LLILLL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            AbstractC329610Cw3<C323030ClR> config = seaPdpCreatorInnerListVM.getConfig();
            if (c323030ClR == null) {
                c323030ClR = new C323030ClR(seaPdpCreatorInnerListVM.LLJILJIL);
            }
            config.onLoadMore(c2252611DEt, c323030ClR);
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("SeaPdpCreatorInnerListVM@3055.manualListLoadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCreatorInnerListVM@3055.manualListLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
