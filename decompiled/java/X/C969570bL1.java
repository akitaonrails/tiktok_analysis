package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.bytedance.android.live.liveinteract.feed.match.title.MatchFeedTitleViewModel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleDrawTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattlePunishTimeLeftChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleTimeLeftChannel;
import com.bytedance.android.live.liveinteract.multihost.event.MultiCoHostStateChannel;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.TopLiveSkylightTransYChannel;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchAudienceCheckBattleInfoSetting;
import com.bytedance.android.livesdk.sei.SeiAppData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.0bL1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C969570bL1 extends FrameLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C15FA LLILLL;
    public final C20478615Bg LLILZ;
    public final C969660bLA LLILZIL;
    public final C958980b3w LLILZLL;
    public InterfaceC962060b8u LLIZ;
    public C969650bL9 LLIZLLLIL;
    public final C969560bL0 LLJ;
    public EnumC950120ape LLJI;

    private final FrameLayout getCohostContainer() {
        return (FrameLayout) this.LLILLJJLI.getValue();
    }

    public final void LIZIZ() {
        C20441214yg.LJIIIZ("MultiHostFeedView", "onDestroy");
        C962050b8t c962050b8t = new C962050b8t();
        c962050b8t.LJIILL(this.LLIZ);
        c962050b8t.LJIILJJIL("cohost_widget_unload");
        C958980b3w c958980b3w = this.LLILZLL;
        c958980b3w.getClass();
        C969550bKz.LIZIZ(C956620b08.class, c958980b3w.LIZLLL);
        C969550bKz.LIZIZ(C954930axP.class, c958980b3w.LJFF);
        C969550bKz.LIZIZ(C956640b0A.class, c958980b3w.LJ);
        c958980b3w.LIZ = null;
        c958980b3w.LIZIZ = null;
        c958980b3w.LIZJ = null;
        this.LLILLL.LIZIZ();
        C20478615Bg c20478615Bg = this.LLILZ;
        c20478615Bg.getClass();
        C20441214yg.LIZIZ("MatchFeedHealthDelegate", "onDestroy");
        DataChannel dataChannel = c20478615Bg.LIZ;
        if (dataChannel != null) {
            dataChannel.zQ2(c20478615Bg);
        }
        c20478615Bg.LIZ = null;
        this.LLILZIL.LIZ();
        C969650bL9 c969650bL9 = this.LLIZLLLIL;
        if (c969650bL9.LIZLLL.compareTo(EnumC964170bCJ.MATCH_START) >= 0) {
            c969650bL9.LIZLLL.compareTo(EnumC964170bCJ.MATCH_END);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("match_widget_destroy, battle_id = ");
        sbLIZ.append(C973900bS0.LIZ.LIZ());
        C20441214yg.LIZIZ("MatchFeedWidget", C2188811AlT.LIZIZ(sbLIZ));
        C969610bL5 c969610bL5 = c969650bL9.LIZIZ;
        c969610bL5.getClass();
        C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "detachView");
        c969610bL5.LIZIZ.LJ();
        c969610bL5.LIZJ.removeCallbacksAndMessages(null);
        c969610bL5.LIZ = null;
        AbstractC974680bTG abstractC974680bTG = c969650bL9.LIZJ;
        if (abstractC974680bTG != null) {
            abstractC974680bTG.LJIILL();
        }
        c969650bL9.LIZJ = null;
        C973900bS0.LIZ("onDestroy");
        this.LLIZ = null;
        this.LLJI = EnumC950120ape.None;
    }

    public final ViewGroup getLayoutContainer() {
        return (ViewGroup) this.LL.getValue();
    }

    public final C958980b3w getFeedWindowManager() {
        return this.LLILZLL;
    }

    public final InterfaceC958970b3v getLayoutChangedListener() {
        return this.LLJ;
    }

    public final C969650bL9 getMatchFeedViewHandler() {
        return this.LLIZLLLIL;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [X.0bL0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [X.0bL3] */
    public C969570bL1(Context context) {
        super(context, null, 0);
        this.LL = C1935407i4.LIZ(new AwS559S0100000_15(this, StrategyCenter.ENABLE_SMART_SERVICE));
        this.LLILLJJLI = C1935407i4.LIZ(new AwS559S0100000_15(this, 807));
        this.LLILLL = new C15FA();
        this.LLILZ = new C20478615Bg();
        this.LLILZIL = new C969660bLA();
        C786410Ut5.Td(C786410Ut5.ne(C1834150xpV.LJIIJJI(context)), R.layout.i0g, this, true);
        this.LLILZLL = new C958980b3w();
        this.LLIZLLLIL = new C969650bL9(new InterfaceC969670bLB() { // from class: X.0bL3
            @Override // X.InterfaceC969670bLB
            public final C969660bLA LIZ() {
                return this.LIZ.LLILZIL;
            }

            @Override // X.InterfaceC969670bLB
            public final C15FA LIZIZ() {
                return this.LIZ.LLILLL;
            }

            @Override // X.InterfaceC969670bLB
            public final InterfaceC962060b8u LIZJ() {
                return this.LIZ.LLIZ;
            }

            @Override // X.InterfaceC969670bLB
            public final C20478615Bg LIZLLL() {
                return this.LIZ.LLILZ;
            }
        });
        this.LLJ = new InterfaceC958970b3v() { // from class: X.0bL0
            @Override // X.InterfaceC958970b3v
            public final void LIZJ(int i, List list) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJIJL(C2180891AWx c2180891AWx) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJJJI() {
            }

            @Override // X.InterfaceC958970b3v
            public final boolean LJJJIL() {
                return true;
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIIIL(Map map) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLIILII(InterfaceC937820aVo interfaceC937820aVo, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJJJ() {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLILLLLZIIL(SeiAppData seiAppData) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLJLLL(List list, boolean z) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLIIIIL(C2180891AWx c2180891AWx, int i) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLJ(LinkUser linkUser) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LLLLL(InterfaceC937820aVo interfaceC937820aVo) {
            }

            @Override // X.InterfaceC958970b3v
            public final void LJIILL(InterfaceC937840aVq interfaceC937840aVq, EnumC918810a19 enumC918810a19, EnumC918810a19 enumC918810a192, C938510aWv c938510aWv) {
                List<C958950b3t> listLJI;
                int size = 1;
                if (!interfaceC937840aVq.LIZJ() && interfaceC937840aVq.state() == EnumC918810a19.StateLinked) {
                    C969570bL1 c969570bL1 = this.LL;
                    EnumC950120ape enumC950120ape = EnumC950120ape.Linked;
                    if (c969570bL1.LLJI == enumC950120ape) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("onMultiHostStateChanged, return by state same, state = ");
                        sbLIZ.append(enumC950120ape);
                        C20441214yg.LJIIIZ("MultiHostFeedView", C2188811AlT.LIZIZ(sbLIZ));
                    } else {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onMultiHostStateChanged, state = ");
                        sbLIZ2.append(enumC950120ape);
                        sbLIZ2.append(", oldState=");
                        sbLIZ2.append(c969570bL1.LLJI);
                        C20441214yg.LJIIIZ("MultiHostFeedView", C2188811AlT.LIZIZ(sbLIZ2));
                        if (C959020b40.LIZ[enumC950120ape.ordinal()] == 1) {
                            C962050b8t c962050b8t = new C962050b8t();
                            c962050b8t.LJIILL(c969570bL1.LLIZ);
                            c962050b8t.LJIILJJIL("cohost_widget_load");
                            c969570bL1.LLJI = enumC950120ape;
                            C969650bL9 c969650bL9 = c969570bL1.LLIZLLLIL;
                            c969650bL9.getClass();
                            C973900bS0.LIZ("create");
                            C969610bL5 c969610bL5 = c969650bL9.LIZIZ;
                            c969610bL5.LIZ = c969650bL9;
                            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                            sbLIZ3.append("initBattleInfo, viewInterface=");
                            sbLIZ3.append(c969610bL5.LIZ);
                            C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", C2188811AlT.LIZIZ(sbLIZ3));
                            InterfaceC969600bL4 interfaceC969600bL4 = c969610bL5.LIZ;
                            if (interfaceC969600bL4 == null) {
                                C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "initBattleInfo, return by viewInterface == null");
                            } else {
                                InterfaceC969670bLB interfaceC969670bLBLIZIZ = interfaceC969600bL4.LIZIZ();
                                if (interfaceC969670bLBLIZIZ != null && interfaceC969670bLBLIZIZ.LIZJ() != null) {
                                    c969610bL5.LIZLLL = LiveMatchAudienceCheckBattleInfoSetting.INSTANCE.getEnterRetryCount();
                                    c969610bL5.LIZ(1);
                                } else {
                                    C20441214yg.LJIIIZ("MatchFeedWidgetPresenter", "initBattleInfo, return by MultiHostFeedInfoProvider == null");
                                }
                            }
                            c969650bL9.LJ = true;
                        }
                    }
                }
                InterfaceC962060b8u interfaceC962060b8u = this.LL.LLIZ;
                if (interfaceC962060b8u != null && (listLJI = interfaceC962060b8u.LJI()) != null) {
                    size = listLJI.size();
                }
                C956620b08 c956620b08 = new C956620b08(interfaceC937840aVq, size);
                List<Function1<C917110ZyP<?>, Unit>> list = C969550bKz.LIZ.get(C956620b08.class);
                if (list != null) {
                    Iterator<Function1<C917110ZyP<?>, Unit>> it2 = list.iterator();
                    while (it2.hasNext()) {
                        it2.next().invoke(new C917110ZyP<>(c956620b08));
                    }
                }
            }
        };
        this.LLJI = EnumC950120ape.None;
    }

    public final void LIZ(C958960b3u c958960b3u) {
        DataChannel dataChannel;
        ViewStub viewStub;
        DataChannel dataChannel2;
        DataChannel dataChannel3;
        ViewStub viewStub2;
        DataChannel dataChannel4;
        float fFloatValue;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate, rootContainer = ");
        sbLIZ.append(getLayoutContainer());
        sbLIZ.append(",  cohostContainer = ");
        sbLIZ.append(getCohostContainer());
        C20441214yg.LJIIIZ("MultiHostFeedView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZ = c958960b3u;
        C15FA c15fa = this.LLILLL;
        View viewFindViewById = findViewById(R.id.vs_cohost_feed_title_layout);
        c15fa.LIZIZ = c958960b3u;
        if (c958960b3u != null) {
            dataChannel = c958960b3u.getDataChannel();
        } else {
            dataChannel = null;
        }
        c15fa.LJIIJ = dataChannel;
        if (viewFindViewById instanceof ViewStub) {
            viewStub = (ViewStub) viewFindViewById;
        } else {
            viewStub = null;
        }
        c15fa.LIZJ = viewStub;
        MatchFeedTitleViewModel matchFeedTitleViewModel = c15fa.LIZ;
        InterfaceC962060b8u interfaceC962060b8u = c15fa.LIZIZ;
        if (interfaceC962060b8u != null) {
            dataChannel2 = interfaceC962060b8u.getDataChannel();
        } else {
            dataChannel2 = null;
        }
        matchFeedTitleViewModel.LL = dataChannel2;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(MultiCoHostStateChannel.class, matchFeedTitleViewModel, new AwS610S0100000_31(matchFeedTitleViewModel, 519));
            dataChannel2.CQ2(BattleStateChannel.class, matchFeedTitleViewModel, new AwS610S0100000_31(matchFeedTitleViewModel, 520));
            dataChannel2.CQ2(BattleTimeLeftChannel.class, matchFeedTitleViewModel, new AwS610S0100000_31(matchFeedTitleViewModel, 521));
        }
        c15fa.LIZ.LLILLL.observeForever(c15fa.LJIIIZ);
        DataChannel dataChannel5 = c15fa.LJIIJ;
        if (dataChannel5 != null) {
            dataChannel5.CQ2(BattleTimeLeftChannel.class, c15fa, new AwS610S0100000_31(c15fa, 515));
            dataChannel5.CQ2(BattleDrawTimeLeftChannel.class, c15fa, new AwS610S0100000_31(c15fa, 516));
            dataChannel5.CQ2(BattlePunishTimeLeftChannel.class, c15fa, new AwS610S0100000_31(c15fa, 517));
            dataChannel5.CQ2(BattleStateChannel.class, c15fa, new AwS610S0100000_31(c15fa, 518));
        }
        C20478615Bg c20478615Bg = this.LLILZ;
        View viewFindViewById2 = findViewById(R.id.vs_match_feed_health_bar);
        if (c958960b3u != null) {
            c20478615Bg.getClass();
            dataChannel3 = c958960b3u.getDataChannel();
        } else {
            dataChannel3 = null;
        }
        c20478615Bg.LIZ = dataChannel3;
        if (viewFindViewById2 instanceof ViewStub) {
            viewStub2 = (ViewStub) viewFindViewById2;
        } else {
            viewStub2 = null;
        }
        c20478615Bg.LIZJ = viewStub2;
        C969660bLA c969660bLA = this.LLILZIL;
        findViewById(R.id.mc0);
        if (c958960b3u != null) {
            c969660bLA.getClass();
            dataChannel4 = c958960b3u.getDataChannel();
        } else {
            dataChannel4 = null;
        }
        c969660bLA.LIZIZ = dataChannel4;
        C958980b3w c958980b3w = this.LLILZLL;
        FrameLayout cohostContainer = getCohostContainer();
        c958980b3w.LIZ = null;
        c958980b3w.LIZIZ = cohostContainer;
        c958980b3w.LIZJ = c958960b3u;
        C969550bKz.LIZ(C956620b08.class, c958980b3w.LIZLLL);
        C969550bKz.LIZ(C954930axP.class, c958980b3w.LJFF);
        C969550bKz.LIZ(C956640b0A.class, c958980b3w.LJ);
        InterfaceC937900aVw interfaceC937900aVw = c958960b3u.LIZ.LLILZIL;
        if (interfaceC937900aVw != null) {
            ViewGroup layoutContainer = getLayoutContainer();
            FrameLayout cohostContainer2 = getCohostContainer();
            Pair<Integer, Integer> pair = c958960b3u.LIZ.LLJJJJLIIL;
            Float f = (Float) DataChannelGlobal.LLILZ.gg0(TopLiveSkylightTransYChannel.class);
            if (f != null) {
                fFloatValue = f.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            interfaceC937900aVw.LJJJJLI(layoutContainer, cohostContainer2, pair, "multi_cohost_feed_view", null, fFloatValue);
        }
    }

    public final void setMatchFeedViewHandler(C969650bL9 c969650bL9) {
        this.LLIZLLLIL = c969650bL9;
    }
}
