package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05RP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.inbox.professional.ProfessionalInboxManager$updateUserInboxMode$1$1", f = "ProfessionalInboxManager.kt", l = {}, m = "invokeSuspend")
public final class C05RP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C05RV LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C05RP(boolean z, C05RV c05rv, String str, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C05RP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c05rv;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05RP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfessionalInboxManager@ef99.updateUserInboxMode$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            C889930Yvf c889930Yvf = C889930Yvf.LIZ;
            C05RV c05rv = this.LLILLJJLI;
            String str = this.LLILLL;
            c889930Yvf.getClass();
            C889930Yvf.LJIILJJIL(c05rv, str);
        }
        Function1<Boolean, Unit> function1 = this.LLILZ;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(this.LL));
        }
        C889930Yvf.LJII = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfessionalInboxManager@ef99.updateUserInboxMode$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
