package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05US, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$4$1$1", f = "FullscreenMediaPreviewPage.kt", l = {451, 452}, m = "invokeSuspend")
public final class C05US extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLILLL;
    public final /* synthetic */ float LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ C1683130ttv LLILZLL;
    public final /* synthetic */ SocMediaResource LLIZ;
    public final /* synthetic */ long LLIZLLLIL;
    public final /* synthetic */ C1683130ttv LLJ;
    public final /* synthetic */ long LLJI;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05US(C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU, float f, boolean z, C1683130ttv c1683130ttv, SocMediaResource socMediaResource, long j, C1683130ttv c1683130ttv2, long j2, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU2, InterfaceC1364105Vn<? super C05US> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c259800zU;
        this.LLILZ = f;
        this.LLILZIL = z;
        this.LLILZLL = c1683130ttv;
        this.LLIZ = socMediaResource;
        this.LLIZLLLIL = j;
        this.LLJ = c1683130ttv2;
        this.LLJI = j2;
        this.LLJIJIL = c259800zU2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05US(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1683130ttv c1683130ttvLIZIZ;
        long jFloatToRawIntBits;
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jFloatToRawIntBits = this.LL;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            float fLIZLLL = C13LZ.LIZLLL(this.LLILLL.element.LIZLLL().floatValue() * this.LLILZ, 0.7f, 10.0f);
            if (this.LLILZIL) {
                c1683130ttvLIZIZ = C1671590tbJ.LIZIZ(this.LLIZ.LIZIZ(), this.LLILZLL, true);
            } else {
                c1683130ttvLIZIZ = this.LLILZLL;
            }
            long j = this.LLIZLLLIL;
            float fLIZLLL2 = C13LZ.LIZLLL(Float.intBitsToFloat((int) (j >> 32)), c1683130ttvLIZIZ.LIZ, c1683130ttvLIZIZ.LIZJ);
            float fLIZLLL3 = C13LZ.LIZLLL(Float.intBitsToFloat((int) (j & 4294967295L)), c1683130ttvLIZIZ.LIZIZ, c1683130ttvLIZIZ.LIZLLL);
            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fLIZLLL2)) << 32) | (((long) Float.floatToRawIntBits(fLIZLLL3)) & 4294967295L);
            float fFloatValue = 1.0f - (fLIZLLL / this.LLILLL.element.LIZLLL().floatValue());
            float fIntBitsToFloat = ((Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) - this.LLJ.LIZ) * fFloatValue) + Float.intBitsToFloat((int) (this.LLJI >> 32));
            float fIntBitsToFloat2 = (fFloatValue * (Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)) - this.LLJ.LIZIZ)) + Float.intBitsToFloat((int) (this.LLJI & 4294967295L));
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL.element;
            Float fLIZLLL4 = C2286608xc.LIZLLL(fLIZLLL);
            this.LL = jFloatToRawIntBits;
            this.LLILLJJLI = 1;
            if (c1677480tko.LJFF(fLIZLLL4, this) == objLJFF) {
                C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$1$1");
                return objLJFF;
            }
        }
        C1677480tko<C1378605aS, C1677270tkT> c1677480tko2 = this.LLJIJIL.element;
        C1677480tko<C1378605aS, C1677270tkT> c1677480tko3 = c1677480tko2;
        C1378605aS c1378605aS = new C1378605aS(C1378605aS.LJI(c1677480tko2.LIZLLL().LIZ, jFloatToRawIntBits));
        this.LLILLJJLI = 2;
        if (c1677480tko3.LJFF(c1378605aS, this) == objLJFF) {
            C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$1$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
