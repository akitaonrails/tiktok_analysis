package Y;

import X.C20085613iQ;
import X.C700060Rd6;
import X.C703160Ri6;
import X.C719000SIg;
import X.InterfaceC726170Se7;
import com.bytedance.touchpoint.api.model.CommonFeedButton;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public class AComparatorS30S0000000_11 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS30S0000000_11(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C719000SIg) obj).LIZ.getStart()), Integer.valueOf(((C719000SIg) obj2).LIZ.getStart()));
    }

    public static final int compare$1(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InteractStickerStruct) obj).getIndex()), Integer.valueOf(((InteractStickerStruct) obj2).getIndex()));
    }

    public static final int compare$2(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C700060Rd6) obj).LIZ, ((C700060Rd6) obj2).LIZ);
    }

    public static final int compare$3(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$4(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextExtraStruct) obj).getStart()), Integer.valueOf(((TextExtraStruct) obj2).getStart()));
    }

    public static final int compare$5(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C703160Ri6) obj).LIZ, ((C703160Ri6) obj2).LIZ);
    }

    public static final int compare$6(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((InterfaceC726170Se7) obj2).getPriority(), ((InterfaceC726170Se7) obj).getPriority());
    }

    public static final int compare$7(AComparatorS30S0000000_11 aComparatorS30S0000000_11, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((CommonFeedButton) obj).priority), Integer.valueOf(((CommonFeedButton) obj2).priority));
    }
}
