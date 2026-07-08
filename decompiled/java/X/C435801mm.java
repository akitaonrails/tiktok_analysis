package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01mm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.view.panel.StreakPanelRouter$openPanel$1$2$1", f = "StreakPanelRouter.kt", l = {}, m = "invokeSuspend")
public final class C435801mm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Activity LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435801mm(Activity activity, InterfaceC1364105Vn<? super C435801mm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435801mm(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPanelRouter@b39d.openPanel$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String string = this.LL.getString(2131831482);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIJ(string);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPanelRouter@b39d.openPanel$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
