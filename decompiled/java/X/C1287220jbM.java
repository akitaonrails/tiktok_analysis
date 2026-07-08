package X;

import android.view.SurfaceView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0jbM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287220jbM {
    public final WeakReference<C1472250oPn> LIZ;
    public final WeakReference<SurfaceView> LIZIZ;
    public final WeakReference<InterfaceC1472350oPx> LIZJ;

    public final void LIZ() {
        C1472250oPn c1472250oPn = this.LIZ.get();
        C1472150oPd c1472150oPd = c1472250oPn != null ? c1472250oPn.LLILZIL : null;
        if (C1481110oe5.LIZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyPlayerCoreSurface mPlayer:");
            sbLIZ.append(c1472150oPd);
            sbLIZ.append(", surfaceView:");
            sbLIZ.append(this.LIZIZ.get());
            sbLIZ.append(", mSurfaceControlSession:");
            sbLIZ.append(this.LIZJ.get());
            C1481110oe5.LIZIZ("TTPlayer", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (c1472150oPd == null) {
            return;
        }
        c1472150oPd.LJJIJIL();
    }

    public C1287220jbM(C1472250oPn c1472250oPn, SurfaceView surfaceView, InterfaceC1472350oPx interfaceC1472350oPx) {
        this.LIZ = new WeakReference<>(c1472250oPn);
        this.LIZIZ = new WeakReference<>(surfaceView);
        this.LIZJ = new WeakReference<>(interfaceC1472350oPx);
    }
}
