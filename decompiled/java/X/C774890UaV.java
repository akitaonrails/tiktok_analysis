package X;

import android.content.Context;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.broadcast.api.IBroadcastService;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LinkMicMgPreviewLivePageSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* JADX INFO: renamed from: X.0UaV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774890UaV implements InterfaceC773120UUk {
    public FrameLayout LL;
    public C1324720kZq LLILLJJLI;
    public SurfaceView LLILLL;
    public View LLILZ;
    public View LLILZIL;
    public ImageView LLILZLL;
    public C1324720kZq LLIZ;

    @Override // X.InterfaceC773120UUk
    public final View ai() {
        return null;
    }

    @Override // X.InterfaceC773120UUk
    public final void tb() {
        C1324720kZq c1324720kZq = this.LLILLJJLI;
        if (c1324720kZq != null) {
            C500260Jjc.LJLJLJ(c1324720kZq, false);
        }
        SurfaceView surfaceView = this.LLILLL;
        if (surfaceView != null) {
            C500260Jjc.LJLJLJ(surfaceView, false);
        }
    }

    @Override // X.InterfaceC773120UUk
    public final ViewGroup JM() {
        return this.LL;
    }

    @Override // X.InterfaceC773120UUk
    public final C1324720kZq Kl() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC773120UUk
    public final SurfaceView fI() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC773120UUk
    public final C1324720kZq fm() {
        return this.LLIZ;
    }

    @Override // X.InterfaceC773120UUk
    public final ImageView kE() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC773120UUk
    public final View mj() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC773120UUk
    public final View on() {
        return this.LLILZ;
    }

    public final void LIZ(FrameLayout frameLayout, SurfaceView surfaceView, boolean z) {
        ViewParent parent;
        float fLIZLLL;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams;
        this.LL = frameLayout;
        this.LLILLJJLI = (C1324720kZq) frameLayout.findViewById(R.id.mu5);
        this.LLIZ = (C1324720kZq) frameLayout.findViewById(R.id.mtz);
        this.LLILLL = surfaceView;
        this.LLILZ = frameLayout.findViewById(R.id.wq1);
        this.LLILZIL = frameLayout.findViewById(R.id.wq7);
        this.LLILZLL = (ImageView) frameLayout.findViewById(R.id.hlh);
        SurfaceView surfaceView2 = this.LLILLL;
        Integer numValueOf = null;
        if (surfaceView2 != null) {
            parent = surfaceView2.getParent();
        } else {
            parent = null;
        }
        if (!(parent instanceof FrameLayout)) {
            Map<String, Object> map = C1338270kvh.LIZ;
        }
        C1271250jBb c1271250jBb = C1271270jBd.LIZ;
        c1271250jBb.LIZ.LJI(true);
        SurfaceView surfaceView3 = this.LLILLL;
        if (surfaceView3 != null) {
            if (c1271250jBb.LJFF(2)) {
                fLIZLLL = c1271250jBb.LIZLLL();
            } else {
                fLIZLLL = 0.5625f;
            }
            int iIntValue = 0;
            if (((IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class)).getPanelLayoutType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (LinkMicMgPreviewLivePageSetting.INSTANCE.showLayoutInPreviewLivePage() && z && z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("needSkipResizeSurfaceView: ");
            sbLIZ.append(z3);
            sbLIZ.append(", reuseSurfaceView: ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("VideoLiveBottomUILayerManager", C2188811AlT.LIZIZ(sbLIZ));
            C770230UJh.LIZ.getClass();
            if ((((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() || ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).Yd2()) && C770230UJh.LIZLLL()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z3 || z4) {
                C769220UFk c769220UFk = C769220UFk.LIZ;
                Context context = surfaceView3.getContext();
                View view = this.LLILZ;
                View view2 = this.LLILZIL;
                C0UF6 c0uf6LIZJ = C0UF5.LIZJ();
                if (c0uf6LIZJ != null && c0uf6LIZJ.LIZ) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (C770230UJh.LJ() && C770230UJh.LIZLLL()) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                C769220UFk.LIZIZ(c769220UFk, context, surfaceView3, view, view2, z5, fLIZLLL, false, z6, 64);
            }
            ViewGroup.LayoutParams layoutParams2 = surfaceView3.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2;
            } else {
                marginLayoutParams = null;
            }
            View view3 = this.LLILZ;
            if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                numValueOf = Integer.valueOf(layoutParams.height);
            }
            if (marginLayoutParams != null) {
                IBroadcastService iBroadcastService = (IBroadcastService) C1161920gLG.LIZJ(IBroadcastService.class);
                int i = marginLayoutParams.width;
                int i2 = marginLayoutParams.height;
                int i3 = marginLayoutParams.topMargin;
                int i4 = marginLayoutParams.leftMargin;
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                }
                iBroadcastService.setStreamAreaInfo(i, i2, i3, i4, iIntValue);
            }
        }
    }
}
