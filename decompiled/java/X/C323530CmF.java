package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CmF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.AwemeFetchManager$getBatchAwemeCacheItem$3$loadingJobs$1$1$1", f = "AwemeFetchManager.kt", l = {}, m = "invokeSuspend")
public final class C323530CmF extends C09AX implements Function2<InterfaceC327200CsA, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C323530CmF(InterfaceC1364105Vn<? super C323530CmF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C323530CmF c323530CmF = new C323530CmF(interfaceC1364105Vn);
        c323530CmF.LL = obj;
        return c323530CmF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$loadingJobs$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(!(this.LL instanceof C327160Cs6));
        C1C7U.LIZIZ("AwemeFetchManager@5bcc.getBatchAwemeCacheItem$3$loadingJobs$1$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC327200CsA interfaceC327200CsA, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC327200CsA, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
