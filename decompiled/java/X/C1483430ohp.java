package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.video.TranslatedVideo;

/* JADX INFO: renamed from: X.0ohp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1483430ohp {
    public static final /* synthetic */ int LIZ = 0;

    public static final C1479890oc7 LIZ(Aweme aweme, String str) {
        String originUri;
        String originUri2;
        VideoUrlModel playAddr;
        Video video;
        VideoUrlModel playAddr2;
        String originUri3;
        String originUri4;
        VideoUrlModel playAddr3;
        Video video2;
        VideoUrlModel playAddr4;
        String languageCode = null;
        if (aweme != null) {
            C1479890oc7 c1479890oc7LJ = C20702715zl.LJ(aweme);
            if (c1479890oc7LJ != null) {
                aweme.setIsPlayingTranslatedVideo(c1479890oc7LJ.LIZLLL);
                if (aweme.getTranslatedVideo() != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mayConfigToPlayTranslatedVideo: enterFrom=");
                    sbLIZ.append(str);
                    sbLIZ.append(", playDubbing=");
                    sbLIZ.append(aweme.getIsPlayingTranslatedVideo());
                    sbLIZ.append(", translUri=");
                    TranslatedVideo translatedVideo = aweme.getTranslatedVideo();
                    if (translatedVideo != null && (video2 = translatedVideo.getVideo()) != null && (playAddr4 = video2.getPlayAddr()) != null) {
                        originUri3 = playAddr4.getOriginUri();
                    } else {
                        originUri3 = null;
                    }
                    sbLIZ.append(originUri3);
                    sbLIZ.append(", originUri=");
                    Video originalVideo = aweme.getOriginalVideo();
                    if (originalVideo != null && (playAddr3 = originalVideo.getPlayAddr()) != null) {
                        originUri4 = playAddr3.getOriginUri();
                    } else {
                        originUri4 = null;
                    }
                    sbLIZ.append(originUri4);
                    sbLIZ.append(", translLang=");
                    TranslatedVideo translatedVideo2 = aweme.getTranslatedVideo();
                    if (translatedVideo2 != null) {
                        languageCode = translatedVideo2.getLanguageCode();
                    }
                    sbLIZ.append(languageCode);
                    sbLIZ.append(", targetLang=");
                    sbLIZ.append(c1479890oc7LJ.LJ);
                    sbLIZ.append(", aid=");
                    sbLIZ.append(aweme.getAid());
                    C2188811AlT.LIZIZ(sbLIZ);
                    return c1479890oc7LJ;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("mayConfigToPlayTranslatedVideo: enterFrom=");
                sbLIZ2.append(str);
                sbLIZ2.append(", playDubbing=");
                sbLIZ2.append(aweme.getIsPlayingTranslatedVideo());
                sbLIZ2.append(", translUri=");
                TranslatedVideo translatedVideo3 = aweme.getTranslatedVideo();
                if (translatedVideo3 != null && (video = translatedVideo3.getVideo()) != null && (playAddr2 = video.getPlayAddr()) != null) {
                    originUri = playAddr2.getOriginUri();
                } else {
                    originUri = null;
                }
                sbLIZ2.append(originUri);
                sbLIZ2.append(", originUri=");
                Video originalVideo2 = aweme.getOriginalVideo();
                if (originalVideo2 != null && (playAddr = originalVideo2.getPlayAddr()) != null) {
                    originUri2 = playAddr.getOriginUri();
                } else {
                    originUri2 = null;
                }
                sbLIZ2.append(originUri2);
                sbLIZ2.append(", translLang=");
                TranslatedVideo translatedVideo4 = aweme.getTranslatedVideo();
                if (translatedVideo4 != null) {
                    languageCode = translatedVideo4.getLanguageCode();
                }
                sbLIZ2.append(languageCode);
                sbLIZ2.append(", targetLang=");
                sbLIZ2.append(c1479890oc7LJ.LJ);
                sbLIZ2.append(", aid=");
                sbLIZ2.append(aweme.getAid());
                C2188811AlT.LIZIZ(sbLIZ2);
                return c1479890oc7LJ;
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("mayConfigToPlayTranslatedVideo: enterFrom=");
            sbLIZ3.append(str);
            sbLIZ3.append(", config is null");
            C2188811AlT.LIZIZ(sbLIZ3);
        }
        return null;
    }
}
