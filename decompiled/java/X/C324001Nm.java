package X;

import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Nm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectparser.EffectParserKt$parseEffect$2$deferredOpenGlEsVersion$1", f = "EffectParser.kt", l = {76}, m = "invokeSuspend")
public final class C324001Nm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ File LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324001Nm(File file, InterfaceC1364105Vn<? super C324001Nm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = file;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324001Nm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("EffectParserKt@53dc.parseEffect$2$deferredOpenGlEsVersion$1");
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
            this.LL = 1;
            C1DFB c1dfb = C0PEM.LIZJ;
            obj = C23250099c.LJI(this, c1dfb, new C324101Nn(file, c1dfb, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectParserKt@53dc.parseEffect$2$deferredOpenGlEsVersion$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("EffectParserKt@53dc.parseEffect$2$deferredOpenGlEsVersion$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
