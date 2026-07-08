package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QiB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel$loadMore$1", f = "MixPageViewModel.kt", l = {304, 314}, m = "invokeSuspend")
public final class C677730QiB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC677860QiO LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ MixPageViewModel LLILZIL;
    public final /* synthetic */ C675270QeD LLILZLL;
    public final /* synthetic */ InterfaceC677290QhT LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677730QiB(AbstractC677860QiO abstractC677860QiO, Context context, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD, InterfaceC677290QhT interfaceC677290QhT, InterfaceC1364105Vn<? super C677730QiB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC677860QiO;
        this.LLILZ = context;
        this.LLILZIL = mixPageViewModel;
        this.LLILZLL = c675270QeD;
        this.LLIZ = interfaceC677290QhT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C677730QiB c677730QiB = new C677730QiB(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c677730QiB.LLILLJJLI = obj;
        return c677730QiB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("MixPageViewModel@7afc.loadMore$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MixPageViewModel@7afc.loadMore$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            AbstractC677860QiO abstractC677860QiO = this.LLILLL;
            Context context = this.LLILZ;
            MixPageViewModel mixPageViewModel = this.LLILZIL;
            C1396605dM c1396605dM = mixPageViewModel.LLILZ;
            if (c1396605dM == null) {
                c1396605dM = null;
            }
            C677540Qhs c677540Qhs = c1396605dM.LJ;
            C675270QeD c675270QeD = this.LLILZLL;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            obj = abstractC677860QiO.LIZIZ(context, c677540Qhs, mixPageViewModel, c675270QeD);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MixPageViewModel@7afc.loadMore$1");
                return objLJFF;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C677680Qi6(this.LLIZ, this.LLILZIL, this.LLILZLL, null), new C2325381G0q((InterfaceC346201Wa) obj, new C677740QiC(this.LLILZIL, null), 2), 0);
        C677710Qi9 c677710Qi9 = new C677710Qi9(interfaceC497601wk, this.LLILZIL, this.LLIZ, this.LLILZLL);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (c2501109r7.collect(c677710Qi9, this) == objLJFF) {
            C1C7U.LIZIZ("MixPageViewModel@7afc.loadMore$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixPageViewModel@7afc.loadMore$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
