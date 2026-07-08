package X;

import Y.ARunnableS89S0200000_20;
import android.os.Bundle;
import android.os.Handler;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;

/* JADX INFO: renamed from: X.0jC3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271530jC3 extends C1267740j5w {
    public final C1267500j5Y LLILLJJLI;
    public final TTLHAbnormalDetectorJava LLILLL;
    public final Handler LLILZ;

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbnormalDetectNode_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1271530jC3(C1267500j5Y c1267500j5Y, TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava) {
        Handler handlerLIZIZ;
        this.LLILLJJLI = c1267500j5Y;
        this.LLILLL = tTLHAbnormalDetectorJava;
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        if (c1268700j7U != null) {
            handlerLIZIZ = c1268700j7U.LIZIZ();
        } else {
            handlerLIZIZ = null;
        }
        this.LLILZ = handlerLIZIZ;
    }

    @Override // X.C1267740j5w, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        this.LLILLJJLI.LIZ.LJIIIIZZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AbnormalDetect_");
        sbLIZ.append(this.LL);
        videoFrame.retain(C2188811AlT.LIZIZ(sbLIZ));
        Handler handler = this.LLILZ;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(this, videoFrame, 109));
        }
    }
}
