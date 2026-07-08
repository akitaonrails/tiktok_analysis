package X;

import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStream;
import com.tiktok.strategycenterengine.eventstream.instance.ITTMEventStreamManager;

/* JADX INFO: renamed from: X.0Wgr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C829790Wgr {
    public static final ITTMEventStream LIZ;

    static {
        ITTMEventStream iTTMEventStreamLIZ;
        ITTMEventStreamManager iTTMEventStreamManager = C04TQ.LIZ;
        EnumC829810Wgt enumC829810Wgt = EnumC829810Wgt.FEATURE_CENTER;
        ITTMEventStreamManager iTTMEventStreamManager2 = C04TQ.LIZ;
        if (iTTMEventStreamManager2 == null || (iTTMEventStreamLIZ = iTTMEventStreamManager2.LIZ(enumC829810Wgt)) == null) {
            iTTMEventStreamLIZ = null;
        }
        LIZ = iTTMEventStreamLIZ;
    }
}
