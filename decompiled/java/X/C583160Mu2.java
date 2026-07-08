package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0Mu2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583160Mu2 {
    public static final Map<Integer, Integer> LIZ = new LinkedHashMap();
    public static int LIZIZ = 1;
    public static int LIZJ = 1;
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    public static int LIZ() {
        Integer num = (Integer) ((LinkedHashMap) LIZ).get(Integer.valueOf(LIZIZ));
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static boolean LIZIZ(Aweme aweme) {
        AwemeRawAd awemeRawAd;
        Map<String, CardStruct> cardInfos;
        CardStruct cardStruct;
        boolean z = true;
        if (aweme == null || !AwemeExtKt.isAdTraffic(aweme) || (awemeRawAd = aweme.getAwemeRawAd()) == null || (cardInfos = awemeRawAd.getCardInfos()) == null || (cardStruct = cardInfos.get("5")) == null || cardStruct.getCardType() != 15) {
            z = false;
        }
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("hasSubVideo: status = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        return z;
    }

    public static void LIZJ(int i) {
        LIZJ = LIZIZ;
        LIZIZ = i;
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateStoryIndex: lastPlayIndex = ");
        sbLIZ.append(LIZJ);
        sbLIZ.append(",currentPlayIndex = ");
        sbLIZ.append(LIZIZ);
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
