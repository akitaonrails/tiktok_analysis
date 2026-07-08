package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;

/* JADX INFO: renamed from: X.0pS8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1512140pS8 {
    public static void LIZ() {
        if (C1511480pR4.LJIILLIIL) {
            return;
        }
        C1511480pR4.LJIILLIIL = true;
        try {
            if (TTMStrategyCenterManager.isInit()) {
                TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("client_ai_monitor", C13BV.INSTANCE, null, new C1512170pSB());
            } else {
                TTMStrategyCenterManager.registerTTMStrategyCenterStateListener(new InterfaceC829930Wh5() { // from class: X.0pS9
                    @Override // X.InterfaceC829930Wh5
                    public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
                        if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
                            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
                            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("client_ai_monitor", C13BV.INSTANCE, null, new C1512170pSB());
                        }
                    }
                });
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1337780kuu.LIZ(th, null, 6);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static Integer LIZIZ(String str) {
        if (str != null && str.length() != 0) {
            switch (str.hashCode()) {
                case -1877535187:
                    if (str.equals("play_stop")) {
                        return 103;
                    }
                    break;
                case -1704536429:
                    if (str.equals("play_first_frame")) {
                        return 102;
                    }
                    break;
                case 1168529143:
                    if (str.equals("play_call_playtime")) {
                        return 101;
                    }
                    break;
                case 1274399484:
                    if (str.equals("play_prepare")) {
                        return 100;
                    }
                    break;
            }
            return 200;
        }
        return null;
    }
}
