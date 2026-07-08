package X;

import Y.ACListenerS147S0100000_12;
import Y.ARunnableS112S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.keva.Keva;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TJy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744920TJy implements C1A2M {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(279));
    public final HashSet<String> LIZIZ = new HashSet<>();
    public boolean LIZJ;
    public ViewGroup LIZLLL;
    public TuxTextView LJ;
    public C744910TJx LJFF;
    public ARunnableS112S0100000_12 LJI;
    public Function0<Unit> LJII;
    public String LJIIIIZZ;

    @Override // X.C1A2M
    public final void LIZJ() {
        LJIIL(false);
    }

    @Override // X.C1A2M
    public final void LIZLLL() {
        ViewGroup viewGroup;
        LJIIL(false);
        C744910TJx c744910TJx = this.LJFF;
        if (c744910TJx != null) {
            c744910TJx.LL.clearAnimation();
            C786410Ut5.LJLLLLLL(8, c744910TJx);
        }
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView != null) {
            HandlerHook.viewRemoveCallbacks(tuxTextView, this.LJI);
        }
        this.LJI = null;
        TuxTextView tuxTextView2 = this.LJ;
        if (tuxTextView2 != null && (viewGroup = this.LIZLLL) != null) {
            C786410Ut5.LJJJLZIJ(tuxTextView2, viewGroup);
        }
        ViewGroup viewGroup2 = this.LIZLLL;
        if (viewGroup2 != null) {
            C786410Ut5.LJLLLLLL(8, viewGroup2);
        }
        this.LJ = null;
        this.LIZLLL = null;
        this.LJFF = null;
        this.LJII = null;
        this.LJIIIIZZ = null;
    }

    @Override // X.C1A2M
    public final void LJII() {
        LJIIL(false);
        LJIILIIL();
    }

    @Override // X.C1A2M
    public final void LIZ() {
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView == null || tuxTextView.getVisibility() != 0) {
            return;
        }
        this.LJI = new ARunnableS112S0100000_12(this, 295);
        TuxTextView tuxTextView2 = this.LJ;
        if (tuxTextView2 != null) {
            HandlerHook.viewPostDelay(tuxTextView2, this.LJI, 2000L);
        }
    }

    @Override // X.C1A2M
    public final C0TK0 LIZIZ() {
        return new C0TK0(1.0f, 4.0f);
    }

    @Override // X.C1A2M
    public final boolean LJIIIIZZ() {
        return ((Number) C263880AVu.LIZ.getValue()).intValue() != 0;
    }

    @Override // X.C1A2M
    public final boolean LJIIJ() {
        return ((Number) C263880AVu.LIZ.getValue()).intValue() == 2;
    }

    public final void LJIILIIL() {
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (C1389340mG4.LIZJ(tuxTextView.getContext(), null).LJFF) {
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120));
            }
        } else if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(111));
        }
        TuxTextView tuxTextView2 = this.LJ;
        if (tuxTextView2 != null) {
            C786410Ut5.R6(tuxTextView2, marginLayoutParams);
        }
    }

    @Override // X.C1A2M
    public final boolean LJ(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return Intrinsics.LJFF(this.LJIIIIZZ, aweme.getAid());
    }

    @Override // X.C1A2M
    public final void LJIIIZ(float f) {
        String string;
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView == null) {
            return;
        }
        if (f <= 1.01f) {
            tuxTextView.setText(2131840509);
        } else {
            Context context = tuxTextView.getContext();
            if (context != null) {
                string = context.getString(2131840510, C786410Ut5.j4("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
            } else {
                string = null;
            }
            tuxTextView.setText(string);
        }
        TuxTextView tuxTextView2 = this.LJ;
        if (tuxTextView2 != null && tuxTextView2.getVisibility() != 0) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("action_type", "show");
            C20684815ws.LJIILLIIL("revert_to_default", c2344009Gk.LIZ);
        }
        TuxTextView tuxTextView3 = this.LJ;
        if (tuxTextView3 != null) {
            C337180DJs.LIZJ(tuxTextView3);
        }
        TuxTextView tuxTextView4 = this.LJ;
        if (tuxTextView4 != null) {
            HandlerHook.viewRemoveCallbacks(tuxTextView4, this.LJI);
        }
        this.LJI = null;
    }

    @Override // X.C1A2M
    public final void LJIIJJI(Aweme aweme) {
        this.LJIIIIZZ = aweme.getAid();
    }

    public final void LJIIL(boolean z) {
        TuxTextView tuxTextView = this.LJ;
        if (tuxTextView != null) {
            C786410Ut5.LJLLLLLL(8, tuxTextView);
        }
        Function0<Unit> function0 = this.LJII;
        if (function0 != null) {
            function0.invoke();
        }
        if (z) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJFF("action_type", "click");
            C20684815ws.LJIILLIIL("revert_to_default", c2344009Gk.LIZ);
        }
    }

    @Override // X.C1A2M
    public final void LJFF(ViewGroup viewGroup, AwS577S0100000_33 awS577S0100000_33) {
        if (viewGroup == null || !LJIIIIZZ()) {
            return;
        }
        this.LJII = awS577S0100000_33;
        this.LIZLLL = viewGroup;
        C337180DJs.LIZJ(viewGroup);
        TuxTextView tuxTextView = (TuxTextView) viewGroup.findViewById(R.id.x0j);
        this.LJ = tuxTextView;
        if (tuxTextView == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.fj5, viewGroup, false);
            TuxTextView tuxTextView2 = (TuxTextView) viewTd.findViewById(R.id.x0j);
            this.LJ = tuxTextView2;
            if (tuxTextView2 != null) {
                C786410Ut5.LJLLLLLL(8, tuxTextView2);
            }
            viewGroup.addView(viewTd);
        }
        LJIILIIL();
        TuxTextView tuxTextView3 = this.LJ;
        if (tuxTextView3 != null) {
            C786410Ut5.h9(tuxTextView3, new ACListenerS147S0100000_12(this, 327));
        }
    }

    @Override // X.C1A2M
    public final void LJI(ViewGroup viewGroup, Aweme aweme, String str) {
        IPluginService.ReinstallCheck deviceCheckResult;
        if (viewGroup == null || this.LIZJ || !LJIIIIZZ()) {
            return;
        }
        IPluginService iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null);
        if (iPluginService != null) {
            deviceCheckResult = iPluginService.getDeviceCheckResult();
        } else {
            deviceCheckResult = null;
        }
        if (deviceCheckResult == IPluginService.ReinstallCheck.NON_REINSTALL || Intrinsics.LJFF(str, "homepage_hot")) {
            return;
        }
        if (this.LIZIZ.size() < 10) {
            if (aweme != null) {
                this.LIZIZ.add(aweme.getAid());
                return;
            }
            return;
        }
        long j = ((Keva) this.LIZ.getValue()).getLong("pinch_guide_last_seen", 0L);
        int i = ((Keva) this.LIZ.getValue()).getInt("pinch_guide_times_shown", 0);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (i < 3 && j <= jCurrentTimeMillis - ((long) 86400000)) {
            C337180DJs.LIZJ(viewGroup);
            this.LJFF = new C744910TJx(viewGroup.getContext());
            C744910TJx c744910TJx = this.LJFF;
            if (c744910TJx != null) {
                C1391850mK7.LIZIZ(c744910TJx, "tablet_pinch_to_zoom_tutorial");
                C337180DJs.LIZJ(c744910TJx);
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c744910TJx);
                c744910TJx.setAlpha(1.0f);
                C1303280k1G c1303280k1G = c744910TJx.LL;
                c1303280k1G.setAnimation(R.raw.tux_lottie_tux_gestures_with_device_tt_pinch_in_device);
                c1303280k1G.setRepeatCount(-1);
                c1303280k1G.playAnimation();
                C786410Ut5.LJLIIL(Mp4ScreenVideoLoadTimeout.CONTROL, c744910TJx.LLILLJJLI, new ARunnableS112S0100000_12(c744910TJx, 294));
            }
            viewGroup.addView(this.LJFF, new ViewGroup.LayoutParams(-1, -1));
            this.LIZJ = true;
            int i2 = ((Keva) this.LIZ.getValue()).getInt("pinch_guide_times_shown", 0) + 1;
            ((Keva) this.LIZ.getValue()).storeLong("pinch_guide_last_seen", System.currentTimeMillis());
            ((Keva) this.LIZ.getValue()).storeInt("pinch_guide_times_shown", i2);
        }
    }
}
