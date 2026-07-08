package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0S61, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S61 {
    public static final String LIZ(EnumC715590S5d enumC715590S5d) {
        int i;
        if (enumC715590S5d == null) {
            i = -1;
        } else {
            i = C715600S5e.LIZ[enumC715590S5d.ordinal()];
        }
        switch (i) {
            case -1:
            case 8:
                return "unknown";
            case 0:
            default:
                throw new C1954807lC();
            case 1:
                return "click_see_translation";
            case 2:
                return "translation_toggle_master";
            case 3:
                return "translation_toggle_sticker";
            case 4:
                return "translation_toggle_dnt";
            case 5:
                return "translation_toggle_target_language";
            case 6:
                return "land_on_item";
            case 7:
                return "translation_toggle_caption";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "auto_translation_toggle_dm";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "commerce_lynx_component_jsb";
        }
    }
}
