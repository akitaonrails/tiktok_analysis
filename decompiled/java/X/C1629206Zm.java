package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.quickchat.ui.IMUnifiedQuickInputDialogFragment$onViewCreated$1$1", f = "IMUnifiedQuickInputDialogFragment.kt", l = {}, m = "invokeSuspend")
public final class C1629206Zm extends C09AX implements Function2<InterfaceC456120Huc, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C1629206Zm(InterfaceC1364105Vn<? super C1629206Zm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1629206Zm c1629206Zm = new C1629206Zm(interfaceC1364105Vn);
        c1629206Zm.LL = obj;
        return c1629206Zm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMUnifiedQuickInputDialogFragment@9799.onViewCreated$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(!(this.LL instanceof C1629106Zl));
        C1C7U.LIZIZ("IMUnifiedQuickInputDialogFragment@9799.onViewCreated$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC456120Huc interfaceC456120Huc, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC456120Huc, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
