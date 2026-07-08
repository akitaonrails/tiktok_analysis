package X;

import com.bytedance.pitaya.api.PitayaCoreFactory;
import com.bytedance.pitaya.api.feature.FeatureCoreFactory;
import com.bytedance.pitaya.api.feature.IFeatureCore;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS219S0000000_30;

/* JADX INFO: renamed from: X.148I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C148I {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(56));

    public static IFeatureCore LIZ() {
        C844470XAv.LIZ.getClass();
        return FeatureCoreFactory.INSTANCE.getFeatureCore(String.valueOf(C844470XAv.LJIIJ));
    }

    public static boolean LIZIZ() {
        C844470XAv.LIZ.getClass();
        if (PitayaCoreFactory.getCore(String.valueOf(C844470XAv.LJIIJ)).isReady()) {
            return true;
        }
        try {
            AnonymousClass1455.LIZ.getClass();
            AnonymousClass1455.LJ("AdPitayaService", null);
            return false;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            return false;
        }
    }
}
