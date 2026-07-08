package X;

import android.content.res.AssetManager;
import com.ss.ttlivestreamer.core.buffer.RoiInfo;
import com.ss.ttlivestreamer.core.effect.EffectAlgorithmStrategyResult;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jD0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1272120jD0 {
    void addAmazingAllowedPath(String str);

    int composerAppendNodes(String[] strArr, int i);

    int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerCheckNodeExclusion(String str, String str2, int[] iArr);

    int composerPreloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerRemoveNodes(String[] strArr, int i);

    int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr);

    int composerUpdateNode(String str, String str2, float f);

    void configEffect(int i, int i2, String str, String str2, boolean z, boolean z2, String str3, boolean z3);

    void configGpuTurboBeforeProcessEffect(int i, int i2, boolean z);

    void configSequenceCache(long j);

    long createEffectTrack();

    int destroyEffectAudioHandler();

    int destroyEffectTrack(long j);

    int disableEffectAudio();

    int effectAudioProcessData(ByteBuffer byteBuffer, int i, int i2, int i3);

    int effectAudioProcessDataV2(ByteBuffer byteBuffer, int i, int i2, int i3);

    int effectAudioSetPlaybackDeviceType(int i);

    int enableEffectAudio();

    int enableFindContour(boolean z, String str);

    void enableSetMD5ResourceFinder(boolean z);

    ByteBuffer getContourInfo(EffectWrapper.AlgorithmResult algorithmResult);

    AudioDeviceModule.AudioRenderSink getEffectAudioRender();

    String getEffectVersion();

    String getFrameProgressParams(int i);

    void insertEffectLicense(String str);

    boolean isAudioRecognizeAvailable();

    boolean isEffectGpuTurboEnable();

    int isExistValidResource();

    int mixFrame(GLTexture[] gLTextureArr, int i, GLTexture gLTexture);

    String name();

    int notifyKeyboardHide(boolean z);

    int pauseEffect();

    void prepareEffect();

    int process(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long j, boolean z, long j2);

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    void processTouchUpEvent(float f, float f2, int i);

    int processV2(int i, int i2, int i3, int i4, int i5, RoiInfo roiInfo, long[] jArr, boolean z, long j);

    int processWithEffectChain(GLTexture[] gLTextureArr, GLTexture[] gLTextureArr2, GLTexture[] gLTextureArr3, int i, int i2, RoiInfo roiInfo, long j, boolean z, long j2);

    void refreshSequenceCacheStatus(boolean z);

    void release();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setAlgorithmAB(boolean z);

    int setAssetManager(AssetManager assetManager);

    int setClientState(int i);

    void setContourInfoIndex(String str);

    int setCustomEffect(String str, String str2);

    int setEffect(String str);

    int setEffectABInfo(JSONObject jSONObject, String str);

    EffectAlgorithmStrategyResult setEffectAlgorithmStrategy(String str, int i, String str2);

    int setEffectAudioGraphCfg(boolean z, boolean z2, boolean z3);

    void setEffectLogLevel(int i);

    void setEffectMsgListener(InterfaceC1272540jDg interfaceC1272540jDg);

    int setEffectStrategy(String str, double d);

    int setEffectTrackOutputTexture(long j, int i, int i2, int i3);

    int setEffectTrackStickerPaths(long j, String[] strArr, int[] iArr, int i, String str);

    void setEnableAlgorithmSyncer(boolean z);

    void setEnableThreeBuffer(boolean z);

    void setFaceDetectListener(InterfaceC1272550jDh interfaceC1272550jDh);

    void setFaceDetectSkipStep(int i);

    int setInputText(String str, int i, int i2, String str2);

    void setRenderCacheString(String str, String str2);

    int setResourceFinder(Object obj);

    int setupEffectAudioHandler();

    int startAudioRecognize(ByteBuffer byteBuffer, int i, int i2, int i3);

    int startEffectTrack(long j);

    int stopEffectTrack(long j, boolean z);

    boolean valid();
}
