package Y;

import X.AbstractC1563960qni;
import X.C1565830qqj;
import X.C1586870rOf;
import X.C1590430rUP;
import X.C1673800tes;
import X.C1849807Mi;
import X.C1AHN;
import X.C20085613iQ;
import X.C2176541AGe;
import X.C2252061DCq;
import X.EnumC1583960rJy;
import X.InterfaceC1594550rb3;
import X.InterfaceC1622080sJS;
import X.InterfaceC1790610whH;
import X.InterfaceC1855990yOj;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.touchpoint.api.model.GameplayCard;
import com.ss.android.ugc.aweme.feed.model.live.DeletedLiveInfo;
import com.ss.android.ugc.aweme.friendstab.model.ContentMetadata;
import com.ss.android.ugc.aweme.friendstab.model.FriendsRedDotUser;
import com.ss.android.ugc.aweme.friendstab.model.UserNewContent;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.cbi.Element;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.startup.protocol.ITakoProcessorProtocol;
import com.ss.android.ugc.feed.platform.panel.IPanelComponentRegistrar;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public class AComparatorS43S0000000_24 implements Comparator {
    public final int $t;

    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, t, t2);
            case 1:
                return compare$1(this, t, t2);
            case 2:
                return compare$2(this, t, t2);
            case 3:
                return compare$3(this, t, t2);
            case 4:
                return compare$4(this, t, t2);
            case 5:
                return compare$5(this, t, t2);
            case 6:
                return compare$6(this, t, t2);
            case 7:
                return compare$7(this, t, t2);
            case 8:
                return compare$8(this, t, t2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return compare$9(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return compare$10(this, t, t2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return compare$11(this, t, t2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return compare$12(this, t, t2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return compare$13(this, t, t2);
            case 14:
                return compare$14(this, t, t2);
            case 15:
                return compare$15(this, t, t2);
            case 16:
                return compare$16(this, t, t2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return compare$17(this, t, t2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return compare$18(this, t, t2);
            case 19:
                return compare$19(this, t, t2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return compare$20(this, t, t2);
            case 21:
                return compare$21(this, t, t2);
            case 22:
                return compare$22(this, t, t2);
            case 23:
                return compare$23(this, t, t2);
            default:
                return 0;
        }
    }

    public AComparatorS43S0000000_24(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        List<String> list = C1849807Mi.LIZ;
        ((InterfaceC1594550rb3) obj).LIZ();
        Integer numValueOf = Integer.valueOf(list.indexOf("image_search"));
        ((InterfaceC1594550rb3) obj2).LIZ();
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(list.indexOf("image_search")));
    }

    public static final int compare$1(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1673800tes) obj2).LJII), Integer.valueOf(((C1673800tes) obj).LJII));
    }

    public static final int compare$10(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C2252061DCq) obj2).LJJIIZI, ((C2252061DCq) obj).LJJIIZI);
    }

    public static final int compare$11(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C2252061DCq) obj2).LJJIIZI, ((C2252061DCq) obj).LJJIIZI);
    }

    public static final int compare$12(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((GameplayCard) obj).index, ((GameplayCard) obj2).index);
    }

    public static final int compare$13(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C2176541AGe) obj).LJFF), Long.valueOf(((C2176541AGe) obj2).LJFF));
    }

    public static final int compare$14(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((Element) obj).displayOrder, ((Element) obj2).displayOrder);
    }

    public static final int compare$15(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((Element) obj).displayOrder, ((Element) obj2).displayOrder);
    }

    public static final int compare$16(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        float f;
        FriendsRedDotUser user = ((UserNewContent) obj2).getUser();
        float f2 = 0.0f;
        if (user != null) {
            f = user.affinityScore;
        } else {
            f = 0.0f;
        }
        Float fValueOf = Float.valueOf(f);
        FriendsRedDotUser user2 = ((UserNewContent) obj).getUser();
        if (user2 != null) {
            f2 = user2.affinityScore;
        }
        return C20085613iQ.LIZIZ(fValueOf, Float.valueOf(f2));
    }

    public static final int compare$17(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((EnumC1583960rJy) obj).getIndex()), Integer.valueOf(((EnumC1583960rJy) obj2).getIndex()));
    }

    public static final int compare$18(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1AHN) obj).LIZLLL), Integer.valueOf(((C1AHN) obj2).LIZLLL));
    }

    public static final int compare$19(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((IPluginService.NUStrategy) obj2).strategyId), Long.valueOf(((IPluginService.NUStrategy) obj).strategyId));
    }

    public static final int compare$2(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(-((DeletedLiveInfo) obj).reverseIndex), Long.valueOf(-((DeletedLiveInfo) obj2).reverseIndex));
    }

    public static final int compare$20(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map.Entry) obj).getValue(), (Integer) ((Map.Entry) obj2).getValue());
    }

    public static final int compare$21(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1855990yOj) obj).gl()), Integer.valueOf(((InterfaceC1855990yOj) obj2).gl()));
    }

    public static final int compare$22(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1790610whH) obj).getPriority()), Integer.valueOf(((InterfaceC1790610whH) obj2).getPriority()));
    }

    public static final int compare$23(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        ArrayList<String> arrayList = C1586870rOf.LIZ;
        return C20085613iQ.LIZIZ(Integer.valueOf(arrayList.indexOf(((ContentMetadata) obj).itemId)), Integer.valueOf(arrayList.indexOf(((ContentMetadata) obj2).itemId)));
    }

    public static final int compare$3(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC1563960qni) obj).LIZ), Integer.valueOf(((AbstractC1563960qni) obj2).LIZ));
    }

    public static final int compare$4(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return ((C1590430rUP) obj).LJ - ((C1590430rUP) obj2).LJ;
    }

    public static final int compare$5(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((C1565830qqj) obj).LIZ, (Float) ((C1565830qqj) obj2).LIZ);
    }

    public static final int compare$6(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((C1565830qqj) obj).LIZ, (Integer) ((C1565830qqj) obj2).LIZ);
    }

    public static final int compare$7(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1622080sJS) obj2).getPriority()), Integer.valueOf(((InterfaceC1622080sJS) obj).getPriority()));
    }

    public static final int compare$8(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((IPanelComponentRegistrar) obj).getOrder()), Integer.valueOf(((IPanelComponentRegistrar) obj2).getOrder()));
    }

    public static final int compare$9(AComparatorS43S0000000_24 aComparatorS43S0000000_24, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((ITakoProcessorProtocol) obj).getPriority()), Integer.valueOf(((ITakoProcessorProtocol) obj2).getPriority()));
    }
}
