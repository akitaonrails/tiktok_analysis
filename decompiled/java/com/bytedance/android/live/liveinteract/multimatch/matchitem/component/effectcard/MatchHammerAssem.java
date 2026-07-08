package com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard;

import X.AbstractC738140SxQ;
import X.AnonymousClass1590;
import X.AnonymousClass1594;
import X.AnonymousClass1598;
import X.C1143920fsE;
import X.C1143950fsH;
import X.C1144600ftK;
import X.C1322090kVb;
import X.C1324720kZq;
import X.C13BV;
import X.C13LE;
import X.C13LQ;
import X.C13LZ;
import X.C15438062q;
import X.C1548820qPI;
import X.C1558520qew;
import X.C1559260qg8;
import X.C158W;
import X.C158X;
import X.C159E;
import X.C1697810uHb;
import X.C19378010ra;
import X.C19719912Dl;
import X.C19MB;
import X.C20441214yg;
import X.C204721158t;
import X.C204726158y;
import X.C20483515Dd;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C389001fE;
import X.C452070Ho5;
import X.C497740JfY;
import X.C500260Jjc;
import X.C531650Kt9;
import X.C723590SZx;
import X.C723690Sa7;
import X.C723700Sa8;
import X.C724750Sbp;
import X.C736680Sv4;
import X.C786410Ut5;
import X.C914380Zu0;
import X.C914600ZuM;
import X.C915980Zwa;
import X.C916420ZxI;
import X.C916720Zxm;
import X.C954930axP;
import X.C955010axX;
import X.C955080axe;
import X.C956040azC;
import X.C956620b08;
import X.C964110bCD;
import X.C970370bMJ;
import X.C976480bWA;
import X.C976800bWg;
import X.EnumC204719158r;
import X.EnumC918810a19;
import X.InterfaceC1320850kTb;
import X.InterfaceC1554640qYg;
import X.InterfaceC2217461Bqa;
import X.InterfaceC494301wD;
import X.InterfaceC914610ZuN;
import X.InterfaceC954180awC;
import X.InterfaceC956560b02;
import X.InterfaceC973730bRj;
import X.RunnableC19377910rZ;
import X.SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.api.event.PlayerChangeLayoutParamEvent;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.live.liveinteract.multihost.core.model.NewLayoutWindowStateChangeMessage;
import com.bytedance.android.live.liveinteract.multimatch.matchitem.component.effectcard.MatchHammerAssem;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS276S0000000_31;
import kotlin.jvm.internal.AFwS301S0000000_17;
import kotlin.jvm.internal.AwS397S0200000_31;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.jvm.internal.AwS638S0100000_24;
import kotlin.jvm.internal.AwS645S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes32.dex */
public final class MatchHammerAssem extends UISlotAssem implements InterfaceC1554640qYg {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLL;
    public final AssemVMLazy LLJJI;
    public final C1559260qg8 LLJJIII;
    public DataChannel LLJJIJI;
    public boolean LLJJIJIIJIL;
    public Room LLJJIJIL;
    public FrameLayout LLJJJ;
    public FrameLayout LLJJJIL;
    public FrameLayout LLJJJJ;
    public FrameLayout LLJJJJJIL;
    public FrameLayout LLJJJJLIIL;
    public FrameLayout LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public View LLJL;
    public FrameLayout LLJLIL;
    public C19378010ra LLJLILLLLZIIL;
    public C158W LLJLL;
    public final long LLJLLIL;
    public final List<AnonymousClass1590> LLJLLL;
    public final AnonymousClass1594 LLJZ;
    public final List<Integer> LLJZIJLIL;
    public final List<Integer> LLL;
    public final List<Integer> LLLF;
    public final List<Integer> LLLFF;
    public int LLLFFI;
    public int LLLFZ;
    public int LLLI;
    public int LLLII;
    public final List<C1143920fsE> LLLIIII;
    public final List<C1143920fsE> LLLIIIIL;
    public int LLLIIIL;
    public volatile List<C916720Zxm> LLLIIL;
    public final C964110bCD LLLIILIL;
    public final AwS629S0100000_15 LLLIL;
    public final AwS629S0100000_15 LLLILZ;
    public final List<String> LLLILZJ;
    public C204726158y[] LLLILZLLLI;
    public C204726158y[] LLLIZZ;
    public C204726158y[] LLLJ;
    public final Vec2 LLLJIL;
    public final C204721158t[] LLLJL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(MatchHammerAssem.class, "hammerViewModel", "getHammerViewModel()Lcom/bytedance/android/live/liveinteract/multimatch/matchitem/component/effectcard/MatchHammerViewModel;", 0);
        C13LE.LIZ.getClass();
        LLLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int Co() {
        return R.layout.h2k;
    }

    @Override // X.AbstractC738140SxQ
    public final boolean get_assem_onParent_set_isOnParentSetEmpty_combytedanceassemarchcoreAssem() {
        return false;
    }

    @Override // X.InterfaceC1554640qYg
    public final InterfaceC494301wD provideAbility(String str) {
        if (str.hashCode() != -1696693832) {
            return null;
        }
        return up();
    }

    /* JADX WARN: Type inference failed for: r10v1, types: [X.1595] */
    /* JADX WARN: Type inference failed for: r2v11, types: [X.0bCD] */
    public MatchHammerAssem() {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(MatchHammerViewModel.class);
        AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(c19719912DlLIZ, 21);
        AFwS276S0000000_31 aFwS276S0000000_31 = AFwS276S0000000_31.get$arr$(20);
        Function0 function0LJIIJ = C724750Sbp.LJIIJ(this, c19719912DlLIZ);
        AssemVMLazy assemVMLazy = new AssemVMLazy(function0LJIIJ, awS568S0100000_24, new C452070Ho5(), C724750Sbp.LJII(this), C724750Sbp.LJIIIZ(this), new AwS568S0100000_24((AbstractC738140SxQ) this, 22), aFwS276S0000000_31, new AwS546S0100000_2((AbstractC738140SxQ) this, 1111), new C723690Sa7(this), new C723700Sa8(this));
        C724750Sbp.LIZIZ(this, function0LJIIJ, assemVMLazy);
        this.LLJJI = assemVMLazy;
        this.LLJJIII = new C1559260qg8(new C723590SZx(this, C1144600ftK.class, null), checkSupervisorPrepared());
        this.LLJLLIL = 1350 / C20483515Dd.LIZ.LJI();
        this.LLJLLL = C1697810uHb.LJIIJJI(new AnonymousClass1590(false, false), new AnonymousClass1590(false, true), new AnonymousClass1590(false, false), new AnonymousClass1590(true, false), new AnonymousClass1590(false, true), new AnonymousClass1590(true, true), new AnonymousClass1590(false, false), new AnonymousClass1590(false, true));
        ?? r10 = new Object() { // from class: X.1595
        };
        C159E c159e = C159E.LINEAR;
        this.LLJZ = new AnonymousClass1594(r10, C1697810uHb.LJIIJJI(new AnonymousClass1598(1.0E-5f, 0.0f, 0.0374f, 0.0f, 0.0374f, c159e, false), new AnonymousClass1598(0.28f, 0.0395f, 0.0374f, 0.0395f, 0.0374f, c159e, false), new AnonymousClass1598(0.05f, 0.0395f, 0.0374f, 0.0395f, 0.0374f, c159e, false), new AnonymousClass1598(0.36f, 0.0f, 0.0f, 0.0f, 0.0f, c159e, false), new AnonymousClass1598(0.4f, 1.0f, 0.0f, 0.5f, 0.6f, C159E.CUSTOM_CUBIC, true), new AnonymousClass1598(0.37f, 1.0f, 0.0f, 1.0f, 0.0f, c159e, true)));
        this.LLJZIJLIL = C1697810uHb.LJIIJJI(0, 1, 0, 2, 1, 3, 0, 1);
        this.LLL = C1697810uHb.LJIIJJI(0, 0, 2);
        this.LLLF = C1697810uHb.LJIIJJI(1, 1, 3);
        this.LLLFF = C1697810uHb.LJIIJJI(2, 0, 3);
        this.LLLIIII = C1697810uHb.LJIIJJI(kp("ttlive_match_hammer_red1.webp"), kp("ttlive_match_hammer_red1.webp"), kp("ttlive_match_hammer_red2.webp"), kp("ttlive_match_hammer_red2.webp"));
        this.LLLIIIIL = C1697810uHb.LJIIJJI(kp("ttlive_match_hammer_blue1.webp"), kp("ttlive_match_hammer_blue2.webp"), kp("ttlive_match_hammer_blue1.webp"), kp("ttlive_match_hammer_blue2.webp"));
        this.LLLIIL = C13BV.INSTANCE;
        this.LLLIILIL = new InterfaceC956560b02() { // from class: X.0bCD
            @Override // X.InterfaceC956560b02
            public final void LIZ(List<C955080axe> list) {
                MatchHammerAssem matchHammerAssem = this.LIZ;
                matchHammerAssem.getClass();
                matchHammerAssem.sp("onLayoutInfoCalculateWithStreamState", MatchHammerAssem.hp(list));
            }
        };
        this.LLLIL = new AwS629S0100000_15(this, 41);
        this.LLLILZ = new AwS629S0100000_15(this, 42);
        this.LLLILZJ = C1697810uHb.LJIIJJI("ttlive_match_hammer_red1_translation_removed.webp", "ttlive_match_hammer_blue1_translation_removed.webp", "ttlive_match_hammer_orange1_translation_removed.webp", "ttlive_match_hammer_purple1_translation_removed.webp");
        this.LLLJIL = new Vec2(0.5f, 0.5f);
        int length = EnumC204719158r.values().length;
        C204721158t[] c204721158tArr = new C204721158t[length];
        for (int i = 0; i < length; i++) {
            c204721158tArr[i] = new C204721158t();
        }
        this.LLLJL = c204721158tArr;
    }

    public final void ip() {
        FrameLayout frameLayout = this.LLJJJIL;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJJ;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLJJJJJIL;
        if (frameLayout3 != null) {
            C786410Ut5.LJJJJIZL(frameLayout3);
        }
        FrameLayout frameLayout4 = this.LLJJL;
        if (frameLayout4 != null) {
            C786410Ut5.LJJJJIZL(frameLayout4);
        }
        FrameLayout frameLayout5 = this.LLJJJJ;
        if (frameLayout5 != null) {
            C786410Ut5.LJJJJIZL(frameLayout5);
        }
        FrameLayout frameLayout6 = this.LLJJJJLIIL;
        if (frameLayout6 != null) {
            C786410Ut5.LJJJJIZL(frameLayout6);
        }
        FrameLayout frameLayout7 = this.LLJLIL;
        if (frameLayout7 != null) {
            for (int childCount = frameLayout7.getChildCount() - 1; -1 < childCount; childCount--) {
                if (!(frameLayout7.getChildAt(childCount) instanceof C158X)) {
                    RemoveViewCausedNPEChecker.recordViewRemovedPoint(frameLayout7, null);
                    frameLayout7.removeViewAt(childCount);
                }
            }
        }
        for (C204721158t c204721158t : this.LLLJL) {
            ((ArrayList) c204721158t.LIZ).clear();
            ((ArrayList) c204721158t.LIZIZ).clear();
            c204721158t.LIZJ = 0L;
        }
    }

    public final void mp() {
        String strLIZIZ;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        C158W c158w = this.LLJLL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroyFanHammerLynx assem@");
        sbLIZ.append(System.identityHashCode(this));
        sbLIZ.append(" presenter=");
        if (c158w == null) {
            strLIZIZ = "null";
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("alive@");
            sbLIZ2.append(System.identityHashCode(c158w));
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        sbLIZ.append(strLIZIZ);
        sbLIZ.append(" caller=");
        sbLIZ.append(C13LQ.LJJIIZ(1, new Throwable().getStackTrace()));
        C20441214yg.LIZIZ("MatchItemHammerAssem", C2188811AlT.LIZIZ(sbLIZ));
        if (c158w != null && c158w.LLILLL) {
            C1548820qPI.LJIIIIZZ("match_hammer_effect_container_ready", c158w);
            C1548820qPI.LJIIIIZZ("match_hammer_effect_play_finish", c158w);
            c158w.LLILLL = false;
            c158w.LLILLJJLI = true;
            C20441214yg.LIZIZ("HammerLottieFEPresenter", "unregistered JS event subscribers");
        }
        this.LLJLL = null;
        C19378010ra c19378010ra = this.LLJLILLLLZIIL;
        if (c19378010ra != null && (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c19378010ra.LIZ) != null) {
            Object parent = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            View view = parent instanceof C158X ? (View) parent : null;
            ViewParent parent2 = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.getParent();
            if ((parent2 instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent2) != null) {
                C786410Ut5.LJJJLZIJ(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB, viewGroup2);
            }
            if (view != null) {
                ViewParent parent3 = view.getParent();
                if ((parent3 instanceof ViewGroup) && (viewGroup = (ViewGroup) parent3) != null) {
                    C786410Ut5.LJJJLZIJ(view, viewGroup);
                }
            }
        }
        C19378010ra c19378010ra2 = this.LLJLILLLLZIIL;
        if (c19378010ra2 != null) {
            C20441214yg.LIZIZ("HammerSparkViewManager", "destroy sparkView");
            RunnableC19377910rZ runnableC19377910rZ = c19378010ra2.LIZJ;
            if (runnableC19377910rZ != null) {
                c19378010ra2.LIZLLL.removeCallbacks(runnableC19377910rZ);
            }
            c19378010ra2.LIZJ = null;
            c19378010ra2.LJ = null;
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 = c19378010ra2.LIZ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2 != null) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB2.LJJ(true);
            }
            c19378010ra2.LIZ = null;
            c19378010ra2.LIZIZ = false;
        }
        this.LLJLILLLLZIIL = null;
    }

    public final MatchHammerViewModel up() {
        AssemVMLazy assemVMLazy = this.LLJJI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLLL;
        return (MatchHammerViewModel) assemVMLazy.getValue();
    }

    public final void zp() {
        C500260Jjc.LJIILIIL(this.LLJJJIL);
        C500260Jjc.LJIILIIL(this.LLJJJ);
        C500260Jjc.LJIILIIL(this.LLJJJJJIL);
        C500260Jjc.LJIILIIL(this.LLJJL);
        C500260Jjc.LJIILIIL(this.LLJJJJ);
        C500260Jjc.LJIILIIL(this.LLJJJJLIIL);
        C500260Jjc.LJIILIIL(this.LLJLIL);
    }

    public static boolean Bp() {
        C976480bWA next;
        List<C976800bWg> list;
        List<C976800bWg> list2;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        if (!C970370bMJ.LJIIIIZZ()) {
            return false;
        }
        InterfaceC973730bRj interfaceC973730bRjYf2 = C915980Zwa.LJFF().yf2(false);
        C976480bWA c976480bWA = null;
        List<C976480bWA> value = (interfaceC973730bRjYf2 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) == null) ? null : mutableLiveDataLJJJJIZL.getValue();
        if (interfaceC973730bRjYf2 != null && value != null && !value.isEmpty()) {
            Iterator<C976480bWA> it2 = value.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
                if (next.LIZ == interfaceC973730bRjYf2.LJJJJJ()) {
                    break;
                }
            }
            C976480bWA c976480bWA2 = next;
            Iterator<C976480bWA> it3 = value.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                C976480bWA next2 = it3.next();
                if (next2.LIZ != interfaceC973730bRjYf2.LJJJJJ()) {
                    c976480bWA = next2;
                    break;
                }
            }
            C976480bWA c976480bWA3 = c976480bWA;
            int size = (c976480bWA2 == null || (list2 = c976480bWA2.LJFF) == null) ? 0 : ((ArrayList) list2).size();
            int size2 = (c976480bWA3 == null || (list = c976480bWA3.LJFF) == null) ? 0 : ((ArrayList) list).size();
            if (size > 0 && size2 > 0) {
                return (size == 1 && size2 == 1) ? false : true;
            }
        }
        if (C970370bMJ.LJIIIZ()) {
            return false;
        }
        return C915980Zwa.LJII().LJJLI().size() >= 3 || C915980Zwa.LJII().LLILZLL(true).size() >= 3;
    }

    public static List lp() {
        List list;
        C956040azC c956040azCLJI;
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        if (c955010axXI30 == null || (c956040azCLJI = c955010axXI30.LJI()) == null || (list = c956040azCLJI.LIZ) == null) {
            list = C13BV.INSTANCE;
        }
        return hp(list);
    }

    @Override // com.bytedance.assem.arch.core.UIAssem, X.AbstractC738140SxQ
    public final void onDestroy() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onDestroy assem@");
        sbLIZ.append(System.identityHashCode(this));
        C20441214yg.LIZIZ("MatchItemHammerAssem", C2188811AlT.LIZIZ(sbLIZ));
        C915980Zwa.LJII().LJJLIIIJL(C954930axP.class, this.LLLIL);
        C915980Zwa.LJII().LJJLIIIJL(C956620b08.class, this.LLLILZ);
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        if (c955010axXI30 != null) {
            c955010axXI30.LJIILLIIL(this.LLLIILIL);
        }
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        ip();
        zp();
        mp();
        this.LLJL = null;
        super.onDestroy();
    }

    @Override // X.AbstractC738140SxQ
    public final void onParentSet() throws IllegalAccessException {
        super.onParentSet();
        C1558520qew.LIZLLL(this);
        C915980Zwa.LJII().LLLJIL(C954930axP.class, this.LLLIL);
        C915980Zwa.LJII().LLLJIL(C956620b08.class, this.LLLILZ);
        DataChannel dataChannel = this.LLJJIJI;
        if (dataChannel != null) {
            dataChannel.CQ2(NewLayoutWindowStateChangeMessage.class, this, new AwS594S0100000_15(this, 519));
        }
    }

    public final C204726158y[] tp() {
        int size = C915980Zwa.LJII().LJJLI().size();
        if (size >= 4) {
            return this.LLLILZLLLI;
        }
        if (size == 3) {
            return this.LLLIZZ;
        }
        if (size == 2) {
            return this.LLLJ;
        }
        return null;
    }

    public static List hp(List list) {
        String str;
        LinkUser next;
        Long l;
        InterfaceC954180awC interfaceC954180awCLJIIIZ = C915980Zwa.LJII().LJIIIZ();
        if (interfaceC954180awCLJIIIZ == null) {
            return C13BV.INSTANCE;
        }
        List<LinkUser> listLIZLLL = interfaceC954180awCLJIIIZ.LIZLLL();
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C955080axe c955080axe = (C955080axe) it2.next();
            C916420ZxI c916420ZxILIZ = null;
            if (!c955080axe.LJIIL) {
                int i = 1;
                if (c955080axe.LJII == 1 && (str = c955080axe.LJIIIIZZ) != null) {
                    Iterator<LinkUser> it3 = listLIZLLL.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            next = it3.next();
                            if (Intrinsics.LJFF(next.linkMicId, str)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    LinkUser linkUser = next;
                    if (linkUser != null && (l = linkUser.userId) != null) {
                        long jLongValue = l.longValue();
                        Pair<Integer, Rect> pairLJJIJIIJIL = interfaceC954180awCLJIIIZ.LJJIJIIJIL(str);
                        if (pairLJJIJIIJIL != null) {
                            C914600ZuM c914600ZuM = InterfaceC914610ZuN.LJIJJ;
                            boolean zL6 = C915980Zwa.LJII().L6();
                            long jFf = C915980Zwa.LJII().ff();
                            c914600ZuM.getClass();
                            if (!zL6) {
                                i = 0;
                            } else if (jLongValue != jFf) {
                                i = 2;
                            }
                            int iIntValue = pairLJJIJIIJIL.getFirst().intValue();
                            Rect rectLJIIJ = interfaceC954180awCLJIIIZ.LJIIJ(str);
                            if (rectLJIIJ != null) {
                                c916420ZxILIZ = C914380Zu0.LIZ(rectLJIIJ);
                            }
                            arrayList.add(new C916720Zxm(jLongValue, iIntValue, c916420ZxILIZ, C914380Zu0.LIZ(pairLJJIJIIJIL.getSecond()), C914380Zu0.LIZ(c955080axe.LJFF), i));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static C1143920fsE kp(String str) {
        C1143920fsE c1143920fsE = new C1143920fsE();
        c1143920fsE.LIZIZ = "tiktok_live_interaction_demand_6";
        c1143920fsE.LIZJ = str;
        c1143920fsE.LJFF = true;
        c1143920fsE.LJ = new C1143950fsH() { // from class: X.158x
            @Override // X.C1143950fsH
            public final void LJ(Animatable animatable) {
                C20441214yg.LIZIZ("MatchItemHammerAssem", "webp listener onStart ");
            }

            @Override // X.C1143950fsH
            public final void LJFF(Animatable animatable) {
                C20441214yg.LIZIZ("MatchItemHammerAssem", "webp listener onStop ");
            }
        };
        return c1143920fsE;
    }

    public final void Ap(View view) {
        boolean z;
        int iLIZIZ;
        Integer numValueOf;
        int i;
        int i2;
        int i3;
        if (this.LLJJJ == null || this.LLJJJIL == null) {
            return;
        }
        boolean zBp = Bp();
        int iLIZIZ2 = 0;
        if (C970370bMJ.LIZJ() != 40 && C970370bMJ.LIZJ() != 4) {
            z = false;
        } else {
            z = true;
        }
        this.LLJJLIIIJLLLLLLLZ = z;
        FrameLayout frameLayout = this.LLJJJJJIL;
        int i4 = 8;
        if (frameLayout != null) {
            if (zBp) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            C786410Ut5.LJZ(i3, frameLayout);
        }
        FrameLayout frameLayout2 = this.LLJJL;
        if (frameLayout2 != null) {
            if (zBp && this.LLJJLIIIJLLLLLLLZ) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJZ(i2, frameLayout2);
        }
        FrameLayout frameLayout3 = this.LLJJJJ;
        if (frameLayout3 != null) {
            if (zBp) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJZ(i, frameLayout3);
        }
        FrameLayout frameLayout4 = this.LLJJJJLIIL;
        if (frameLayout4 != null) {
            if (zBp && this.LLJJLIIIJLLLLLLLZ) {
                i4 = 0;
            }
            C786410Ut5.LJZ(i4, frameLayout4);
        }
        FrameLayout frameLayout5 = this.LLJJJ;
        if (frameLayout5 != null) {
            C786410Ut5.LJZ(0, frameLayout5);
        }
        FrameLayout frameLayout6 = this.LLJJJIL;
        if (frameLayout6 != null) {
            C786410Ut5.LJZ(0, frameLayout6);
        }
        FrameLayout frameLayout7 = this.LLJLIL;
        if (frameLayout7 != null) {
            C786410Ut5.LJZ(0, frameLayout7);
        }
        if (!(view instanceof ConstraintLayout)) {
            return;
        }
        C19MB c19mb = new C19MB();
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        c19mb.LJII(constraintLayout);
        FrameLayout frameLayout8 = this.LLJJJ;
        Integer numValueOf2 = null;
        if (frameLayout8 != null) {
            numValueOf2 = Integer.valueOf(frameLayout8.getId());
        }
        if (numValueOf2 != null) {
            int iIntValue = numValueOf2.intValue();
            if (zBp) {
                iLIZIZ = (int) C497740JfY.LIZIZ(60.0f);
            } else {
                iLIZIZ = 0;
            }
            c19mb.LJJIIJZLJL(iIntValue, 4, iLIZIZ);
            FrameLayout frameLayout9 = this.LLJJJIL;
            if (frameLayout9 != null && (numValueOf = Integer.valueOf(frameLayout9.getId())) != null) {
                int iIntValue2 = numValueOf.intValue();
                if (zBp) {
                    iLIZIZ2 = (int) C497740JfY.LIZIZ(60.0f);
                }
                c19mb.LJJIIJZLJL(iIntValue2, 4, iLIZIZ2);
                c19mb.LIZIZ(constraintLayout);
                return;
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.bytedance.assem.arch.core.UIAssem
    public final void onViewCreated(View view) {
        Room room;
        super.onViewCreated(view);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewCreated assem@");
        sbLIZ.append(System.identityHashCode(this));
        C20441214yg.LIZIZ("MatchItemHammerAssem", C2188811AlT.LIZIZ(sbLIZ));
        this.LLJJJ = (FrameLayout) view.findViewById(R.id.i_d);
        this.LLJJJIL = (FrameLayout) view.findViewById(R.id.i9r);
        this.LLJJJJ = (FrameLayout) view.findViewById(R.id.i_f);
        this.LLJJJJLIIL = (FrameLayout) view.findViewById(R.id.i_e);
        this.LLJJJJJIL = (FrameLayout) view.findViewById(R.id.i9t);
        this.LLJJL = (FrameLayout) view.findViewById(R.id.i9s);
        this.LLJLIL = (FrameLayout) view.findViewById(R.id.jfs);
        this.LLJL = view;
        Vec2 vec2 = new Vec2(0.25f, 0.25f);
        Vec2 vec22 = this.LLLJIL;
        Vec2 vec23 = this.LLLJIL;
        Vec2 vec24 = this.LLLJIL;
        Vec2 vec25 = this.LLLJIL;
        this.LLLILZLLLI = new C204726158y[]{new C204726158y(new Vec2(((PointF) vec22).x - ((PointF) vec2).x, ((PointF) vec22).y - ((PointF) vec2).y)), new C204726158y(new Vec2(((PointF) vec23).x + ((PointF) vec2).x, ((PointF) vec23).y - ((PointF) vec2).y)), new C204726158y(new Vec2(((PointF) vec24).x - ((PointF) vec2).x, ((PointF) vec24).y + ((PointF) vec2).y)), new C204726158y(new Vec2(((PointF) vec25).x + ((PointF) vec2).x, ((PointF) vec25).y + ((PointF) vec2).y))};
        Vec2 vec26 = this.LLLJIL;
        Vec2 vec27 = this.LLLJIL;
        Vec2 vec28 = this.LLLJIL;
        this.LLLIZZ = new C204726158y[]{new C204726158y(new Vec2(((PointF) vec26).x - ((PointF) vec2).x, ((PointF) vec26).y)), new C204726158y(new Vec2(((PointF) vec27).x + ((PointF) vec2).x, ((PointF) vec27).y - ((PointF) vec2).y)), new C204726158y(new Vec2(((PointF) vec28).x + ((PointF) vec2).x, ((PointF) vec28).y + ((PointF) vec2).y))};
        Vec2 vec29 = this.LLLJIL;
        Vec2 vec210 = this.LLLJIL;
        this.LLLJ = new C204726158y[]{new C204726158y(new Vec2(((PointF) vec29).x - ((PointF) vec2).x, ((PointF) vec29).y)), new C204726158y(new Vec2(((PointF) vec210).x + ((PointF) vec2).x, ((PointF) vec210).y))};
        for (C204721158t c204721158t : this.LLLJL) {
            c204721158t.LIZLLL = this.LLJLLIL;
        }
        this.LLLIIIL = C915980Zwa.LJII().LLILZLL(true).size();
        this.LLJJIJI = ((C1144600ftK) this.LLJJIII.getValue()).LLILLJJLI;
        this.LLJJIJIIJIL = ((C1144600ftK) this.LLJJIII.getValue()).LL;
        DataChannel dataChannel = ((C1144600ftK) this.LLJJIII.getValue()).LLILLJJLI;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LLJJIJIL = room;
        C955010axX c955010axXI30 = C915980Zwa.LJII().i30();
        if (c955010axXI30 != null) {
            c955010axXI30.LIZIZ(this.LLLIILIL);
        }
        DataChannel dataChannel2 = this.LLJJIJI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(PlayerChangeLayoutParamEvent.class, this, new AwS610S0100000_31(this, 76));
        }
        if (C915980Zwa.LJFF().Nt()) {
            Ap(view);
        }
        DataChannel dataChannel3 = this.LLJJIJI;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(BattleStateChannel.class, this, new AwS397S0200000_31(this, view, 21));
        }
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158j
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LL;
            }
        }, null, new AwS645S0100000_31(this, 117), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158k
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLILLJJLI;
            }
        }, null, new AwS645S0100000_31(this, 118), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158l
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLILZ;
            }
        }, null, new AwS645S0100000_31(this, 119), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158m
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLILZIL;
            }
        }, null, new AwS645S0100000_31(this, 120), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158n
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLJI;
            }
        }, null, new AwS645S0100000_31(this, 121), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158o
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLILLL;
            }
        }, null, new AwS645S0100000_31(this, 122), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158p
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLJ;
            }
        }, null, new AwS638S0100000_24(this, 193), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158q
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLILZLL;
            }
        }, null, new AwS645S0100000_31(this, 123), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158h
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLIZ;
            }
        }, null, new AwS645S0100000_31(this, 116), 6);
        C736680Sv4.LJIIIIZZ(this, up(), new C2217381BqS() { // from class: X.158i
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C204708158g) obj).LLIZLLLIL;
            }
        }, null, AFwS301S0000000_17.get$arr$(20), 6);
    }

    public final void yp(EnumC918810a19 enumC918810a19) {
        if (enumC918810a19 == EnumC918810a19.StateLinked) {
            int size = C915980Zwa.LJII().LJIJJ().size();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("windowStateChangeMessage, current = ");
            sbLIZ.append(size);
            sbLIZ.append(" initSize = ");
            sbLIZ.append(this.LLLIIIL);
            C20441214yg.LIZIZ("MatchItemHammerAssem", C2188811AlT.LIZIZ(sbLIZ));
            if (this.LLLIIIL != size && !this.LLJJIJIIJIL) {
                ip();
                if (C915980Zwa.LJII().LLILZLL(true).size() < 4) {
                    this.LLJJLIIIJLLLLLLLZ = false;
                    FrameLayout frameLayout = this.LLJJJJLIIL;
                    if (frameLayout != null) {
                        C786410Ut5.LJJJJIZL(frameLayout);
                    }
                    FrameLayout frameLayout2 = this.LLJJJJLIIL;
                    if (frameLayout2 != null) {
                        C786410Ut5.LJZ(8, frameLayout2);
                    }
                    FrameLayout frameLayout3 = this.LLJJL;
                    if (frameLayout3 != null) {
                        C786410Ut5.LJJJJIZL(frameLayout3);
                    }
                    FrameLayout frameLayout4 = this.LLJJL;
                    if (frameLayout4 != null) {
                        C786410Ut5.LJZ(8, frameLayout4);
                    }
                }
                View view = this.LLJL;
                if (view != null) {
                    Ap(view);
                }
            }
        }
    }

    public final void sp(String str, List<C916720Zxm> list) {
        if (Intrinsics.LJFF(list, this.LLLIIL)) {
            return;
        }
        this.LLLIIL = list;
        C158W c158w = this.LLJLL;
        if (c158w != null) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<C916720Zxm> it2 = list.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(Long.valueOf(it2.next().LIZ));
            }
            JSONArray jSONArrayLIZIZ = C158W.LIZIZ(list);
            JSONArray jSONArrayLIZJ = C158W.LIZJ(linkedHashSet);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("layout_info", jSONArrayLIZIZ);
            jSONObject.put("team_info", jSONArrayLIZJ);
            C389001fE.LIZ("match_hammer_container_update", jSONObject, System.currentTimeMillis() + 10000, c158w.LLILLJJLI);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sendUpdateLayout layoutInfoSize=");
            sbLIZ.append(jSONArrayLIZIZ.length());
            sbLIZ.append(" teamInfoSize=");
            sbLIZ.append(jSONArrayLIZJ.length());
            sbLIZ.append(" json=");
            sbLIZ.append(jSONObject);
            C20441214yg.LIZIZ("HammerLottieFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("sendUpdateLayout via ");
        sbLIZ2.append(str);
        sbLIZ2.append(" rectsCount=");
        sbLIZ2.append(list.size());
        C20441214yg.LIZIZ("MatchItemHammerAssem", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final C1324720kZq op(boolean z, boolean z2, boolean z3) {
        FrameLayout frameLayout;
        Object next;
        boolean z4;
        Animatable animatableLIZ;
        Animatable animatableLIZ2;
        if (!Bp()) {
            if (z) {
                frameLayout = this.LLJJJ;
            } else {
                frameLayout = this.LLJJJIL;
            }
        } else if (z) {
            if (!z2) {
                frameLayout = this.LLJJJ;
            } else if (!z3) {
                frameLayout = this.LLJJJJ;
            } else {
                frameLayout = this.LLJJJJLIIL;
            }
        } else if (!z2) {
            frameLayout = this.LLJJJIL;
        } else if (!z3) {
            frameLayout = this.LLJJJJJIL;
        } else {
            frameLayout = this.LLJJL;
        }
        if (frameLayout == null) {
            return null;
        }
        IntRange intRangeLJIILJJIL = C13LZ.LJIILJJIL(0, frameLayout.getChildCount());
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRangeLJIILJJIL, 10));
        C531650Kt9 it2 = intRangeLJIILJJIL.iterator();
        while (it2.LLILLL) {
            arrayList.add(frameLayout.getChildAt(it2.nextInt()));
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                C1322090kVb c1322090kVb = (C1322090kVb) next;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("controller?.animatable?.isRunning = ");
                InterfaceC1320850kTb controller = c1322090kVb.getController();
                if (controller != null && (animatableLIZ2 = controller.LIZ()) != null && animatableLIZ2.isRunning()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                sbLIZ.append(z4);
                C20441214yg.LJ("MatchItemHammerAssem_Running", C2188811AlT.LIZIZ(sbLIZ));
                InterfaceC1320850kTb controller2 = c1322090kVb.getController();
                if (controller2 == null || (animatableLIZ = controller2.LIZ()) == null || (!animatableLIZ.isRunning())) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1324720kZq c1324720kZq = (C1324720kZq) next;
        if (c1324720kZq == null) {
            if (frameLayout.getChildCount() < this.LLJLLIL) {
                C1324720kZq c1324720kZq2 = new C1324720kZq(getContext());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, (int) C497740JfY.LIZIZ(167.0f));
                layoutParams.gravity = 1;
                frameLayout.addView(c1324720kZq2, layoutParams);
                C20441214yg.LJ("MatchItemHammerAssem", "Created New ImageView---");
                return c1324720kZq2;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("createNewDraweeViewIfNeeded over max = ");
            sbLIZ2.append(this.LLJLLIL);
            sbLIZ2.append(" childCount = ");
            sbLIZ2.append(frameLayout.getChildCount());
            C20441214yg.LJ("MatchItemHammerAssem", C2188811AlT.LIZIZ(sbLIZ2));
            return null;
        }
        return c1324720kZq;
    }
}
