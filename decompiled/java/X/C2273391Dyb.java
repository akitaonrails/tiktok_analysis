package X;

import com.ss.android.ugc.aweme.ui.experiment.FontMultipliers;
import com.ss.android.ugc.aweme.ui.experiment.PhotoModeDetailTypographyConfig;
import kotlin.Pair;

/* JADX INFO: renamed from: X.1Dyb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2273391Dyb {
    public static final C2273391Dyb LIZ = new C2273391Dyb();
    public static final PhotoModeDetailTypographyConfig LIZIZ;

    static {
        Float fValueOf = Float.valueOf(1.3f);
        FontMultipliers fontMultipliers = new FontMultipliers(fValueOf, Float.valueOf(1.36f), Float.valueOf(0.6f));
        Float fValueOf2 = Float.valueOf(1.35f);
        Float fValueOf3 = Float.valueOf(1.4f);
        Float fValueOf4 = Float.valueOf(0.7f);
        LIZIZ = new PhotoModeDetailTypographyConfig(fontMultipliers, C2097608Jq.LJIIIIZZ(new Pair("Hiragino Sans", new FontMultipliers(fValueOf2, fValueOf3, fValueOf4)), new Pair("PingFang SC", new FontMultipliers(Float.valueOf(1.45f), Float.valueOf(1.5f), Float.valueOf(0.85f))), new Pair("PingFang TC", new FontMultipliers(Float.valueOf(1.45f), Float.valueOf(1.5f), Float.valueOf(0.85f))), new Pair("PingFang HK", new FontMultipliers(Float.valueOf(1.45f), Float.valueOf(1.5f), Float.valueOf(0.85f))), new Pair("Apple SD Gothic Neo", new FontMultipliers(fValueOf, fValueOf2, fValueOf4)), new Pair("Thonburi", new FontMultipliers(fValueOf2, null, null)), new Pair("Noto Sans Myanmar", new FontMultipliers(Float.valueOf(1.7f), Float.valueOf(1.75f), null)), new Pair("Geeza Pro", new FontMultipliers(Float.valueOf(1.25f), null, null)), new Pair("Noto Nastaliq Urdu", new FontMultipliers(Float.valueOf(2.5f), null, null)), new Pair("Arial Hebrew", new FontMultipliers(Float.valueOf(1.1f), Float.valueOf(1.15f), null)), new Pair("Kohinoor Bangla", new FontMultipliers(Float.valueOf(1.2f), Float.valueOf(1.25f), null)), new Pair("Kohinoor Devanagari", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Kohinoor Telugu", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Tamil Sangam MN", new FontMultipliers(Float.valueOf(1.2f), Float.valueOf(1.25f), null)), new Pair("Kohinoor Gujarati", new FontMultipliers(Float.valueOf(1.25f), Float.valueOf(1.25f), null)), new Pair("Noto Sans Kannada", new FontMultipliers(fValueOf, fValueOf2, null)), new Pair("Kefa", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Malayalam Sangam MN", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Mukta Mahee", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Sinhala Sangam MN", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Lao Sangam MN", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Kailasa", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Noto Sans Armenian", new FontMultipliers(fValueOf2, null, null)), new Pair("Noto Sans Meetei Mayek", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null)), new Pair("Khmer Sangam MN", new FontMultipliers(Float.valueOf(1.65f), Float.valueOf(1.7f), null)), new Pair("Helvetica", new FontMultipliers(Float.valueOf(1.25f), fValueOf, null))));
    }

    public static FontMultipliers LIZ(FontMultipliers fontMultipliers, FontMultipliers fontMultipliers2) {
        if (fontMultipliers2 == null) {
            return fontMultipliers;
        }
        Float f = fontMultipliers2.headerMultiplier;
        Float f2 = null;
        if (f == null) {
            if (fontMultipliers != null) {
                f = fontMultipliers.headerMultiplier;
            } else {
                f = null;
            }
        }
        Float f3 = fontMultipliers2.bodyMultiplier;
        if (f3 == null) {
            if (fontMultipliers != null) {
                f3 = fontMultipliers.bodyMultiplier;
            } else {
                f3 = null;
            }
        }
        Float f4 = fontMultipliers2.paragraphFactor;
        if (f4 == null) {
            if (fontMultipliers != null) {
                f2 = fontMultipliers.paragraphFactor;
            }
        } else {
            f2 = f4;
        }
        return new FontMultipliers(f, f3, f2);
    }
}
