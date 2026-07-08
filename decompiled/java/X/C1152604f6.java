package X;

import com.ss.android.ugc.aweme.portrait.api.IPortraitCenterInitService;
import com.ss.android.ugc.aweme.portrait.impl.PortraitCenterInitServiceImpl;

/* JADX INFO: renamed from: X.04f6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1152604f6 {
    public static final IPortraitCenterInitService LIZ;

    static {
        IPortraitCenterInitService iPortraitCenterInitService;
        Object objLIZ = C04TD.LIZ(IPortraitCenterInitService.class, false);
        if (objLIZ != null) {
            iPortraitCenterInitService = (IPortraitCenterInitService) objLIZ;
        } else {
            if (C04TD.h3 == null) {
                synchronized (IPortraitCenterInitService.class) {
                    if (C04TD.h3 == null) {
                        C04TD.h3 = new PortraitCenterInitServiceImpl();
                    }
                }
            }
            iPortraitCenterInitService = C04TD.h3;
        }
        LIZ = iPortraitCenterInitService;
    }
}
