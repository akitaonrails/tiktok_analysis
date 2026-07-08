package X;

import android.view.Surface;
import android.view.SurfaceControl;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0oiM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1483760oiM implements InterfaceC1484830ok5 {
    public C1478410oZj LIZ;

    @Override // X.InterfaceC1484830ok5
    public /* synthetic */ void LJFF(C1484040oio c1484040oio) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJII(SurfaceControl surfaceControl, int i, int i2) {
    }

    @Override // X.InterfaceC1484830ok5
    public /* synthetic */ void LJIIZILJ(InterfaceC1482530ogN interfaceC1482530ogN) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ List LJIJJ() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJ() {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJI() {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ boolean LJJIFFI() {
        return false;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIIJ(EnumC1490990ou1 enumC1490990ou1) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIIJZLJL(long j, Surface surface, boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public /* synthetic */ void LJJIIZ(InterfaceC1482530ogN interfaceC1482530ogN) {
    }

    @Override // X.InterfaceC1484830ok5
    public /* synthetic */ void LJJIIZI(InterfaceC1481870ofJ interfaceC1481870ofJ) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIJIL(String str, String str2) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJIL(String str) {
    }

    @Override // X.InterfaceC1484830ok5
    public /* synthetic */ void LJJJI(InterfaceC1483670oiD interfaceC1483670oiD) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJJJIZL(int i) {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJJL(boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJJLI(String str, boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJJLL() {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJJJZ(C1699290uJz c1699290uJz, C1699370uK7 c1699370uK7) {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJJLL(long j, C1699310uK1 c1699310uK1, ExecutorService executorService, boolean z) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJL(C1699080uJe c1699080uJe) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int LJJLIIIIJ(int i, byte[] bArr) {
        return 0;
    }

    @Override // X.InterfaceC1484830ok5
    public /* synthetic */ void LJJLIIIJL(InterfaceC585470Mxl interfaceC585470Mxl) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJLIIIJLLLLLLLZ(Surface surface) {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ InterfaceC1699280uJy LJJLIIJ() {
        return null;
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ void LJJLJ() {
    }

    @Override // X.InterfaceC1484830ok5
    public final /* synthetic */ int getAudioDuckingDurationForLive(int i) {
        return 0;
    }

    @Override // X.InterfaceC1483520ohy
    public final InterfaceC1483510ohx LJJJJZI() {
        return new InterfaceC1483510ohx() { // from class: X.0oiL
            @Override // X.InterfaceC1483510ohx
            public final Map<String, Object> LIZ() {
                return this.LIZ.LJIIIZ().LIZ();
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean LIZIZ() {
                if (this.LIZ.LJIIIZ() == null) {
                    return false;
                }
                return this.LIZ.LJIIIZ().LJIIIZ();
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean LJJIJIIJIL() {
                return this.LIZ.getPlayState().LJJIJIIJIL();
            }

            @Override // X.InterfaceC1483510ohx
            public final boolean isPlaying() {
                return this.LIZ.getPlayState().isPlaying();
            }

            @Override // X.InterfaceC1483510ohx
            public final void pause() {
                this.LIZ.pause();
            }

            @Override // X.InterfaceC1483510ohx
            public final void release() {
                this.LIZ.release();
            }
        };
    }

    @Override // X.InterfaceC1484830ok5
    public void release() {
        C1479990ocH.LIZ.LIZJ(this);
    }

    @Override // X.InterfaceC1484830ok5
    public Object LIZIZ(AbstractC586270Mz3 abstractC586270Mz3) {
        return abstractC586270Mz3.LIZ();
    }
}
