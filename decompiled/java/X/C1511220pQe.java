package X;

import com.ss.android.ugc.aweme.power.IPowerModeHandler;
import com.ss.android.ugc.aweme.power.powersave.PowerModeHandlerProxy;

/* JADX INFO: renamed from: X.0pQe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1511220pQe implements IPowerModeHandler {
    public static final C1511220pQe LIZIZ = new C1511220pQe();
    public final /* synthetic */ IPowerModeHandler LIZ;

    @Override // com.ss.android.ugc.aweme.power.IPowerModeHandler
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    public C1511220pQe() {
        IPowerModeHandler iPowerModeHandler;
        Object objLIZ = C04TD.LIZ(IPowerModeHandler.class, false);
        if (objLIZ != null) {
            iPowerModeHandler = (IPowerModeHandler) objLIZ;
        } else {
            if (C04TD.i3 == null) {
                synchronized (IPowerModeHandler.class) {
                    if (C04TD.i3 == null) {
                        C04TD.i3 = new PowerModeHandlerProxy();
                    }
                }
            }
            iPowerModeHandler = C04TD.i3;
        }
        this.LIZ = iPowerModeHandler;
    }
}
