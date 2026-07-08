package X;

import com.ss.android.ugc.aweme.im.search.api.IMSearchApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0R1b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ui.IMHistorySearchFragment$onViewCreated$3", f = "IMHistorySearchFragment.kt", l = {112}, m = "invokeSuspend")
public final class C689050R1b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C689050R1b(InterfaceC1364105Vn<? super C689050R1b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C689050R1b c689050R1b = new C689050R1b(interfaceC1364105Vn);
        c689050R1b.LLILLJJLI = obj;
        return c689050R1b;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("IMHistorySearchFragment@3156.onViewCreated$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(500L, this) == objLJFF) {
                C1C7U.LIZIZ("IMHistorySearchFragment@3156.onViewCreated$3");
                return objLJFF;
            }
        }
        IMSearchApi.LIZ.getClass();
        C689060R1c.LIZ().LIZIZ().LIZJ(interfaceC497601wk);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMHistorySearchFragment@3156.onViewCreated$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
