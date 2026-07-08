package X;

import Y.ARunnableS126S0100000_26;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.widget.RadiusLayout;
import com.ss.android.ugc.aweme.ecommerce.dependency.network.NetworkUtilDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.network.INetworkUtilDependencyService;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0vq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1757610vq3 extends AbstractC1757620vq4 {
    public final EnumC1757300vpY LLJJJJLIIL;
    public LinearLayout LLJJL;
    public RadiusLayout LLJJLIIIJLLLLLLLZ;
    public TuxIconView LLJL;
    public FrameLayout LLJLIL;
    public SmartImageView LLJLILLLLZIIL;
    public FrameLayout LLJLL;

    @Override // X.InterfaceC1757340vpc
    public final void LIZLLL(int i, int i2) {
    }

    @Override // X.InterfaceC1757590vq1
    public final boolean LJ() {
        return true;
    }

    @Override // X.AbstractC1757620vq4
    public int getLayoutRes() {
        return R.layout.awn;
    }

    @Override // X.AbstractC1757620vq4, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    private final Drawable getBackgroundDrawable() {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LJFF = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZLLL = Integer.valueOf(C0H9H.LIZIZ(1));
        return c384050F3z.LIZ(getContextWrapper());
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIJ() {
        HandlerHook.viewPost(this, new ARunnableS126S0100000_26(this, 28));
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIILL() {
        SmartImageView smartImageView = this.LLJLILLLLZIIL;
        if (smartImageView != null) {
            C0H1U.LIZIZ(smartImageView);
        }
        FrameLayout frameLayout = this.LLJLIL;
        if (frameLayout != null) {
            C0H1U.LIZIZ(frameLayout);
        }
        TuxIconView tuxIconView = this.LLJL;
        if (tuxIconView != null) {
            C12ES.LJIILL(0, tuxIconView);
        }
    }

    private final Context getContextWrapper() {
        return getContext();
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        C0H1U.LIZIZ(this);
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIJJI() {
        getMediaController().LJ();
    }

    @Override // X.AbstractC1757620vq4
    public EnumC1757300vpY getWindowType() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIIIZ(View view) {
        this.LLJJL = (LinearLayout) view.findViewById(R.id.video_container);
        this.LLJJLIIIJLLLLLLLZ = (RadiusLayout) view.findViewById(R.id.video_content_container);
        this.LLJL = (TuxIconView) view.findViewById(R.id.lze);
        this.LLJLIL = (FrameLayout) view.findViewById(R.id.ibe);
        this.LLJLILLLLZIIL = (SmartImageView) view.findViewById(R.id.lzd);
        this.LLJLL = (FrameLayout) view.findViewById(R.id.ccd);
        FrameLayout frameLayout = this.LLJLIL;
        if (frameLayout != null) {
            frameLayout.addView(getMediaView());
        }
        setRadius(C0H9H.LIZ(8));
        setCardElevation(C0H9H.LIZ(12));
        setCardBackgroundColor(0);
        RadiusLayout radiusLayout = this.LLJJLIIIJLLLLLLLZ;
        if (radiusLayout != null) {
            radiusLayout.setSmoothRadius(true);
        }
    }

    @Override // X.AbstractC1757620vq4
    public final void LJIJ(boolean z) {
        super.LJIJ(z);
        C12ES.LJIILL(0, this);
    }

    public C1757610vq3(Context context, InterfaceC665370Q7z interfaceC665370Q7z, C1757580vq0 c1757580vq0, C1757240vpS c1757240vpS, View view, Lifecycle lifecycle) {
        AnonymousClass0317 anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        super(new ContextThemeWrapper(context, R.style.y3), interfaceC665370Q7z, c1757580vq0, c1757240vpS, view, lifecycle);
        this.LLJJJJLIIL = EnumC1757300vpY.MICRO;
        LinearLayout linearLayout = this.LLJJL;
        if (linearLayout != null) {
            linearLayout.setBackground(getBackgroundDrawable());
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = NetworkUtilDependencyService.createINetworkUtilDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = INetworkUtilDependencyService.class.getName();
            if (anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(INetworkUtilDependencyService.class);
        }
        if (!((INetworkUtilDependencyService) anonymousClass0317CreateINetworkUtilDependencyServicebyMonsterPlugin).isNetworkAvailable(getContextWrapper())) {
            SmartImageView smartImageView = this.LLJLILLLLZIIL;
            if (smartImageView != null) {
                C0H1U.LIZIZ(smartImageView);
            }
            FrameLayout frameLayout = this.LLJLIL;
            if (frameLayout != null) {
                C0H1U.LIZIZ(frameLayout);
            }
            TuxIconView tuxIconView = this.LLJL;
            if (tuxIconView != null) {
                C12ES.LJIILL(0, tuxIconView);
                return;
            }
            return;
        }
        TuxIconView tuxIconView2 = this.LLJL;
        if (tuxIconView2 != null) {
            C0H1U.LIZIZ(tuxIconView2);
        }
        FrameLayout frameLayout2 = this.LLJLIL;
        if (frameLayout2 == null) {
            return;
        }
        C12ES.LJIILL(0, frameLayout2);
    }
}
