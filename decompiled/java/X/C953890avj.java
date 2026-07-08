package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0avj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.template.TemplateEditDialogPresenter$onDestroy$1", f = "TemplateEditDialogPresenter.kt", l = {}, m = "invokeSuspend")
public final class C953890avj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C971050bNP LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C953890avj(C971050bNP c971050bNP, InterfaceC1364105Vn<? super C953890avj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c971050bNP;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C953890avj(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZIZ;
        C1C7U.LIZ("TemplateEditDialogPresenter@2cb7.onDestroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C953770avX c953770avX = this.LL.LJFF;
        if (c953770avX != null && (strLIZIZ = c953770avX.LIZIZ()) != null) {
            C953760avW.LIZIZ.LIZ().LJIILIIL(strLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateEditDialogPresenter@2cb7.onDestroy$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
