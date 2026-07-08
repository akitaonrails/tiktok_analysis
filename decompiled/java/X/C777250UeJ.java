package X;

import com.bytedance.android.livesdkapi.host.ILiveGameService;

/* JADX INFO: renamed from: X.0UeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C777250UeJ {
    public static C11JF LIZ;

    public static String LIZIZ(String str) {
        String string;
        Object feature = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature(str);
        if (feature != null && (string = feature.toString()) != null) {
            return string;
        }
        return "";
    }

    public static String LIZ(String str, String str2) {
        String string;
        Object objZS = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).ZS(0, str2, str, "SafetyFeatureReporter");
        if (objZS != null && (string = objZS.toString()) != null) {
            return string;
        }
        return "";
    }
}
