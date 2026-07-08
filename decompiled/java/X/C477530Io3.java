package X;

import Y.ACListenerS142S0100000_7;
import Y.ARunnableS75S0200000_6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleOwner;
import avg.f;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.live.view.LiveEventSpaceButtonView$registerUnmuteOnReturn$observer$1;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import mf.a;

/* JADX INFO: renamed from: X.0Io3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477530Io3 extends FrameLayout {
    public C0P0T LL;
    public boolean LLILLJJLI;
    public LiveEventSpaceButtonView$registerUnmuteOnReturn$observer$1 LLILLL;
    public LifecycleOwner LLILZ;
    public final ARunnableS75S0200000_6 LLILZIL;

    public final void LIZ() {
        C0P0T c0p0t;
        HandlerHook.viewRemoveCallbacks(this, this.LLILZIL);
        C0P0T c0p0t2 = this.LL;
        if (c0p0t2 != null && c0p0t2.isShowing() && (c0p0t = this.LL) != null) {
            c0p0t.dismiss();
        }
        this.LL = null;
    }

    public final void LIZJ() {
        LiveEventSpaceButtonView$registerUnmuteOnReturn$observer$1 liveEventSpaceButtonView$registerUnmuteOnReturn$observer$1 = this.LLILLL;
        LifecycleOwner lifecycleOwner = this.LLILZ;
        if (liveEventSpaceButtonView$registerUnmuteOnReturn$observer$1 != null && lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(liveEventSpaceButtonView$registerUnmuteOnReturn$observer$1);
        }
        this.LLILLL = null;
        this.LLILZ = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        LIZ();
        LIZJ();
    }

    public static void LIZIZ(boolean z) {
        try {
            C477540Io4.LIZ.setCurrentPlayerMute(z);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZLLL(boolean z) {
        Boolean boolLIZ;
        if (z) {
            C339190DRl.LIZLLL(this);
            if (C500260Jjc.LJJJJIZL(this) && (((boolLIZ = InterfaceC1106030et7.O9.LIZ()) == null || !boolLIZ.booleanValue()) && C500260Jjc.LJJJJIZL(this))) {
                HandlerHook.viewRemoveCallbacks(this, this.LLILZIL);
                HandlerHook.viewPostDelay(this, this.LLILZIL, 1000L);
            }
            if (!this.LLILLJJLI) {
                this.LLILLJJLI = true;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_event_space_button_show");
                c474500IjALIZ.LJJII("live_merge", "enter_from_merge");
                c474500IjALIZ.LIZ();
                return;
            }
            return;
        }
        LIZ();
        C339190DRl.LIZIZ(this);
    }

    public C477530Io3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = new ARunnableS75S0200000_6((Object) context, (Object) this, 81);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.dco, this, true);
        View.OnClickListener aCListenerS142S0100000_7 = new ACListenerS142S0100000_7(this, 183);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS142S0100000_7) : aCListenerS142S0100000_7);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }
}
