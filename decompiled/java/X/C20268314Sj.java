package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.viewmodel.DetailTakoBottomEntranceViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS609S0100000_30;
import njp.a;

/* JADX INFO: renamed from: X.14Sj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.searchdetailfeed.bottombar.viewmodel.DetailTakoBottomEntranceViewModel$bindData$1", f = "DetailTakoBottomEntranceViewModel.kt", l = {111}, m = "invokeSuspend")
public final class C20268314Sj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ DetailTakoBottomEntranceViewModel LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ C2189821An6 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20268314Sj(DetailTakoBottomEntranceViewModel detailTakoBottomEntranceViewModel, Aweme aweme, C2189821An6 c2189821An6, InterfaceC1364105Vn<? super C20268314Sj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = detailTakoBottomEntranceViewModel;
        this.LLILZ = aweme;
        this.LLILZIL = c2189821An6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20268314Sj c20268314Sj = new C20268314Sj(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c20268314Sj.LLILLJJLI = obj;
        return c20268314Sj;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("DetailTakoBottomEntranceViewModel@9e34.bindData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AbstractC2252651DEx abstractC2252651DEx = this.LLILLL.yQ2().LIZIZ;
            C20268214Si c20268214Si = new C20268214Si(this.LLILZ, this.LLILZIL, null);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2252651DEx, c20268214Si);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DetailTakoBottomEntranceViewModel@9e34.bindData$1");
                return objLJFF;
            }
        }
        C20268514Sl c20268514Sl = (C20268514Sl) obj;
        DetailTakoBottomEntranceViewModel detailTakoBottomEntranceViewModel = this.LLILLL;
        detailTakoBottomEntranceViewModel.LL = c20268514Sl;
        detailTakoBottomEntranceViewModel.setState(new AwS609S0100000_30(c20268514Sl, 110));
        C23250099c.LIZLLL(interfaceC497601wk, this.LLILLL.yQ2().LIZ, null, new C20268414Sk(c20268514Sl, null), 2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DetailTakoBottomEntranceViewModel@9e34.bindData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
