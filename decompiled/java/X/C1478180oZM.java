package X;

import com.ss.android.ugc.aweme.speedpredictor.api.ISpeedPredictorService;

/* JADX INFO: renamed from: X.0oZM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final /* synthetic */ class C1478180oZM {
    public static ISpeedPredictorService LIZ(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return null;
                }
                return (ISpeedPredictorService) C1126604au.LIZ("com.ss.android.ugc.aweme.speedpredictor.cloudimpl2.CloudSpeedPredictorServiceImpl");
            }
            return (ISpeedPredictorService) C1126604au.LIZ("com.ss.android.ugc.aweme.speedpredictor.cloudimpl.CloudSpeedPredictorServiceImpl");
        }
        return (ISpeedPredictorService) C1126604au.LIZ("com.ss.android.ugc.aweme.speedpredictor.impl.DTSpeedPredictorServiceImpl");
    }
}
