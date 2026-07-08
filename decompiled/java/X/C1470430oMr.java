package X;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceControl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttm.player.LoadControl;
import com.ss.ttm.player.TTPlayerClient;
import com.ss.ttm.player.s;
import com.ss.ttm.player.x;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0oMr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470430oMr implements InterfaceC1467950oIr {
    public TTPlayerClient LIZ;
    public boolean LIZIZ;
    public String LIZJ = "";

    @Override // X.InterfaceC1470080oMI
    public final boolean LJFF() {
        return this.LIZ instanceof C20547315ah;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJII() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJI();
        }
    }

    public final void LJIIJJI() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LIZIZ.LJII.LIZ();
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }

    public final Surface LJIILJJIL() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient == null) {
            return null;
        }
        tTPlayerClient.LLJJIII.lock();
        try {
            Surface surfaceLIZLLL = tTPlayerClient.LJJIJIIJIL() ? tTPlayerClient.LLJJJ.LIZLLL() : null;
            tTPlayerClient.LLJJIII.unlock();
            return surfaceLIZLLL;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            tTPlayerClient.LLJJIII.unlock();
            throw th;
        }
    }

    public final int LJIILL() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJJIIZI();
        }
        return 0;
    }

    public final boolean LJIIZILJ() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJJIJIIJI();
        }
        return false;
    }

    public final void LJIJ() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJIL();
        }
    }

    public final void LJIJI() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJIZ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final int getCurrentPosition() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getDuration() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LIZIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getPlayerType() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJFF();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getVideoHeight() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJI();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getVideoWidth() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJII();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final boolean isPlaying() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJIIIIZZ();
        }
        return false;
    }

    @Override // X.InterfaceC1470080oMI
    public final void pause() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIIIZ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void prepareAsync() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIIJ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void release() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void reset() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJJ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void start() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJIIJ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void stop() {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJIIJZLJL();
        }
    }

    public static long LJIIL(int i) {
        try {
            Class<?> clsLIZ = C1469080oKg.LIZ(200, "com.ss.ttm.player.TTPlayerClient");
            Method declaredMethod = clsLIZ.getDeclaredMethod("getDemuxerFactory", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(clsLIZ, Integer.valueOf(i));
            if (objInvoke == null) {
                return 0L;
            }
            return ((Long) objInvoke).longValue();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0L;
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void LIZLLL(s sVar) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJ(sVar);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJ(boolean z) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIILLIIL(z);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final String LJIIIZ(int i) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJ(i);
        }
        return null;
    }

    public final void LJIJJ(String str) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJJJI();
        }
    }

    public final void LJIJJLI(InterfaceC1467440oI2 interfaceC1467440oI2) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LIZIZ.LJIJJLI(interfaceC1467440oI2);
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }

    public final void LJJ(InterfaceC1470980oNk interfaceC1470980oNk) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LIZIZ.LIZJ = interfaceC1470980oNk;
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }

    public final void LJJII(LoadControl loadControl) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient == null) {
            return;
        }
        tTPlayerClient.setLoadControl(loadControl);
    }

    public final void LJJIII(C1467600oII c1467600oII) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient == null) {
            return;
        }
        tTPlayerClient.setMaskInfo(c1467600oII);
    }

    public final void LJJIIJ(InterfaceC1467800oIc interfaceC1467800oIc) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJLLL = interfaceC1467800oIc;
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LJFF(3L);
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }

    public final void LJJIIJZLJL(C1698530uIl c1698530uIl) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJJJL(c1698530uIl);
        }
    }

    public final void LJJIIZ(InterfaceC1467820oIe interfaceC1467820oIe) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJZIJLIL = interfaceC1467820oIe;
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LJFF(23L);
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }

    public final void LJJIIZI(InterfaceC1467810oId interfaceC1467810oId) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJLLIL = interfaceC1467810oId;
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LJFF(12L);
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }

    public final void LJJIJ(InterfaceC1470110oML interfaceC1470110oML) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJZ = interfaceC1470110oML;
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LJFF(6L);
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void seekTo(int i) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIILIIL(i);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setLooping(boolean z) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIJ(z);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnCompletionListener(InterfaceC1470900oNc interfaceC1470900oNc) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIJI(interfaceC1470900oNc);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnErrorListener(InterfaceC1470910oNd interfaceC1470910oNd) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIJJ(interfaceC1470910oNd);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnInfoListener(InterfaceC1470920oNe interfaceC1470920oNe) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIJJLI(interfaceC1470920oNe);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnPreparedListener(InterfaceC1470930oNf interfaceC1470930oNf) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIL(interfaceC1470930oNf);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setSurface(Surface surface) {
        TTPlayerClient tTPlayerClient;
        if ((surface == null || surface.isValid()) && (tTPlayerClient = this.LIZ) != null) {
            tTPlayerClient.LJJII(surface);
        }
    }

    public static void LJJI(int i, int i2) {
        if (x.LJFF()) {
            TTPlayerClient.setGlobalIntOptionForKey(i, i2);
        }
    }

    public static void LJJIFFI(int i, int i2) {
        try {
            Class<?> clsLIZ = C1469080oKg.LIZ(200, "com.ss.ttm.player.TTPlayerClient");
            Class<?> cls = Integer.TYPE;
            Method declaredMethod = clsLIZ.getDeclaredMethod("setGlobalIntOptionForKey", cls, cls);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(clsLIZ, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void LIZ(int i, String str) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJIFFI(i, str);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final long LIZIZ(int i, long j) {
        if (this.LIZ != null) {
            return r0.LJIIZILJ(i, j);
        }
        return -1L;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LIZJ(int i, int i2) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIILL(i, i2);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final int LJI(int i, int i2) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LIZJ(i, i2);
        }
        return i2;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJIIIIZZ(Context context, Uri uri) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJIILJJIL(context, uri);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final long LJIIJ(int i, long j) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LIZLLL(i, j);
        }
        return j;
    }

    public final float LJIILIIL(float f, int i) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            return tTPlayerClient.LJJIIZ(f, i);
        }
        return f;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJIILLIIL(float f, float f2) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJIII(f, f2);
        }
    }

    public final int LJIL(float f, int i) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LJJJJJL(f, i);
            return -1;
        }
        return -1;
    }

    public final void LJJIJIIJI(SurfaceControl surfaceControl, int i, int i2) {
        TTPlayerClient tTPlayerClient = this.LIZ;
        if (tTPlayerClient != null) {
            tTPlayerClient.LLJJIII.lock();
            try {
                if (tTPlayerClient.LJJIJIIJIL()) {
                    tTPlayerClient.LLJJJ.LJIIIIZZ(surfaceControl, i, i2);
                }
                tTPlayerClient.LLJJIII.unlock();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                tTPlayerClient.LLJJIII.unlock();
                throw th;
            }
        }
    }
}
