package X;

import Y.ARunnableS103S0100000_3;
import android.content.DialogInterface;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.model.AdlpExtraModel;
import com.ss.android.ugc.aweme.landpage.popup.AdLandingPagePopUpBehavior;
import com.ss.android.ugc.aweme.landpage.popup.TuxAdLandingPagePopUpBehavior;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cuy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1030300cuy {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(197));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(198));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.0kl3] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.view.ViewGroup, android.widget.FrameLayout] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [X.0kpH, com.bytedance.lighten.loader.SmartImageView] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.C19EG r22, android.widget.FrameLayout r23, X.C1026310coX r24) {
        /*
            Method dump skipped, instruction units count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1030300cuy.LIZIZ(X.19EG, android.widget.FrameLayout, X.0coX):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TuxSheet LIZ(C19EG c19eg, Fragment fragment, C1026310coX c1026310coX, DialogInterfaceOnDismissListenerC1077340e8q dialogInterfaceOnDismissListenerC1077340e8q, String str) {
        String containerBgColor;
        boolean zBooleanValue;
        InterfaceC1034470d1h interfaceC1034470d1h;
        InterfaceC1058150ddt interfaceC1058150ddt;
        View viewFindViewById;
        boolean zBooleanValue2;
        int iIntValue;
        int i = 0;
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJI = fragment;
        tuxSheet.LLLIIIL = Boolean.FALSE;
        tuxSheet.LLJLILLLLZIIL = false;
        tuxSheet.LLJJIJIL = null;
        tuxSheet.LLJJJ = null;
        if (fragment instanceof DialogInterface.OnDismissListener) {
            tuxSheet.LLILLJJLI = (DialogInterface.OnDismissListener) fragment;
        }
        Boolean bool = c1026310coX.getTuxSheetConfig().hasOverlay;
        if (bool != null) {
            c1390920mIc.LIZ.LLJJIJIIJIL = bool.booleanValue();
        }
        Boolean bool2 = c1026310coX.getTuxSheetConfig().cancelOnTouchOutside;
        if (bool2 != null) {
            c1390920mIc.LIZ.LLILLL = bool2.booleanValue();
        }
        c1390920mIc.LJIIIIZZ(c1026310coX.getTuxSheetConfig().variant);
        Boolean dismissedOnBackKeyPressed = c1026310coX.getTuxSheetConfig().getDismissedOnBackKeyPressed();
        if (dismissedOnBackKeyPressed != null) {
            c1390920mIc.LIZ.LLJLLIL = dismissedOnBackKeyPressed.booleanValue();
        }
        if (c1026310coX.getTuxSheetConfig().variant == 2) {
            c1390920mIc.LIZ.LLJLL = true;
            c1390920mIc.LIZIZ(c1026310coX.getTuxSheetConfig().peekHeight, c1026310coX.getTuxSheetConfig().dynamicHeight);
        } else if (c1026310coX.getTuxSheetConfig().variant != 0) {
            c1390920mIc.LJFF(c1026310coX.getTuxSheetConfig().defaultHeightRatio);
            c1390920mIc.LIZ.LLJLL = true;
        }
        if (c1026310coX.getTuxSheetConfig().variant == 1) {
            c1390920mIc.LIZ.LLJJL = (int) (C14KQ.LJ(c19eg) * c1026310coX.getTuxSheetConfig().defaultHeightRatio);
        }
        Boolean hideable = c1026310coX.getTuxSheetConfig().getHideable();
        if (hideable != null) {
            c1390920mIc.LIZ.LLJLLL = hideable.booleanValue();
        } else {
            new AwS560S0100000_16(c1390920mIc, 811);
        }
        AdlpExtraModel adlpExtraModel = c1026310coX.getAdlpExtraModel();
        if (adlpExtraModel != null) {
            containerBgColor = adlpExtraModel.getContainerBgColor();
        } else {
            containerBgColor = null;
        }
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1b, c19eg);
        if (containerBgColor != null && containerBgColor.length() != 0) {
            try {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI(containerBgColor);
                if (numLJIIJJI != null) {
                    iIntValue = numLJIIJJI.intValue();
                } else {
                    iIntValue = 0;
                }
                c1390920mIc.LIZ.LLJI = Integer.valueOf(new C1058140dds(iIntValue).getColor(c19eg, null));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                c1390920mIc.LIZ.LLJI = numLIZJ;
                C1AF0.LJ(e);
            }
        } else {
            c1390920mIc.LIZ.LLJI = numLIZJ;
        }
        c1390920mIc.LIZLLL(C1385040m98.LIZLLL(c19eg), false);
        if (C299110Bnx.LIZ()) {
            TuxAdLandingPagePopUpBehavior tuxAdLandingPagePopUpBehavior = new TuxAdLandingPagePopUpBehavior(c19eg);
            tuxAdLandingPagePopUpBehavior.LJJJI = c1026310coX.getAwemeRawAd();
            tuxAdLandingPagePopUpBehavior.LJJJIL = tuxAdLandingPagePopUpBehavior.LJJJIL;
            tuxAdLandingPagePopUpBehavior.LJJJJ = fragment;
            if (c1026310coX.getTuxSheetConfig().getDragable() != null) {
                Boolean dragable = c1026310coX.getTuxSheetConfig().getDragable();
                if (dragable != null) {
                    zBooleanValue2 = dragable.booleanValue();
                } else {
                    zBooleanValue2 = true;
                }
                tuxAdLandingPagePopUpBehavior.LJIJI = zBooleanValue2;
            }
            c1390920mIc.LIZ.LLLIIIIL = tuxAdLandingPagePopUpBehavior;
        } else {
            AdLandingPagePopUpBehavior adLandingPagePopUpBehavior = new AdLandingPagePopUpBehavior(c19eg);
            adLandingPagePopUpBehavior.LJ = c1026310coX.getAwemeRawAd();
            adLandingPagePopUpBehavior.LJFF = adLandingPagePopUpBehavior.LJFF;
            adLandingPagePopUpBehavior.LJI = fragment;
            if (c1026310coX.getTuxSheetConfig().getDragable() != null) {
                Boolean dragable2 = c1026310coX.getTuxSheetConfig().getDragable();
                if (dragable2 != null) {
                    zBooleanValue = dragable2.booleanValue();
                } else {
                    zBooleanValue = true;
                }
                adLandingPagePopUpBehavior.setDraggable(zBooleanValue);
            }
            c1390920mIc.LIZ.LLLIIII = adLandingPagePopUpBehavior;
        }
        TuxSheet tuxSheet2 = c1390920mIc.LIZ;
        tuxSheet2.LLILLJJLI = dialogInterfaceOnDismissListenerC1077340e8q;
        tuxSheet2.LL = new DialogInterfaceOnCancelListenerC1077270e8j(fragment, c1026310coX, 0);
        tuxSheet2.showNow(c19eg.getSupportFragmentManager(), str);
        View view = fragment.getView();
        boolean z = !Intrinsics.LJFF(c1026310coX.getTuxSheetConfig().hideMoreMenu, Boolean.TRUE);
        if (view != null && (viewFindViewById = view.findViewById(R.id.tk1)) != null) {
            if (!z) {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, viewFindViewById);
        }
        if ((fragment instanceof InterfaceC1058150ddt) && (interfaceC1058150ddt = (InterfaceC1058150ddt) fragment) != null) {
            AwS260S0300000_16 awS260S0300000_16 = new AwS260S0300000_16(fragment, interfaceC1058150ddt, tuxSheet2, 23);
            View view2 = fragment.getView();
            if (view2 != null) {
                HandlerHook.viewPost(view2, new ARunnableS103S0100000_3((Object) awS260S0300000_16, 114));
            } else {
                awS260S0300000_16.invoke();
            }
        }
        if ((fragment instanceof InterfaceC1034470d1h) && (interfaceC1034470d1h = (InterfaceC1034470d1h) fragment) != null) {
            interfaceC1034470d1h.ge(EnumC1036640d5C.PAGE_SELECT);
        }
        return tuxSheet2;
    }
}
