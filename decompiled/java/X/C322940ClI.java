package X;

import com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ClI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.relation.usercard.vm.RecUserVideoListSharedVM$manualListLoadMore$1", f = "RecUserVideoListSharedVM.kt", l = {270}, m = "invokeSuspend")
public final class C322940ClI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ RecUserVideoListSharedVM LLILLJJLI;
    public final /* synthetic */ C323370Clz LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C322940ClI(RecUserVideoListSharedVM recUserVideoListSharedVM, C323370Clz c323370Clz, InterfaceC1364105Vn<? super C322940ClI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = recUserVideoListSharedVM;
        this.LLILLL = c323370Clz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C322940ClI(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecUserVideoListSharedVM@944f.manualListLoadMore$1");
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
            RecUserVideoListSharedVM recUserVideoListSharedVM = this.LLILLJJLI;
            C323370Clz c323370Clz = this.LLILLL;
            this.LL = 1;
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            AbstractC329610Cw3<C323370Clz> config = recUserVideoListSharedVM.getConfig();
            if (c323370Clz == null) {
                c323370Clz = recUserVideoListSharedVM.LLJ;
            }
            config.onLoadMore(c2252611DEt, c323370Clz);
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(this);
            }
            if (objLJIJ == objLJFF) {
                C1C7U.LIZIZ("RecUserVideoListSharedVM@944f.manualListLoadMore$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecUserVideoListSharedVM@944f.manualListLoadMore$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
