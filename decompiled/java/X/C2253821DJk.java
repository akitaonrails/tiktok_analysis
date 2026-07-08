package X;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.asve.recorder.VERecorderImpl;
import com.ss.android.vesdk.VERecorder;
import kotlin.jvm.internal.AFwS283S0000000_35;

/* JADX INFO: renamed from: X.1DJk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2253821DJk implements InterfaceC2253831DJl {
    public static final /* synthetic */ int LLIZ = 0;
    public final LifecycleOwner LL;
    public final InterfaceC2253831DJl LLILLJJLI;
    public final C1DKV LLILLL;
    public final String LLILZ;
    public final String LLILZIL;
    public final EnumC21569919bF LLILZLL;

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC2254211DKx LIZ() {
        return this.LLILLJJLI.LIZ();
    }

    @Override // X.InterfaceC2253831DJl
    public final VERecorder LIZIZ() {
        return this.LLILLJJLI.LIZIZ();
    }

    @Override // X.InterfaceC2253831DJl
    public final void LIZJ(Context context) {
        this.LLILLJJLI.LIZJ(context);
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC2253811DJj LJ() {
        return this.LLILLJJLI.LJ();
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC1660820tJw getAudioController() {
        return this.LLILLJJLI.getAudioController();
    }

    @Override // X.InterfaceC2253831DJl
    public final C1DHX getCameraController() {
        return this.LLILLJJLI.getCameraController();
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC1645720sva getEffectController() {
        return this.LLILLJJLI.getEffectController();
    }

    @Override // X.InterfaceC2253831DJl
    public final InterfaceC2254001DKc getMediaController() {
        return this.LLILLJJLI.getMediaController();
    }

    public final void LIZLLL() {
        C2216191BoX.LIZ.getClass();
        LIZJ(C2216191BoX.LIZ());
        getMediaController().f5();
        getEffectController().ho();
        if (this.LLILZLL == EnumC21569919bF.DUET) {
            C2216241Boc.LIZ.uu("initDuet() called");
            LJ().LIZLLL(this.LLILZ, this.LLILLL.LJJIII().LIZIZ() ? null : this.LLILZIL, ((double) this.LLILLL.LJJIII().LIZJ()) * 1.3333333333333333d > ((double) this.LLILLL.LJJIII().LJFF()));
            LJ().LIZ();
        }
    }

    public final void LJFF() {
        Surface surface;
        if (this.LLILLL.LJJ()) {
            SurfaceHolder surfaceHolder = this.LLILLL.getSurfaceHolder();
            if (surfaceHolder != null) {
                surfaceHolder.addCallback(new SurfaceHolder.Callback() { // from class: X.1DJm
                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceChanged(SurfaceHolder surfaceHolder2, int i, int i2, int i3) {
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceCreated(SurfaceHolder surfaceHolder2) {
                        this.LL.LIZLLL();
                        this.LL.LLILLJJLI.getMediaController().b5(surfaceHolder2.getSurface(), AFwS283S0000000_35.get$arr$(262));
                    }

                    @Override // android.view.SurfaceHolder.Callback
                    public final void surfaceDestroyed(SurfaceHolder surfaceHolder2) {
                        this.LL.LLILLJJLI.getMediaController().LIZ();
                    }
                });
            }
            SurfaceHolder surfaceHolder2 = this.LLILLL.getSurfaceHolder();
            if (surfaceHolder2 == null || (surface = surfaceHolder2.getSurface()) == null || !surface.isValid()) {
                return;
            }
            LIZLLL();
            this.LLILLJJLI.getMediaController().b5(surface, AFwS283S0000000_35.get$arr$(263));
        }
    }

    public C2253821DJk(LifecycleOwner lifecycleOwner, VERecorderImpl vERecorderImpl, C1DKV c1dkv) {
        EnumC21569919bF enumC21569919bF;
        this.LL = lifecycleOwner;
        this.LLILLJJLI = vERecorderImpl;
        this.LLILLL = c1dkv;
        c1dkv.LJJIIJZLJL();
        String strLJ = c1dkv.LJJIII().LJ();
        this.LLILZ = strLJ;
        String strLIZLLL = c1dkv.LJJIII().LIZLLL();
        this.LLILZIL = strLIZLLL;
        c1dkv.LJJIII().LIZ();
        if (strLJ.length() > 0 && strLIZLLL.length() > 0) {
            enumC21569919bF = EnumC21569919bF.DUET;
        } else {
            enumC21569919bF = EnumC21569919bF.CUSTOM;
        }
        this.LLILZLL = enumC21569919bF;
        LJFF();
    }
}
