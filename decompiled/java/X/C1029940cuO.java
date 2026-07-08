package X;

import Y.ARunnableS116S0100000_16;
import android.view.MotionEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.ability.overlay.ICommerceFeedOverlayAbility;
import com.ss.android.ugc.aweme.ad.service.ICommerceFeedOverlayService;
import com.ss.android.ugc.aweme.commercialize.ad.service.ICommerceVideoService;
import com.ss.android.ugc.aweme.commercialize.model.AdStyleActionModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.AdOneStopLandingPageConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0cuO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029940cuO implements InterfaceC1036270d4b, InterfaceC1036450d4t {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;

    @Override // X.InterfaceC1036270d4b
    public final void Gn(MotionEvent motionEvent) {
    }

    @Override // X.InterfaceC1036450d4t
    public final void LIZIZ(C0N1H c0n1h) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void LLLFFI(TuxSheet tuxSheet, float f) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void LLLLIIIILLL(TuxSheet tuxSheet, int i) {
    }

    @Override // X.InterfaceC1036270d4b
    public final void V() {
    }

    @Override // X.InterfaceC1036270d4b
    public final void Yc() {
    }

    public final void LIZLLL() {
        ICommerceVideoService iCommerceVideoService;
        if (this.LLILLL || (iCommerceVideoService = (ICommerceVideoService) PluggableExtentionKt.pluggableSpi$default(ICommerceVideoService.class, false, false, false, 14, null)) == null || !iCommerceVideoService.isPlaying()) {
            return;
        }
        ICommerceVideoService iCommerceVideoService2 = (ICommerceVideoService) PluggableExtentionKt.pluggableSpi$default(ICommerceVideoService.class, false, false, false, 14, null);
        if (iCommerceVideoService2 != null) {
            iCommerceVideoService2.pausePlay();
        }
        this.LLILLL = true;
    }

    @Override // X.InterfaceC1036450d4t
    public final void LIZ(C0N1H c0n1h) {
        if (c0n1h == C0N1H.BACKGROUND) {
            LIZLLL();
        }
    }

    public final void LIZJ(InterfaceC1034470d1h interfaceC1034470d1h) {
        List<ICommerceFeedOverlayAbility> listLIZ;
        ICommerceVideoService iCommerceVideoService;
        Fragment fragment;
        C19EG activity;
        if (this.LLILLJJLI) {
            return;
        }
        if (interfaceC1034470d1h != null && (fragment = interfaceC1034470d1h.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            C1440005kM.LIZ(new C1029960cuQ(activity, true));
        }
        if (this.LLILLL) {
            ICommerceVideoService iCommerceVideoService2 = (ICommerceVideoService) PluggableExtentionKt.pluggableSpi$default(ICommerceVideoService.class, false, false, false, 14, null);
            if (iCommerceVideoService2 != null && !iCommerceVideoService2.isPlaying() && (iCommerceVideoService = (ICommerceVideoService) PluggableExtentionKt.pluggableSpi$default(ICommerceVideoService.class, false, false, false, 14, null)) != null) {
                iCommerceVideoService.LJIILLIIL();
            }
            this.LLILLL = false;
        }
        ICommerceFeedOverlayService iCommerceFeedOverlayService = (ICommerceFeedOverlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceFeedOverlayService.class, false, false, false, 14, null);
        if (iCommerceFeedOverlayService != null && (listLIZ = iCommerceFeedOverlayService.LIZ()) != null) {
            Iterator<ICommerceFeedOverlayAbility> it2 = listLIZ.iterator();
            while (it2.hasNext()) {
                it2.next().hn2();
            }
        }
        this.LLILLJJLI = true;
        this.LL = false;
    }

    @Override // X.InterfaceC1036270d4b
    public final void Pu(InterfaceC1034470d1h interfaceC1034470d1h) {
        LIZJ(interfaceC1034470d1h);
    }

    @Override // X.InterfaceC1036270d4b
    public final void Rg(InterfaceC1034470d1h interfaceC1034470d1h) {
        Fragment fragment;
        C19EG activity;
        if (interfaceC1034470d1h != null && (fragment = interfaceC1034470d1h.getFragment()) != null && (activity = fragment.getActivity()) != null) {
            C1440005kM.LIZ(new C1029960cuQ(activity, false));
        }
    }

    @Override // X.InterfaceC1036270d4b
    public final void ni(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h) {
        LIZJ(interfaceC1034470d1h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1036270d4b
    public final void s8(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str) {
        List<ICommerceFeedOverlayAbility> listLIZ;
        C1035880d3y c1035880d3y;
        AwemeRawAd awemeRawAd;
        AdStyleActionModel adStyleActionModel;
        AdOneStopLandingPageConfig adOneStopLandingPageConfig;
        Integer shouldContinuePlay;
        InterfaceC1058150ddt interfaceC1058150ddt;
        BottomSheetBehavior bottomSheetBehavior;
        TuxSheetBehavior tuxSheetBehavior;
        if (!(interfaceC1034470d1h instanceof Fragment) || tuxSheet == null) {
            return;
        }
        String str2 = TuxSheet._pnsPageId;
        Fragment fragment = (Fragment) interfaceC1034470d1h;
        C16BC c16bcLJIIIZ = C1391190mJ3.LJIIIZ(fragment);
        if (c16bcLJIIIZ != null) {
            if (C299110Bnx.LIZ()) {
                if ((c16bcLJIIIZ instanceof TuxSheetBehavior) && (tuxSheetBehavior = (TuxSheetBehavior) c16bcLJIIIZ) != null) {
                    tuxSheetBehavior.LJIJI = false;
                }
            } else if ((c16bcLJIIIZ instanceof BottomSheetBehavior) && (bottomSheetBehavior = (BottomSheetBehavior) c16bcLJIIIZ) != null) {
                bottomSheetBehavior.setDraggable(false);
            }
        }
        View view = fragment.getView();
        if (view != null) {
            HandlerHook.viewPost(view, new ARunnableS116S0100000_16(interfaceC1034470d1h, 213));
        }
        if ((interfaceC1034470d1h instanceof InterfaceC1058150ddt) && (interfaceC1058150ddt = (InterfaceC1058150ddt) interfaceC1034470d1h) != null) {
            interfaceC1058150ddt.LLLFFI(tuxSheet, 1.0f);
        }
        if (!this.LL) {
            if (interfaceC1034470d1h == 0 || (c1035880d3y = (C1035880d3y) interfaceC1034470d1h.Sj(C1035880d3y.class)) == null || (awemeRawAd = c1035880d3y.getAwemeRawAd()) == null || (adStyleActionModel = awemeRawAd.getAdStyleActionModel()) == null || (adOneStopLandingPageConfig = adStyleActionModel.landingPageConfig) == null || (shouldContinuePlay = adOneStopLandingPageConfig.getShouldContinuePlay()) == null || shouldContinuePlay.intValue() != 1) {
                LIZLLL();
            }
            ICommerceFeedOverlayService iCommerceFeedOverlayService = (ICommerceFeedOverlayService) PluggableExtentionKt.pluggableSpi$default(ICommerceFeedOverlayService.class, false, false, false, 14, null);
            if (iCommerceFeedOverlayService != null && (listLIZ = iCommerceFeedOverlayService.LIZ()) != null) {
                Iterator<ICommerceFeedOverlayAbility> it2 = listLIZ.iterator();
                while (it2.hasNext()) {
                    it2.next().JT();
                }
            }
            this.LL = true;
            this.LLILLJJLI = false;
        }
    }

    @Override // X.InterfaceC1036270d4b
    public final void ha(TuxSheet tuxSheet, InterfaceC1034470d1h interfaceC1034470d1h, String str, String str2) {
        LIZJ(interfaceC1034470d1h);
    }
}
