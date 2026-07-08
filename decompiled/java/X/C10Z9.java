package X;

import com.bytedance.pumbaa.hybrid.rasp.api.IRaspService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.10Z9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10Z9 implements InterfaceC19271510aP {
    @Override // X.InterfaceC19271510aP
    public final String LIZ() {
        return "rasp";
    }

    @Override // X.InterfaceC19271510aP
    public final String getName() {
        return "rasp_parse_handler";
    }

    @Override // X.InterfaceC19271510aP
    public final boolean LIZIZ(int i, String str) {
        Boolean boolLIZIZ;
        IRaspService iRaspService = (IRaspService) ServiceManager.get().getService(IRaspService.class);
        if (iRaspService != null && (boolLIZIZ = iRaspService.LIZIZ(str, "qrcode")) != null) {
            return boolLIZIZ.booleanValue();
        }
        return false;
    }
}
