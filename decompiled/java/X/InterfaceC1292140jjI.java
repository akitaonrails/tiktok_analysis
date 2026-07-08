package X;

import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* JADX INFO: renamed from: X.0jjI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1292140jjI extends GLSurfaceView.Renderer, InterfaceC1287560jbu, SurfaceTexture.OnFrameAvailableListener {
    void LIZ(List<MaskSrc> list);

    void LIZJ(float f, float f2, float f3, float f4);

    void LJ(InterfaceC2247461Cxs interfaceC2247461Cxs);

    void LJII();

    void onCompletion();

    void release();

    void setConfigParams(DataSource.DataInfo dataInfo);

    void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK);
}
