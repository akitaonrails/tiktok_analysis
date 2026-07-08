package X;

import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS72S0100100_24;

/* JADX INFO: renamed from: X.0rkk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@InterfaceC20647615qs("home_sidebar_revisit_edu_feed_guide_popup")
public final class C1600560rkk extends AbstractC20660815t0 {
    public static final LinearInterpolator LLIZ = new LinearInterpolator();
    public final View LL;
    public final Function0<Unit> LLILLJJLI;
    public final Function0<Unit> LLILLL;
    public final Function0<Unit> LLILZ;
    public final int LLILZIL;
    public boolean LLILZLL;

    @Override // X.AbstractC20656215sG
    public final void onConflict() {
        super.onConflict();
        this.LLILZLL = false;
        C786410Ut5.LJLLLLLL(8, this.LL);
        this.LLILLL.invoke();
        onConflict();
    }

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return this.LLILZLL;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        LJIIL(this.LL, this.LLILLJJLI, true);
    }

    public static final void LJIIL(final View view, final Function0 function0, final boolean z) {
        boolean z2;
        float f;
        if (view.getVisibility() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == z) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (z) {
                f = 0.0f;
            } else {
                f = 1.0f;
            }
            C786410Ut5.T4(view, f);
            C786410Ut5.LJLLLLLL(0, view);
            view.animate().alpha(1.0f - f).setDuration(150L).setInterpolator(LLIZ).withEndAction(new Runnable() { // from class: X.00oB
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("HomeSidebarRevisitEduSlideGuideMaskTask@f147.doAnimation$1");
                    try {
                        C786410Ut5.LJLLLLLL(z ? 0 : 8, view);
                        Function0<Unit> function02 = function0;
                        if (function02 != null) {
                            function02.invoke();
                        }
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("HomeSidebarRevisitEduSlideGuideMaskTask@f147.doAnimation$1");
                }
            }).start();
        }
    }

    public C1600560rkk(InterfaceC20658015sY interfaceC20658015sY, View view, AwS72S0100100_24 awS72S0100100_24, AwS568S0100000_24 awS568S0100000_24, AwS72S0100100_24 awS72S0100100_242) {
        super(interfaceC20658015sY);
        this.LL = view;
        this.LLILLJJLI = awS72S0100100_24;
        this.LLILLL = awS568S0100000_24;
        this.LLILZ = awS72S0100100_242;
        this.LLILZIL = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LLILZLL = true;
    }
}
