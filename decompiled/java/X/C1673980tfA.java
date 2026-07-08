package X;

import com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsListStruct;
import com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsPageStruct;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0tfA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1673980tfA {
    public static final C1673980tfA LIZ = new C1673980tfA();
    public static final C2252321DDq LIZIZ = C1BNE.LIZ(null);
    public static TrendingCreatorsPageStruct LIZJ;

    public static Map LIZ(TrendingCreatorsPageStruct trendingCreatorsPageStruct) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (trendingCreatorsPageStruct == null) {
            return null;
        }
        List<TrendingCreatorsListStruct> list = trendingCreatorsPageStruct.trendingCreatorsListStruct;
        if (list != null) {
            for (TrendingCreatorsListStruct trendingCreatorsListStruct : list) {
                String str = trendingCreatorsListStruct.interestId;
                String str2 = trendingCreatorsListStruct.interestText;
                if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
                    linkedHashMap.put(str, str2);
                }
            }
        }
        if (linkedHashMap.isEmpty()) {
            return null;
        }
        return linkedHashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x01b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsPageStruct r26) {
        /*
            Method dump skipped, instruction units count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1673980tfA.LIZIZ(com.ss.android.ugc.aweme.plugin.journey.TrendingCreatorsPageStruct):java.util.Map");
    }
}
