package Y;

import X.C0K51;
import X.C0KBS;
import X.C20085613iQ;
import X.C465120ILu;
import X.C510480K0g;
import com.bytedance.android.live.base.model.LiveSurveyState;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePriceInfo;
import com.bytedance.android.livesdk.chatroom.api.SubPackagePrivilege;
import com.bytedance.android.livesdk.chatroom.api.SubPackageSummary;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.NotConsumeControlsModel;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes8.dex */
public class AComparatorS26S0000000_7 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS26S0000000_7(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C465120ILu) ((Pair) obj).getSecond()).LJII), Integer.valueOf(((C465120ILu) ((Pair) obj2).getSecond()).LJII));
    }

    public static final int compare$1(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Map.Entry) obj).getKey(), (Integer) ((Map.Entry) obj2).getKey());
    }

    public static final int compare$2(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        long j;
        SubPackagePriceInfo subPackagePriceInfo;
        SubPackagePriceInfo subPackagePriceInfo2;
        SubPackageSummary subPackageSummary = (SubPackageSummary) obj;
        long j2 = Long.MAX_VALUE;
        if (subPackageSummary != null && (subPackagePriceInfo2 = subPackageSummary.priceInfo) != null) {
            j = subPackagePriceInfo2.usdPriceAmountMicros;
        } else {
            j = Long.MAX_VALUE;
        }
        Long lValueOf = Long.valueOf(j);
        SubPackageSummary subPackageSummary2 = (SubPackageSummary) obj2;
        if (subPackageSummary2 != null && (subPackagePriceInfo = subPackageSummary2.priceInfo) != null) {
            j2 = subPackagePriceInfo.usdPriceAmountMicros;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$3(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        long jLongValue;
        Long l = ((LiveSurveyState) obj).showTimestamp;
        long jLongValue2 = 0;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        Long lValueOf = Long.valueOf(-jLongValue);
        Long l2 = ((LiveSurveyState) obj2).showTimestamp;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(-jLongValue2));
    }

    public static final int compare$4(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((NotConsumeControlsModel) obj2).notConsumeTimes, ((NotConsumeControlsModel) obj).notConsumeTimes);
    }

    public static final int compare$5(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C510480K0g) obj).LIZJ()), Integer.valueOf(((C510480K0g) obj2).LIZJ()));
    }

    public static final int compare$6(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C510480K0g) obj).LIZJ()), Integer.valueOf(((C510480K0g) obj2).LIZJ()));
    }

    public static final int compare$7(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        long j;
        SubPackagePriceInfo subPackagePriceInfo;
        SubPackagePriceInfo subPackagePriceInfo2;
        SubPackageSummary subPackageSummary = (SubPackageSummary) obj;
        long j2 = Long.MAX_VALUE;
        if (subPackageSummary != null && (subPackagePriceInfo2 = subPackageSummary.priceInfo) != null) {
            j = subPackagePriceInfo2.usdPriceAmountMicros;
        } else {
            j = Long.MAX_VALUE;
        }
        Long lValueOf = Long.valueOf(j);
        SubPackageSummary subPackageSummary2 = (SubPackageSummary) obj2;
        if (subPackageSummary2 != null && (subPackagePriceInfo = subPackageSummary2.priceInfo) != null) {
            j2 = subPackagePriceInfo.usdPriceAmountMicros;
        }
        return C20085613iQ.LIZIZ(lValueOf, Long.valueOf(j2));
    }

    public static final int compare$8(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        Integer numValueOf;
        SubPackageSummary subPackageSummary = ((SubPackagePrivilege) obj2).packageSummary;
        Integer numValueOf2 = null;
        if (subPackageSummary != null) {
            numValueOf = Integer.valueOf(C0K51.LJIILIIL(Boolean.valueOf(subPackageSummary.isPinned)));
        } else {
            numValueOf = null;
        }
        SubPackageSummary subPackageSummary2 = ((SubPackagePrivilege) obj).packageSummary;
        if (subPackageSummary2 != null) {
            numValueOf2 = Integer.valueOf(C0K51.LJIILIIL(Boolean.valueOf(subPackageSummary2.isPinned)));
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$9(AComparatorS26S0000000_7 aComparatorS26S0000000_7, Object obj, Object obj2) {
        int iIntValue;
        HashMap<String, Integer> map = C0KBS.LIZLLL;
        Integer num = map.get(((EmoteModel) obj).emoteId);
        int iIntValue2 = Integer.MAX_VALUE;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer num2 = map.get(((EmoteModel) obj2).emoteId);
        if (num2 != null) {
            iIntValue2 = num2.intValue();
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIntValue2));
    }
}
