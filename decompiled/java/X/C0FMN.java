package X;

import com.ss.android.ugc.aweme.creative.model.edit.InspirationItemData;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0FMN, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.ui.ImageInspirationTextStickerPresenter", f = "ImageInspirationTextStickerPresenter.kt", l = {252}, m = "fetchTemplateDependResources")
public final class C0FMN extends AbstractC23140094w {
    public Effect LL;
    public InspirationItemData LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ C0FMH LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMN(C0FMH c0fmh, InterfaceC1364105Vn<? super C0FMN> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = c0fmh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationTextStickerPresenter@ecb3.fetchTemplateDependResources$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(null, null, this);
        C1C7U.LIZIZ("ImageInspirationTextStickerPresenter@ecb3.fetchTemplateDependResources$1");
        return objLIZ;
    }
}
