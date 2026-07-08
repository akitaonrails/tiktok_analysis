package X;

import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewStub;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS552S0100000_8;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0LG3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LG3 {
    public final Function1<SurfaceView, Unit> LIZ;
    public final Function0<Unit> LIZIZ;
    public final SurfaceView LIZJ;

    public C0LG3(C19A3 c19a3, AwS587S0100000_8 awS587S0100000_8, AwS552S0100000_8 awS552S0100000_8) {
        View viewLJLLLL;
        this.LIZ = awS587S0100000_8;
        this.LIZIZ = awS552S0100000_8;
        ViewStub viewStub = (ViewStub) c19a3.findViewById(R.id.d_8);
        if (viewStub != null) {
            viewLJLLLL = C786410Ut5.LJLLLL(viewStub);
        } else {
            viewLJLLLL = null;
        }
        final SurfaceView surfaceView = viewLJLLLL instanceof SurfaceView ? (SurfaceView) viewLJLLLL : null;
        this.LIZJ = surfaceView;
        if (surfaceView != null) {
            C1447470nlp.LIZIZ(surfaceView, C418440Gaw.LIZIZ(Float.valueOf(20.0f)));
            if (!((Boolean) C287480BOo.LIZ.getValue()).booleanValue()) {
                surfaceView.getHolder().setFormat(-2);
            }
            surfaceView.getHolder().addCallback(new SurfaceHolder.Callback() { // from class: X.0LG4
                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceCreated(SurfaceHolder surfaceHolder) {
                    this.LL.LIZ.invoke(surfaceView);
                }

                @Override // android.view.SurfaceHolder.Callback
                public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                    this.LL.LIZIZ.invoke();
                }
            });
        }
    }
}
