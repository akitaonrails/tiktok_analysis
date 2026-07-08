package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18fI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21340218fI extends RelativeLayout {
    public static final /* synthetic */ int LL = 0;

    public void LIZ() {
    }

    public abstract void LIZIZ();

    public abstract void LIZJ();

    public abstract void LIZLLL();

    public abstract void LJ(Function0<Unit> function0);

    public abstract void LJFF(int i, boolean z);

    public int getDuration() {
        return 0;
    }

    public abstract void pause();

    public abstract void setAutoLifecycle(boolean z);

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public abstract void setInitTime(int i);

    public void setLogExtra(HashMap<String, Object> map) {
    }

    public abstract void setLoop(boolean z);

    public abstract void setMuted(boolean z);

    public abstract void setObjectFit(String str);

    @InterfaceC1294060jmO
    public void setPerformanceLog(String str) {
    }

    public abstract void setPoster(String str);

    public abstract void setPreload(boolean z);

    public abstract void setRate(int i);

    public abstract void setSinglePlayer(boolean z);

    public void setSinglePlayerScene(String str) {
    }

    public abstract void setSrc(String str);

    public abstract void setStateChangeReporter(InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super AbstractC21340218fI, Unit> interfaceC1631620sYq);

    public void setVideoHeight(int i) {
    }

    public void setVideoWidth(int i) {
    }

    public abstract void setVolume(float f);

    public AbstractC21340218fI(Context context, AttributeSet attributeSet, int i) {
        new LinkedHashMap();
        super(context, attributeSet, i);
    }
}
