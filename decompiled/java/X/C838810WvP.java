package X;

import com.bytedance.sdk.account.csrf.CsrfMonitorInterceptor;
import com.bytedance.sdk.account.platform.setting.CsrfMonitorSwitch;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0WvP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838810WvP extends C09AY implements Function0<Boolean> {
    public C838810WvP() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        Object objLIZ;
        CsrfMonitorInterceptor.LL.getClass();
        CsrfMonitorSwitch csrfMonitorSwitch = C838830WvR.LIZ;
        CsrfMonitorSwitch csrfMonitorSwitch2 = C838830WvR.LIZ;
        InterfaceC838850WvT interfaceC838850WvT = C310900CGq.LIZ;
        if (interfaceC838850WvT != null && (objLIZ = interfaceC838850WvT.LIZ(CsrfMonitorSwitch.class, csrfMonitorSwitch2)) != null) {
            csrfMonitorSwitch2 = objLIZ;
        }
        return Boolean.valueOf(csrfMonitorSwitch2.enableInterceptor);
    }
}
