package X;

import Y.ARunnableS116S0100000_16;
import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.ISeaPdpCommunicationService;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.CommonParamsContext;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.PageStateContext;
import com.zhiliaoapp.musically.R;
import irm.AkS63S0200000_26;
import irm.AkS93S0100000_26;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS570S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vq5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757630vq5 extends AbstractC1757620vq4 {
    public final InterfaceC665370Q7z LLJJJJLIIL;
    public final EnumC1757300vpY LLJJL;
    public TuxIconView LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public FrameLayout LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public ViewPropertyAnimator LLJLL;
    public ViewPropertyAnimator LLJLLIL;

    @Override // X.AbstractC1757620vq4
    public int getLayoutRes() {
        return R.layout.awo;
    }

    @Override // X.AbstractC1757620vq4, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIILL() {
        if (this.LLJJIII) {
            return;
        }
        TuxIconView tuxIconView = this.LLJL;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(0, tuxIconView);
        }
        TuxIconView tuxIconView2 = this.LLJL;
        if (tuxIconView2 != null) {
            tuxIconView2.setIconRes(R.raw.icon_video_slash_fill);
        }
    }

    public final ISeaPdpCommunicationService getEventCenter() {
        return (ISeaPdpCommunicationService) this.LLJLILLLLZIIL.getValue();
    }

    @Override // X.InterfaceC1757590vq1
    public final boolean LJ() {
        PageStateContext pageStateContext = getPageStateContext();
        if (pageStateContext != null) {
            return Intrinsics.LJFF(PageStateContext.LIZ(pageStateContext, "page_show_type"), 2);
        }
        return false;
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        ViewPropertyAnimator viewPropertyAnimator = this.LLJLL;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.LLJLL = null;
        if (!getConfig().LIZLLL) {
            C786410Ut5.LJLLLLLL(8, this);
            return;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
        this.LLJLLIL = viewPropertyAnimatorAnimate;
        viewPropertyAnimatorAnimate.alpha(0.0f).setDuration(200L).withEndAction(new ARunnableS116S0100000_16(this, 47)).start();
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIILJJIL() {
        super.LJIILJJIL();
        TuxIconView tuxIconView = this.LLJL;
        if (tuxIconView != null) {
            C786410Ut5.LJLLLLLL(8, tuxIconView);
        }
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIILLIIL() {
        if (isAttachedToWindow()) {
            LJIJ(true);
        } else {
            HandlerHook.viewPost(this, new ARunnableS126S0100000_26(this, 29));
        }
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIZILJ() {
        LJIIIIZZ();
        EnumC1757650vq7 enumC1757650vq7 = EnumC1757650vq7.SLIDE;
        long playDuration = getPlayDuration();
        Map<String, Object> windowTrackParams = getWindowTrackParams();
        CommonParamsContext commonParamsContext = getCommonParamsContext();
        C1757660vq8.LIZ(enumC1757650vq7, playDuration, windowTrackParams, commonParamsContext != null ? commonParamsContext.LL : null);
    }

    public final InterfaceC665370Q7z getVScope() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1757620vq4
    public EnumC1757300vpY getWindowType() {
        return this.LLJJL;
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIIZ(View view) {
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.window_play_mute_icon);
        this.LLJJLIIIJLLLLLLLZ = tuxIconView;
        if (tuxIconView != null) {
            C786410Ut5.I7(new AkS93S0100000_26(this, 2), tuxIconView);
        }
        this.LLJL = (TuxIconView) view.findViewById(R.id.window_center_icon);
        this.LLJLIL = (FrameLayout) view.findViewById(R.id.video_bottom_layout);
        C786410Ut5.I7(new AkS63S0200000_26(view, this, 1), view.findViewById(R.id.e26));
        setRadius(C0H9H.LIZ(8));
        setCardBackgroundColor(0);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.o55);
        if (viewGroup != null) {
            viewGroup.addView(getMediaView(), 0);
        }
        if (!C804420Vh2.LJFF(view.getContext())) {
            TuxIconView tuxIconView2 = this.LLJL;
            if (tuxIconView2 != null) {
                C786410Ut5.LJLLLLLL(0, tuxIconView2);
            }
            TuxIconView tuxIconView3 = this.LLJL;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconRes(R.raw.icon_wifi_slash);
            }
        }
        setCardElevation(C0H9H.LIZ(12));
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIL(boolean z) {
        super.LJIIL(z);
        if (z) {
            TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView != null) {
                tuxIconView.setIconRes(R.raw.icon_speaker_x_mark_fill_ltr);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView2 == null) {
            return;
        }
        tuxIconView2.setIconRes(R.raw.icon_speaker_2_fill_ltr);
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIJ(boolean z) {
        super.LJIJ(z);
        if (getVisibility() != 0 || this.LLJLLIL != null) {
            ViewPropertyAnimator viewPropertyAnimator = this.LLJLLIL;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
            }
            this.LLJLLIL = null;
            if (getConfig().LIZLLL) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setAlpha(0.0f);
                C786410Ut5.LJLLLLLL(0, this);
                ViewPropertyAnimator viewPropertyAnimatorAnimate = animate();
                this.LLJLL = viewPropertyAnimatorAnimate;
                viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(200L).withEndAction(new ARunnableS116S0100000_16(this, 48)).start();
                return;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
            C786410Ut5.LJLLLLLL(0, this);
        }
    }

    public final void LJIJI(View view) {
        ViewGroup.LayoutParams layoutParams;
        FrameLayout frameLayout = this.LLJLIL;
        if (frameLayout != null) {
            frameLayout.addView(view);
        }
        TuxIconView tuxIconView = this.LLJJLIIIJLLLLLLLZ;
        if (tuxIconView != null && (layoutParams = tuxIconView.getLayoutParams()) != null && (layoutParams instanceof FrameLayout.LayoutParams)) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 8388659;
            TuxIconView tuxIconView2 = this.LLJJLIIIJLLLLLLLZ;
            if (tuxIconView2 != null) {
                C786410Ut5.M6(tuxIconView2, layoutParams);
            }
        }
    }

    public final void setMuted(boolean z) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        getMediaController().LJFF(z);
        Map<String, Object> windowTrackParams = getWindowTrackParams();
        CommonParamsContext commonParamsContext = getCommonParamsContext();
        if (commonParamsContext != null) {
            concurrentHashMap = commonParamsContext.LL;
        } else {
            concurrentHashMap = null;
        }
        C1757660vq8.LIZIZ(z, windowTrackParams, concurrentHashMap);
    }

    @Override // X.InterfaceC1757340vpc
    public final void LIZLLL(int i, int i2) {
        int iLIZ = C679280Qkg.LIZ(96);
        float f = i / i2;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(iLIZ, iLIZ);
        }
        double d = f;
        if (d <= 0.8d) {
            layoutParams.width = iLIZ;
            layoutParams.height = (int) (iLIZ * 1.7777778f);
        } else if ((d > 0.8d && d <= 1.2d) || d > 1.2d) {
            layoutParams.width = iLIZ;
            layoutParams.height = (int) (iLIZ * 1.3333334f);
        }
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        requestLayout();
    }

    public C1757630vq5(Context context, InterfaceC665370Q7z interfaceC665370Q7z, C1757580vq0 c1757580vq0, InterfaceC1757740vqG interfaceC1757740vqG, View view, Lifecycle lifecycle) {
        super(context, interfaceC665370Q7z, c1757580vq0, interfaceC1757740vqG, view, lifecycle);
        this.LLJJJJLIIL = interfaceC665370Q7z;
        this.LLJJL = EnumC1757300vpY.MINI;
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS570S0100000_26(this, 412));
        C786410Ut5.LJLLLLLL(8, this);
    }
}
