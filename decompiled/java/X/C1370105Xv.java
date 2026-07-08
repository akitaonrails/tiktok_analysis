package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import h0.n2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Xv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$4$7$2", f = "FullscreenMediaPreviewPage.kt", l = {520}, m = "invokeSuspend")
public final class C1370105Xv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ InterfaceC1677940tlY<C1378605aS> LLILLL;
    public final /* synthetic */ C238400w2 LLILZ;
    public final /* synthetic */ InterfaceC497601wk LLILZIL;
    public final /* synthetic */ C1362605Uy LLILZLL;
    public final /* synthetic */ SocMediaResource LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLJ;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLJI;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1370105Xv(long j, InterfaceC1677940tlY<C1378605aS> interfaceC1677940tlY, C238400w2 c238400w2, InterfaceC497601wk interfaceC497601wk, C1362605Uy c1362605Uy, SocMediaResource socMediaResource, boolean z, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU2, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU3, InterfaceC1364105Vn<? super C1370105Xv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = interfaceC1677940tlY;
        this.LLILZ = c238400w2;
        this.LLILZIL = interfaceC497601wk;
        this.LLILZLL = c1362605Uy;
        this.LLIZ = socMediaResource;
        this.LLIZLLLIL = z;
        this.LLJ = c259800zU;
        this.LLJI = c259800zU2;
        this.LLJIJIL = c259800zU3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1370105Xv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$7$2");
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
            C1677610tl1 c1677610tl1 = n2.LJFF;
            C1378605aS c1378605aS = new C1378605aS(0L);
            float fLIZIZ = C1395705dD.LIZIZ(this.LLILLJJLI);
            C1677580tky c1677580tkyLIZIZ = C1677590tkz.LIZIZ(c1677610tl1, c1378605aS, new C1378605aS((((long) Float.floatToRawIntBits(C1395705dD.LIZJ(this.LLILLJJLI))) & 4294967295L) | (Float.floatToRawIntBits(fLIZIZ) << 32)));
            InterfaceC1677940tlY<C1378605aS> interfaceC1677940tlY = this.LLILLL;
            C1370205Xw c1370205Xw = new C1370205Xw(this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL);
            this.LL = 1;
            if (C1677810tlL.LIZLLL(c1677580tkyLIZIZ, interfaceC1677940tlY, false, c1370205Xw, this) == objLJFF) {
                C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$7$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FullscreenMediaPreviewPageKt@a504.FullyTransformableMedia$4$7$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
