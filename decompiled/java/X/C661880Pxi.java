package X;

import Y.ARunnableS110S0100000_10;
import android.graphics.SurfaceTexture;
import com.bytedance.bpea.transmit.hook.HandlerHook;

/* JADX INFO: renamed from: X.0Pxi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C661880Pxi {
    public static final void LIZ(final C661850Pxf c661850Pxf) {
        if (!c661850Pxf.LLILLL) {
            if (((Boolean) C04T0.LIZ.getValue()).booleanValue()) {
                if (!c661850Pxf.isAttachedToWindow()) {
                    return;
                }
                if (C291280BbK.LIZ()) {
                    c661850Pxf.setActionState(4);
                }
                InterfaceC1473950oSX interfaceC1473950oSX = new InterfaceC1473950oSX() { // from class: X.0Pxh
                    @Override // X.InterfaceC1473950oSX
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final /* synthetic */ void LLF(int i, int i2) {
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final /* synthetic */ void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
                    }

                    @Override // X.InterfaceC1473950oSX
                    public final void LLILLIZIL(int i, int i2) {
                        if (!C291280BbK.LIZ() || c661850Pxf.getActionState() == 4) {
                            c661850Pxf.LLLLLIL();
                        }
                        c661850Pxf.getSurfaceHolder().s5(this);
                    }
                };
                c661850Pxf.getSurfaceHolder().Dn(interfaceC1473950oSX);
                if (!c661850Pxf.isAttachedToWindow()) {
                    c661850Pxf.getSurfaceHolder().s5(interfaceC1473950oSX);
                    return;
                } else {
                    c661850Pxf.addOnAttachStateChangeListener(new C0R47(c661850Pxf, c661850Pxf, interfaceC1473950oSX, 2));
                    return;
                }
            }
            HandlerHook.viewPost(c661850Pxf, new ARunnableS110S0100000_10(c661850Pxf, 178));
            return;
        }
        c661850Pxf.LLLLLIL();
    }
}
