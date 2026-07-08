package X;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.ss.ttm.player.s;

/* JADX INFO: renamed from: X.0oMq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470420oMq implements InterfaceC1470080oMI {
    public AbstractC1470440oMs LIZ;

    @Override // X.InterfaceC1470080oMI
    public final boolean LJFF() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        return abstractC1470440oMs == null || abstractC1470440oMs.LJFF() == 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJII() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJJI();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final int getCurrentPosition() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getDuration() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LIZIZ();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getPlayerType() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LJFF();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getVideoHeight() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LJI();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final int getVideoWidth() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LJII();
        }
        return 0;
    }

    @Override // X.InterfaceC1470080oMI
    public final boolean isPlaying() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LJIIIIZZ();
        }
        return false;
    }

    @Override // X.InterfaceC1470080oMI
    public final void pause() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIIIZ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void prepareAsync() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIIJ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void release() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIIJJI();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void reset() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIIL();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void start() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJJIIJ();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void stop() {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJJIIJZLJL();
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void LIZLLL(s sVar) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJJ(sVar);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJ(boolean z) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIILLIIL(z);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final String LJIIIZ(int i) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LJ(i);
        }
        return null;
    }

    @Override // X.InterfaceC1470080oMI
    public final void seekTo(int i) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIILIIL(i);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setLooping(boolean z) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIJ(z);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnCompletionListener(InterfaceC1470900oNc interfaceC1470900oNc) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIJI(interfaceC1470900oNc);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnErrorListener(InterfaceC1470910oNd interfaceC1470910oNd) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIJJ(interfaceC1470910oNd);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnInfoListener(InterfaceC1470920oNe interfaceC1470920oNe) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIJJLI(interfaceC1470920oNe);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setOnPreparedListener(InterfaceC1470930oNf interfaceC1470930oNf) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIL(interfaceC1470930oNf);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void setSurface(Surface surface) {
        AbstractC1470440oMs abstractC1470440oMs;
        if ((surface == null || surface.isValid()) && (abstractC1470440oMs = this.LIZ) != null) {
            abstractC1470440oMs.LJJII(surface);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final void LIZ(int i, String str) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJJIFFI(i, str);
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
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIILL(i, i2);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final int LJI(int i, int i2) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LIZJ(i, i2);
        }
        return i2;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJIIIIZZ(Context context, Uri uri) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJIILJJIL(context, uri);
        }
    }

    @Override // X.InterfaceC1470080oMI
    public final long LJIIJ(int i, long j) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            return abstractC1470440oMs.LIZLLL(i, j);
        }
        return j;
    }

    @Override // X.InterfaceC1470080oMI
    public final void LJIILLIIL(float f, float f2) {
        AbstractC1470440oMs abstractC1470440oMs = this.LIZ;
        if (abstractC1470440oMs != null) {
            abstractC1470440oMs.LJJIII(f, f2);
        }
    }
}
