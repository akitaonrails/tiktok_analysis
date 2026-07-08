package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.sticker.StickerInfo;
import com.ss.android.ugc.effectmanager.effect.model.EffectLabel;

/* JADX INFO: renamed from: X.0Mlo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C578060Mlo {
    public final AwemeDraft LIZ;

    public final void LIZ() {
        StickerInfo stickerInfo;
        EffectLabel effectLabel;
        AVMusic aVMusic = this.LIZ.LJ;
        if (aVMusic == null) {
            return;
        }
        if (C1399570mWZ.LIZ() && aVMusic.isLoopMusic() && (stickerInfo = this.LIZ.LJJJJIZL.stickerInfo) != null && (effectLabel = stickerInfo.getEffectLabel()) != null && C1399400mWI.LIZIZ(effectLabel)) {
            C578010Mlj.LIZ = true;
        }
        MusicBuzModel musicBuzModel = this.LIZ.LIZ.musicBuzModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aVMusic.getMusicId());
        sbLIZ.append('_');
        sbLIZ.append(aVMusic.getMusicBeginTime());
        sbLIZ.append('_');
        sbLIZ.append(aVMusic.getMusicEndTime());
        sbLIZ.append('_');
        sbLIZ.append(aVMusic.getMusicStartFromCut());
        sbLIZ.append('_');
        sbLIZ.append(aVMusic.getMusicEndFromCut());
        C579120MnW.LIZ.put(C2188811AlT.LIZIZ(sbLIZ), Integer.valueOf(musicBuzModel.videoDuration));
        if (C1458070o2v.LJFF()) {
            MusicBuzModel musicBuzModel2 = this.LIZ.LIZ.musicBuzModel;
            if (musicBuzModel2.shouldMusicLoop != C1458070o2v.LJ(musicBuzModel2)) {
                C1654360t9W.LIZ = true;
            }
        }
    }

    public C578060Mlo(AwemeDraft awemeDraft) {
        this.LIZ = awemeDraft;
    }
}
