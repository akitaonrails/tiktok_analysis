package X;

import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;

/* JADX INFO: renamed from: X.0XhG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855520XhG extends C855530XhH {
    public final boolean LIZ;

    @Override // X.C855530XhH
    public final int LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_max_publish_title_length_for_photo_mode", true) > 0 ? C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_max_publish_title_length_for_photo_mode", true) : C0C64.LJIILLIIL().LJIJ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 2 ? DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL : C0C64.LJIILLIIL().LJIJ(31744, 0, "expand_the_character_limit_of_video_caption_from_150_to_500", true) == 3 ? 500 : 150;
    }

    @Override // X.C855530XhH
    public final boolean LIZ() {
        return this.LIZ;
    }

    public C855520XhG(boolean z) {
        this.LIZ = z;
    }
}
