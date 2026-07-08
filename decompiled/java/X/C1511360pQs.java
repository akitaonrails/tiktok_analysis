package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.ml.infra.CollectingTimingConfig;
import com.ss.android.ugc.aweme.ml.infra.InferenceConfig;
import com.ss.android.ugc.aweme.ml.infra.PitayaMLConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSceneConfig;
import com.ss.android.ugc.aweme.ml.infra.SmartSdkConfig;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0pQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511360pQs {
    public static final Aweme LIZ(C1509310pNZ c1509310pNZ) {
        Aweme aweme;
        if ((c1509310pNZ instanceof C0N33) && (aweme = ((C0N33) c1509310pNZ).LJIIJ) != null) {
            return aweme;
        }
        Object obj = c1509310pNZ.LJIIIIZZ;
        if (obj != null && (obj instanceof Aweme)) {
            return (Aweme) obj;
        }
        return null;
    }

    public static final String LIZIZ(C1510230pP3 c1510230pP3) {
        SmartSdkConfig sdkConfig;
        PitayaMLConfig pitayaMLConfig;
        InferenceConfig inferenceConfig;
        String str;
        SmartSceneConfig smartSceneConfigLIZJ = LIZJ(c1510230pP3);
        if (smartSceneConfigLIZJ == null || (inferenceConfig = smartSceneConfigLIZJ.getInferenceConfig()) == null || (str = inferenceConfig.businessName) == null) {
            SmartSceneConfig smartSceneConfigLIZJ2 = LIZJ(c1510230pP3);
            if (smartSceneConfigLIZJ2 != null && (sdkConfig = smartSceneConfigLIZJ2.getSdkConfig()) != null && (pitayaMLConfig = sdkConfig.getPitayaMLConfig()) != null) {
                return pitayaMLConfig.getBusinessName();
            }
            return null;
        }
        return str;
    }

    public static final SmartSceneConfig LIZJ(C1510230pP3 c1510230pP3) {
        SmartSceneConfig smartSceneConfig = c1510230pP3.LIZIZ;
        if (smartSceneConfig == null) {
            return null;
        }
        return smartSceneConfig;
    }

    public static final List<String> LJ(C1510230pP3 c1510230pP3) {
        List<CollectingTimingConfig> uploadTimingList;
        SmartSceneConfig smartSceneConfigLIZJ = LIZJ(c1510230pP3);
        if (smartSceneConfigLIZJ != null && (uploadTimingList = smartSceneConfigLIZJ.getUploadTimingList()) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<CollectingTimingConfig> it2 = uploadTimingList.iterator();
            while (it2.hasNext()) {
                String str = it2.next().eventName;
                if (str != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        }
        return null;
    }

    public static final void LIZLLL(C1509310pNZ c1509310pNZ, C1509310pNZ c1509310pNZ2) {
        String str;
        Object obj;
        byte[] bArr;
        float[] fArr;
        Map<String, Object> map;
        Map<String, Object> map2;
        String str2 = null;
        if (c1509310pNZ2 != null) {
            str = c1509310pNZ2.LIZIZ;
        } else {
            str = null;
        }
        c1509310pNZ.LIZIZ = str;
        if (c1509310pNZ2 != null) {
            obj = c1509310pNZ2.LJIIIIZZ;
        } else {
            obj = null;
        }
        c1509310pNZ.LJIIIIZZ = obj;
        if (c1509310pNZ2 != null) {
            bArr = c1509310pNZ2.LJII;
        } else {
            bArr = null;
        }
        c1509310pNZ.LJII = bArr;
        if (c1509310pNZ2 != null) {
            fArr = c1509310pNZ2.LJI;
        } else {
            fArr = null;
        }
        c1509310pNZ.LJI = fArr;
        if (c1509310pNZ2 != null) {
            map = c1509310pNZ2.LJFF;
        } else {
            map = null;
        }
        c1509310pNZ.LJFF = map;
        if (c1509310pNZ2 != null) {
            str2 = c1509310pNZ2.LIZJ;
        }
        c1509310pNZ.LIZJ = str2;
        if (c1509310pNZ2 != null && (map2 = c1509310pNZ2.LJ) != null) {
            c1509310pNZ.LIZIZ().putAll(map2);
        }
        if ((c1509310pNZ2 instanceof C0N33) && c1509310pNZ.LJIIIIZZ == null) {
            c1509310pNZ.LJIIIIZZ = ((C0N33) c1509310pNZ2).LJIIJ;
        }
    }
}
