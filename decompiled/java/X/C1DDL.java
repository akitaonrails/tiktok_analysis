package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.feed.platform.metric.model.DeviceInfo;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DDL, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DDL extends C09AY implements Function0<C1DDE> {
    public C1DDL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1DDE] */
    @Override // kotlin.jvm.functions.Function0
    public final C1DDE invoke() {
        return new InterfaceC20673715v5<C1DDI>() { // from class: X.1DDE
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC20673715v5
            public final void LIZ(C20673615v4 c20673615v4) {
                C1DD7 c1dd7 = ((C1DDI) c20673615v4.LIZIZ).LIZJ;
                final DeviceInfo deviceInfo = new DeviceInfo(c1dd7.LIZ, c1dd7.LIZIZ, c1dd7.LIZJ, c1dd7.LIZLLL, c1dd7.LJ, c1dd7.LJFF);
                C823050WQl.LJFF().submit(new Runnable() { // from class: X.18KZ
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("DeviceInfoCache@50ae.flush$1");
                        try {
                            C21265818Ka c21265818Ka = C21265818Ka.LIZ;
                            DeviceInfo deviceInfo2 = deviceInfo;
                            if (deviceInfo2 != null) {
                                synchronized (c21265818Ka) {
                                    C12848051a.LIZIZ((Keva) C21265818Ka.LIZIZ.getValue(), C105700ad.LIZIZ(deviceInfo2), "device_info");
                                }
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("DeviceInfoCache@50ae.flush$1");
                    }
                });
            }
        };
    }
}
