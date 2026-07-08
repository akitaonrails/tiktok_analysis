package X;

import com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xr3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.page.ui.CreatorRankingPageDialogFragment$onViewCreated$5$1$2", f = "CreatorRankingPageDialogFragment.kt", l = {331}, m = "invokeSuspend")
public final class C861590Xr3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CreatorRankingPageDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861590Xr3(CreatorRankingPageDialogFragment creatorRankingPageDialogFragment, InterfaceC1364105Vn<? super C861590Xr3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = creatorRankingPageDialogFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861590Xr3(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CreatorRankingPageDialogFragment@c771.onViewCreated$5$1$2");
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
            C515901zh c515901zhLJIIIIZZ = C09IC.LJIIIIZZ(this.LLILLJJLI.MR().LLILZ, this.LLILLJJLI.MR().LLILLL, this.LLILLJJLI.MR().LLILZIL, new C861600Xr4(null));
            C1786110wa1 c1786110wa1 = new C1786110wa1(this.LLILLJJLI, null);
            this.LL = 1;
            if (C09IC.LJII(c515901zhLJIIIIZZ, this, c1786110wa1) == objLJFF) {
                C1C7U.LIZIZ("CreatorRankingPageDialogFragment@c771.onViewCreated$5$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreatorRankingPageDialogFragment@c771.onViewCreated$5$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
