package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nf4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.jsb.impl.EcPdpRegisterMethodIDL$handle$3$1", f = "EcPdpRegisterMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C599360Nf4 extends C09AX implements Function2<InterfaceC599270Nev, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ InterfaceC634840OvC LLILLJJLI;
    public final /* synthetic */ InterfaceC600420Ngm LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C599360Nf4(InterfaceC634840OvC interfaceC634840OvC, InterfaceC600420Ngm interfaceC600420Ngm, InterfaceC1364105Vn<? super C599360Nf4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC634840OvC;
        this.LLILLL = interfaceC600420Ngm;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C599360Nf4 c599360Nf4 = new C599360Nf4(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c599360Nf4.LL = obj;
        return c599360Nf4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcPdpRegisterMethodIDL@c5e4.handle$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.sendEvent(this.LLILLL.getName(), ((InterfaceC599270Nev) this.LL).LJLIIIL());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcPdpRegisterMethodIDL@c5e4.handle$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC599270Nev interfaceC599270Nev, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC599270Nev, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
