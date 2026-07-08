package X;

import com.ss.android.ugc.aweme.ml.feature.expriment.StrategyEventConfig;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import kotlin.jvm.internal.AwS107S1000000_23;

/* JADX INFO: renamed from: X.0pdw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519460pdw {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ() {
        C01GW c01gw = C1519470pdx.LIZIZ;
        if (((StrategyEventConfig) c01gw.getValue()).open) {
            for (String str : ((StrategyEventConfig) c01gw.getValue()).scenes) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("initTTMStragtegyEvent sceneKeys:");
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
                final AwS107S1000000_23 awS107S1000000_23 = new AwS107S1000000_23(str, 1);
                if (TTMStrategyCenterManager.isInit()) {
                    awS107S1000000_23.invoke();
                } else {
                    TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0pdv
                        @Override // X.InterfaceC829930Wh5
                        public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                            if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                                awS107S1000000_23.invoke();
                            }
                        }
                    });
                }
            }
        }
    }
}
