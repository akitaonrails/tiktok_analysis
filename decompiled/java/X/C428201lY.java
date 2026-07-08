package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.autocut.ui.AutoCutPopupUIHandler$clearTempFiles$1", f = "AutoCutPopupUIHandler.kt", l = {}, m = "invokeSuspend")
public final class C428201lY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1418220n0e LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C428201lY(C1418220n0e c1418220n0e, InterfaceC1364105Vn<? super C428201lY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1418220n0e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C428201lY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AutoCutPopupUIHandler@7726.clearTempFiles$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.LJII;
        if (str != null) {
            Boolean.valueOf(C2286708xd.LJIJ(str));
        }
        this.LL.LJII = null;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AutoCutPopupUIHandler@7726.clearTempFiles$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
