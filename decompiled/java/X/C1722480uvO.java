package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uvO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.nfc.EMVReader$readFrom$2$3", f = "EMVReader.kt", l = {}, m = "invokeSuspend")
public final class C1722480uvO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1722550uvV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722480uvO(C1722550uvV c1722550uvV, InterfaceC1364105Vn<? super C1722480uvO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1722550uvV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722480uvO(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EMVReader@4b4e.readFrom$2$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ.onError(1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EMVReader@4b4e.readFrom$2$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
