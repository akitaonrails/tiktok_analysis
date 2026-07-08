package X;

import Y.ARunnableS115S0100000_15;
import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/* JADX INFO: renamed from: X.0bOV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class SurfaceHolderCallbackC971730bOV extends SurfaceView implements SurfaceHolder.Callback {
    public String LL;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public final void LIZ() {
        String str = this.LL;
        if (str == null || str.length() == 0 || !getHolder().getSurface().isValid()) {
            return;
        }
        C823050WQl.LIZLLL().submit(new ARunnableS115S0100000_15(this, 57));
    }

    public final void setImagePath(String str) {
        C1AZW c1azw = C1AZW.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharedBgImageSurfaceView setImagePath, path=");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1azw.getClass();
        C1AZW.LIZ("shared_bg", strLIZIZ, null, null);
        if (str.equals(this.LL)) {
            c1azw.getClass();
            C1AZW.LIZ("shared_bg", "SharedBgImageSurfaceView setImagePath, ignore the same path", null, null);
        } else {
            this.LL = str;
            LIZ();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        C1AZW.LIZ.getClass();
        C1AZW.LIZ("shared_bg", "SharedBgImageSurfaceView applyGuestSharedBg, surfaceCreated", null, null);
        LIZ();
    }

    public SurfaceHolderCallbackC971730bOV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        getHolder().addCallback(this);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        LIZ();
    }
}
