package Y;

import X.AbstractC1532320pyg;
import X.C1474690oTj;
import X.C1484420ojQ;
import X.C1489000oqo;
import X.C1527020pq8;
import X.C1527130pqJ;
import X.C20085613iQ;
import X.C443120HZe;
import X.EnumC1469010oKZ;
import X.InterfaceC1472290oPr;
import X.InterfaceC1477220oXo;
import X.InterfaceC1489340orM;
import android.util.Pair;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.geckox.policy.meta.file.FileMetaDataItem;
import com.ss.android.ugc.aweme.social.creation.api.mediapicker.exp.SocialAlbumColorExtractionConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tablet.impl.experiment.TabletFastForwardRewindConfigurationAB;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes24.dex */
public class AComparatorS42S0000000_23 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            case 2:
                return compare$2(this, obj, obj2);
            case 3:
                return compare$3(this, obj, obj2);
            case 4:
                return compare$4(this, obj, obj2);
            case 5:
                return compare$5(this, obj, obj2);
            case 6:
                return compare$6(this, obj, obj2);
            case 7:
                return compare$7(this, obj, obj2);
            case 8:
                return compare$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, obj, obj2);
            case 14:
                return compare$14(this, obj, obj2);
            case 15:
                return compare$15(this, obj, obj2);
            case 16:
                return compare$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, obj, obj2);
            case 19:
                return compare$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, obj, obj2);
            case 21:
                return compare$21(this, obj, obj2);
            case 22:
                return compare$22(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS42S0000000_23(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((SimBitRate) ((Pair) obj2).second).getBitRate() - ((SimBitRate) ((Pair) obj).second).getBitRate();
    }

    public static final int compare$1(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((String) obj).compareTo((String) obj2);
    }

    public static final int compare$10(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((EnumC1469010oKZ) ((Map.Entry) obj).getKey()).ordinal() - ((EnumC1469010oKZ) ((Map.Entry) obj2).getKey()).ordinal();
    }

    public static final int compare$11(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((EnumC1469010oKZ) ((Map.Entry) obj).getKey()).ordinal() - ((EnumC1469010oKZ) ((Map.Entry) obj2).getKey()).ordinal();
    }

    public static final int compare$12(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        InterfaceC1472290oPr interfaceC1472290oPr = (InterfaceC1472290oPr) obj;
        InterfaceC1472290oPr interfaceC1472290oPr2 = (InterfaceC1472290oPr) obj2;
        if (interfaceC1472290oPr.getOrder() == interfaceC1472290oPr2.getOrder()) {
            return 0;
        }
        if (interfaceC1472290oPr.getOrder() > interfaceC1472290oPr2.getOrder()) {
            return -1;
        }
        return 1;
    }

    public static final int compare$13(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1474690oTj) obj2).LIZIZ), Integer.valueOf(((C1474690oTj) obj).LIZIZ));
    }

    public static final int compare$14(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        int iLJI;
        AbstractC1532320pyg abstractC1532320pyg;
        AbstractC1532320pyg abstractC1532320pyg2;
        C443120HZe c443120HZe = (C443120HZe) ((kotlin.Pair) obj).getSecond();
        int iLJI2 = Integer.MAX_VALUE;
        if (c443120HZe != null && (abstractC1532320pyg2 = (AbstractC1532320pyg) c443120HZe.getFirst()) != null) {
            iLJI = abstractC1532320pyg2.LJI();
        } else {
            iLJI = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iLJI);
        C443120HZe c443120HZe2 = (C443120HZe) ((kotlin.Pair) obj2).getSecond();
        if (c443120HZe2 != null && (abstractC1532320pyg = (AbstractC1532320pyg) c443120HZe2.getFirst()) != null) {
            iLJI2 = abstractC1532320pyg.LJI();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iLJI2));
    }

    public static final int compare$15(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1527020pq8) obj).ref_cursor, ((C1527020pq8) obj2).ref_cursor);
    }

    public static final int compare$16(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1527130pqJ) obj).cursor.cursor, ((C1527130pqJ) obj2).cursor.cursor);
    }

    public static final int compare$17(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1527020pq8) obj).ref_cursor, ((C1527020pq8) obj2).ref_cursor);
    }

    public static final int compare$18(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1527020pq8) obj).ref_cursor, ((C1527020pq8) obj2).ref_cursor);
    }

    public static final int compare$19(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1527130pqJ) obj).cursor.cursor, ((C1527130pqJ) obj2).cursor.cursor);
    }

    public static final int compare$2(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((FileMetaDataItem) ((Map.Entry) obj).getValue()).getSortOrder()), Integer.valueOf(((FileMetaDataItem) ((Map.Entry) obj2).getValue()).getSortOrder()));
    }

    public static final int compare$20(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1489000oqo) obj).LIZIZ), Integer.valueOf(((C1489000oqo) obj2).LIZIZ));
    }

    public static final int compare$21(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Float.valueOf(((SocialAlbumColorExtractionConfig.Range) obj2).threshold), Float.valueOf(((SocialAlbumColorExtractionConfig.Range) obj).threshold));
    }

    public static final int compare$22(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1489340orM) obj).getType().getOrder()), Integer.valueOf(((InterfaceC1489340orM) obj2).getType().getOrder()));
    }

    public static final int compare$3(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((C1484420ojQ) obj).LIZIZ.compareTo(((C1484420ojQ) obj2).LIZIZ);
    }

    public static final int compare$4(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((SimBitRate) obj2).getBitRate() - ((SimBitRate) obj).getBitRate();
    }

    public static final int compare$5(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((SimBitRate) obj2).getBitRate() - ((SimBitRate) obj).getBitRate();
    }

    public static final int compare$6(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((TabletFastForwardRewindConfigurationAB.TabletFastForwardRewindConfigurationItem) obj).awemeDurationThresholdMs), Long.valueOf(((TabletFastForwardRewindConfigurationAB.TabletFastForwardRewindConfigurationItem) obj2).awemeDurationThresholdMs));
    }

    public static final int compare$7(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        int i = ((SimBitRate) obj).bitRate;
        int i2 = ((SimBitRate) obj2).bitRate;
        if (i > i2) {
            return -1;
        }
        if (i < i2) {
            return 1;
        }
        return 0;
    }

    public static final int compare$8(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        InterfaceC1477220oXo interfaceC1477220oXo = (InterfaceC1477220oXo) obj;
        InterfaceC1477220oXo interfaceC1477220oXo2 = (InterfaceC1477220oXo) obj2;
        if (interfaceC1477220oXo != null && interfaceC1477220oXo2 != null) {
            return interfaceC1477220oXo.getSize() - interfaceC1477220oXo2.getSize();
        }
        return 0;
    }

    public static final int compare$9(AComparatorS42S0000000_23 aComparatorS42S0000000_23, Object obj, Object obj2) {
        return ((SimBitRate) ((Pair) obj2).second).getBitRate() - ((SimBitRate) ((Pair) obj).second).getBitRate();
    }
}
