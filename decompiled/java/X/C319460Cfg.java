package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cfg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.kidsmode.KidsDfInstallCoordinator$attemptInstall$1$onFailed$1", f = "KidsDfInstallCoordinator.kt", l = {96}, m = "invokeSuspend")
public final class C319460Cfg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C842790X4j LLILLJJLI;
    public final /* synthetic */ InterfaceC842850X4p LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C319460Cfg(C842790X4j c842790X4j, InterfaceC842850X4p interfaceC842850X4p, int i, InterfaceC1364105Vn<? super C319460Cfg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c842790X4j;
        this.LLILLL = interfaceC842850X4p;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C319460Cfg(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("KidsDfInstallCoordinator@34b.attemptInstall$1$onFailed$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("KidsDfInstallCoordinator@34b.attemptInstall$1$onFailed$1");
                return objLJFF;
            }
        }
        C842820X4m c842820X4m = C842820X4m.LIZ;
        C842790X4j c842790X4j = this.LLILLJJLI;
        InterfaceC842850X4p interfaceC842850X4p = this.LLILLL;
        int i2 = this.LLILZ + 1;
        c842820X4m.getClass();
        C842820X4m.LIZ(i2, interfaceC842850X4p, c842790X4j);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("KidsDfInstallCoordinator@34b.attemptInstall$1$onFailed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
