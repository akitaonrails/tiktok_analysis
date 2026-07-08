package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.live.alphaplayer.controller.IPlayerController;
import com.ss.android.ugc.aweme.live.alphaplayer.model.DataSource;
import com.ss.android.ugc.aweme.live.alphaplayer.model.MaskSrc;
import java.util.List;

/* JADX INFO: renamed from: X.1Cwp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public interface InterfaceC2246811Cwp {
    void LIZ(List<MaskSrc> list);

    boolean LIZIZ();

    boolean LIZJ(ViewGroup viewGroup);

    void LIZLLL(float f, float f2);

    boolean LJ(ViewGroup viewGroup);

    void LJII();

    void bringToFront();

    Context getContext();

    boolean getLastFrameHold();

    int getMeasuredHeight();

    int getMeasuredWidth();

    Resources getResources();

    DataSource.ScaleType getScaleType();

    View getView();

    void onCompletion();

    void onPause();

    void release();

    void requestRender();

    void setConfigParams(DataSource.DataInfo dataInfo);

    void setEnableElementEvent(boolean z);

    void setFirstGLFrameListener(InterfaceC2247121CxK interfaceC2247121CxK);

    void setLastFrameHold(boolean z);

    void setLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setOnElementClickListener(InterfaceC1292160jjK interfaceC1292160jjK);

    void setPlayerController(IPlayerController iPlayerController);

    void setVideoRenderer(InterfaceC1292140jjI interfaceC1292140jjI);

    void setVisibility(int i);
}
