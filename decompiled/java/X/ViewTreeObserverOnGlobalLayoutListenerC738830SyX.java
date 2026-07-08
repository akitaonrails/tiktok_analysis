package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.commercialize.feed.assem.midad.MidAdCellComponent;
import com.ss.android.ugc.aweme.feed.landscape.LandscapeInteractEntrancesContainer;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tablet.api.helper.feed.fakelandscape.TabletFakeLandscapeContainerAbility;
import com.ss.android.ugc.feed.platform.cell.RootCellCommonAbility;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import com.ss.android.ugc.feed.platform.tablet.TabletFakeLandscapeInteractAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC738830SyX implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC738830SyX viewTreeObserverOnGlobalLayoutListenerC738830SyX) {
        ViewTreeObserver viewTreeObserver = ((MidAdCellComponent) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).Ip().getViewTreeObserver();
        float fMeasureText = ((MidAdCellComponent) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).Ip().getPaint().measureText(((MidAdCellComponent) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).Ip().getText().toString());
        C786410Ut5.C3(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC738830SyX);
        TuxTextView tuxTextViewIp = ((MidAdCellComponent) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).Ip();
        ViewGroup.LayoutParams layoutParams = ((MidAdCellComponent) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).Ip().getLayoutParams();
        layoutParams.width = ((int) fMeasureText) + 5;
        C786410Ut5.R6(tuxTextViewIp, layoutParams);
        ((MidAdCellComponent) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).Ip().setGravity(17);
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC738830SyX viewTreeObserverOnGlobalLayoutListenerC738830SyX) {
        Integer numIa;
        Object parent;
        int visibility;
        int i;
        RelativeLayout.LayoutParams layoutParams;
        View view;
        View viewFindViewById;
        LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer = (LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0;
        InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbilitySp = landscapeInteractEntrancesContainer.sp();
        if (interactBizTopAreaAttachAbilitySp != null) {
            int iXH = interactBizTopAreaAttachAbilitySp.xH();
            RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) landscapeInteractEntrancesContainer.LLJLIL.getValue();
            if (rootCellCommonAbility != null && (numIa = rootCellCommonAbility.Ia()) != null) {
                int iIntValue = numIa.intValue();
                View view2 = landscapeInteractEntrancesContainer.LLJLLL;
                Object obj = null;
                if (view2 != null) {
                    parent = view2.getParent();
                } else {
                    parent = null;
                }
                if ((parent instanceof ViewGroup) && (view = (View) parent) != null && (viewFindViewById = view.findViewById(R.id.c26)) != null) {
                    visibility = viewFindViewById.getVisibility();
                } else {
                    visibility = -1;
                }
                if (landscapeInteractEntrancesContainer.LLL == visibility && landscapeInteractEntrancesContainer.LLJZ == iXH && iIntValue == landscapeInteractEntrancesContainer.LLJZIJLIL) {
                    return;
                }
                landscapeInteractEntrancesContainer.LLJZ = iXH;
                landscapeInteractEntrancesContainer.LLJZIJLIL = iIntValue;
                landscapeInteractEntrancesContainer.LLL = visibility;
                C724270Sb3 c724270Sb3 = landscapeInteractEntrancesContainer.LLJI;
                if (c724270Sb3 != null) {
                    obj = c724270Sb3.LL;
                }
                if (C20703515zt.LJIIZILJ(((VideoItemParams) obj).getAweme())) {
                    i = landscapeInteractEntrancesContainer.LLLFFI;
                } else {
                    i = landscapeInteractEntrancesContainer.LLLFZ;
                }
                if ((iXH - i) - landscapeInteractEntrancesContainer.LLLII > landscapeInteractEntrancesContainer.LLLI + iIntValue) {
                    landscapeInteractEntrancesContainer.op(iIntValue);
                    return;
                }
                if (Intrinsics.LJFF(landscapeInteractEntrancesContainer.LLLF, "align_caption") && visibility == 8) {
                    landscapeInteractEntrancesContainer.op(iIntValue);
                    return;
                }
                View view3 = landscapeInteractEntrancesContainer.LLJLLL;
                if (view3 == null) {
                    return;
                }
                if (Intrinsics.LJFF(landscapeInteractEntrancesContainer.LLLF, "align_caption")) {
                    ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                    if ((layoutParams2 instanceof RelativeLayout.LayoutParams) && (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) != null && layoutParams.bottomMargin == i) {
                        return;
                    }
                }
                landscapeInteractEntrancesContainer.LLLF = "align_caption";
                RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view3.getLayoutParams();
                layoutParams3.removeRule(10);
                layoutParams3.topMargin = 0;
                InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbilitySp2 = landscapeInteractEntrancesContainer.sp();
                if (interactBizTopAreaAttachAbilitySp2 != null) {
                    interactBizTopAreaAttachAbilitySp2.Ag0(layoutParams3);
                }
                layoutParams3.bottomMargin = i;
                C786410Ut5.W5(view3, layoutParams3);
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC738830SyX viewTreeObserverOnGlobalLayoutListenerC738830SyX) {
        Rect rect = new Rect();
        ((C19656211vM) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).getRootView().getWindowVisibleDisplayFrame(rect);
        int statusBarHeight = ScreenUtils.getStatusBarHeight(((C19656211vM) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).getContext());
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ((C19656211vM) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).getLayoutParams();
        layoutParams.topMargin = statusBarHeight - ((int) C12ES.LIZJ(5.0f, ((C19656211vM) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).getContext()));
        layoutParams.height = rect.height() - ((int) C12ES.LIZJ(279.0f, ((C19656211vM) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).getContext()));
        C19656211vM c19656211vM = (C19656211vM) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c19656211vM);
        c19656211vM.setLayoutParams(layoutParams);
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC738830SyX viewTreeObserverOnGlobalLayoutListenerC738830SyX) {
        if (((View) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).isShown()) {
            C786410Ut5.LJLLLLLL(8, (View) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0);
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC738830SyX viewTreeObserverOnGlobalLayoutListenerC738830SyX) {
        Float fValueOf;
        String str;
        Integer numValueOf;
        Video video;
        FakeLandscapeInfo fakeLandscapeInfo;
        TabletFakeLandscapeContainerAbility tabletFakeLandscapeContainerAbility = (TabletFakeLandscapeContainerAbility) ((TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLIIIIL.getValue();
        if (tabletFakeLandscapeContainerAbility != null) {
            tabletFakeLandscapeContainerAbility.z40();
        }
        TabletFakeLandscapeInteractAssem tabletFakeLandscapeInteractAssem = (TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0;
        if (tabletFakeLandscapeInteractAssem.LLLFZ) {
            C726550Sej c726550Sej = tabletFakeLandscapeInteractAssem.LLLFFI;
            if (c726550Sej != null) {
                c726550Sej.LIZ();
            }
            TabletFakeLandscapeInteractAssem tabletFakeLandscapeInteractAssem2 = (TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0;
            tabletFakeLandscapeInteractAssem2.LLL = true;
            tabletFakeLandscapeInteractAssem2.Fp();
            C726550Sej c726550Sej2 = ((TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLFFI;
            String aid = null;
            if (c726550Sej2 != null) {
                fValueOf = Float.valueOf(c726550Sej2.LJIIIIZZ);
            } else {
                fValueOf = null;
            }
            if (((TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLII) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LIZJ(1, "did_rotate_landscape");
                c2344009Gk.LJ(fValueOf, "aspect_ratio_x100");
                C0RF0 c0rf0 = ((TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).jm().LIZLLL;
                if (c0rf0 != null) {
                    str = c0rf0.LJIIIZ;
                } else {
                    str = null;
                }
                c2344009Gk.LJIIIIZZ("enter_from", str);
                Aweme aweme = ((TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLF;
                if (aweme != null && (video = aweme.getVideo()) != null && (fakeLandscapeInfo = video.getFakeLandscapeInfo()) != null) {
                    numValueOf = Integer.valueOf(fakeLandscapeInfo.getFakeLandscapeVideoType());
                } else {
                    numValueOf = null;
                }
                c2344009Gk.LJ(numValueOf, "fake_landscape_type");
                Aweme aweme2 = ((TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLF;
                if (aweme2 != null) {
                    aid = aweme2.getAid();
                }
                c2344009Gk.LJIIIIZZ("aweme_id", aid);
                C20684815ws.LJIILLIIL("enter_tablet_fullscreen", c2344009Gk.LIZ);
                ((TabletFakeLandscapeInteractAssem) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLII = false;
            }
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC738830SyX viewTreeObserverOnGlobalLayoutListenerC738830SyX) {
        int iIntValue;
        Integer numIa;
        LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer = (LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0;
        landscapeInteractEntrancesContainer.LLJZ = -1;
        landscapeInteractEntrancesContainer.LLLF = "";
        if (landscapeInteractEntrancesContainer.sp() != null) {
            InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbilitySp = ((LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).sp();
            if (interactBizTopAreaAttachAbilitySp != null) {
                interactBizTopAreaAttachAbilitySp.XT(((LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLIIIIL);
            }
            InteractBizTopAreaAttachAbility interactBizTopAreaAttachAbilitySp2 = ((LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).sp();
            if (interactBizTopAreaAttachAbilitySp2 != null) {
                interactBizTopAreaAttachAbilitySp2.ij2(((LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLLIIIIL);
            }
        } else {
            AbstractC1604130rqV abstractC1604130rqV = (AbstractC1604130rqV) ((LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLJL.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("trigger position update bizTopAbility fallback ");
            sbLIZ.append(((VideoItemParams) C631370Opb.LIZ((LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0)).getAweme().getAid());
            abstractC1604130rqV.LJIIIZ(C2188811AlT.LIZIZ(sbLIZ));
            LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer2 = (LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0;
            RootCellCommonAbility rootCellCommonAbility = (RootCellCommonAbility) landscapeInteractEntrancesContainer2.LLJLIL.getValue();
            if (rootCellCommonAbility != null && (numIa = rootCellCommonAbility.Ia()) != null) {
                iIntValue = numIa.intValue();
            } else {
                iIntValue = 0;
            }
            landscapeInteractEntrancesContainer2.op(iIntValue);
        }
        RootCellCommonAbility rootCellCommonAbility2 = (RootCellCommonAbility) ((LandscapeInteractEntrancesContainer) viewTreeObserverOnGlobalLayoutListenerC738830SyX.l0).LLJLIL.getValue();
        if (rootCellCommonAbility2 != null) {
            rootCellCommonAbility2.ek(viewTreeObserverOnGlobalLayoutListenerC738830SyX);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onGlobalLayout$6(X.ViewTreeObserverOnGlobalLayoutListenerC738830SyX r6) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewTreeObserverOnGlobalLayoutListenerC738830SyX.onGlobalLayout$6(X.0SyX):void");
    }

    public ViewTreeObserverOnGlobalLayoutListenerC738830SyX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
