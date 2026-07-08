package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0U8o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel", f = "StickerEffectViewModel.kt", l = {LSPassThroughRecordSizeConfig.DEFAULT}, m = "fetchGradeEffectList")
public final class C767440U8o extends AbstractC23140094w {
    public LiveEffect LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C767440U8o(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C767440U8o> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectViewModel@d809.fetchGradeEffectList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objIQ2 = this.LLILLL.IQ2(null, this);
        C1C7U.LIZIZ("StickerEffectViewModel@d809.fetchGradeEffectList$1");
        return objIQ2;
    }
}
