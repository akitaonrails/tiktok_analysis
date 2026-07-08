package X;

import com.ss.android.ugc.aweme.IAnoleVideoPreloadTracker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cYp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1016570cYp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(384));

    public static void LIZJ(String str, String str2, String str3, Aweme aweme) {
        AnoleComponentModel anoleComponentModel;
        IAnoleVideoPreloadTracker iAnoleVideoPreloadTracker;
        long j;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (anoleModel = awemeRawAd2.getAnoleModel()) != null && (map = anoleModel.components) != null) {
            anoleComponentModel = map.get(str);
        } else {
            anoleComponentModel = null;
        }
        if (awemeRawAd != null && anoleComponentModel != null && (iAnoleVideoPreloadTracker = (IAnoleVideoPreloadTracker) LIZ.getValue()) != null) {
            AnoleModel anoleModel2 = awemeRawAd.getAnoleModel();
            if (anoleModel2 != null) {
                j = anoleModel2.templateID;
            } else {
                j = 0;
            }
            iAnoleVideoPreloadTracker.LIZJ(anoleComponentModel, j, awemeRawAd, str2, str3);
        }
    }

    public static void LIZ(Aweme aweme, String str, boolean z, long j, String str2, String str3, String str4) {
        AnoleComponentModel anoleComponentModel;
        IAnoleVideoPreloadTracker iAnoleVideoPreloadTracker;
        long j2;
        AnoleModel anoleModel;
        Map<String, AnoleComponentModel> map;
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        AwemeRawAd awemeRawAd2 = aweme.getAwemeRawAd();
        if (awemeRawAd2 != null && (anoleModel = awemeRawAd2.getAnoleModel()) != null && (map = anoleModel.components) != null) {
            anoleComponentModel = map.get(str);
        } else {
            anoleComponentModel = null;
        }
        if (awemeRawAd != null && anoleComponentModel != null && (iAnoleVideoPreloadTracker = (IAnoleVideoPreloadTracker) LIZ.getValue()) != null) {
            AnoleModel anoleModel2 = awemeRawAd.getAnoleModel();
            if (anoleModel2 != null) {
                j2 = anoleModel2.templateID;
            } else {
                j2 = 0;
            }
            iAnoleVideoPreloadTracker.LIZIZ(z, j, anoleComponentModel, j2, awemeRawAd, str2, str3, str4);
        }
    }

    public static void LIZIZ(Aweme aweme, String str, boolean z, long j, String str2, List list, String str3) {
        String str4 = (String) C13LP.LJJJLZIJ(0, list);
        if (str4 == null) {
            str4 = "";
        }
        LIZ(aweme, str, z, j, str2, str4, str3);
    }
}
