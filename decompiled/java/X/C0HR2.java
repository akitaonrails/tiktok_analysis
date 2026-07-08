package X;

import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HR2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel$cancelGeneration$1", f = "MixStudioGeneratingPageViewModel.kt", l = {183}, m = "invokeSuspend")
public final class C0HR2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MixStudioGeneratingPageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HR2(MixStudioGeneratingPageViewModel mixStudioGeneratingPageViewModel, InterfaceC1364105Vn<? super C0HR2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mixStudioGeneratingPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HR2(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MixStudioGeneratingPageViewModel@f91f.cancelGeneration$1");
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
            MixStudioStatusRepository mixStudioStatusRepositoryVQ2 = this.LLILLJJLI.vQ2();
            if (mixStudioStatusRepositoryVQ2 != null) {
                this.LL = 1;
                if (mixStudioStatusRepositoryVQ2.LJIILIIL(null, this) == objLJFF) {
                    C1C7U.LIZIZ("MixStudioGeneratingPageViewModel@f91f.cancelGeneration$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MixStudioGeneratingPageViewModel@f91f.cancelGeneration$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
