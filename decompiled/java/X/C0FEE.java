package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;

/* JADX INFO: renamed from: X.0FEE, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FEE extends AbstractC388880FMo<LyricStickerModel> {
    public final InterfaceC388760FMc LJII;

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.LYRIC_STICKER;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        LyricStickerModel lyricStickerModel = (LyricStickerModel) stickerModel;
        if (!C385630FAb.LIZJ(lyricStickerModel.getBaseStickerModel())) {
            C385630FAb.LJ(lyricStickerModel.getBaseStickerModel(), this.LJII.LJI());
        }
        return lyricStickerModel.copy(BaseStickerModel.copy$default(lyricStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), lyricStickerModel.uuid, lyricStickerModel.clipStart, lyricStickerModel.clipEnd, lyricStickerModel.musicId, lyricStickerModel.lyricId, lyricStickerModel.musicName, lyricStickerModel.lyricStyleUrs, lyricStickerModel.selectedFrom, lyricStickerModel.lyricStyleEffectId, lyricStickerModel.recommendWidth, lyricStickerModel.recommendHeight, lyricStickerModel.initialTrimInfo, lyricStickerModel.textStickerModels, lyricStickerModel.fallbackFonts, lyricStickerModel.enabled);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<LyricStickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        return new C0FEL(this.LIZ, (LyricStickerModel) stickerModel, this.LIZIZ, c0ffo, lifecycleOwner, this.LJFF);
    }

    public C0FEE(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
        this.LJII = (InterfaceC388760FMc) c390420FSm.LIZIZ(C13LE.LIZ(InterfaceC388760FMc.class));
    }
}
