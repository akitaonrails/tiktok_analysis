package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel;
import com.ss.android.ugc.aweme.search.performance.metrics.SearchMiddleMonitor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QB3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.core.viewmodel.SuggestWordsViewModel$requestGuessSearchAdvanced$1", f = "SuggestWordsViewModel.kt", l = {124}, m = "invokeSuspend")
public final class C0QB3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SuggestWordsViewModel LLILLJJLI;
    public final /* synthetic */ C0QER LLILLL;
    public final /* synthetic */ C650960Pg6 LLILZ;
    public final /* synthetic */ C0PS4 LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QB3(SuggestWordsViewModel suggestWordsViewModel, C0QER c0qer, C650960Pg6 c650960Pg6, C0PS4 c0ps4, String str, String str2, String str3, InterfaceC1364105Vn<? super C0QB3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = suggestWordsViewModel;
        this.LLILLL = c0qer;
        this.LLILZ = c650960Pg6;
        this.LLILZIL = c0ps4;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0QB3(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        boolean z;
        C1C7U.LIZ("SuggestWordsViewModel@8b07.requestGuessSearchAdvanced$1");
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
                SearchMiddleMonitor.INSTANCE.recommendRequestStart();
                if (((Number) C1821307Bj.LIZ.getValue()).intValue() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Thread.sleep(((Number) r1.getValue()).intValue());
                }
                System.currentTimeMillis();
                SuggestWordsViewModel suggestWordsViewModel = this.LLILLJJLI;
                C0QER c0qer = this.LLILLL;
                C650960Pg6 c650960Pg6 = this.LLILZ;
                C0PS4 c0ps4 = this.LLILZIL;
                String str = this.LLIZ;
                String str2 = this.LLIZLLLIL;
                this.LL = 1;
                if (suggestWordsViewModel.yQ2(c0qer, c650960Pg6, c0ps4, str, str2, this) == objLJFF) {
                    C1C7U.LIZIZ("SuggestWordsViewModel@8b07.requestGuessSearchAdvanced$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SuggestWordsViewModel@8b07.requestGuessSearchAdvanced$1");
        return unit;
    }
}
