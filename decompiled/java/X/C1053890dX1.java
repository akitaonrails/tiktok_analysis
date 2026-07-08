package X;

import com.ss.android.deviceregister.DeviceRegisterManager;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0dX1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1053890dX1 extends C09AY implements Function0<C1053900dX2> {
    public C1053890dX1() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0dX2] */
    @Override // kotlin.jvm.functions.Function0
    public final C1053900dX2 invoke() {
        return new InterfaceC1053960dX8() { // from class: X.0dX2
            @Override // X.InterfaceC1053960dX8
            public final String getDeviceId() {
                String deviceId = DeviceRegisterManager.getDeviceId();
                return deviceId == null ? "" : deviceId;
            }
        };
    }
}
