package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uvS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.ccdc.nfc.EMVReader$readFrom$2$6", f = "EMVReader.kt", l = {}, m = "invokeSuspend")
public final class C1722520uvS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1722550uvV LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722520uvS(C1722550uvV c1722550uvV, InterfaceC1364105Vn<? super C1722520uvS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1722550uvV;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1722520uvS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EMVReader@4b4e.readFrom$2$6");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZJ.onError(7);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EMVReader@4b4e.readFrom$2$6");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
