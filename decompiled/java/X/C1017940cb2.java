package X;

import Y.ACListenerS151S0100000_16;
import Y.ARunnableS116S0100000_16;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAnoleManager;
import com.ss.android.ugc.aweme.api.IFeedService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0cb2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017940cb2 {
    public static final String LJIIIIZZ = EnumC696280RSw.TT_FEED_MINICARD_HALF_SCREEN_BOTTOM.getSlotName();
    public final Context LIZ;
    public final Aweme LIZIZ;
    public DialogC1378340lyK LIZJ;
    public final FrameLayout LIZLLL;
    public final int LJ;
    public boolean LJFF;
    public boolean LJI;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(561));

    public final void LJ() {
        this.LJI = true;
        try {
            LJFF();
            DialogC1378340lyK dialogC1378340lyK = this.LIZJ;
            if (dialogC1378340lyK != null) {
                dialogC1378340lyK.dismiss();
                C785410UrT.LIZ(dialogC1378340lyK);
            }
            this.LIZJ = null;
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public final void LIZ() {
        C1022620cia.LJ("AdCIPMiniCardAnoleModul", "didHide");
        C1701940uOG.LIZIZ().LIZIZ(new ARunnableS116S0100000_16(this, 278));
    }

    public final void LIZIZ() {
        InterfaceC1017820caq interfaceC1017820caq;
        C1D2P c1d2pLJIIIIZZ;
        C1022620cia.LJ("AdCIPMiniCardAnoleModul", "didShow");
        AwemeRawAd awemeRawAd = this.LIZIZ.getAwemeRawAd();
        if (awemeRawAd == null || (interfaceC1017820caq = (InterfaceC1017820caq) this.LJII.getValue()) == null || (c1d2pLJIIIIZZ = interfaceC1017820caq.LJIIIIZZ(awemeRawAd)) == null) {
            return;
        }
        c1d2pLJIIIIZZ.LJIJJLI(1, 0, null, null);
    }

    public final void LIZJ() {
        C1022620cia.LJ("AdCIPMiniCardAnoleModul", "didShowFailed");
        C1701940uOG.LIZIZ().LIZIZ(new ARunnableS116S0100000_16(this, 279));
    }

    public final InterfaceC1008930cMV LIZLLL() {
        String strLIZIZ;
        IFeedService iFeedServiceLIZIZ;
        InterfaceC1017820caq interfaceC1017820caq = (InterfaceC1017820caq) this.LJII.getValue();
        if (interfaceC1017820caq == null || (strLIZIZ = interfaceC1017820caq.LIZIZ()) == null) {
            strLIZIZ = "homepage_hot";
        }
        ICommerceService iCommerceService = (ICommerceService) PluggableExtentionKt.pluggableSpi$default(ICommerceService.class, false, false, false, 14, null);
        if (iCommerceService == null || (iFeedServiceLIZIZ = iCommerceService.LIZIZ()) == null) {
            return null;
        }
        return iFeedServiceLIZIZ.LIZJ(this.LIZ, this.LIZIZ, strLIZIZ, true);
    }

    public final void LJFF() {
        IAnoleManager iAnoleManagerRi;
        IAnoleManager iAnoleManagerRi2;
        if (this.LJFF) {
            C1022620cia.LJ("AdCIPMiniCardAnoleModul", "unmount");
            this.LJFF = false;
            InterfaceC1008930cMV interfaceC1008930cMVLIZLLL = LIZLLL();
            if (interfaceC1008930cMVLIZLLL != null && (iAnoleManagerRi2 = interfaceC1008930cMVLIZLLL.Ri()) != null) {
                iAnoleManagerRi2.LJIIIIZZ(LJIIIIZZ);
            }
            InterfaceC1008930cMV interfaceC1008930cMVLIZLLL2 = LIZLLL();
            if (interfaceC1008930cMVLIZLLL2 == null || (iAnoleManagerRi = interfaceC1008930cMVLIZLLL2.Ri()) == null) {
                return;
            }
            iAnoleManagerRi.LJIIJJI(LJIIIIZZ);
        }
    }

    public C1017940cb2(Context context, Aweme aweme, int i) {
        this.LIZIZ = aweme;
        this.LIZ = context;
        FrameLayout frameLayout = new FrameLayout(context);
        this.LIZLLL = frameLayout;
        frameLayout.setClickable(true);
        C786410Ut5.O7(frameLayout, new ACListenerS151S0100000_16(this, 185));
        this.LJ = i;
        DialogC1378340lyK dialogC1378340lyK = new DialogC1378340lyK(context, frameLayout);
        this.LIZJ = dialogC1378340lyK;
        dialogC1378340lyK.setOnCancelListener(new DialogInterfaceOnCancelListenerC1077290e8l(this, 1));
        C1701940uOG.LIZIZ().LIZJ(new ARunnableS116S0100000_16(this, 277), 3L, TimeUnit.SECONDS);
    }
}
