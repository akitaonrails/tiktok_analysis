package X;

import Y.ARunnableS132S0100000_32;
import android.os.Handler;
import android.view.View;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.SafeHandler;

/* JADX INFO: renamed from: X.195W, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C195W extends AbstractC214793194d {
    public final Handler LJ;
    public final long LJFF;
    public final long LJI;

    @Override // X.AbstractC214793194d
    public final boolean LJFF(Class<? extends Scene> cls, Class<? extends Scene> cls2) {
        return true;
    }

    public C195W(SafeHandler safeHandler, long j, long j2) {
        this.LJ = safeHandler;
        this.LJI = j < 0 ? 300L : j;
        this.LJFF = j2 < 0 ? 300L : j2;
    }

    @Override // X.AbstractC214793194d
    public final void LIZJ(C214795194f c214795194f, C214795194f c214795194f2, final Runnable runnable, C1447920nmY c1447920nmY) {
        final ARunnableS132S0100000_32 aRunnableS132S0100000_32 = new ARunnableS132S0100000_32(runnable, 95);
        C786410Ut5.LJLIIL(this.LJFF, this.LJ, aRunnableS132S0100000_32);
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195X
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                this.LIZ.LJ.removeCallbacks(aRunnableS132S0100000_32);
                runnable.run();
            }
        });
    }

    @Override // X.AbstractC214793194d
    public final void LJ(C214795194f c214795194f, C214795194f c214795194f2, final Runnable runnable, C1447920nmY c1447920nmY) {
        View view = c214795194f.LIZIZ;
        View view2 = c214795194f2.LIZIZ;
        C195Z.LJ(view);
        C195Z.LJ(view2);
        if (!c214795194f2.LIZLLL) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (C14K9.LJIIIIZZ(view) > 0.0f) {
            C14K9.LJIJ(view, 0.0f);
        }
        final ARunnableS132S0100000_32 aRunnableS132S0100000_32 = new ARunnableS132S0100000_32(runnable, 96);
        C786410Ut5.LJLIIL(this.LJI, this.LJ, aRunnableS132S0100000_32);
        c1447920nmY.LIZIZ(new InterfaceC1447930nmZ() { // from class: X.195Y
            @Override // X.InterfaceC1447930nmZ
            public final void onCancel() {
                this.LIZ.LJ.removeCallbacks(aRunnableS132S0100000_32);
                runnable.run();
            }
        });
    }
}
