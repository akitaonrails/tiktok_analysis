package X;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.view.PixelCopy;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1APe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2178881APe implements C0Q5Q {
    public final TextureView LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public boolean LJ;
    public boolean LJFF;
    public int LJI;
    public Bitmap LJII;
    public Function1<? super Bitmap, Unit> LJIIIIZZ;
    public final BPEAHandler LIZLLL = new BPEAHandler(Looper.getMainLooper());
    public final RunnableC2178861APc LJIIIZ = new Runnable() { // from class: X.1APc
        public final void LIZ() {
            C2178881APe c2178881APe = this.LL;
            if (c2178881APe.LJ) {
                if (!c2178881APe.LIZ.isAvailable()) {
                    this.LL.LIZ(200L);
                    return;
                }
                C2178881APe c2178881APe2 = this.LL;
                if (c2178881APe2.LJFF) {
                    c2178881APe2.LIZ(200L);
                    return;
                }
                if (c2178881APe2.LIZIZ <= 0 || c2178881APe2.LIZJ <= 0) {
                    return;
                }
                c2178881APe2.LJFF = true;
                final long jCurrentTimeMillis = System.currentTimeMillis();
                Bitmap.Config config = Build.VERSION.SDK_INT == 28 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
                C2178881APe c2178881APe3 = this.LL;
                final Bitmap bitmapCreateBitmap = c2178881APe3.LJII;
                if (bitmapCreateBitmap == null || bitmapCreateBitmap.getWidth() != c2178881APe3.LIZIZ || bitmapCreateBitmap.getHeight() != c2178881APe3.LIZJ) {
                    C2178881APe c2178881APe4 = this.LL;
                    bitmapCreateBitmap = Bitmap.createBitmap(c2178881APe4.LIZIZ, c2178881APe4.LIZJ, config);
                    this.LL.LJII = bitmapCreateBitmap;
                }
                final Surface surface = new Surface(this.LL.LIZ.getSurfaceTexture());
                final C2178881APe c2178881APe5 = this.LL;
                c2178881APe5.LJI++;
                C1322890kWt.LIZIZ(surface, bitmapCreateBitmap, new PixelCopy.OnPixelCopyFinishedListener() { // from class: X.1APd
                    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                    public final void onPixelCopyFinished(int i) {
                        c2178881APe5.LJFF = false;
                        if (i == 0) {
                            try {
                                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                C2178881APe c2178881APe6 = c2178881APe5;
                                if (C650560PfS.LIZ) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("capture video frame bitmap success for >=24, w*h:");
                                    sbLIZ.append(c2178881APe6.LIZIZ);
                                    sbLIZ.append('*');
                                    sbLIZ.append(c2178881APe6.LIZJ);
                                    sbLIZ.append(", count:");
                                    sbLIZ.append(c2178881APe6.LJI);
                                    sbLIZ.append(", duration:");
                                    sbLIZ.append(jCurrentTimeMillis2);
                                    sbLIZ.append(" ms");
                                    C2188811AlT.LIZIZ(sbLIZ);
                                }
                                Function1<? super Bitmap, Unit> function1 = c2178881APe5.LJIIIIZZ;
                                if (function1 != null) {
                                    function1.invoke(bitmapCreateBitmap);
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                surface.release();
                                c2178881APe5.LIZ(200L);
                                throw th;
                            }
                        }
                        surface.release();
                        c2178881APe5.LIZ(200L);
                    }
                }, c2178881APe5.LIZLLL, CertProviderManagerKt.findCert("bpea-search_capture_video_frame", 1476435998));
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("VideoFrameHelper@e791.api24Task$1");
            try {
                LIZ();
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("VideoFrameHelper@e791.api24Task$1");
        }
    };

    @Override // X.C0Q5Q
    public final void stop() {
        this.LJ = false;
        this.LIZLLL.removeCallbacks(this.LJIIIZ);
        this.LJFF = false;
        this.LJII = null;
    }

    public final void LIZ(long j) {
        if (!this.LJ || this.LJI >= 3) {
            return;
        }
        this.LIZLLL.removeCallbacks(this.LJIIIZ);
        C786410Ut5.LJLIIL(j, this.LIZLLL, this.LJIIIZ);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.1APc] */
    public C2178881APe(TextureView textureView, int i, int i2) {
        this.LIZ = textureView;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
