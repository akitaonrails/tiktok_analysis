package X;

import android.view.SurfaceView;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEEditor;

/* JADX INFO: renamed from: X.0EL6, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EL6 {
    public final NLEEditor LIZ;
    public final SurfaceView LIZIZ;
    public final INLEMediaSession LIZJ;
    public final Long LIZLLL;
    public final boolean LJ;

    public /* synthetic */ C0EL6(NLEEditor nLEEditor, SurfaceView surfaceView, INLEMediaSession iNLEMediaSession, Long l) {
        this(nLEEditor, surfaceView, iNLEMediaSession, l, false);
    }

    public C0EL6(NLEEditor nLEEditor, SurfaceView surfaceView, INLEMediaSession iNLEMediaSession, Long l, boolean z) {
        this.LIZ = nLEEditor;
        this.LIZIZ = surfaceView;
        this.LIZJ = iNLEMediaSession;
        this.LIZLLL = l;
        this.LJ = z;
    }
}
