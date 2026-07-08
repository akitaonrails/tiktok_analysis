package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;

/* JADX INFO: renamed from: X.1A7B, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A7B extends SurfaceView implements InterfaceC2178741AOq {
    public C1A7D LL;

    @Override // X.InterfaceC2178741AOq
    public Bitmap getBitmap() {
        return null;
    }

    @Override // X.InterfaceC2178741AOq
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC2178741AOq
    public void setPlayEntity(C1474420oTI c1474420oTI) {
    }

    @Override // X.InterfaceC2178741AOq
    public Surface getSurface() {
        return getHolder().getSurface();
    }

    @Override // X.InterfaceC2178741AOq
    public SurfaceHolder getSurfaceHolder() {
        return getHolder();
    }

    public C1A7B(Context context) {
        super(context);
        getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.1A7C
            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                C1A7D c1a7d = this.LL.LL;
                if (c1a7d != null) {
                    ((C2178631AOf) c1a7d).LJJLIIIIJ();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                C1A7D c1a7d = this.LL.LL;
                if (c1a7d != null) {
                    ((C2178631AOf) c1a7d).LJJLIIIJ();
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                C1A7B c1a7b = this.LL;
                if (c1a7b.LL != null) {
                    if (c1a7b.getHolder() != null && i2 > 0 && i3 > 0) {
                        this.LL.getHolder().setFixedSize(i2, i3);
                        this.LL.requestLayout();
                    }
                    ((C2178631AOf) this.LL.LL).LJJLI();
                }
            }
        });
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void setKeepScreenOn(boolean z) {
        super.setKeepScreenOn(z);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("surface view keep_screen_on:");
        sbLIZ.append(Boolean.valueOf(z).toString());
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2178741AOq
    public void setSurfaceCallback(C1A7D c1a7d) {
        this.LL = c1a7d;
    }
}
