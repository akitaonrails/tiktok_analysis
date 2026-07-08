package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lw0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.TemplateAutoCutAIComponent$startPreloadFakeProgress$1", f = "TemplateAutoCutAIComponent.kt", l = {331}, m = "invokeSuspend")
public final class C558900Lw0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C2191608iI LLILLJJLI;
    public final /* synthetic */ C559020LwC LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C558900Lw0(C2191608iI c2191608iI, C559020LwC c559020LwC, String str, InterfaceC1364105Vn<? super C558900Lw0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c2191608iI;
        this.LLILLL = c559020LwC;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C558900Lw0(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateAutoCutAIComponent@a1d6.startPreloadFakeProgress$1");
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
            AnonymousClass0951 anonymousClass0951 = this.LLILLJJLI.LIZLLL;
            C558910Lw1 c558910Lw1 = new C558910Lw1(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C09IC.LJII(anonymousClass0951, this, c558910Lw1) == objLJFF) {
                C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.startPreloadFakeProgress$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplateAutoCutAIComponent@a1d6.startPreloadFakeProgress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
