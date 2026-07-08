package X;

import com.ss.android.ugc.aweme.social.creation.api.mediapicker.exp.MainColorConfig;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.exp.SocialAlbumColorExtractionConfig;

/* JADX INFO: renamed from: X.144V, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C144V {
    public static final SocialAlbumColorExtractionConfig LIZ;

    static {
        MainColorConfig mainColorConfig = new MainColorConfig(0.0f, 0.0f, 1.0f, 1.0f, 6, 0.0f, 0.0f, 0.4f, 0.0f, 1.0f, 0.0f);
        Float fValueOf = Float.valueOf(-0.1f);
        SocialAlbumColorExtractionConfig.Range.Rule[] ruleArr = {new SocialAlbumColorExtractionConfig.Range.Rule(null, null, null), new SocialAlbumColorExtractionConfig.Range.Rule(fValueOf, null, null)};
        Float fValueOf2 = Float.valueOf(0.1f);
        Float fValueOf3 = Float.valueOf(0.18f);
        LIZ = new SocialAlbumColorExtractionConfig(mainColorConfig, C1697810uHb.LJIIJJI(new SocialAlbumColorExtractionConfig.Range("lightness", 0.88f, C1697810uHb.LJIIJJI(ruleArr)), new SocialAlbumColorExtractionConfig.Range("lightness", 0.18f, C1697810uHb.LJIIJJI(new SocialAlbumColorExtractionConfig.Range.Rule(fValueOf2, Float.valueOf(0.88f), null), new SocialAlbumColorExtractionConfig.Range.Rule(fValueOf, null, fValueOf3))), new SocialAlbumColorExtractionConfig.Range("lightness", 0.0f, C1697810uHb.LJIIJJI(new SocialAlbumColorExtractionConfig.Range.Rule(fValueOf2, null, null), new SocialAlbumColorExtractionConfig.Range.Rule(null, null, fValueOf3)))));
    }
}
