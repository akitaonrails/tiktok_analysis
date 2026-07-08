package X;

import com.bytedance.android.starship.engine.reasoning.IStarShipInit;
import com.bytedance.android.starship.service.StarShipInitService;

/* JADX INFO: renamed from: X.0k79, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1306930k79 {
    public static final IStarShipInit LIZ;

    static {
        IStarShipInit iStarShipInit;
        Object objLIZ = C04TD.LIZ(IStarShipInit.class, false);
        if (objLIZ != null) {
            iStarShipInit = (IStarShipInit) objLIZ;
        } else {
            if (C04TD.LJFF == null) {
                synchronized (IStarShipInit.class) {
                    if (C04TD.LJFF == null) {
                        C04TD.LJFF = new StarShipInitService();
                    }
                }
            }
            iStarShipInit = C04TD.LJFF;
        }
        LIZ = iStarShipInit;
    }
}
