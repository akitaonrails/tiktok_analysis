package X;

import com.ss.android.ugc.aweme.pns.agegate.data.PNSFeedbackModel;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSContainerViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ET, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSContainerViewModel$displayDialog$2", f = "PNSContainerViewModel.kt", l = {27}, m = "invokeSuspend")
public final class C05ET extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PNSContainerViewModel LLILLJJLI;
    public final /* synthetic */ PNSFeedbackModel LLILLL;
    public final /* synthetic */ Function1<Integer, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05ET(PNSContainerViewModel pNSContainerViewModel, PNSFeedbackModel pNSFeedbackModel, Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C05ET> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pNSContainerViewModel;
        this.LLILLL = pNSFeedbackModel;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05ET(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PNSContainerViewModel@6138.displayDialog$2");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LL;
            Pair pair = new Pair(this.LLILLL, this.LLILZ);
            this.LL = 1;
            if (c2252331DDr.emit(pair, this) == objLJFF) {
                C1C7U.LIZIZ("PNSContainerViewModel@6138.displayDialog$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PNSContainerViewModel@6138.displayDialog$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
