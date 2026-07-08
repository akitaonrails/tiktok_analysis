package Y;

import X.C1635170seZ;
import X.C1643340srk;
import X.C1692270u8f;
import X.C20085613iQ;
import X.InterfaceC1624270sMz;
import X.InterfaceC1689980u4y;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import com.tts.oecverify.BdTuring;
import iyl.i3;
import java.util.Comparator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public class AComparatorS44S0000000_25 implements Comparator {
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

    public AComparatorS44S0000000_25(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1624270sMz) obj).priority().ordinal()), Integer.valueOf(((InterfaceC1624270sMz) obj2).priority().ordinal()));
    }

    public static final int compare$1(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((StoryHighlightAwemePreview) obj).createTime), Long.valueOf(((StoryHighlightAwemePreview) obj2).createTime));
    }

    public static final int compare$10(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1692270u8f) obj).LIZIZ), Integer.valueOf(((C1692270u8f) obj2).LIZIZ));
    }

    public static final int compare$11(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1692270u8f) obj).LIZIZ), Integer.valueOf(((C1692270u8f) obj2).LIZIZ));
    }

    public static final int compare$2(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1635170seZ) obj2).LIZJ), Long.valueOf(((C1635170seZ) obj).LIZJ));
    }

    public static final int compare$3(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1635170seZ) obj2).LIZJ), Long.valueOf(((C1635170seZ) obj).LIZJ));
    }

    public static final int compare$4(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1635170seZ) obj2).LIZJ), Long.valueOf(((C1635170seZ) obj).LIZJ));
    }

    public static final int compare$5(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C1635170seZ) obj2).LIZJ), Long.valueOf(((C1635170seZ) obj).LIZJ));
    }

    public static final int compare$6(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C1643340srk) obj).LIZ, ((C1643340srk) obj2).LIZ);
    }

    public static final int compare$7(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((Integer) ((Pair) obj).getFirst(), (Integer) ((Pair) obj2).getFirst());
    }

    public static final int compare$8(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ((i3) obj, (i3) obj2);
    }

    public static final int compare$9(AComparatorS44S0000000_25 aComparatorS44S0000000_25, Object obj, Object obj2) {
        return Intrinsics.LJI(((InterfaceC1689980u4y) obj).getIndex(), ((InterfaceC1689980u4y) obj2).getIndex());
    }
}
