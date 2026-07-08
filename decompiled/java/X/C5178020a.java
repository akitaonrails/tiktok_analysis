package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.text.a0;
import webcast.data.multi_guest_play.NoticeboardTemplate;

/* JADX INFO: renamed from: X.020a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5178020a extends C09AY implements Function1 {
    public final int $t;
    public long j0;

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
    public C5178020a(long j, int i) {
        super(1);
        this.$t = i;
        this.j0 = j;
    }

    public static final Object invoke$0(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((Number) ((Map.Entry) obj).getValue()).longValue() < c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$1(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((NoticeboardTemplate) obj).noticeboardTemplateId == c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$10(C5178020a c5178020a, Object obj) {
        ((Number) obj).longValue();
        return Long.valueOf(c5178020a.j0);
    }

    public static final Object invoke$2(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((NoticeboardTemplate) obj).noticeboardTemplateId == c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$3(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((Number) obj).longValue() < c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$4(C5178020a c5178020a, Object obj) {
        return C1173560ge2.LIZ((C1173560ge2) obj, null, null, null, null, c5178020a.j0, false, false, false, null, 991);
    }

    public static final Object invoke$5(C5178020a c5178020a, Object obj) {
        long jLongValue;
        Long lLJIILIIL;
        boolean z = false;
        String str = (String) C13LP.LJJLIIIJL(a0.LJJLIIIJILLIZJL((String) obj, new String[]{"_"}, 0, 6));
        if (str != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str)) != null) {
            jLongValue = lLJIILIIL.longValue();
        } else {
            jLongValue = 0;
        }
        if (c5178020a.j0 - jLongValue > 7) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$6(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((Number) obj).longValue() < c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$7(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((Number) obj).longValue() < c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$8(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((Number) obj).longValue() < c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$9(C5178020a c5178020a, Object obj) {
        boolean z;
        if (((Number) obj).longValue() < c5178020a.j0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
