package X;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0jbe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287400jbe extends GLSurfaceView {
    public static final /* synthetic */ int LLILZIL = 0;
    public final C1287380jbc LL;
    public boolean LLILLJJLI;
    public float LLILLL;
    public float LLILZ;

    public final void LIZJ() {
        setRenderer(this.LL);
        requestRender();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (motionEvent.getAction() == 2) {
            float f = x - this.LLILLL;
            float f2 = y - this.LLILZ;
            if (y > getHeight() / 2.0f) {
                f *= -1;
            }
            if (x < getWidth() / 2.0f) {
                f2 *= -1;
            }
            this.LL.LLIZ += (f + f2) * 0.5625f;
            if (this.LLILLJJLI) {
                requestRender();
            }
        }
        this.LLILLL = x;
        this.LLILZ = y;
        return true;
    }

    @Override // android.opengl.GLSurfaceView
    public void setRenderer(GLSurfaceView.Renderer renderer) {
        SurfaceHolder holder;
        Surface surface;
        this.LLILLJJLI = true;
        super.setRenderer(renderer);
        if (Build.VERSION.SDK_INT <= 24 && (holder = getHolder()) != null && (surface = holder.getSurface()) != null && surface.isValid()) {
            super.surfaceCreated(getHolder());
        }
    }

    public final void setUniforms(C1287390jbd c1287390jbd) {
        this.LL.LIZLLL(c1287390jbd);
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (Build.VERSION.SDK_INT <= 24 && !this.LLILLJJLI) {
            return;
        }
        super.surfaceCreated(surfaceHolder);
    }

    public C1287400jbe(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = new C1287380jbc(context);
        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
    }

    public final void LIZ(EnumC1287420jbg enumC1287420jbg, C1287390jbd c1287390jbd) {
        String strLIZ;
        String strLIZ2;
        Context context = getContext();
        int[] iArr = C1287410jbf.LIZ;
        int i = iArr[enumC1287420jbg.ordinal()];
        boolean z = true;
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                strLIZ = C08E4.LIZ(R.raw.hexagon_vert, context);
            } else {
                throw new C1954807lC();
            }
        } else {
            strLIZ = C08E4.LIZ(R.raw.spin_vert, context);
        }
        Context context2 = getContext();
        int i2 = iArr[enumC1287420jbg.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        strLIZ2 = C08E4.LIZ(R.raw.noise_gradient, context2);
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    strLIZ2 = C08E4.LIZ(R.raw.hexagon_zoom_frag, context2);
                }
            } else {
                strLIZ2 = C08E4.LIZ(R.raw.hexagon_frag, context2);
            }
        } else {
            strLIZ2 = C08E4.LIZ(R.raw.spin_frag, context2);
        }
        int i3 = iArr[enumC1287420jbg.ordinal()];
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            z = false;
        }
        LIZIZ(strLIZ, strLIZ2, z, c1287390jbd);
    }

    @Override // android.view.SurfaceView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        C1287380jbc c1287380jbc = this.LL;
        c1287380jbc.LLILZIL = size;
        c1287380jbc.LLILZLL = size2;
        C1287370jbb c1287370jbb = c1287380jbc.LLILZ;
        if (c1287370jbb != null) {
            c1287370jbb.LIZIZ = size;
            c1287370jbb.LIZJ = size2;
        }
    }

    public final void LIZIZ(String str, String str2, boolean z, C1287390jbd c1287390jbd) {
        C1287390jbd c1287390jbd2 = c1287390jbd;
        C1287380jbc c1287380jbc = this.LL;
        c1287380jbc.LL = str;
        c1287380jbc.LLILLJJLI = str2;
        c1287380jbc.LLILLL = z;
        if (c1287390jbd2 == null) {
            c1287390jbd2 = new C1287390jbd(0.0f, 0.0f, (List) null, (List) null, 0, 0, 0, 0, 0, 0.0f, 0.0f, 4095);
        }
        c1287380jbc.LIZLLL(c1287390jbd2);
    }
}
