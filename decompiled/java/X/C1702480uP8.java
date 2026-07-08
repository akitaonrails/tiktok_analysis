package X;

import Y.ARunnableS100S0000000_26;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0uP8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.UserProfileSafeFragment$onDestroyView$1", f = "UserProfileSafeFragment.kt", l = {}, m = "invokeSuspend")
public final class C1702480uP8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1702480uP8(InterfaceC1364105Vn<? super C1702480uP8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702480uP8(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UserProfileSafeFragment@4c58.onDestroyView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (C1252704vF.LIZIZ.isInitialized().get()) {
            C1701250uN9.LIZ.getClass();
            ExecutorService executorService = C1701250uN9.LJII;
            if (executorService == null) {
                executorService = null;
            }
            executorService.execute(new ARunnableS100S0000000_26(16));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("UserProfileSafeFragment@4c58.onDestroyView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1702480uP8(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
