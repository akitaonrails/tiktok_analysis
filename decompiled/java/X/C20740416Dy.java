package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: X.16Dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20740416Dy implements InterfaceSurfaceHolderCallbackC20740316Dx {
    public SurfaceView LL;
    public FrameLayout LLILLJJLI;
    public SurfaceHolder LLILLL;
    public InterfaceC20740516Dz LLILZ;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.LLILLL = surfaceHolder;
        InterfaceC20740516Dz interfaceC20740516Dz = this.LLILZ;
        if (interfaceC20740516Dz != null) {
            interfaceC20740516Dz.J6(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        InterfaceC20740516Dz interfaceC20740516Dz = this.LLILZ;
        if (interfaceC20740516Dz != null) {
            interfaceC20740516Dz.LLJLIL();
        }
        this.LLILLL = null;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LLILLL = surfaceHolder;
        InterfaceC20740516Dz interfaceC20740516Dz = this.LLILZ;
        if (interfaceC20740516Dz != null) {
            interfaceC20740516Dz.LLIIZ(i2, i3, surfaceHolder.getSurface());
        }
    }
}
