package X;

import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.VenmoProcess;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01ea, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.VenmoProcess$clear$1$1", f = "VenmoProcess.kt", l = {}, m = "invokeSuspend")
public final class C385001ea extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LifecycleOwner LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C385001ea(LifecycleOwner lifecycleOwner, InterfaceC1364105Vn<? super C385001ea> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lifecycleOwner;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C385001ea(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VenmoProcess@f201.clear$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.getLifecycle().removeObserver(VenmoProcess.LIZJ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VenmoProcess@f201.clear$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
