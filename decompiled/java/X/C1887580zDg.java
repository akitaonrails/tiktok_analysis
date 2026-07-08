package X;

import android.app.Activity;
import android.content.Context;
import android.view.Window;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.BackPressConfig;
import com.bytedance.sdk.xbridge.runtime.depend.IHostStyleUIDepend;
import com.bytedance.sdk.xbridge.runtime.depend.PageTitleBar;
import com.bytedance.sdk.xbridge.runtime.depend.PopupConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zDg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1887580zDg extends AbstractC1887590zDh {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) throws C1549560qQU {
        Context context;
        IHostStyleUIDepend iHostStyleUIDepend;
        InterfaceC1887650zDn interfaceC1887650zDn;
        String title;
        String titleColor;
        Boolean hideNavBar;
        String navBarColor;
        String statusBarBgColor;
        String statusFontMode;
        String navBtnType;
        Number disableNavBarBackButton;
        Number disableMaskClickClose;
        Number enablePullDownClose;
        Number disableBackPress;
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        Integer numValueOf4;
        C1874950ytJ c1874950ytJ;
        C1874950ytJ c1874950ytJ2;
        InterfaceC1887600zDi interfaceC1887600zDi = (InterfaceC1887600zDi) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        Window window = null;
        if (interfaceC634840OvC != null) {
            context = interfaceC634840OvC.getContext();
        } else {
            context = null;
        }
        InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
        if (interfaceC634840OvC2 == null || (c1874950ytJ2 = (C1874950ytJ) interfaceC634840OvC2.LIZIZ(C1874950ytJ.class)) == null || (iHostStyleUIDepend = c1874950ytJ2.LIZIZ) == null) {
            C1874950ytJ c1874950ytJ3 = C1874950ytJ.LJIIL;
            if (c1874950ytJ3 != null) {
                iHostStyleUIDepend = c1874950ytJ3.LIZIZ;
            } else {
                iHostStyleUIDepend = null;
            }
        }
        InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
        if (interfaceC634840OvC3 == null || (c1874950ytJ = (C1874950ytJ) interfaceC634840OvC3.LIZIZ(C1874950ytJ.class)) == null || (interfaceC1887650zDn = c1874950ytJ.LIZJ) == null) {
            C1874950ytJ c1874950ytJ4 = C1874950ytJ.LJIIL;
            if (c1874950ytJ4 != null) {
                interfaceC1887650zDn = c1874950ytJ4.LIZJ;
            } else {
                interfaceC1887650zDn = null;
            }
        }
        if (context == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        Activity activityLIZ = C0XS4.LIZ(context);
        InterfaceC1887610zDj pageUI = interfaceC1887600zDi.getPageUI();
        if (pageUI != null) {
            title = pageUI.getTitle();
        } else {
            title = null;
        }
        InterfaceC1887610zDj pageUI2 = interfaceC1887600zDi.getPageUI();
        if (pageUI2 != null) {
            titleColor = pageUI2.getTitleColor();
        } else {
            titleColor = null;
        }
        InterfaceC1887610zDj pageUI3 = interfaceC1887600zDi.getPageUI();
        if (pageUI3 != null) {
            hideNavBar = pageUI3.getHideNavBar();
        } else {
            hideNavBar = null;
        }
        InterfaceC1887610zDj pageUI4 = interfaceC1887600zDi.getPageUI();
        if (pageUI4 != null) {
            navBarColor = pageUI4.getNavBarColor();
        } else {
            navBarColor = null;
        }
        InterfaceC1887610zDj pageUI5 = interfaceC1887600zDi.getPageUI();
        if (pageUI5 != null) {
            statusBarBgColor = pageUI5.getStatusBarBgColor();
        } else {
            statusBarBgColor = null;
        }
        InterfaceC1887610zDj pageUI6 = interfaceC1887600zDi.getPageUI();
        if (pageUI6 != null) {
            statusFontMode = pageUI6.getStatusFontMode();
        } else {
            statusFontMode = null;
        }
        InterfaceC1887620zDk pageInteraction = interfaceC1887600zDi.getPageInteraction();
        if (pageInteraction != null) {
            navBtnType = pageInteraction.getNavBtnType();
        } else {
            navBtnType = null;
        }
        InterfaceC1887620zDk pageInteraction2 = interfaceC1887600zDi.getPageInteraction();
        if (pageInteraction2 != null) {
            disableNavBarBackButton = pageInteraction2.getDisableNavBarBackButton();
        } else {
            disableNavBarBackButton = null;
        }
        InterfaceC1887630zDl popupInteraction = interfaceC1887600zDi.getPopupInteraction();
        if (popupInteraction != null) {
            disableMaskClickClose = popupInteraction.getDisableMaskClickClose();
        } else {
            disableMaskClickClose = null;
        }
        InterfaceC1887630zDl popupInteraction2 = interfaceC1887600zDi.getPopupInteraction();
        if (popupInteraction2 != null) {
            enablePullDownClose = popupInteraction2.getEnablePullDownClose();
        } else {
            enablePullDownClose = null;
        }
        InterfaceC1887640zDm commonInteraction = interfaceC1887600zDi.getCommonInteraction();
        if (commonInteraction != null) {
            disableBackPress = commonInteraction.getDisableBackPress();
        } else {
            disableBackPress = null;
        }
        if (statusFontMode != null) {
            if (activityLIZ != null) {
                window = activityLIZ.getWindow();
            }
            C483510Ixh.LJ(activityLIZ, window, Intrinsics.LJFF("dark", statusFontMode));
        }
        if (activityLIZ != null && statusBarBgColor != null && statusBarBgColor.length() != 0) {
            C483510Ixh.LIZLLL(ColorProtector.parseColor(C483510Ixh.LIZJ(statusBarBgColor)), activityLIZ);
        }
        if (iHostStyleUIDepend != null) {
            InterfaceC634840OvC interfaceC634840OvC4 = this.IBridgeSdkContext;
            String strLIZJ = C483510Ixh.LIZJ(titleColor);
            String strLIZJ2 = C483510Ixh.LIZJ(navBarColor);
            if (disableNavBarBackButton != null) {
                numValueOf4 = Integer.valueOf(disableNavBarBackButton.intValue());
            } else {
                numValueOf4 = null;
            }
            iHostStyleUIDepend.setPageNaviStyle(interfaceC634840OvC4, activityLIZ, new PageTitleBar(title, strLIZJ, strLIZJ2, numValueOf4, navBtnType, hideNavBar));
        }
        if (interfaceC1887650zDn != null) {
            InterfaceC634840OvC interfaceC634840OvC5 = this.IBridgeSdkContext;
            if (disableMaskClickClose != null) {
                numValueOf = Integer.valueOf(disableMaskClickClose.intValue());
            } else {
                numValueOf = null;
            }
            if (enablePullDownClose != null) {
                numValueOf2 = Integer.valueOf(enablePullDownClose.intValue());
            } else {
                numValueOf2 = null;
            }
            interfaceC1887650zDn.LIZ(interfaceC634840OvC5, new PopupConfig(numValueOf, numValueOf2));
            InterfaceC634840OvC interfaceC634840OvC6 = this.IBridgeSdkContext;
            if (disableBackPress != null) {
                numValueOf3 = Integer.valueOf(disableBackPress.intValue());
            } else {
                numValueOf3 = null;
            }
            interfaceC1887650zDn.LIZIZ(interfaceC634840OvC6, new BackPressConfig(numValueOf3));
        }
        completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZLLL(C13LE.LIZ(InterfaceC1887660zDo.class)), "");
    }
}
