package X;

import Y.ARunnableS120S0100000_20;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.utils.VideoFrameStatics;

/* JADX INFO: renamed from: X.0jAb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1270630jAb extends C1269960j9W {
    public final C1267500j5Y LLILLL;
    public final C1269730j99 LLILZ;
    public final Handler LLILZIL;
    public SurfaceTexture LLIZ;
    public k LLIZLLLIL;
    public long LLJI;
    public int LLJIJIL;
    public boolean LLJILJIL;
    public final C1269940j9U LLJILJILJ;
    public final C1273620jFQ LLJILLL;
    public final VideoFrameStatics LLJJ;
    public final ARunnableS120S0100000_20 LLJJI;
    public float[] LLILZLL = C1273510jFF.LIZIZ();
    public final C1270810jAt LLJ = new C1270810jAt();

    public final void LJIIL() {
        try {
            this.LLIZ.updateTexImage();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1274080jGA.LIZ.LIZ("CameraVideoNode.updateTexImage", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0191  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJJI(java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1270630jAb.LJIIJJI(java.lang.String):void");
    }

    public C1270630jAb(C1267500j5Y c1267500j5Y, C1269730j99 c1269730j99) {
        C1273620jFQ c1273620jFQ;
        this.LLILLL = c1267500j5Y;
        this.LLILZ = c1269730j99;
        C1266790j4P c1266790j4P = (C1266790j4P) c1267500j5Y.LIZJ.getService(C1266790j4P.class);
        if (c1266790j4P != null) {
            c1273620jFQ = c1266790j4P.LL;
        } else {
            c1273620jFQ = null;
        }
        this.LLJILLL = c1273620jFQ;
        this.LLJJ = new VideoFrameStatics(5000, 1);
        this.LLJJI = new ARunnableS120S0100000_20(this, 444);
        this.LLJILJILJ = (C1269940j9U) c1267500j5Y.LIZJ.getService(C1269940j9U.class);
        C1268700j7U c1268700j7U = (C1268700j7U) c1267500j5Y.LIZJ.getService(C1268700j7U.class);
        this.LLILZIL = c1268700j7U != null ? c1268700j7U.LIZ() : null;
    }

    public final void LJIIJ(int i, int i2, int i3, SurfaceTexture surfaceTexture) {
        if (C786410Ut5.u3().getName().equals("LiveCoreVideoCaptureThread")) {
            this.LLIZ = surfaceTexture;
            k kVar = new k(i2, i3, EnumC1273550jFJ.OES, i, new ARunnableS120S0100000_20(this, 447));
            this.LLIZLLLIL = kVar;
            kVar.release();
            return;
        }
        throw new AndroidRuntimeException("setTexture() must be called in capture thread");
    }
}
