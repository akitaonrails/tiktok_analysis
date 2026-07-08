package Y;

import X.AbstractC431930Gwh;
import X.C20085613iQ;
import android.text.style.ClickableSpan;
import com.ss.android.ugc.aweme.creative.model.ailive.PromptModel;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public class AComparatorS25S0000000_6 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS25S0000000_6(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj2).getStart()), Integer.valueOf(((TextExtraStruct) obj).getStart()));
    }

    public static final int compare$1(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) obj, (String) obj2);
    }

    public static final int compare$10(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$11(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$2(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((String) obj, (String) obj2);
    }

    public static final int compare$3(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$4(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((PromptModel) obj2).prompt.length()), Integer.valueOf(((PromptModel) obj).prompt.length()));
    }

    public static final int compare$5(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj2).getStart()), Integer.valueOf(((TextExtraStruct) obj).getStart()));
    }

    public static final int compare$6(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        Integer numValueOf;
        TextExtraStruct textExtraStruct = (TextExtraStruct) obj;
        Integer numValueOf2 = null;
        if (textExtraStruct != null) {
            numValueOf = Integer.valueOf(textExtraStruct.getStart());
        } else {
            numValueOf = null;
        }
        TextExtraStruct textExtraStruct2 = (TextExtraStruct) obj2;
        if (textExtraStruct2 != null) {
            numValueOf2 = Integer.valueOf(textExtraStruct2.getStart());
        }
        return C20085613iQ.LIZIZ(numValueOf, numValueOf2);
    }

    public static final int compare$7(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj2).getStart()), Integer.valueOf(((TextExtraStruct) obj).getStart()));
    }

    public static final int compare$8(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        int i;
        ClickableSpan clickableSpan = (ClickableSpan) obj2;
        int i2 = 100;
        if (clickableSpan instanceof AbstractC431930Gwh) {
            i = ((AbstractC431930Gwh) clickableSpan).LL;
        } else {
            i = 100;
        }
        Integer numValueOf = Integer.valueOf(i);
        ClickableSpan clickableSpan2 = (ClickableSpan) obj;
        if (clickableSpan2 instanceof AbstractC431930Gwh) {
            i2 = ((AbstractC431930Gwh) clickableSpan2).LL;
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(i2));
    }

    public static final int compare$9(AComparatorS25S0000000_6 aComparatorS25S0000000_6, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Float) ((Pair) obj2).getFirst(), (Float) ((Pair) obj).getFirst());
    }
}
