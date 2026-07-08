package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H0T, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.view.TemplateTabsContainer$setDisableTimer$1", f = "TemplateTabsContainer.kt", l = {237}, m = "invokeSuspend")
public final class C0H0T extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1420490n4J LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H0T(C1420490n4J c1420490n4J, InterfaceC1364105Vn<? super C0H0T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1420490n4J;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H0T(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateTabsContainer@15d.setDisableTimer$1");
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
            long delayTime = this.LLILLJJLI.getDelayTime();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(delayTime, this) == objLJFF) {
                C1C7U.LIZIZ("TemplateTabsContainer@15d.setDisableTimer$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.LLIZ = false;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateTabsContainer@15d.setDisableTimer$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
