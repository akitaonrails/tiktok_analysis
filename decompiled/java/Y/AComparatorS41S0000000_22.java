package Y;

import X.AbstractC1456460o0K;
import X.C1430360nKE;
import X.C1440770nb1;
import X.C20085613iQ;
import X.InterfaceC1420160n3m;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.publish.AVTextExtraStruct;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.property.StoryUploadSpeedEncodeSettings;
import com.ss.android.ugc.aweme.sticker.data.CreateAnchorInfo;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.tools.mvtemplate.core.TemplateTabCacheAsset;
import com.tts.oecverify.BdTuring;
import java.util.Comparator;
import java.util.Map;

/* JADX INFO: loaded from: classes23.dex */
public class AComparatorS41S0000000_22 implements Comparator {
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
            default:
                return 0;
        }
    }

    public AComparatorS41S0000000_22(int i) {
        this.$t = i;
    }

    public static final int compare$0(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        Map<? extends Object, Integer> map = C1430360nKE.LIZ;
        return C20085613iQ.LIZIZ(Integer.valueOf(C1430360nKE.LIZ(((CreateAnchorInfo) obj).getType())), Integer.valueOf(C1430360nKE.LIZ(((CreateAnchorInfo) obj2).getType())));
    }

    public static final int compare$1(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        Map<? extends Object, Integer> map = C1430360nKE.LIZ;
        return C20085613iQ.LIZIZ(Integer.valueOf(C1430360nKE.LIZ(((CreateAnchorInfo) obj).getType())), Integer.valueOf(C1430360nKE.LIZ(((CreateAnchorInfo) obj2).getType())));
    }

    public static final int compare$10(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1420160n3m) obj).LIZ()), Integer.valueOf(((InterfaceC1420160n3m) obj2).LIZ()));
    }

    public static final int compare$11(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((InterfaceC1420160n3m) obj).LIZ()), Integer.valueOf(((InterfaceC1420160n3m) obj2).LIZ()));
    }

    public static final int compare$12(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((StoryUploadSpeedEncodeSettings) obj).maxSpeed), Integer.valueOf(((StoryUploadSpeedEncodeSettings) obj2).maxSpeed));
    }

    public static final int compare$13(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(C1430360nKE.LIZ(((Number) obj).intValue())), Integer.valueOf(C1430360nKE.LIZ(((Number) obj2).intValue())));
    }

    public static final int compare$14(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AbstractC1456460o0K) ((Map.Entry) obj).getKey()).LIZ), Integer.valueOf(((AbstractC1456460o0K) ((Map.Entry) obj2).getKey()).LIZ));
    }

    public static final int compare$15(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((C1440770nb1) obj).LIZ.priority), Integer.valueOf(((C1440770nb1) obj2).LIZ.priority));
    }

    public static final int compare$16(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TemplateTabCacheAsset) obj).index), Integer.valueOf(((TemplateTabCacheAsset) obj2).index));
    }

    public static final int compare$2(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        Integer num;
        int i = ((AutoCutThemeData) obj).reuseMusicAlignDisplayIndex;
        Integer num2 = 0;
        if (i > 0) {
            num = num2;
        } else {
            num = 1;
        }
        if (((AutoCutThemeData) obj2).reuseMusicAlignDisplayIndex <= 0) {
            num2 = 1;
        }
        return C20085613iQ.LIZIZ(num, num2);
    }

    public static final int compare$3(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        Map<? extends Object, Integer> map = C1430360nKE.LIZ;
        return C20085613iQ.LIZIZ(Integer.valueOf(C1430360nKE.LIZ(((AnchorTransData) obj2).businessType)), Integer.valueOf(C1430360nKE.LIZ(((AnchorTransData) obj).businessType)));
    }

    public static final int compare$4(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        Map<? extends Object, Integer> map = C1430360nKE.LIZ;
        return C20085613iQ.LIZIZ(Integer.valueOf(C1430360nKE.LIZ(((AnchorTransData) obj).businessType)), Integer.valueOf(C1430360nKE.LIZ(((AnchorTransData) obj2).businessType)));
    }

    public static final int compare$5(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        Map<? extends Object, Integer> map = C1430360nKE.LIZ;
        return C20085613iQ.LIZIZ(Integer.valueOf(C1430360nKE.LIZ(((CreateAnchorInfo) obj).getType())), Integer.valueOf(C1430360nKE.LIZ(((CreateAnchorInfo) obj2).getType())));
    }

    public static final int compare$6(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return ((InteractStickerStruct) obj).getIndex() - ((InteractStickerStruct) obj2).getIndex();
    }

    public static final int compare$7(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((AVTextExtraStruct) obj).start), Integer.valueOf(((AVTextExtraStruct) obj2).start));
    }

    public static final int compare$8(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((StickerItemModel) obj).layerWeight), Integer.valueOf(((StickerItemModel) obj2).layerWeight));
    }

    public static final int compare$9(AComparatorS41S0000000_22 aComparatorS41S0000000_22, Object obj, Object obj2) {
        return C20085613iQ.LIZIZ(Integer.valueOf(((TextStickerData) obj).getStartTime()), Integer.valueOf(((TextStickerData) obj2).getStartTime()));
    }
}
