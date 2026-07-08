package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LwY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.ugctemplate.TemplatePreProcessComponent$runMagic$2$4$realRunMagic$1", f = "TemplatePreProcessComponent.kt", l = {310}, m = "invokeSuspend")
public final class C559240LwY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C559200LwU LLILLJJLI;
    public final /* synthetic */ InterfaceC20236714Gf<Boolean> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C559240LwY(C559200LwU c559200LwU, InterfaceC20236714Gf<? super Boolean> interfaceC20236714Gf, InterfaceC1364105Vn<? super C559240LwY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c559200LwU;
        this.LLILLL = interfaceC20236714Gf;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C559240LwY(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplatePreProcessComponent@9cde.runMagic$2$4$realRunMagic$1");
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
            InterfaceC559090LwJ interfaceC559090LwJC5 = this.LLILLJJLI.C5();
            C0FQS c0fqs = this.LLILLJJLI.LLJLLL;
            this.LL = 1;
            obj = interfaceC559090LwJC5.Dg0(c0fqs, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("TemplatePreProcessComponent@9cde.runMagic$2$4$realRunMagic$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (this.LLILLL.isActive()) {
            Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
            InterfaceC20236714Gf<Boolean> interfaceC20236714Gf = this.LLILLL;
            C189200o6.m2constructorimpl(boolValueOf);
            interfaceC20236714Gf.resumeWith(boolValueOf);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TemplatePreProcessComponent@9cde.runMagic$2$4$realRunMagic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
