package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$setDiskManagerMode$1", f = "DraftViewModel.kt", l = {454}, m = "invokeSuspend")
public final class C2330309Bd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public DraftViewModel LL;
    public int LLILLJJLI;
    public final /* synthetic */ DraftViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330309Bd(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C2330309Bd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = draftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2330309Bd(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        DraftViewModel draftViewModel;
        C1C7U.LIZ("DraftViewModel@38a5.setDiskManagerMode$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                draftViewModel = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            draftViewModel = this.LLILLL;
            this.LL = draftViewModel;
            this.LLILLJJLI = 1;
            draftViewModel.getClass();
            obj = C23250099c.LJI(this, C0PEM.LIZJ, new C0M04(draftViewModel, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("DraftViewModel@38a5.setDiskManagerMode$1");
                return objLJFF;
            }
        }
        draftViewModel.LLJJIJI = ((Number) obj).longValue();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewModel@38a5.setDiskManagerMode$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
