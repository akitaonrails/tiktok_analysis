package X;

import Y.ARunnableS117S0100000_17;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.live.InteractiveZoneRightGroupLeftBarrierMargin;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.publicscreen.impl.widget.GreetingAnimWidget;
import com.bytedance.android.live.publicscreen.impl.widget.InteractionLikeGuideWidget;
import com.bytedance.android.livesdk.billboard.audience.LiveAudienceBillboardWidget;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.bottom.GiftAnchorPanelGiftPageGiftPageBottomAssem;
import com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.banner.switchcolor.CountryListDialogFragment;
import com.bytedance.android.livesdk.impl.revenue.strategy.panel.recharge.panels.CampaignRechargePanel;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.android.livesdk.subcription.subspaceeditor.SubEmojiInputDialogFragment;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.ss.android.ugc.aweme.feed.adapter.widget.billboard.LivePreviewBillboardWidget;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0g4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class ViewOnLayoutChangeListenerC1151610g4d implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 3:
                onLayoutChange$3(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 4:
                onLayoutChange$4(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 5:
                onLayoutChange$5(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 6:
                onLayoutChange$6(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 7:
                onLayoutChange$7(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 8:
                onLayoutChange$8(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onLayoutChange$9(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onLayoutChange$10(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onLayoutChange$11(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onLayoutChange$12(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onLayoutChange$13(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 14:
                onLayoutChange$14(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 15:
                onLayoutChange$15(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 16:
                onLayoutChange$16(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onLayoutChange$17(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onLayoutChange$18(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 19:
                onLayoutChange$19(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onLayoutChange$20(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 21:
                onLayoutChange$21(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 22:
                onLayoutChange$22(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 23:
                onLayoutChange$23(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public ViewOnLayoutChangeListenerC1151610g4d(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1085120eLO c1085120eLO;
        SubEmojiInputDialogFragment subEmojiInputDialogFragment = (SubEmojiInputDialogFragment) viewOnLayoutChangeListenerC1151610g4d.l0;
        if (i8 - i6 == i4 - i2) {
            subEmojiInputDialogFragment.getClass();
            return;
        }
        View view2 = subEmojiInputDialogFragment.LLJLL;
        if (view2 == null || (c1085120eLO = subEmojiInputDialogFragment.LLJLLL) == null || c1085120eLO.LIZJ == view2.getMeasuredHeight() || subEmojiInputDialogFragment.LLJLL.getMeasuredHeight() <= 0) {
            return;
        }
        subEmojiInputDialogFragment.LLJLLL.LIZJ = subEmojiInputDialogFragment.LLJLL.getMeasuredHeight();
        C784440Upu.LIZ().LIZIZ(new C1081010eEl(subEmojiInputDialogFragment.LLJLL.getMeasuredHeight(), subEmojiInputDialogFragment.LLJLLL.LIZ));
    }

    public static final void onLayoutChange$1(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ConstraintProperty constraintPropertyById;
        View view2;
        if (view == null) {
            return;
        }
        LayeredElementContext layeredElementContext = ((GreetingAnimWidget) viewOnLayoutChangeListenerC1151610g4d.l0).getLayeredElementContext();
        ConstraintProperty constraintProperty = null;
        if (layeredElementContext != null && (constraintPropertyById = layeredElementContext.getConstraintPropertyById(R.id.o_c)) != null && (view2 = constraintPropertyById.getView()) != null && view2.getTop() > 0) {
            constraintProperty = constraintPropertyById;
        }
        if (constraintProperty != null) {
            view.setPivotY(constraintProperty.getView().getTop() - i2);
        } else {
            view.setPivotY(view.getHeight() / 2.0f);
        }
        view.setPivotX(view.getWidth() / 2.0f);
        View view3 = ((GreetingAnimWidget) viewOnLayoutChangeListenerC1151610g4d.l0).getView();
        if (view3 != null) {
            view3.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        }
    }

    public static final void onLayoutChange$10(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        C1128320fT4.LIZJ(Long.valueOf(((CountryListDialogFragment) viewOnLayoutChangeListenerC1151610g4d.l0).uS().getState().LL), Long.valueOf(((CountryListDialogFragment) viewOnLayoutChangeListenerC1151610g4d.l0).LLLF));
    }

    public static final void onLayoutChange$11(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean z;
        int iLJIILLIIL;
        View viewFindViewById;
        if ((i3 - i == i7 - i5 && i4 - i2 == i8 - i6) || view == null) {
            return;
        }
        if (i7 > i5 && i8 > i6) {
            z = true;
        } else {
            z = false;
        }
        Integer numValueOf = Integer.valueOf(view.getHeight());
        if (numValueOf.intValue() > 0) {
            iLJIILLIIL = numValueOf.intValue();
        } else {
            iLJIILLIIL = C497740JfY.LJIILLIIL();
        }
        ((CampaignRechargePanel) viewOnLayoutChangeListenerC1151610g4d.l0).getClass();
        if (!CampaignRechargePanel.wS(iLJIILLIIL, view) && z && (viewFindViewById = view.findViewById(R.id.sw2)) != null) {
            viewFindViewById.requestLayout();
        }
    }

    public static final void onLayoutChange$12(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2;
        LivePreviewBillboardWidget livePreviewBillboardWidget = (LivePreviewBillboardWidget) viewOnLayoutChangeListenerC1151610g4d.l0;
        int translationY = (int) view.getTranslationY();
        int height = livePreviewBillboardWidget.contentView.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(282));
        int i9 = (i4 + translationY) - height;
        if (height > 0 && i9 > 0 && (view2 = livePreviewBillboardWidget.LLJILJIL) != null) {
            C786410Ut5.ed(view2, translationY - i9);
        }
    }

    public static final void onLayoutChange$13(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C1082650eHP) viewOnLayoutChangeListenerC1151610g4d.l0).LL.getDataChannel().zW(InteractiveZoneRightGroupLeftBarrierMargin.class, Integer.valueOf(i));
    }

    public static final void onLayoutChange$14(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iAbs = Math.abs(i2 - i4);
        if (iAbs > 0) {
            C1082620eHM c1082620eHM = (C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0;
            if (iAbs != c1082620eHM.LLILZ) {
                c1082620eHM.LLILZ = iAbs;
                C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
            }
        }
    }

    public static final void onLayoutChange$15(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iAbs = Math.abs(i2 - i4);
        if ((iAbs > 0 && iAbs != ((C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0).LLILZIL) || i2 != i6) {
            C1082620eHM c1082620eHM = (C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0;
            c1082620eHM.LLILZIL = iAbs;
            C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
        }
    }

    public static final void onLayoutChange$16(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iAbs = Math.abs(i2 - i4);
        if ((iAbs >= 0 && iAbs != ((C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0).LLJJI) || ((C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0).LLJJI == 0 || i2 != i6) {
            C1082620eHM c1082620eHM = (C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0;
            c1082620eHM.LLJJI = iAbs;
            if (C500260Jjc.LJJJI((Boolean) c1082620eHM.LL.getDataChannel().gg0(PublicScreenHeightInsufficient.class))) {
                C1082620eHM.LIZJ((C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0, false, false, 3);
            }
        }
    }

    public static final void onLayoutChange$17(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iAbs = Math.abs(i2 - i4);
        if (iAbs > 0) {
            C1082620eHM c1082620eHM = (C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0;
            if (iAbs != c1082620eHM.LLJJIJIL) {
                c1082620eHM.LLJJIJIL = iAbs;
                C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
            }
        }
    }

    public static final void onLayoutChange$18(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int iAbs = Math.abs(i2 - i4);
        if ((iAbs > 0 && iAbs != ((C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0).LLILZLL) || i2 != i6) {
            C1082620eHM c1082620eHM = (C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0;
            c1082620eHM.LLILZLL = iAbs;
            C1082620eHM.LIZJ(c1082620eHM, false, false, 3);
        }
    }

    public static final void onLayoutChange$19(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        boolean z;
        int height = ((C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0).LL.getContainer().getHeight() - i4;
        C1082620eHM c1082620eHM = (C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0;
        int i10 = c1082620eHM.LLJZIJLIL;
        if (LiveMultiGuestGiftTrayOptSetting.INSTANCE.isSmallTrayOnPublicScreen()) {
            i9 = c1082620eHM.LLJI;
        } else {
            i9 = c1082620eHM.LL.LJII;
        }
        C1082620eHM c1082620eHM2 = (C1082620eHM) viewOnLayoutChangeListenerC1151610g4d.l0;
        c1082620eHM.LLJZIJLIL = (height - i9) - c1082620eHM2.LL.LIZLLL;
        if (c1082620eHM2.LLJZ) {
            if (i10 == 0) {
                z = true;
            } else {
                z = false;
            }
            C1082620eHM.LIZJ(c1082620eHM2, false, z, 1);
        }
    }

    public static final void onLayoutChange$2(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (view == null) {
            return;
        }
        view.setPivotX(view.getWidth() / 2.0f);
        view.setPivotY(view.getHeight() / 2.0f);
        View view2 = ((InteractionLikeGuideWidget) viewOnLayoutChangeListenerC1151610g4d.l0).getView();
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        }
    }

    public static final void onLayoutChange$20(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1085620eMC c1085620eMC = (C1085620eMC) viewOnLayoutChangeListenerC1151610g4d.l0;
        View view2 = c1085620eMC.LJ;
        if (view2 != null) {
            if (i == i5 && i3 == i7 && i2 == i6 && i4 == i8) {
                return;
            }
            List<Rect> listLIZ = c1085620eMC.LIZ(c1085620eMC.LJFF);
            if (view2 instanceof C1099820ej6) {
                ((C1099820ej6) view2).LIZ(listLIZ, c1085620eMC.LJI);
            }
        }
    }

    public static final void onLayoutChange$21(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1119750fFF c1119750fFF = (C1119750fFF) viewOnLayoutChangeListenerC1151610g4d.l0;
        c1119750fFF.LIZ.LIZJ = null;
        C1119700fFA.LIZJ(c1119750fFF.LIZ);
        ((C1119750fFF) viewOnLayoutChangeListenerC1151610g4d.l0).LIZ.LIZLLL.LIZIZ.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
    }

    public static final void onLayoutChange$22(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ((C1119760fFG) viewOnLayoutChangeListenerC1151610g4d.l0).LIZJ = null;
        C1119700fFA.LIZJ((C1119760fFG) viewOnLayoutChangeListenerC1151610g4d.l0);
        ((C1119760fFG) viewOnLayoutChangeListenerC1151610g4d.l0).LIZLLL.LIZIZ.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
    }

    public static final void onLayoutChange$23(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LiveIconView liveIconView;
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        if (((C1135140fe4) viewOnLayoutChangeListenerC1151610g4d.l0).LIZ(false) == ((C1135140fe4) viewOnLayoutChangeListenerC1151610g4d.l0).LIZ(true) && (liveIconView = ((C1135140fe4) viewOnLayoutChangeListenerC1151610g4d.l0).LLILLJJLI) != null) {
            C500260Jjc.LJIILIIL(liveIconView);
        }
    }

    public static final void onLayoutChange$3(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ConstraintProperty constraintPropertyById;
        View view2;
        int top;
        View view3;
        ConstraintProperty constraintPropertyById2;
        View view4;
        LiveAudienceBillboardWidget liveAudienceBillboardWidget = (LiveAudienceBillboardWidget) viewOnLayoutChangeListenerC1151610g4d.l0;
        int translationY = (int) view.getTranslationY();
        liveAudienceBillboardWidget.getClass();
        if (C497740JfY.LJIL()) {
            LayeredElementContext layeredElementContext = liveAudienceBillboardWidget.getLayeredElementContext();
            if (layeredElementContext != null && (constraintPropertyById2 = layeredElementContext.getConstraintPropertyById(R.id.o_c)) != null && (view4 = constraintPropertyById2.getView()) != null) {
                top = view4.getTop();
            } else {
                return;
            }
        } else {
            LayeredElementContext layeredElementContext2 = liveAudienceBillboardWidget.getLayeredElementContext();
            if (layeredElementContext2 == null || (constraintPropertyById = layeredElementContext2.getConstraintPropertyById(R.id.tml)) == null || (view2 = constraintPropertyById.getView()) == null) {
                return;
            } else {
                top = view2.getTop();
            }
        }
        int i9 = (i4 + translationY) - top;
        if (top > 0 && i9 > 0 && (view3 = liveAudienceBillboardWidget.LL) != null) {
            C786410Ut5.ed(view3, translationY - i9);
        }
    }

    public static final void onLayoutChange$4(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        View view2;
        C1085270eLd c1085270eLd = (C1085270eLd) viewOnLayoutChangeListenerC1151610g4d.l0;
        C1088150eQH c1088150eQH = c1085270eLd.LJFF;
        int height2 = 0;
        if (c1088150eQH != null && !c1088150eQH.LJ) {
            int translationY = (int) view.getTranslationY();
            int i9 = i4 + translationY;
            FrameLayout frameLayout = c1085270eLd.LJ;
            if (frameLayout != null) {
                height = frameLayout.getHeight();
            } else {
                height = 0;
            }
            int i10 = i9 + height;
            FrameLayout frameLayout2 = c1085270eLd.LIZJ;
            if (frameLayout2 != null) {
                height2 = frameLayout2.getHeight();
            }
            int i11 = i10 - height2;
            if (i11 > 0 && (view2 = c1085270eLd.LJI) != null) {
                C786410Ut5.ed(view2, translationY - i11);
            }
        }
    }

    public static final void onLayoutChange$5(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (Math.abs(i - ((C1081920eGE) viewOnLayoutChangeListenerC1151610g4d.l0).LJ) <= ((Number) ((C1081920eGE) viewOnLayoutChangeListenerC1151610g4d.l0).LJIIJ.getValue()).intValue()) {
            ((C1081920eGE) viewOnLayoutChangeListenerC1151610g4d.l0).LJ = i;
            return;
        }
        C1081920eGE c1081920eGE = (C1081920eGE) viewOnLayoutChangeListenerC1151610g4d.l0;
        c1081920eGE.LJ = i;
        View view2 = c1081920eGE.LIZJ;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, new ARunnableS117S0100000_17(c1081920eGE, 55), 350L);
        }
    }

    public static final void onLayoutChange$6(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1081920eGE c1081920eGE = (C1081920eGE) viewOnLayoutChangeListenerC1151610g4d.l0;
        if (c1081920eGE.LJFF == i) {
            return;
        }
        c1081920eGE.LJFF = i;
        View view2 = c1081920eGE.LIZJ;
        if (view2 != null) {
            HandlerHook.viewPostDelay(view2, new ARunnableS117S0100000_17(c1081920eGE, 56), 350L);
        }
    }

    public static final void onLayoutChange$7(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        LiveEmojiInputDialogFragment liveEmojiInputDialogFragment = (LiveEmojiInputDialogFragment) viewOnLayoutChangeListenerC1151610g4d.l0;
        if (i8 - i6 == i4 - i2) {
            liveEmojiInputDialogFragment.getClass();
            return;
        }
        if (liveEmojiInputDialogFragment.LLJZ == null || liveEmojiInputDialogFragment.LLL == null) {
            return;
        }
        int iPR = liveEmojiInputDialogFragment.PR();
        C1085120eLO c1085120eLO = liveEmojiInputDialogFragment.LLL;
        if (c1085120eLO.LIZJ == iPR || iPR <= 0) {
            return;
        }
        c1085120eLO.LIZJ = iPR;
        C784440Upu.LIZ().LIZIZ(new C1081010eEl(iPR, liveEmojiInputDialogFragment.LLL.LIZ));
    }

    public static final void onLayoutChange$8(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C1098230egX c1098230egX;
        if (i7 > i3 && ((int) (i3 + ((MiddleTouchWidget) viewOnLayoutChangeListenerC1151610g4d.l0).LLJJ)) < C497740JfY.LJIIZILJ() && (c1098230egX = ((MiddleTouchWidget) viewOnLayoutChangeListenerC1151610g4d.l0).LLJJIJI) != null) {
            c1098230egX.LIZ = true;
        }
    }

    public static final void onLayoutChange$9(ViewOnLayoutChangeListenerC1151610g4d viewOnLayoutChangeListenerC1151610g4d, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1151610g4d);
        GiftAnchorPanelGiftPageGiftPageBottomAssem giftAnchorPanelGiftPageGiftPageBottomAssem = (GiftAnchorPanelGiftPageGiftPageBottomAssem) viewOnLayoutChangeListenerC1151610g4d.l0;
        if (!giftAnchorPanelGiftPageGiftPageBottomAssem.LLJLLIL) {
            giftAnchorPanelGiftPageGiftPageBottomAssem.LLJLLIL = true;
            View view2 = giftAnchorPanelGiftPageGiftPageBottomAssem.LLJJIII;
            if (view2 != null) {
                giftAnchorPanelGiftPageGiftPageBottomAssem.lp();
                C786410Ut5.Ld(view2, C1117830fC9.LIZJ(94));
            }
        }
    }
}
