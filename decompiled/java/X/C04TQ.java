package X;

import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStreamManager;
import com.tiktok.strategycenterengineimpl.eventstream.TTMEventStreamManagerImpl;

/* JADX INFO: renamed from: X.04TQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C04TQ {
    public static final ITTMEventStreamManager LIZ;

    static {
        ITTMEventStreamManager iTTMEventStreamManager;
        Object objLIZ = C04TD.LIZ(ITTMEventStreamManager.class, false);
        if (objLIZ != null) {
            iTTMEventStreamManager = (ITTMEventStreamManager) objLIZ;
        } else {
            if (C04TD.g7 == null) {
                synchronized (ITTMEventStreamManager.class) {
                    if (C04TD.g7 == null) {
                        C04TD.g7 = new TTMEventStreamManagerImpl();
                    }
                }
            }
            iTTMEventStreamManager = C04TD.g7;
        }
        LIZ = iTTMEventStreamManager;
    }
}
