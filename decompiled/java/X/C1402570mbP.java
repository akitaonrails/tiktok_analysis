package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicObject;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mbP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402570mbP {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC1403290mcZ LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZJ(videoPublishEditModel)) {
            return EnumC1403290mcZ.DEFAULT;
        }
        if (LIZIZ(videoPublishEditModel)) {
            return EnumC1403290mcZ.ENABLED;
        }
        return EnumC1403290mcZ.DISABLED;
    }

    public static boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        boolean z;
        boolean z2;
        if (videoPublishEditModel == null) {
            return false;
        }
        if ((!C1403850mdT.LJIIJJI(videoPublishEditModel) || videoPublishEditModel.getVoiceVolume() == 0.0f) && !videoPublishEditModel.hasRecord()) {
            z = false;
        } else {
            z = true;
        }
        MusicObject musicObject = videoPublishEditModel.creativeModel.musicBuzModel.music;
        if (musicObject != null && !musicObject.isPgc) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    public static boolean LIZJ(VideoPublishEditModel videoPublishEditModel) {
        if (C0CHQ.LIZ().getAccountService().LIZ() || videoPublishEditModel == null || C1428470nHB.LJJZZI(videoPublishEditModel) || videoPublishEditModel.hasSubtitle()) {
            return false;
        }
        return true;
    }
}
