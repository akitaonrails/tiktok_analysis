package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$startDismiss$2$1", f = "FullscreenMediaPreviewPage.kt", l = {372}, m = "invokeSuspend")
public final class C05UH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1677480tko<C1683130ttv, C1677390tkf> LLILLL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLILZ;
    public final /* synthetic */ C1683130ttv LLILZIL;
    public final /* synthetic */ C1683130ttv LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UH(C1677480tko<C1683130ttv, C1677390tkf> c1677480tko, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2, InterfaceC1364105Vn<? super C05UH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1677480tko;
        this.LLILZ = c259800zU;
        this.LLILZIL = c1683130ttv;
        this.LLILZLL = c1683130ttv2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05UH c05uh = new C05UH(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c05uh.LLILLJJLI = obj;
        return c05uh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$startDismiss$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            C1677480tko<C1683130ttv, C1677390tkf> c1677480tko = this.LLILLL;
            C1683130ttv c1683130ttv = new C1683130ttv(0.0f, 0.0f, 1.0f, 1.0f);
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (c1677480tko.LJFF(c1683130ttv, this) == objLJFF) {
                C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$startDismiss$2$1");
                return objLJFF;
            }
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1356505Sp(this.LLILZ, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C05UI(this.LLILLL, this.LLILZIL, this.LLILZLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$startDismiss$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
