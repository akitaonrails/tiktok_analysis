package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Qaw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.suggest.vm.EcSearchSuggestViewModelNew$fetchGuessData$1$1$1", f = "EcSearchSuggestViewModelNew.kt", l = {}, m = "invokeSuspend")
public final class C673240Qaw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EcSearchSuggestViewModelNew LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C673240Qaw(EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew, String str, boolean z, InterfaceC1364105Vn<? super C673240Qaw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = ecSearchSuggestViewModelNew;
        this.LLILLJJLI = str;
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C673240Qaw(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("EcSearchSuggestViewModelNew@29c4.fetchGuessData$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EcSearchSuggestViewModelNew ecSearchSuggestViewModelNew = this.LL;
        String str = this.LLILLJJLI;
        boolean z2 = this.LLILLL;
        try {
            InterfaceC673060Qae interfaceC673060Qae = (InterfaceC673060Qae) ecSearchSuggestViewModelNew.zQ2().getOperator();
            C0QER c0qerV4 = ecSearchSuggestViewModelNew.v4();
            if (z2) {
                z = true;
            } else {
                z = false;
            }
            interfaceC673060Qae.LLJJ(c0qerV4, str, z);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchSuggestViewModelNew@29c4.fetchGuessData$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
