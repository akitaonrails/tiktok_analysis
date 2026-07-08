package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09qg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootComponent$clipVideoAndGenerate$1$1", f = "EPAIGCPanelRootComponent.kt", l = {}, m = "invokeSuspend")
public final class C2498409qg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C378920EtO LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2498409qg(C378920EtO c378920EtO, InterfaceC1364105Vn<? super C2498409qg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c378920EtO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2498409qg(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.U5();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EPAIGCPanelRootComponent@c726.clipVideoAndGenerate$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
