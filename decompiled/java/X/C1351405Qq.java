package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Qq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.core.router.EcomSparkSubCartInterceptor$handleSparkContext$2$onActivityPostResumed$1", f = "EcomSparkSubCartInterceptor.kt", l = {99}, m = "invokeSuspend")
public final class C1351405Qq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1351405Qq(InterfaceC1364105Vn<? super C1351405Qq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1351405Qq(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcomSparkSubCartInterceptor@739e.handleSparkContext$2$onActivityPostResumed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (C1056170dah.LIZ(this) == objLJFF) {
                C1C7U.LIZIZ("EcomSparkSubCartInterceptor@739e.handleSparkContext$2$onActivityPostResumed$1");
                return objLJFF;
            }
        }
        C1417405gi.LIZ.getClass();
        C1417405gi.LIZ();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcomSparkSubCartInterceptor@739e.handleSparkContext$2$onActivityPostResumed$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1351405Qq(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
