package X;

import com.ss.android.ugc.aweme.music.model.DspPlatform;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0P2V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P2V {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
    
        if (r1.equals("YT Music") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        if (r1.equals("YouTube Music") == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0078, code lost:
    
        return com.ss.android.ugc.aweme.music.model.DspPlatform.YOUTUBE_MUSIC;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.music.model.DspPlatform LIZ(java.lang.String r1) {
        /*
            if (r1 == 0) goto L9
            int r0 = r1.hashCode()
            switch(r0) {
                case -1836394231: goto Lc;
                case -1276961600: goto L17;
                case -334070118: goto L20;
                case 67749655: goto L2b;
                case 74227347: goto L36;
                case 395387592: goto L41;
                case 805721359: goto L4a;
                case 1624920710: goto L55;
                case 2030490015: goto L60;
                case 2043187267: goto L6b;
                default: goto L9;
            }
        L9:
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.UNKNOWN
            return r0
        Lc:
            java.lang.String r0 = "Amazon Music"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.AMAZON_MUSIC
            return r0
        L17:
            java.lang.String r0 = "YT Music"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L76
            goto L9
        L20:
            java.lang.String r0 = "Spotify"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.SPOTIFY
            return r0
        L2b:
            java.lang.String r0 = "TikTok My Music"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.TIKTOK_MY_MUSIC
            return r0
        L36:
            java.lang.String r0 = "Melon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.MELON
            return r0
        L41:
            java.lang.String r0 = "YouTube Music"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L76
            goto L9
        L4a:
            java.lang.String r0 = "Anghami"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.ANGHAMI
            return r0
        L55:
            java.lang.String r0 = "SoundCloud"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.SOUND_CLOUD
            return r0
        L60:
            java.lang.String r0 = "Apple Music"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.APPLE_MUSIC
            return r0
        L6b:
            java.lang.String r0 = "Deezer"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L9
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.DEEZER
            return r0
        L76:
            com.ss.android.ugc.aweme.music.model.DspPlatform r0 = com.ss.android.ugc.aweme.music.model.DspPlatform.YOUTUBE_MUSIC
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0P2V.LIZ(java.lang.String):com.ss.android.ugc.aweme.music.model.DspPlatform");
    }

    public static String LIZIZ(DspPlatform dspPlatform) {
        switch (C0P2W.LIZ[dspPlatform.ordinal()]) {
            case 1:
                return "";
            case 2:
                return "Apple Music";
            case 3:
                return "Amazon Music";
            case 4:
                return "Spotify";
            case 5:
                return "TikTok My Music";
            case 6:
                return "Melon";
            case 7:
                return "Deezer";
            case 8:
                return "SoundCloud";
            case BdTuring.TYPE_ECAF /* 9 */:
                if (((Boolean) C0ANO.LIZ.getValue()).booleanValue()) {
                    return "YT Music";
                }
                return "YouTube Music";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "Anghami";
            default:
                throw new C1954807lC();
        }
    }
}
