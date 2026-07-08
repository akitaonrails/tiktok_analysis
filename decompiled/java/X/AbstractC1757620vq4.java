package X;

import Y.ARunnableS95S0200000_26;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PdpViewModelDelegate;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.SeaPdpFragmentScope;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public abstract class AbstractC1757620vq4 extends CardView implements InterfaceC1757340vpc, InterfaceC1757750vqH, DefaultLifecycleObserver, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJJJJIL = 0;
    public final C1757580vq0 LLIZLLLIL;
    public final InterfaceC1757740vqG LLJ;
    public final View LLJI;
    public final Lifecycle LLJIJIL;
    public final C1757640vq6 LLJILJIL;
    public Map<String, ? extends Object> LLJILJILJ;
    public final PageStateContext LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Long LLJJIJIL;
    public final View LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;

    public abstract void LJIIIZ(View view);

    public void LJIIJ() {
    }

    public void LJIIJJI() {
    }

    public void LJIILJJIL() {
        this.LLJJIII = true;
        if (this.LLJJIJIIJIL) {
            this.LLJJIJIIJIL = false;
            Map<String, ? extends Object> map = this.LLJILJILJ;
            CommonParamsContext commonParamsContext = getCommonParamsContext();
            ConcurrentHashMap<String, Object> concurrentHashMap = commonParamsContext != null ? commonParamsContext.LL : null;
            HashMap map2 = new HashMap();
            if (concurrentHashMap != null) {
                map2.putAll(concurrentHashMap);
            }
            if (map != null) {
                map2.putAll(map);
            }
            C1018703yb.LIZIZ("tiktokec_mini_window_play", map2);
        }
        this.LLJJIJIL = Long.valueOf(SystemClock.elapsedRealtime());
    }

    public void LJIILL() {
    }

    public void LJIILLIIL() {
    }

    public void LJIIZILJ() {
    }

    public abstract int getLayoutRes();

    @Override // X.InterfaceC1757590vq1
    public View getView() {
        return this;
    }

    public abstract EnumC1757300vpY getWindowType();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C356901a3.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C356901a3.LJ(this, lifecycleOwner);
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C356901a3.LJFF(this, lifecycleOwner);
    }

    @Override // X.InterfaceC1757750vqH
    public final void LIZIZ() {
        this.LLJ.LIZLLL();
        Map<String, ? extends Object> map = this.LLJILJILJ;
        CommonParamsContext commonParamsContext = getCommonParamsContext();
        ConcurrentHashMap<String, Object> concurrentHashMap = commonParamsContext != null ? commonParamsContext.LL : null;
        HashMap map2 = new HashMap();
        if (concurrentHashMap != null) {
            map2.putAll(concurrentHashMap);
        }
        if (map != null) {
            map2.putAll(map);
        }
        C1018703yb.LIZIZ("tiktokec_mini_window_tap", map2);
    }

    public void LJIIIIZZ() {
        this.LLJ.LJI();
    }

    public final CommonParamsContext getCommonParamsContext() {
        return (CommonParamsContext) this.LLJJ.getValue();
    }

    public int getDragAreaHeight() {
        View view;
        C1757640vq6 c1757640vq6 = this.LLJILJIL;
        Object parent = c1757640vq6.LIZ.getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return 0;
        }
        float measuredHeight = (view.getMeasuredHeight() - c1757640vq6.LJII) - c1757640vq6.LJIIIZ;
        if (measuredHeight < 1.0f) {
            measuredHeight = 1.0f;
        }
        return (int) measuredHeight;
    }

    public int getDragAreaWidth() {
        View view;
        C1757640vq6 c1757640vq6 = this.LLJILJIL;
        Object parent = c1757640vq6.LIZ.getParent();
        if (!(parent instanceof ViewGroup) || (view = (View) parent) == null) {
            return 0;
        }
        float measuredWidth = (view.getMeasuredWidth() - c1757640vq6.LJI) - c1757640vq6.LJIIIIZZ;
        if (measuredWidth < 1.0f) {
            measuredWidth = 1.0f;
        }
        return (int) measuredWidth;
    }

    public int getParentPaddingBottom() {
        return (int) this.LLJILJIL.LJIIIZ;
    }

    public int getParentPaddingTop() {
        return (int) this.LLJILJIL.LJII;
    }

    public final long getPlayDuration() {
        long jElapsedRealtime;
        Long l = this.LLJJIJIL;
        if (l != null) {
            jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
        } else {
            jElapsedRealtime = 0;
        }
        this.LLJJIJIL = null;
        return jElapsedRealtime;
    }

    public final PdpViewModelDelegate getSeaPdpViewModelDelegate() {
        return (PdpViewModelDelegate) this.LLJJI.getValue();
    }

    public int getViewHeight() {
        return this.LLJILJIL.LIZ.getMeasuredHeight();
    }

    public int getViewWidth() {
        return this.LLJILJIL.LIZ.getMeasuredWidth();
    }

    public final C1757580vq0 getConfig() {
        return this.LLIZLLLIL;
    }

    public final View getContentView() {
        return this.LLJJJ;
    }

    public final Lifecycle getLifecycle() {
        return this.LLJIJIL;
    }

    public final InterfaceC1757740vqG getMediaController() {
        return this.LLJ;
    }

    public final View getMediaView() {
        return this.LLJI;
    }

    public final PageStateContext getPageStateContext() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC1757590vq1
    public C1757580vq0 getWindowConfig() {
        return this.LLIZLLLIL;
    }

    public final Map<String, Object> getWindowTrackParams() {
        return this.LLJILJILJ;
    }

    public void LJIIL(boolean z) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Map<String, ? extends Object> map = this.LLJILJILJ;
        CommonParamsContext commonParamsContext = getCommonParamsContext();
        if (commonParamsContext != null) {
            concurrentHashMap = commonParamsContext.LL;
        } else {
            concurrentHashMap = null;
        }
        C1757660vq8.LIZIZ(z, map, concurrentHashMap);
    }

    public void LJIJ(boolean z) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        if (z) {
            this.LLJ.LIZJ();
        }
        this.LLJ.LIZIZ();
        if (this.LLJJIJI) {
            this.LLJJIJI = false;
            Map<String, ? extends Object> map = this.LLJILJILJ;
            CommonParamsContext commonParamsContext = getCommonParamsContext();
            if (commonParamsContext != null) {
                concurrentHashMap = commonParamsContext.LL;
            } else {
                concurrentHashMap = null;
            }
            HashMap map2 = new HashMap();
            if (concurrentHashMap != null) {
                map2.putAll(concurrentHashMap);
            }
            if (map != null) {
                map2.putAll(map);
            }
            C1018703yb.LIZIZ("tiktokec_mini_window_show", map2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        PageStateContext pageStateContext;
        PageStateContext pageStateContext2;
        C356901a3.LIZIZ(this, lifecycleOwner);
        this.LLJIJIL.removeObserver(this);
        String str = this.LLJJJIL;
        if (str != null && (pageStateContext2 = this.LLJILLL) != null) {
            PageStateContext.LJFF(pageStateContext2, "page_state_sheet", str);
        }
        String str2 = this.LLJJJJ;
        if (str2 != null && (pageStateContext = this.LLJILLL) != null) {
            PageStateContext.LJFF(pageStateContext, "page_show_type", str2);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onPause(LifecycleOwner lifecycleOwner) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        C356901a3.LIZJ(this, lifecycleOwner);
        EnumC1757650vq7 enumC1757650vq7 = EnumC1757650vq7.LEAVE;
        long playDuration = getPlayDuration();
        Map<String, ? extends Object> map = this.LLJILJILJ;
        CommonParamsContext commonParamsContext = getCommonParamsContext();
        if (commonParamsContext != null) {
            concurrentHashMap = commonParamsContext.LL;
        } else {
            concurrentHashMap = null;
        }
        C1757660vq8.LIZ(enumC1757650vq7, playDuration, map, concurrentHashMap);
    }

    public void setInitialPosition(Function0<C1757600vq2> function0) {
        HandlerHook.viewPost(this, new ARunnableS95S0200000_26(this, function0, 9));
    }

    public final void setStartPlay(boolean z) {
        this.LLJJIII = z;
    }

    public final void setWindowTrackParams(Map<String, ? extends Object> map) {
        this.LLJILJILJ = map;
    }

    @Override // X.InterfaceC1757750vqH
    public final void LIZ(float f, float f2, float f3, float f4) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        Map<String, ? extends Object> map = this.LLJILJILJ;
        CommonParamsContext commonParamsContext = getCommonParamsContext();
        if (commonParamsContext != null) {
            concurrentHashMap = commonParamsContext.LL;
        } else {
            concurrentHashMap = null;
        }
        HashMap map2 = new HashMap();
        if (concurrentHashMap != null) {
            map2.putAll(concurrentHashMap);
        }
        map2.put("start_x_percent", Float.valueOf(f));
        map2.put("end_x_percent", Float.valueOf(f3));
        map2.put("start_y_percent", Float.valueOf(f2));
        map2.put("end_y_percent", Float.valueOf(f4));
        if (map != null) {
            map2.putAll(map);
        }
        C1018703yb.LIZIZ("tiktokec_mini_window_move", map2);
    }

    public AbstractC1757620vq4(Context context, InterfaceC665370Q7z interfaceC665370Q7z, C1757580vq0 c1757580vq0, InterfaceC1757740vqG interfaceC1757740vqG, View view, Lifecycle lifecycle) {
        Object ability;
        SeaPdpViewModel seaPdpViewModel;
        IPdpStarter.PdpEnterParam pdpEnterParam;
        String strLIZIZ;
        super(context, null);
        this.LLIZLLLIL = c1757580vq0;
        this.LLJ = interfaceC1757740vqG;
        this.LLJI = view;
        this.LLJIJIL = lifecycle;
        C1757640vq6 c1757640vq6 = new C1757640vq6(this);
        c1757640vq6.LJIIL = this;
        this.LLJILJIL = c1757640vq6;
        C0QSJ c0qsjLIZJ = C687700QyG.LIZJ(interfaceC665370Q7z, SeaPdpFragmentScope.class);
        if (c0qsjLIZJ != null) {
            ability = c0qsjLIZJ.getAbility(PageStateContext.class);
        } else {
            ability = null;
        }
        PageStateContext pageStateContext = (PageStateContext) (ability instanceof PageStateContext ? ability : null);
        this.LLJILLL = pageStateContext;
        this.LLJJ = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 410));
        this.LLJJI = C452501pT.LIZIZ(new AwS570S0100000_26(interfaceC665370Q7z, 411));
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = true;
        IPageStateContextCallback iPageStateContextCallback = new IPageStateContextCallback() { // from class: X.0vqB
            @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback
            public final void invoke(Object obj, Object obj2) {
                if (Intrinsics.LJFF(obj2, 1)) {
                    this.LIZ.LJIILLIIL();
                } else {
                    if (!Intrinsics.LJFF(obj2, 0)) {
                        return;
                    }
                    this.LIZ.LJIIZILJ();
                }
            }
        };
        IPageStateContextCallback iPageStateContextCallback2 = new IPageStateContextCallback() { // from class: X.0vqA
            @Override // com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.IPageStateContextCallback
            public final void invoke(Object obj, Object obj2) {
                if (Intrinsics.LJFF(obj2, 2)) {
                    this.LIZ.LJIIJ();
                } else {
                    if (!Intrinsics.LJFF(obj2, 1)) {
                        return;
                    }
                    this.LIZ.LJIIJJI();
                }
            }
        };
        View viewInflate = FrameLayout.inflate(context, getLayoutRes(), this);
        this.LLJJJ = viewInflate;
        C786410Ut5.LJLLLLLL(4, this);
        LJIIIZ(viewInflate);
        c1757640vq6.LIZIZ = true;
        lifecycle.addObserver(this);
        PdpViewModelDelegate seaPdpViewModelDelegate = getSeaPdpViewModelDelegate();
        if (seaPdpViewModelDelegate != null && (seaPdpViewModel = seaPdpViewModelDelegate.LL) != null && (pdpEnterParam = seaPdpViewModel.LLIZ) != null && !pdpEnterParam.fullScreen) {
            if (pageStateContext != null) {
                strLIZIZ = PageStateContext.LIZIZ(pageStateContext, "page_state_sheet", iPageStateContextCallback);
            } else {
                strLIZIZ = null;
            }
            this.LLJJJIL = strLIZIZ;
            this.LLJJJJ = pageStateContext != null ? PageStateContext.LIZIZ(pageStateContext, "page_show_type", iPageStateContextCallback2) : null;
        }
    }
}
