package X;

import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.homepage.ui.view.tab.top.MainTabStrip;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rWN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1591650rWN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ MainTabStrip LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1591650rWN(MainTabStrip mainTabStrip) {
        super(0);
        this.LL = mainTabStrip;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        final MainTabStrip mainTabStrip = this.LL;
        HandlerHook.viewPost(mainTabStrip.LLILLJJLI, new Runnable() { // from class: X.0rWO
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("MainTabStrip@28b8.attach$4$1$1");
                try {
                    MainTabStrip mainTabStrip2 = mainTabStrip;
                    C1592450rXf c1592450rXf = mainTabStrip2.LLILLJJLI;
                    InterfaceC1589880rTW interfaceC1589880rTW = mainTabStrip2.LLILZIL;
                    C1591980rWu c1591980rWuLJIILIIL = c1592450rXf.LJIILIIL(interfaceC1589880rTW != null ? interfaceC1589880rTW.getCurrentItemCompat() : 0);
                    if (c1591980rWuLJIILIIL != null) {
                        C1592450rXf c1592450rXf2 = c1591980rWuLJIILIIL.LIZJ;
                        if (c1592450rXf2 == null) {
                            "Tab not attached to a TabLayout".toString();
                            throw new IllegalArgumentException("Tab not attached to a TabLayout");
                        }
                        C337800DMc c337800DMc = C1592450rXf.LLLIZZ;
                        c1592450rXf2.LJIJJ(c1591980rWuLJIILIIL, true);
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("MainTabStrip@28b8.attach$4$1$1");
            }
        });
        return Unit.LIZ;
    }
}
