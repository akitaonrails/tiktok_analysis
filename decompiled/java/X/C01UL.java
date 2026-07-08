package X;

import com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.LiveCenterApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01UL, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.interaction.widget.livecenter.state.LiveCenterEcSuggestState$reportSuggestionShow$1", f = "LiveCenterEcSuggestState.kt", l = {195}, m = "invokeSuspend")
public final class C01UL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01UL(String str, InterfaceC1364105Vn<? super C01UL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01UL c01ul = new C01UL(this.LLILLL, interfaceC1364105Vn);
        c01ul.LLILLJJLI = obj;
        return c01ul;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveCenterEcSuggestState@f3cf.reportSuggestionShow$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                String str = this.LLILLL;
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                LiveCenterApi liveCenterApiLIZLLL = C01QD.LIZ().LIZLLL();
                this.LL = 1;
                obj = liveCenterApiLIZLLL.reportSuggestionShow(str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveCenterEcSuggestState@f3cf.reportSuggestionShow$1");
                    return objLJFF;
                }
            }
            C189200o6.m2constructorimpl((C470590Icr) obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveCenterEcSuggestState@f3cf.reportSuggestionShow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
