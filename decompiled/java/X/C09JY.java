package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JY, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.interaction.RepostDMStickerRepository$preloadStickerImage$1$1", f = "RepostDMStickerRepository.kt", l = {}, m = "invokeSuspend")
public final class C09JY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ UrlModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JY(UrlModel urlModel, InterfaceC1364105Vn<? super C09JY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = urlModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JY(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostDMStickerRepository@38f1.preloadStickerImage$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(this.LL));
        c1331670kl3LJIIIIZZ.LJIL = Bitmap.Config.ARGB_8888;
        c1331670kl3LJIIIIZZ.LJIILJJIL(new AbstractC2350809Ja() { // from class: X.09JZ
            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) {
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostDMStickerRepository@38f1.preloadStickerImage$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
