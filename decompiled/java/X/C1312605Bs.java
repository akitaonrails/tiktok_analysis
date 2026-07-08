package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.nimble.v2.Top1NimbleInitializer$initTop1Nimble$1", f = "Top1NimbleInitializer.kt", l = {}, m = "invokeSuspend")
public final class C1312605Bs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1312605Bs(Map<String, String> map, InterfaceC1364105Vn<? super C1312605Bs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1312605Bs(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Top1NimbleInitializer@53a2.initTop1Nimble$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20253714Mt.LIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Top1NimbleInitializer@53a2.initTop1Nimble$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
