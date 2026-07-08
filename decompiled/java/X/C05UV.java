package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05UV, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.mediapicker.ui.preview.FullscreenMediaPreviewPageKt$FullyTransformableMedia$onDragOrFling$1", f = "FullscreenMediaPreviewPage.kt", l = {403, 405, 407, 408}, m = "invokeSuspend")
public final class C05UV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1683130ttv LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1362605Uy LLILLL;
    public final /* synthetic */ SocMediaResource LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ C259800zU<C1677480tko<C1378605aS, C1677270tkT>> LLIZ;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLIZLLLIL;
    public final /* synthetic */ C259800zU<C1677480tko<Float, C1677280tkU>> LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05UV(C1362605Uy c1362605Uy, SocMediaResource socMediaResource, boolean z, long j, C259800zU<C1677480tko<C1378605aS, C1677270tkT>> c259800zU, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU2, C259800zU<C1677480tko<Float, C1677280tkU>> c259800zU3, InterfaceC1364105Vn<? super C05UV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1362605Uy;
        this.LLILZ = socMediaResource;
        this.LLILZIL = z;
        this.LLILZLL = j;
        this.LLIZ = c259800zU;
        this.LLIZLLLIL = c259800zU2;
        this.LLJ = c259800zU3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05UV(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0177  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05UV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
