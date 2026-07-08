package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0E0C, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.magic.ui.MagicApplyHandler$createMagicBusinessListener$1$onSuccess$3", f = "MagicApplyHandler.kt", l = {544}, m = "invokeSuspend")
public final class C0E0C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0E0A LLILLJJLI;
    public final /* synthetic */ C354570DvD LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0E0C(C0E0A c0e0a, C354570DvD c354570DvD, InterfaceC1364105Vn<? super C0E0C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0e0a;
        this.LLILLL = c354570DvD;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0E0C(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MagicApplyHandler@7aa1.createMagicBusinessListener$1$onSuccess$3");
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
            C0E0A c0e0a = this.LLILLJJLI;
            C354570DvD c354570DvD = this.LLILLL;
            this.LL = 1;
            if (c0e0a.LIZJ(c354570DvD, this) == objLJFF) {
                C1C7U.LIZIZ("MagicApplyHandler@7aa1.createMagicBusinessListener$1$onSuccess$3");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MagicApplyHandler@7aa1.createMagicBusinessListener$1$onSuccess$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
