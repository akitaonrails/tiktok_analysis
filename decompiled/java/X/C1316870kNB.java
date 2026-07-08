package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.List;

/* JADX INFO: renamed from: X.0kNB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1316870kNB {
    public final List<Float> LIZ;

    public C1316870kNB(List<Float> list) {
        this.LIZ = list;
    }

    public final float LIZ(float f, float f2, float f3, int i) {
        float f4 = f3 - f2;
        switch (i) {
            case 2:
                f = (-f4) * 0.1f;
                break;
            case 3:
                f = f4 * 0.1f;
                break;
            case 4:
            case 5:
                f = f2 - ((Float) ListProtector.get(this.LIZ, 0)).floatValue();
                break;
            case 6:
                f = (f3 + f2 + ((Float) ListProtector.get(this.LIZ, 2)).floatValue()) * 0.5f;
                break;
            case 7:
            case 8:
                f = f3 - ((Float) ListProtector.get(this.LIZ, 1)).floatValue();
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                f = (f * ((Float) ListProtector.get(this.LIZ, 3)).floatValue()) / 100.0f;
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                f = (((-((Float) ListProtector.get(this.LIZ, 0)).floatValue()) - ((Float) ListProtector.get(this.LIZ, 1)).floatValue()) + f2 + f3) * 0.5f;
                break;
            default:
                f = 0.0f;
                break;
        }
        return (-f) + f2;
    }
}
