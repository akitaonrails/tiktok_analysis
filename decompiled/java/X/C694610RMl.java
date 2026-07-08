package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.music.model.CelebrationMetaData;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.effect.StoryUseThisEffectComponent;
import com.ss.android.ugc.aweme.story.feed.immersive.component.bottombutton.sound.StoryUseSoundComponent;

/* JADX INFO: renamed from: X.0RMl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694610RMl {
    public static boolean LIZ(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        CelebrationMetaData celebrationMetaData;
        CelebrationMetaData celebrationMetaData2;
        Integer num;
        if (C729510SjV.LJIJ(videoItemParams.getAweme())) {
            return false;
        }
        Aweme aweme = videoItemParams.getAweme();
        if (C729510SjV.LJJ(aweme) && aweme != null && (celebrationMetaData = aweme.getCelebrationMetaData()) != null && celebrationMetaData.celebrationType != null) {
            Aweme aweme2 = videoItemParams.getAweme();
            if (!C729510SjV.LJJ(aweme2) || aweme2 == null || (celebrationMetaData2 = aweme2.getCelebrationMetaData()) == null || (num = celebrationMetaData2.celebrationType) == null || num.intValue() != 2) {
                return false;
            }
        }
        if (C694840RNi.LIZJ(videoItemParams, c690870R8b) || C693810RJj.LIZ(videoItemParams) || C694880RNm.LIZIZ(videoItemParams) || C562450M4d.LIZIZ(videoItemParams)) {
            return false;
        }
        int i = StoryUseThisEffectComponent.LLLFZ;
        if (C0S21.LIZ(videoItemParams.getAweme()) || C692230RDh.LIZ(videoItemParams) || C695000RNy.LIZ(videoItemParams, c690870R8b) || C1256900ioS.LIZ(videoItemParams, c690870R8b) || C729510SjV.LJJIJ(videoItemParams.getAweme())) {
            return false;
        }
        int i2 = StoryUseSoundComponent.LLLFFI;
        if (C0RN0.LIZ(videoItemParams) || C445560Hda.LIZ(videoItemParams)) {
            return false;
        }
        return true;
    }
}
