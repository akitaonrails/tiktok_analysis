package X;

import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter$processPhotoSelected$3$1", f = "BackgroundVideoStickerPresenter.kt", l = {}, m = "invokeSuspend")
public final class C1702500uPA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BackgroundVideoStickerPresenter LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1702500uPA(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str, InterfaceC1364105Vn<? super C1702500uPA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = backgroundVideoStickerPresenter;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1702500uPA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BackgroundVideoStickerPresenter@77bb.processPhotoSelected$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJLILLLLZIIL = this.LLILLJJLI;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BackgroundVideoStickerPresenter@77bb.processPhotoSelected$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
