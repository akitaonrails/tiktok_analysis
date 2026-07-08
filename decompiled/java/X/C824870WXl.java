package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WXl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.util.EffectTemplateCategoryFragmentExtKt$useJustSubmittedEffect$interceptAndWait$2$1", f = "EffectTemplateCategoryFragmentExt.kt", l = {125}, m = "invokeSuspend")
public final class C824870WXl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC20236714Gf<C824880WXm> LLILLJJLI;
    public final /* synthetic */ C1625590sP7 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C824870WXl(InterfaceC20236714Gf<? super C824880WXm> interfaceC20236714Gf, C1625590sP7 c1625590sP7, InterfaceC1364105Vn<? super C824870WXl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC20236714Gf;
        this.LLILLL = c1625590sP7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C824870WXl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectTemplateCategoryFragmentExtKt@4fc.useJustSubmittedEffect$interceptAndWait$2$1");
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
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("EffectTemplateCategoryFragmentExtKt@4fc.useJustSubmittedEffect$interceptAndWait$2$1");
                return objLJFF;
            }
        }
        if (this.LLILLJJLI.isActive()) {
            InterfaceC20236714Gf<C824880WXm> interfaceC20236714Gf = this.LLILLJJLI;
            C824880WXm c824880WXm = new C824880WXm(this.LLILLL, "time out");
            C189200o6.m2constructorimpl(c824880WXm);
            interfaceC20236714Gf.resumeWith(c824880WXm);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectTemplateCategoryFragmentExtKt@4fc.useJustSubmittedEffect$interceptAndWait$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
