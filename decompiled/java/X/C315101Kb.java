package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$extractOpenGlEsVersion$2$deferredOpenGlVersions$2$1", f = "EffectParser.kt", l = {239}, m = "invokeSuspend")
public final class C315101Kb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ File LLILLJJLI;
    public final /* synthetic */ AbstractC2252651DEx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315101Kb(File file, AbstractC2252651DEx abstractC2252651DEx, InterfaceC1364105Vn<? super C315101Kb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = file;
        this.LLILLL = abstractC2252651DEx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315101Kb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EffectParserKt@53dc.extractOpenGlEsVersion$2$deferredOpenGlVersions$2$1");
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
            File file = this.LLILLJJLI;
            AbstractC2252651DEx abstractC2252651DEx = this.LLILLL;
            this.LL = 1;
            obj = C23250099c.LJI(this, abstractC2252651DEx, new C315001Ka(file, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectParserKt@53dc.extractOpenGlEsVersion$2$deferredOpenGlVersions$2$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectParserKt@53dc.extractOpenGlEsVersion$2$deferredOpenGlVersions$2$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
