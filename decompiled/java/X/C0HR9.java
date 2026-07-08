package X;

import Y.AgS197S0200000_6;
import com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel;
import com.ss.android.ugc.aweme.socialavatar.saas.mixstudio.MixStudioStatusRepository;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HR9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.socialavatar.mixstudio.generatingpage.MixStudioGeneratingPageViewModel$onPrepared$2", f = "MixStudioGeneratingPageViewModel.kt", l = {78}, m = "invokeSuspend")
public final class C0HR9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ MixStudioGeneratingPageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HR9(MixStudioGeneratingPageViewModel mixStudioGeneratingPageViewModel, InterfaceC1364105Vn<? super C0HR9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = mixStudioGeneratingPageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0HR9 c0hr9 = new C0HR9(this.LLILLL, interfaceC1364105Vn);
        c0hr9.LLILLJJLI = obj;
        return c0hr9;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05YD<List<Pair<Integer, String>>> c05ydLJIIL;
        C1C7U.LIZ("MixStudioGeneratingPageViewModel@f91f.onPrepared$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            MixStudioStatusRepository mixStudioStatusRepositoryVQ2 = this.LLILLL.vQ2();
            if (mixStudioStatusRepositoryVQ2 != null && (c05ydLJIIL = mixStudioStatusRepositoryVQ2.LJIIL()) != null) {
                AgS197S0200000_6 agS197S0200000_6 = new AgS197S0200000_6(interfaceC497601wk, this.LLILLL, 13);
                this.LL = 1;
                if (c05ydLJIIL.collect(agS197S0200000_6, this) == objLJFF) {
                    C1C7U.LIZIZ("MixStudioGeneratingPageViewModel@f91f.onPrepared$2");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("MixStudioGeneratingPageViewModel@f91f.onPrepared$2");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
