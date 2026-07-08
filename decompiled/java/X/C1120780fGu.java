package X;

import Y.ARunnableS117S0100000_17;
import Y.AfS153S0200000_17;
import Y.AfS186S0100000_17;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GuideBubbleVisibilityChannel;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.ResetSilentTimerEvent;
import com.bytedance.android.live.gift.SendGiftEvent;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.liveinteract.match.service.ILiveMatchService;
import com.bytedance.android.livesdk.api.revenue.level.IUserLevelService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftRetrofitApi;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarReuseOptimizeSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveGradeInfoAndConfigApiOptSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0fGu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120780fGu implements InterfaceViewOnClickListenerC1102800enu, InterfaceC1121180fHY, InterfaceC484670IzZ {
    public final DataChannel LL;
    public C1120950fHB LLILLJJLI;
    public C1120930fH9 LLILLL;
    public C11JF LLILZIL;
    public C1121190fHZ LLILZLL;
    public long LLJJIII;
    public boolean LLJJJJJIL;
    public final C11NJ LLILZ = new C11NJ();
    public final List<Integer> LLIZ = new ArrayList();
    public boolean LLIZLLLIL = true;
    public final C1151840g50 LLJ = new C1151840g50(this, 4);
    public final C1151840g50 LLJI = new C1151840g50(this, 5);
    public final C1151840g50 LLJIJIL = new C1151840g50(this, 3);
    public final AwS596S0100000_17 LLJILJIL = new AwS596S0100000_17(this, 671);
    public final AwS596S0100000_17 LLJILJILJ = new AwS596S0100000_17(this, 674);
    public final AwS596S0100000_17 LLJILLL = new AwS596S0100000_17(this, 669);
    public final AwS596S0100000_17 LLJJ = new AwS596S0100000_17(this, 665);
    public final AwS596S0100000_17 LLJJI = new AwS596S0100000_17(this, 673);
    public final AwS596S0100000_17 LLJJIJI = new AwS596S0100000_17(this, 672);
    public final AwS596S0100000_17 LLJJIJIIJIL = new AwS596S0100000_17(this, 670);
    public final AwS596S0100000_17 LLJJIJIL = new AwS596S0100000_17(this, 667);
    public final AwS596S0100000_17 LLJJJ = new AwS596S0100000_17(this, 668);
    public final C1120850fH1 LLJJJIL = new C1120850fH1(this);
    public final AwS596S0100000_17 LLJJJJ = new AwS596S0100000_17(this, 666);

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILLJJLI() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void LLILZ() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void dK(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean dj() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final boolean f1() {
        return true;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ long g0() {
        return 500L;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void mx(DataChannel dataChannel) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onHide() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void onShow() {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ void qG(boolean z) {
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final /* synthetic */ boolean x0(View view) {
        return false;
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void J() {
        C1120950fHB c1120950fHB = this.LLILLJJLI;
        if (c1120950fHB != null) {
            c1120950fHB.LLJJJ = EnumC1102980eoC.HIGHLIGHT;
            c1120950fHB.LIZJ(null, false);
        }
    }

    public final Room LJFF() {
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            return (Room) dataChannel.gg0(RoomChannel.class);
        }
        return null;
    }

    @Override // X.InterfaceC484670IzZ
    public final Integer getComponentType() {
        return 169;
    }

    public C1120780fGu(DataChannel dataChannel) {
        this.LL = dataChannel;
    }

    @Override // X.InterfaceC1121180fHY
    public final void LIZ(C1121190fHZ c1121190fHZ) {
        C1120950fHB c1120950fHB = this.LLILLJJLI;
        if (c1120950fHB != null) {
            c1120950fHB.setShowingBubbleGuide(true);
        }
        C1120930fH9 c1120930fH9 = this.LLILLL;
        if (c1120930fH9 != null) {
            c1120930fH9.LIZ(c1121190fHZ);
            C11JF c11jf = this.LLILZIL;
            if (c11jf != null && !c11jf.isDisposed()) {
                C11JF c11jf2 = this.LLILZIL;
                if (c11jf2 != null) {
                    c11jf2.dispose();
                }
                this.LLILZIL = null;
            }
            C1120930fH9 c1120930fH92 = this.LLILLL;
            if (c1120930fH92 != null) {
                c1120930fH92.LIZIZ = null;
            }
        }
    }

    @Override // X.InterfaceC1121180fHY
    public final void LIZIZ(C1121190fHZ c1121190fHZ) {
        long j;
        C1120930fH9 c1120930fH9;
        C1120950fHB c1120950fHB = this.LLILLJJLI;
        if (c1120950fHB != null) {
            c1120950fHB.setShowingBubbleGuide(false);
        }
        C1120950fHB c1120950fHB2 = this.LLILLJJLI;
        if (c1120950fHB2 != null) {
            c1120950fHB2.LJI();
        }
        if (TextUtils.isEmpty(c1121190fHZ.LJ)) {
            j = 5;
        } else {
            j = 1;
        }
        this.LLILZ.LIZ(C11NZ.LJLJJLL(j, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS153S0200000_17(c1121190fHZ, this, 32)));
        long j2 = c1121190fHZ.LJFF;
        if (j2 > 0 && (c1120930fH9 = this.LLILLL) != null) {
            c1120930fH9.LIZIZ = c1121190fHZ;
            InterfaceC420801kM interfaceC420801kMLJJLJLI = C11NZ.LJLJJLL(j2, TimeUnit.MILLISECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 175));
            this.LLILZIL = (C11JF) interfaceC420801kMLJJLJLI;
            this.LLILZ.LIZ(interfaceC420801kMLJJLJLI);
        }
        C1120950fHB c1120950fHB3 = this.LLILLJJLI;
        if (c1120950fHB3 != null) {
            HandlerHook.viewPostDelay(c1120950fHB3, new Runnable() { // from class: X.0fCk
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ToolbarGiftBehavior@a3b.onBubbleDisappear$4");
                    try {
                        C1123590fLR.LIZ = false;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ToolbarGiftBehavior@a3b.onBubbleDisappear$4");
                }
            }, 3000L);
        }
    }

    @Override // X.InterfaceC1121180fHY
    public final void LIZJ(C1121190fHZ c1121190fHZ) {
        C1120930fH9 c1120930fH9 = this.LLILLL;
        if (c1120930fH9 != null) {
            c1120930fH9.LIZ(c1121190fHZ);
            this.LLILZ.LIZ(C11NZ.LJLJJLL(10L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS153S0200000_17(c1121190fHZ, this, 31)));
        }
    }

    @Override // X.InterfaceC1121180fHY
    public final void LJ(C1121190fHZ c1121190fHZ) {
        this.LLILZLL = c1121190fHZ;
        C1120930fH9 c1120930fH9 = this.LLILLL;
        if (c1120930fH9 != null) {
            c1120930fH9.LIZ(c1121190fHZ);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LiveMode streamType;
        C1121190fHZ c1121190fHZPeekFirst;
        String desc;
        Object obj;
        Object obj2;
        Object obj3;
        String str;
        Long lValueOf;
        Long lValueOf2;
        String str2;
        Boolean bool;
        String str3;
        long id;
        Integer num;
        Integer num2;
        int iIntValue;
        if (this.LL != null) {
            if (!LiveGradeInfoAndConfigApiOptSetting.INSTANCE.getConfig().enableGiftPanelUserLevelApiOpt || this.LLIZLLLIL || C1123390fL7.LIZJ) {
                ((IUserLevelService) C1161920gLG.LIZJ(IUserLevelService.class)).gN("gift", Boolean.FALSE, "");
                this.LLIZLLLIL = false;
                C1123390fL7.LIZJ = false;
            }
            C1121320fHm c1121320fHm = (C1121320fHm) this.LL.gg0(C1121380fHs.class);
            if (c1121320fHm != null) {
                this.LL.SX0(C1121380fHs.class, new C1121320fHm(c1121320fHm.LIZ, c1121320fHm.LIZIZ, System.currentTimeMillis()));
            }
            if (this.LL != null) {
                C1121570fIB c1121570fIB = new C1121570fIB((User) null);
                c1121570fIB.LIZJ = "icon";
                c1121570fIB.LJIILIIL = SystemClock.uptimeMillis();
                C1121320fHm c1121320fHm2 = (C1121320fHm) this.LL.gg0(C1121380fHs.class);
                if (c1121320fHm2 != null && (c1121320fHm2.LIZ || Math.abs(c1121320fHm2.LIZJ - c1121320fHm2.LIZIZ) < 500)) {
                    c1121570fIB.LJIIIZ = this.LLJJIII;
                }
                C1121240fHe c1121240fHe = (C1121240fHe) this.LL.gg0(C1121360fHq.class);
                if (c1121240fHe != null && System.currentTimeMillis() - c1121240fHe.LIZJ <= 20000 && (num2 = c1121240fHe.LIZ) != null) {
                    EnumC1121130fHT enumC1121130fHT = c1121240fHe.LIZLLL;
                    if (enumC1121130fHT == EnumC1121130fHT.BUBBLE || enumC1121130fHT == EnumC1121130fHT.DETAIL_PAGE) {
                        if (num2.intValue() == 7) {
                            c1121570fIB.LIZJ = "no2_booster_get_bubble";
                        } else if (num2.intValue() == 8) {
                            c1121570fIB.LIZJ = "no3_booster_get_bubble";
                        } else {
                            c1121570fIB.LIZJ = "match_item_get_bubble";
                        }
                    }
                    Integer num3 = c1121240fHe.LIZ;
                    if (num3 != null) {
                        iIntValue = num3.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    c1121570fIB.LJIIJ = new C1130240fWA(iIntValue, c1121240fHe.LIZIZ, true);
                    this.LL.SX0(C1121360fHq.class, null);
                }
                C1120930fH9 c1120930fH9 = this.LLILLL;
                if (c1120930fH9 != null) {
                    C1121190fHZ c1121190fHZ = c1120930fH9.LIZIZ;
                    if (c1121190fHZ != null) {
                        c1121570fIB.LJIIIZ = c1121190fHZ.LIZJ;
                    }
                    EnumC1120910fH7 enumC1120910fH7 = EnumC1120910fH7.NORMAL;
                    if (c1120930fH9.LIZ.size() > 0) {
                        Iterator<C1121190fHZ> it2 = c1120930fH9.LIZ.iterator();
                        int i = 0;
                        boolean z = false;
                        boolean z2 = false;
                        boolean z3 = false;
                        while (it2.hasNext()) {
                            EnumC1118040fCU enumC1118040fCU = it2.next().LIZIZ;
                            if (enumC1118040fCU == EnumC1118040fCU.BUBBLE) {
                                if (!z) {
                                    i++;
                                    enumC1120910fH7 = EnumC1120910fH7.BUBBLE;
                                    z = true;
                                }
                            } else if (enumC1118040fCU == EnumC1118040fCU.ANIMATION) {
                                if (!z2) {
                                    i++;
                                    enumC1120910fH7 = EnumC1120910fH7.ANIMATION;
                                    z2 = true;
                                }
                            } else if (enumC1118040fCU == EnumC1118040fCU.DOT && !z3) {
                                i++;
                                enumC1120910fH7 = EnumC1120910fH7.DOT;
                                z3 = true;
                            }
                        }
                        if (i > 1) {
                            enumC1120910fH7 = EnumC1120910fH7.MIX;
                        }
                    }
                    EnumC1120870fH3 enumC1120870fH3 = EnumC1120870fH3.NONE;
                    C1120930fH9 c1120930fH92 = this.LLILLL;
                    if (c1120930fH92 != null) {
                        c1121190fHZPeekFirst = c1120930fH92.LIZ.peekFirst();
                        if (c1121190fHZPeekFirst != null) {
                            if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.EVENT) {
                                enumC1120870fH3 = EnumC1120870fH3.EVENT;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.COLOR_GIFT) {
                                enumC1120870fH3 = EnumC1120870fH3.COLOR_GIFT;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.UNLOCK) {
                                enumC1120870fH3 = EnumC1120870fH3.UNLOCK;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.UNLOCK_TEAM_CHALLENGE) {
                                enumC1120870fH3 = EnumC1120870fH3.UNLOCK_TEAM_CHALLENGE;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.GIFT_GUIDE) {
                                enumC1120870fH3 = EnumC1120870fH3.GIFT_GUIDE;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.RANDOM_GIFT) {
                                enumC1120870fH3 = EnumC1120870fH3.RANDOM_GIFT;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.RANDOM_FIREWORKS) {
                                enumC1120870fH3 = EnumC1120870fH3.RANDOM_FIREWORKS;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.GIFT_CATCH_BEAN_GAME) {
                                c1121570fIB.LIZJ = "bean_guide";
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.POPULARITY_RANKING_BONUS_TIME_GIFT_GUIDE) {
                                enumC1120870fH3 = EnumC1120870fH3.POPULARITY_RANKING_BONUS_TIME_BUBBLE_GUIDE;
                            } else if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.SHINY_CARD_GIFT_GUIDE) {
                                c1121570fIB.LJJII = c1121190fHZPeekFirst.LIZJ;
                            }
                        }
                    } else {
                        c1121190fHZPeekFirst = null;
                    }
                    if (c1121190fHZPeekFirst != null) {
                        c1121570fIB.LJIIIZ = c1121190fHZPeekFirst.LIZJ;
                        if (c1121570fIB.LJIIJ == null && (num = c1121190fHZPeekFirst.LIZLLL) != null) {
                            int iIntValue2 = num.intValue();
                            c1121570fIB.LJIIJ = new C1130240fWA(iIntValue2, Long.valueOf(iIntValue2), true);
                            c1121570fIB.LIZJ = "match_item_use_bubble";
                            if (c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.BACKPACK_GIFTS) {
                                c1121570fIB.LIZJ = EnumC1123470fLF.GIFT_GUIDE_BACKPACK_GIFTS_BUBBLE.getValue();
                            }
                        }
                    }
                    if (enumC1120910fH7 == null || (desc = enumC1120910fH7.getDesc()) == null) {
                        desc = "normal";
                    }
                    c1121570fIB.LJIIL = desc;
                    c1121570fIB.LJIIIIZZ = true;
                    C1119830fFN c1119830fFN = (C1119830fFN) this.LL.gg0(C1119840fFO.class);
                    if (c1119830fFN != null) {
                        long j = c1119830fFN.LIZ;
                        Room roomLJFF = LJFF();
                        if (roomLJFF != null) {
                            id = roomLJFF.getId();
                        } else {
                            id = 0;
                        }
                        if (j == id && C158B.LIZJ() - c1119830fFN.LIZJ < 20) {
                            c1121570fIB.LIZLLL = EnumC1120600fGc.BACKPACK;
                            c1121570fIB.LJIIJ = new C1130240fWA(-1, null, false);
                            this.LL.SX0(C1119840fFO.class, null);
                        }
                    }
                    C1120840fH0 c1120840fH0 = C1120840fH0.LIZ;
                    C1120950fHB c1120950fHB = this.LLILLJJLI;
                    c1120840fH0.getClass();
                    if (!C1120840fH0.LIZ(c1121190fHZPeekFirst, c1120950fHB, false)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("click gift icon click time = ");
                        sbLIZ.append(c1121570fIB.LJIILIIL);
                        C20441214yg.LIZIZ("ToolbarGiftClick", C2188811AlT.LIZIZ(sbLIZ));
                        this.LL.LC0(SendGiftEvent.class, c1121570fIB);
                    }
                    String str4 = c1121570fIB.LIZJ;
                    Room room = (Room) this.LL.gg0(RoomChannel.class);
                    if (enumC1120910fH7 == null) {
                        enumC1120910fH7 = EnumC1120910fH7.NORMAL;
                    }
                    DataChannel dataChannel = this.LL;
                    w.LIZ.getClass();
                    Pair pair = new Pair(w.LJIIIZ(), w.LJIIL());
                    int i2 = C924810aAp.LJ().LJJII;
                    String str5 = CardStruct.IStatusCode.DEFAULT;
                    if (i2 > 0) {
                        obj = "1";
                    } else {
                        obj = CardStruct.IStatusCode.DEFAULT;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (!TextUtils.isEmpty(C1128450fTH.LJ())) {
                        if (TextUtils.equals("in_pk", C1128450fTH.LJ())) {
                            linkedHashMap.put("match_status", "pk_phase");
                        } else {
                            linkedHashMap.put("match_status", LiveCenterMockToolSwitch.PUNISH);
                        }
                        linkedHashMap.put("is_multi", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).sy0());
                        linkedHashMap.put("sub_match_type", ((ILiveMatchService) C1161920gLG.LIZJ(ILiveMatchService.class)).my());
                    }
                    if (C1128450fTH.LJIJJLI()) {
                        obj2 = "1";
                    } else {
                        obj2 = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("is_match_item", obj2);
                    linkedHashMap.put("pk_id", String.valueOf(C1128450fTH.LIZJ()));
                    if (C1128450fTH.LJJIFFI()) {
                        obj3 = "1";
                    } else {
                        obj3 = CardStruct.IStatusCode.DEFAULT;
                    }
                    linkedHashMap.put("is_match_item_user", obj3);
                    if (str4 == null) {
                        str = "";
                    } else {
                        str = str4;
                    }
                    linkedHashMap.put("gift_enter_from", str);
                    if (C13LP.LJJJJ(str4, C1697810uHb.LJIIJJI("match_item_get_bubble", "match_item_use_bubble"))) {
                        linkedHashMap.put("bubble_type", "bubble");
                    }
                    C1134970fdn.LIZ = ((IGiftService) C1161920gLG.LIZJ(IGiftService.class)).getOverloadScoreRetriever().LJIIL();
                    C1128760fTm c1128760fTm = C1128760fTm.LJIIJ;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_icon_click");
                    c474500IjALIZ.LJJIIZI(C155200ic.LIZ(dataChannel));
                    if (C781520UlC.LJIIIIZZ(room)) {
                        str5 = "1";
                    }
                    c474500IjALIZ.LJJII(str5, "shopping_mode");
                    c474500IjALIZ.LJJII(C1128450fTH.LJIIIZ().getDesc(), "send_gift_scene");
                    C1128460fTI.LIZJ(c474500IjALIZ);
                    c474500IjALIZ.LJJII(pair.getFirst(), "enter_from_merge");
                    c474500IjALIZ.LJJII(pair.getSecond(), "enter_method");
                    if (room != null) {
                        lValueOf = Long.valueOf(room.getId());
                    } else {
                        lValueOf = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf, "room_id");
                    if (room != null) {
                        lValueOf2 = Long.valueOf(room.getOwnerUserId());
                    } else {
                        lValueOf2 = null;
                    }
                    c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
                    if (room != null && room.getOwnerUserId() == UserService.getInstance().user().getCurrentUserId()) {
                        str2 = "anchor";
                    } else {
                        str2 = "user";
                    }
                    c474500IjALIZ.LJJII(str2, "user_type");
                    c474500IjALIZ.LJJII(enumC1120910fH7.getDesc(), "guide_from");
                    c474500IjALIZ.LJJII(enumC1120870fH3.getDesc(), "guide_reason");
                    c474500IjALIZ.LJJII(obj, "is_guest_connection");
                    c474500IjALIZ.LJJII(C1134970fdn.LIZ, "revenue_unified_overload_score");
                    c474500IjALIZ.LJJIIZI(linkedHashMap);
                    if (dataChannel != null) {
                        bool = (Boolean) dataChannel.gg0(C0TZM.class);
                    } else {
                        bool = null;
                    }
                    if (C500260Jjc.LJJIFFI(bool)) {
                        if (InterfaceC465670INx.LJLILLLLZI.LIZIZ().booleanValue()) {
                            str3 = "close";
                        } else {
                            str3 = "right_panel";
                        }
                        c474500IjALIZ.LJJII(str3, "public_area_status");
                    }
                    c474500IjALIZ.LJJIIZI(((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).getMatchLogParams());
                    C1128460fTI.LIZ(c474500IjALIZ, null);
                    c474500IjALIZ.LJIL();
                    C498410Jgd.LIZ(c474500IjALIZ, dataChannel);
                    c474500IjALIZ.LIZ();
                    if (c1121190fHZPeekFirst != null && c1121190fHZPeekFirst.LIZ == EnumC1120810fGx.COLOR_GIFT) {
                        InterfaceC1094160eZy.b1.LJFF(Boolean.TRUE);
                    }
                }
            }
            C1120950fHB c1120950fHB2 = this.LLILLJJLI;
            if (c1120950fHB2 != null) {
                HandlerHook.viewRemoveCallbacks(c1120950fHB2, c1120950fHB2.LLJJJJJIL);
                View view2 = c1120950fHB2.LLILZLL;
                if (view2 != null) {
                    C786410Ut5.LJLLLLLL(8, view2);
                }
                this.LLILZ.LIZ(C11NZ.LJLJJLL(5L, TimeUnit.SECONDS).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS186S0100000_17(this, 176)));
            }
            this.LL.FQ2(ResetSilentTimerEvent.class);
            if (Intrinsics.LJFF(this.LL.gg0(UserIsAnchorChannel.class), Boolean.TRUE)) {
                Room room2 = (Room) this.LL.gg0(RoomChannel.class);
                if (room2 != null) {
                    streamType = room2.getStreamType();
                } else {
                    streamType = LiveMode.VIDEO;
                }
                C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_anchor_gift_click");
                c474500IjALIZ2.LJIJJLI(this.LL);
                c474500IjALIZ2.LJJII(C354201Zc.LIZ(streamType), "live_type");
                c474500IjALIZ2.LIZ();
            }
        }
    }

    @Override // X.InterfaceViewOnClickListenerC1102800enu
    public final void Fe(InterfaceC1103130eoR interfaceC1103130eoR, DataChannel dataChannel) {
        int i;
        Drawable drawable;
        AnimatedDrawable2 animatedDrawable2;
        ViewGroup viewGroup;
        C1120950fHB c1120950fHB = this.LLILLJJLI;
        if (c1120950fHB != null) {
            ViewParent parent = c1120950fHB.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C786410Ut5.LJJJLZIJ(c1120950fHB, viewGroup);
            }
            C11JF c11jf = c1120950fHB.LLJJI;
            if (c11jf != null) {
                c11jf.dispose();
            }
            c1120950fHB.LLJILJIL = EnumC1120990fHF.DAILY;
            c1120950fHB.LLJILJILJ = null;
            C1121220fHc c1121220fHc = c1120950fHB.LLIZ;
            if (c1121220fHc != null) {
                c1121220fHc.LIZIZ = null;
                c1121220fHc.LIZJ.LJ();
            }
            c1120950fHB.LLJI.LJ();
            C1120960fHC c1120960fHC = c1120950fHB.LLIZLLLIL;
            c1120960fHC.LIZLLL = false;
            c1120960fHC.LIZ.LJ();
            C1121250fHf c1121250fHf = c1120950fHB.LLJ;
            c1121250fHf.LIZ = null;
            c1121250fHf.LIZJ = false;
            C473410IhP.LIZ().removeCallbacks(new ARunnableS117S0100000_17(c1121250fHf.LIZLLL, 264));
            LiveToolbarReuseOptimizeSetting liveToolbarReuseOptimizeSetting = LiveToolbarReuseOptimizeSetting.INSTANCE;
            if (liveToolbarReuseOptimizeSetting.enableStrategy(C1120950fHB.class.getSimpleName())) {
                c1120950fHB.LLJIJIL = 0L;
                c1120950fHB.LLJJIJI = false;
                c1120950fHB.LLJJIJIIJIL = false;
                c1120950fHB.LLJJIJIL = 0;
                C1324720kZq c1324720kZq = c1120950fHB.LLILZIL;
                if (c1324720kZq != null) {
                    drawable = c1324720kZq.getDrawable();
                } else {
                    drawable = null;
                }
                if ((drawable instanceof AnimatedDrawable2) && (animatedDrawable2 = (AnimatedDrawable2) drawable) != null) {
                    animatedDrawable2.stop();
                }
                c1120950fHB.LLJJIII.clear();
                HandlerHook.viewRemoveCallbacks(c1120950fHB, c1120950fHB.LLJJJJJIL);
                RemoveViewCausedNPEChecker.recordViewRemovedPoint(c1120950fHB, null);
                c1120950fHB.removeAllViews();
            }
            if (liveToolbarReuseOptimizeSetting.enableStrategy(C1120950fHB.class.getSimpleName())) {
                C0IRK c0irkLIZIZ = C0IRK.LIZIZ();
                if (dataChannel != null && Intrinsics.LJFF(dataChannel.gg0(C0TZM.class), Boolean.TRUE)) {
                    i = 1;
                } else {
                    i = 2;
                }
                c0irkLIZIZ.LIZLLL(i, c1120950fHB);
            }
        }
        DataChannel dataChannel2 = this.LL;
        if (dataChannel2 != null) {
            dataChannel2.zQ2(this);
        }
        this.LLILZ.LJ();
        this.LLJJJJJIL = false;
        this.LLIZLLLIL = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ab  */
    @Override // X.InterfaceViewOnClickListenerC1102800enu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void WH(X.InterfaceC1103130eoR r20, com.bytedance.ies.sdk.datachannel.DataChannel r21) {
        /*
            Method dump skipped, instruction units count: 988
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1120780fGu.WH(X.0eoR, com.bytedance.ies.sdk.datachannel.DataChannel):void");
    }

    @Override // X.InterfaceC1121180fHY
    public final void LIZLLL(C1121190fHZ c1121190fHZ, int i, Map<String, String> map) {
        C1120950fHB c1120950fHB = this.LLILLJJLI;
        if (c1120950fHB != null) {
            HandlerHook.viewPostDelay(c1120950fHB, new Runnable() { // from class: X.0fCh
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ToolbarGiftBehavior@a3b.onToolTipDismiss$1");
                    try {
                        C1123590fLR.LIZ = false;
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ToolbarGiftBehavior@a3b.onToolTipDismiss$1");
                }
            }, 3000L);
        }
        LIZIZ(c1121190fHZ);
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.zW(GuideBubbleVisibilityChannel.class, Boolean.FALSE);
        }
        if (i != 1) {
            if (i != 3) {
                C1123450fLD.LIZIZ(EnumC1123510fLJ.OTHER, EnumC1120830fGz.GIFT_GUIDE, map);
                return;
            } else {
                C1123450fLD.LIZIZ(EnumC1123510fLJ.USER_CLOSE, EnumC1120830fGz.GIFT_GUIDE, map);
                return;
            }
        }
        C1123450fLD.LIZIZ(EnumC1123510fLJ.TIME_UP, EnumC1120830fGz.GIFT_GUIDE, map);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x04b7  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C785240UrC LJI(final com.bytedance.android.livesdk.model.message.StyleDictateParams r61, final X.AbstractC1136060ffY r62, X.EnumC1120860fH2 r63, final X.InterfaceC520940Kbs r64) {
        /*
            Method dump skipped, instruction units count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1120780fGu.LJI(com.bytedance.android.livesdk.model.message.StyleDictateParams, X.0ffY, X.0fH2, X.0Kbs):X.0UrC");
    }

    public final void LJII(int i, String str, String str2, String str3) {
        long id;
        try {
            C480460Ism.LIZ().getClass();
            GiftRetrofitApi giftRetrofitApi = (GiftRetrofitApi) C480460Ism.LIZLLL(GiftRetrofitApi.class);
            Room roomLJFF = LJFF();
            if (roomLJFF != null) {
                id = roomLJFF.getId();
            } else {
                id = 0;
            }
            giftRetrofitApi.reportGiftGuide(id, str, i, str3, str2, CardStruct.IStatusCode.DEFAULT).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
