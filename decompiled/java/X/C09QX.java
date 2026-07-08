package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09QX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.diversion.pdpshare.EcSearchInboxManager$tryRedirectPdpToSearch$1$1$1", f = "EcSearchInboxManager.kt", l = {64}, m = "invokeSuspend")
public final class C09QX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C557050Lt1 LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09QX(long j, C557050Lt1 c557050Lt1, long j2, Function0<Unit> function0, InterfaceC1364105Vn<? super C09QX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = c557050Lt1;
        this.LLILZ = j2;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09QX(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcSearchInboxManager@120e.tryRedirectPdpToSearch$1$1$1");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("EcSearchInboxManager@120e.tryRedirectPdpToSearch$1$1$1");
                return objLJFF;
            }
        }
        if (this.LLILLL.LIZ(false, true)) {
            C09QW c09qw = C09QW.LIZ;
            long j2 = this.LLILZ;
            long j3 = this.LLILLJJLI;
            Function0<Unit> function0 = this.LLILZIL;
            c09qw.getClass();
            C09QW.LIZIZ(j2, j3, function0);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcSearchInboxManager@120e.tryRedirectPdpToSearch$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
