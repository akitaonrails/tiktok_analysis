package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import com.bytedance.android.live.gift.GiftDialogHeightChannel;
import com.bytedance.android.live.gift.GiftDialogStatusChangeEvent;
import com.bytedance.android.live.livedecision.ILiveDecisionService;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.api.HostGuestListChangeEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.MultiCoHostFollowGuideEvent;
import com.bytedance.android.live.liveinteract.api.MultiLiveRTCLayoutChannel;
import com.bytedance.android.live.liveinteract.api.VoiceChatLayoutChannel;
import com.bytedance.android.live.liveinteract.api.event.MatchGiftTrayStateEvent;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.live.room.VideoOrientationChangeChannel;
import com.bytedance.android.live.slot.LiveECShopShowEvent;
import com.bytedance.android.livesdk.comp.api.game.ScreenRecordWidgetPosition;
import com.bytedance.android.livesdk.dataChannel.BarrierWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.CommentComboTrayVisibilityChannel;
import com.bytedance.android.livesdk.dataChannel.CommentPinWidgetVisibility;
import com.bytedance.android.livesdk.dataChannel.GiftTrayPositionChangeEvent;
import com.bytedance.android.livesdk.dataChannel.InteractiveTopBarShowChannel;
import com.bytedance.android.livesdk.dataChannel.LivePlayContainerViewHeightChangedEvent;
import com.bytedance.android.livesdk.dataChannel.PublicScreenHeightInsufficient;
import com.bytedance.android.livesdk.dataChannel.PublicScreenVerticalShrinkChannel;
import com.bytedance.android.livesdk.dataChannel.UpdateStickerPositionEvent;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.dataChannel.WatchFocusWidgetVisibility;
import com.bytedance.android.livesdk.layer.LiveFixPadMultiGuestPsHeightSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicSDKCohostWithGuestProtect;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveAnchorEcomPinInPublicScreen;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveWatcherEcomPinInPublicScreen;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;
import com.bytedance.android.livesdkapi.host.user.IHostPad;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.DataChannelSceneObserver;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.bytedance.ies.sdk.widgets.RxBusSceneObserver;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0eH0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082400eH0 extends AbstractC1082660eHQ {
    public final Context LLILZ;
    public final InterfaceC1685420txc<Integer, Boolean, Boolean, Boolean, Boolean, Unit> LLILZIL;
    public final Function1<Boolean, Unit> LLILZLL;
    public final Function1<Boolean, Unit> LLIZ;
    public final Function1<Boolean, Unit> LLIZLLLIL;
    public final C1082280eGo LLJ;
    public boolean LLJI;
    public boolean LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public int LLJILLL;
    public boolean LLJJ;
    public final float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;
    public boolean LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public C956380azk LLJJJ;
    public int LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public final C01GW LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public int LLJLIL;
    public boolean LLJLILLLLZIIL;
    public final int LLJLL;
    public int LLJLLIL;
    public final int LLJLLL;
    public int LLJZ;
    public boolean LLJZIJLIL;
    public ConstraintProperty LLL;
    public boolean LLLF;
    public final ViewOnLayoutChangeListenerC1151590g4b LLLFF;

    public static boolean LJIIJ() {
        if (LinkMicSDKCohostWithGuestProtect.INSTANCE.enable()) {
            return true;
        }
        ILiveMatchService iLiveMatchService = (ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class);
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iLiveMatchService.xB0() != EnumC919170a1j.MATCH_TYPE_1V1) {
            return (iLiveMatchService.co0() && iInteractService.b70().size() == 2) ? false : true;
        }
        return false;
    }

    public final int LJFF() {
        return ((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() ? C1152540g68.LJIIIIZZ(this.LL.isAnchor()) : C1152540g68.LJIIIIZZ(this.LL.isAnchor());
    }

    public final int LJI() {
        if (this.LLJLLIL == 0) {
            return LJFF();
        }
        int iLJIIIIZZ = C12ES.LJIIIIZZ(this.LLILZ) - this.LLJLLIL;
        AbstractC1080560eE2 abstractC1080560eE2 = this.LL;
        return C419990GdR.LIZIZ(((iLJIIIIZZ - abstractC1080560eE2.LJII) - abstractC1080560eE2.LIZIZ) - abstractC1080560eE2.LIZLLL, this.LLJLLL, LJFF());
    }

    public final boolean LJII() {
        return C500260Jjc.LJJJI((Boolean) this.LL.getDataChannel().gg0(PublicScreenHeightInsufficient.class));
    }

    public final ConstraintProperty LJIIIZ() {
        return (ConstraintProperty) this.LLJJLIIIJLLLLLLLZ.getValue();
    }

    public final void LJIIL() {
        ConstraintProperty constraintProperty = (ConstraintProperty) this.LLJJJJ.getValue();
        if (constraintProperty != null) {
            constraintProperty.removeConstraints(3);
            constraintProperty.removeConstraints(4);
            int dimensionPixelSize = 0;
            if (LJII()) {
                if (this.LLJ.LJII && !LJIIJ()) {
                    C956380azk c956380azk = this.LLJJJ;
                    if (C500260Jjc.LJJJI(c956380azk != null ? Boolean.valueOf(c956380azk.LJIIIIZZ) : null)) {
                        dimensionPixelSize = this.LL.getContext().getResources().getDimensionPixelSize(R.dimen.ajl) + this.LL.LIZLLL;
                    }
                }
                if (this.LLJ.LJII) {
                    constraintProperty.connect(4, R.id.video_bottom_guideline, 4, dimensionPixelSize);
                } else {
                    constraintProperty.connect(4, R.id.kw8, 4, this.LL.LIZLLL);
                }
            } else {
                constraintProperty.connect(3, R.id.rg9, 4, 0);
            }
            constraintProperty.apply();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void dispose() {
        View view;
        super.dispose();
        ConstraintProperty constraintProperty = this.LLL;
        if (constraintProperty == null || (view = constraintProperty.getView()) == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.LLLFF);
    }

    @Override // com.bytedance.ies.sdk.widgets.ElementSpecImpl, com.bytedance.ies.sdk.widgets.ElementSpec
    public final void onDispose() {
        super.onDispose();
        this.LLJZ = -1;
    }

    public static int LJIIIIZZ(int i) {
        return Math.max(100, (((int) C497740JfY.LJJI(i)) - ((int) C497740JfY.LJJI(C497740JfY.LJIIIZ(R.dimen.azs)))) - 8);
    }

    public final void LIZJ(boolean z) {
        int i;
        int iLIZ;
        LIZIZ(z, false);
        if (this.LLJILJILJ) {
            View viewFindViewById = this.LL.getContainer().findViewById(R.id.kw4);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(0, viewFindViewById);
            }
            ConstraintProperty constraintProperty = (ConstraintProperty) this.LLJJL.getValue();
            if (constraintProperty != null) {
                constraintProperty.removeConstraints(3);
                constraintProperty.removeConstraints(4);
                constraintProperty.connect(3, R.id.kw4, 4, 0);
                return;
            }
            return;
        }
        ConstraintProperty constraintProperty2 = (ConstraintProperty) this.LLJJL.getValue();
        if (constraintProperty2 != null) {
            constraintProperty2.removeConstraints(3);
            constraintProperty2.removeConstraints(4);
            if (z) {
                if (LJII()) {
                    if (!this.LLJJIII && !this.LLJJIJI && !this.LLJJIJIIJIL) {
                        if (this.LLJ.LJII) {
                            C956380azk c956380azk = this.LLJJJ;
                            if (c956380azk != null) {
                                iLIZ = C1082910eHp.LIZ(c956380azk, this.LL) + this.LL.LIZLLL;
                            } else {
                                iLIZ = this.LL.LIZLLL;
                            }
                            constraintProperty2.connect(4, R.id.video_bottom_guideline, 4, iLIZ);
                        } else {
                            constraintProperty2.connect(4, R.id.kwf, 4, this.LL.LIZLLL);
                        }
                    } else {
                        constraintProperty2.connect(4, R.id.vkv, 3, this.LL.LIZLLL);
                    }
                } else {
                    float f = C1082470eH7.LIZ;
                    if (C1082470eH7.LIZ(this.LL.getDataChannel())) {
                        if (this.LLJ.LJII) {
                            constraintProperty2.connect(4, R.id.video_bottom_guideline, 4, this.LLJJJIL + this.LL.LIZLLL);
                        } else {
                            constraintProperty2.connect(4, R.id.kw8, 3, this.LL.LIZLLL);
                        }
                    } else {
                        constraintProperty2.connect(3, R.id.kw8, 3, 0);
                    }
                }
            } else {
                if (this.LLJILJIL > 0) {
                    i = this.LLJILLL;
                } else {
                    i = 0;
                }
                constraintProperty2.connect(4, R.id.ea1, 3, i + this.LLILZ.getResources().getDimensionPixelSize(R.dimen.asg));
                constraintProperty2.goneMargin(4, 0);
            }
            constraintProperty2.apply();
        }
    }

    public final void LJ(ConstraintProperty constraintProperty) {
        boolean zBooleanValue;
        boolean z;
        Boolean bool = (Boolean) this.LL.getDataChannel().gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (zBooleanValue ? !LiveAnchorEcomPinInPublicScreen.INSTANCE.getValue() : !LiveWatcherEcomPinInPublicScreen.INSTANCE.getValue()) {
            z = false;
        } else {
            z = true;
        }
        if (z && C470480Icg.LIZ()) {
            constraintProperty.connect(4, R.id.y7u, 3, LJI());
        } else {
            constraintProperty.connect(4, R.id.kw9, 3, LJI());
        }
        LIZLLL(LJI(), false);
        LJIILJJIL(false);
        this.LL.getDataChannel().zW(PublicScreenVerticalShrinkChannel.class, Boolean.FALSE);
    }

    public final void LJIILIIL(ConstraintProperty constraintProperty) {
        int iLJIIIIZZ;
        View view;
        int i;
        int i2;
        int iLJIIIIZZ2;
        View view2;
        int iLIZ;
        ConstraintProperty constraintPropertyLJIIIZ;
        this.LL.getContainer().getHeight();
        if (this.LLJLILLLLZIIL && ((this.LLLF && !this.LLJILJILJ) || LJII())) {
            return;
        }
        constraintProperty.removeConstraints(3);
        constraintProperty.removeConstraints(4);
        if (this.LLJLILLLLZIIL && this.LLJILJILJ && (constraintPropertyLJIIIZ = LJIIIZ()) != null) {
            constraintPropertyLJIIIZ.connect(3, R.id.kw8, 4, this.LLILZ.getResources().getDimensionPixelSize(R.dimen.ayg));
            constraintPropertyLJIIIZ.visibility(0);
        }
        if (this.LLJLILLLLZIIL && this.LLJ.LJII) {
            constraintProperty.connect(4, R.id.kw9, 3, this.LLJLL);
        } else if (((IHostPad) C1161920gLG.LIZJ(IHostPad.class)).isPad() && C500260Jjc.LJJII(C497740JfY.LIZ)) {
            LJ(constraintProperty);
        } else if (this.LLJI) {
            float f = C1082470eH7.LIZ;
            if (C1082470eH7.LIZIZ(this.LL.getDataChannel())) {
                iLIZ = this.LL.LIZLLL - C439101nJ.LIZ(1);
            } else {
                iLIZ = 0;
            }
            constraintProperty.connect(4, 0, 4, this.LLJLIL + this.LL.LJIIIZ + iLIZ);
            LIZLLL(this.LLJLIL, true);
            LJIILJJIL(true);
            this.LL.getDataChannel().zW(PublicScreenVerticalShrinkChannel.class, Boolean.TRUE);
        } else if (this.LLJ.LJII) {
            float f2 = C1082470eH7.LIZ;
            if (C1082470eH7.LIZIZ(this.LL.getDataChannel())) {
                i = -this.LL.LIZLLL;
            } else {
                i = 0;
            }
            if (this.LLJILJILJ) {
                i2 = this.LLJ.LJIIJ;
            } else {
                i2 = this.LLJ.LJIIJ + this.LL.LIZLLL;
            }
            constraintProperty.connect(3, 0, 3, i2 + i);
            Object parent = this.LL.getContainer().getParent();
            if ((parent instanceof View) && (view2 = (View) parent) != null) {
                iLJIIIIZZ2 = view2.getHeight();
            } else {
                iLJIIIIZZ2 = C12ES.LJIIIIZZ(this.LLILZ);
            }
            int i3 = iLJIIIIZZ2 - this.LLJ.LJIIJ;
            AbstractC1080560eE2 abstractC1080560eE2 = this.LL;
            LIZLLL((i3 - abstractC1080560eE2.LIZLLL) - abstractC1080560eE2.LJIIIZ, true);
            LJIILJJIL(true);
            this.LL.getDataChannel().zW(PublicScreenVerticalShrinkChannel.class, Boolean.TRUE);
        } else if (this.LLJILJILJ) {
            Object parent2 = this.LL.getContainer().getParent();
            if ((parent2 instanceof View) && (view = (View) parent2) != null) {
                iLJIIIIZZ = view.getHeight();
            } else {
                iLJIIIIZZ = C12ES.LJIIIIZZ(this.LLILZ);
            }
            constraintProperty.connect(3, 0, 3, ((iLJIIIIZZ - this.LL.LJIIIZ) - LJFF()) - this.LL.LIZLLL);
            LIZLLL(LJFF(), true);
            LJIILJJIL(true);
            this.LL.getDataChannel().zW(PublicScreenVerticalShrinkChannel.class, Boolean.TRUE);
        } else if (this.LLJLILLLLZIIL) {
            constraintProperty.connect(4, R.id.kw9, 3, LJI());
        } else {
            LJ(constraintProperty);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolveConstraint: isKeyboardShow:");
        sbLIZ.append(this.LLJLILLLLZIIL);
        sbLIZ.append("giftTrayInBottomSection:");
        sbLIZ.append(this.LLLF);
        sbLIZ.append("interactiveTopBarMode:");
        sbLIZ.append(this.LLJILJILJ);
        sbLIZ.append(" publicScreenHeightInsufficient:");
        sbLIZ.append(LJII());
        sbLIZ.append("isVideoHorizontal:");
        sbLIZ.append(this.LLJ.LJII);
        sbLIZ.append("isCoHost:");
        sbLIZ.append(this.LLJ.LIZIZ);
        sbLIZ.append("multiLiveShrinkMode:");
        sbLIZ.append(this.LLJI);
        C20441214yg.LIZIZ("InteractiveZoneBottomGroupTop", C2188811AlT.LIZIZ(sbLIZ));
        constraintProperty.apply();
    }

    public final void LJIILJJIL(boolean z) {
        ConstraintProperty constraintProperty;
        LIZJ(z);
        ConstraintProperty constraintProperty2 = (ConstraintProperty) this.LLJJJJJIL.getValue();
        if (constraintProperty2 != null) {
            constraintProperty2.removeConstraints(3);
            constraintProperty2.removeConstraints(4);
            if (z) {
                if (LJII()) {
                    constraintProperty2.connect(4, R.id.qhj, 3, 0);
                } else {
                    constraintProperty2.connect(3, R.id.j0x, 4, 0);
                }
            } else {
                constraintProperty2.connect(4, R.id.kwf, 3, 0);
            }
            constraintProperty2.apply();
            this.LLIZ.invoke(Boolean.valueOf(z));
        }
        if (!this.LL.isAnchor() && (constraintProperty = (ConstraintProperty) this.LLJJJJLIIL.getValue()) != null) {
            constraintProperty.removeConstraints(3);
            constraintProperty.removeConstraints(4);
            if (z) {
                if (LJII()) {
                    constraintProperty.connect(4, R.id.qhj, 3, 0);
                } else {
                    constraintProperty.connect(3, R.id.j0x, 4, 0);
                }
            } else {
                constraintProperty.connect(4, R.id.kwf, 3, 0);
            }
            constraintProperty.apply();
            this.LLIZLLLIL.invoke(Boolean.valueOf(z));
        }
    }

    public static void LJIILL(C0J0Q c0j0q, Object obj) {
        ((ILiveDecisionService) C1161920gLG.LIZJ(ILiveDecisionService.class)).bg(c0j0q, "in_layout_style", obj, EnumC467180ITs.EPI.getGroupName(), false);
    }

    public final void LIZIZ(boolean z, boolean z2) {
        int iMargin;
        int dimensionPixelSize;
        if (LJIIIZ() == null) {
            return;
        }
        if (this.LLJILJILJ) {
            ConstraintProperty constraintPropertyLJIIIZ = LJIIIZ();
            if (constraintPropertyLJIIIZ != null) {
                this.LLILZLL.invoke(Boolean.TRUE);
                if (this.LLJJIJIL) {
                    dimensionPixelSize = this.LLILZ.getResources().getDimensionPixelSize(R.dimen.ayg);
                } else {
                    dimensionPixelSize = 0;
                }
                constraintPropertyLJIIIZ.connect(3, R.id.kw4, 4, dimensionPixelSize);
                constraintPropertyLJIIIZ.visibility(0);
                return;
            }
            return;
        }
        int dimensionPixelSize2 = this.LLILZ.getResources().getDimensionPixelSize(R.dimen.ayg);
        float f = C1082470eH7.LIZ;
        if (C1082470eH7.LIZLLL(this.LL.getDataChannel())) {
            dimensionPixelSize2 -= this.LL.LJFF;
        }
        if (C1082470eH7.LIZJ(this.LL.getDataChannel()) && !this.LLJJIJIL) {
            dimensionPixelSize2 = 0;
        }
        if (z && !LJII() && !C1082470eH7.LIZ(this.LL.getDataChannel())) {
            ConstraintProperty constraintPropertyLJIIIZ2 = LJIIIZ();
            if (constraintPropertyLJIIIZ2 != null) {
                constraintPropertyLJIIIZ2.visibility(0);
            }
            this.LLILZLL.invoke(Boolean.TRUE);
        } else {
            ConstraintProperty constraintPropertyLJIIIZ3 = LJIIIZ();
            if (constraintPropertyLJIIIZ3 != null) {
                constraintPropertyLJIIIZ3.visibility(8);
            }
            this.LLILZLL.invoke(Boolean.FALSE);
        }
        if (z2) {
            ConstraintProperty constraintPropertyLJIIIZ4 = LJIIIZ();
            if (constraintPropertyLJIIIZ4 != null) {
                iMargin = constraintPropertyLJIIIZ4.margin(3);
            } else {
                iMargin = 0;
            }
            ((ValueAnimator) this.LLJL.getValue()).cancel();
            ValueAnimator valueAnimator = (ValueAnimator) this.LLJL.getValue();
            valueAnimator.setIntValues(iMargin, dimensionPixelSize2);
            valueAnimator.start();
            return;
        }
        ConstraintProperty constraintPropertyLJIIIZ5 = LJIIIZ();
        if (constraintPropertyLJIIIZ5 == null) {
            return;
        }
        constraintPropertyLJIIIZ5.connect(3, R.id.kw8, 4, dimensionPixelSize2);
        constraintPropertyLJIIIZ5.apply();
    }

    public final void LIZLLL(int i, boolean z) {
        boolean z2;
        if (!this.LL.isAnchor()) {
            if (i < this.LLJJI) {
                z2 = true;
            } else {
                z2 = false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("currentDistance = ");
            sbLIZ.append(i);
            sbLIZ.append(" threshold =");
            sbLIZ.append(this.LLJJI);
            sbLIZ.append(", isVideoHorizontal=");
            sbLIZ.append(z);
            sbLIZ.append(", isLessThanMinHeight=");
            sbLIZ.append(z2);
            sbLIZ.append(", publicScreenHeightInsufficient=");
            sbLIZ.append(LJII());
            C20441214yg.LIZIZ("BottomSectionHeight", C2188811AlT.LIZIZ(sbLIZ));
            if (z) {
                if (z2) {
                    this.LL.getDataChannel().zW(PublicScreenHeightInsufficient.class, Boolean.TRUE);
                    LJIIL();
                    return;
                } else {
                    if (!LJII()) {
                        return;
                    }
                    this.LL.getDataChannel().zW(PublicScreenHeightInsufficient.class, Boolean.FALSE);
                    LJIIL();
                    return;
                }
            }
            if (!LJII()) {
                return;
            }
            this.LL.getDataChannel().zW(PublicScreenHeightInsufficient.class, Boolean.FALSE);
            LJIIL();
        }
    }

    public final void LJIIJJI(int i, boolean z) {
        if ((this.LLJZ != i && i > 0) || this.LLJZIJLIL != z) {
            this.LLJZIJLIL = z;
            this.LLJZ = i;
            this.LLILZIL.invoke(Integer.valueOf(this.LL.LJIIIZ + i), Boolean.valueOf(z), Boolean.valueOf(this.LLJLILLLLZIIL), Boolean.valueOf(this.LLJI), Boolean.valueOf(this.LLJ.LIZIZ));
            this.LL.getDataChannel().LC0(UpdateStickerPositionEvent.class, new C1081690eFr(i + this.LL.LJIIIZ));
        }
    }

    public C1082400eH0(AbstractC1080560eE2 abstractC1080560eE2, Context context, C1082610eHL c1082610eHL, C1082570eHH c1082570eHH, C1082590eHJ c1082590eHJ, C1082600eHK c1082600eHK) {
        final boolean zBooleanValue;
        super(R.id.kw8, abstractC1080560eE2);
        this.LLILZ = context;
        this.LLILZIL = c1082610eHL;
        this.LLILZLL = c1082570eHH;
        this.LLIZ = c1082590eHJ;
        this.LLIZLLLIL = c1082600eHK;
        this.LLJ = new C1082280eGo(abstractC1080560eE2);
        this.LLJJI = C1082470eH7.LIZ;
        this.LLJJJJ = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 581));
        this.LLJJJJJIL = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 580));
        this.LLJJJJLIIL = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 585));
        this.LLJJL = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 583));
        this.LLJJLIIIJLLLLLLLZ = C292401Bi.LIZ(new AwS561S0100000_17(abstractC1080560eE2, 582));
        this.LLJL = C452501pT.LIZIZ(new AwS561S0100000_17(this, 584));
        this.LLJLIL = (int) C497740JfY.LIZIZ(100.0f);
        this.LLJLL = (int) C497740JfY.LIZIZ(201.0f);
        this.LLJLLL = context.getResources().getDimensionPixelSize(R.dimen.au7);
        this.LLJZ = -1;
        this.LLLFF = new ViewOnLayoutChangeListenerC1151590g4b(this, abstractC1080560eE2, 2);
        Boolean bool = (Boolean) abstractC1080560eE2.getDataChannel().gg0(UserIsAnchorChannel.class);
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
        }
        addSceneObserver(new DataChannelSceneObserver<Integer, ScreenRecordWidgetPosition>() { // from class: X.0eFv
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<ScreenRecordWidgetPosition> getType() {
                return ScreenRecordWidgetPosition.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
                int iIntValue = num.intValue();
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJLLIL = iIntValue;
                c1082400eH0.LJIILIIL(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, CommentPinWidgetVisibility>() { // from class: X.0eHA
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<CommentPinWidgetVisibility> getType() {
                return CommentPinWidgetVisibility.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                boolean zBooleanValue2 = bool2.booleanValue();
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJJIII = zBooleanValue2;
                if (c1082400eH0.LJII()) {
                    this.LIZ.LIZJ(true);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, BarrierWidgetVisibility>() { // from class: X.0eH3
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<BarrierWidgetVisibility> getType() {
                return BarrierWidgetVisibility.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                boolean z;
                this.LIZ.LLJJIJIL = bool2.booleanValue();
                if (((IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class)).VF1()) {
                    C1082400eH0 c1082400eH0 = this.LIZ;
                    if (!c1082400eH0.LLJ.LJII && !c1082400eH0.LLJI) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c1082400eH0.LIZIZ(z, false);
                }
                float f = C1082470eH7.LIZ;
                if (C1082470eH7.LIZJ(layeredElementContext.getDataChannel())) {
                    this.LIZ.LIZIZ(true, true);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, CommentComboTrayVisibilityChannel>() { // from class: X.0eHC
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<CommentComboTrayVisibilityChannel> getType() {
                return CommentComboTrayVisibilityChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                boolean zBooleanValue2 = bool2.booleanValue();
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJJIJI = zBooleanValue2;
                if (c1082400eH0.LJII()) {
                    this.LIZ.LIZJ(true);
                }
            }
        });
        if (!abstractC1080560eE2.isAnchor()) {
            addSceneObserver(new DataChannelSceneObserver<Boolean, WatchFocusWidgetVisibility>() { // from class: X.0eHE
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<WatchFocusWidgetVisibility> getType() {
                    return WatchFocusWidgetVisibility.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    C1082400eH0 c1082400eH0 = this.LIZ;
                    c1082400eH0.LLJJIJIIJIL = zBooleanValue2;
                    if (c1082400eH0.LJII()) {
                        this.LIZ.LIZJ(true);
                    }
                }
            });
        }
        addSceneObserver(new DataChannelSceneObserver<Boolean, GiftTrayPositionChangeEvent>() { // from class: X.0eFz
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<GiftTrayPositionChangeEvent> getType() {
                return GiftTrayPositionChangeEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                boolean zBooleanValue2 = bool2.booleanValue();
                if (LiveMultiGuestGiftTrayOptSetting.INSTANCE.isOptimizeMultiGuest()) {
                    this.LIZ.LLLF = zBooleanValue2;
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C937450aVD, GiftDialogHeightChannel>() { // from class: X.0eH5
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<GiftDialogHeightChannel> getType() {
                return GiftDialogHeightChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C937450aVD c937450aVD) {
                int iLIZ = c937450aVD.LIZ();
                C1082400eH0 c1082400eH0 = this.LIZ;
                if (c1082400eH0.LLJILJIL != iLIZ) {
                    c1082400eH0.LL.getDataChannel().LC0(GiftDialogStatusChangeEvent.class, Boolean.TRUE);
                }
                C1082400eH0 c1082400eH02 = this.LIZ;
                c1082400eH02.LLJILJIL = iLIZ;
                boolean z = c1082400eH02.LLJ.LJII;
                if (z || c1082400eH02.LLJI) {
                    if (iLIZ == 0) {
                        c1082400eH02.LIZJ(true);
                        return;
                    }
                    int i = c1082400eH02.LLJZ + c1082400eH02.LL.LJIIIZ;
                    if (z && !c1082400eH02.LLJI && i > iLIZ) {
                        c1082400eH02.LIZJ(true);
                    } else {
                        c1082400eH02.LIZJ(false);
                    }
                }
            }
        });
        addSceneObserver(new RxBusSceneObserver<C1085120eLO>() { // from class: X.0eFt
            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final Class<C1085120eLO> getType() {
                return C1085120eLO.class;
            }

            @Override // com.bytedance.ies.sdk.widgets.RxBusSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1085120eLO c1085120eLO) {
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJLILLLLZIIL = c1085120eLO.LIZIZ;
                c1082400eH0.LJIILIIL(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C0IMR, VideoOrientationChangeChannel>() { // from class: X.0eGp
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<VideoOrientationChangeChannel> getType() {
                return VideoOrientationChangeChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C0IMR c0imr) {
                this.LIZ.LLJ.LIZJ(c0imr);
                this.LIZ.LJIILIIL(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Integer, LivePlayContainerViewHeightChangedEvent>() { // from class: X.0eGw
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LivePlayContainerViewHeightChangedEvent> getType() {
                return LivePlayContainerViewHeightChangedEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Integer num) {
                num.intValue();
                C1082400eH0 c1082400eH0 = this.LIZ;
                C1082280eGo c1082280eGo = c1082400eH0.LLJ;
                C956380azk c956380azk = c1082280eGo.LJI;
                if (c956380azk != null) {
                    c1082280eGo.LIZ(c956380azk, false, C1082400eH0.LJIIJ(), false, c1082400eH0.LLJILLL);
                    c1082400eH0.LJIILIIL(constraintProperty);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, BattleBonusTaskShowChannel>() { // from class: X.0eGx
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<BattleBonusTaskShowChannel> getType() {
                return BattleBonusTaskShowChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                int dimensionPixelSize;
                if (bool2.booleanValue()) {
                    dimensionPixelSize = layeredElementContext.getContext().getResources().getDimensionPixelSize(R.dimen.akc);
                } else {
                    dimensionPixelSize = 0;
                }
                C1082400eH0 c1082400eH0 = this.LIZ;
                if (dimensionPixelSize != c1082400eH0.LLJILLL) {
                    c1082400eH0.LLJILLL = dimensionPixelSize;
                    C1082280eGo c1082280eGo = c1082400eH0.LLJ;
                    C956380azk c956380azk = c1082280eGo.LJI;
                    if (c956380azk != null) {
                        c1082280eGo.LIZ(c956380azk, false, C1082400eH0.LJIIJ(), false, c1082400eH0.LLJILLL);
                        c1082400eH0.LJIILIIL(constraintProperty);
                    }
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<List<? extends C923440a8c>, HostGuestListChangeEvent>() { // from class: X.0eH4
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<HostGuestListChangeEvent> getType() {
                return HostGuestListChangeEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, List<? extends C923440a8c> list) {
                boolean z = !((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).tH2().isEmpty();
                C1082400eH0 c1082400eH0 = this.LIZ;
                if (c1082400eH0.LLJJ != z) {
                    c1082400eH0.LLJJ = z;
                    C1082280eGo c1082280eGo = c1082400eH0.LLJ;
                    C956380azk c956380azk = c1082280eGo.LJI;
                    if (c956380azk != null) {
                        c1082280eGo.LIZ(c956380azk, false, C1082400eH0.LJIIJ(), false, c1082400eH0.LLJILLL);
                        c1082400eH0.LJIILIIL(constraintProperty);
                    }
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C1081600eFi, MultiLiveRTCLayoutChannel>() { // from class: X.0eH1
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<MultiLiveRTCLayoutChannel> getType() {
                return MultiLiveRTCLayoutChannel.class;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C1081600eFi c1081600eFi) {
                boolean z;
                boolean z2;
                boolean z3;
                C0J0Q c0j0q;
                boolean z4;
                C1081600eFi c1081600eFi2 = c1081600eFi;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("type: ");
                sbLIZ.append(c1081600eFi2.LIZ);
                sbLIZ.append(", guestCount: ");
                sbLIZ.append(c1081600eFi2.LIZIZ);
                sbLIZ.append(", btmEmptyViewHeight: ");
                sbLIZ.append(c1081600eFi2.LIZJ);
                sbLIZ.append(", guestWindowWidth: ");
                sbLIZ.append(c1081600eFi2.LIZLLL);
                C20441214yg.LIZIZ("InteractiveZoneBottomGroupTop", C2188811AlT.LIZIZ(sbLIZ));
                EnumC918970a1P enumC918970a1P = c1081600eFi2.LIZ;
                int i = 0;
                if (enumC918970a1P == EnumC918970a1P.GRID_FIX || (enumC918970a1P == EnumC918970a1P.GRID && c1081600eFi2.LIZIZ > 0)) {
                    z = true;
                } else {
                    z = false;
                }
                C1082400eH0 c1082400eH0 = this.LIZ;
                if (z || (C2104308Mf.LIZJ() && (!LiveFixPadMultiGuestPsHeightSetting.INSTANCE.getValue() || c1081600eFi2.LIZ != EnumC918970a1P.NORMAL))) {
                    C1082400eH0 c1082400eH02 = this.LIZ;
                    int i2 = c1081600eFi2.LIZIZ;
                    int iLIZIZ = (int) C439101nJ.LIZIZ(c1082400eH02.LJFF());
                    if (C2104308Mf.LIZJ()) {
                        iLIZIZ = 240;
                    } else {
                        int i3 = C915820ZwK.LIZ[c1081600eFi2.LIZ.ordinal()];
                        if (i3 != 1) {
                            if (i3 != 2) {
                                iLIZIZ = (int) C439101nJ.LIZIZ(c1082400eH02.LJFF());
                            } else if (c1081600eFi2.LIZIZ > 0) {
                                iLIZIZ = C1082400eH0.LJIIIIZZ(c1081600eFi2.LIZJ);
                            }
                        } else if (i2 > 0) {
                            iLIZIZ = C1082400eH0.LJIIIIZZ(c1081600eFi2.LIZJ);
                        } else {
                            iLIZIZ = (int) C439101nJ.LIZIZ(c1082400eH02.LJFF());
                        }
                    }
                    c1082400eH02.LLJLIL = (int) C497740JfY.LIZIZ(iLIZIZ);
                    z2 = true;
                } else {
                    z2 = false;
                }
                c1082400eH0.LLJI = z2;
                C1082400eH0 c1082400eH03 = this.LIZ;
                EnumC918970a1P enumC918970a1P2 = c1081600eFi2.LIZ;
                if (enumC918970a1P2 == EnumC918970a1P.FLOATING_FIX || (enumC918970a1P2 == EnumC918970a1P.FLOATING && c1081600eFi2.LIZIZ > 0)) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1082400eH03.LLJIJIL = z3;
                DataChannel dataChannel = layeredElementContext.getDataChannel();
                C1082510eHB c1082510eHB = new C1082510eHB();
                C1082400eH0 c1082400eH04 = this.LIZ;
                if (c1082400eH04.LLJI) {
                    if (c1081600eFi2.LIZIZ > 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    c1082510eHB.LIZ = z4;
                    c1082510eHB.LIZIZ = EnumC1083190eIH.MULTI_GRID;
                    c1082510eHB.LIZJ = c1082400eH04.LLJLIL;
                } else if (c1082400eH04.LLJIJIL) {
                    c1082510eHB.LIZIZ = EnumC1083190eIH.MULTI_PANEL;
                    c1082510eHB.LIZJ = c1082400eH04.LJFF();
                } else {
                    c1082510eHB.LIZIZ = EnumC1083190eIH.NORMAL;
                    c1082510eHB.LIZJ = c1082400eH04.LJFF();
                }
                dataChannel.SX0(C1082770eHb.class, c1082510eHB);
                this.LIZ.LJIILIIL(constraintProperty);
                C1082400eH0 c1082400eH05 = this.LIZ;
                if (zBooleanValue) {
                    c0j0q = C0J0Q.ANCHOR;
                } else {
                    c0j0q = C0J0Q.ROOM;
                }
                if (c1082400eH05.LLJI) {
                    i = 1;
                } else if (c1082400eH05.LLJIJIL) {
                    i = 2;
                }
                C1082400eH0.LJIILL(c0j0q, Integer.valueOf(i));
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C938170aWN, VoiceChatLayoutChannel>() { // from class: X.0eH8
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<VoiceChatLayoutChannel> getType() {
                return VoiceChatLayoutChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C938170aWN c938170aWN) {
                int iLJIIIIZZ;
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJI = true;
                int i = c938170aWN.LIZ;
                if (C2104308Mf.LIZJ()) {
                    iLJIIIIZZ = 240;
                } else {
                    iLJIIIIZZ = C1082400eH0.LJIIIIZZ(i);
                }
                c1082400eH0.LLJLIL = (int) C497740JfY.LIZIZ(iLJIIIIZZ);
                this.LIZ.LJIILIIL(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C938170aWN, VoiceChatLayoutChannel>() { // from class: X.0eH9
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<VoiceChatLayoutChannel> getType() {
                return VoiceChatLayoutChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C938170aWN c938170aWN) {
                int iLJIIIIZZ;
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJI = true;
                int i = c938170aWN.LIZ;
                if (C2104308Mf.LIZJ()) {
                    iLJIIIIZZ = 240;
                } else {
                    iLJIIIIZZ = C1082400eH0.LJIIIIZZ(i);
                }
                c1082400eH0.LLJLIL = (int) C497740JfY.LIZIZ(iLJIIIIZZ);
                this.LIZ.LJIILIIL(constraintProperty);
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C956380azk, LinkCrossRoomStateChangeEvent>() { // from class: X.0eH2
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<LinkCrossRoomStateChangeEvent> getType() {
                return LinkCrossRoomStateChangeEvent.class;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C956380azk c956380azk) {
                C0J0Q c0j0q;
                C0J0Q c0j0q2;
                C956380azk c956380azk2 = c956380azk;
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJJJ = c956380azk2;
                boolean zLIZ = c1082400eH0.LLJ.LIZ(c956380azk2, false, C1082400eH0.LJIIJ(), false, this.LIZ.LLJILLL);
                if (this.LIZ.LLJ.LIZIZ) {
                    DataChannel dataChannel = layeredElementContext.getDataChannel();
                    C1082510eHB c1082510eHB = new C1082510eHB();
                    C1082400eH0 c1082400eH02 = this.LIZ;
                    c1082510eHB.LIZIZ = EnumC1083190eIH.COHOST;
                    c1082510eHB.LIZJ = c1082400eH02.LLJ.LJIIJ;
                    dataChannel.SX0(C1082770eHb.class, c1082510eHB);
                    C1082400eH0 c1082400eH03 = this.LIZ;
                    if (zBooleanValue) {
                        c0j0q2 = C0J0Q.ANCHOR;
                    } else {
                        c0j0q2 = C0J0Q.ROOM;
                    }
                    c1082400eH03.getClass();
                    C1082400eH0.LJIILL(c0j0q2, 1);
                } else {
                    layeredElementContext.getDataChannel().SX0(C1082770eHb.class, new C1082510eHB());
                    C1082400eH0 c1082400eH04 = this.LIZ;
                    if (zBooleanValue) {
                        c0j0q = C0J0Q.ANCHOR;
                    } else {
                        c0j0q = C0J0Q.ROOM;
                    }
                    c1082400eH04.getClass();
                    C1082400eH0.LJIILL(c0j0q, 0);
                }
                if (zLIZ) {
                    this.LIZ.LJIILIIL(constraintProperty);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<C985920blO, MatchGiftTrayStateEvent>() { // from class: X.0eGv
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<MatchGiftTrayStateEvent> getType() {
                return MatchGiftTrayStateEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, C985920blO c985920blO) {
                C1082400eH0 c1082400eH0;
                C1082280eGo c1082280eGo;
                C956380azk c956380azk;
                if (c985920blO.LIZ == EnumC985900blM.END && (c956380azk = (c1082280eGo = (c1082400eH0 = this.LIZ).LLJ).LJI) != null) {
                    c1082280eGo.LIZ(c956380azk, true, true, false, c1082400eH0.LLJILLL);
                    c1082400eH0.LJIILIIL(constraintProperty);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, MultiCoHostFollowGuideEvent>() { // from class: X.0eGz
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<MultiCoHostFollowGuideEvent> getType() {
                return MultiCoHostFollowGuideEvent.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                boolean zBooleanValue2 = bool2.booleanValue();
                C1082400eH0 c1082400eH0 = this.LIZ;
                C1082280eGo c1082280eGo = c1082400eH0.LLJ;
                C956380azk c956380azk = c1082280eGo.LJI;
                if (c956380azk != null) {
                    if (zBooleanValue2) {
                        c1082280eGo.LIZ(c956380azk, true, true, true, c1082400eH0.LLJILLL);
                    } else {
                        c1082280eGo.LIZ(c956380azk, false, C1082400eH0.LJIIJ(), false, c1082400eH0.LLJILLL);
                    }
                    c1082400eH0.LJIILIIL(constraintProperty);
                }
            }
        });
        addSceneObserver(new DataChannelSceneObserver<Boolean, InteractiveTopBarShowChannel>() { // from class: X.0eH6
            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final Class<InteractiveTopBarShowChannel> getType() {
                return InteractiveTopBarShowChannel.class;
            }

            {
                super(true);
            }

            @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
            public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Boolean bool2) {
                boolean z;
                boolean zBooleanValue2 = bool2.booleanValue();
                C1082400eH0 c1082400eH0 = this.LIZ;
                c1082400eH0.LLJILJILJ = zBooleanValue2;
                if (!c1082400eH0.LL.isAnchor()) {
                    if (!c1082400eH0.LLJ.LJII && !c1082400eH0.LLJI) {
                        z = false;
                    } else {
                        z = true;
                    }
                    c1082400eH0.LIZJ(z);
                }
                this.LIZ.LJIILIIL(constraintProperty);
            }
        });
        if (zBooleanValue ? LiveAnchorEcomPinInPublicScreen.INSTANCE.getValue() : LiveWatcherEcomPinInPublicScreen.INSTANCE.getValue()) {
            addSceneObserver(new DataChannelSceneObserver<Pair<? extends Long, ? extends Boolean>, LiveECShopShowEvent>() { // from class: X.0eFu
                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final Class<LiveECShopShowEvent> getType() {
                    return LiveECShopShowEvent.class;
                }

                {
                    super(true);
                }

                @Override // com.bytedance.ies.sdk.widgets.DataChannelSceneObserver
                public final void onEvent(LayeredElementContext layeredElementContext, ConstraintProperty constraintProperty, Pair<? extends Long, ? extends Boolean> pair) {
                    this.LIZ.LJIILIIL(constraintProperty);
                }
            });
        }
        ElementSpecImplKt.onAttach(this, new AwS383S0200000_17(this, abstractC1080560eE2, 113));
    }
}
