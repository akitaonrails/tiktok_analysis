package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Kwk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.api.util.addtostory.operation.ForwardOperationManager$startCoroutineJob$1$1", f = "ForwardOperationManager.kt", l = {}, m = "invokeSuspend")
public final class C533880Kwk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C533880Kwk(InterfaceC1364105Vn<? super C533880Kwk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C533880Kwk(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForwardOperationManager@7828.startCoroutineJob$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0CHQ.LIZ().LJJJJJ().preloadEffectModel();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForwardOperationManager@7828.startCoroutineJob$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C533880Kwk(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
