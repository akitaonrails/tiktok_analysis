package X;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS579S0100000_35;

/* JADX INFO: renamed from: X.1DNk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2254861DNk {
    public final Function0<TextureView> LIZ;
    public final LinkedList<C1DLI> LIZIZ = new LinkedList<>();
    public Surface LIZJ;
    public boolean LIZLLL;

    public C2254861DNk(AwS579S0100000_35 awS579S0100000_35) {
        this.LIZ = awS579S0100000_35;
        ((TextureView) awS579S0100000_35.invoke()).setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: X.1DNd
            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                C2254861DNk c2254861DNk = this.LL;
                c2254861DNk.LIZLLL = true;
                synchronized (c2254861DNk.LIZIZ) {
                    try {
                        Iterator<C1DLI> it2 = c2254861DNk.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                this.LL.LIZJ.release();
                return true;
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                C2254861DNk c2254861DNk = this.LL;
                c2254861DNk.LIZLLL = false;
                c2254861DNk.LIZJ = new Surface(surfaceTexture);
                C2254861DNk c2254861DNk2 = this.LL;
                synchronized (c2254861DNk2.LIZIZ) {
                    try {
                        Iterator<C1DLI> it2 = c2254861DNk2.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().LIZIZ(c2254861DNk2.LIZJ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
                C2254861DNk c2254861DNk = this.LL;
                synchronized (c2254861DNk.LIZIZ) {
                    try {
                        Iterator<C1DLI> it2 = c2254861DNk.LIZIZ.iterator();
                        while (it2.hasNext()) {
                            it2.next().LLIIZ(i, i2, c2254861DNk.LIZJ);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
        });
        this.LIZLLL = false;
    }
}
