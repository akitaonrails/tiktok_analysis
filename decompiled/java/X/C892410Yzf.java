package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Yzf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.framework.aweme.profile.ui.profiletab.BottomProfileObserver$beforePageChangeHandle$1", f = "BottomProfileObserver.kt", l = {}, m = "invokeSuspend")
public final class C892410Yzf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C892410Yzf(InterfaceC1364105Vn<? super C892410Yzf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C892410Yzf(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomProfileObserver@b5db.beforePageChangeHandle$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1250160ida.LIZ.getClass();
        if (C1250160ida.LIZIZ == null) {
            C1250160ida.LIZ("load_page_model_click_tab", true);
            C1250160ida c1250160ida = C1250160ida.LIZ;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomProfileObserver@b5db.beforePageChangeHandle$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C892410Yzf(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
