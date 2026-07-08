package X;

import com.ss.android.ugc.aweme.commerce.AwemeCommerceStruct;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Rjn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704210Rjn {
    public static boolean LIZ(Aweme aweme) {
        AwemeCommerceStruct commerceVideoAuthInfo;
        if (aweme == null || !C729980SkG.LJIIIIZZ(aweme) || (commerceVideoAuthInfo = aweme.getCommerceVideoAuthInfo()) == null || commerceVideoAuthInfo.getDarkPostStatus() != 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        Collection<AnoleComponentModel> collectionValues;
        if (AwemeExtKt.isAdTraffic(aweme) && C1017070cZd.LLLIIIL(aweme)) {
            String slotName = C0RQ7.ANOLE_INTERACTIVE_BOTTOM_BANNER_SLOT.getSlotName();
            if (!a0.LJJJIL(slotName) && C693790RJh.LIZ(aweme).contains(slotName) && (awemeRawAd = aweme.getAwemeRawAd()) != null && (anoleModel = awemeRawAd.getAnoleModel()) != null && (map = anoleModel.components) != null && (collectionValues = map.values()) != null && !collectionValues.isEmpty()) {
                Iterator<T> it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    if (Intrinsics.LJFF(((AnoleComponentModel) it2.next()).containerType, EnumC1008920cMU.DISCLAIMER.getType())) {
                    }
                }
                return true;
            }
            return true;
        }
        return false;
    }
}
