package X;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.android.livesdk.livesetting.gift.ReleaseLynxGiftOnCompletionTimeout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS418S0200000_17;

/* JADX INFO: renamed from: X.0fnn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141170fnn extends FrameLayout implements InterfaceC1059280dfi, InterfaceC1141530foN, Handler.Callback, GenericLifecycleObserver {
    public static final /* synthetic */ int LLJJJ = 0;
    public final BPEAHandler LL;
    public C1095800ecc LLILLJJLI;
    public SparkContext LLILLL;
    public String LLILZ;
    public C1141420foC LLILZIL;
    public C1540820qCO LLILZLL;
    public C1141370fo7 LLIZ;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLIZLLLIL;
    public C1141320fo2 LLJ;
    public InterfaceC1141000fnW LLJI;
    public C1141220fns LLJIJIL;
    public Set<? extends InterfaceC1063710dmr> LLJILJIL;
    public Map<String, ? extends InterfaceC1138440fjO> LLJILJILJ;
    public InterfaceC1141570foR LLJILLL;
    public boolean LLJJ;
    public InterfaceC1140870fnJ LLJJI;
    public long LLJJIII;
    public Function2<? super Integer, ? super String, Boolean> LLJJIJI;
    public Function2<? super Integer, ? super String, Boolean> LLJJIJIIJIL;
    public long LLJJIJIL;

    @Override // X.InterfaceC1059280dfi
    public final void close() {
        C1141240fnu.LIZLLL(null, "LynxCall_ttlive_gift_render,lynx closed");
    }

    public View getView() {
        return this;
    }

    @Override // X.InterfaceC1059280dfi
    public final void m3(boolean z) {
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_RESUME) {
            onResume();
        } else if (event == Lifecycle.Event.ON_PAUSE) {
            onPause();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC1051240dSk
    public final void refresh() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        InterfaceC1140870fnJ interfaceC1140870fnJ = this.LL.hasMessages(1002) ? this.LLJJI : null;
        LIZJ(true);
        C1141050fnb c1141050fnb = new C1141050fnb(-27, "page destroy", null);
        C1138610fjf c1138610fjf = new C1138610fjf();
        c1138610fjf.LIZLLL = "lynx_native";
        c1141050fnb.LIZLLL = c1138610fjf;
        if (interfaceC1140870fnJ != null) {
            interfaceC1140870fnJ.LJI(EnumC1138990fkH.LYNX, c1141050fnb);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void onPause() {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.onHide();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void onResume() {
        InterfaceC1541990qEH kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB == null || (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getKitView()) == null) {
            return;
        }
        kitView.onShow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        onDestroy();
    }

    public C1141170fnn(Context context) {
        Lifecycle lifecycle;
        super(context);
        this.LL = new BPEAHandler(Looper.getMainLooper(), this);
        this.LLJILJILJ = C2097608Jq.LJ();
        LifecycleOwner lifecycleOwnerLJJIFFI = C520010KaN.LJJIFFI(context, false);
        if (lifecycleOwnerLJJIFFI != null && (lifecycle = lifecycleOwnerLJJIFFI.getLifecycle()) != null) {
            lifecycle.addObserver(this);
        }
    }

    public final void LIZJ(boolean z) {
        InterfaceC1141280fny interfaceC1141280fny;
        this.LL.removeMessages(1001);
        this.LL.removeMessages(1002);
        this.LL.removeMessages(1003);
        if (this.LLJILLL != null && (interfaceC1141280fny = (InterfaceC1141280fny) C2043807zY.LIZ(InterfaceC1141280fny.class)) != null) {
            interfaceC1141280fny.LIZLLL();
        }
        C1141320fo2 c1141320fo2 = this.LLJ;
        if (c1141320fo2 != null) {
            c1141320fo2.LIZIZ();
        }
        this.LLJ = null;
        if (z) {
            C1141240fnu.LIZ(null, "LynxCall_ttlive_gift_render release#destroyLynxView");
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLIZLLLIL;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, null);
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.removeAllViews();
                SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJIL(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB);
                this.LLIZLLLIL = null;
            }
            this.LLILLL = null;
            C1540820qCO c1540820qCO = this.LLILZLL;
            if (c1540820qCO != null) {
                c1540820qCO.LLILLL = true;
                this.LLILZLL = null;
            }
            this.LLILLJJLI = null;
            C1141370fo7 c1141370fo7 = this.LLIZ;
            if (c1141370fo7 != null) {
                c1141370fo7.LLILLJJLI = true;
                this.LLIZ = null;
            }
            C1141420foC c1141420foC = this.LLILZIL;
            if (c1141420foC != null) {
                c1141420foC.LLILLJJLI = true;
                C1548820qPI.LJIIIIZZ("lynx_gift_on_ready", c1141420foC);
                C1548820qPI.LJIIIIZZ("lynx_gift_on_completion", c1141420foC);
                C1548820qPI.LJIIIIZZ("lynx_gift_on_error", c1141420foC);
                Iterator<Map.Entry<String, ? extends InterfaceC1138440fjO>> it2 = this.LLJILJILJ.entrySet().iterator();
                while (it2.hasNext()) {
                    C1548820qPI.LJIIIIZZ(it2.next().getKey(), c1141420foC);
                }
                this.LLILZIL = null;
            }
        }
        int visibility = getVisibility();
        setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, this);
        this.LLJILJILJ = C2097608Jq.LJ();
        this.LLJILJIL = C08CX.INSTANCE;
        this.LLJILLL = null;
        this.LLJJI = null;
        this.LLJJIJI = null;
        this.LLJJIJIIJIL = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LLJJ && super.dispatchTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (message.what) {
            case 1001:
                LIZIZ(0, -31, "fe lynx ready timeout");
                return false;
            case 1002:
                InterfaceC1140870fnJ interfaceC1140870fnJ = this.LLJJI;
                LIZJ(ReleaseLynxGiftOnCompletionTimeout.on());
                if (interfaceC1140870fnJ != null) {
                    interfaceC1140870fnJ.LJI(EnumC1138990fkH.LYNX, new C1141050fnb(-25, "complete timout", null));
                    return false;
                }
                return false;
            case 1003:
                LIZJ(true);
                return false;
            default:
                return false;
        }
    }

    @Override // X.InterfaceC1141530foN
    public final void mh2(C262100zr c262100zr) {
        C1141290fnz.LJFF(new AwS418S0200000_17(c262100zr, this, 26));
    }

    public final void LIZ(int i, int i2, String str) {
        Function2<? super Integer, ? super String, Boolean> function2 = this.LLJJIJIIJIL;
        InterfaceC1140870fnJ interfaceC1140870fnJ = this.LLJJI;
        LIZJ(true);
        if (function2 == null || !function2.invoke(Integer.valueOf(i), str).booleanValue()) {
            C1141050fnb c1141050fnb = new C1141050fnb(i2, str, null);
            C1138610fjf c1138610fjf = new C1138610fjf();
            c1138610fjf.LIZLLL = "lynx_native";
            c1141050fnb.LIZLLL = c1138610fjf;
            if (interfaceC1140870fnJ != null) {
                interfaceC1140870fnJ.LJI(EnumC1138990fkH.LYNX, c1141050fnb);
            }
        }
    }

    public final void LIZIZ(int i, int i2, String str) {
        Function2<? super Integer, ? super String, Boolean> function2 = this.LLJJIJI;
        InterfaceC1140870fnJ interfaceC1140870fnJ = this.LLJJI;
        LIZJ(true);
        if ((function2 == null || !function2.invoke(Integer.valueOf(i), str).booleanValue()) && interfaceC1140870fnJ != null) {
            interfaceC1140870fnJ.LJI(EnumC1138990fkH.LYNX, new C1141050fnb(i2, str, null));
        }
    }
}
