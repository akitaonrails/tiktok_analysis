package X;

import X.InterfaceC2181691AZz;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1AFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class SurfaceHolderCallbackC2176471AFx<T extends InterfaceC2181691AZz> implements SurfaceHolder.Callback {
    public final String LL;
    public final WeakReference<T> LLILLJJLI;

    public final T LIZ() {
        return this.LLILLJJLI.get();
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        String linkMicId;
        String strLJIIL;
        View viewLJIILJJIL;
        ViewParent parent;
        View viewLJIILJJIL2;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceTracker: surface created, linkMicId:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ = LIZ();
        String strLJIIJJI = null;
        if (interfaceC2181691AZzLIZ != null) {
            linkMicId = interfaceC2181691AZzLIZ.getLinkMicId();
        } else {
            linkMicId = null;
        }
        sbLIZ.append(linkMicId);
        sbLIZ.append(", surface:");
        sbLIZ.append(surfaceHolder.getSurface().hashCode());
        sbLIZ.append(", view:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ2 = LIZ();
        if (interfaceC2181691AZzLIZ2 != null && (viewLJIILJJIL2 = interfaceC2181691AZzLIZ2.LJIILJJIL()) != null) {
            strLJIIL = C500260Jjc.LJIIL(viewLJIILJJIL2);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", parent:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ3 = LIZ();
        if (interfaceC2181691AZzLIZ3 != null && (viewLJIILJJIL = interfaceC2181691AZzLIZ3.LJIILJJIL()) != null && (parent = viewLJIILJJIL.getParent()) != null) {
            strLJIIJJI = C500260Jjc.LJIIJJI(parent);
        }
        sbLIZ.append(strLJIIJJI);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        String linkMicId;
        String strLJIIL;
        View viewLJIILJJIL;
        ViewParent parent;
        View viewLJIILJJIL2;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceTracker: surface destroyed, linkMicId:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ = LIZ();
        String strLJIIJJI = null;
        if (interfaceC2181691AZzLIZ != null) {
            linkMicId = interfaceC2181691AZzLIZ.getLinkMicId();
        } else {
            linkMicId = null;
        }
        sbLIZ.append(linkMicId);
        sbLIZ.append(", surface:");
        sbLIZ.append(surfaceHolder.getSurface().hashCode());
        sbLIZ.append(", view:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ2 = LIZ();
        if (interfaceC2181691AZzLIZ2 != null && (viewLJIILJJIL2 = interfaceC2181691AZzLIZ2.LJIILJJIL()) != null) {
            strLJIIL = C500260Jjc.LJIIL(viewLJIILJJIL2);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", parent:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ3 = LIZ();
        if (interfaceC2181691AZzLIZ3 != null && (viewLJIILJJIL = interfaceC2181691AZzLIZ3.LJIILJJIL()) != null && (parent = viewLJIILJJIL.getParent()) != null) {
            strLJIIJJI = C500260Jjc.LJIIJJI(parent);
        }
        sbLIZ.append(strLJIIJJI);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }

    public SurfaceHolderCallbackC2176471AFx(String str, T t) {
        this.LL = str;
        this.LLILLJJLI = new WeakReference<>(t);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        String linkMicId;
        String strLJIIL;
        View viewLJIILJJIL;
        ViewParent parent;
        View viewLJIILJJIL2;
        String str = this.LL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SurfaceTracker: surface changed, linkMicId:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ = LIZ();
        String strLJIIJJI = null;
        if (interfaceC2181691AZzLIZ != null) {
            linkMicId = interfaceC2181691AZzLIZ.getLinkMicId();
        } else {
            linkMicId = null;
        }
        sbLIZ.append(linkMicId);
        sbLIZ.append(", surface:");
        sbLIZ.append(surfaceHolder.getSurface().hashCode());
        sbLIZ.append(", w:");
        sbLIZ.append(i2);
        sbLIZ.append(", h:");
        sbLIZ.append(i3);
        sbLIZ.append(", view:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ2 = LIZ();
        if (interfaceC2181691AZzLIZ2 != null && (viewLJIILJJIL2 = interfaceC2181691AZzLIZ2.LJIILJJIL()) != null) {
            strLJIIL = C500260Jjc.LJIIL(viewLJIILJJIL2);
        } else {
            strLJIIL = null;
        }
        sbLIZ.append(strLJIIL);
        sbLIZ.append(", parent:");
        InterfaceC2181691AZz interfaceC2181691AZzLIZ3 = LIZ();
        if (interfaceC2181691AZzLIZ3 != null && (viewLJIILJJIL = interfaceC2181691AZzLIZ3.LJIILJJIL()) != null && (parent = viewLJIILJJIL.getParent()) != null) {
            strLJIIJJI = C500260Jjc.LJIIJJI(parent);
        }
        sbLIZ.append(strLJIIJJI);
        C20441214yg.LIZIZ(str, C2188811AlT.LIZIZ(sbLIZ));
    }
}
