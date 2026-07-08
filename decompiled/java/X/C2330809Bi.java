package X;

import Y.AgS289S0100000_8;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Bi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.draft.viewmodel.DraftViewModel$observeDraftWithAsyncTasks$1$1$1", f = "DraftViewModel.kt", l = {335}, m = "invokeSuspend")
public final class C2330809Bi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C539070LCf> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ DraftViewModel LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330809Bi(InterfaceC346201Wa<C539070LCf> interfaceC346201Wa, String str, DraftViewModel draftViewModel, InterfaceC1364105Vn<? super C2330809Bi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = str;
        this.LLILZ = draftViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2330809Bi(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftViewModel@38a5.observeDraftWithAsyncTasks$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC346201Wa<C539070LCf> interfaceC346201Wa = this.LLILLJJLI;
                AgS289S0100000_8 agS289S0100000_8 = new AgS289S0100000_8(this.LLILZ, 30);
                this.LL = 1;
                if (interfaceC346201Wa.collect(agS289S0100000_8, this) == objLJFF) {
                    C1C7U.LIZIZ("DraftViewModel@38a5.observeDraftWithAsyncTasks$1$1$1");
                    return objLJFF;
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            C0MAY c0may = C0MAY.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("overallStatus flow cancelled creationId: ");
            sbLIZ.append(this.LLILLL);
            C201955140j.LIZLLL(c0may, "CreationAsyncTask", C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DraftViewModel@38a5.observeDraftWithAsyncTasks$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
