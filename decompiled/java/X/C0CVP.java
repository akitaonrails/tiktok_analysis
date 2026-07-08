package X;

import com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.presenter.MobileEffectViewModel$changeLoadingState$1", f = "MobileEffectViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CVP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MobileEffectViewModel LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVP(MobileEffectViewModel mobileEffectViewModel, boolean z, InterfaceC1364105Vn<? super C0CVP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mobileEffectViewModel;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVP(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobileEffectViewModel@3d13.changeLoadingState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLIZ.setValue(Boolean.valueOf(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MobileEffectViewModel@3d13.changeLoadingState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
