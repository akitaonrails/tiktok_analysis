package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hybridkit.task.BDXBridgeInitUtils$postToCoroutines$4", f = "BDXBridgeInitUtils.kt", l = {}, m = "invokeSuspend")
public final class C2144508ah extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2144508ah(Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C2144508ah> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2144508ah(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BDXBridgeInitUtils@be27.postToCoroutines$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BDXBridgeInitUtils@be27.postToCoroutines$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
