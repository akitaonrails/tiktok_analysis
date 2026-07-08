package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.tools.sticker.core.BaseStickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.aweme.tools.sticker.core.music.MusicStickerModel;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11pf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19620911pf extends AbstractC388880FMo<MusicStickerModel> {
    @Override // X.AbstractC388880FMo
    public final void LJI(C0FTJ c0ftj, C388340FKm c388340FKm, C390370FSh c390370FSh, String str, Function1 function1) {
    }

    @Override // X.AbstractC388880FMo
    public final EnumC1466150oFx LIZLLL() {
        return EnumC1466150oFx.MUSIC_STICKER;
    }

    @Override // X.AbstractC388880FMo
    public final StickerModel LIZJ(StickerModel stickerModel, int i) {
        MusicStickerModel musicStickerModel = (MusicStickerModel) stickerModel;
        return musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), i, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, false, 0.0f, null, null, null, false, -2, 15, null), false, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom);
    }

    @Override // X.AbstractC388880FMo
    public final C0FFE<StickerModel> LIZ(StickerModel stickerModel, C0FFO c0ffo, LifecycleOwner lifecycleOwner) {
        MusicStickerModel musicStickerModel = (MusicStickerModel) stickerModel;
        return new C19620811pe(this.LIZ, musicStickerModel.copy(BaseStickerModel.copy$default(musicStickerModel.getBaseStickerModel(), 0, 0, null, 0, 0, 0.0f, 0.0f, 0, 0, 0, 0, 0, 0, 0, 0, false, null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, false, 0.0f, 0.0f, true, 0.0f, null, null, null, false, -1073741825, 15, null), true, musicStickerModel.editable, musicStickerModel.clickable, musicStickerModel.musicId, musicStickerModel.artistName, musicStickerModel.title, musicStickerModel.cover, musicStickerModel.isPGC, musicStickerModel.stickerStyle, musicStickerModel.musicStickerFrom), this.LIZIZ, c0ffo, lifecycleOwner, this.LJFF);
    }

    public C19620911pf(Context context, FrameLayout frameLayout, FrameLayout frameLayout2, LifecycleOwner lifecycleOwner, C0FUH c0fuh, C390420FSm c390420FSm) {
        super(context, frameLayout, frameLayout2, lifecycleOwner, c0fuh, c390420FSm);
    }
}
