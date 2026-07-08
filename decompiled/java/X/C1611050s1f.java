package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDownGradeForInactiveUserExp;
import com.ss.android.ugc.aweme.experiment.LiveHeadAnimDowngradeExperiment;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.ArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0s1f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1611050s1f {
    public static int LIZ = LIZ();

    static {
        InterfaceC1607520rvy interfaceC1607520rvy = new InterfaceC1607520rvy() { // from class: X.0s1e
            @Override // X.InterfaceC1607520rvy
            public final void LIZ(boolean z) {
                int downgradeFraction;
                int i = C1611050s1f.LIZ;
                if (z) {
                    downgradeFraction = LiveHeadAnimDowngradeExperiment.INSTANCE.getDowngradeFraction();
                } else {
                    downgradeFraction = 2;
                }
                C1611050s1f.LIZ = downgradeFraction;
            }
        };
        if (LiveHeadAnimDowngradeExperiment.INSTANCE.isDowngradeEnable()) {
            C1BCM.LIZ.getClass();
            ((ArrayList) C1BCM.LJFF).add(interfaceC1607520rvy);
            C1BCM.LIZIZ();
        }
    }

    public static int LIZ() {
        String str;
        Integer numValueOf;
        LiveHeadAnimDownGradeForInactiveUserExp liveHeadAnimDownGradeForInactiveUserExp = LiveHeadAnimDownGradeForInactiveUserExp.INSTANCE;
        if (!liveHeadAnimDownGradeForInactiveUserExp.isEnable()) {
            return 2;
        }
        FeatureServiceManager.Companion.getClass();
        FeatureProducer producer$default = FeatureServiceManager.getProducer$default(C1510050pOl.LIZ(), "f_solaria_portrait", 0, 2, null);
        Object feature$default = producer$default != null ? FeatureProducer.getFeature$default(producer$default, "livesdk_live_play_label", (JSONObject) null, "LiveHeadAnimDownGrade", (ReturnCode) null, 10, (Object) null) : null;
        if (!(feature$default instanceof String) || (str = (String) feature$default) == null || (numValueOf = Integer.valueOf(CastIntegerProtector.parseInt(str))) == null || numValueOf.intValue() > 0) {
            return 2;
        }
        return liveHeadAnimDownGradeForInactiveUserExp.getDownGradeFraction();
    }
}
