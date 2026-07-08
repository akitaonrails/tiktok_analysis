package X;

import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0eYj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1093390eYj implements InterfaceC829930Wh5 {
    public final /* synthetic */ Function0<Unit> LIZ;

    public C1093390eYj(Function0<Unit> function0) {
        this.LIZ = function0;
    }

    @Override // X.InterfaceC829930Wh5
    public final void LIZ(EnumC829940Wh6 enumC829940Wh6) {
        if (enumC829940Wh6 == EnumC829940Wh6.TTMStateInitFinish) {
            C1093420eYm.LIZ = true;
            C227400uG.LIZ("LiveTTMStrategyManager", "TTM engine init finished");
            this.LIZ.invoke();
            TTMStrategyCenterManager.deregisterTTMStrategyCenterStateListener(this);
        }
    }
}
