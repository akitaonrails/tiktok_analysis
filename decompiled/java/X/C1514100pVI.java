package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0pVI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1514100pVI implements InterfaceC829930Wh5 {
    @Override // X.InterfaceC829930Wh5
    public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
        if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
            C1514090pVH.LIZ.getClass();
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey(C1514090pVH.LJFF, new ArrayList(), null, new C1514110pVJ());
            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
        }
    }
}
