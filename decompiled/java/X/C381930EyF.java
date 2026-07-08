package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0EyF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.genaifoundation.core.orchestrator.GenAIOrchestrator$generate$syncResultCallback$1$onFailure$1", f = "GenAIOrchestrator.kt", l = {}, m = "invokeSuspend")
public final class C381930EyF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC382370Eyx LL;
    public final /* synthetic */ C377760ErW LLILLJJLI;
    public final /* synthetic */ C381810Ey3 LLILLL;
    public final /* synthetic */ C381600Exi LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C381930EyF(InterfaceC382370Eyx interfaceC382370Eyx, C377760ErW c377760ErW, C381810Ey3 c381810Ey3, C381600Exi c381600Exi, InterfaceC1364105Vn<? super C381930EyF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC382370Eyx;
        this.LLILLJJLI = c377760ErW;
        this.LLILLL = c381810Ey3;
        this.LLILZ = c381600Exi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C381930EyF(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GenAIOrchestrator@81ae.generate$syncResultCallback$1$onFailure$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC382370Eyx interfaceC382370Eyx = this.LL;
        C377760ErW c377760ErW = this.LLILLJJLI;
        C381810Ey3 c381810Ey3 = this.LLILLL;
        C381600Exi c381600Exi = this.LLILZ;
        c381810Ey3.getClass();
        interfaceC382370Eyx.LIZ(c377760ErW, C381810Ey3.LJIIJ(c381600Exi), null, "");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("GenAIOrchestrator@81ae.generate$syncResultCallback$1$onFailure$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
