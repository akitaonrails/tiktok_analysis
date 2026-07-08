package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QiA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel$refreshData$1", f = "MixPageViewModel.kt", l = {252, 278}, m = "invokeSuspend")
public final class C677720QiA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC677860QiO LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ MixPageViewModel LLILZ;
    public final /* synthetic */ C675270QeD LLILZIL;
    public final /* synthetic */ InterfaceC677290QhT LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C677720QiA(AbstractC677860QiO abstractC677860QiO, Context context, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD, InterfaceC677290QhT interfaceC677290QhT, InterfaceC1364105Vn<? super C677720QiA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC677860QiO;
        this.LLILLL = context;
        this.LLILZ = mixPageViewModel;
        this.LLILZIL = c675270QeD;
        this.LLILZLL = interfaceC677290QhT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C677720QiA(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLIZIZ = obj;
        C1C7U.LIZ("MixPageViewModel@7afc.refreshData$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(objLIZIZ);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MixPageViewModel@7afc.refreshData$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(objLIZIZ);
        } else {
            C155000ia.LIZIZ(objLIZIZ);
            AbstractC677860QiO abstractC677860QiO = this.LLILLJJLI;
            Context context = this.LLILLL;
            MixPageViewModel mixPageViewModel = this.LLILZ;
            C1396605dM c1396605dM = mixPageViewModel.LLILZ;
            if (c1396605dM == null) {
                c1396605dM = null;
            }
            C677540Qhs c677540Qhs = c1396605dM.LJ;
            C675270QeD c675270QeD = this.LLILZIL;
            this.LL = 1;
            objLIZIZ = abstractC677860QiO.LIZIZ(context, c677540Qhs, mixPageViewModel, c675270QeD);
            if (objLIZIZ == objLJFF) {
                C1C7U.LIZIZ("MixPageViewModel@7afc.refreshData$1");
                return objLJFF;
            }
        }
        C2501109r7 c2501109r7 = new C2501109r7(new C677270QhR(this.LLILZLL, this.LLILZ, this.LLILZIL, null), new C2325381G0q((InterfaceC346201Wa) objLIZIZ, new C677280QhS(this.LLILZLL, this.LLILZIL, this.LLILLL, this.LLILZ, null), 2), 0);
        final InterfaceC677290QhT interfaceC677290QhT = this.LLILZLL;
        final C675270QeD c675270QeD2 = this.LLILZIL;
        final MixPageViewModel mixPageViewModel2 = this.LLILZ;
        InterfaceC346701Wf<Object> interfaceC346701Wf = new InterfaceC346701Wf() { // from class: X.0Qi8
            @Override // X.InterfaceC346701Wf
            public final Object emit(Object obj2, InterfaceC1364105Vn interfaceC1364105Vn) {
                T t;
                AbstractC677910QiT abstractC677910QiT = (AbstractC677910QiT) obj2;
                if ((abstractC677910QiT instanceof C677760QiE) && (t = ((C677760QiE) abstractC677910QiT).LIZ) != null) {
                    C1422405hW c1422405hW = (C1422405hW) t;
                    if ((!c1422405hW.LIZJ.isEmpty()) && (!c1422405hW.LIZIZ.isEmpty())) {
                        InterfaceC677290QhT interfaceC677290QhT2 = interfaceC677290QhT;
                        if (interfaceC677290QhT2 != null) {
                            interfaceC677290QhT2.LIZ(c675270QeD2, c1422405hW);
                        }
                    } else {
                        mixPageViewModel2.xQ2(C677980Qia.LIZ);
                        InterfaceC677290QhT interfaceC677290QhT3 = interfaceC677290QhT;
                        if (interfaceC677290QhT3 != null) {
                            interfaceC677290QhT3.LIZIZ(c675270QeD2, new C676770Qgd());
                        }
                    }
                } else {
                    InterfaceC677290QhT interfaceC677290QhT4 = interfaceC677290QhT;
                    if (interfaceC677290QhT4 != null) {
                        interfaceC677290QhT4.LIZIZ(c675270QeD2, new C676770Qgd());
                    }
                }
                return Unit.LIZ;
            }
        };
        this.LL = 2;
        if (c2501109r7.collect(interfaceC346701Wf, this) == objLJFF) {
            C1C7U.LIZIZ("MixPageViewModel@7afc.refreshData$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MixPageViewModel@7afc.refreshData$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
