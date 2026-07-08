package X;

import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0M00, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.da.DraftMonitorHelper$mobDraftInfo$1", f = "DraftMonitorHelper.kt", l = {129}, m = "invokeSuspend")
public final class C0M00 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;
    public final /* synthetic */ DraftViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0M00(DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C0M00> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = draftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0M00(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        int iLIZLLL;
        long jLongValue;
        Object objLJI = obj;
        C1C7U.LIZ("DraftMonitorHelper@824c.mobDraftInfo$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                iLIZLLL = this.LL;
                C155000ia.LIZIZ(objLJI);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJI);
            iLIZLLL = C0M4A.LIZLLL(new C0M4E(null, null, null, false, this.LLILLL.BQ2(), null, null, null, false, null, 1007));
            DraftViewModel draftViewModel = this.LLILLL;
            jLongValue = draftViewModel.LLJJIJI;
            if (jLongValue < 0) {
                this.LL = iLIZLLL;
                this.LLILLJJLI = 1;
                objLJI = C23250099c.LJI(this, C0PEM.LIZJ, new C0M04(draftViewModel, null));
                if (objLJI == objLJFF) {
                    C1C7U.LIZIZ("DraftMonitorHelper@824c.mobDraftInfo$1");
                    return objLJFF;
                }
            }
            C0LAB c0lab = new C0LAB();
            c0lab.LIZ(iLIZLLL, "count");
            c0lab.LIZIZ(jLongValue, "storage_size");
            C20684815ws.LJIILLIIL("tool_performance_draft_info", c0lab.LIZ);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftMonitorHelper@824c.mobDraftInfo$1");
            return unit;
        }
        jLongValue = ((Number) objLJI).longValue();
        C0LAB c0lab2 = new C0LAB();
        c0lab2.LIZ(iLIZLLL, "count");
        c0lab2.LIZIZ(jLongValue, "storage_size");
        C20684815ws.LJIILLIIL("tool_performance_draft_info", c0lab2.LIZ);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftMonitorHelper@824c.mobDraftInfo$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
