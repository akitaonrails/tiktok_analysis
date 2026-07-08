package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IPS, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.proto.hybrid.PbDecodersProvider$onEvent$1$1", f = "PbDecodersProvider.kt", l = {}, m = "invokeSuspend")
public final class C0IPS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0IPS(String str, InterfaceC1364105Vn<? super C0IPS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0IPS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PbDecodersProvider@f829.onEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1516980pZw c1516980pZw = C1516980pZw.LIZ;
        String str = this.LL;
        c1516980pZw.getClass();
        C1516980pZw.LIZJ(str);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PbDecodersProvider@f829.onEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
