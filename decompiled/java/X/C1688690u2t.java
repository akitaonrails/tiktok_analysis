package X;

import android.app.Activity;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.adaptation.saa.CreativeToolContainerScene;
import com.ss.android.ugc.aweme.adaptation.saa.SAAActivity;
import com.ss.android.ugc.aweme.adaptation.saa.SAASceneWrapperActivity;
import com.ss.android.ugc.aweme.experiment.CreativeNetworkDowngradeConfig;
import com.ss.android.ugc.aweme.experiment.bp;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AFwS214S0000000_25;

/* JADX INFO: renamed from: X.0u2t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688690u2t {
    public static final List<Class<? extends Activity>> LIZ = C1697810uHb.LJIIJJI(SAAActivity.class, SAASceneWrapperActivity.class);
    public static final List<Class<? extends Scene>> LIZIZ = Collections.singletonList(CreativeToolContainerScene.class);
    public static int LIZJ;
    public static final CreativeNetworkDowngradeConfig LIZLLL;
    public static final C01GW LJ;

    static {
        bp.LIZ.getClass();
        LIZLLL = (CreativeNetworkDowngradeConfig) bp.LIZJ.getValue();
        LJ = C452501pT.LIZIZ(AFwS214S0000000_25.get$arr$(461));
    }

    public static boolean LIZ() {
        C201955140j.LJIILJJIL(C201967140v.LIZIZ, "NetworkDowngradeStrategy exitCameraFirstFrame");
        CreativeNetworkDowngradeConfig creativeNetworkDowngradeConfig = LIZLLL;
        if (!creativeNetworkDowngradeConfig.downgradeUntilCameraFirstFrame) {
            return false;
        }
        C1490190osj c1490190osj = C1490190osj.LIZIZ;
        EnumC2262571Dh9 enumC2262571Dh9 = EnumC2262571Dh9.BIZ_CREATIVE_ENTER;
        c1490190osj.LIZJ(enumC2262571Dh9);
        c1490190osj.LIZLLL(enumC2262571Dh9);
        if (!creativeNetworkDowngradeConfig.downgradeUntilExitCreative) {
            return true;
        }
        c1490190osj.LIZ(EnumC2262571Dh9.BIZ_CREATIVE_PAGE);
        return true;
    }

    public static void LIZIZ() {
        LIZJ++;
        C201967140v c201967140v = C201967140v.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NetworkDowngradeStrategy onActivityCreated ");
        sbLIZ.append(LIZJ);
        C201955140j.LJIILJJIL(c201967140v, C2188811AlT.LIZIZ(sbLIZ));
    }
}
