package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS28S0400000_20;
import Y.ARunnableS53S0300000_20;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.livestreamv2.filter.bmf.BmfVideoDenoiseFilterImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jC5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1271550jC5 extends C1269970j9X {
    public final C1267500j5Y LLILLL;
    public C1266350j3h LLILZ;
    public Handler LLILZIL;
    public BmfVideoDenoiseFilterImpl LLILZLL;
    public k LLIZ;
    public C1267810j63 LLIZLLLIL;
    public C1269940j9U LLJ;
    public C1273620jFQ LLJI;
    public final boolean LLJIJIL = true;
    public final C1271580jC8 LLJILJIL = new C1271580jC8();

    @Override // X.C1271610jCB
    public final void release() {
        Handler handler = this.LLILZIL;
        if (handler != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS120S0100000_20(this, 178));
        }
        this.LLILZ = null;
        this.LLILZIL = null;
        this.LLIZLLLIL = null;
        this.LLJ = null;
        this.LLJI = null;
        this.LLIZ = null;
    }

    @Override // X.C1271610jCB
    public final String LIZLLL() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BmfDenoiseNode_");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1271550jC5(C1267500j5Y c1267500j5Y, C1266350j3h c1266350j3h) {
        this.LLILLL = c1267500j5Y;
        this.LLILZ = c1266350j3h;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018b A[PHI: r11
      0x018b: PHI (r11v4 boolean) = (r11v3 boolean), (r11v3 boolean), (r11v3 boolean), (r11v6 boolean), (r11v6 boolean) binds: [B:35:0x00b4, B:37:0x00c4, B:39:0x00c8, B:79:0x0187, B:49:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(com.ss.ttlivestreamer.core.buffer.VideoFrame r24, android.os.Bundle r25) throws java.lang.CloneNotSupportedException {
        /*
            Method dump skipped, instruction units count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1271550jC5.LJIIJJI(com.ss.ttlivestreamer.core.buffer.VideoFrame, android.os.Bundle):void");
    }

    @Override // X.C1269970j9X, X.InterfaceC1269980j9Y
    public final void onData(VideoFrame videoFrame, Bundle bundle) {
        this.LLILLL.LIZ.LJIIIIZZ();
        if (this.LLJIJIL && !bundle.getBoolean("skip_crop_and_scale", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("BmfDenoise_");
            sbLIZ.append(this.LL);
            videoFrame.retain(C2188811AlT.LIZIZ(sbLIZ));
            Handler handler = this.LLILZIL;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS53S0300000_20(this, videoFrame, bundle, 31));
                return;
            }
            return;
        }
        bundle.putBoolean("bmf_denoise_result", false);
        LJIIIZ(videoFrame, bundle);
    }

    public final void LJIIJ(Context context, JSONObject jSONObject, InterfaceC1283880jVy interfaceC1283880jVy) {
        Thread thread;
        Looper looper;
        Thread threadU3 = C786410Ut5.u3();
        Handler handler = this.LLILZIL;
        if (handler != null && (looper = handler.getLooper()) != null) {
            thread = looper.getThread();
        } else {
            thread = null;
        }
        if (!Intrinsics.LJFF(threadU3, thread)) {
            Handler handler2 = this.LLILZIL;
            if (handler2 != null) {
                C786410Ut5.LJJZZIII(handler2, new ARunnableS28S0400000_20(this, context, jSONObject, interfaceC1283880jVy, 6));
                return;
            }
            return;
        }
        if (this.LLILZLL == null) {
            BmfVideoDenoiseFilterImpl bmfVideoDenoiseFilterImpl = new BmfVideoDenoiseFilterImpl(context, jSONObject, interfaceC1283880jVy);
            this.LLILZLL = bmfVideoDenoiseFilterImpl;
            bmfVideoDenoiseFilterImpl.setHandler(this.LLILZIL);
        }
    }
}
