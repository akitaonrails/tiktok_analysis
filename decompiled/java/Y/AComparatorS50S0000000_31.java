package Y;

import X.AbstractRunnableC204495150b;
import X.C150Z;
import X.C157M;
import X.C15PB;
import X.C15YM;
import X.C166R;
import X.C20085613iQ;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import webcast.data.multi_guest_play.GuestShowdownUser;

/* JADX INFO: loaded from: classes32.dex */
public class AComparatorS50S0000000_31 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS50S0000000_31(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((GuestShowdownUser) obj).rank), Integer.valueOf(((GuestShowdownUser) obj2).rank));
    }

    public static final int compare$1(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((RecyclerView.ViewHolder) obj).getLayoutPosition()), Integer.valueOf(((RecyclerView.ViewHolder) obj2).getLayoutPosition()));
    }

    public static final int compare$10(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C15YM) obj).getKey(), ((C15YM) obj2).getKey());
    }

    public static final int compare$11(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C15YM) obj).getKey(), ((C15YM) obj2).getKey());
    }

    public static final int compare$12(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((GuestShowdownUser) obj).rank), Integer.valueOf(((GuestShowdownUser) obj2).rank));
    }

    public static final int compare$13(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((MusicModel) obj2).getDateLastModified(), ((MusicModel) obj).getDateLastModified());
    }

    public static final int compare$2(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(-((C157M) obj).LIZJ), Integer.valueOf(-((C157M) obj2).LIZJ));
    }

    public static final int compare$3(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C150Z) obj).LIZ), Integer.valueOf(((C150Z) obj2).LIZ));
    }

    public static final int compare$4(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C15PB) obj).LJI), Long.valueOf(((C15PB) obj2).LJI));
    }

    public static final int compare$5(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C15PB) obj).LJFF), Long.valueOf(((C15PB) obj2).LJFF));
    }

    public static final int compare$6(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractRunnableC204495150b) obj).LLILLJJLI), Integer.valueOf(((AbstractRunnableC204495150b) obj2).LLILLJJLI));
    }

    public static final int compare$7(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        C166R c166r = (C166R) obj;
        C166R c166r2 = (C166R) obj2;
        return ((((c166r2.LJ - c166r2.LIZLLL) + 1) * ((c166r2.LJI - c166r2.LJFF) + 1)) * ((c166r2.LJIIIIZZ - c166r2.LJII) + 1)) - ((((c166r.LJ - c166r.LIZLLL) + 1) * ((c166r.LJI - c166r.LJFF) + 1)) * ((c166r.LJIIIIZZ - c166r.LJII) + 1));
    }

    public static final int compare$8(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C15YM) obj).getKey(), ((C15YM) obj2).getKey());
    }

    public static final int compare$9(AComparatorS50S0000000_31 aComparatorS50S0000000_31, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(((C15YM) obj).getKey(), ((C15YM) obj2).getKey());
    }
}
