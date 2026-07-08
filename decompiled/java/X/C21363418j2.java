package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.sticker.types.ar.backgroundvideo.BackgroundVideoStickerPresenter;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS681S0100000_32;

/* JADX INFO: renamed from: X.18j2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21363418j2 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ BackgroundVideoStickerPresenter LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21363418j2(BackgroundVideoStickerPresenter backgroundVideoStickerPresenter, String str, long j) {
        super(0);
        this.LL = backgroundVideoStickerPresenter;
        this.LLILLJJLI = str;
        this.LLILLL = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Intent intentLIZIZ;
        if (C21363018iy.LJI(this.LL.LLLIIIIL)) {
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter = this.LL;
            InterfaceC21363618j4 interfaceC21363618j4 = backgroundVideoStickerPresenter.LLJIJIL;
            String str = backgroundVideoStickerPresenter.LLILZ;
            String str2 = this.LLILLJJLI;
            String strLJFF = C21363018iy.LJFF(backgroundVideoStickerPresenter.LLLIIIIL, "video_picker", "video_path");
            String strLJ = C21363018iy.LJ(this.LL.LLLIIIIL);
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter2 = this.LL;
            backgroundVideoStickerPresenter2.LLJLL = strLJ;
            Effect effect = backgroundVideoStickerPresenter2.LLLIIIIL;
            intentLIZIZ = interfaceC21363618j4.LIZIZ(str, str2, null, strLJFF, strLJ, effect != null ? Boolean.valueOf(C1449600npG.LJIIIIZZ(effect)) : null, this.LL.LLLIIIIL);
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter3 = this.LL;
            intentLIZIZ.putExtra("is_new_background_video_pipeline", true);
            intentLIZIZ.putExtra("key_is_camera_green_screen_pick_material", C1624570sNT.LJIIL(backgroundVideoStickerPresenter3.LLLIIIIL));
            Effect effect2 = backgroundVideoStickerPresenter3.LLLIIIIL;
            intentLIZIZ.putExtra("extra_is_effect_aigc_v2v", effect2 != null && C1449600npG.LJIIIIZZ(effect2));
        } else {
            BackgroundVideoStickerPresenter backgroundVideoStickerPresenter4 = this.LL;
            InterfaceC21363618j4 interfaceC21363618j42 = backgroundVideoStickerPresenter4.LLJIJIL;
            String str3 = backgroundVideoStickerPresenter4.LLILZ;
            String str4 = this.LLILLJJLI;
            Effect effect3 = backgroundVideoStickerPresenter4.LLLIIIIL;
            intentLIZIZ = interfaceC21363618j42.LIZIZ(str3, str4, null, null, null, effect3 != null ? Boolean.valueOf(C1449600npG.LJIIIIZZ(effect3)) : null, this.LL.LLLIIIIL);
        }
        Long lLJJIIZ = this.LL.LJJIIZ();
        if (lLJJIIZ != null && lLJJIIZ.longValue() > 0) {
            intentLIZIZ.putExtra("cut_video_max_length", lLJJIIZ.longValue());
        }
        intentLIZIZ.putExtra("original_video_duration", this.LLILLL);
        this.LL.LLLJL.LIZJ();
        C19EG c19eg = this.LL.LLILLJJLI;
        C1660670tJh.LIZ().LIZ(this.LL.LLILLJJLI, intentLIZIZ);
        C202008142k.LIZ(c19eg, intentLIZIZ, new AwS681S0100000_32(this.LL, 24));
        return Unit.LIZ;
    }
}
