package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS23S0001000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Lw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.TemplateAutoCutAIComponent$startPreloadFakeProgress$1$1", f = "TemplateAutoCutAIComponent.kt", l = {}, m = "invokeSuspend")
public final class C558910Lw1 extends C09AX implements Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ int LL;
    public final /* synthetic */ C559020LwC LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558910Lw1(C559020LwC c559020LwC, String str, InterfaceC1364105Vn<? super C558910Lw1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c559020LwC;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C558910Lw1 c558910Lw1 = new C558910Lw1(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c558910Lw1.LL = ((Number) obj).intValue();
        return c558910Lw1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateAutoCutAIComponent@a1d6.startPreloadFakeProgress$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL;
        if (this.LLILLJJLI.LLJJJJLIIL.get(this.LLILLL) == null) {
            this.LLILLJJLI.i3(new AwS23S0001000_8((i * 20) / 100, 4));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.startPreloadFakeProgress$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Integer num, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Integer.valueOf(num.intValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
