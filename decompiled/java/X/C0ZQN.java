package X;

import android.app.Activity;
import android.view.View;
import com.ss.android.ugc.aweme.im.sticker.api.viewmodel.Photo2StickerViewModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.external.ability.IVideo2StickerService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZQN, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.viewholder.template.media.protocol.mediarefactor.IMMediaRefactorUtils$buildPhoto2Sticker$1$1$1", f = "IMMediaRefactorUtils.kt", l = {}, m = "invokeSuspend")
public final class C0ZQN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ Photo2StickerViewModel LLILLJJLI;
    public final /* synthetic */ C0ZSY LLILLL;
    public final /* synthetic */ Activity LLILZ;
    public final /* synthetic */ View LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZQN(Object obj, Photo2StickerViewModel photo2StickerViewModel, C0ZSY c0zsy, Activity activity, View view, InterfaceC1364105Vn<? super C0ZQN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = photo2StickerViewModel;
        this.LLILLL = c0zsy;
        this.LLILZ = activity;
        this.LLILZIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZQN(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        MediaModel mediaModel;
        C1C7U.LIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (C189200o6.m7isFailureimpl(obj2)) {
            obj2 = null;
        }
        if ((obj2 instanceof MediaModel) && (mediaModel = (MediaModel) obj2) != null) {
            this.LLILLJJLI.setCanOpenStickerPanel(true);
            this.LLILLL.photo2sticker(this.LLILZ, mediaModel, C0ZQT.LONG_PRESS, EnumC902270ZaT.PRIVATE_IMAGE, (IVideo2StickerService.Callback) null);
        } else {
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILZIL);
            c1389890mGx.LJIIIZ(2131831768);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMMediaRefactorUtils@4f43.buildPhoto2Sticker$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
