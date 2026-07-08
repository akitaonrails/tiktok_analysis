package X;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.1AUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180281AUo implements C0UZJ {
    public static String LIZLLL;
    public WeakReference<Activity> LIZ;
    public WeakReference<ViewGroup> LIZIZ;
    public WeakReference<InterfaceC774730UaF> LIZJ;

    @Override // X.C0UZJ
    public final String LIZ(Context context) {
        String str;
        String str2 = LIZLLL;
        if (str2 != null) {
            return str2;
        }
        if (context != null && (str = (String) C1305440k4k.LIZIZ(context).LIZLLL("hardware_info_gpu_name", EnumC1305450k4l.STRING, null)) != null) {
            LIZLLL = str;
        }
        return LIZLLL;
    }

    @Override // X.C0UZJ
    public final void LIZIZ(C19EG c19eg, View view, InterfaceC774730UaF interfaceC774730UaF) {
        String str = LIZLLL;
        if (str != null) {
            interfaceC774730UaF.LIZ(str);
            return;
        }
        if (c19eg == null) {
            return;
        }
        String strLIZ = LIZ(c19eg);
        if (strLIZ != null) {
            interfaceC774730UaF.LIZ(strLIZ);
            return;
        }
        if (!(view instanceof ViewGroup) || this.LIZ != null) {
            return;
        }
        this.LIZ = new WeakReference<>(c19eg);
        ViewGroup viewGroup = (ViewGroup) view;
        this.LIZIZ = new WeakReference<>(viewGroup);
        this.LIZJ = new WeakReference<>(interfaceC774730UaF);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(c19eg);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(1, 1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(gLSurfaceView);
        gLSurfaceView.setLayoutParams(layoutParams);
        gLSurfaceView.setRenderer(new C2180291AUp(this, gLSurfaceView));
        gLSurfaceView.setId(View.generateViewId());
        viewGroup.addView(gLSurfaceView);
    }
}
