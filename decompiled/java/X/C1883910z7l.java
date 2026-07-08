package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipMixLayoutUseSparkLiteOpt;
import com.bytedance.android.livesdk.livesetting.game.partnership.MixLayoutUseSparkLiteOptConfig;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0z7l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1883910z7l {
    public static C1883920z7m LIZ(Context context, InterfaceC1883030z6L interfaceC1883030z6L, String str, LifecycleOwner lifecycleOwner, boolean z, Function1 function1) {
        MixLayoutUseSparkLiteOptConfig mixLayoutUseSparkLiteOptConfigConfig = GameLivePartnershipMixLayoutUseSparkLiteOpt.INSTANCE.config();
        boolean z2 = mixLayoutUseSparkLiteOptConfigConfig.enableSparkLite;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SparkViewWrapper.create useSparkLite:");
        sbLIZ.append(z2);
        C20441214yg.LIZIZ("SparkViewWrapper", C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("SparkViewWrapper.create useSparkLite:");
        sbLIZ2.append(z2);
        C1882870z65.LIZ(interfaceC1883030z6L, "SparkViewWrapper", C2188811AlT.LIZIZ(sbLIZ2));
        C1883920z7m c1883920z7m = new C1883920z7m(z2);
        if (z2) {
            c1883920z7m.LIZJ = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).NN(context, str, lifecycleOwner, z, new C1883930z7n(function1, mixLayoutUseSparkLiteOptConfigConfig));
            c1883920z7m.LIZIZ = null;
            return c1883920z7m;
        }
        c1883920z7m.LIZIZ = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(context, str, lifecycleOwner, z, new C1883900z7k(function1));
        c1883920z7m.LIZJ = null;
        return c1883920z7m;
    }
}
