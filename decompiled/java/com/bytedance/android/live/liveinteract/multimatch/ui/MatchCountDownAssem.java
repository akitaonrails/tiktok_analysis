package com.bytedance.android.live.liveinteract.multimatch.ui;

import X.AnonymousClass0956;
import X.C019F;
import X.C09R3;
import X.C0PEM;
import X.C1126540fQC;
import X.C1143680frq;
import X.C1143780fs0;
import X.C1145830fvJ;
import X.C1155220gAS;
import X.C1320810kTX;
import X.C1322200kVm;
import X.C1324720kZq;
import X.C13LE;
import X.C1558360qeg;
import X.C1558520qew;
import X.C1559260qg8;
import X.C15ES;
import X.C15EY;
import X.C15F0;
import X.C15F9;
import X.C1637806bA;
import X.C1637906bB;
import X.C16F5;
import X.C1819620xS4;
import X.C1892280zLG;
import X.C19336710kv;
import X.C1954807lC;
import X.C19719912Dl;
import X.C19MB;
import X.C1DFH;
import X.C20441214yg;
import X.C204741159n;
import X.C20485815Ea;
import X.C20486515Eh;
import X.C20487515Er;
import X.C20487815Eu;
import X.C20488215Ey;
import X.C20736316Cj;
import X.C20750616Hw;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C23250099c;
import X.C427330GpH;
import X.C429630Gsz;
import X.C430350Gu9;
import X.C432120Gx0;
import X.C497740JfY;
import X.C500260Jjc;
import X.C723590SZx;
import X.C724240Sb0;
import X.C724750Sbp;
import X.C736820SvI;
import X.C786410Ut5;
import X.C800330VaR;
import X.C915980Zwa;
import X.C946230ajN;
import X.C970290bMB;
import X.C970370bMJ;
import X.C981160bdi;
import X.C985940blQ;
import X.EnumC1154880g9u;
import X.EnumC20486315Ef;
import X.EnumC20486415Eg;
import X.EnumC586570MzX;
import X.EnumC964170bCJ;
import X.EnumC970300bMC;
import X.InterfaceC1554640qYg;
import X.InterfaceC20326814gE;
import X.InterfaceC20488315Ez;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC665370Q7z;
import X.InterfaceC973730bRj;
import X.ViewOnAttachStateChangeListenerC1846530y9T;
import Y.AAListenerS341S0100000_31;
import Y.ALAdapterS23S0100000_28;
import Y.ALAdapterS25S0100000_31;
import Y.ARunnableS128S0100000_28;
import Y.ARunnableS131S0100000_31;
import Y.AUListenerS278S0100000_31;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.text.Spannable;
import android.text.TextPaint;
import android.text.format.DateUtils;
import android.util.DisplayMetrics;
import android.util.Property;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleBridgedPunishScoreUpdateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDelayPunishCountdownChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleFilteredPunishQueueEmptyChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleHighScoreNoticeEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemExtraTimeCardSentEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleRawRankNoticeReceivedChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleShowLeagueScoreChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.HideMatchCountdownViewEvent;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.live.liveinteract.multihost.biz.viewmodel.InteractionTitleViewModel;
import com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService;
import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveBattleScoreAnimationTimeThresholdSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCountDownVibrationAmplitudeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCountDownVibrationDurationSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCountDownVibrationTypeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchOptOutLeagueCountdownSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchSettingRepositorySetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchStartAnimationRemovalSetting;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.rank.api.MatchRankNoScoreAddedEvent;
import com.bytedance.android.livesdk.rank.api.MatchRankScoreAddedEvent;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftModeMeta;
import com.bytedance.android.livesdkapi.depend.model.live.match.LeagueScoreInfo;
import com.bytedance.assem.arch.view.UIContentAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AwS180S1100000_31;
import kotlin.jvm.internal.AwS31S0000100_16;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchCountDownAssem extends UIContentAssem implements IPKCountDownTitleAbility, InterfaceC20326814gE, InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLIZZ;
    public final C1559260qg8 LLIZLLLIL = new C1559260qg8(new C723590SZx(this, C1155220gAS.class, null), checkSupervisorPrepared());
    public final AssemVMLazy LLJ;
    public final AssemVMLazy LLJI;
    public ImageView LLJIJIL;
    public C1126540fQC LLJILJIL;
    public C16F5 LLJILJILJ;
    public C1324720kZq LLJILLL;
    public View LLJJ;
    public LiveIconView LLJJI;
    public C432120Gx0 LLJJIII;
    public C427330GpH LLJJIJI;
    public C1145830fvJ LLJJIJIIJIL;
    public ConstraintLayout LLJJIJIL;
    public AnimatorSet LLJJJ;
    public AnimatorSet LLJJJIL;
    public EnumC586570MzX LLJJJJ;
    public AwS180S1100000_31 LLJJJJJIL;
    public ARunnableS128S0100000_28 LLJJJJLIIL;
    public AnonymousClass0956 LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public boolean LLJL;
    public boolean LLJLIL;
    public boolean LLJLILLLLZIIL;
    public boolean LLJLL;
    public long LLJLLIL;
    public Long LLJLLL;
    public EnumC20486315Ef LLJZ;
    public int LLJZIJLIL;
    public boolean LLL;
    public long LLLF;
    public C1320810kTX LLLFF;
    public boolean LLLFFI;
    public DataChannel LLLFZ;
    public Drawable LLLI;
    public Integer LLLII;
    public Integer LLLIIII;
    public String LLLIIIIL;
    public C204741159n LLLIIIL;
    public final C20488215Ey<C15EY> LLLIIL;
    public final C20488215Ey<C20487815Eu> LLLIILIL;
    public final C20488215Ey<C981160bdi> LLLIL;
    public final C985940blQ LLLILZ;
    public boolean LLLILZJ;
    public final ARunnableS131S0100000_31 LLLILZLLLI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MatchCountDownAssem.class, "titleContainerVM", "getTitleContainerVM()Lcom/bytedance/android/live/liveinteract/multihost/biz/viewmodel/InteractionTitleViewModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(MatchCountDownAssem.class, "matchCountdownVM", "getMatchCountdownVM()Lcom/bytedance/android/live/liveinteract/multimatch/ui/MatchCountDownViewModel;", 0);
        c09r3.getClass();
        LLLIZZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
    }

    public MatchCountDownAssem() {
        C019F c019f = C019F.LIZ;
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InteractionTitleViewModel.class);
        C1637906bB c1637906bB = C1637806bA.LIZ;
        this.LLJ = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ), c019f, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ, 27), AFwS276S0000000_31.get$arr$(26), null, true);
        AwS575S0100000_31 awS575S0100000_31 = new AwS575S0100000_31(this, 169);
        C19719912Dl c19719912DlLIZ2 = C13LE.LIZ(MatchCountDownViewModel.class);
        this.LLJI = C724750Sbp.LIZ(this, C724750Sbp.LJIIJ(this, c19719912DlLIZ2), c019f, c1637906bB, new AwS572S0100000_28(c19719912DlLIZ2, 28), AFwS276S0000000_31.get$arr$(27), awS575S0100000_31, true);
        this.LLJJJJ = EnumC586570MzX.NONE;
        this.LLJZ = EnumC20486315Ef.LL;
        C20488215Ey<C15EY> c20488215Ey = new C20488215Ey<>();
        this.LLLIIL = c20488215Ey;
        C20488215Ey<C20487815Eu> c20488215Ey2 = new C20488215Ey<>();
        this.LLLIILIL = c20488215Ey2;
        C20488215Ey<C981160bdi> c20488215Ey3 = new C20488215Ey<>();
        this.LLLIL = c20488215Ey3;
        final ILiveMatchService iLiveMatchServiceLJFF = C915980Zwa.LJFF();
        final IMultiHostService iMultiHostServiceLJII = C915980Zwa.LJII();
        c20488215Ey.LIZ(new InterfaceC20488315Ez<C15EY>(iLiveMatchServiceLJFF, iMultiHostServiceLJII) { // from class: X.15EX
            public final ILiveMatchService LIZ;
            public final IMultiHostService LIZIZ;

            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                return C20487515Er.LIZJ(this.LIZ, this.LIZIZ);
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C15EY> interfaceC1364105Vn) {
                Text text;
                C954460awe next;
                LeagueScoreInfo leagueScoreInfo;
                Iterator<C954460awe> it2 = this.LIZIZ.LLILZLL(true).iterator();
                while (true) {
                    text = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (next.LJ == C950220apo.LJ()) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                C954460awe c954460awe = next;
                if (c954460awe != null && (leagueScoreInfo = c954460awe.LJJIIJ) != null) {
                    text = leagueScoreInfo.contentText;
                }
                return new C15EY(null, text, false, EnumC994550bzJ.LEAGUE_MATCH, 5);
            }

            {
                this.LIZ = iLiveMatchServiceLJFF;
                this.LIZIZ = iMultiHostServiceLJII;
            }
        });
        final ILiveMatchService iLiveMatchServiceLJFF2 = C915980Zwa.LJFF();
        c20488215Ey.LIZ(new InterfaceC20488315Ez<C15EY>(iLiveMatchServiceLJFF2) { // from class: X.15EU
            public final ILiveMatchService LIZ;

            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                return this.LIZ.BS0();
            }

            {
                this.LIZ = iLiveMatchServiceLJFF2;
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C15EY> interfaceC1364105Vn) {
                int i;
                if (C970370bMJ.LJ()) {
                    i = 2131853026;
                } else if (C970370bMJ.LJIIIIZZ()) {
                    i = 2131853027;
                } else {
                    i = 2131853025;
                }
                return new C15EY(C497740JfY.LJIJI(i), null, true, null, 10);
            }
        });
        final ILiveMatchService iLiveMatchServiceLJFF3 = C915980Zwa.LJFF();
        c20488215Ey.LIZ(new InterfaceC20488315Ez<C15EY>(iLiveMatchServiceLJFF3) { // from class: X.15EW
            public final ILiveMatchService LIZ;

            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                if (this.LIZ.xB0() != EnumC919170a1j.MATCH_TYPE_INDIVIDUAL) {
                    return false;
                }
                C20337914i1<Long> c20337914i1 = InterfaceC980390bcT.za;
                if (!DateUtils.isToday(c20337914i1.LIZIZ().longValue())) {
                    InterfaceC980390bcT.Aa.LJFF(1);
                    c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
                    return true;
                }
                C20337914i1<Integer> c20337914i12 = InterfaceC980390bcT.Aa;
                if (c20337914i12.LIZIZ().intValue() >= 3) {
                    return false;
                }
                c20337914i1.LJFF(Long.valueOf(System.currentTimeMillis()));
                c20337914i12.LJFF(Integer.valueOf(c20337914i12.LIZIZ().intValue() + 1));
                return true;
            }

            {
                this.LIZ = iLiveMatchServiceLJFF3;
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C15EY> interfaceC1364105Vn) {
                return new C15EY(C497740JfY.LJIJI(2131853340), null, false, null, 14);
            }
        });
        c20488215Ey.LIZ(new C15ES(C915980Zwa.LJFF()));
        c20488215Ey.LIZ(new InterfaceC20488315Ez<C15EY>() { // from class: X.15EV
            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                return C970370bMJ.LJIIIIZZ();
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C15EY> interfaceC1364105Vn) {
                String strLJIJJ;
                int iLIZJ = C970370bMJ.LIZJ();
                if (iLIZJ != 2) {
                    if (iLIZJ != 3) {
                        if (iLIZJ != 4) {
                            if (iLIZJ != 30) {
                                if (iLIZJ != 40) {
                                    strLJIJJ = "2 vs 2";
                                } else {
                                    strLJIJJ = C497740JfY.LJIJJ(2131853277, "3", "1");
                                }
                            } else {
                                strLJIJJ = C497740JfY.LJIJJ(2131853277, "2", "1");
                            }
                        } else {
                            strLJIJJ = C497740JfY.LJIJJ(2131853277, "1", "3");
                        }
                    } else {
                        strLJIJJ = C497740JfY.LJIJJ(2131853277, "1", "2");
                    }
                } else {
                    strLJIJJ = C497740JfY.LJIJJ(2131853277, "2", "2");
                }
                return new C15EY(strLJIJJ, null, false, null, 14);
            }
        });
        final ILiveMatchService iLiveMatchServiceLJFF4 = C915980Zwa.LJFF();
        final IMultiHostService iMultiHostServiceLJII2 = C915980Zwa.LJII();
        c20488215Ey2.LIZ(new InterfaceC20488315Ez<C20487815Eu>(iLiveMatchServiceLJFF4, iMultiHostServiceLJII2) { // from class: X.15Es
            public final ILiveMatchService LIZ;
            public final IMultiHostService LIZIZ;

            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                return C20487515Er.LIZJ(this.LIZ, this.LIZIZ);
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C20487815Eu> interfaceC1364105Vn) {
                Text text;
                C1867990yi5 c1867990yi5;
                String str;
                String str2;
                String str3;
                LeagueScoreInfo leagueScoreInfoLIZ = C20487515Er.LIZ(this.LIZIZ);
                C20487915Ev c20487915EvLIZIZ = C20487515Er.LIZIZ(leagueScoreInfoLIZ);
                boolean zLIZIZ = c20487915EvLIZIZ.LIZIZ();
                if (leagueScoreInfoLIZ != null) {
                    text = leagueScoreInfoLIZ.contentTextOpen;
                } else {
                    text = null;
                }
                if (!zLIZIZ) {
                    text = null;
                }
                boolean z = true;
                if (text != null) {
                    c1867990yi5 = new C1867990yi5(text, C497740JfY.LJIJI(2131853024));
                } else {
                    c1867990yi5 = new C1867990yi5(null, C497740JfY.LJIJI(2131846591));
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("LeagueMatchStartRule source theme=");
                sbLIZ.append(c20487915EvLIZIZ.LJ);
                sbLIZ.append(" isMatchMania=");
                sbLIZ.append(zLIZIZ);
                sbLIZ.append(" text=");
                if (text == null) {
                    z = false;
                }
                String str4 = "server";
                if (z) {
                    str = "server";
                } else {
                    str = "client";
                }
                sbLIZ.append(str);
                sbLIZ.append(" leftIcon=");
                if (c20487915EvLIZIZ.LIZ.LIZ == EnumC1154880g9u.IMAGE_MODEL) {
                    str2 = "server";
                } else {
                    str2 = "client";
                }
                sbLIZ.append(str2);
                sbLIZ.append(" rightIcon=");
                if (c20487915EvLIZIZ.LIZIZ == null) {
                    str4 = "client";
                }
                sbLIZ.append(str4);
                sbLIZ.append(" jump=");
                if (c20487915EvLIZIZ.LIZJ != null) {
                    str3 = "server_schema";
                } else {
                    str3 = "client_target";
                }
                sbLIZ.append(str3);
                C20441214yg.LJIIIZ("MatchStartContentRules", C2188811AlT.LIZIZ(sbLIZ));
                return new C20487815Eu(c20487915EvLIZIZ.LIZ, false, c1867990yi5, true, c20487915EvLIZIZ.LIZIZ, c20487915EvLIZIZ.LIZLLL, c20487915EvLIZIZ.LIZJ, null, 128);
            }

            {
                this.LIZ = iLiveMatchServiceLJFF4;
                this.LIZIZ = iMultiHostServiceLJII2;
            }
        });
        final ILiveMatchService iLiveMatchServiceLJFF5 = C915980Zwa.LJFF();
        c20488215Ey2.LIZ(new InterfaceC20488315Ez<C20487815Eu>(iLiveMatchServiceLJFF5) { // from class: X.15Eq
            public final ILiveMatchService LIZ;

            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                return this.LIZ.BS0();
            }

            {
                this.LIZ = iLiveMatchServiceLJFF5;
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C20487815Eu> interfaceC1364105Vn) {
                int i;
                if (this.LIZ.k31()) {
                    i = 2131853024;
                } else {
                    i = 2131853038;
                }
                return new C20487815Eu(new C20486515Eh(EnumC1154880g9u.RES_ID, R.drawable.exd, null, null, null, 28), false, new C1867990yi5(null, C497740JfY.LJIJI(i)), false, null, EnumC994560bzK.ICY_CLASH, null, null, 208);
            }
        });
        c20488215Ey2.LIZ(new InterfaceC20488315Ez<C20487815Eu>() { // from class: X.15Ew
            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C20487815Eu> interfaceC1364105Vn) {
                return new C20487815Eu(new C20486515Eh(EnumC1154880g9u.RES_ID, R.drawable.exd, null, null, null, 28), true, new C1867990yi5(0), false, null, null, null, C2286608xc.LJFF(-1000L), 80);
            }
        });
        C985940blQ c985940blQ = new C985940blQ();
        c20488215Ey3.LIZ(c985940blQ);
        c20488215Ey3.LIZ(new InterfaceC20488315Ez<C981160bdi>() { // from class: X.0bcU
            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                GiftMode giftModeLJFF = C978520bZS.LJFF();
                return (giftModeLJFF == null || giftModeLJFF.giftId == 0) ? false : true;
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C981160bdi> interfaceC1364105Vn) {
                GiftModeMeta giftModeMetaLJIIIIZZ;
                GiftMode giftModeLJJIL;
                String strLJIJI = C497740JfY.LJIJI(2131843045);
                ImageModel imageModel = null;
                if (LiveMatchSettingRepositorySetting.INSTANCE.isEnable()) {
                    InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf2 != null && (giftModeLJJIL = interfaceC973730bRjYf2.LJJIL()) != null) {
                        imageModel = giftModeLJJIL.giftIconImage;
                    }
                } else {
                    InterfaceC973730bRj interfaceC973730bRjYf22 = C915980Zwa.LJFF().yf2(false);
                    if (interfaceC973730bRjYf22 != null && (giftModeMetaLJIIIIZZ = interfaceC973730bRjYf22.LJIIIIZZ()) != null) {
                        imageModel = giftModeMetaLJIIIIZZ.giftIconImage;
                    }
                }
                return new C981160bdi(strLJIJI, imageModel);
            }
        });
        c20488215Ey3.LIZ(new InterfaceC20488315Ez<C981160bdi>() { // from class: X.0bdh
            @Override // X.InterfaceC20488315Ez
            public final boolean LIZIZ() {
                return true;
            }

            @Override // X.InterfaceC20488315Ez
            public final Object LIZ(InterfaceC1364105Vn<? super C981160bdi> interfaceC1364105Vn) {
                return new C981160bdi("", null);
            }
        });
        this.LLLILZ = c985940blQ;
        this.LLLILZLLLI = new ARunnableS131S0100000_31(this, 28);
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility
    public final void e5() {
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != 1915663792) {
            return null;
        }
        return this;
    }

    public final void Go() {
        C429630Gsz c429630Gsz;
        boolean z = this.LLLILZJ && C915980Zwa.LJFF().r82() && C915980Zwa.LJII().L6();
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (!(constraintLayout instanceof C429630Gsz) || (c429630Gsz = (C429630Gsz) constraintLayout) == null) {
            return;
        }
        c429630Gsz.e0(z);
    }

    @Override // X.InterfaceC20326814gE
    public final void Li() {
        AnimatorSet animatorSet = this.LLJJJ;
        if (animatorSet == null || !animatorSet.isRunning()) {
            return;
        }
        AnimatorSet animatorSet2 = this.LLJJJ;
        if (animatorSet2 != null) {
            animatorSet2.removeAllListeners();
        }
        AnimatorSet animatorSet3 = this.LLJJJ;
        if (animatorSet3 != null) {
            animatorSet3.end();
        }
        this.LLJJJ = null;
    }

    public final void Lo() {
        C432120Gx0 c432120Gx0;
        AnonymousClass0956 anonymousClass0956 = this.LLJJL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJL = null;
        ARunnableS128S0100000_28 aRunnableS128S0100000_28 = this.LLJJJJLIIL;
        if (aRunnableS128S0100000_28 != null && (c432120Gx0 = this.LLJJIII) != null) {
            HandlerHook.viewRemoveCallbacks(c432120Gx0, aRunnableS128S0100000_28);
        }
        this.LLJJJJLIIL = null;
    }

    public final void So() {
        this.LLJZ = EnumC20486315Ef.LLILLL;
        this.LLJZIJLIL = 0;
        this.LLJLLL = Long.valueOf(this.LLJLLIL);
        DataChannel dataChannel = this.LLLFZ;
        if (dataChannel != null) {
            dataChannel.zW(BattleFilteredPunishQueueEmptyChannel.class, Boolean.TRUE);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("complete punish notice cycle, cycleId=");
        sbLIZ.append(this.LLJLLIL);
        C20441214yg.LJIIIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC20326814gE
    public final boolean Xa() {
        AnimatorSet animatorSet = this.LLJJJIL;
        return C500260Jjc.LJJJI(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null) && this.LLJJJJ == EnumC586570MzX.HIGH_SCORE;
    }

    public final void Zo() {
        C432120Gx0 c432120Gx0;
        ARunnableS128S0100000_28 aRunnableS128S0100000_28 = this.LLJJJJLIIL;
        if (aRunnableS128S0100000_28 != null && (c432120Gx0 = this.LLJJIII) != null) {
            HandlerHook.viewRemoveCallbacks(c432120Gx0, aRunnableS128S0100000_28);
        }
        this.LLJJJJLIIL = null;
        DataChannel dataChannel = this.LLLFZ;
        if ((dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(BattleDelayPunishCountdownChannel.class), Boolean.TRUE)) || this.LLJLILLLLZIIL || this.LLJLL) {
            return;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        long jLJJZ = interfaceC973730bRjYf2 != null ? interfaceC973730bRjYf2.LJJZ() : 0L;
        DataChannel dataChannel2 = this.LLLFZ;
        boolean z = !(dataChannel2 != null ? Intrinsics.LJFF(dataChannel2.gg0(BattleFilteredPunishQueueEmptyChannel.class), Boolean.FALSE) : false);
        if (!z || this.LLJZIJLIL > 0 || this.LLJZ != EnumC20486315Ef.LLILLL) {
            ep("skip-punish-countdown-because-queue-not-empty", false, z);
            return;
        }
        if (C915980Zwa.LJFF().RY(false).compareTo(EnumC964170bCJ.PUNISH_START) < 0 || jLJJZ <= 0) {
            ep("skip-punish-countdown", false, true);
            return;
        }
        this.LLJLILLLLZIIL = true;
        this.LLJLL = true;
        this.LLJZ = EnumC20486315Ef.LLILZIL;
        this.LLJLLL = Long.valueOf(this.LLJLLIL);
        ep("enter-punish-countdown-directly", true, true);
        DataChannel dataChannel3 = this.LLLFZ;
        if (dataChannel3 != null) {
            dataChannel3.zW(BattlePunishTimeLeftChannel.class, Long.valueOf(jLJJZ));
        }
    }

    public final MatchCountDownViewModel cp() {
        AssemVMLazy assemVMLazy = this.LLJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIZZ;
        return (MatchCountDownViewModel) assemVMLazy.getValue();
    }

    public final void ip() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout == null || (layoutParams2 = constraintLayout.getLayoutParams()) == null || layoutParams2.width != -2) {
            C20441214yg.LIZIZ("MatchCountDownAssem", "reset warp_content");
            ConstraintLayout constraintLayout2 = this.LLJJIJIL;
            if (constraintLayout2 != null && (layoutParams = constraintLayout2.getLayoutParams()) != null) {
                layoutParams.width = -2;
            }
        }
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1892280zLG(this, null), 2);
    }

    @Override // X.InterfaceC20326814gE
    public final void mi() {
        C432120Gx0 c432120Gx0;
        Context context;
        Resources resources;
        C432120Gx0 c432120Gx02 = this.LLJJIII;
        if (!Intrinsics.LJFF(c432120Gx02 != null ? Integer.valueOf(c432120Gx02.getCurrentTextColor()) : null, this.LLLIIII)) {
            if (this.LLLIIII == null) {
                this.LLLIIII = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.c5q, getContext()));
            }
            Integer num = this.LLLIIII;
            if (num != null) {
                int iIntValue = num.intValue();
                C432120Gx0 c432120Gx03 = this.LLJJIII;
                if (c432120Gx03 != null) {
                    c432120Gx03.setTextColor(iIntValue);
                }
            }
        }
        C432120Gx0 c432120Gx04 = this.LLJJIII;
        if (c432120Gx04 != null) {
            c432120Gx04.setGravity(17);
        }
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        float fApplyDimension = TypedValue.applyDimension(1, 16.0f, (constraintLayout == null || (context = constraintLayout.getContext()) == null || (resources = context.getResources()) == null) ? null : resources.getDisplayMetrics());
        C432120Gx0 c432120Gx05 = this.LLJJIII;
        if (Intrinsics.LIZ(fApplyDimension, c432120Gx05 != null ? Float.valueOf(c432120Gx05.getTextSize()) : null) || (c432120Gx0 = this.LLJJIII) == null) {
            return;
        }
        c432120Gx0.setTextSize(16.0f);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onCreate() {
        this.LLLIIIL = new C204741159n();
        super.onCreate();
        C20441214yg.LIZIZ("MatchCountDownAssem", "onCreate CountDown");
        C20441214yg.LIZIZ("MatchCountDownAssem", "bind Ability---");
        Fragment fragmentLJI = C724240Sb0.LJI(this);
        C1558520qew.LJII(fragmentLJI != null ? C1558360qeg.LJFF(fragmentLJI, null) : C1558520qew.LJIIL(this), this, IPKCountDownTitleAbility.class, null, this);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        DataChannel dataChannel;
        DataChannel dataChannel2 = this.LLLFZ;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        C204741159n c204741159n = this.LLLIIIL;
        if (c204741159n != null && (dataChannel = c204741159n.LIZ) != null) {
            dataChannel.zQ2(c204741159n);
        }
        AnimatorSet animatorSet = this.LLJJJIL;
        if (C500260Jjc.LJJJI(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null)) {
            AnimatorSet animatorSet2 = this.LLJJJIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LLJJJIL = null;
        }
        Li();
        super.onDestroy();
    }

    @Override // X.InterfaceC20326814gE
    public final void yc() {
        AnimatorSet animatorSet = this.LLJJJIL;
        if (C500260Jjc.LJJJI(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null) && this.LLJJJJ == EnumC586570MzX.GIFT_ONLY) {
            C427330GpH c427330GpH = this.LLJJIJI;
            if (c427330GpH != null) {
                c427330GpH.setText("");
            }
            kp(0);
            C427330GpH c427330GpH2 = this.LLJJIJI;
            if (c427330GpH2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427330GpH2);
                c427330GpH2.setAlpha(0.0f);
            }
            C427330GpH c427330GpH3 = this.LLJJIJI;
            if (c427330GpH3 != null) {
                C500260Jjc.LJIILIIL(c427330GpH3);
            }
            AnimatorSet animatorSet2 = this.LLJJJIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LLJJJIL = null;
            C432120Gx0 c432120Gx0 = this.LLJJIII;
            if (c432120Gx0 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c432120Gx0);
                c432120Gx0.setAlpha(1.0f);
            }
            C432120Gx0 c432120Gx02 = this.LLJJIII;
            if (c432120Gx02 != null) {
                C786410Ut5.LLLFF(c432120Gx02, 0);
            }
        }
    }

    public static boolean op() {
        return C20487515Er.LIZJ(C915980Zwa.LJFF(), C915980Zwa.LJII());
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility
    public final void O21() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C20485815Ea(this, null), 3);
    }

    public final void Oo() {
        Lo();
        this.LLJZ = EnumC20486315Ef.LLILZ;
        Vo(EnumC20486415Eg.LLILLJJLI);
        this.LLJLILLLLZIIL = false;
        this.LLJLL = false;
        this.LLJLLL = null;
        DataChannel dataChannel = this.LLLFZ;
        if (dataChannel != null) {
            dataChannel.zW(BattleDelayPunishCountdownChannel.class, Boolean.FALSE);
        }
        DataChannel dataChannel2 = this.LLLFZ;
        if (dataChannel2 != null) {
            dataChannel2.zW(BattleFilteredPunishQueueEmptyChannel.class, Boolean.TRUE);
        }
        hp(true);
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout != null) {
            C500260Jjc.LJIILIIL(constraintLayout);
        }
        this.LLJL = false;
        this.LLJLIL = false;
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility
    public final void R0() {
        MatchCountDownViewModel matchCountDownViewModelCp = cp();
        matchCountDownViewModelCp.setState(new AwS610S0100000_31(matchCountDownViewModelCp, 368));
        AnonymousClass0956 anonymousClass0956 = matchCountDownViewModelCp.LLILLL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        matchCountDownViewModelCp.LLILLL = null;
        AnimatorSet animatorSet = this.LLJJJIL;
        if (C500260Jjc.LJJJI(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null)) {
            AnimatorSet animatorSet2 = this.LLJJJIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            this.LLJJJIL = null;
        }
        C204741159n c204741159n = this.LLLIIIL;
        if (c204741159n != null) {
            AnimatorSet animatorSet3 = c204741159n.LJIIJ;
            if (C500260Jjc.LJJJI(animatorSet3 != null ? Boolean.valueOf(animatorSet3.isRunning()) : null)) {
                AnimatorSet animatorSet4 = c204741159n.LJIIJ;
                if (animatorSet4 != null) {
                    animatorSet4.cancel();
                }
                c204741159n.LJIIJ = null;
                C430350Gu9 c430350Gu9 = c204741159n.LJIIIZ;
                if (c430350Gu9 == null) {
                    c430350Gu9 = null;
                }
                C786410Ut5.LLJLL(c430350Gu9, 8);
            }
            c204741159n.LJIIJJI = false;
        }
        this.LLL = false;
        this.LLJJJJJIL = null;
        No(EnumC20486415Eg.LLILLL);
    }

    public final void lp() {
        DataChannel dataChannel;
        if (!op() || (dataChannel = this.LLLFZ) == null) {
            return;
        }
        dataChannel.zW(BattleShowLeagueScoreChannel.class, Boolean.FALSE);
    }

    public final boolean mp() {
        DataChannel dataChannel;
        if (!op() || this.LLJLL || (dataChannel = this.LLLFZ) == null) {
            return false;
        }
        return Intrinsics.LJFF(dataChannel.gg0(BattleShowLeagueScoreChannel.class), Boolean.FALSE);
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() {
        super.onParentSet();
        C20441214yg.LIZIZ("MatchCountDownAssem", "onParentSet  CountDown");
    }

    @Override // com.bytedance.android.live.liveinteract.multimatch.ui.IPKCountDownTitleAbility
    public final void ri() {
        Go();
    }

    public final void Ho(C20486515Eh c20486515Eh) {
        Object obj;
        LiveIconView liveIconView = this.LLJJI;
        if (liveIconView == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("bindArrowImageSource source=");
        if (c20486515Eh == null || (obj = c20486515Eh.LIZ) == null) {
            obj = "default";
        }
        sbLIZ.append(obj);
        C20441214yg.LJIIIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (c20486515Eh == null) {
            liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.d3b, liveIconView.getContext()));
            return;
        }
        EnumC1154880g9u enumC1154880g9u = c20486515Eh.LIZ;
        if (enumC1154880g9u == EnumC1154880g9u.IMAGE_MODEL && c20486515Eh.LJ != null) {
            C1819620xS4.LIZ().LJIIIZ(c20486515Eh.LJ).LJJI(liveIconView);
        } else if (enumC1154880g9u == EnumC1154880g9u.GECKO) {
            C1143680frq.LIZLLL(liveIconView, c20486515Eh.LIZJ, c20486515Eh.LIZLLL);
        } else {
            liveIconView.setIcon(c20486515Eh.LIZIZ);
        }
    }

    @Override // X.InterfaceC20326814gE
    public final void L0(long j) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Object objGg0;
        Object objGg02;
        Boolean boolValueOf3;
        C432120Gx0 c432120Gx0;
        DisplayMetrics displayMetrics;
        C432120Gx0 c432120Gx02;
        Context context;
        Resources resources;
        Drawable background;
        Drawable background2;
        Drawable background3;
        ConstraintLayout constraintLayout;
        Context context2;
        Boolean boolValueOf4;
        Context context3;
        ConstraintLayout constraintLayout2;
        Context context4;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateBattleCountDown ");
        sbLIZ.append(j);
        C20441214yg.LJ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
        C204741159n c204741159n = this.LLLIIIL;
        Float fValueOf = null;
        Drawable background4 = null;
        if (c204741159n != null) {
            boolValueOf = Boolean.valueOf(c204741159n.LJIIL);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJIJIL(boolValueOf)) {
            return;
        }
        if (j == this.LLLF) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateBattleCountDown return for same, timeStamp = ");
            sbLIZ2.append(j);
            C20441214yg.LJ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        this.LLLF = j;
        C946230ajN.LJIIIIZZ = j;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(C946230ajN.LJIIIZ);
        sbLIZ3.append(',');
        sbLIZ3.append(this.LLLF);
        C946230ajN.LJIIIZ = C2188811AlT.LIZIZ(sbLIZ3);
        if (this.LLJJLIIIJLLLLLLLZ) {
            C20441214yg.LIZIZ("MatchCountDownAssem", "updateBattleCountDown skipped, league score display active");
            return;
        }
        AssemVMLazy assemVMLazy = this.LLJ;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLIZZ;
        if (!Intrinsics.LJFF(((C15F9) assemVMLazy.getValue().getState()).LLILLJJLI, C15F0.LIZ)) {
            ConstraintLayout constraintLayout3 = this.LLJJIJIL;
            if (constraintLayout3 != null) {
                C786410Ut5.LL(8, constraintLayout3);
            }
        } else {
            ConstraintLayout constraintLayout4 = this.LLJJIJIL;
            if (constraintLayout4 != null) {
                C786410Ut5.LL(0, constraintLayout4);
            }
            if (LiveMatchStartAnimationRemovalSetting.INSTANCE.isEnabled() && !this.LLL) {
                O21();
            }
        }
        AnimatorSet animatorSet = this.LLJJJIL;
        if (animatorSet != null) {
            boolValueOf2 = Boolean.valueOf(animatorSet.isRunning());
        } else {
            boolValueOf2 = null;
        }
        if (C500260Jjc.LJJIJIIJIL(boolValueOf2)) {
            C432120Gx0 c432120Gx03 = this.LLJJIII;
            if (c432120Gx03 != null) {
                C786410Ut5.LLLFF(c432120Gx03, 0);
            }
            ImageView imageView = this.LLJIJIL;
            if (imageView != null) {
                C786410Ut5.LJZI(0, imageView);
            }
            C16F5 c16f5 = this.LLJILJILJ;
            if (c16f5 != null) {
                C786410Ut5.k5(c16f5, 1.0f);
            }
            C1324720kZq c1324720kZq = this.LLJILLL;
            if (c1324720kZq != null) {
                C786410Ut5.h5(c1324720kZq, 1.0f);
            }
            View view = this.LLJJ;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            C427330GpH c427330GpH = this.LLJJIJI;
            if (c427330GpH != null) {
                C786410Ut5.LLJLLIL(c427330GpH, 8);
            }
            C427330GpH c427330GpH2 = this.LLJJIJI;
            if (c427330GpH2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c427330GpH2);
                c427330GpH2.setAlpha(0.0f);
            }
            C1145830fvJ c1145830fvJ = this.LLJJIJIIJIL;
            if (c1145830fvJ != null) {
                C786410Ut5.LLJLILLLLZIIL(c1145830fvJ, 8);
            }
            C1145830fvJ c1145830fvJ2 = this.LLJJIJIIJIL;
            if (c1145830fvJ2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1145830fvJ2);
                c1145830fvJ2.setAlpha(0.0f);
            }
            C432120Gx0 c432120Gx04 = this.LLJJIII;
            if (c432120Gx04 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c432120Gx04);
                c432120Gx04.setAlpha(1.0f);
            }
            C970290bMB c970290bMB = C970290bMB.LIZ;
            C970290bMB.LJJIJ(EnumC970300bMC.MATCH_TITLE_BAR, true);
        }
        if (j >= 0) {
            C1126540fQC c1126540fQC = this.LLJILJIL;
            if (c1126540fQC != null) {
                C786410Ut5.LLJJI(c1126540fQC, 8);
            }
            C432120Gx0 c432120Gx05 = this.LLJJIII;
            if (c432120Gx05 != null) {
                C786410Ut5.LLLFF(c432120Gx05, 0);
            }
            ImageView imageView2 = this.LLJIJIL;
            if (imageView2 != null) {
                C786410Ut5.LJZI(0, imageView2);
            }
        }
        DataChannel dataChannel = this.LLLFZ;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleStateChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 != EnumC964170bCJ.ACCEPTED) {
            DataChannel dataChannel2 = this.LLLFZ;
            if (dataChannel2 != null) {
                objGg02 = dataChannel2.gg0(BattleStateChannel.class);
            } else {
                objGg02 = null;
            }
            if (objGg02 != EnumC964170bCJ.INVITED) {
                ConstraintLayout constraintLayout5 = this.LLJJIJIL;
                if (constraintLayout5 != null) {
                    C786410Ut5.LL(0, constraintLayout5);
                }
                up(true);
                if (j <= LiveBattleScoreAnimationTimeThresholdSetting.INSTANCE.getValue()) {
                    mi();
                    C432120Gx0 c432120Gx06 = this.LLJJIII;
                    if (c432120Gx06 != null) {
                        c432120Gx06.setText(String.valueOf(j));
                    }
                    C432120Gx0 c432120Gx07 = this.LLJJIII;
                    if (c432120Gx07 != null) {
                        C786410Ut5.LLLFF(c432120Gx07, 0);
                    }
                    if (this.LLLI == null && (constraintLayout2 = this.LLJJIJIL) != null && constraintLayout2.getContext() != null) {
                        ConstraintLayout constraintLayout6 = this.LLJJIJIL;
                        if (constraintLayout6 != null && (context4 = constraintLayout6.getContext()) != null) {
                            this.LLLI = C800330VaR.LIZIZ(context4, R.drawable.dv7);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    C204741159n c204741159n2 = this.LLLIIIL;
                    if (c204741159n2 != null) {
                        boolValueOf4 = Boolean.valueOf(c204741159n2.LJIIJJI);
                    } else {
                        boolValueOf4 = null;
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf4)) {
                        ConstraintLayout constraintLayout7 = this.LLJJIJIL;
                        if (constraintLayout7 != null) {
                            background4 = constraintLayout7.getBackground();
                        }
                        if (!Intrinsics.LJFF(background4, this.LLLI)) {
                            ConstraintLayout constraintLayout8 = this.LLJJIJIL;
                            if (constraintLayout8 != null) {
                                constraintLayout8.setBackground(this.LLLI);
                            }
                            String str = this.LLLIIIIL;
                            if (str == null || a0.LJJJIL(str)) {
                                kp(8);
                            }
                        }
                    }
                    if (j == 10 && (context3 = getContext()) != null) {
                        try {
                            Vibrator vibrator = (Vibrator) C786410Ut5.H2(context3, "vibrator");
                            if (this.LLLFFI) {
                                vibrator.vibrate(50L);
                            } else {
                                LiveMatchAudienceCountDownVibrationTypeSetting liveMatchAudienceCountDownVibrationTypeSetting = LiveMatchAudienceCountDownVibrationTypeSetting.INSTANCE;
                                if (liveMatchAudienceCountDownVibrationTypeSetting.getValue() == 1) {
                                    vibrator.vibrate(50L);
                                } else if (liveMatchAudienceCountDownVibrationTypeSetting.getValue() == 2) {
                                    long value = LiveMatchAudienceCountDownVibrationDurationSetting.INSTANCE.getValue();
                                    int value2 = LiveMatchAudienceCountDownVibrationAmplitudeSetting.INSTANCE.getValue();
                                    if (Build.VERSION.SDK_INT >= 26) {
                                        vibrator.vibrate(VibrationEffect.createOneShot(value, value2));
                                    } else {
                                        vibrator.vibrate(value);
                                    }
                                }
                            }
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                    if (j == 0) {
                        Li();
                        this.LLJJJ = new AnimatorSet();
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playSequentially(bp(0.0f, 0.9f, 120L), bp(0.9f, 1.25f, 520L), bp(1.25f, 0.6f, 160L), bp(0.6f, 1.1f, 120L), bp(1.1f, 0.9f, 120L), bp(0.9f, 1.0f, 80L));
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.playSequentially(ap(0.0f, 120L), ap(1.0f, 1320L), ap(1.0f, 880L));
                        AnimatorSet animatorSet4 = this.LLJJJ;
                        if (animatorSet4 != null) {
                            animatorSet4.playTogether(animatorSet2, animatorSet3);
                        }
                        AnimatorSet animatorSet5 = this.LLJJJ;
                        if (animatorSet5 != null) {
                            animatorSet5.start();
                        }
                        C20441214yg.LIZIZ("MatchCalculate", "showLastSecondAnimation");
                        C432120Gx0 c432120Gx08 = this.LLJJIII;
                        if (c432120Gx08 != null) {
                            HandlerHook.viewPostDelay(c432120Gx08, new ARunnableS131S0100000_31(this, 29), 600L);
                        }
                    } else {
                        C20441214yg.LIZIZ("MatchCalculate", "showStartAnimation");
                        Li();
                        this.LLJJJ = new AnimatorSet();
                        AnimatorSet animatorSet6 = new AnimatorSet();
                        animatorSet6.playSequentially(bp(0.0f, 1.25f, 240L), bp(1.25f, 0.9f, 200L), bp(0.9f, 1.0f, 120L));
                        AnimatorSet animatorSet7 = new AnimatorSet();
                        animatorSet7.playSequentially(ap(0.0f, 120L), ap(1.0f, 680L), ap(1.0f, 200L));
                        AnimatorSet animatorSet8 = this.LLJJJ;
                        if (animatorSet8 != null) {
                            animatorSet8.playTogether(animatorSet6, animatorSet7);
                        }
                        AnimatorSet animatorSet9 = this.LLJJJ;
                        if (animatorSet9 != null) {
                            animatorSet9.start();
                        }
                    }
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("timeStamp > scoreAnimationTime ,timestamp = ");
                    sbLIZ4.append(j);
                    C20441214yg.LIZIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ4));
                    ImageView imageView3 = this.LLJIJIL;
                    if (imageView3 != null) {
                        C786410Ut5.LJZI(0, imageView3);
                    }
                    if (this.LLLI == null && (constraintLayout = this.LLJJIJIL) != null && constraintLayout.getContext() != null) {
                        ConstraintLayout constraintLayout9 = this.LLJJIJIL;
                        if (constraintLayout9 != null && (context2 = constraintLayout9.getContext()) != null) {
                            this.LLLI = C800330VaR.LIZIZ(context2, R.drawable.dv7);
                        } else {
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                    C204741159n c204741159n3 = this.LLLIIIL;
                    if (c204741159n3 != null) {
                        boolValueOf3 = Boolean.valueOf(c204741159n3.LJIIJJI);
                    } else {
                        boolValueOf3 = null;
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf3)) {
                        ConstraintLayout constraintLayout10 = this.LLJJIJIL;
                        if (constraintLayout10 != null) {
                            background = constraintLayout10.getBackground();
                        } else {
                            background = null;
                        }
                        if (!Intrinsics.LJFF(background, this.LLLI)) {
                            String str2 = this.LLLIIIIL;
                            if (str2 == null || a0.LJJJIL(str2)) {
                                kp(8);
                            }
                            ConstraintLayout constraintLayout11 = this.LLJJIJIL;
                            if (constraintLayout11 != null) {
                                constraintLayout11.setBackground(this.LLLI);
                            }
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append("countdown bg = ");
                            ConstraintLayout constraintLayout12 = this.LLJJIJIL;
                            if (constraintLayout12 != null) {
                                background2 = constraintLayout12.getBackground();
                            } else {
                                background2 = null;
                            }
                            sbLIZ5.append(background2);
                            sbLIZ5.append(" and cacheBgDraw = ");
                            sbLIZ5.append(this.LLLI);
                            sbLIZ5.append(" if same = ");
                            ConstraintLayout constraintLayout13 = this.LLJJIJIL;
                            if (constraintLayout13 != null) {
                                background3 = constraintLayout13.getBackground();
                            } else {
                                background3 = null;
                            }
                            sbLIZ5.append(Intrinsics.LJFF(background3, this.LLLI));
                            C20441214yg.LIZIZ("BackgroundTest", C2188811AlT.LIZIZ(sbLIZ5));
                        }
                    }
                    C1126540fQC c1126540fQC2 = this.LLJILJIL;
                    if (c1126540fQC2 != null) {
                        C786410Ut5.LLJJI(c1126540fQC2, 8);
                    }
                    C432120Gx0 c432120Gx09 = this.LLJJIII;
                    if ((c432120Gx09 == null || c432120Gx09.getCurrentTextColor() != C20736316Cj.LIZIZ(R.attr.c9i, getContext())) && (c432120Gx0 = this.LLJJIII) != null) {
                        c432120Gx0.setTextColor(C20736316Cj.LIZIZ(R.attr.c9i, getContext()));
                    }
                    ConstraintLayout constraintLayout14 = this.LLJJIJIL;
                    if (constraintLayout14 != null && (context = constraintLayout14.getContext()) != null && (resources = context.getResources()) != null) {
                        displayMetrics = resources.getDisplayMetrics();
                    } else {
                        displayMetrics = null;
                    }
                    float fApplyDimension = TypedValue.applyDimension(1, 13.0f, displayMetrics);
                    C432120Gx0 c432120Gx010 = this.LLJJIII;
                    if (c432120Gx010 != null) {
                        fValueOf = Float.valueOf(c432120Gx010.getTextSize());
                    }
                    if (!Intrinsics.LIZ(fApplyDimension, fValueOf) && (c432120Gx02 = this.LLJJIII) != null) {
                        c432120Gx02.setTextSize(13.0f);
                    }
                    MatchCountDownViewModel matchCountDownViewModelCp = cp();
                    matchCountDownViewModelCp.LLILZ = j;
                    if (!matchCountDownViewModelCp.getState().LLILLJJLI) {
                        C20441214yg.LJIIL("MatchCountDownViewModel", "updateCountDown, showCountDown = false");
                    } else {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("updateCountDown, setState. countdownTimeStamp:");
                        sbLIZ6.append(j);
                        C20441214yg.LIZIZ("MatchCountDownViewModel", C2188811AlT.LIZIZ(sbLIZ6));
                        matchCountDownViewModelCp.setState(new AwS31S0000100_16(j, 13));
                    }
                    lp();
                }
                if (Xa()) {
                    C432120Gx0 c432120Gx011 = this.LLJJIII;
                    if (c432120Gx011 != null) {
                        C500260Jjc.LJIILIIL(c432120Gx011);
                    }
                    C20441214yg.LIZIZ("MatchCountDownAssem", "updateBattleCountDown, isHighScoreTipPlaying = true");
                    return;
                }
                return;
            }
        }
        C20441214yg.LIZIZ("MatchCountDownAssem", "updateBattleCountDown is accept");
        ConstraintLayout constraintLayout15 = this.LLJJIJIL;
        if (constraintLayout15 != null) {
            C786410Ut5.LL(8, constraintLayout15);
        }
        lp();
    }

    public final void No(EnumC20486415Eg enumC20486415Eg) {
        C432120Gx0 c432120Gx0;
        DataChannel dataChannel;
        boolean z = false;
        if (enumC20486415Eg == EnumC20486415Eg.LL && !this.LLJLL && this.LLJZIJLIL == 0 && this.LLJZ == EnumC20486315Ef.LLILLL && (this.LLJJLIIIJLLLLLLLZ || ((dataChannel = this.LLLFZ) != null && Intrinsics.LJFF(dataChannel.gg0(BattleDelayPunishCountdownChannel.class), Boolean.TRUE)))) {
            z = true;
        }
        Lo();
        Vo(enumC20486415Eg);
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        if (constraintLayout != null) {
            C500260Jjc.LJIILIIL(constraintLayout);
        }
        if (z) {
            DataChannel dataChannel2 = this.LLLFZ;
            if (dataChannel2 != null) {
                dataChannel2.zW(BattleDelayPunishCountdownChannel.class, Boolean.FALSE);
            }
            hp(true);
            ARunnableS128S0100000_28 aRunnableS128S0100000_28 = this.LLJJJJLIIL;
            if (aRunnableS128S0100000_28 != null && (c432120Gx0 = this.LLJJIII) != null) {
                HandlerHook.viewRemoveCallbacks(c432120Gx0, aRunnableS128S0100000_28);
            }
            ARunnableS128S0100000_28 aRunnableS128S0100000_282 = new ARunnableS128S0100000_28(this, 74);
            this.LLJJJJLIIL = aRunnableS128S0100000_282;
            C432120Gx0 c432120Gx02 = this.LLJJIII;
            if (c432120Gx02 != null) {
                HandlerHook.viewPost(c432120Gx02, aRunnableS128S0100000_282);
                return;
            }
            return;
        }
        DataChannel dataChannel3 = this.LLLFZ;
        if (dataChannel3 != null) {
            dataChannel3.zW(BattleDelayPunishCountdownChannel.class, Boolean.FALSE);
        }
        hp(true);
    }

    public final void Vo(EnumC20486415Eg enumC20486415Eg) {
        this.LLJJLIIIJLLLLLLLZ = false;
        int iOrdinal = enumC20486415Eg.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2) {
                throw new C1954807lC();
            }
            this.LLJZIJLIL = 0;
            this.LLJLLL = null;
            if (this.LLJZ != EnumC20486315Ef.LLILZIL) {
                this.LLJZ = EnumC20486315Ef.LLILZ;
                return;
            }
            return;
        }
        this.LLJZIJLIL = 0;
    }

    public final void hp(boolean z) {
        DataChannel dataChannel = this.LLLFZ;
        if (dataChannel != null) {
            dataChannel.zW(BattleShowLeagueScoreChannel.class, Boolean.valueOf(z));
        }
    }

    public final void kp(int i) {
        C16F5 c16f5 = this.LLJILJILJ;
        if (c16f5 != null) {
            C786410Ut5.LLJJJJ(c16f5, i);
        }
        if (C970370bMJ.LJII()) {
            C1324720kZq c1324720kZq = this.LLJILLL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, i);
            }
            View view = this.LLJJ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(i, view);
                return;
            }
            return;
        }
        C500260Jjc.LJIILIIL(this.LLJILLL);
        C500260Jjc.LJIILIIL(this.LLJJ);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        C432120Gx0 c432120Gx0;
        C430350Gu9 c430350Gu9;
        super.onViewCreated(view);
        this.LLJJIJIL = (ConstraintLayout) view;
        this.LLLFFI = ((C1155220gAS) this.LLIZLLLIL.getValue()).LL;
        this.LLLFZ = ((C1155220gAS) this.LLIZLLLIL.getValue()).LLILLJJLI;
        this.LLJIJIL = (ImageView) view.findViewById(R.id.lqy);
        this.LLJILJIL = (C1126540fQC) view.findViewById(R.id.lqv);
        this.LLJILJILJ = (C16F5) view.findViewById(R.id.tv_pk_only_gift);
        this.LLJILLL = (C1324720kZq) view.findViewById(R.id.lqz);
        this.LLJJ = view.findViewById(R.id.v_divider);
        this.LLJJI = (LiveIconView) view.findViewById(R.id.l8u);
        C432120Gx0 c432120Gx02 = (C432120Gx0) view.findViewById(R.id.tv_pk_countdown_value);
        Object objGg0 = null;
        boolean zLJFF = false;
        if (c432120Gx02 != null) {
            c432120Gx02.setOptState(false);
        } else {
            c432120Gx02 = null;
        }
        this.LLJJIII = c432120Gx02;
        this.LLJJIJI = (C427330GpH) view.findViewById(R.id.zx0);
        this.LLJJIJIIJIL = (C1145830fvJ) view.findViewById(R.id.tv_scroll_task_tip);
        this.LLLI = C800330VaR.LIZIZ(view.getContext(), R.drawable.dv7);
        this.LLLII = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.c9i, getContext()));
        this.LLLIIII = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.c5q, getContext()));
        this.LLLILZ.LIZ = this.LLLFZ;
        MatchCountDownViewModel matchCountDownViewModelCp = cp();
        selectSubscribe(matchCountDownViewModelCp, new C2217381BqS() { // from class: X.15El
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20487315Ep) obj).LL;
            }
        }, new C2217381BqS() { // from class: X.15Em
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20487315Ep) obj).LLILZLL;
            }
        }, new C2217381BqS() { // from class: X.15Ej
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20487315Ep) obj).LLILZIL);
            }
        }, new C2217381BqS() { // from class: X.15En
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20487315Ep) obj).LLIZ;
            }
        }, C736820SvI.LIZIZ(matchCountDownViewModelCp.usedInReusedScene), null, new C20750616Hw(this, 1));
        MatchCountDownViewModel matchCountDownViewModelCp2 = cp();
        selectSubscribe(matchCountDownViewModelCp2, new C2217381BqS() { // from class: X.15Ei
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C20487315Ep) obj).LLILLJJLI);
            }
        }, new C2217381BqS() { // from class: X.15Eo
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C20487315Ep) obj).LLILLL;
            }
        }, new C2217381BqS() { // from class: X.15Ek
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Long.valueOf(((C20487315Ep) obj).LLILZ);
            }
        }, C736820SvI.LIZIZ(matchCountDownViewModelCp2.usedInReusedScene), null, new C19336710kv(this, 1));
        lp();
        C204741159n c204741159n = this.LLLIIIL;
        if (c204741159n != null) {
            C1155220gAS c1155220gAS = (C1155220gAS) this.LLIZLLLIL.getValue();
            InterfaceC665370Q7z interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(this);
            ConstraintLayout constraintLayout = this.LLJJIJIL;
            C432120Gx0 c432120Gx03 = this.LLJJIII;
            C1126540fQC c1126540fQC = this.LLJILJIL;
            Drawable drawable = this.LLLI;
            c204741159n.getClass();
            c204741159n.LIZ = c1155220gAS.LLILLJJLI;
            c204741159n.LIZIZ = interfaceC665370Q7zLJIIL;
            c204741159n.LIZJ = this;
            c204741159n.LIZLLL = constraintLayout;
            c204741159n.LJ = c432120Gx03;
            c204741159n.LJFF = c1126540fQC;
            c204741159n.LJI = drawable;
            c204741159n.LJII = C800330VaR.LIZIZ(view.getContext(), R.drawable.dv8);
            C430350Gu9 c430350Gu92 = (C430350Gu9) view.findViewById(R.id.zl8);
            c204741159n.LJIIIZ = c430350Gu92;
            if (c430350Gu92 == null) {
                c430350Gu9 = null;
                c430350Gu92 = null;
            } else {
                c430350Gu9 = c430350Gu92;
            }
            c430350Gu9.setTypeface(c430350Gu92.getTypeface(), 3);
            C430350Gu9 c430350Gu93 = c204741159n.LJIIIZ;
            if (c430350Gu93 == null) {
                c430350Gu93 = null;
            }
            c430350Gu93.setStrokeEnable(true);
            DataChannel dataChannel = c204741159n.LIZ;
            if (dataChannel != null) {
                dataChannel.CQ2(BattleTimeLeftChannel.class, c204741159n, new AwS610S0100000_31(c204741159n, 529));
                dataChannel.CQ2(BattleStateChannel.class, c204741159n, new AwS610S0100000_31(c204741159n, 530));
                dataChannel.CQ2(BattleItemExtraTimeCardSentEvent.class, c204741159n, new AwS610S0100000_31(c204741159n, 531));
            }
        }
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ("tiktok_live_match_resource", "ttlive_match_calculating_clock.webp"));
        this.LLLFF = c1320810kTXLIZJ;
        this.LLLIIIIL = "";
        DataChannel dataChannel2 = this.LLLFZ;
        if (dataChannel2 != null) {
            objGg0 = dataChannel2.gg0(BattleStateChannel.class);
        }
        if (objGg0 == EnumC964170bCJ.MATCH_START) {
            C427330GpH c427330GpH = this.LLJJIJI;
            if (c427330GpH != null) {
                c427330GpH.setText("");
            }
            C432120Gx0 c432120Gx04 = this.LLJJIII;
            if ((c432120Gx04 == null || c432120Gx04.getGravity() != 8388627) && (c432120Gx0 = this.LLJJIII) != null) {
                c432120Gx0.setGravity(8388627);
            }
            ip();
            up(false);
            if (op()) {
                lp();
            }
        }
        DataChannel dataChannel3 = this.LLLFZ;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(BattleTimeLeftChannel.class, this, new AwS610S0100000_31(this, 84));
            dataChannel3.CQ2(BattleDrawTimeLeftChannel.class, this, new AwS610S0100000_31(this, 85));
            dataChannel3.CQ2(BattleStateChannel.class, this, new AwS610S0100000_31(this, 86));
            dataChannel3.CQ2(BattleHighScoreNoticeEvent.class, this, new AwS610S0100000_31(this, 87));
            dataChannel3.CQ2(BattleBridgedPunishScoreUpdateChannel.class, this, new AwS607S0100000_28(this, 25));
            dataChannel3.CQ2(BattleRawRankNoticeReceivedChannel.class, this, new AwS607S0100000_28(this, 26));
            dataChannel3.CQ2(MatchRankScoreAddedEvent.class, this, new AwS610S0100000_31(this, 88));
            dataChannel3.CQ2(MatchRankNoScoreAddedEvent.class, this, new AwS610S0100000_31(this, 89));
            dataChannel3.CQ2(HideMatchCountdownViewEvent.class, this, new AwS610S0100000_31(this, 83));
            dataChannel3.CQ2(BattleBonusTaskShowChannel.class, this, new AwS607S0100000_28(this, 24));
        }
        DataChannel dataChannel4 = this.LLLFZ;
        if (dataChannel4 != null) {
            zLJFF = Intrinsics.LJFF(dataChannel4.gg0(BattleBonusTaskShowChannel.class), Boolean.TRUE);
        }
        this.LLLILZJ = zLJFF;
        Go();
    }

    public final void up(boolean z) {
        ConstraintLayout constraintLayout;
        Object parent;
        Object parent2;
        if (op()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("showOrHideBattleCountDownLayout show = ");
            sbLIZ.append(z);
            C20441214yg.LIZIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
            ConstraintLayout constraintLayout2 = this.LLJJIJIL;
            if (constraintLayout2 != null && (parent2 = constraintLayout2.getParent()) != null && (parent2 instanceof View)) {
                if (z) {
                    C786410Ut5.LJLLLLLL(0, (View) parent2);
                    return;
                } else {
                    C786410Ut5.LJLLLLLL(4, (View) parent2);
                    return;
                }
            }
            return;
        }
        C20441214yg.LIZIZ("MatchCountDownAssem", "showOrHideBattleCountDownLayout: not show league match ");
        if (!LiveMatchOptOutLeagueCountdownSetting.INSTANCE.isEnable() || (constraintLayout = this.LLJJIJIL) == null || (parent = constraintLayout.getParent()) == null || !(parent instanceof View)) {
            return;
        }
        C786410Ut5.LJLLLLLL(0, (View) parent);
    }

    public final void zp(int i) {
        ViewParent parent;
        ConstraintLayout constraintLayout = this.LLJJIJIL;
        ViewGroup.LayoutParams layoutParams = null;
        ViewParent parent2 = null;
        if (constraintLayout != null) {
            parent = constraintLayout.getParent();
        } else {
            parent = null;
        }
        if (parent instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout2 = this.LLJJIJIL;
            if (constraintLayout2 != null) {
                parent2 = constraintLayout2.getParent();
            }
            ConstraintLayout constraintLayout3 = (ConstraintLayout) parent2;
            C19MB c19mb = new C19MB();
            c19mb.LJII(constraintLayout3);
            ConstraintLayout constraintLayout4 = this.LLJJIJIL;
            if (constraintLayout4 != null) {
                c19mb.LJIILL(constraintLayout4.getId(), i);
            }
            c19mb.LIZIZ(constraintLayout3);
            return;
        }
        ConstraintLayout constraintLayout5 = this.LLJJIJIL;
        if (constraintLayout5 != null && (layoutParams = constraintLayout5.getLayoutParams()) != null) {
            layoutParams.width = i;
        }
        ConstraintLayout constraintLayout6 = this.LLJJIJIL;
        if (constraintLayout6 == null) {
            return;
        }
        C786410Ut5.m6(constraintLayout6, layoutParams);
    }

    public final void Jo(ImageView imageView, C20486515Eh c20486515Eh) {
        if (imageView != null && c20486515Eh != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("bindImageSource source=");
            sbLIZ.append(c20486515Eh.LIZ);
            C20441214yg.LJIIIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
            EnumC1154880g9u enumC1154880g9u = c20486515Eh.LIZ;
            if (enumC1154880g9u == EnumC1154880g9u.GECKO) {
                C1143680frq.LIZLLL(imageView, c20486515Eh.LIZJ, c20486515Eh.LIZLLL);
            } else if (enumC1154880g9u == EnumC1154880g9u.IMAGE_MODEL) {
                C1819620xS4.LIZ().LJIIIZ(c20486515Eh.LJ).LJJI(imageView);
            } else {
                imageView.setImageResource(c20486515Eh.LIZIZ);
            }
        }
    }

    public final AnimatorSet ap(float f, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.LLJJIII, (Property<C432120Gx0, Float>) View.ALPHA, f, 1.0f));
        animatorSet.setDuration(j);
        return animatorSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object sp(com.bytedance.android.livesdk.model.message.common.Text r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem.sp(com.bytedance.android.livesdk.model.message.common.Text, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object tp(com.bytedance.android.livesdk.model.message.common.Text r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof X.C1884000z7u
            if (r0 == 0) goto L5d
            r4 = r7
            X.0z7u r4 = (X.C1884000z7u) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r1 = 1
            if (r0 == 0) goto L4a
            if (r0 != r1) goto L63
            X.C155000ia.LIZIZ(r3)
        L22:
            android.text.Spannable r3 = (android.text.Spannable) r3
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "showMessageText tipSpannable "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MatchCountDownAssem"
            X.C20441214yg.LIZIZ(r0, r1)
            X.0Gx0 r0 = r5.LLJJIII
            if (r0 == 0) goto L40
            r0.setText(r3)
        L40:
            X.0Gx0 r0 = r5.LLJJIII
            if (r0 == 0) goto L47
            X.C500260Jjc.LLFFF(r0)
        L47:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4a:
            X.C155000ia.LIZIZ(r3)
            if (r6 != 0) goto L52
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L52:
            X.01OO r0 = X.C01OO.LIZ
            r4.LLILLL = r1
            java.lang.Object r3 = r0.LIZ(r6, r4)
            if (r3 != r2) goto L22
            return r2
        L5d:
            X.0z7u r4 = new X.0z7u
            r4.<init>(r5, r7)
            goto L12
        L63:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownAssem.tp(com.bytedance.android.livesdk.model.message.common.Text, X.05Vn):java.lang.Object");
    }

    public final AnimatorSet bp(float f, float f2, long j) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(this.LLJJIII, (Property<C432120Gx0, Float>) View.SCALE_X, f, f2), ObjectAnimator.ofFloat(this.LLJJIII, (Property<C432120Gx0, Float>) View.SCALE_Y, f, f2));
        animatorSet.setDuration(j);
        return animatorSet;
    }

    public final void ep(String str, boolean z, boolean z2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("punish handoff, punishReadyToTakeOver=");
        sbLIZ.append(z);
        sbLIZ.append(", rawRankNoticeReceived=");
        sbLIZ.append(this.LLJL);
        sbLIZ.append(", bridgedBattleNoticeReceived=");
        sbLIZ.append(this.LLJLIL);
        sbLIZ.append(", filteredQueueEmpty=");
        sbLIZ.append(z2);
        sbLIZ.append(", handoffDecision=");
        sbLIZ.append(str);
        sbLIZ.append(", countdownReleaseDispatched=");
        sbLIZ.append(this.LLJLILLLLZIIL);
        sbLIZ.append(", cycleId=");
        sbLIZ.append(this.LLJLLIL);
        sbLIZ.append(", cyclePhase=");
        sbLIZ.append(this.LLJZ);
        sbLIZ.append(", queueRemaining=");
        sbLIZ.append(this.LLJZIJLIL);
        sbLIZ.append(", hideAllowedForCycleId=");
        sbLIZ.append(this.LLJLLL);
        C20441214yg.LJIIIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void yp(MatchCountDownAssem matchCountDownAssem, String str, EnumC586570MzX enumC586570MzX, boolean z, boolean z2, int i) {
        float fLIZIZ;
        TextPaint paint;
        boolean z3 = z;
        if ((i & 4) != 0) {
            z3 = false;
        }
        if ((i & 8) != 0) {
            z2 = false;
        }
        float fMeasureText = 0.0f;
        if (z2) {
            matchCountDownAssem.getClass();
            fLIZIZ = C497740JfY.LIZIZ(14.0f);
        } else {
            fLIZIZ = 0.0f;
        }
        C427330GpH c427330GpH = matchCountDownAssem.LLJJIJI;
        if (c427330GpH != null && (paint = c427330GpH.getPaint()) != null) {
            fMeasureText = paint.measureText(str);
        }
        dp(matchCountDownAssem, str, enumC586570MzX, fMeasureText + fLIZIZ, z3, null, 16);
    }

    public static void dp(final MatchCountDownAssem matchCountDownAssem, final String str, final EnumC586570MzX enumC586570MzX, float f, boolean z, Spannable spannable, int i) {
        final boolean z2;
        final int measuredWidth;
        int measuredWidth2;
        int iLIZIZ;
        float fLIZIZ;
        final Spannable spannable2 = spannable;
        final boolean z3 = z;
        final int iLIZIZ2 = 0;
        if ((i & 8) != 0) {
            z3 = false;
        }
        if ((i & 16) != 0) {
            spannable2 = null;
        }
        matchCountDownAssem.getClass();
        if (f > ((int) C497740JfY.LIZIZ(247.0f))) {
            z2 = true;
        } else {
            z2 = false;
        }
        ConstraintLayout constraintLayout = matchCountDownAssem.LLJJIJIL;
        if (constraintLayout != null) {
            measuredWidth = constraintLayout.getMeasuredWidth();
        } else {
            measuredWidth = 0;
        }
        ImageView imageView = matchCountDownAssem.LLJIJIL;
        if (imageView != null) {
            measuredWidth2 = imageView.getMeasuredWidth();
        } else {
            measuredWidth2 = 0;
        }
        int i2 = measuredWidth - measuredWidth2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needMarquee = ");
        sbLIZ.append(z2);
        sbLIZ.append(" and curWidth = ");
        sbLIZ.append(i2);
        sbLIZ.append(" and tipWidth = ");
        sbLIZ.append(f);
        C20441214yg.LIZIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (z2) {
            iLIZIZ2 = (int) C497740JfY.LIZIZ(247.0f);
        }
        if (z2) {
            iLIZIZ = ((int) C497740JfY.LIZIZ(247.0f)) - i2;
            fLIZIZ = C497740JfY.LIZIZ(18.0f);
        } else {
            iLIZIZ = ((int) f) - i2;
            fLIZIZ = C497740JfY.LIZIZ(24.0f);
        }
        final int i3 = ((int) fLIZIZ) + iLIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("tipWidth = ");
        sbLIZ2.append(f);
        sbLIZ2.append(" and layoutTotalWidth = ");
        sbLIZ2.append(measuredWidth);
        sbLIZ2.append(" and extra = ");
        sbLIZ2.append(i3);
        C20441214yg.LIZIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ2));
        ConstraintLayout constraintLayout2 = matchCountDownAssem.LLJJIJIL;
        if (constraintLayout2 != null) {
            HandlerHook.viewPostDelay(constraintLayout2, new Runnable() { // from class: X.15Ec
                public final void LIZ() {
                    final MatchCountDownAssem matchCountDownAssem2 = this.LL;
                    int i4 = measuredWidth;
                    int i5 = i3 + i4;
                    final boolean z4 = z2;
                    int i6 = iLIZIZ2;
                    String str2 = str;
                    EnumC586570MzX enumC586570MzX2 = enumC586570MzX;
                    final boolean z5 = z3;
                    Spannable spannable3 = spannable2;
                    AnimatorSet animatorSet = matchCountDownAssem2.LLJJJIL;
                    if (C500260Jjc.LJJJI(animatorSet != null ? Boolean.valueOf(animatorSet.isRunning()) : null)) {
                        AnimatorSet animatorSet2 = matchCountDownAssem2.LLJJJIL;
                        if (animatorSet2 != null) {
                            animatorSet2.cancel();
                        }
                        matchCountDownAssem2.LLJJJIL = null;
                    }
                    C204741159n c204741159n = matchCountDownAssem2.LLLIIIL;
                    if (C500260Jjc.LJJJI(c204741159n != null ? Boolean.valueOf(c204741159n.LJIIJJI) : null) || !matchCountDownAssem2.LLILZ) {
                        return;
                    }
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("buildTaskTipAnimator oldWidth = ");
                    sbLIZ3.append(i4);
                    sbLIZ3.append("， tipViewWidth = ");
                    sbLIZ3.append(i6);
                    sbLIZ3.append(", newWidth=");
                    sbLIZ3.append(i5);
                    C20441214yg.LIZIZ("MatchCountDownAssem", C2188811AlT.LIZIZ(sbLIZ3));
                    C1145830fvJ c1145830fvJ = matchCountDownAssem2.LLJJIJIIJIL;
                    if (c1145830fvJ != null) {
                        C786410Ut5.LLJLILLLLZIIL(c1145830fvJ, 8);
                    }
                    C1145830fvJ c1145830fvJ2 = matchCountDownAssem2.LLJJIJIIJIL;
                    if (c1145830fvJ2 != null) {
                        c1145830fvJ2.LIZ();
                    }
                    C1145830fvJ c1145830fvJ3 = matchCountDownAssem2.LLJJIJIIJIL;
                    if (c1145830fvJ3 != null) {
                        c1145830fvJ3.setText("");
                    }
                    C427330GpH c427330GpH = matchCountDownAssem2.LLJJIJI;
                    if (c427330GpH != null) {
                        C786410Ut5.LLJLLIL(c427330GpH, 8);
                    }
                    C427330GpH c427330GpH2 = matchCountDownAssem2.LLJJIJI;
                    if (c427330GpH2 != null) {
                        c427330GpH2.LJJJJIZL();
                    }
                    C427330GpH c427330GpH3 = matchCountDownAssem2.LLJJIJI;
                    if (c427330GpH3 != null) {
                        c427330GpH3.setText("");
                    }
                    if (z5) {
                        if (spannable3 == null || spannable3.length() == 0) {
                            C1145830fvJ c1145830fvJ4 = matchCountDownAssem2.LLJJIJIIJIL;
                            if (c1145830fvJ4 != null) {
                                c1145830fvJ4.setText(str2);
                            }
                            C1145830fvJ c1145830fvJ5 = matchCountDownAssem2.LLJJIJIIJIL;
                            if (c1145830fvJ5 != null) {
                                C786410Ut5.LLJLILLLLZIIL(c1145830fvJ5, 0);
                            }
                        } else {
                            C1145830fvJ c1145830fvJ6 = matchCountDownAssem2.LLJJIJIIJIL;
                            if (c1145830fvJ6 != null) {
                                c1145830fvJ6.setSpan(spannable3);
                            }
                            C1145830fvJ c1145830fvJ7 = matchCountDownAssem2.LLJJIJIIJIL;
                            if (c1145830fvJ7 != null) {
                                C786410Ut5.LLJLILLLLZIIL(c1145830fvJ7, 0);
                            }
                        }
                    } else if (spannable3 == null || spannable3.length() == 0) {
                        C427330GpH c427330GpH4 = matchCountDownAssem2.LLJJIJI;
                        if (c427330GpH4 != null) {
                            c427330GpH4.setText(str2);
                        }
                        C427330GpH c427330GpH5 = matchCountDownAssem2.LLJJIJI;
                        if (c427330GpH5 != null) {
                            C786410Ut5.LLJLLIL(c427330GpH5, 0);
                        }
                    } else {
                        C427330GpH c427330GpH6 = matchCountDownAssem2.LLJJIJI;
                        if (c427330GpH6 != null) {
                            c427330GpH6.setText(spannable3);
                        }
                        C427330GpH c427330GpH7 = matchCountDownAssem2.LLJJIJI;
                        if (c427330GpH7 != null) {
                            C786410Ut5.LLJLLIL(c427330GpH7, 0);
                        }
                    }
                    matchCountDownAssem2.LLJJJJ = enumC586570MzX2;
                    C19MB c19mb = new C19MB();
                    c19mb.LJII(matchCountDownAssem2.LLJJIJIL);
                    c19mb.LJIILL(z5 ? R.id.tv_scroll_task_tip : R.id.zx0, i6);
                    c19mb.LIZIZ(matchCountDownAssem2.LLJJIJIL);
                    float f2 = i4;
                    float f3 = i5;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, f3);
                    valueAnimatorOfFloat.setDuration(300L);
                    valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.33f, 0.0f, 0.35f, 1.0f));
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS278S0100000_31(matchCountDownAssem2, 33));
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(matchCountDownAssem2.LLJJIII, (Property<C432120Gx0, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat.setDuration(200L);
                    objectAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
                    objectAnimatorOfFloat.addListener(new ALAdapterS23S0100000_28(matchCountDownAssem2, 5));
                    ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(matchCountDownAssem2.LLJILJILJ, (Property<C16F5, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat2.setDuration(200L);
                    objectAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
                    ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(matchCountDownAssem2.LLJILLL, (Property<C1324720kZq, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat3.setDuration(200L);
                    objectAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
                    objectAnimatorOfFloat3.addListener(new ALAdapterS25S0100000_31(matchCountDownAssem2, 23));
                    ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(z5 ? matchCountDownAssem2.LLJJIJIIJIL : matchCountDownAssem2.LLJJIJI, (Property<Object, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat4.setDuration(200L);
                    objectAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
                    ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 5000);
                    valueAnimatorOfInt.setDuration(Mp4ScreenVideoLoadTimeout.CONTROL);
                    valueAnimatorOfInt.addListener(new ALAdapterS25S0100000_31(matchCountDownAssem2, 24));
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat2.setDuration(1000L);
                    valueAnimatorOfFloat2.addListener(new AnimatorListenerAdapter() { // from class: X.15Eb
                        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            if (z4) {
                                if (z5) {
                                    C1145830fvJ c1145830fvJ8 = matchCountDownAssem2.LLJJIJIIJIL;
                                    if (c1145830fvJ8 != null) {
                                        HandlerHook.viewPost(c1145830fvJ8, new RunnableC996250c23(c1145830fvJ8, 40, 3000L));
                                        return;
                                    }
                                    return;
                                }
                                C427330GpH c427330GpH8 = matchCountDownAssem2.LLJJIJI;
                                if (c427330GpH8 == null) {
                                    return;
                                }
                                c427330GpH8.LJJJJI();
                            }
                        }
                    });
                    ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(f3, f2);
                    valueAnimatorOfFloat3.setDuration(300L);
                    valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.64f, 0.0f, 0.67f, 1.0f));
                    valueAnimatorOfFloat3.addUpdateListener(new AUListenerS278S0100000_31(matchCountDownAssem2, 34));
                    valueAnimatorOfFloat3.addListener(new ALAdapterS25S0100000_31(matchCountDownAssem2, 25));
                    ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(z5 ? matchCountDownAssem2.LLJJIJIIJIL : matchCountDownAssem2.LLJJIJI, (Property<Object, Float>) View.ALPHA, 1.0f, 0.0f);
                    objectAnimatorOfFloat5.setDuration(200L);
                    objectAnimatorOfFloat5.setInterpolator(C0GY9.LIZIZ(0.65f, 0.0f, 1.0f, 1.0f));
                    objectAnimatorOfFloat5.addListener(new AAListenerS341S0100000_31(matchCountDownAssem2, 4));
                    ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(matchCountDownAssem2.LLJJIII, (Property<C432120Gx0, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat6.setDuration(200L);
                    objectAnimatorOfFloat6.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
                    objectAnimatorOfFloat6.addListener(new ALAdapterS23S0100000_28(matchCountDownAssem2, 6));
                    ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(matchCountDownAssem2.LLJILJILJ, (Property<C16F5, Float>) View.ALPHA, 0.0f, 1.0f);
                    objectAnimatorOfFloat7.setDuration(200L);
                    objectAnimatorOfFloat7.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 0.35f, 1.0f));
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat4.setDuration(100L);
                    ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
                    valueAnimatorOfFloat5.setDuration(100L);
                    animatorSet3.play(valueAnimatorOfFloat).with(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(valueAnimatorOfFloat4).before(valueAnimatorOfInt);
                    animatorSet3.play(valueAnimatorOfFloat4).before(objectAnimatorOfFloat4);
                    animatorSet3.play(valueAnimatorOfInt).with(valueAnimatorOfFloat2).before(valueAnimatorOfFloat3);
                    animatorSet3.play(objectAnimatorOfFloat5).with(valueAnimatorOfFloat3).with(valueAnimatorOfFloat5);
                    animatorSet3.play(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).after(valueAnimatorOfFloat5);
                    animatorSet3.addListener(new ALAdapterS25S0100000_31(matchCountDownAssem2, 22));
                    if (matchCountDownAssem2.LLILZ) {
                        animatorSet3.start();
                    }
                    matchCountDownAssem2.LLJJJIL = animatorSet3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("MatchCountDownAssem@1efb.innerShowTaskTip$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("MatchCountDownAssem@1efb.innerShowTaskTip$1");
                }
            }, 500L);
        }
    }
}
