package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QfF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.page.mix.container.repo.BaseMixRefreshRepo$request$2", f = "BaseMixRefreshRepo.kt", l = {266, 268, 270}, m = "invokeSuspend")
public final class C675910QfF extends C09AX implements Function2<InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C675270QeD LLILLL;
    public final /* synthetic */ AbstractC677500Qho LLILZ;
    public final /* synthetic */ Context LLILZIL;
    public final /* synthetic */ C677540Qhs LLILZLL;
    public final /* synthetic */ MixPageViewModel LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C675910QfF(Context context, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD, AbstractC677500Qho abstractC677500Qho, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c675270QeD;
        this.LLILZ = abstractC677500Qho;
        this.LLILZIL = context;
        this.LLILZLL = c677540Qhs;
        this.LLIZ = mixPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C675910QfF c675910QfF = new C675910QfF(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c675910QfF.LLILLJJLI = obj;
        return c675910QfF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseMixRefreshRepo@8c91.request$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1 && i != 2 && i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf<? super AbstractC677910QiT<C1422405hW>> interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            if (this.LLILLL.LIZJ == EnumC675700Qeu.FIRST_SCREEN.getValue()) {
                AbstractC677500Qho abstractC677500Qho = this.LLILZ;
                C675270QeD c675270QeD = this.LLILLL;
                C677540Qhs c677540Qhs = this.LLILZLL;
                MixPageViewModel mixPageViewModel = this.LLIZ;
                this.LL = 1;
                abstractC677500Qho.LJI(c677540Qhs, mixPageViewModel, c675270QeD);
                if (objLJFF == null) {
                    C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.request$2");
                    return objLJFF;
                }
            } else if (this.LLILLL.LIZJ == EnumC675700Qeu.CONTENT_LIST_REFRESH.getValue()) {
                AbstractC677500Qho abstractC677500Qho2 = this.LLILZ;
                C675270QeD c675270QeD2 = this.LLILLL;
                C677540Qhs c677540Qhs2 = this.LLILZLL;
                MixPageViewModel mixPageViewModel2 = this.LLIZ;
                this.LL = 2;
                if (abstractC677500Qho2.LJFF(c675270QeD2, c677540Qhs2, mixPageViewModel2, interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.request$2");
                    return objLJFF;
                }
            } else if (this.LLILLL.LIZJ == EnumC675700Qeu.FULL_PAGE_REFRESH.getValue()) {
                AbstractC677500Qho abstractC677500Qho3 = this.LLILZ;
                Context context = this.LLILZIL;
                C675270QeD c675270QeD3 = this.LLILLL;
                C677540Qhs c677540Qhs3 = this.LLILZLL;
                MixPageViewModel mixPageViewModel3 = this.LLIZ;
                this.LL = 3;
                if (abstractC677500Qho3.LJIJ(context, c675270QeD3, c677540Qhs3, mixPageViewModel3, interfaceC346701Wf, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.request$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMixRefreshRepo@8c91.request$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC346701Wf<? super AbstractC677910QiT<? extends C1422405hW>> interfaceC346701Wf, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC346701Wf, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
