package X;

import android.content.res.AssetManager;
import android.view.Surface;
import com.ss.ttlivestreamer.core.abnormal_detect.TTLHAbnormalDetectorJava;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.effect.EffectImageInfo;
import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.opengl.GLTexture;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j7O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1268640j7O {
    void LIZ(C0UD1 c0ud1);

    C1272130jD1 LJIIIIZZ();

    void LJIIL(InterfaceC1272550jDh interfaceC1272550jDh);

    void LJIILL(InterfaceC1269100j88 interfaceC1269100j88);

    void LJIJI();

    void LJJIFFI();

    void LJJII(InterfaceC1269980j9Y interfaceC1269980j9Y, EnumC1272790jE5 enumC1272790jE5);

    void LJJIII();

    void LJJIIZI(boolean z);

    void LJJIJIIJI(int i, int i2, String str, String str2, boolean z, String str3, AssetManager assetManager, Object obj);

    void LJJIJIL(TTLHAbnormalDetectorJava tTLHAbnormalDetectorJava);

    void LJJIJL(boolean z);

    void LJJIJLIJ(String str, String str2);

    void LJJJIL(String[] strArr, int i, String[] strArr2, boolean z, boolean z2, boolean z3);

    void LJJJJI(int i);

    int LJJJJIZL();

    void LJJJJJ(boolean z);

    void LJJJJL(int i);

    VideoFrame LJJJJLL(GLTexture[] gLTextureArr, GLTexture gLTexture);

    VideoFrame LJJJJZ(VideoFrame videoFrame);

    InterfaceC1272120jD0 LJJJLL();

    void LJJJLZIJ(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3, boolean z, boolean z2, boolean z3);

    boolean LJJJZ();

    boolean LJJLI();

    void LJJLIIIJILLIZJL(C1273620jFQ c1273620jFQ);

    void LJJLIIIJLJLI(JSONObject jSONObject);

    void LJJLIL(C1266750j4L c1266750j4L);

    void LJJLJ(C0UHF c0uhf);

    int LJJLJLI();

    InterfaceC1269100j88 LJJLL(Surface surface);

    void LJJZZI(int i, boolean z);

    int LJLI();

    void LJLIIL(boolean z);

    void LJLILLLLZI(InterfaceC1272420jDU interfaceC1272420jDU);

    void LJLJJI(boolean z);

    boolean LJLJJLL();

    int LJLJL();

    void LJLJLJ();

    void LJLLI();

    String LJLLL();

    void LJLLLL(boolean z);

    Map<String, String> LJLZ();

    double LJZ();

    void LJZL();

    AbstractC768410UCh LLD(AudioDeviceModule audioDeviceModule);

    String LLFII();

    String LLFZ();

    JSONObject LLIIII();

    void LLIIIILZ(InterfaceC1272600jDm interfaceC1272600jDm);

    boolean LLIIIJ();

    int LLIIIL();

    void LLIIIZ(C1267620j5k c1267620j5k);

    double LLIIJI();

    void LLIIJLIL(boolean z, EnumC1272290jDH enumC1272290jDH);

    void LLIILII(JSONObject jSONObject);

    float LLIIZ();

    void LLILIL(int i, boolean z);

    boolean LLILLJJLI();

    void LLILZLL(C1268900j7o c1268900j7o);

    int composerAppendNodes(String[] strArr, int i);

    int composerAppendNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerCheckNodeExclusion(String str, String str2, int[] iArr);

    int composerPreloadNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerRemoveNodes(String[] strArr, int i);

    int composerReplaceNodesWithTags(String[] strArr, int i, String[] strArr2, int i2, String[] strArr3);

    int composerSetMode(int i, int i2);

    int composerSetNodes(String[] strArr, int i);

    int composerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    /* JADX INFO: renamed from: composerSetNodesWithTags, reason: collision with other method in class */
    void mo48composerSetNodesWithTags(String[] strArr, int i, String[] strArr2);

    int composerUpdateMultipleNodes(int i, String[] strArr, String[] strArr2, float[] fArr);

    int composerUpdateNode(String str, String str2, float f);

    void configSequenceCache(long j);

    C0UD1 createEffectTrack();

    void enable(boolean z);

    int enableMockFace(boolean z);

    void enableSetMD5ResourceFinder(boolean z);

    EffectImageInfo getEffectCapturedImagewithKey(String str);

    boolean isEnable();

    boolean isValid();

    int notifyKeyboardHide(boolean z);

    int pauseEffect();

    void prepareEffect();

    void processLongPressEvent(float f, float f2);

    void processPanEvent(float f, float f2, float f3, float f4, float f5);

    void processRotationEvent(float f, float f2);

    void processScaleEvent(float f, float f2);

    void processTouchDownEvent(float f, float f2, int i);

    void processTouchEvent(float f, float f2);

    void processTouchEventWithTouchType(long j, float f, float f2, float f3, float f4, int i, int i2);

    void processTouchUpEvent(float f, float f2, int i);

    void refreshSequenceCacheStatus(boolean z);

    void release();

    int resumeEffect();

    int sendEffectMsg(int i, int i2, int i3, String str);

    void setClientState(int i);

    void setContourInfoIndex(String str);

    int setCustomEffect(String str, String str2);

    int setEffect(String str, boolean z);

    void setEffectAudioGraphCfg(boolean z, boolean z2, boolean z3);

    void setEffectLogLevel(int i);

    int setInputText(String str, int i, int i2, String str2);

    void setRenderCacheString(String str, String str2);

    void setServiceManager(InterfaceC1272820jE8 interfaceC1272820jE8);
}
