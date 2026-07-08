package X;

import com.bytedance.creativex.editor.preview.IAudioEffectParam;

/* JADX INFO: renamed from: X.0Mfo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public interface InterfaceC574340Mfo {
    String[] getAudioPaths();

    int getCanvasHeight();

    int getCanvasWidth();

    double getDbRange();

    long getEditorHandler();

    boolean getEnableAutoStart();

    int getFps();

    boolean getInterceptAutoPlay();

    boolean getLoadImageOptimizeByVEUserConfig();

    boolean getLoadMixImageOptimizeByVEUserConfig();

    int getMaxPreviewFps();

    boolean getNeedTemplateExtra();

    boolean getNeedVEUserConfig();

    int getPageMode();

    int getPreviewHeight();

    int getPreviewWidth();

    int[] getRotateArray();

    float[] getSpeedArray();

    Boolean getUseAudioInVideo();

    boolean getUseVEPublic();

    int[] getVTrimIn();

    int[] getVTrimOut();

    IAudioEffectParam getVeAudioEffectParam();

    String[] getVideoPaths();

    String getWorkspace();

    boolean isCanvasVEEditorType();

    boolean isReuseSurfaceView();

    void setLoadImageOptimizeByVEUserConfig(boolean z);

    void setLoadMixImageOptimizeByVEUserConfig(boolean z);
}
