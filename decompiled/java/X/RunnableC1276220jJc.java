package X;

import Y.ACallableS425S0100000_20;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Surface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.opengl.GLThread;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0jJc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class RunnableC1276220jJc implements Runnable {
    public final GLThread LL;
    public final Handler LLILLJJLI;
    public final InterfaceC1276250jJf LLILLL;
    public final Map<Surface, SurfaceTextureHelper> LLILZ;
    public C1276200jJa LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final int LLIZLLLIL;
    public final int LLJ;
    public final int LLJI;
    public final int LLJIJIL;
    public final long LLJILJIL;
    public Surface LLJILJILJ;
    public long LLJILLL;
    public int LLJJ = -1;
    public final Object LLJJI = new Object();
    public boolean LLJJIII = false;

    public final synchronized void LJFF() {
        synchronized (this.LLJJI) {
            try {
                LIZJ();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ() {
        if (this.LLJJIII) {
            this.LLILLJJLI.removeCallbacks(this);
            return;
        }
        this.LLILLJJLI.removeCallbacks(this);
        if (AVLog.enableLogToIODevice2()) {
            AVLog.logToIODevice2(5, "ShortVideoPushManager", "Short video frame comes.", null, 61, 10000);
        }
        InterfaceC1276250jJf interfaceC1276250jJf = this.LLILLL;
        if (interfaceC1276250jJf != null) {
            interfaceC1276250jJf.LIZ(this.LLJJ, this.LLJI, this.LLJIJIL, TimeUtils.nativeNanoTime() / 1000);
        }
        C786410Ut5.LJLIIL(100L, this.LLILLJJLI, this);
    }

    public final void LIZJ() {
        if (this.LLJJIII) {
            return;
        }
        this.LLJJIII = true;
        this.LLJILJILJ = null;
        Map<Surface, SurfaceTextureHelper> map = this.LLILZ;
        if (map != null && ((HashMap) map).size() >= 1) {
            for (Map.Entry entry : ((HashMap) this.LLILZ).entrySet()) {
                Surface surface = (Surface) entry.getKey();
                if (surface != null) {
                    surface.release();
                }
                SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) entry.getValue();
                if (surfaceTextureHelper != null) {
                    surfaceTextureHelper.dispose();
                }
            }
            ((HashMap) this.LLILZ).clear();
        }
        C1276200jJa c1276200jJa = this.LLILZIL;
        if (c1276200jJa != null) {
            synchronized (c1276200jJa) {
                Handler handler = c1276200jJa.LJII;
                if (handler != null) {
                    C1283100jUi.LIZIZ(handler, new ARunnableS120S0100000_20(c1276200jJa, 119));
                }
            }
            this.LLILZIL = null;
        }
        C1273730jFb.LIZLLL(this.LL);
    }

    public final Surface LJ() {
        final SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) C1283100jUi.LIZ(this.LLILLJJLI, new ACallableS425S0100000_20(this, 10));
        if (surfaceTextureHelper == null) {
            return null;
        }
        SurfaceTexture surfaceTexture = surfaceTextureHelper.getSurfaceTexture();
        surfaceTexture.setDefaultBufferSize(this.LLIZLLLIL, this.LLJ);
        final Surface surface = new Surface(surfaceTexture);
        surfaceTextureHelper.startListening(new InterfaceC1270400jAE() { // from class: X.0jJb
            /* JADX WARN: Removed duplicated region for block: B:22:0x0076 A[Catch: all -> 0x0115, TryCatch #0 {all -> 0x0115, blocks: (B:4:0x0009, B:6:0x0012, B:8:0x0018, B:9:0x0041, B:10:0x0046, B:12:0x0048, B:14:0x0057, B:18:0x0068, B:19:0x006e, B:21:0x0070, B:23:0x007c, B:27:0x008b, B:29:0x00bf, B:30:0x00ca, B:31:0x00d8, B:33:0x00da, B:35:0x010c, B:36:0x0112, B:38:0x0114, B:22:0x0076), top: B:43:0x0009 }] */
            @Override // X.InterfaceC1270400jAE
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LLII(long r20, final int r22, float[] r23) {
                /*
                    Method dump skipped, instruction units count: 283
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1276210jJb.LLII(long, int, float[]):void");
            }
        });
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getSurface(");
        sbLIZ.append(surface);
        sbLIZ.append(")");
        AVLog.w("ShortVideoPushManager", C2188811AlT.LIZIZ(sbLIZ));
        ((HashMap) this.LLILZ).put(surface, surfaceTextureHelper);
        return surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("ShortVideoPushManager@612e.run");
        try {
            LIZIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ShortVideoPushManager@612e.run");
    }

    public final void finalize() {
        LJFF();
    }

    public final void LIZLLL(Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("releaseSurface(");
        sbLIZ.append(surface);
        sbLIZ.append(")");
        AVLog.iow("ShortVideoPushManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI.removeCallbacks(this);
        if (this.LLJILJILJ == surface) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("can not release surface cause active(");
            sbLIZ2.append(surface);
            sbLIZ2.append(")");
            AVLog.w("ShortVideoPushManager", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        if (this.LLILZ != null && surface != null) {
            surface.release();
            SurfaceTextureHelper surfaceTextureHelper = (SurfaceTextureHelper) ((HashMap) this.LLILZ).get(surface);
            if (surfaceTextureHelper != null) {
                surfaceTextureHelper.dispose();
            }
            ((HashMap) this.LLILZ).remove(surface);
        }
    }

    public final void LIZ(int i, int i2, Surface surface) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activeSurface(");
        sbLIZ.append(i);
        sbLIZ.append(",");
        sbLIZ.append(i2);
        sbLIZ.append("),surface");
        sbLIZ.append(surface);
        AVLog.iow("ShortVideoPushManager", C2188811AlT.LIZIZ(sbLIZ));
        synchronized (this.LLILZ) {
            try {
                this.LLJILJILJ = surface;
                this.LLILZLL = i;
                this.LLIZ = i2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public RunnableC1276220jJc(Context context, int i, int i2, int i3, InterfaceC1276250jJf interfaceC1276250jJf) {
        this.LLIZLLLIL = 720;
        this.LLJ = 1280;
        AVLog.w("ShortVideoPushManager", "ShortVideoPushManager ctor");
        AVLog.logKibana(4, "ShortVideoPushManager", "ShortVideoPushManager ctor", null);
        this.LLILLL = interfaceC1276250jJf;
        this.LLJILJIL = LSPassThroughRecordSizeConfig.DEFAULT / i3;
        this.LLJI = i;
        this.LLJIJIL = i2;
        this.LLILZ = new HashMap();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            this.LLIZLLLIL = displayMetrics.widthPixels;
            this.LLJ = displayMetrics.heightPixels;
        }
        GLThread gLThreadLIZ = C1273730jFb.LIZ(0, "GL-ShortVideo");
        this.LL = gLThreadLIZ;
        gLThreadLIZ.start();
        Handler handler = gLThreadLIZ.getHandler();
        this.LLILLJJLI = handler;
        C1276200jJa c1276200jJa = new C1276200jJa(handler, EnumC1152960g6o.MODE_FIT);
        this.LLILZIL = c1276200jJa;
        c1276200jJa.LIZLLL = i2;
        c1276200jJa.LIZJ = i;
        c1276200jJa.LJ = true;
    }
}
