package X;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: renamed from: X.1AUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2180291AUp extends C2180311AUr {
    public final /* synthetic */ GLSurfaceView LL;
    public final /* synthetic */ C2180281AUo LLILLJJLI;

    public C2180291AUp(C2180281AUo c2180281AUo, GLSurfaceView gLSurfaceView) {
        this.LLILLJJLI = c2180281AUo;
        this.LL = gLSurfaceView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        final String strLIZIZ;
        final Activity activity;
        String strGlGetString = gl10.glGetString(7937);
        String strGlGetString2 = gl10.glGetString(7936);
        if (!TextUtils.isEmpty(strGlGetString) && !TextUtils.isEmpty(strGlGetString2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strGlGetString2);
            sbLIZ.append(" ");
            sbLIZ.append(strGlGetString);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        try {
            WeakReference<Activity> weakReference = this.LLILLJJLI.LIZ;
            if (weakReference != null && (activity = weakReference.get()) != null) {
                final GLSurfaceView gLSurfaceView = this.LL;
                activity.runOnUiThread(new Runnable() { // from class: X.1AUq
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewGroup viewGroup;
                        C2180291AUp c2180291AUp = this.LL;
                        String str = strLIZIZ;
                        Activity activity2 = activity;
                        GLSurfaceView gLSurfaceView2 = gLSurfaceView;
                        c2180291AUp.getClass();
                        C1C7U.LIZ("GpuInfoFetcher@b261.getGpuInfo$1$onSurfaceCreated$1L");
                        if (str != null) {
                            C2180281AUo.LIZLLL = str;
                            C1305440k4k c1305440k4kLIZIZ = C1305440k4k.LIZIZ(activity2);
                            c1305440k4kLIZIZ.LJII(str, "hardware_info_gpu_name");
                            c1305440k4kLIZIZ.LIZ();
                            WeakReference<InterfaceC774730UaF> weakReference2 = c2180291AUp.LLILLJJLI.LIZJ;
                            InterfaceC774730UaF interfaceC774730UaF = weakReference2 != null ? weakReference2.get() : null;
                            C2180281AUo c2180281AUo = c2180291AUp.LLILLJJLI;
                            String str2 = C2180281AUo.LIZLLL;
                            c2180281AUo.getClass();
                            if (interfaceC774730UaF != null) {
                                interfaceC774730UaF.LIZ(str2);
                            }
                        }
                        WeakReference<ViewGroup> weakReference3 = c2180291AUp.LLILLJJLI.LIZIZ;
                        if (weakReference3 != null && (viewGroup = weakReference3.get()) != null) {
                            C786410Ut5.LJJJLZIJ(gLSurfaceView2, viewGroup);
                        }
                        C1C7U.LIZIZ("GpuInfoFetcher@b261.getGpuInfo$1$onSurfaceCreated$1L");
                    }
                });
            }
        } finally {
            try {
            } catch (Throwable th) {
            }
        }
        C2180281AUo c2180281AUo = this.LLILLJJLI;
        c2180281AUo.LIZ = null;
        c2180281AUo.LIZIZ = null;
        c2180281AUo.LIZJ = null;
    }
}
