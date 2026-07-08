package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09ZH, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.i18n.xbridge.idlruntime.BridgeGeckoUpdateListener$onCheckServerVersionFail$1", f = "BDXHostOpenDependImpl.kt", l = {}, m = "invokeSuspend")
public final class C09ZH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C09ZI LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09ZH(C09ZI c09zi, InterfaceC1364105Vn<? super C09ZH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c09zi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09ZH(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BridgeGeckoUpdateListener@3dbe.onCheckServerVersionFail$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ.LJFF();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BridgeGeckoUpdateListener@3dbe.onCheckServerVersionFail$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
