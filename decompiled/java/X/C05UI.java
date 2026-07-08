package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$startDismiss$2$1$2", f = "FullscreenMediaPreviewPage.kt", l = {375}, m = "invokeSuspend")
public final class C05UI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<C1683130ttv, C1677390tkf> LLILLJJLI;
    public final /* synthetic */ C1683130ttv LLILLL;
    public final /* synthetic */ C1683130ttv LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UI(C1677480tko<C1683130ttv, C1677390tkf> c1677480tko, C1683130ttv c1683130ttv, C1683130ttv c1683130ttv2, InterfaceC1364105Vn<? super C05UI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
        this.LLILLL = c1683130ttv;
        this.LLILZ = c1683130ttv2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UI(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$startDismiss$2$1$2");
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
            C1677480tko<C1683130ttv, C1677390tkf> c1677480tko = this.LLILLJJLI;
            C1683130ttv c1683130ttv = this.LLILLL;
            float f = c1683130ttv.LIZ;
            C1683130ttv c1683130ttv2 = this.LLILZ;
            float f2 = c1683130ttv2.LIZ;
            float f3 = (f - f2) / (c1683130ttv2.LIZJ - f2);
            float f4 = c1683130ttv.LIZIZ;
            float f5 = c1683130ttv2.LIZIZ;
            float f6 = (f4 - f5) / (c1683130ttv2.LIZLLL - f5);
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
            C1683130ttv c1683130ttv3 = this.LLILLL;
            float f7 = c1683130ttv3.LIZJ - c1683130ttv3.LIZ;
            C1683130ttv c1683130ttv4 = this.LLILZ;
            float f8 = f7 / (c1683130ttv4.LIZJ - c1683130ttv4.LIZ);
            float f9 = (c1683130ttv3.LIZLLL - c1683130ttv3.LIZIZ) / (c1683130ttv4.LIZLLL - c1683130ttv4.LIZIZ);
            C1683130ttv c1683130ttvLIZJ = C1671570tbH.LIZJ(jFloatToRawIntBits, (((long) Float.floatToRawIntBits(f8)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(f9))));
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, c1683130ttvLIZJ, null, null, null, this, 14) == objLJFF) {
                C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$startDismiss$2$1$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$startDismiss$2$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
