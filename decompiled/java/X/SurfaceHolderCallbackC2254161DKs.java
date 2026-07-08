package X;

import android.view.SurfaceHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1DKs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class SurfaceHolderCallbackC2254161DKs implements SurfaceHolder.Callback {
    public final /* synthetic */ C1DLI LL;
    public final /* synthetic */ Function0<Unit> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C2219091BtD.LIZLLL().i("CameraCapturePreOpener: surfaceCreated");
        this.LL.LIZIZ(surfaceHolder.getSurface());
        this.LLILLJJLI.invoke();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2219091BtD.LIZLLL().i("CameraCapturePreOpener: surfaceDestroyed");
        C1DLI c1dli = this.LL;
        surfaceHolder.getSurface();
        c1dli.LIZ();
        this.LLILZ.invoke();
    }

    public SurfaceHolderCallbackC2254161DKs(C1DI1 c1di1, Function0 function0, Function0 function02, Function0 function03) {
        this.LL = c1di1;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
        this.LLILZ = function03;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LL.LLIIZ(i2, i3, surfaceHolder.getSurface());
        this.LLILLL.invoke();
    }
}
