package X;

import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardButtonProperty;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.AnchorPinCardConfig;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0NSf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594190NSf {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(AnchorPinCardConfig anchorPinCardConfig, Integer num) {
        Map<String, AnchorPinCardButtonProperty> map;
        AnchorPinCardButtonProperty anchorPinCardButtonProperty;
        String str;
        if (anchorPinCardConfig != null && (map = anchorPinCardConfig.buttonConfig) != null && (anchorPinCardButtonProperty = map.get("1")) != null && (str = anchorPinCardButtonProperty.toast) != null) {
            return u.LJJIFFI(str, "{{duration}}", String.valueOf(C21196617xE.LIZ().LIZIZ(num) / ((long) LSPassThroughRecordSizeConfig.DEFAULT)), false);
        }
        return null;
    }
}
