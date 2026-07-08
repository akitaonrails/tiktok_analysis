package X;

import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0cEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1004080cEg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, long j, AnoleComponentModel anoleComponentModel, long j2, AwemeRawAd awemeRawAd, String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackImageLoadResult() success = ");
        sbLIZ.append(z);
        sbLIZ.append(", startLoadTime = ");
        sbLIZ.append(j);
        sbLIZ.append(",failReason = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("res_url", anoleComponentModel.getImageUrl());
        if (z) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_success", str2);
        linkedHashMap.put("image_load_start", Long.valueOf(j));
        linkedHashMap.put("image_load_end", Long.valueOf(jCurrentTimeMillis));
        linkedHashMap.put("image_load_duration", Long.valueOf(jCurrentTimeMillis - j));
        linkedHashMap.put("load_failed_reason", str);
        C1004070cEf.LIZ("anole_image_load_result", anoleComponentModel, j2, awemeRawAd, linkedHashMap, 32);
    }
}
