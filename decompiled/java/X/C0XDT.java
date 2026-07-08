package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.settings.DeviceZtiConfigP2;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XDT, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XDT extends C09AY implements Function0<DeviceZtiConfigP2> {
    public C0XDT() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final DeviceZtiConfigP2 invoke() {
        try {
            C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
            DeviceZtiConfigP2 deviceZtiConfigP2 = C0XDS.LIZ;
            DeviceZtiConfigP2 deviceZtiConfigP22 = (DeviceZtiConfigP2) c0c64LJIILLIIL.LJJII(DeviceZtiConfigP2.class, deviceZtiConfigP2, "device_zti_config_p2", true);
            return deviceZtiConfigP22 != null ? deviceZtiConfigP22 : deviceZtiConfigP2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return C0XDS.LIZ;
        }
    }
}
