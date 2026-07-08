package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18he, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21354818he extends RelativeLayout {
    public Map<Integer, View> _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        Map<Integer, View> map = this._$_findViewCache;
        View viewFindViewById = map.get(Integer.valueOf(i));
        if (viewFindViewById == null) {
            viewFindViewById = findViewById(i);
            if (viewFindViewById == null) {
                return null;
            }
            map.put(Integer.valueOf(i), viewFindViewById);
        }
        return viewFindViewById;
    }

    public void destroy() {
    }

    public int getDuration() {
        return 0;
    }

    public abstract void onPropsUpdateOnce();

    public abstract void pause();

    public abstract void performZoom();

    public abstract void performZoomOut();

    public abstract void playReal(Function0<Unit> function0);

    public abstract void seek(int i, boolean z);

    public void setAutoLifecycle(boolean z) {
    }

    public abstract void setAutoPlay(boolean z);

    public void setBorderRadius(float[] fArr) {
    }

    public abstract void setDeviceChangeAware(boolean z);

    public void setEnablePlayListener(boolean z) {
    }

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

    public void setResourceLoader(InterfaceC2033107xp<C1290210jgB> interfaceC2033107xp) {
    }

    public abstract void setSinglePlayer(boolean z);

    public abstract void setSrc(String str);

    public void setStateChangeReporter(InterfaceC1631620sYq<? super String, ? super Map<String, ? extends Object>, ? super AbstractC21354818he, Unit> interfaceC1631620sYq) {
    }

    public void setVideoHeight(int i) {
    }

    public void setVideoTag(String str) {
    }

    public void setVideoWidth(int i) {
    }

    public abstract void setVolume(float f);

    public AbstractC21354818he(Context context) {
        this(context, null, 0);
    }

    public AbstractC21354818he(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC21354818he(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = new LinkedHashMap();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void playReal$default(AbstractC21354818he abstractC21354818he, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function0 = null;
            }
            abstractC21354818he.playReal(function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: playReal");
    }
}
