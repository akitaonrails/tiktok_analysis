package X;

import android.net.Uri;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.performance.core.config.SearchResultPictureSrExperiment;

/* JADX INFO: renamed from: X.0PrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C657910PrJ {
    public static void LIZ(Uri uri, ImageUrlModel imageUrlModel, SmartImageView smartImageView, TuxIconDrawable tuxIconDrawable, int i, int i2, String str, int i3, Aweme aweme, Integer num, C689680R3m c689680R3m, C655510PnR c655510PnR, String str2, int i4) {
        C1331670kl3 c1331670kl3LJIIIIZZ;
        int i5 = i;
        TuxIconDrawable tuxIconDrawable2 = tuxIconDrawable;
        SmartImageView smartImageView2 = smartImageView;
        C655510PnR c655510PnR2 = c655510PnR;
        C689680R3m c689680R3m2 = c689680R3m;
        Integer num2 = num;
        Aweme aweme2 = aweme;
        int i6 = i3;
        String str3 = str;
        int i7 = i2;
        String str4 = null;
        if ((i4 & 1) != 0) {
            uri = null;
        }
        if ((i4 & 2) != 0) {
            imageUrlModel = null;
        }
        if ((i4 & 4) != 0) {
            smartImageView2 = null;
        }
        if ((i4 & 8) != 0) {
            tuxIconDrawable2 = null;
        }
        boolean z = false;
        if ((i4 & 16) != 0) {
            i5 = 0;
        }
        if ((i4 & 32) != 0) {
            i7 = 0;
        }
        if ((i4 & 64) != 0) {
            str3 = "";
        }
        if ((i4 & 128) != 0) {
            i6 = 0;
        }
        if ((i4 & 256) != 0) {
            aweme2 = null;
        }
        if ((i4 & 512) != 0) {
            num2 = 0;
        }
        if ((i4 & 1024) != 0) {
            z = true;
        }
        if ((i4 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            c689680R3m2 = null;
        }
        if ((i4 & 8192) != 0) {
            c655510PnR2 = null;
        }
        if ((i4 & 16384) == 0) {
            str4 = str2;
        }
        if (smartImageView2 != null) {
            if (uri != null) {
                c1331670kl3LJIIIIZZ = C1331660kl2.LJI(uri);
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
            } else {
                if (imageUrlModel == null) {
                    return;
                }
                c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(imageUrlModel);
                c1331670kl3LJIIIIZZ.LJJ(smartImageView2);
            }
            if (str4 != null) {
                c1331670kl3LJIIIIZZ.LIZLLL(str4);
            }
            if (i5 != 0 && i7 != 0) {
                c1331670kl3LJIIIIZZ.LJIIIIZZ = i5;
                c1331670kl3LJIIIIZZ.LJIIIZ = i7;
            }
            if (tuxIconDrawable2 != null) {
                c1331670kl3LJIIIIZZ.LJIL(tuxIconDrawable2);
            }
            c1331670kl3LJIIIIZZ.LJJJIL = new C658730Psd(i6, aweme2, num2, str3, false, SearchResultPictureSrExperiment.LIZ(), 2, c655510PnR2, false, 768);
            if (z) {
                if (c689680R3m2 != null) {
                    c1331670kl3LJIIIIZZ.LJIIL(c689680R3m2);
                    return;
                } else {
                    c1331670kl3LJIIIIZZ.LJIIJJI();
                    return;
                }
            }
            if (c689680R3m2 != null) {
                c1331670kl3LJIIIIZZ.LJIIJ(c689680R3m2);
            } else {
                C786410Ut5.h3(c1331670kl3LJIIIIZZ);
            }
        }
    }
}
