package X;

import Y.ARunnableS100S0200000_31;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.gift.GiftDialogHeightChannel;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.api.LinkCrossRoomStateChangeEvent;
import com.bytedance.android.live.liveinteract.api.PlayerCalculateFinishMessage;
import com.bytedance.android.live.liveinteract.competition.core.timer.CompetitionCountTimeEvent;
import com.bytedance.android.live.liveinteract.competition.event.CompetitionStateEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleUserTop23GuideShowChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.event.LiveGiftSentSucceedEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.match.EnableBattleEggSetting;
import com.bytedance.android.livesdk.revenue.level.api.event.FansClubChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleTask;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15FS, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15FS implements InterfaceC977420bXg {
    public final DataChannel LL;
    public C1091250eVH LLILLJJLI;
    public C15FX LLILLL;
    public MatchBaseWidget LLILZ;
    public View LLILZIL;
    public AbstractC986700bme LLILZLL;
    public int LLIZ;
    public float LLIZLLLIL;

    @Override // X.InterfaceC977420bXg
    public final void LJFF(C975960bVK c975960bVK) {
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
    }

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        C1091250eVH c1091250eVH = this.LLILLJJLI;
        if (c1091250eVH != null) {
            C500260Jjc.LJIILIIL(c1091250eVH);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C15FX c15fx = this.LLILLL;
        if (c15fx != null) {
            c15fx.LJIILJJIL("leave_room");
            DataChannel dataChannel = c15fx.LLJJJJJIL;
            if (dataChannel != null) {
                dataChannel.zQ2(c15fx);
            }
            C500260Jjc.LJIILIIL(c15fx.LLILLJJLI);
            C15FV c15fv = c15fx.LLJJJJLIIL;
            if (c15fv == null) {
                c15fv = null;
            }
            IMessageManager iMessageManager = c15fv.LLILZIL;
            if (iMessageManager != null) {
                iMessageManager.removeMessageListener(c15fv);
            }
            IMessageManager iMessageManager2 = c15fv.LLILZIL;
            if (iMessageManager2 != null) {
                iMessageManager2.removeMessageListener(c15fv.LLLILZ);
            }
            DataChannel dataChannel2 = c15fv.LL;
            if (dataChannel2 != null) {
                dataChannel2.zQ2(c15fv);
            }
            c15fx.LLJJJJ = false;
            ValueAnimator valueAnimator = c15fx.LLJJLIIIJLLLLLLLZ;
            if (valueAnimator != null) {
                valueAnimator.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator2 = c15fx.LLJJLIIIJLLLLLLLZ;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null) {
            dataChannel3.zQ2(this);
        }
    }

    public C15FS(MatchBaseWidget matchBaseWidget) {
        this.LL = matchBaseWidget.provideDataChannel();
    }

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        if (this.LLILLJJLI != null && this.LLILLL != null) {
            this.LLILZLL = abstractC986700bme;
            LJI(abstractC986700bme);
            C15FX c15fx = this.LLILLL;
            if (c15fx != null) {
                c15fx.LIZLLL(abstractC986700bme);
            }
            LJIIIIZZ(this.LLIZ);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        C15FX c15fx;
        C937450aVD c937450aVD;
        C1126540fQC c1126540fQC;
        Boolean bool;
        boolean zBooleanValue;
        Boolean bool2;
        C0UVC.LIZJ("LiveMatchSpeedChallengeComponent");
        C0UVC.LIZLLL = "onLoad";
        C0UVC.LIZ("speed challenge onLoad init");
        this.LLILZ = matchBaseWidget;
        C1091250eVH c1091250eVH = (C1091250eVH) matchBaseWidget.findViewById(R.id.i18);
        IMessageManager iMessageManager = null;
        if (c1091250eVH == null) {
            View view = matchBaseWidget.LL;
            if (view != null) {
                c1091250eVH = (C1091250eVH) view.findViewById(R.id.i18);
            } else {
                c1091250eVH = null;
            }
        }
        this.LLILLJJLI = c1091250eVH;
        if (c1091250eVH != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1091250eVH, null);
            c1091250eVH.removeAllViews();
        }
        Context context = matchBaseWidget.context;
        if (context == null) {
            return;
        }
        boolean z = true;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h83, this.LLILLJJLI, true);
        this.LLILZIL = viewTd;
        if (viewTd != null) {
            c15fx = (C15FX) viewTd.findViewById(R.id.f752mdk);
        } else {
            c15fx = null;
        }
        this.LLILLL = c15fx;
        C500260Jjc.LLFFF(this.LLILLJJLI);
        C15FX c15fx2 = this.LLILLL;
        if (c15fx2 != null) {
            DataChannel dataChannel = this.LL;
            c15fx2.LLJJJJJIL = dataChannel;
            C15FV c15fv = new C15FV(dataChannel);
            c15fx2.LLJJJJLIIL = c15fv;
            c15fv.LLILZ = c15fx2;
            boolean zBooleanValue2 = false;
            if (EnableBattleEggSetting.INSTANCE.getValue()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(" mDataChannel == null ?");
                if (dataChannel != null) {
                    z = false;
                }
                sbLIZ.append(z);
                C20441214yg.LIZIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ));
                if (dataChannel != null) {
                    iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
                }
                c15fv.LLILZIL = iMessageManager;
                if (iMessageManager != null) {
                    iMessageManager.addStickyMessageListener(C001A.LINK_MIC_BATTLE_TASK.getIntType(), c15fv);
                }
                IMessageManager iMessageManager2 = c15fv.LLILZIL;
                if (iMessageManager2 != null) {
                    iMessageManager2.addMessageListener(C001A.LINK_MIC_BATTLE_ARMIES.getIntType(), c15fv.LLLILZ);
                }
                c15fv.LLIZ = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (dataChannel != null && (bool2 = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                c15fv.LLILLL = zBooleanValue;
                c15fv.LLLIL = false;
                if (dataChannel != null) {
                    dataChannel.CQ2(BattleTimeLeftChannel.class, c15fv, new AwS610S0100000_31(c15fv, 302));
                    dataChannel.CQ2(CompetitionCountTimeEvent.class, c15fv, new AwS610S0100000_31(c15fv, 303));
                    dataChannel.CQ2(LiveGiftSentSucceedEvent.class, c15fv, new AwS610S0100000_31(c15fv, 304));
                    dataChannel.CQ2(BattleStateChannel.class, c15fv, new AwS610S0100000_31(c15fv, 305));
                    dataChannel.CQ2(CompetitionStateEvent.class, c15fv, new AwS610S0100000_31(c15fv, 306));
                }
            }
            DataChannel dataChannel2 = c15fx2.LLJJJJJIL;
            if (dataChannel2 != null && (bool = (Boolean) dataChannel2.gg0(UserIsAnchorChannel.class)) != null) {
                zBooleanValue2 = bool.booleanValue();
            }
            c15fx2.LLJL = zBooleanValue2;
            if (C497740JfY.LJJ() && (c1126540fQC = c15fx2.LLJJIJIL) != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1126540fQC);
                c1126540fQC.setRotation(180.0f);
            }
            if (c15fx2.LLJL) {
                C1126540fQC c1126540fQC2 = c15fx2.LLJJIJIL;
                if (c1126540fQC2 != null) {
                    C786410Ut5.LLJJI(c1126540fQC2, 8);
                }
            } else {
                C1126540fQC c1126540fQC3 = c15fx2.LLJJIJIL;
                if (c1126540fQC3 != null) {
                    c1126540fQC3.LLJILJIL = C1143780fs0.LJIIJ(C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1"), "ttlive_pk_task_arrow.webp");
                }
            }
            if (dataChannel != null) {
                dataChannel.BQ2(matchBaseWidget, FansClubChannel.class, new AwS596S0100000_17(c15fx2, 749));
                dataChannel.BQ2(matchBaseWidget, BattleUserTop23GuideShowChannel.class, new AwS594S0100000_15(c15fx2, 1226));
            }
        }
        DataChannel dataChannel3 = this.LL;
        if (dataChannel3 != null && (c937450aVD = (C937450aVD) dataChannel3.gg0(GiftDialogHeightChannel.class)) != null) {
            LJIIIIZZ(c937450aVD.LIZ());
        }
        DataChannel dataChannel4 = this.LL;
        if (dataChannel4 != null) {
            dataChannel4.CQ2(GiftDialogHeightChannel.class, this, new AwS610S0100000_31(this, 292));
        }
        DataChannel dataChannel5 = this.LL;
        if (dataChannel5 != null) {
            dataChannel5.CQ2(BattleBonusTaskShowChannel.class, this, new AwS610S0100000_31(this, 293));
        }
        DataChannel dataChannel6 = this.LL;
        if (dataChannel6 != null) {
            dataChannel6.CQ2(LinkCrossRoomStateChangeEvent.class, this, new AwS610S0100000_31(this, 294));
        }
        DataChannel dataChannel7 = this.LL;
        if (dataChannel7 != null) {
            dataChannel7.CQ2(PlayerCalculateFinishMessage.class, this, new AwS610S0100000_31(this, 295));
        }
        if (this.LLILZLL == null) {
            this.LLILZLL = C986680bmc.LIZ();
        }
        AbstractC986700bme abstractC986700bme = this.LLILZLL;
        if (abstractC986700bme != null) {
            LJI(abstractC986700bme);
            C15FX c15fx3 = this.LLILLL;
            if (c15fx3 != null) {
                c15fx3.LIZLLL(abstractC986700bme);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LJI(AbstractC986700bme abstractC986700bme) {
        ConstraintLayout constraintLayout;
        int iLIZIZ;
        ViewGroup.LayoutParams layoutParams;
        int iLIZIZ2;
        C1091250eVH c1091250eVH = this.LLILLJJLI;
        if (c1091250eVH == null) {
            return;
        }
        ViewParent parent = c1091250eVH.getParent();
        if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091250eVH);
            float f = 0.0f;
            c1091250eVH.setTranslationY(0.0f);
            this.LLIZLLLIL = 0.0f;
            C15FX c15fx = this.LLILLL;
            if (c15fx != null) {
                ViewGroup.LayoutParams layoutParams2 = c15fx.getLayoutParams();
                if (layoutParams2 != null) {
                    boolean z = layoutParams2 instanceof FrameLayout.LayoutParams;
                    layoutParams = layoutParams2;
                    if (z) {
                        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams2;
                        if (abstractC986700bme instanceof C986690bmd) {
                            iLIZIZ2 = 0;
                        } else {
                            iLIZIZ2 = (int) C497740JfY.LIZIZ(3.0f);
                        }
                        layoutParams3.topMargin = iLIZIZ2;
                        layoutParams = layoutParams2;
                    }
                } else {
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                    if (abstractC986700bme instanceof C986690bmd) {
                        iLIZIZ = 0;
                    } else {
                        iLIZIZ = (int) C497740JfY.LIZIZ(3.0f);
                    }
                    layoutParams4.topMargin = iLIZIZ;
                    layoutParams = layoutParams4;
                }
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c15fx);
                c15fx.setLayoutParams(layoutParams);
            }
            C1091250eVH c1091250eVH2 = this.LLILLJJLI;
            if (c1091250eVH2 != null) {
                if (abstractC986700bme instanceof C986690bmd) {
                    f = -1.0f;
                }
                c1091250eVH2.setTranslationZ(f);
            }
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout);
            c19mb.LJI(R.id.i18, 3);
            if (abstractC986700bme instanceof C986690bmd) {
                c19mb.LJIIIZ(R.id.i18, 3, R.id.et5, 3, (int) C497740JfY.LIZIZ(22.0f));
                c19mb.LJIILIIL(R.id.i18, (int) C497740JfY.LIZIZ(220.0f));
            } else if (abstractC986700bme instanceof C986710bmf) {
                c19mb.LJIIIIZZ(R.id.i18, 3, R.id.mby, 4);
                c19mb.LJIILIIL(R.id.i18, 0);
            } else {
                throw new C1954807lC();
            }
            c19mb.LIZIZ(constraintLayout);
        }
    }

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onAudienceBattleInfo, battleTask = ");
        sbLIZ.append(battleInfoResponse.battleTask);
        C20441214yg.LIZIZ("LiveMatchSpeedChallengeComponent", C2188811AlT.LIZIZ(sbLIZ));
        BattleTask battleTask = battleInfoResponse.battleTask;
        if (battleTask != null) {
            LJIIJ(battleTask);
        }
    }

    public final void LJIIIIZZ(int i) {
        Boolean boolValueOf;
        Object parent;
        int top;
        Object parent2;
        int height;
        int height2;
        int top2;
        View view;
        View view2;
        View view3;
        View view4;
        boolean z;
        boolean z2;
        float translationY;
        if (this.LLILZLL instanceof C986690bmd) {
            C1091250eVH c1091250eVH = this.LLILLJJLI;
            if (c1091250eVH != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091250eVH);
                c1091250eVH.setTranslationY(0.0f);
            }
            this.LLIZLLLIL = 0.0f;
            return;
        }
        Float fValueOf = null;
        boolean z3 = false;
        if (i == 0) {
            C1091250eVH c1091250eVH2 = this.LLILLJJLI;
            if (c1091250eVH2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091250eVH2);
                c1091250eVH2.setTranslationY(0.0f);
            }
        } else {
            C15FX c15fx = this.LLILLL;
            if (c15fx != null) {
                RelativeLayout relativeLayout = c15fx.LLILLJJLI;
                if (relativeLayout != null && relativeLayout.getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                boolValueOf = Boolean.valueOf(z);
            } else {
                boolValueOf = null;
            }
            if (C500260Jjc.LJJJI(boolValueOf)) {
                C15FX c15fx2 = this.LLILLL;
                if (c15fx2 != null) {
                    parent = c15fx2.getParent();
                } else {
                    parent = null;
                }
                if ((parent instanceof View) && (view4 = (View) parent) != null) {
                    top = view4.getTop();
                } else {
                    top = 0;
                }
                MatchBaseWidget matchBaseWidget = this.LLILZ;
                if (matchBaseWidget != null && (view3 = matchBaseWidget.contentView) != null) {
                    parent2 = view3.getParent();
                } else {
                    parent2 = null;
                }
                if ((parent2 instanceof View) && (view2 = (View) parent2) != null) {
                    height = view2.getHeight();
                } else {
                    height = 0;
                }
                C1091250eVH c1091250eVH3 = this.LLILLJJLI;
                if (c1091250eVH3 != null) {
                    int i2 = height - i;
                    C15FX c15fx3 = this.LLILLL;
                    if (c15fx3 != null) {
                        height2 = c15fx3.getHeight();
                    } else {
                        height2 = 0;
                    }
                    int i3 = (i2 - height2) - top;
                    MatchBaseWidget matchBaseWidget2 = this.LLILZ;
                    if (matchBaseWidget2 != null && (view = matchBaseWidget2.contentView) != null) {
                        top2 = view.getTop();
                    } else {
                        top2 = 0;
                    }
                    float fLJJIFFI = (i3 - top2) - C497740JfY.LJJIFFI(5.0f);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1091250eVH3);
                    c1091250eVH3.setTranslationY(fLJJIFFI);
                }
            }
        }
        C15FX c15fx4 = this.LLILLL;
        if (c15fx4 == null) {
            return;
        }
        if (i > C497740JfY.LIZIZ(430)) {
            z2 = true;
        } else {
            z2 = false;
        }
        c15fx4.setCpcToastShow(z2);
        C1091250eVH c1091250eVH4 = this.LLILLJJLI;
        if (c1091250eVH4 != null) {
            fValueOf = Float.valueOf(c1091250eVH4.getTranslationY());
        }
        if (!Intrinsics.LIZLLL(fValueOf, this.LLIZLLLIL)) {
            C1091250eVH c1091250eVH5 = this.LLILLJJLI;
            if (c1091250eVH5 != null) {
                c1091250eVH5.requestLayout();
            }
            C1091250eVH c1091250eVH6 = this.LLILLJJLI;
            if (c1091250eVH6 != null) {
                translationY = c1091250eVH6.getTranslationY();
            } else {
                translationY = 0.0f;
            }
            this.LLIZLLLIL = translationY;
            C15FX c15fx5 = this.LLILLL;
            if (c15fx5 == null || c15fx5.getTaskState() > -1) {
                C973660bRc c973660bRc = C973660bRc.LIZ;
                if (this.LLIZLLLIL == 0.0f) {
                    z3 = true;
                }
                boolean z4 = true ^ z3;
                C15FX c15fx6 = this.LLILLL;
                if (c15fx6 != null) {
                    int taskState = c15fx6.getTaskState();
                    C15FX c15fx7 = this.LLILLL;
                    if (c15fx7 != null) {
                        c973660bRc.LJLJJL(taskState, z4, c15fx7.getCpcToastShow());
                        return;
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                }
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    public final void LJIIJ(BattleTask battleTask) {
        C15FX c15fx = this.LLILLL;
        if (c15fx != null && battleTask.battleBonusConfig != null && battleTask.battleBonusStatus != null && EnableBattleEggSetting.INSTANCE.getValue()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("audience init battleTask ");
            sbLIZ.append(battleTask);
            C20441214yg.LIZIZ("BattleTaskContainer", C2188811AlT.LIZIZ(sbLIZ));
            C473410IhP.LIZIZ(new ARunnableS100S0200000_31(battleTask, c15fx, 84));
        }
    }
}
