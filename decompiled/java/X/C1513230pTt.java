package X;

import com.ss.android.ugc.aweme.ml.api.SmartOHRService;
import com.ss.android.ugc.aweme.ml.impl.ohr.SmartOHRServiceImpl;

/* JADX INFO: renamed from: X.0pTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513230pTt {
    public static final SmartOHRService LIZ;
    public static final InterfaceC1513600pUU LIZIZ;

    static {
        SmartOHRService smartOHRService;
        Object objLIZ = C04TD.LIZ(SmartOHRService.class, false);
        if (objLIZ != null) {
            smartOHRService = (SmartOHRService) objLIZ;
        } else {
            if (C04TD.F2 == null) {
                synchronized (SmartOHRService.class) {
                    if (C04TD.F2 == null) {
                        C04TD.F2 = new SmartOHRServiceImpl();
                    }
                }
            }
            smartOHRService = C04TD.F2;
        }
        LIZ = smartOHRService;
        LIZIZ = (InterfaceC1513600pUU) smartOHRService;
    }
}
