package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.widget.HighlightsCoverCropperKt$HighlightsCoverCropper$touchAlphaModifier$1$1$1$3$1$1", f = "HighlightsCoverCropper.kt", l = {170}, m = "invokeSuspend")
public final class C05SQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SQ(C1677480tko<Float, C1677280tkU> c1677480tko, InterfaceC1364105Vn<? super C05SQ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05SQ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("HighlightsCoverCropperKt@f4fc.HighlightsCoverCropper$touchAlphaModifier$1$1$1$3$1$1");
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
            C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI;
            Float fLIZLLL = C2286608xc.LIZLLL(1.0f);
            C1676890tjr c1676890tjrLIZJ = C1671550tbF.LIZJ(0.0f, 0.0f, null, 7);
            this.LL = 1;
            if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, c1676890tjrLIZJ, null, null, this, 12) == objLJFF) {
                C1C7U.LIZIZ("HighlightsCoverCropperKt@f4fc.HighlightsCoverCropper$touchAlphaModifier$1$1$1$3$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("HighlightsCoverCropperKt@f4fc.HighlightsCoverCropper$touchAlphaModifier$1$1$1$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
