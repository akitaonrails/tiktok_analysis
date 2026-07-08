package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Sr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$animateImageTransformTo$2", f = "FullscreenMediaPreviewPage.kt", l = {}, m = "invokeSuspend")
public final class C1356705Sr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLILLJJLI;
    public final /* synthetic */ float LLILLL;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1356705Sr(C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU, float f, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU2, long j, Function0<Unit> function0, InterfaceC1364105Vn<? super C1356705Sr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c259800zU;
        this.LLILLL = f;
        this.LLILZ = c259800zU2;
        this.LLILZIL = j;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1356705Sr c1356705Sr = new C1356705Sr(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1356705Sr.LL = obj;
        return c1356705Sr;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$animateImageTransformTo$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LL;
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1356605Sq(this.LLILLJJLI, this.LLILLL, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1356805Ss(this.LLILZ, this.LLILZIL, this.LLILZLL, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$animateImageTransformTo$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
