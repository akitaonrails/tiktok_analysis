package Y;

import X.AbstractC315550CYn;
import X.C0CJS;
import X.C0COY;
import X.C20085613iQ;
import X.C321170CiR;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.search.SearchTabInfo;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.ccl.model.conversation.ConversationInfo;
import com.ss.android.ugc.aweme.tako.network.TakoRecoveryTask;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes5.dex */
public class AComparatorS23S0000000_4 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS23S0000000_4(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C321170CiR) obj).LIZJ), Integer.valueOf(((C321170CiR) obj2).LIZJ));
    }

    public static final int compare$1(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C321170CiR) obj).LIZJ), Integer.valueOf(((C321170CiR) obj2).LIZJ));
    }

    public static final int compare$10(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0CJS) obj).LIZ), Integer.valueOf(((C0CJS) obj2).LIZ));
    }

    public static final int compare$11(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((ConversationInfo) obj2).latestMessageTime), Long.valueOf(((ConversationInfo) obj).latestMessageTime));
    }

    public static final int compare$12(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LocalOrderWrapper) obj2).getCreateAtTime()), Long.valueOf(((LocalOrderWrapper) obj).getCreateAtTime()));
    }

    public static final int compare$13(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LocalOrderWrapper) obj2).getCreateAtTime()), Long.valueOf(((LocalOrderWrapper) obj).getCreateAtTime()));
    }

    public static final int compare$14(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((LocalOrderWrapper) obj2).getCreateAtTime()), Long.valueOf(((LocalOrderWrapper) obj).getCreateAtTime()));
    }

    public static final int compare$15(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0COY) ((Map.Entry) obj2).getKey()).LIZIZ), Integer.valueOf(((C0COY) ((Map.Entry) obj).getKey()).LIZIZ));
    }

    public static final int compare$2(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TakoRecoveryTask) obj).getPriority()), Integer.valueOf(((TakoRecoveryTask) obj2).getPriority()));
    }

    public static final int compare$3(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Double.valueOf(((Number) ((Pair) obj2).getSecond()).doubleValue()), Double.valueOf(((Number) ((Pair) obj).getSecond()).doubleValue()));
    }

    public static final int compare$4(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((ConversationInfo) obj2).latestMessageTime), Long.valueOf(((ConversationInfo) obj).latestMessageTime));
    }

    public static final int compare$5(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((Position) obj).getBegin()), Integer.valueOf(((Position) obj2).getBegin()));
    }

    public static final int compare$6(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC315550CYn) obj).LIZIZ()), Integer.valueOf(((AbstractC315550CYn) obj2).LIZIZ()));
    }

    public static final int compare$7(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((SearchTabInfo) obj).tabFixedPosition), Integer.valueOf(((SearchTabInfo) obj2).tabFixedPosition));
    }

    public static final int compare$8(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((SearchTabInfo) obj2).tabFixedPosition), Integer.valueOf(((SearchTabInfo) obj).tabFixedPosition));
    }

    public static final int compare$9(AComparatorS23S0000000_4 aComparatorS23S0000000_4, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((String) ((Pair) obj).getFirst()).length()), Integer.valueOf(((String) ((Pair) obj2).getFirst()).length()));
    }
}
