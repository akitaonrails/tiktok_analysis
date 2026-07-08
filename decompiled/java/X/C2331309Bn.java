package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$queryPostedDraftEntrance$2", f = "DraftViewModel.kt", l = {800}, m = "invokeSuspend")
public final class C2331309Bn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DraftViewModel LLILLJJLI;
    public final /* synthetic */ C553680Lna LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2331309Bn(C553680Lna c553680Lna, DraftViewModel draftViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = draftViewModel;
        this.LLILLL = c553680Lna;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2331309Bn(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("DraftViewModel@38a5.queryPostedDraftEntrance$2");
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
            DraftViewModel draftViewModel = this.LLILLJJLI;
            C553680Lna c553680Lna = this.LLILLL;
            this.LL = 1;
            draftViewModel.getClass();
            C1DFH c1dfh = C0PEM.LIZ;
            Object objLJI = C23250099c.LJI(this, C2107308Nj.LIZ, new C09XV(c553680Lna, draftViewModel, null));
            if (objLJI != C099R.LJFF()) {
                objLJI = Unit.LIZ;
            }
            if (objLJI == objLJFF) {
                C1C7U.LIZIZ("DraftViewModel@38a5.queryPostedDraftEntrance$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewModel@38a5.queryPostedDraftEntrance$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
