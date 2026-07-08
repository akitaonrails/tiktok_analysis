package Y;

import X.C0LJE;
import X.C0M0P;
import X.C20085613iQ;
import X.C561750M1l;
import X.InterfaceC571170Mah;
import com.ss.android.ugc.aweme.aigc.asynctask.models.TaskProgressInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.draft.model.DraftFileRestoreResult;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.model.ReturnEcommerceCommentModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.tts.oecverify.BdTuring;
import java.io.File;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
public class AComparatorS27S0000000_8 implements Comparator {
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

    public AComparatorS27S0000000_8(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TaskProgressInfo) obj).index), Integer.valueOf(((TaskProgressInfo) obj2).index));
    }

    public static final int compare$1(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((ReturnEcommerceCommentModel) obj).index), Integer.valueOf(((ReturnEcommerceCommentModel) obj2).index));
    }

    public static final int compare$10(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TikTokMediaModel) obj).selectIndex), Integer.valueOf(((TikTokMediaModel) obj2).selectIndex));
    }

    public static final int compare$11(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TikTokMediaModel) obj).selectIndex), Integer.valueOf(((TikTokMediaModel) obj2).selectIndex));
    }

    public static final int compare$12(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AutoCutThemeData) obj).indexFromSource), Integer.valueOf(((AutoCutThemeData) obj2).indexFromSource));
    }

    public static final int compare$13(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(C561750M1l.LIZJ((C0M0P) obj)), Long.valueOf(C561750M1l.LIZJ((C0M0P) obj2)));
    }

    public static final int compare$14(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C0M0P) obj2).LJI), Long.valueOf(((C0M0P) obj).LJI));
    }

    public static final int compare$15(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((C0M0P) obj2).LJI), Long.valueOf(((C0M0P) obj).LJI));
    }

    public static final int compare$2(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((MediaModel) obj2).date), Long.valueOf(((MediaModel) obj).date));
    }

    public static final int compare$3(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((MediaModel) obj2).date), Long.valueOf(((MediaModel) obj).date));
    }

    public static final int compare$4(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((DraftFileRestoreResult) obj2).priority), Integer.valueOf(((DraftFileRestoreResult) obj).priority));
    }

    public static final int compare$5(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextStickerModel) obj).getBaseStickerModel().getZIndex()), Integer.valueOf(((TextStickerModel) obj2).getBaseStickerModel().getZIndex()));
    }

    public static final int compare$6(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Long.valueOf(((File) obj).lastModified()), Long.valueOf(((File) obj2).lastModified()));
    }

    public static final int compare$7(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C0LJE) obj).getPriority()), Integer.valueOf(((C0LJE) obj2).getPriority()));
    }

    public static final int compare$8(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC571170Mah) obj2).getPriority()), Integer.valueOf(((InterfaceC571170Mah) obj).getPriority()));
    }

    public static final int compare$9(AComparatorS27S0000000_8 aComparatorS27S0000000_8, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TikTokMediaModel) obj).selectIndex), Integer.valueOf(((TikTokMediaModel) obj2).selectIndex));
    }
}
