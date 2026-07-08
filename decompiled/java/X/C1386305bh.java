package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templateselect.TemplateSelectionPanelKt$LoadedScreen$2$1", f = "TemplateSelectionPanel.kt", l = {}, m = "invokeSuspend")
public final class C1386305bh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Boolean, Unit> LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1386305bh(Function1<? super Boolean, Unit> function1, C1690050u55 c1690050u55, InterfaceC1364105Vn<? super C1386305bh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function1;
        this.LLILLJJLI = c1690050u55;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1386305bh(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("TemplateSelectionPanelKt@d5c.LoadedScreen$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function1<Boolean, Unit> function1 = this.LL;
        if (this.LLILLJJLI.LJI() == 0 && this.LLILLJJLI.LJII() == 0) {
            z = true;
        } else {
            z = false;
        }
        function1.invoke(Boolean.valueOf(z));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSelectionPanelKt@d5c.LoadedScreen$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
