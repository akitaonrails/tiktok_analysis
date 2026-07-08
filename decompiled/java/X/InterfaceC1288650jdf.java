package X;

import com.lynx.animax.base.bridge.JavaOnlyMap;
import com.lynx.animax.composition.AnimaXComposition;
import com.lynx.animax.property.AnimaXKeyPath;
import com.lynx.animax.property.AnimaXValueParam;
import com.lynx.animax.ui.AnimaXContext;
import com.lynx.animax.util.AnimaXMetricsCallback;

/* JADX INFO: renamed from: X.0jdf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1288650jdf {
    void LIZIZ(EnumC1288440jdK enumC1288440jdK, String str, AnimaXValueParam animaXValueParam);

    void LIZJ(int[] iArr, boolean z);

    void LIZLLL(InterfaceC1288110jcn interfaceC1288110jcn);

    void LJ(int i);

    void LJFF(AnimaXMetricsCallback animaXMetricsCallback);

    void LJII(float f, float f2);

    void LJIIIIZZ(InterfaceC1288110jcn interfaceC1288110jcn);

    void LJIIIZ(EnumC1288880je2 enumC1288880je2, AnimaXKeyPath animaXKeyPath, AnimaXValueParam animaXValueParam);

    void LJIIJ(int i, int i2);

    void cancel();

    AnimaXContext getAnimaXContext();

    AnimaXComposition getComposition();

    double getCurrentFrame();

    double getDurationMs();

    boolean oi();

    void pause();

    void play();

    void resume();

    void setAntiAliasing(boolean z);

    void setAutoPlay(boolean z);

    void setAutoReverse(boolean z);

    void setComposition(AnimaXComposition animaXComposition);

    void setDynamicResource(boolean z);

    void setEnableAudio(boolean z);

    void setEndFrame(int i);

    void setFpsEventInterval(long j);

    void setImageFolder(String str);

    void setJson(String str);

    void setKeepLastFrame(boolean z);

    void setLoop(boolean z);

    void setLoopCount(int i);

    void setMaxFrameRate(double d);

    void setMuted(boolean z);

    void setObjectFit(EnumC1311910kFB enumC1311910kFB);

    void setObjectPosition(EnumC1297350jrh enumC1297350jrh);

    void setProgress(float f);

    void setSpeed(float f);

    void setSrc(String str);

    void setSrcPolyfill(JavaOnlyMap javaOnlyMap);

    void setStartFrame(int i);

    void stop();
}
