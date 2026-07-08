package X;

import android.view.View;
import android.view.animation.LinearInterpolator;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS173S1100000_24;

/* JADX INFO: renamed from: X.0TFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@InterfaceC20647615qs("main_slide_guide_mask")
public final class C743690TFf extends AbstractC20660815t0 {
    public static final LinearInterpolator LLILZIL = new LinearInterpolator();
    public final View LL;
    public final Function0<Unit> LLILLJJLI;
    public final int LLILLL;
    public boolean LLILZ;

    @Override // X.AbstractC20656215sG
    public final boolean canShow() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC20660515sx
    public final int getPriority() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC20659015si
    public final void LJFF(C688120Qyw c688120Qyw, C20656615sK c20656615sK) {
        LJIIL(this.LL, this.LLILLJJLI, true);
    }

    public C743690TFf(InterfaceC20658015sY interfaceC20658015sY, View view, AwS173S1100000_24 awS173S1100000_24) {
        super(interfaceC20658015sY);
        this.LL = view;
        this.LLILLJJLI = awS173S1100000_24;
        this.LLILLL = LSPassThroughRecordSizeConfig.DEFAULT;
        this.LLILZ = true;
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
            view.animate().alpha(1.0f - f).setDuration(150L).setInterpolator(LLILZIL).withEndAction(new Runnable() { // from class: X.00oC
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SlideGuideMaskTask@3991.doAnimation$1");
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
                    C1C7U.LIZIZ("SlideGuideMaskTask@3991.doAnimation$1");
                }
            }).start();
        }
    }
}
