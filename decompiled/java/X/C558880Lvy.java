package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lvy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.TemplateAutoCutAIComponent$observeFakeProgress$1$1", f = "TemplateAutoCutAIComponent.kt", l = {}, m = "invokeSuspend")
public final class C558880Lvy extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ C559020LwC LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558880Lvy(C559020LwC c559020LwC, String str, InterfaceC1364105Vn<? super C558880Lvy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c559020LwC;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C558880Lvy c558880Lvy = new C558880Lvy(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c558880Lvy.LL = ((Number) obj).intValue();
        return c558880Lvy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateAutoCutAIComponent@a1d6.observeFakeProgress$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        C559060LwG c559060LwG = this.LLILLJJLI.LLJJJJLIIL.get(this.LLILLL);
        if (c559060LwG == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.observeFakeProgress$1$1");
            return unit;
        }
        c559060LwG.LIZLLL = C559050LwF.LIZ(c559060LwG.LIZLLL, null, null, i, 31);
        this.LLILLJJLI.H5(this.LLILLL);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.observeFakeProgress$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
