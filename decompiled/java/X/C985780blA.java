package X;

import Y.AObserverS219S0100000_15;
import Y.ARunnableS100S0200000_31;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.gift.GiftDialogVisibilityChannel;
import com.bytedance.android.live.gift.GiftSelectedChangeEvent;
import com.bytedance.android.live.gift.GiftStartSendEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleAdjustTitleViewTopEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBonusTaskStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleCriticalStrikeCardEffectChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.CanPlayRevealAnimationChannel;
import com.bytedance.android.live.liveinteract.multihost.biz.view.IInteractTitleAbility;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.InteractionLayoutNewEventSetting;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleInfoResponse;
import com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS645S0100000_31;

/* JADX INFO: renamed from: X.0blA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985780blA implements InterfaceC977420bXg {
    public final MatchBaseWidget LL;
    public final DataChannel LLILLJJLI;
    public C15DF LLILLL;
    public C985790blB LLILZ;
    public C985800blC LLILZIL;
    public FrameLayout LLILZLL;
    public long LLIZ;

    @Override // X.InterfaceC977430bXh
    public final void dismiss() {
        C15DF c15df = this.LLILLL;
        if (c15df != null) {
            C500260Jjc.LJIILIIL(c15df);
        }
    }

    @Override // X.InterfaceC977430bXh
    public final void onUnload() {
        DataChannel dataChannel;
        C20441214yg.LIZIZ("LiveMatchScoreBarComponent", "onUnload MatchScoreBar");
        C500260Jjc.LJIILIIL(this.LLILLL);
        C15DF c15df = this.LLILLL;
        if (c15df != null) {
            c15df.LJIJJ();
        }
        C15DF c15df2 = this.LLILLL;
        if (c15df2 != null && (dataChannel = c15df2.LLJJJJLIIL) != null) {
            dataChannel.zQ2(c15df2);
        }
        C985790blB c985790blB = this.LLILZ;
        if (c985790blB != null) {
            c985790blB.setSmokeEffectChangeListener(null);
        }
        C985800blC c985800blC = this.LLILZIL;
        if (c985800blC != null) {
            c985800blC.setBoostGlovesEffectChangeListener(null);
        }
    }

    @Override // X.InterfaceC977420bXg
    public final void reset() {
        C15DF c15df = this.LLILLL;
        if (c15df != null) {
            c15df.LJIJJ();
        }
    }

    public final void LJIIIIZZ() {
        float f = (!(C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6()) && C970370bMJ.LJIIIZ()) ? 16.0f : 0.0f;
        FrameLayout frameLayout = this.LLILZLL;
        if (frameLayout != null) {
            C500260Jjc.LJLJL((int) C497740JfY.LIZIZ(f), frameLayout);
        }
    }

    public C985780blA(MatchBaseWidget matchBaseWidget) {
        this.LL = matchBaseWidget;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("init LiveMatchScoreBarComponent, matchWidget = ");
        sbLIZ.append(matchBaseWidget.hashCode());
        C20441214yg.LIZIZ("LiveMatchScoreBarComponent", C2188811AlT.LIZIZ(sbLIZ));
        this.LLILLJJLI = matchBaseWidget.provideDataChannel();
    }

    public static void LJI(C985780blA c985780blA) {
        boolean z;
        boolean z2;
        InterfaceC494301wD interfaceC494301wDLIZ;
        IInteractTitleAbility iInteractTitleAbility;
        ConstraintLayout constraintLayout;
        int i;
        float f;
        ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX1;
        c985780blA.getClass();
        C20441214yg.LIZIZ("LiveMatchScoreBarComponent", "adjustTitleViewTop");
        boolean z3 = true;
        if (C915980Zwa.LJFF().RY(false) == EnumC964170bCJ.MATCH_START) {
            z = true;
        } else {
            z = false;
        }
        if (C915980Zwa.LJFF().RY(false) == EnumC964170bCJ.MATCH_END) {
            z2 = true;
        } else {
            z2 = false;
        }
        int size = C915980Zwa.LJII().LLILZLL(true).size();
        Fragment fragmentLIZ = C946803n0.LIZ(c985780blA.LL.contentView);
        if (fragmentLIZ != null) {
            interfaceC494301wDLIZ = C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ, null), IInteractTitleAbility.class, null);
        } else {
            interfaceC494301wDLIZ = null;
        }
        if (interfaceC494301wDLIZ == null) {
            C20441214yg.LIZIZ("LiveMatchScoreBarComponent", "send adjustTitleViewTop, from dataChannel");
            DataChannel dataChannel = c985780blA.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.LC0(BattleAdjustTitleViewTopEvent.class, new Object() { // from class: X.0blJ
                });
            }
        } else {
            C20441214yg.LIZIZ("LiveMatchScoreBarComponent", "send adjustTitleViewTop, from dataChannel");
            Fragment fragmentLIZ2 = C946803n0.LIZ(c985780blA.LL.contentView);
            if (fragmentLIZ2 != null && (iInteractTitleAbility = (IInteractTitleAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragmentLIZ2, null), IInteractTitleAbility.class, null)) != null) {
                iInteractTitleAbility.vc2();
            }
        }
        for (C954460awe c954460awe : C915980Zwa.LJII().LJIJJ()) {
            if (z) {
                ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlX12 = c985780blA.LL.x1(c954460awe.LJ);
                if (viewOnClickListenerC986770bmlX12 != null) {
                    viewOnClickListenerC986770bmlX12.l0(size);
                }
            } else if (z2 && (viewOnClickListenerC986770bmlX1 = c985780blA.LL.x1(c954460awe.LJ)) != null) {
                viewOnClickListenerC986770bmlX1.j0();
            }
        }
        if (size != 2 || (C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6())) {
            z3 = false;
        }
        MatchBaseWidget matchBaseWidget = c985780blA.LL;
        C19MB c19mb = new C19MB();
        View view = matchBaseWidget.LL;
        if (view == null) {
            view = matchBaseWidget.contentView;
        }
        if (C500260Jjc.LJIIZILJ(matchBaseWidget.dataChannel)) {
            if (view != null) {
                constraintLayout = (ConstraintLayout) view.findViewById(R.id.mc0);
                i = R.id.jl7;
            } else {
                return;
            }
        } else {
            View view2 = matchBaseWidget.contentView;
            if (!(view2 instanceof ConstraintLayout)) {
                return;
            }
            constraintLayout = (ConstraintLayout) view2;
            i = R.id.jl8;
        }
        if (constraintLayout != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = constraintLayout.getChildAt(i2);
                if (childAt.getId() == -1) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("A child view without ID was found in parentView. Aborting ConstraintSet.clone(). Child: ");
                    sbLIZ.append(childAt);
                    C20441214yg.LJ("LiveMatchScoreBarComponent", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
            }
            c19mb.LJII(constraintLayout);
            if (z3) {
                f = 35.0f;
            } else {
                f = 51.0f;
            }
            c19mb.LJJIIJZLJL(i, 4, (int) C497740JfY.LIZIZ(f));
            c19mb.LIZIZ(constraintLayout);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("adjuest title num = ");
            sbLIZ2.append(z3);
            C20441214yg.LJ("LiveMatchScoreBarComponent", C2188811AlT.LIZIZ(sbLIZ2));
        }
    }

    @Override // X.InterfaceC977420bXg
    public final void LIZJ(AbstractC986700bme abstractC986700bme) {
        LJIIIIZZ();
        LJI(this);
    }

    @Override // X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        FrameLayout frameLayout;
        C15DF c15df;
        C985790blB c985790blB;
        DataChannel dataChannel;
        DataChannel dataChannel2;
        EnumC964170bCJ enumC964170bCJ;
        View viewFindViewById;
        C0UVC.LIZJ("LiveMatchScoreBarComponent");
        C0UVC.LIZLLL = "onLoad";
        C0UVC.LIZ("scoreBar onLoad init");
        View view = matchBaseWidget.contentView;
        C985800blC c985800blC = null;
        if (view != null) {
            frameLayout = (FrameLayout) view.findViewById(R.id.et5);
        } else {
            frameLayout = null;
        }
        this.LLILZLL = frameLayout;
        if (InteractionLayoutNewEventSetting.INSTANCE.getValue().isEnabled) {
            FrameLayout frameLayout2 = this.LLILZLL;
            if (frameLayout2 != null) {
                frameLayout2.setTag("biz_score_bar");
            }
            View view2 = matchBaseWidget.contentView;
            if (view2 != null && (viewFindViewById = view2.findViewById(R.id.o37)) != null) {
                viewFindViewById.setTag("biz_gameplay_view_p");
            }
        }
        View view3 = matchBaseWidget.contentView;
        if (view3 != null) {
            c15df = (C15DF) view3.findViewById(R.id.klc);
        } else {
            c15df = null;
        }
        this.LLILLL = c15df;
        if (c15df != null) {
            DataChannel dataChannel3 = this.LLILLJJLI;
            C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", "initObservers");
            C1142950fqf c1142950fqf = c15df.LLJI;
            if (c1142950fqf != null) {
                c1142950fqf.setFirstRankPositionUpdateCallback(new C20750616Hw(c15df, 0));
            }
            C1142950fqf c1142950fqf2 = c15df.LLJI;
            if (c1142950fqf2 != null) {
                c1142950fqf2.setDividerPositionUpdateCallback(new AwS645S0100000_31(c15df, 11));
            }
            C1142950fqf c1142950fqf3 = c15df.LLJI;
            if (c1142950fqf3 != null) {
                c1142950fqf3.setTeamMatchScoreUpdateCallback(new AwS645S0100000_31(c15df, 86));
            }
            c15df.LLJJJJLIIL = dataChannel3;
            if (C15DF.LJIILJJIL()) {
                c15df.LJIILL();
            }
            if (dataChannel3 != null) {
                dataChannel3.CQ2(BattleTimeLeftChannel.class, c15df, new AwS397S0200000_31(c15df, dataChannel3, 14));
                dataChannel3.CQ2(BattleStateChannel.class, c15df, new AwS610S0100000_31(c15df, 288));
                dataChannel3.CQ2(GiftDialogVisibilityChannel.class, c15df, new AwS594S0100000_15(c15df, 609));
                dataChannel3.CQ2(GiftSelectedChangeEvent.class, c15df, new AwS594S0100000_15(c15df, 610));
                dataChannel3.CQ2(GiftStartSendEvent.class, c15df, new AwS594S0100000_15(c15df, 611));
                dataChannel3.CQ2(CanPlayRevealAnimationChannel.class, c15df, new AwS594S0100000_15(c15df, 612));
                dataChannel3.CQ2(BattleBonusTaskStateChannel.class, c15df, new AwS610S0100000_31(c15df, 290));
                enumC964170bCJ = (EnumC964170bCJ) dataChannel3.gg0(BattleStateChannel.class);
            } else {
                enumC964170bCJ = null;
            }
            c15df.setEmojiWhenBattleFinish(enumC964170bCJ);
        }
        View view4 = matchBaseWidget.contentView;
        if (view4 != null) {
            c985790blB = (C985790blB) view4.findViewById(R.id.klf);
        } else {
            c985790blB = null;
        }
        this.LLILZ = c985790blB;
        if (c985790blB != null && (dataChannel2 = this.LLILLJJLI) != null) {
            dataChannel2.BQ2(matchBaseWidget, BattleSmokeDebuffChannel.class, new AwS594S0100000_15(c985790blB, 626));
            dataChannel2.BQ2(matchBaseWidget, BattleStateChannel.class, new AwS594S0100000_15(c985790blB, 627));
        }
        C985790blB c985790blB2 = this.LLILZ;
        if (c985790blB2 != null) {
            c985790blB2.setSmokeEffectChangeListener(new InterfaceC985860blI() { // from class: X.0blD
                @Override // X.InterfaceC985860blI
                public final void LIZ(boolean z) {
                    C15DF c15df2 = this.LIZ.LLILLL;
                    if (c15df2 != null) {
                        c15df2.setRivalSmoke(z);
                    }
                }
            });
        }
        View view5 = matchBaseWidget.contentView;
        if (view5 != null) {
            c985800blC = (C985800blC) view5.findViewById(R.id.kle);
        }
        this.LLILZIL = c985800blC;
        if (c985800blC != null && (dataChannel = this.LLILLJJLI) != null) {
            dataChannel.BQ2(matchBaseWidget, BattleCriticalStrikeCardEffectChannel.class, new AwS594S0100000_15(c985800blC, 614));
            dataChannel.BQ2(matchBaseWidget, BattleStateChannel.class, new AwS594S0100000_15(c985800blC, 616));
        }
        C985800blC c985800blC2 = this.LLILZIL;
        if (c985800blC2 != null) {
            c985800blC2.setBoostGlovesEffectChangeListener(new InterfaceC985830blF() { // from class: X.159J
                @Override // X.InterfaceC985830blF
                public final void clear() {
                    C15DF c15df2 = this.LIZ.LLILLL;
                    if (c15df2 != null) {
                        c15df2.LJI();
                    }
                    C15DF c15df3 = this.LIZ.LLILLL;
                    if (c15df3 != null) {
                        c15df3.setIsBoosting(false);
                    }
                }

                @Override // X.InterfaceC985830blF
                public final void start() {
                    float[] dividerPosition;
                    final C15DF c15df2 = this.LIZ.LLILLL;
                    if (c15df2 != null && !c15df2.LLJJJ) {
                        c15df2.LLJJJ = true;
                        final AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(c15df2, 1330);
                        if (!c15df2.LLJJIJIL && c15df2.LLLLLLL < 1) {
                            c15df2.LJJIFFI(c15df2.getMatchItemFlashContainerFromXml(), false);
                            c15df2.LLLLLLLLL = new C1324720kZq(c15df2.getContext());
                            C1142950fqf c1142950fqf4 = c15df2.LLJI;
                            int i = (int) ((c1142950fqf4 == null || (dividerPosition = c1142950fqf4.getDividerPosition()) == null) ? 0.0f : dividerPosition[1]);
                            FrameLayout matchItemFlashContainerFromXml = c15df2.getMatchItemFlashContainerFromXml();
                            if (matchItemFlashContainerFromXml != null) {
                                C786410Ut5.LJJJJIZL(matchItemFlashContainerFromXml);
                            }
                            FrameLayout matchItemFlashContainerFromXml2 = c15df2.getMatchItemFlashContainerFromXml();
                            if (matchItemFlashContainerFromXml2 != null) {
                                matchItemFlashContainerFromXml2.addView(c15df2.LLLLLLLLL, 0, new FrameLayout.LayoutParams(i, C439101nJ.LIZ(26), 16));
                            }
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("show Flash Animation ---effectWidth = ");
                            sbLIZ.append(i);
                            C20441214yg.LIZIZ("LiveMatchBasicScoreComponent", C2188811AlT.LIZIZ(sbLIZ));
                            if (c15df2.LLLLLLLLL != null) {
                                C1143920fsE c1143920fsE = new C1143920fsE();
                                c1143920fsE.LJIILJJIL = true;
                                C1324720kZq c1324720kZq = c15df2.LLLLLLLLL;
                                if (c1324720kZq == null) {
                                    "Required value was null.".toString();
                                    throw new IllegalArgumentException("Required value was null.");
                                }
                                c1143920fsE.LIZ = c1324720kZq;
                                c1143920fsE.LIZIZ = C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1");
                                c1143920fsE.LIZJ = "match_item_effect_blood_flash.webp";
                                c1143920fsE.LJFF = true;
                                c1143920fsE.LJ = new C1143950fsH() { // from class: X.159K
                                    @Override // X.C1143950fsH
                                    public final void LIZLLL() {
                                        C1324720kZq c1324720kZq2 = c15df2.LLLLLLLLL;
                                        if (c1324720kZq2 != null) {
                                            C786410Ut5.LLJJIII(c1324720kZq2, 0);
                                        }
                                        c15df2.LLLLLLL = 1;
                                    }

                                    @Override // X.C1143950fsH
                                    public final void LJFF(Animatable animatable) {
                                        C1324720kZq c1324720kZq2 = c15df2.LLLLLLLLL;
                                        if (c1324720kZq2 != null) {
                                            C786410Ut5.LLJJIII(c1324720kZq2, 8);
                                        }
                                        C15DF c15df3 = c15df2;
                                        c15df3.LLLLLLL = 2;
                                        C1324720kZq c1324720kZq3 = c15df3.LLLLLLLLL;
                                        if (c1324720kZq3 != null) {
                                            C473410IhP.LIZIZ(new ARunnableS100S0200000_31(c15df3, c1324720kZq3, 40));
                                        }
                                        c15df2.LLLLLLLLL = null;
                                        awS575S0100000_31.invoke();
                                    }
                                };
                                C1143680frq.LJIIIIZZ(c1143920fsE);
                            }
                        } else {
                            awS575S0100000_31.invoke();
                        }
                    }
                    C15DF c15df3 = this.LIZ.LLILLL;
                    if (c15df3 != null) {
                        c15df3.setIsBoosting(true);
                    }
                }
            });
        }
        reset();
    }

    @Override // X.InterfaceC977420bXg
    public final void LJFF(C975960bVK c975960bVK) {
        int iHashCode;
        EnumC919170a1j enumC919170a1j;
        long j;
        long j2;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("show MatchScoreBar basicScoreComponent");
        C15DF c15df = this.LLILLL;
        boolean z = false;
        if (c15df != null) {
            iHashCode = c15df.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C20441214yg.LIZIZ("LiveMatchScoreBarComponent", C2188811AlT.LIZIZ(sbLIZ));
        C15DF c15df2 = this.LLILLL;
        if (c15df2 != null) {
            c15df2.LJIJJ();
        }
        C500260Jjc.LLFFF(this.LLILLL);
        LJIIIIZZ();
        C15DF c15df3 = this.LLILLL;
        if (c15df3 != null) {
            c15df3.LJJIII();
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        if (interfaceC973730bRjYf2 != null && (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) != null) {
            mutableLiveDataLJJJJIZL.observe(this.LL, new AObserverS219S0100000_15(this, 32));
        }
        boolean zLJIIZILJ = C500260Jjc.LJIIZILJ(this.LLILLJJLI);
        EnumC975850bV9 enumC975850bV9 = null;
        if (this.LLILLL != null && !zLJIIZILJ) {
            if (c975960bVK != null) {
                enumC919170a1j = c975960bVK.LIZLLL;
            } else {
                enumC919170a1j = null;
            }
            C974540bT2 c974540bT2 = C974540bT2.LIZ;
            if (c975960bVK != null) {
                j = c975960bVK.LJ;
            } else {
                j = 0;
            }
            C974540bT2.LIZ.LJLZ(j, C915980Zwa.LJI().LJIIJ().getChannelId(), 5, null, enumC919170a1j);
            if (c975960bVK != null) {
                j2 = c975960bVK.LJ;
            } else {
                j2 = 0;
            }
            C974540bT2.LIZ.LJZI(j2, C915980Zwa.LJI().LJIIJ().getChannelId(), false, 5, false, false, enumC919170a1j);
        }
        if (c975960bVK != null) {
            enumC975850bV9 = c975960bVK.LIZ;
        }
        if (enumC975850bV9 == EnumC975850bV9.OPEN_MESSAGE_AUDIENCE) {
            z = true;
        }
        if (zLJIIZILJ || z) {
            LJI(this);
        }
    }

    @Override // X.InterfaceC977420bXg
    public final void LJII(BattleInfoResponse battleInfoResponse) throws Throwable {
        HighScoreControlCfg highScoreControlCfg = battleInfoResponse.fuzzyDisplayConfigV2;
        reset();
        LJIIJ(highScoreControlCfg);
        C15DF c15df = this.LLILLL;
        if (c15df != null) {
            c15df.LJJIJIIJIL();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIJ(com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg r24) {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C985780blA.LJIIJ(com.bytedance.android.livesdkapi.depend.model.live.match.HighScoreControlCfg):void");
    }
}
