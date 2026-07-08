package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveRecyclerViewImageOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecyclerviewPerformanceOptSwitchSetting;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class RunnableC781530UlD extends RecyclerView implements Runnable {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public volatile boolean LL;
    public long LLILLJJLI;
    public int LLILLL;
    public C0U4C LLILZ;
    public C1300480jwk LLILZIL;
    public int LLILZLL;
    public Window LLIZ;

    public final void LIZJ() {
        this.LL = true;
        if (this.LLILZ == C0U4C.DEFAULT) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rv_add_view_time");
        c474500IjALIZ.LJJII(this.LLILZ.getValue(), "label");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LLILLL), "position");
        c474500IjALIZ.LJJII(Long.valueOf((SystemClock.uptimeMillis() - this.LLILLJJLI) - 300), "use_time");
        c474500IjALIZ.LIZ();
        C1300480jwk c1300480jwk = this.LLILZIL;
        if (c1300480jwk == null) {
            c1300480jwk = null;
        }
        c1300480jwk.stop();
    }

    public final void LIZLLL() {
        int i;
        if (LiveRecyclerViewImageOptSetting.INSTANCE.enabled() && (i = this.LLILZLL) != 0) {
            addOnScrollListener(new C0UVV(i));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("LiveRecyclerView@8d9b.run");
        try {
            LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("LiveRecyclerView@8d9b.run");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        HandlerHook.viewRemoveCallbacks(this, this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view != null) {
            HandlerHook.viewRemoveCallbacks(view, this);
            if (!this.LL) {
                this.LLILLL = getChildAdapterPosition(view);
                HandlerHook.viewPostDelay(view, this, 300L);
            }
        }
    }

    public final void setPauseLoadImageWhenScrollWithoutExperiment(int i) {
        if (i >= 0) {
            addOnScrollListener(new C0UVV(i));
        }
    }

    public RunnableC781530UlD(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RunnableC781530UlD(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILZ = C0U4C.DEFAULT;
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC438390HGz());
    }

    public final RecyclerView.RecycledViewPool LJ(C0U4C c0u4c, boolean z, Window window) {
        Object obj;
        String strLIZIZ;
        LinearLayoutManager linearLayoutManager;
        Object obj2;
        if (c0u4c == C0U4C.DEFAULT || c0u4c == this.LLILZ) {
            return null;
        }
        this.LLILZ = c0u4c;
        this.LLILZLL = LiveRecyclerViewImageOptSetting.INSTANCE.dyForRvLabel(c0u4c.getValue());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rv_slide_");
        sbLIZ.append(this.LLILZ.getValue());
        C1300480jwk c1300480jwk = new C1300480jwk(C2188811AlT.LIZIZ(sbLIZ), 1, null, null, 28);
        C006A c006aLIZJ = C1161920gLG.LIZJ(IHostUser.class);
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Map map = (Map) dataChannelGlobal.gg0(C1148040fys.class);
        Object obj3 = 0;
        if (map == null || (obj = map.get("anchor_id")) == null) {
            obj = obj3;
        }
        c1300480jwk.LJIIIIZZ = Intrinsics.LJFF(c006aLIZJ, obj);
        addOnScrollListener(new C772770UTb(c1300480jwk, this.LLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("rv_");
        sbLIZ2.append(this.LLILZ.getValue());
        C1300480jwk c1300480jwk2 = new C1300480jwk(C2188811AlT.LIZIZ(sbLIZ2), 1, null, null, 28);
        C006A c006aLIZJ2 = C1161920gLG.LIZJ(IHostUser.class);
        Map map2 = (Map) dataChannelGlobal.gg0(C1148040fys.class);
        if (map2 != null && (obj2 = map2.get("anchor_id")) != null) {
            obj3 = obj2;
        }
        c1300480jwk2.LJIIIIZZ = Intrinsics.LJFF(c006aLIZJ2, obj3);
        this.LLILZIL = c1300480jwk2;
        if (!c1300480jwk2.LJIIIZ) {
            c1300480jwk2.LIZJ(this.LLIZ);
        }
        this.LLILLJJLI = SystemClock.uptimeMillis();
        if (!LiveRecyclerviewPerformanceOptSwitchSetting.INSTANCE.enableReusePool()) {
            return null;
        }
        RecyclerView.LayoutManager layoutManager = getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            linearLayoutManager.mRecycleChildrenOnDetach = true;
        }
        this.LLIZ = window;
        if (z) {
            strLIZIZ = this.LLILZ.getValue();
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(this.LLILZ.getValue());
            sbLIZ3.append("_L");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        ConcurrentHashMap<String, RecyclerView.RecycledViewPool> concurrentHashMap = C781290Ukp.LIZ;
        RecyclerView.RecycledViewPool recycledViewPool = concurrentHashMap.get(strLIZIZ);
        if (recycledViewPool == null) {
            recycledViewPool = new RecyclerView.RecycledViewPool();
            concurrentHashMap.put(strLIZIZ, recycledViewPool);
        }
        setRecycledViewPool(recycledViewPool);
        return recycledViewPool;
    }
}
