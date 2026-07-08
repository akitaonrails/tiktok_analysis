package X;

import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEMediaConfig;

/* JADX INFO: renamed from: X.0F9X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0F9X {
    public static C1463860oCG LIZIZ(String str, SurfaceView surfaceView) {
        NLEMediaConfig nLEMediaConfig = new NLEMediaConfig();
        nLEMediaConfig.setWorkSpace(str);
        C1419820n3E.LIZ.LIZ();
        return new C1463860oCG(nLEMediaConfig, surfaceView, (NLEEditor) null, true);
    }

    public static C1463860oCG LIZ(NLEMediaConfig nLEMediaConfig, SurfaceView surfaceView, NLEEditor nLEEditor, int i) {
        boolean z;
        if ((i & 4) != 0) {
            nLEEditor = null;
        }
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        C1419820n3E.LIZ.LIZ();
        return new C1463860oCG(nLEMediaConfig, surfaceView, nLEEditor, z);
    }
}
