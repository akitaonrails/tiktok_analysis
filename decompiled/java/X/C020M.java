package X;

import android.view.ViewGroup;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import tikcast.linkmic.common.AnchorPanelLayoutTypeSetting;
import webcast.data.multi_guest_play.PlaybookTagAggregation;
import webcast.data.multi_guest_play.PlaybookTagInfo;

/* JADX INFO: renamed from: X.020M, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class C020M extends C09AY implements Function1 {
    public final int $t;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f102i0;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj);
            case 1:
                return invoke$1(this, obj);
            case 2:
                return invoke$2(this, obj);
            case 3:
                return invoke$3(this, obj);
            case 4:
                return invoke$4(this, obj);
            case 5:
                return invoke$5(this, obj);
            case 6:
                return invoke$6(this, obj);
            case 7:
                return invoke$7(this, obj);
            case 8:
                return invoke$8(this, obj);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C020M(int i, int i2) {
        super(1);
        this.$t = i2;
        this.f102i0 = i;
    }

    public static final Object invoke$0(C020M c020m, Object obj) {
        boolean z;
        BadgeStruct badgeStruct = (BadgeStruct) obj;
        if (badgeStruct != null && badgeStruct.badgeScene == c020m.f102i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(C020M c020m, Object obj) {
        boolean z = true;
        if (((EmoteWithIndex) obj).index + 1 != c020m.f102i0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$10(C020M c020m, Object obj) {
        ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
        layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0));
        layoutParams.width = (int) (((double) c020m.f102i0) * 0.57d);
        return Unit.LIZ;
    }

    public static final Object invoke$2(C020M c020m, Object obj) {
        Integer num;
        int iIntValue;
        int iCurrentTimeMillis = (int) (System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT));
        Object obj2 = ((Map) obj).get("timestamp");
        if (obj2 instanceof Integer) {
            num = (Integer) obj2;
        } else {
            num = null;
        }
        boolean z = false;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        if (iCurrentTimeMillis - iIntValue < c020m.f102i0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(C020M c020m, Object obj) {
        boolean z;
        if (((AnchorPanelLayoutTypeSetting) obj).panelLayoutType == c020m.f102i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(C020M c020m, Object obj) {
        ((Number) obj).intValue();
        return Integer.valueOf(c020m.f102i0);
    }

    public static final Object invoke$5(C020M c020m, Object obj) {
        ((ViewGroup.LayoutParams) obj).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c020m.f102i0)));
        return Unit.LIZ;
    }

    public static final Object invoke$6(C020M c020m, Object obj) {
        ((ViewGroup.LayoutParams) obj).height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(c020m.f102i0)));
        return Unit.LIZ;
    }

    public static final Object invoke$7(C020M c020m, Object obj) {
        boolean z;
        if (c020m.f102i0 == ((PlaybookTagAggregation) obj).playbookFirstLevelTagType) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(C020M c020m, Object obj) {
        boolean z;
        if (c020m.f102i0 == ((PlaybookTagInfo) obj).tagType) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(C020M c020m, Object obj) {
        boolean z;
        if (((Number) obj).longValue() >= c020m.f102i0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
