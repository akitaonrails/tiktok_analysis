package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Uo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullscreenMediaPreviewPage$2$2$3$2$1$1", f = "FullscreenMediaPreviewPage.kt", l = {263}, m = "invokeSuspend")
public final class C1361605Uo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1690640u62 LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1361605Uo(AbstractC1690640u62 abstractC1690640u62, int i, InterfaceC1364105Vn<? super C1361605Uo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1690640u62;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1361605Uo(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullscreenMediaPreviewPage$2$2$3$2$1$1");
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
            AbstractC1690640u62 abstractC1690640u62 = this.LLILLJJLI;
            int i2 = this.LLILLL;
            this.LL = 1;
            if (abstractC1690640u62.LJFF(i2, 0.0f, C1671550tbF.LIZJ(0.0f, 0.0f, null, 7), this) == objLJFF) {
                C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullscreenMediaPreviewPage$2$2$3$2$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullscreenMediaPreviewPage$2$2$3$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
