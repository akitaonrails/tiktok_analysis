package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.0mrd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412630mrd {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(Integer num) {
        int value = EnumC1412640mre.PUGC_TEMPLATE.getValue();
        if (num == null || num.intValue() != value) {
            int value2 = EnumC1412640mre.UGC_TEMPLATE.getValue();
            if (num == null || num.intValue() != value2) {
                int value3 = EnumC1412640mre.SGT.getValue();
                if (num != null && num.intValue() == value3) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer LIZIZ(String str) {
        if (str == null) {
            return null;
        }
        switch (str.hashCode()) {
            case -1367664336:
                if (!str.equals("capcut")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.CUT_SAME.getValue());
            case -1234810378:
                if (!str.equals("ai_alive")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.AI_ALIVE_TEMPLATE.getValue());
            case -578367524:
                if (!str.equals("pic_ugc")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.PHOTO_MODE_TEMPLATE.getValue());
            case 113824:
                if (!str.equals("sgt")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.SGT.getValue());
            case 115729:
                if (!str.equals("ugc")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.UGC_TEMPLATE.getValue());
            case 2993941:
                if (!str.equals("aigt")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.AIGT.getValue());
            case 3452321:
                if (!str.equals("pugc")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.PUGC_TEMPLATE.getValue());
            case 376490207:
                if (!str.equals("autocut_algo")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.ALGORITHM_TEMPLATE.getValue());
            case 495938815:
                if (!str.equals("autocut_algo_lyric")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.LYRICS_RULE_TEMPLATE.getValue());
            case 1534141573:
                if (!str.equals("mv_inhouse")) {
                    return null;
                }
                return Integer.valueOf(EnumC1412640mre.MV_TEMPLATE.getValue());
            default:
                return null;
        }
    }

    public static final String LIZJ(EnumC1412600mra enumC1412600mra) {
        int i = C1412620mrc.LIZIZ[enumC1412600mra.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "slideshow";
                    }
                    throw new C1954807lC();
                }
                return "effect_music";
            }
            return "effect";
        }
        return "sound_sync";
    }

    public static final String LIZLLL(EnumC1412640mre enumC1412640mre) {
        switch (C1412620mrc.LIZ[enumC1412640mre.ordinal()]) {
            case 1:
                return "mv_inhouse";
            case 2:
                return "capcut";
            case 3:
                return "pugc";
            case 4:
                return "ugc";
            case 5:
                return "pic_ugc";
            case 6:
            case 7:
                return "autocut_algo";
            case 8:
                return "aigt";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "sgt";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "ai_alive";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "ai_agent";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "autocut_algo_lyric";
            default:
                return "";
        }
    }
}
