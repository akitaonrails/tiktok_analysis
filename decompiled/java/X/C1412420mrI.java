package X;

import com.ss.android.ugc.aweme.creative.model.edit.mixediting.MixEditingMaterialType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.Asset;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0mrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412420mrI {
    public static final String LIZ(C1412860ms0 c1412860ms0) {
        C1412870ms1 c1412870ms1 = C1412870ms1.LIZ;
        Asset asset = c1412860ms0.LIZ;
        c1412870ms1.getClass();
        MixEditingMaterialType mixEditingMaterialTypeLIZJ = C1412870ms1.LIZJ(asset);
        switch (C1412330mr9.LIZ[mixEditingMaterialTypeLIZJ.ordinal()]) {
            case 1:
                if (c1412860ms0.LIZ.getBusiness_extra().getMusic() != null) {
                    return "effect_music";
                }
                return "effect";
            case 2:
                return "cc_template";
            case 3:
                return "pugc_template";
            case 4:
                return "ugc_template";
            case 5:
                return "ai_template";
            case 6:
                return "aigt";
            case 7:
                return "sgt";
            case 8:
                return "sound_sync";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "lyric_rule";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
                return mixEditingMaterialTypeLIZJ.getDescription();
            default:
                return "unknown";
        }
    }
}
