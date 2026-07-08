package X;

import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;

/* JADX INFO: renamed from: X.1ESq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2281701ESq {
    public static final /* synthetic */ C2281701ESq LIZ = new C2281701ESq();

    public static String LIZ(int i) {
        switch (i) {
            case 1:
                return "SEND_ING";
            case 2:
                return "SEND_SUCCESS";
            case 3:
                return "SEND_FAILED";
            case 4:
                return "GENERATING";
            case 5:
                return "RECEIVE_ING";
            case 6:
                return "RECEIVE_SUCCESS";
            case 7:
                return "RECEIVE_FAILED";
            case 8:
                return "DELETE_ING";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "DELETE_SUCCESS";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return "DELETE_FAILED";
            case BdTuring.TYPE_EMAIL /* 11 */:
                return "UPDATE_ING";
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return "UPDATE_FAILED";
            default:
                return "UNKNOWN";
        }
    }
}
