package X;

import Y.ARunnableS117S0100000_17;
import Y.ARunnableS86S0200000_17;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestLiveShowConfigSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eUF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1090610eUF {
    public final FrameLayout LIZ;
    public InterfaceC1090600eUE LIZIZ;
    public final C1324720kZq LIZJ;
    public InterfaceC1090600eUE LIZLLL;
    public final C1324720kZq LJ;
    public final C1143920fsE LJFF;
    public final C1143920fsE LJI;

    public final void LIZIZ() {
        C20441214yg.LJIIIZ("LiveShowAnimationManager", "dispose");
        HandlerHook.viewPost(this.LIZ, new ARunnableS117S0100000_17(this, 196));
    }

    public final void LIZLLL() {
        C20441214yg.LJIIIZ("LiveShowAnimationManager", "startLiveShowAnimation");
        HandlerHook.viewPost(this.LIZ, new ARunnableS86S0200000_17(this, 62));
    }

    public final boolean LIZ(C1324720kZq c1324720kZq) {
        Iterator<View> it2 = new C09RD(this.LIZ).iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next(), c1324720kZq)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZJ(InterfaceC1090600eUE interfaceC1090600eUE) {
        C20441214yg.LJIIIZ("LiveShowAnimationManager", "endLiveShowAnimation");
        HandlerHook.viewPost(this.LIZ, new ARunnableS86S0200000_17(this, interfaceC1090600eUE, 61));
    }

    public C1090610eUF(Context context, FrameLayout frameLayout) {
        String str;
        String str2;
        this.LIZ = frameLayout;
        MultiGuestLiveShowConfigSetting multiGuestLiveShowConfigSetting = MultiGuestLiveShowConfigSetting.INSTANCE;
        if (multiGuestLiveShowConfigSetting.isAnimationDowngradeEnabled()) {
            str = "start_show_downgrade.webp";
        } else {
            str = "start_show.webp";
        }
        if (multiGuestLiveShowConfigSetting.isAnimationDowngradeEnabled()) {
            str2 = "end_show_downgrade.webp";
        } else {
            str2 = "end_show.webp";
        }
        C1324720kZq c1324720kZq = new C1324720kZq(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(320.0f), (int) C497740JfY.LIZIZ(240.0f), 1);
        layoutParams.setMargins(0, (int) C497740JfY.LIZIZ(246.0f), 0, 0);
        C786410Ut5.u6(c1324720kZq, layoutParams);
        this.LIZJ = c1324720kZq;
        C1324720kZq c1324720kZq2 = new C1324720kZq(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams((int) C497740JfY.LIZIZ(320.0f), (int) C497740JfY.LIZIZ(240.0f), 1);
        layoutParams2.setMargins(0, (int) C497740JfY.LIZIZ(246.0f), 0, 0);
        C786410Ut5.u6(c1324720kZq2, layoutParams2);
        this.LJ = c1324720kZq2;
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZ = c1324720kZq;
        c1143920fsE.LIZIZ = "tiktok_live_liveshow_resource_demand";
        c1143920fsE.LIZJ = str;
        c1143920fsE.LJFF = true;
        c1143920fsE.LJ = new C1151950g5B(this, 3);
        this.LJFF = c1143920fsE;
        C1143920fsE c1143920fsE2 = new C1143920fsE();
        c1143920fsE2.LIZ = c1324720kZq2;
        c1143920fsE2.LIZIZ = "tiktok_live_liveshow_resource_demand";
        c1143920fsE2.LIZJ = str2;
        c1143920fsE2.LJFF = true;
        c1143920fsE2.LJIILIIL = true;
        c1143920fsE2.LJ = new C1143950fsH() { // from class: X.0eUD
            public boolean LIZ;

            public final void LJI() {
                if (this.LIZ) {
                    return;
                }
                C1090610eUF c1090610eUF = this.LIZIZ;
                HandlerHook.viewPost(c1090610eUF.LIZ, new ARunnableS117S0100000_17(c1090610eUF, 197));
                InterfaceC1090600eUE interfaceC1090600eUE = this.LIZIZ.LIZLLL;
                if (interfaceC1090600eUE != null) {
                    interfaceC1090600eUE.LIZ();
                }
                this.LIZ = true;
            }

            @Override // X.C1143950fsH
            public final void LJ(Animatable animatable) {
                C20441214yg.LJIIIZ("LiveShowAnimationManager", "endGeckoWebpController onStart");
                this.LIZ = false;
            }

            @Override // X.C1143950fsH
            public final void LJFF(Animatable animatable) {
                C20441214yg.LJIIIZ("LiveShowAnimationManager", "endGeckoWebpController onStop");
                LJI();
            }

            @Override // X.C1143950fsH
            public final void LIZ(Animatable animatable, int i, int i2) {
                if (i == i2) {
                    LJI();
                }
            }
        };
        this.LJI = c1143920fsE2;
        C1143680frq.LJJII("tiktok_live_liveshow_resource_demand", str);
        C1143680frq.LJJII("tiktok_live_liveshow_resource_demand", str2);
    }
}
