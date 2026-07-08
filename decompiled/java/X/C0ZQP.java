package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZQP, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.IMMediaRefactorUtils$buildPrivateVideo2Sticker$1$1$1", f = "IMMediaRefactorUtils.kt", l = {}, m = "invokeSuspend")
public final class C0ZQP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ IVideo2StickerService LL;
    public final /* synthetic */ InterfaceC889250YuZ LLILLJJLI;
    public final /* synthetic */ Activity LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Photo2StickerViewModel LLILZIL;
    public final /* synthetic */ C869590Y9l LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZQP(IVideo2StickerService iVideo2StickerService, InterfaceC889250YuZ interfaceC889250YuZ, Activity activity, String str, Photo2StickerViewModel photo2StickerViewModel, C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C0ZQP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = iVideo2StickerService;
        this.LLILLJJLI = interfaceC889250YuZ;
        this.LLILLL = activity;
        this.LLILZ = str;
        this.LLILZIL = photo2StickerViewModel;
        this.LLILZLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZQP(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMMediaRefactorUtils@4f43.buildPrivateVideo2Sticker$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            this.LLILLJJLI.hide();
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLL);
            c1389890mGx.LJIIIZ(2131831768);
            c1389890mGx.LJIIJJI();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPrivateVideo2Sticker$1$1$1");
            return unit;
        }
        String str = this.LLILZ;
        if (str != null && str.length() != 0) {
            this.LLILLJJLI.hide();
            Photo2StickerViewModel photo2StickerViewModel = this.LLILZIL;
            if (photo2StickerViewModel != null) {
                photo2StickerViewModel.setCanOpenStickerPanel(true);
            }
            this.LL.openVideoTrimForSticker(this.LLILLL, this.LLILZ, 0L, C0ZQT.LONG_PRESS.getEtString());
        } else {
            Aweme awemeLJ = C911220Zou.LJ(this.LLILZLL, null);
            IVideo2StickerService iVideo2StickerService = this.LL;
            final Activity activity = this.LLILLL;
            final InterfaceC889250YuZ interfaceC889250YuZ = this.LLILLJJLI;
            final Photo2StickerViewModel photo2StickerViewModel2 = this.LLILZIL;
            iVideo2StickerService.downloadAndOpenVideoTrimForSticker(activity, awemeLJ, new IVideo2StickerService.Callback() { // from class: X.0ZQQ
                @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService.Callback
                public final void onSuccess() {
                    interfaceC889250YuZ.hide();
                    Photo2StickerViewModel photo2StickerViewModel3 = photo2StickerViewModel2;
                    if (photo2StickerViewModel3 != null) {
                        photo2StickerViewModel3.setCanOpenStickerPanel(true);
                    }
                }

                @Override // com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService.Callback
                public final void onFailed(Exception exc, String str2, int i) {
                    interfaceC889250YuZ.hide();
                    C1389890mGx c1389890mGx2 = new C1389890mGx(activity);
                    c1389890mGx2.LJIIIZ(2131831768);
                    c1389890mGx2.LJIIJJI();
                }
            });
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPrivateVideo2Sticker$1$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
