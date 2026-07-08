package X;

import com.ss.android.ugc.aweme.ml.ab.OneSmartDataTrackConfig;
import com.ss.android.ugc.aweme.ml.feature.SmartDataTrackerServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.InputFeaturesConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0pS7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512130pS7 {
    public final String LIZ;
    public final OneSmartDataTrackConfig LIZIZ;
    public int LIZJ;
    public final LinkedList<SmartDataTrackerServiceImpl.TrackerMonitorData> LIZLLL = new LinkedList<>();
    public final int LJ = 16;
    public final C1510230pP3 LJFF;
    public final C1510230pP3 LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(scene='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("', runCount:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" config:");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1512130pS7(String str, OneSmartDataTrackConfig oneSmartDataTrackConfig) {
        C1510230pP3 c1510230pP3;
        this.LIZ = str;
        this.LIZIZ = oneSmartDataTrackConfig;
        InputFeaturesConfig predict = oneSmartDataTrackConfig.getPredict();
        C1510230pP3 c1510230pP32 = null;
        if (predict != null) {
            SmartSceneConfig smartSceneConfig = new SmartSceneConfig();
            smartSceneConfig.setScene(str);
            smartSceneConfig.setFeatures(predict);
            c1510230pP3 = new C1510230pP3(str);
            c1510230pP3.LIZIZ = smartSceneConfig;
        } else {
            c1510230pP3 = null;
        }
        this.LJFF = c1510230pP3;
        InputFeaturesConfig real = oneSmartDataTrackConfig.getReal();
        if (real != null) {
            SmartSceneConfig smartSceneConfig2 = new SmartSceneConfig();
            smartSceneConfig2.setScene(str);
            smartSceneConfig2.setFeatures(real);
            c1510230pP32 = new C1510230pP3(str);
            c1510230pP32.LIZIZ = smartSceneConfig2;
        }
        this.LJI = c1510230pP32;
    }
}
