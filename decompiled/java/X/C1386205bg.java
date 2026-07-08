package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.templateselect.TemplateSelectionPanelKt$LoadedScreen$1$1", f = "TemplateSelectionPanel.kt", l = {391}, m = "invokeSuspend")
public final class C1386205bg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1690050u55 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;
    public final /* synthetic */ InterfaceC1676320tiw LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1386205bg(C1690050u55 c1690050u55, int i, Function0<Unit> function0, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C1386205bg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1690050u55;
        this.LLILLL = i;
        this.LLILZ = function0;
        this.LLILZIL = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1386205bg(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateSelectionPanelKt@d5c.LoadedScreen$1$1");
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
            if (this.LLILZIL.LIZLLL() != -1) {
                C1690050u55 c1690050u55 = this.LLILLJJLI;
                int iLIZLLL = this.LLILZIL.LIZLLL();
                int i2 = this.LLILLL;
                this.LL = 1;
                if (c1690050u55.LJIIJ(iLIZLLL, i2, this) == objLJFF) {
                    C1C7U.LIZIZ("TemplateSelectionPanelKt@d5c.LoadedScreen$1$1");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateSelectionPanelKt@d5c.LoadedScreen$1$1");
            return unit;
        }
        this.LLILZ.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateSelectionPanelKt@d5c.LoadedScreen$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
