package Y;

import X.C1020880cfm;
import X.C1045260dJ6;
import X.C1046610dLH;
import X.C1049830dQT;
import X.C20085613iQ;
import X.EnumC1070050dx5;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.commercialize.chatagent.startup.protocol.ICommerceAgentProcessorProtocol;
import com.ss.android.ugc.aweme.ecommerce.smartcheck.core.ISmartCheckService;
import com.ss.android.ugc.aweme.history.model.AdWebHistoryEntity;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;

/* JADX INFO: loaded from: classes17.dex */
public class AComparatorS35S0000000_16 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS35S0000000_16(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((EnumC1070050dx5) obj).ordinal()), Integer.valueOf(((EnumC1070050dx5) obj2).ordinal()));
    }

    public static final int compare$1(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1020880cfm) obj).LIZ), Integer.valueOf(((C1020880cfm) obj2).LIZ));
    }

    public static final int compare$10(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1046610dLH) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1046610dLH) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$11(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1046610dLH) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1046610dLH) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$12(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1045260dJ6) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1045260dJ6) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$13(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1045260dJ6) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1045260dJ6) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$14(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1045260dJ6) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1045260dJ6) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$15(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1045260dJ6) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1045260dJ6) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$16(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1045260dJ6) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1045260dJ6) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$17(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1045260dJ6) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1045260dJ6) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$18(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((ISmartCheckService) obj).getServiceInfo().LIZIZ, ((ISmartCheckService) obj2).getServiceInfo().LIZIZ);
    }

    public static final int compare$2(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((ICommerceAgentProcessorProtocol) obj).getPriority()), Integer.valueOf(((ICommerceAgentProcessorProtocol) obj2).getPriority()));
    }

    public static final int compare$3(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return ((C1049830dQT) obj).LIZJ.optInt("order", 0) - ((C1049830dQT) obj2).LIZJ.optInt("order", 0);
    }

    public static final int compare$4(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return Integer.compare(((int[]) obj)[0], ((int[]) obj2)[0]);
    }

    public static final int compare$5(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        Long l;
        AdWebHistoryEntity adWebHistoryEntity = (AdWebHistoryEntity) obj2;
        Long l2 = null;
        if (adWebHistoryEntity != null) {
            l = adWebHistoryEntity.requestTime;
        } else {
            l = null;
        }
        AdWebHistoryEntity adWebHistoryEntity2 = (AdWebHistoryEntity) obj;
        if (adWebHistoryEntity2 != null) {
            l2 = adWebHistoryEntity2.requestTime;
        }
        return C20085613iQ.LIZIZ(l, l2);
    }

    public static final int compare$6(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1046610dLH) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1046610dLH) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$7(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1046610dLH) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1046610dLH) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$8(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1046610dLH) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1046610dLH) obj2).byWrapper ? 1 : 0));
    }

    public static final int compare$9(AComparatorS35S0000000_16 aComparatorS35S0000000_16, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1046610dLH) obj).byWrapper ? 1 : 0), Integer.valueOf(((C1046610dLH) obj2).byWrapper ? 1 : 0));
    }
}
