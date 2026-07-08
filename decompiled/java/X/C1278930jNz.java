package X;

import android.os.Handler;
import com.ss.pusher.core.engine.Transport;
import com.ss.pusher.core.params.PushBase;
import com.ss.pusher.core.transport.LibRTMPTransport;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278930jNz {
    public final PushBase LIZ;
    public final C1278910jNx LIZIZ;
    public final ConcurrentHashMap<String, C1278210jMp> LIZJ = new ConcurrentHashMap<>();
    public long LIZLLL;

    public C1278930jNz(C1277590jLp c1277590jLp, C1278910jNx c1278910jNx) {
        PushBase pushBase = c1277590jLp.LJI.mPushBase;
        this.LIZ = pushBase;
        this.LIZIZ = c1278910jNx;
        Transport.nativeResetSeiMgr();
        pushBase.getClass();
        Transport.nativeSetSeiSourceAble(false);
        Transport.nativeEnableVideoFrameStatistics(pushBase.LJJIII);
    }

    public final int LIZ(final String str, final Object obj, final int i, final boolean z, final boolean z2, final int i2) {
        Handler handler;
        final C1278940jO0 c1278940jO0 = (C1278940jO0) this.LIZIZ.LJFF();
        if (c1278940jO0 != null && c1278940jO0.LJIIL != null && (handler = this.LIZIZ.LIZ) != null) {
            if (C786410Ut5.LJJZZIII(handler, new Runnable() { // from class: X.0jO9
                @Override // java.lang.Runnable
                public final void run() {
                    LibRTMPTransport libRTMPTransport;
                    C1278940jO0 c1278940jO02 = c1278940jO0;
                    String str2 = str;
                    Object obj2 = obj;
                    int i3 = i;
                    boolean z3 = z;
                    boolean z4 = z2;
                    int i4 = i2;
                    C1C7U.LIZ("VeLiveSEIMetaDataWrapper@de0a.sendSeiMessage$1L");
                    if (c1278940jO02 != null && (libRTMPTransport = c1278940jO02.LJIIL) != null) {
                        libRTMPTransport.addSeiField(str2, obj2, i3, 0L, z3, z4, i4);
                    }
                    C1C7U.LIZIZ("VeLiveSEIMetaDataWrapper@de0a.sendSeiMessage$1L");
                }
            })) {
                return 0;
            }
            return -1001;
        }
        return -1002;
    }
}
