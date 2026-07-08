package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.effectmanager.effect.model.AssetType;
import com.tts.oecverify.BdTuring;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mrg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412660mrg {
    public static final EnumC1394530mOR LIZ(AnchorCommonStruct anchorCommonStruct) {
        String strSubType;
        if (anchorCommonStruct != null) {
            strSubType = anchorCommonStruct.subType();
        } else {
            strSubType = null;
        }
        for (EnumC1394530mOR enumC1394530mOR : EnumC1394530mOR.values()) {
            if (Intrinsics.LJFF(enumC1394530mOR.getValue(), strSubType)) {
                return enumC1394530mOR;
            }
        }
        return null;
    }

    public static final String LIZIZ(EnumC1412640mre enumC1412640mre) {
        if (enumC1412640mre != null) {
            int i = C1412670mrh.LIZIZ[enumC1412640mre.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        if (i != 6) {
                            switch (i) {
                                case 8:
                                    return "ai_alive";
                                case BdTuring.TYPE_ECAF /* 9 */:
                                    return "ai_agent";
                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                    return "autocut_algo_lyric";
                                case BdTuring.TYPE_EMAIL /* 11 */:
                                    return "sgt";
                                default:
                                    return "";
                            }
                        }
                        return "aigt";
                    }
                    return "pugc";
                }
                return "ugc";
            }
            return "capcut";
        }
        return "";
    }

    public static final EnumC1412640mre LIZJ(int i) {
        EnumC1412640mre next;
        Iterator<EnumC1412640mre> it2 = EnumC1412640mre.getEntries().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.getValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        return next;
    }

    public static final EnumC1412640mre LIZLLL(AssetType assetType) {
        switch (C1412670mrh.LIZ[assetType.ordinal()]) {
            case 1:
                return EnumC1412640mre.CUT_SAME;
            case 2:
                return EnumC1412640mre.UGC_TEMPLATE;
            case 3:
                return EnumC1412640mre.ALGORITHM_TEMPLATE;
            case 4:
                return EnumC1412640mre.PUGC_TEMPLATE;
            case 5:
                return EnumC1412640mre.PHOTO_MODE_TEMPLATE;
            case 6:
                return EnumC1412640mre.AIGT;
            case 7:
                return EnumC1412640mre.SGT;
            case 8:
                return EnumC1412640mre.SOUND_SYNC_TEMPLATE;
            case BdTuring.TYPE_ECAF /* 9 */:
                return EnumC1412640mre.AI_ALIVE_TEMPLATE;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return EnumC1412640mre.AUTO_PICK_TEMPLATE;
            case BdTuring.TYPE_EMAIL /* 11 */:
                return EnumC1412640mre.LYRICS_RULE_TEMPLATE;
            default:
                return null;
        }
    }

    public static final EnumC1412640mre LJ(EnumC1394530mOR enumC1394530mOR) {
        if (enumC1394530mOR == null) {
            return null;
        }
        switch (C1412670mrh.LIZJ[enumC1394530mOR.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return EnumC1412640mre.UGC_TEMPLATE;
            case 4:
                return EnumC1412640mre.PUGC_TEMPLATE;
            case 5:
                return EnumC1412640mre.CUT_SAME;
            case 6:
                return EnumC1412640mre.AIGT;
            case 7:
                return EnumC1412640mre.SGT;
            default:
                throw new C1954807lC();
        }
    }
}
