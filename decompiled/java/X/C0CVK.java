package X;

import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0CVK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.notification.redpoint.RedDotCacheHelper$reportCacheEvent$1", f = "RedDotCacheHelper.kt", l = {59}, m = "invokeSuspend")
public final class C0CVK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C0CVK(InterfaceC1364105Vn<? super C0CVK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVK(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RedDotCacheHelper@a530.reportCacheEvent$1");
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
            C0CVL c0cvl = C0CVL.LIZ;
            String str = C0CVL.LJFF;
            c0cvl.getClass();
            C0CVL.LIZJ(str);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(Mp4ScreenVideoLoadTimeout.CONTROL, this) == objLJFF) {
                C1C7U.LIZIZ("RedDotCacheHelper@a530.reportCacheEvent$1");
                return objLJFF;
            }
        }
        C0CVL c0cvl2 = C0CVL.LIZ;
        String str2 = C0CVL.LJFF;
        c0cvl2.getClass();
        C0CVL.LIZJ(str2);
        C0CVL.LJI = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RedDotCacheHelper@a530.reportCacheEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0CVK(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
