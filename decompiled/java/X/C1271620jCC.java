package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import android.os.Bundle;
import android.os.Handler;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.opengl.GlRenderDrawer;

/* JADX INFO: renamed from: X.0jCC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271620jCC extends C1269970j9X {
    public final C1267500j5Y LLILZ;
    public C1266350j3h LLILZIL;
    public Handler LLILZLL;
    public k LLIZ;
    public C1267810j63 LLIZLLLIL;
    public C1269940j9U LLJ;
    public C1273620jFQ LLJI;
    public GlRenderDrawer LLJILJIL;
    public C1273120jEc LLJILJILJ;
    public C1271630jCD LLJJ;
    public int LLJJI;
    public boolean LLJJIII;
    public final String LLILLL = "crop_and_scale";
    public final boolean LLJIJIL = true;
    public final C1271580jC8 LLJILLL = new C1271580jC8();

    @Override // X.C1271610jCB
    public final void release() {
        Handler handler = this.LLILZLL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 184));
        }
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        return this.LLILLL;
    }

    public static void LJIIJJI(float[] fArr) {
        if (fArr != null && fArr.length >= 16) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("m0=");
            sbLIZ.append(fArr[0]);
            sbLIZ.append(",m5=");
            sbLIZ.append(fArr[5]);
            sbLIZ.append(",m12=");
            sbLIZ.append(fArr[12]);
            sbLIZ.append(",m13=");
            sbLIZ.append(fArr[13]);
            sbLIZ.append(",m15=");
            sbLIZ.append(fArr[15]);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:98:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.ss.ttlivestreamer.core.buffer.VideoFrame r24, android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 738
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271620jCC.LJIIJ(com.ss.ttlivestreamer.core.buffer.VideoFrame, android.os.Bundle):void");
    }

    @Override // X.C1269970j9X, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        this.LLILZ.LIZ.LJIIIIZZ();
        if (this.LLJIJIL && !bundle.getBoolean("skip_crop_and_scale", false) && !bundle.getBoolean("bmf_denoise_result", false) && !bundle.getBoolean("bmf_stream_hd_result", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CropAndScale_");
            sbLIZ.append(this.LL);
            videoFrame.retain(C2188811AlT.LIZIZ(sbLIZ));
            Handler handler = this.LLILZLL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS53S0300000_20(this, videoFrame, bundle, 36));
                return;
            }
            return;
        }
        this.LLILZ.LIZ.LJIIIIZZ();
        LJIIIZ(videoFrame, bundle);
    }

    public C1271620jCC(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h, Handler handler) {
        this.LLILZ = c1267500j5Y;
        this.LLILZIL = c1266350j3h;
        this.LLILZLL = handler;
    }
}
