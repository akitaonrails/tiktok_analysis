package com.bytedance.android.live.effect.karaoke.viewmodels;

import X.AbstractC764660Tz6;
import X.AbstractC765580U1k;
import X.AnonymousClass0956;
import X.AnonymousClass0957;
import X.AnonymousClass0970;
import X.AnonymousClass0974;
import X.AnonymousClass0976;
import X.AnonymousClass0977;
import X.C01GW;
import X.C095G;
import X.C097C;
import X.C097N;
import X.C097O;
import X.C099R;
import X.C09IR;
import X.C0IJT;
import X.C0JG7;
import X.C0PEM;
import X.C0THK;
import X.C0U0N;
import X.C0U16;
import X.C0U17;
import X.C0U1B;
import X.C0U1G;
import X.C0U1H;
import X.C0U22;
import X.C0U2Y;
import X.C0U33;
import X.C0U3P;
import X.C0U3Q;
import X.C1161920gLG;
import X.C13LP;
import X.C1DEK;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C2252331DDr;
import X.C2286608xc;
import X.C23189096t;
import X.C23190096u;
import X.C23191096v;
import X.C23192096w;
import X.C23250099c;
import X.C452501pT;
import X.C474500IjA;
import X.C497740JfY;
import X.C500260Jjc;
import X.C763810Txj;
import X.C764310TyX;
import X.C764580Tyy;
import X.C764720TzC;
import X.C764820TzM;
import X.C765020Tzg;
import X.C765260U0e;
import X.C765290U0h;
import X.C765320U0k;
import X.C765360U0o;
import X.C765590U1l;
import X.C765690U1v;
import X.C765700U1w;
import X.C930890aKd;
import X.EnumC038300Bp;
import X.EnumC764860TzQ;
import X.EnumC764870TzR;
import X.InterfaceC1273910jFt;
import X.InterfaceC1364105Vn;
import X.InterfaceC497601wk;
import X.InterfaceC766480U4w;
import X.InterfaceC769940UIe;
import X.InterfaceC914680ZuU;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.broadcast.api.LiveStreamGlobalChannel;
import com.bytedance.android.live.effect.api.KaraokeStateChannel;
import com.bytedance.android.live.effect.api.KaraokeStopEvent;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS245S0000000_12;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes13.dex */
public final class KaraokeViewModel extends ViewModel {
    public static final /* synthetic */ int LLL = 0;
    public final C0U2Y LL;
    public final C1DEK LLILLJJLI = C095G.LIZ(Integer.MAX_VALUE, null, 6);
    public final C2252331DDr LLILLL;
    public final C2252331DDr LLILZ;
    public final C097O LLILZIL;
    public final C764580Tyy LLILZLL;
    public final C765260U0e LLIZ;
    public final C765320U0k LLIZLLLIL;
    public volatile ConcurrentHashMap<Integer, Integer> LLJ;
    public volatile int LLJI;
    public final ConcurrentHashMap<Integer, ConcurrentHashMap<Long, Pair<Integer, Integer>>> LLJIJIL;
    public volatile long LLJILJIL;
    public final ConcurrentHashMap<Integer, Boolean> LLJILJILJ;
    public volatile int LLJILLL;
    public final ConcurrentHashMap<Integer, String> LLJJ;
    public AnonymousClass0956 LLJJI;
    public final ConcurrentHashSet<Long> LLJJIII;
    public final ConcurrentHashSet<String> LLJJIJI;
    public final CopyOnWriteArrayList<AnonymousClass0957<Boolean>> LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public boolean LLJJJ;
    public final C0U33 LLJJJIL;
    public final IInteractService LLJJJJ;
    public final long LLJJJJJIL;
    public volatile boolean LLJJJJLIIL;
    public boolean LLJJL;
    public boolean LLJJLIIIJLLLLLLLZ;
    public final C0THK LLJL;
    public C0U1B LLJLIL;
    public int LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public final C765590U1l LLJLLIL;
    public InterfaceC769940UIe LLJLLL;
    public C0U22 LLJZ;
    public long LLJZIJLIL;

    public final void XQ2() {
        C0U22 c0u22LJIIJJI = IQ2().LJIIJJI();
        if (c0u22LJIIJJI != null) {
            IQ2().LIZLLL = true;
            C0U17 c0u17 = C0U17.LIZ;
            long j = c0u22LJIIJJI.LIZ;
            c0u22LJIIJJI.LJIIIZ();
            c0u17.LJIILLIIL(j, (a0.LJJJIL(c0u22LJIIJJI.LJII.LIZIZ) ^ true) && GQ2(), IQ2().LJI / 1000, false, KQ2(), this.LLJJL);
        }
    }

    public final int EQ2() {
        return this.LLJJJJ.aU0();
    }

    public final boolean GQ2() {
        return ((Boolean) C764820TzM.LIZ(this.LL.LJIIJJI()).LIZIZ()).booleanValue();
    }

    public final int HQ2() {
        return this.LL.LJIIJJI();
    }

    public final C0U1H IQ2() {
        return (C0U1H) this.LLJLL.getValue();
    }

    public final boolean KQ2() {
        return this.LL.LJIILL();
    }

    public final boolean LQ2() {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.LLJILJILJ;
        if (concurrentHashMap.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<Integer, Boolean>> it2 = concurrentHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final void YQ2() {
        int i = 1;
        this.LLJ.put(1, Integer.valueOf((EQ2() != 0 || HQ2() == 1) ? 1 : 0));
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.LLJ;
        if (EQ2() == 0 && HQ2() != 1) {
            i = 0;
        }
        concurrentHashMap.put(2, Integer.valueOf(i));
    }

    public final void hR2() {
        Iterator<Pair<Long, Integer>> it2 = this.LLJJJIL.LJ().iterator();
        while (it2.hasNext()) {
            this.LL.LJJIIZ(it2.next().getFirst().longValue(), EnumC038300Bp.ADDING);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("update Adding status ");
        sbLIZ.append(this.LLJJJIL.LJ());
        C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void lR2() {
        List<C0U22> list;
        C765690U1v c765690U1vLJIIL = this.LL.LJIIL(-999L);
        mR2((c765690U1vLJIIL == null || (list = c765690U1vLJIIL.LIZJ) == null) ? null : (C0U22) C13LP.LJJJLL(list));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        C20441214yg.LIZIZ("KaraokeViewModel#OnCliear", "onClear!!!");
        if (this.LL.LJIILL() || this.LL.LJIIJ.LIZIZ) {
            C0U22 c0u22LJIIJJI = IQ2().LJIIJJI();
            if (c0u22LJIIJJI != null && this.LL.LJIILIIL) {
                C0U17 c0u17 = C0U17.LIZ;
                long j = c0u22LJIIJJI.LIZ;
                c0u22LJIIJJI.LJIIIZ();
                c0u17.LJIILLIIL(j, (a0.LJJJIL(c0u22LJIIJJI.LJII.LIZIZ) ^ true) && GQ2(), IQ2().LJI / 1000, false, KQ2(), this.LLJJL);
            }
            if (KQ2()) {
                C0U17 c0u172 = C0U17.LIZ;
                if (C0U17.LIZLLL != -1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - C0U17.LIZLLL;
                    C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_karaoke_floating_panel_use_time");
                    c474500IjALIZ.LJIL();
                    c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C0U17.LIZJ)) ? 1 : 0), "is_live_take_default");
                    c474500IjALIZ.LJJII(Integer.valueOf((int) (jCurrentTimeMillis / 1000)), "use_time");
                    C0U17.LIZ(c0u172, c474500IjALIZ);
                    c474500IjALIZ.LIZ();
                }
            }
        }
        C0U33 c0u33 = this.LLJJJIL;
        c0u33.getClass();
        InterfaceC766480U4w.LJJL.LJFF(c0u33.LIZJ.toList());
        DataChannelGlobal.LLILZ.zQ2(this);
        C0U1B c0u1b = this.LLJLIL;
        if (c0u1b != null) {
            this.LLJJJJ.Z42(c0u1b);
        }
        this.LLJLIL = null;
        C20441214yg.LIZIZ("KLazy#reset", "");
        ((LinkedHashMap) C0U1G.LJI).clear();
        this.LLILZLL.LIZJ.clear();
    }

    public final C764310TyX iR2() {
        C764310TyX c764310TyX;
        C0U22 c0u22LJIIJJI = IQ2().LJIIJJI();
        C765590U1l c765590U1l = this.LLJLLIL;
        int iLJIIJJI = this.LL.LJIIJJI();
        c765590U1l.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Setting: role: ");
        sbLIZ.append(iLJIIJJI);
        sbLIZ.append(", isHosst: ");
        sbLIZ.append(C763810Txj.LIZ(Integer.valueOf(iLJIIJJI)));
        C20441214yg.LIZIZ("KaraokeMulti", C2188811AlT.LIZIZ(sbLIZ));
        if (C763810Txj.LIZ(Integer.valueOf(iLJIIJJI))) {
            EnumC764860TzQ enumC764860TzQ = InterfaceC766480U4w.LJJLIIIJJI.LIZIZ().booleanValue() ? EnumC764860TzQ.OPEN : EnumC764860TzQ.CLOSE;
            EnumC764870TzR enumC764870TzR = InterfaceC766480U4w.LJJLIIIJJIZ.LIZIZ().booleanValue() ? EnumC764870TzR.OPEN : EnumC764870TzR.CLOSE;
            if (c0u22LJIIJJI != null) {
                int i = c0u22LJIIJJI.LJIIIZ.LJ;
                if (i != 3 && i != 2) {
                    enumC764860TzQ = EnumC764860TzQ.FORBID_CLOSE;
                }
                if (c0u22LJIIJJI.LJII.LIZIZ.length() == 0) {
                    enumC764870TzR = EnumC764870TzR.FORBID_CLOSE;
                }
            }
            c764310TyX = new C764310TyX(enumC764860TzQ, enumC764870TzR, c765590U1l.LIZ);
        } else {
            EnumC764860TzQ enumC764860TzQ2 = InterfaceC766480U4w.LJJLIIJ.LIZIZ().booleanValue() ? EnumC764860TzQ.OPEN : EnumC764860TzQ.CLOSE;
            EnumC764870TzR enumC764870TzR2 = InterfaceC766480U4w.LJJLIL.LIZIZ().booleanValue() ? EnumC764870TzR.OPEN : EnumC764870TzR.CLOSE;
            if (c0u22LJIIJJI != null) {
                int i2 = c0u22LJIIJJI.LJIIIZ.LJ;
                if (i2 != 3 && i2 != 2) {
                    enumC764860TzQ2 = EnumC764860TzQ.FORBID_CLOSE;
                }
                if (c0u22LJIIJJI.LJII.LIZIZ.length() == 0) {
                    enumC764870TzR2 = EnumC764870TzR.FORBID_CLOSE;
                }
            }
            c764310TyX = new C764310TyX(enumC764860TzQ2, enumC764870TzR2, c765590U1l.LIZ);
        }
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C23190096u(this, c764310TyX, null), 3);
        return c764310TyX;
    }

    public final boolean vQ2() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.LL.LJIILL()) {
            long j = this.LLJZIJLIL;
            if (j == -1 || jCurrentTimeMillis - j >= 3000) {
                this.LLJZIJLIL = jCurrentTimeMillis;
                return true;
            }
        }
        AQ2(new C764720TzC(C497740JfY.LJIJI(2131840688), "pm_mt_LIVEKaraoke_tooFastToast"));
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.0U1B] */
    public KaraokeViewModel(C0U2Y c0u2y) {
        AbstractC765580U1k abstractC765580U1kLJII;
        this.LL = c0u2y;
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 30, null, 4);
        this.LLILLL = c2252331DDrLIZIZ;
        this.LLILZ = C09IR.LIZIZ(0, 30, null, 4);
        C097O c097o = new C097O(c2252331DDrLIZIZ);
        this.LLILZIL = c097o;
        this.LLILZLL = new C764580Tyy(c097o, this);
        this.LLIZ = new C765260U0e(c097o, ViewModelKt.getViewModelScope(this), c0u2y, this, new AwS556S0100000_12(this, 46), new AwS556S0100000_12(this, 47));
        C765320U0k c765320U0k = new C765320U0k(c097o, ViewModelKt.getViewModelScope(this), c0u2y);
        c765320U0k.LJIIJ = new AwS556S0100000_12(this, 48);
        this.LLIZLLLIL = c765320U0k;
        this.LLJ = new ConcurrentHashMap<>();
        this.LLJIJIL = new ConcurrentHashMap<>();
        this.LLJILJIL = -995L;
        this.LLJILJILJ = new ConcurrentHashMap<>();
        this.LLJILLL = 1;
        this.LLJJ = new ConcurrentHashMap<>();
        this.LLJJIII = new ConcurrentHashSet<>();
        this.LLJJIJI = new ConcurrentHashSet<>();
        this.LLJJIJIIJIL = new CopyOnWriteArrayList<>();
        C0U33 c0u33 = new C0U33(c0u2y.LJIIJJI());
        this.LLJJJIL = c0u33;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        this.LLJJJJ = iInteractService;
        this.LLJJJJJIL = UserService.getInstance().user().getCurrentUserId();
        this.LLJL = new C0THK();
        this.LLJLIL = new InterfaceC914680ZuU() { // from class: X.0U1B
            @Override // X.InterfaceC914680ZuU
            public final void LIZ(boolean z) {
                AbstractC765580U1k abstractC765580U1kLJII2;
                AbstractC765580U1k abstractC765580U1kLJII3;
                String str;
                AbstractC765580U1k abstractC765580U1kLJII4;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Guest Online Listener: ");
                sbLIZ.append(z);
                sbLIZ.append(", ");
                InterfaceC1273910jFt interfaceC1273910jFtUs2 = this.LIZ.LLJJJJ.us2();
                if (interfaceC1273910jFtUs2 != null) {
                    abstractC765580U1kLJII2 = interfaceC1273910jFtUs2.LJII();
                } else {
                    abstractC765580U1kLJII2 = null;
                }
                sbLIZ.append(abstractC765580U1kLJII2);
                C20441214yg.LIZIZ("KaraokeMulti", C2188811AlT.LIZIZ(sbLIZ));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("Guest Online Listener: isOnline:");
                sbLIZ2.append(z);
                sbLIZ2.append(", audioFilterMgr:");
                InterfaceC1273910jFt interfaceC1273910jFtUs22 = this.LIZ.LLJJJJ.us2();
                if (interfaceC1273910jFtUs22 != null) {
                    abstractC765580U1kLJII3 = interfaceC1273910jFtUs22.LJII();
                } else {
                    abstractC765580U1kLJII3 = null;
                }
                sbLIZ2.append(abstractC765580U1kLJII3);
                C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ2));
                KaraokeViewModel karaokeViewModel = this.LIZ;
                karaokeViewModel.LL.LJIIJ.LIZIZ = z;
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(karaokeViewModel), C0PEM.LIZJ, null, new C097H(this.LIZ, null, z), 2);
                KaraokeViewModel karaokeViewModel2 = this.LIZ;
                karaokeViewModel2.LLJJJIL.LIZ = karaokeViewModel2.LL.LJIIJJI();
                if (z) {
                    InterfaceC1273910jFt interfaceC1273910jFtUs23 = this.LIZ.LLJJJJ.us2();
                    if (interfaceC1273910jFtUs23 != null && (abstractC765580U1kLJII4 = interfaceC1273910jFtUs23.LJII()) != null) {
                        KaraokeViewModel karaokeViewModel3 = this.LIZ;
                        karaokeViewModel3.IQ2().LJIIIZ(abstractC765580U1kLJII4, karaokeViewModel3.LL.LJIILIIL);
                    }
                    this.LIZ.IQ2().LJIIIIZZ = false;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("roleChange., repo.isCurrentSinger:");
                    sbLIZ3.append(this.LIZ.LL.LJIILIIL);
                    C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ3));
                    KaraokeViewModel karaokeViewModel4 = this.LIZ;
                    if (karaokeViewModel4.LL.LJIILIIL) {
                        C0U1H c0u1hIQ2 = karaokeViewModel4.IQ2();
                        c0u1hIQ2.LJII(c0u1hIQ2.LIZIZ, false);
                    }
                } else {
                    boolean zBooleanValue = ((Boolean) C764820TzM.LIZ(3).LIZIZ()).booleanValue();
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("finishmultiguest: ");
                    C0U22 c0u22 = C0U1G.LIZ;
                    if (c0u22 != null) {
                        str = c0u22.LIZJ;
                    } else {
                        str = null;
                    }
                    sbLIZ4.append(str);
                    C20441214yg.LIZIZ("karaokeLog", C2188811AlT.LIZIZ(sbLIZ4));
                    C0U1G.LIZLLL(5L, System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT), false, zBooleanValue);
                    ((LinkedHashMap) C0U1G.LJI).clear();
                    C0U1G.LIZ = null;
                    C0U1G.LIZJ = null;
                    this.LIZ.IQ2().LJIIIZ(null, true);
                    this.LIZ.IQ2().LJIIIIZZ();
                    this.LIZ.IQ2().LJIIIIZZ = true;
                    if (this.LIZ.IQ2().LJ) {
                        this.LIZ.IQ2().LJIIJ();
                    }
                    C0U2Y c0u2y2 = this.LIZ.LL;
                    Iterator it2 = Collections.list(c0u2y2.LJ.keys()).iterator();
                    while (it2.hasNext()) {
                        c0u2y2.LJFF(((Long) it2.next()).longValue(), AFwS245S0000000_12.get$arr$(250), AFwS245S0000000_12.get$arr$(251));
                    }
                    Iterator it3 = C13LP.LLIIII(((LinkedHashMap) c0u2y2.LJIIIIZZ.LJIIIIZZ()).keySet()).iterator();
                    while (it3.hasNext()) {
                        c0u2y2.LIZLLL((String) it3.next(), AFwS245S0000000_12.get$arr$(252), AFwS245S0000000_12.get$arr$(253));
                    }
                }
                C0U22 c0u22LJIIJJI = this.LIZ.IQ2().LJIIJJI();
                if (c0u22LJIIJJI != null) {
                    KaraokeViewModel karaokeViewModel5 = this.LIZ;
                    karaokeViewModel5.AQ2(new C764060Ty8(c0u22LJIIJJI, karaokeViewModel5.LL.LJIILIIL));
                }
                this.LIZ.AQ2(C764140TyG.LIZ);
            }
        };
        this.LLJLILLLLZIIL = iInteractService.aU0();
        this.LLJLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 49));
        this.LLJLLIL = new C765590U1l();
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C097N(this, null), 3);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DialogTypeChange: ");
        sbLIZ.append(EQ2());
        sbLIZ.append(", ");
        sbLIZ.append(iInteractService.aU0());
        C20441214yg.LIZIZ("KaraokeMulti", C2188811AlT.LIZIZ(sbLIZ));
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        dataChannelGlobal.CQ2(KaraokeStopEvent.class, this, new AwS591S0100000_12(this, 77));
        if (C763810Txj.LIZ(Integer.valueOf(c0u2y.LJIIJJI()))) {
            Object objGg0 = dataChannelGlobal.gg0(C930890aKd.class);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("LiveStream: ");
            sbLIZ2.append(objGg0 != null);
            C20441214yg.LIZIZ("KaraokeViewModel#LiveStreamListener", C2188811AlT.LIZIZ(sbLIZ2));
            dataChannelGlobal.DQ2(LiveStreamGlobalChannel.class, this, new AwS591S0100000_12(this, 33));
            IQ2().LJIIIIZZ = false;
        } else {
            if (iInteractService.ND(UserService.getInstance().user().LJIJJLI()) == C0JG7.GUEST_AUDIENCE) {
                c0u2y.LJIIJ.LIZIZ = true;
                c0u33.LIZ = c0u2y.LJIIJJI();
                InterfaceC1273910jFt interfaceC1273910jFtUs2 = iInteractService.us2();
                if (interfaceC1273910jFtUs2 != null && (abstractC765580U1kLJII = interfaceC1273910jFtUs2.LJII()) != null) {
                    IQ2().LJIIIZ(abstractC765580U1kLJII, c0u2y.LJIILIIL);
                }
                IQ2().LJIIIIZZ = false;
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new AnonymousClass0974(this, null), 2);
            }
            C0U1B c0u1b = this.LLJLIL;
            if (c0u1b != null) {
                iInteractService.ss2(c0u1b);
            }
        }
        this.LLJZIJLIL = -1L;
    }

    public final void AQ2(AbstractC764660Tz6 abstractC764660Tz6) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new AnonymousClass0976(this, abstractC764660Tz6, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object CQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof X.C0U1Z
            if (r0 == 0) goto L81
            r6 = r11
            X.0U1Z r6 = (X.C0U1Z) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L81
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r9 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r8 = 0
            r7 = 5
            r4 = 4
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 == r1) goto L40
            if (r0 == r2) goto L8f
            if (r0 == r3) goto L69
            if (r0 == r4) goto L75
            if (r0 != r7) goto L87
            X.C155000ia.LIZIZ(r9)
        L2f:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            X.C155000ia.LIZIZ(r9)
            X.0U2Y r0 = r10.LL
            r6.LLILLL = r1
            java.lang.Object r9 = r0.LJII(r8, r6)
            if (r9 != r5) goto L43
            return r5
        L40:
            X.C155000ia.LIZIZ(r9)
        L43:
            X.0U1v r9 = (X.C765690U1v) r9
            if (r9 != 0) goto L52
            X.0TzA r0 = new X.AbstractC764660Tz6() { // from class: X.0TzA
                static {
                    /*
                        X.0TzA r0 = new X.0TzA
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.0TzA) X.0TzA.LIZ X.0TzA
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C764700TzA.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C764700TzA.<init>():void");
                }
            }
            r6.LLILLL = r2
            java.lang.Object r0 = r10.zQ2(r0, r6)
            if (r0 != r5) goto L92
            return r5
        L52:
            java.util.List<X.0U22> r0 = r9.LIZJ
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L5e
            r10.LLJJJ = r1
        L5e:
            java.util.List<X.0U22> r0 = r9.LIZJ
            r6.LLILLL = r3
            java.lang.Object r0 = r10.kR2(r0, r8, r6)
            if (r0 != r5) goto L6c
            return r5
        L69:
            X.C155000ia.LIZIZ(r9)
        L6c:
            r6.LLILLL = r4
            java.lang.Object r0 = r10.PQ2(r6)
            if (r0 != r5) goto L78
            return r5
        L75:
            X.C155000ia.LIZIZ(r9)
        L78:
            r6.LLILLL = r7
            X.0TyX r0 = r10.iR2()
            if (r0 != r5) goto L2f
            return r5
        L81:
            X.0U1Z r6 = new X.0U1Z
            r6.<init>(r10, r11)
            goto L12
        L87:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8f:
            X.C155000ia.LIZIZ(r9)
        L92:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.CQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object DQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof X.C0U1V
            if (r0 == 0) goto L52
            r6 = r8
            X.0U1V r6 = (X.C0U1V) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r6.LLILZ
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L3a
            if (r0 != r3) goto L58
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            X.0U2Y r0 = r7.LL
            r6.LL = r7
            r6.LLILZ = r1
            java.lang.Object r5 = r0.LJIIJ(r6)
            if (r5 != r4) goto L38
            return r4
        L38:
            r2 = r7
            goto L3f
        L3a:
            com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel r2 = r6.LL
            X.C155000ia.LIZIZ(r5)
        L3f:
            java.util.List r5 = (java.util.List) r5
            X.0TyW r1 = new X.0TyW
            r1.<init>(r5)
            r0 = 0
            r6.LL = r0
            r6.LLILZ = r3
            java.lang.Object r0 = r2.zQ2(r1, r6)
            if (r0 != r4) goto L25
            return r4
        L52:
            X.0U1V r6 = new X.0U1V
            r6.<init>(r7, r8)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.DQ2(X.05Vn):java.lang.Object");
    }

    public final Integer FQ2(int i) {
        if (i != 1 && i != 2) {
            if (i != 4 || EQ2() == 0) {
                return null;
            }
            return Integer.valueOf(i);
        }
        if (EQ2() != 3 && EQ2() != 4) {
            return null;
        }
        return Integer.valueOf(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof X.C765480U1a
            if (r0 == 0) goto L41
            r4 = r6
            X.0U1a r4 = (X.C765480U1a) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L41
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r2 = 1
            if (r0 == 0) goto L2c
            if (r0 != r2) goto L47
            X.C155000ia.LIZIZ(r1)
        L22:
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<X.0U3Q> r0 = X.C0U3P.LIZ
            X.0U3Q r0 = X.C0U3Q.KARAOKE
            X.C0U3P.LIZLLL(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2c:
            X.C155000ia.LIZIZ(r1)
            r5.YQ2()
            X.0970 r1 = new X.0970
            r0 = 0
            r1.<init>(r0)
            r4.LLILLL = r2
            java.lang.Object r0 = r5.zQ2(r1, r4)
            if (r0 != r3) goto L22
            return r3
        L41:
            X.0U1a r4 = new X.0U1a
            r4.<init>(r5, r6)
            goto L12
        L47:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.MQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0038 A[LOOP:0: B:13:0x0032->B:15:0x0038, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object NQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.NQ2(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object PQ2(X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.PQ2(X.05Vn):java.lang.Object");
    }

    public final void cR2(C0U0N c0u0n) {
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C0U16(this, c0u0n, null), 3);
    }

    public final void eR2(boolean z) {
        this.LLJJJJLIIL = z;
        C765700U1w.LIZ = z;
        DataChannelGlobal.LLILZ.HQ2(KaraokeStateChannel.class, Boolean.valueOf(z));
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fR2(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C765520U1e
            if (r0 == 0) goto L5c
            r5 = r7
            X.0U1e r5 = (X.C765520U1e) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5c
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L28
            if (r0 == r1) goto L36
            if (r0 != r2) goto L62
            X.C155000ia.LIZIZ(r4)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r4)
            X.0U2Y r0 = r6.LL
            r5.LLILLL = r1
            java.lang.Object r4 = r0.LJJIIJZLJL(r1, r1, r5)
            if (r4 != r3) goto L39
            return r3
        L36:
            X.C155000ia.LIZIZ(r4)
        L39:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L6a
            r6.eR2(r1)
            r6.LLJJL = r1
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<X.0U3Q> r0 = X.C0U3P.LIZ
            X.0U3Q r0 = X.C0U3Q.KARAOKE
            X.C0U3P.LIZLLL(r0)
            X.0970 r1 = new X.0970
            r0 = 0
            r1.<init>(r0)
            r5.LLILLL = r2
            java.lang.Object r0 = r6.zQ2(r1, r5)
            if (r0 != r3) goto L25
            return r3
        L5c:
            X.0U1e r5 = new X.0U1e
            r5.<init>(r6, r7)
            goto L12
        L62:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.fR2(X.05Vn):java.lang.Object");
    }

    public final void mR2(C0U22 c0u22) {
        boolean z = IQ2().LJ;
        if (c0u22 == null) {
            this.LL.LJIL();
            return;
        }
        this.LL.LJIL();
        if (!z) {
            C0U2Y c0u2y = this.LL;
            long j = c0u22.LIZ;
            long jLJIIIIZZ = c0u22.LJIIIIZZ();
            c0u2y.getClass();
            c0u2y.LJJIIZI(j, jLJIIIIZZ, AFwS245S0000000_12.get$arr$(254));
            return;
        }
        C20441214yg.LIZIZ("karaoke_playstate: updatePlaying", "");
        C0U2Y c0u2y2 = this.LL;
        long j2 = c0u22.LIZ;
        long jLJIIIIZZ2 = c0u22.LJIIIIZZ();
        c0u2y2.LJIL();
        c0u2y2.LJJIIZI(j2, jLJIIIIZZ2, AFwS245S0000000_12.get$arr$(255));
    }

    public final void oR2(long j) {
        if (this.LLJILJIL != j) {
            if (j == -999) {
                this.LLIZ.LIZ(true);
            } else if (this.LLJILJIL == -999) {
                this.LLIZ.LIZ(false);
            }
        }
        this.LLILZLL.LIZLLL = j;
        this.LLJILJIL = j;
        C765320U0k c765320U0k = this.LLIZLLLIL;
        c765320U0k.LJIIIIZZ = j;
        if (j == -998 && c765320U0k.LIZLLL != 0) {
            c765320U0k.LJFF += c765320U0k.LIZLLL;
            c765320U0k.LIZLLL = 0L;
            C23250099c.LIZLLL(c765320U0k.LIZIZ, C0PEM.LIZJ, null, new C765360U0o(c765320U0k, null), 2);
        }
        if (c765320U0k.LJIIIIZZ == -994 && c765320U0k.LJ != 0) {
            c765320U0k.LJ = 0L;
            c765320U0k.LJIIJJI.clear();
            C23250099c.LIZLLL(c765320U0k.LIZIZ, C0PEM.LIZJ, null, new C765290U0h(c765320U0k, null), 2);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Current Tab Id: ");
        sbLIZ.append(this.LLJILJIL);
        C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void pause(boolean z) {
        if (IQ2().LJ && !z) {
            this.LLJJLIIIJLLLLLLLZ = true;
        }
        IQ2().LJIIL();
        C0U1G.LIZIZ(KQ2(), GQ2());
    }

    public final void wQ2(double d) {
        this.LLJLLIL.LIZ = d;
        AbstractC765580U1k abstractC765580U1k = IQ2().LIZJ;
        if (abstractC765580U1k != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("SetTone: ");
            sbLIZ.append(d);
            C20441214yg.LIZIZ("KaraokeMulti", C2188811AlT.LIZIZ(sbLIZ));
            abstractC765580U1k.LLJJJIL(d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        r0 = IQ2();
        r1 = r2.getAbsolutePath();
        r0.getClass();
        X.C20441214yg.LIZIZ("LiveApplog", "setTune");
        r0 = r0.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
    
        r0.LLJJIJIIJIL(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit xQ2(com.bytedance.android.livesdkapi.depend.model.LiveEffect r10) {
        /*
            r9 = this;
            java.lang.String r0 = r10.getFilePath()
            int r0 = r0.length()
            r8 = 0
            if (r0 != 0) goto L73
            r0 = 1
        Lc:
            java.lang.String r7 = "setTune"
            java.lang.String r6 = "LiveApplog"
            if (r0 == 0) goto L28
            X.0U1H r0 = r9.IQ2()
            r0.getClass()
            X.C20441214yg.LIZIZ(r6, r7)
            X.0U1k r1 = r0.LIZJ
            if (r1 == 0) goto L25
            java.lang.String r0 = ""
            r1.LLJJIJIIJIL(r0)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.0VSJ r1 = new X.0VSJ     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = r10.getFilePath()     // Catch: java.lang.Throwable -> L6e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L6e
            java.io.File[] r5 = r1.listFiles()     // Catch: java.lang.Throwable -> L6e
            if (r5 == 0) goto L25
            int r4 = r5.length     // Catch: java.lang.Throwable -> L6e
            r3 = 0
        L39:
            if (r3 >= r4) goto L25
            r2 = r5[r3]     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = r2.getName()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = "config.json"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L6e
            if (r0 != 0) goto L6b
            java.lang.String r1 = r2.getName()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r0 = ".json"
            boolean r0 = kotlin.text.u.LJIIZILJ(r1, r0, r8)     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L6b
            X.0U1H r0 = r9.IQ2()     // Catch: java.lang.Throwable -> L6e
            java.lang.String r1 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L6e
            r0.getClass()     // Catch: java.lang.Throwable -> L6e
            X.C20441214yg.LIZIZ(r6, r7)     // Catch: java.lang.Throwable -> L6e
            X.0U1k r0 = r0.LIZJ     // Catch: java.lang.Throwable -> L6e
            if (r0 == 0) goto L25
            r0.LLJJIJIIJIL(r1)     // Catch: java.lang.Throwable -> L6e
            goto L25
        L6b:
            int r3 = r3 + 1
            goto L39
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L25
        L73:
            r0 = 0
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.xQ2(com.bytedance.android.livesdkapi.depend.model.LiveEffect):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yQ2(X.C0U22 r7) {
        /*
            r6 = this;
            boolean r0 = r6.LLJJJ
            if (r0 != 0) goto L6c
            X.01wk r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r6)
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0Ty0 r0 = new X.0Ty0
            r1 = 0
            r0.<init>(r6, r1)
            r3 = 2
            X.C23250099c.LIZLLL(r4, r2, r1, r0, r3)
            r4 = 0
            r6.wQ2(r4)
            boolean r0 = r6.LLJJIJIL
            r4 = 1
            if (r0 != 0) goto L52
            com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.OptGoLiveBluetoothPermissionRequestSetting.INSTANCE
            boolean r0 = r0.enable()
            if (r0 == 0) goto L6d
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            X.006A r0 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            X.0IRl r0 = r0.getLiveAudioDevicesDetector()
            r0.getClass()
            boolean r2 = com.bytedance.android.livesdk.broadcast.utils.LiveAudioDevicesDetector.LJFF
        L37:
            if (r2 != 0) goto L50
            boolean r0 = X.C779680UiE.LIZIZ()
            if (r0 != 0) goto L50
            X.0TzC r2 = new X.0TzC
            r0 = 2131840647(0x7f114e87, float:1.931458E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            java.lang.String r0 = "pm_mt_LIVEKaraoke_LIVEhostPage_earphoneToast"
            r2.<init>(r1, r0)
            r6.AQ2(r2)
        L50:
            r6.LLJJIJIL = r4
        L52:
            X.0U36 r0 = r7.LJIIIZ
            int r1 = r0.LJ
            r0 = 3
            if (r1 == r0) goto L6c
            if (r1 == r3) goto L6c
            X.0TzC r2 = new X.0TzC
            r0 = 2131840658(0x7f114e92, float:1.9314602E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            java.lang.String r0 = "pm_mt_LIVEKaraoke_LIVEhostPage_noLyricsToast"
            r2.<init>(r1, r0)
            r6.AQ2(r2)
        L6c:
            return
        L6d:
            X.0UiC r0 = X.C779660UiC.LIZ
            boolean r0 = r0.LIZ()
            if (r0 != 0) goto L8f
            android.content.Context r2 = X.C497740JfY.LJII()
            if (r2 == 0) goto L81
            java.lang.String r0 = "audio"
            java.lang.Object r1 = X.C786410Ut5.H2(r2, r0)
        L81:
            boolean r0 = r1 instanceof android.media.AudioManager
            if (r0 == 0) goto La6
            android.media.AudioManager r1 = (android.media.AudioManager) r1
            if (r1 == 0) goto La6
            boolean r0 = r1.isWiredHeadsetOn()
            if (r0 == 0) goto La6
        L8f:
            r2 = 1
        L90:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "wired headset is connected: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "HeadsetUtil"
            X.C20441214yg.LJIIIZ(r0, r1)
            goto L37
        La6:
            r2 = 0
            goto L90
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.yQ2(X.0U22):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object BQ2(X.C0U22 r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.BQ2(X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b3 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OQ2(boolean r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C765500U1c
            if (r0 == 0) goto L94
            r4 = r11
            X.0U1c r4 = (X.C765500U1c) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r8 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r7 = 0
            r5 = 4
            r6 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L2f
            if (r0 == r1) goto La3
            if (r0 == r2) goto Lb4
            if (r0 == r6) goto L86
            if (r0 != r5) goto L9b
            X.C155000ia.LIZIZ(r8)
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r8)
            r9.eR2(r10)
            if (r10 == 0) goto L42
            X.0U2Y r0 = r9.LL
            r4.LLILLL = r1
            java.lang.Object r0 = r0.LJII(r7, r4)
            if (r0 != r3) goto La6
            return r3
        L42:
            boolean r1 = r9.KQ2()
            boolean r0 = r9.GQ2()
            X.C0U1G.LIZ(r1, r0)
            r9.YQ2()
            X.0U1H r0 = r9.IQ2()
            r0.LIZ()
            boolean r0 = r9.LLJJJJLIIL
            if (r0 == 0) goto L5d
            r9.LLJI = r7
        L5d:
            X.0U2Y r2 = r9.LL
            java.util.List<X.0Txp> r0 = r2.LJFF
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            r0.clear()
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, X.0U1v> r0 = r2.LJ
            r0.clear()
            X.0NmG<java.lang.String, X.0U1v> r1 = r2.LJIIIIZZ
            r0 = -1
            r1.LJIIIZ(r0)
            r2.LJJ()
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.util.concurrent.ConcurrentHashMap<java.lang.Long, kotlin.Pair<java.lang.Integer, java.lang.Integer>>> r0 = r9.LLJIJIL
            r0.clear()
            X.0Tyy r1 = r9.LLILZLL
            X.0Tz1 r0 = X.C764610Tz1.LIZ
            r4.LLILLL = r6
            java.lang.Object r0 = r1.LIZ(r0, r4)
            if (r0 != r3) goto L89
            return r3
        L86:
            X.C155000ia.LIZIZ(r8)
        L89:
            X.096z r0 = X.C23195096z.LIZ
            r4.LLILLL = r5
            java.lang.Object r0 = r9.zQ2(r0, r4)
            if (r0 != r3) goto L2c
            return r3
        L94:
            X.0U1c r4 = new X.0U1c
            r4.<init>(r9, r11)
            goto L12
        L9b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La3:
            X.C155000ia.LIZIZ(r8)
        La6:
            X.0970 r0 = new X.0970
            r0.<init>(r7)
            r4.LLILLL = r2
            java.lang.Object r0 = r9.zQ2(r0, r4)
            if (r0 != r3) goto Lb7
            return r3
        Lb4:
            X.C155000ia.LIZIZ(r8)
        Lb7:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.OQ2(boolean, X.05Vn):java.lang.Object");
    }

    public final Object QQ2(boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objZQ2;
        if (this.LL.LJIILL()) {
            if (z && this.LLJJJJLIIL && (!((CopyOnWriteArrayList) this.LL.LJFF).isEmpty())) {
                objZQ2 = zQ2(new AnonymousClass0970(false), interfaceC1364105Vn);
                if (objZQ2 != C099R.LJFF()) {
                    objZQ2 = Unit.LIZ;
                }
            } else {
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C097C(this, null, z), 2);
                objZQ2 = Unit.LIZ;
            }
            if (objZQ2 == C099R.LJFF()) {
                return objZQ2;
            }
            return Unit.LIZ;
        }
        Object objOQ2 = OQ2(z, interfaceC1364105Vn);
        if (objOQ2 == C099R.LJFF()) {
            return objOQ2;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object RQ2(boolean r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0U1W
            if (r0 == 0) goto L7c
            r3 = r9
            X.0U1W r3 = (X.C0U1W) r3
            int r2 = r3.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L7c
            int r2 = r2 - r1
            r3.LLILZ = r2
        L12:
            java.lang.Object r1 = r3.LLILLJJLI
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r3.LLILZ
            r5 = 3
            r4 = 2
            r6 = 1
            if (r0 == 0) goto L2b
            if (r0 == r6) goto L64
            if (r0 == r4) goto L98
            if (r0 != r5) goto L82
            X.C155000ia.LIZIZ(r1)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.0U1l r1 = r7.LLJLLIL
            X.0U2Y r0 = r7.LL
            int r0 = r0.LJIIJJI()
            r1.getClass()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = X.C763810Txj.LIZ(r0)
            if (r0 == 0) goto L61
            X.14i1<java.lang.Boolean> r1 = X.InterfaceC766480U4w.LJJLIIIJJI
        L45:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r1.LJFF(r0)
            X.0U2Y r0 = r7.LL
            boolean r0 = r0.LJIILL()
            if (r0 == 0) goto L8a
            X.0U2Y r0 = r7.LL
            r3.LL = r8
            r3.LLILZ = r6
            java.lang.Object r1 = r0.LJJIIJZLJL(r4, r8, r3)
            if (r1 != r2) goto L69
            return r2
        L61:
            X.14i1<java.lang.Boolean> r1 = X.InterfaceC766480U4w.LJJLIIJ
            goto L45
        L64:
            boolean r8 = r3.LL
            X.C155000ia.LIZIZ(r1)
        L69:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r0 = r1.booleanValue()
            if (r0 != 0) goto L8a
            X.0Tzo r0 = X.C765100Tzo.LIZ
            r3.LLILZ = r5
            java.lang.Object r0 = r7.zQ2(r0, r3)
            if (r0 != r2) goto L28
            return r2
        L7c:
            X.0U1W r3 = new X.0U1W
            r3.<init>(r7, r9)
            goto L12
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L8a:
            X.0TzE r0 = new X.0TzE
            r0.<init>(r8)
            r3.LLILZ = r4
            java.lang.Object r0 = r7.zQ2(r0, r3)
            if (r0 != r2) goto L9b
            return r2
        L98:
            X.C155000ia.LIZIZ(r1)
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.RQ2(boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object UQ2(X.C0U22 r11, X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof X.C0U1S
            if (r0 == 0) goto La7
            r4 = r12
            X.0U1S r4 = (X.C0U1S) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La7
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r1 = r4.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILLL
            r5 = 4
            r6 = 3
            r7 = 2
            r9 = 1
            if (r0 == 0) goto L2e
            if (r0 == r9) goto L73
            if (r0 == r7) goto L8d
            if (r0 == r6) goto L9b
            if (r0 != r5) goto Lae
            X.C155000ia.LIZIZ(r1)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r1)
            X.0U1H r0 = r10.IQ2()
            X.0U22 r0 = r0.LJIIJJI()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r11)
            if (r0 == 0) goto Lb6
            X.0U1H r0 = r10.IQ2()
            r0.LJIIL()
            boolean r1 = r10.KQ2()
            boolean r0 = r10.GQ2()
            X.C0U1G.LIZIZ(r1, r0)
            r10.lR2()
            X.0TzK r8 = new X.0TzK
            X.0U0R r2 = X.C0U0R.PAUSE
            X.0U1H r0 = r10.IQ2()
            X.0U22 r0 = r0.LJIIJJI()
            if (r0 == 0) goto L70
            long r0 = r0.LIZ
        L64:
            r8.<init>(r2, r0)
            r4.LLILLL = r9
            java.lang.Object r0 = r10.zQ2(r8, r4)
            if (r0 != r3) goto L76
            return r3
        L70:
            r0 = -1
            goto L64
        L73:
            X.C155000ia.LIZIZ(r1)
        L76:
            X.0TzC r2 = new X.0TzC
            r0 = 2131843287(0x7f1158d7, float:1.9319934E38)
            java.lang.String r1 = X.C497740JfY.LJIJI(r0)
            java.lang.String r0 = "pm_mt_multiKaraoke_guestScreen_songPausedToast"
            r2.<init>(r1, r0)
            r4.LLILLL = r7
            java.lang.Object r0 = r10.zQ2(r2, r4)
            if (r0 != r3) goto L90
            return r3
        L8d:
            X.C155000ia.LIZIZ(r1)
        L90:
            X.0TyG r0 = X.C764140TyG.LIZ
            r4.LLILLL = r6
            java.lang.Object r0 = r10.zQ2(r0, r4)
            if (r0 != r3) goto L9e
            return r3
        L9b:
            X.C155000ia.LIZIZ(r1)
        L9e:
            r4.LLILLL = r5
            java.lang.Object r0 = r10.PQ2(r4)
            if (r0 != r3) goto L2b
            return r3
        La7:
            X.0U1S r4 = new X.0U1S
            r4.<init>(r10, r12)
            goto L12
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb6:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.UQ2(X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ZQ2(X.C0U22 r10, X.InterfaceC1364105Vn<? super kotlin.Unit> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C0U1T
            if (r0 == 0) goto L82
            r5 = r11
            X.0U1T r5 = (X.C0U1T) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L82
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r6 = 3
            r7 = 2
            r8 = 1
            if (r0 == 0) goto L2b
            if (r0 == r8) goto L68
            if (r0 == r7) goto L76
            if (r0 != r6) goto L88
            X.C155000ia.LIZIZ(r1)
        L28:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            X.0U1H r0 = r9.IQ2()
            X.0U22 r0 = r0.LJIIJJI()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r10)
            if (r0 == 0) goto L90
            X.0U1H r2 = r9.IQ2()
            int r1 = r2.LIZIZ
            r0 = 0
            r2.LJII(r1, r0)
            r9.lR2()
            X.0TzK r3 = new X.0TzK
            X.0U0R r2 = X.C0U0R.PLAY
            X.0U1H r0 = r9.IQ2()
            X.0U22 r0 = r0.LJIIJJI()
            if (r0 == 0) goto L65
            long r0 = r0.LIZ
        L59:
            r3.<init>(r2, r0)
            r5.LLILLL = r8
            java.lang.Object r0 = r9.zQ2(r3, r5)
            if (r0 != r4) goto L6b
            return r4
        L65:
            r0 = -1
            goto L59
        L68:
            X.C155000ia.LIZIZ(r1)
        L6b:
            X.0TyG r0 = X.C764140TyG.LIZ
            r5.LLILLL = r7
            java.lang.Object r0 = r9.zQ2(r0, r5)
            if (r0 != r4) goto L79
            return r4
        L76:
            X.C155000ia.LIZIZ(r1)
        L79:
            r5.LLILLL = r6
            java.lang.Object r0 = r9.PQ2(r5)
            if (r0 != r4) goto L28
            return r4
        L82:
            X.0U1T r5 = new X.0U1T
            r5.<init>(r9, r11)
            goto L12
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.ZQ2(X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object aR2(int r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C0U1X
            if (r0 == 0) goto L51
            r5 = r8
            X.0U1X r5 = (X.C0U1X) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L51
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L30
            if (r0 != r2) goto L57
            java.lang.Object r1 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r6.LLJJIJI
            boolean r0 = r0.remove(r1)
            java.lang.Boolean.valueOf(r0)
        L2d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L30:
            X.C155000ia.LIZIZ(r4)
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.String> r1 = r6.LLJJ
            java.lang.Integer r0 = X.C2286608xc.LJ(r7)
            java.lang.Object r1 = r1.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L2d
            com.ss.android.ugc.effectmanager.common.ConcurrentHashSet<java.lang.String> r0 = r6.LLJJIJI
            r0.add(r1)
            r5.LL = r1
            r5.LLILZ = r2
            kotlin.Unit r0 = r6.bR2(r1, r7, r2)
            if (r0 != r3) goto L24
            return r3
        L51:
            X.0U1X r5 = new X.0U1X
            r5.<init>(r6, r8)
            goto L12
        L57:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.aR2(int, X.05Vn):java.lang.Object");
    }

    public final Object dR2(C0U0N c0u0n, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) throws Throwable {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sendAction: ");
        sbLIZ.append(c0u0n);
        C20441214yg.LIZIZ("KaraokeViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Object objLJIJI = this.LLILLJJLI.LJIJI(c0u0n, interfaceC1364105Vn);
        if (objLJIJI == C099R.LJFF()) {
            return objLJIJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gR2(X.C0U0N r8, X.InterfaceC1364105Vn<? super java.lang.Boolean> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C0U1U
            if (r0 == 0) goto L74
            r5 = r9
            X.0U1U r5 = (X.C0U1U) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L74
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r1 = r5.LL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r3 = 1
            if (r0 == 0) goto L27
            if (r0 != r3) goto L7a
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L27:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r6 = r8.LIZ()
            boolean r0 = kotlin.text.a0.LJJJIL(r6)
            r0 = r0 ^ 1
            if (r0 == 0) goto L46
            X.0THK r0 = r7.LLJL
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r0 = r0.LIZ
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L46
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L46:
            X.0THK r2 = r7.LLJL
            r2.getClass()
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "Interceptor: register: "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZ(r0)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Long> r2 = r2.LIZ
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.put(r6, r0)
            r5.LLILLL = r3
            java.lang.Object r0 = r7.dR2(r8, r5)
            if (r0 != r4) goto L22
            return r4
        L74:
            X.0U1U r5 = new X.0U1U
            r5.<init>(r7, r9)
            goto L12
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.gR2(X.0U0N, X.05Vn):java.lang.Object");
    }

    public final void nR2(int i, boolean z) {
        this.LLJILJILJ.put(Integer.valueOf(i), Boolean.valueOf(z));
        InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new AnonymousClass0977(this, null, z), 2);
    }

    public final Object zQ2(AbstractC764660Tz6 abstractC764660Tz6, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZ = this.LLILZIL.LIZ(abstractC764660Tz6, interfaceC1364105Vn);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ba A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object VQ2(X.EnumC765560U1i r12, X.C0U22 r13, X.InterfaceC1364105Vn<? super java.lang.Boolean> r14) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.VQ2(X.0U1i, X.0U22, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object WQ2(X.EnumC765560U1i r13, X.C0U22 r14, X.InterfaceC1364105Vn<? super java.lang.Boolean> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.WQ2(X.0U1i, X.0U22, X.05Vn):java.lang.Object");
    }

    public final Unit bR2(String str, int i, boolean z) {
        Boolean boolValueOf;
        AnonymousClass0956 anonymousClass0956;
        this.LLJJ.put(C2286608xc.LJ(i), str);
        AnonymousClass0956 anonymousClass09562 = this.LLJJI;
        if (anonymousClass09562 != null) {
            boolValueOf = Boolean.valueOf(anonymousClass09562.isActive());
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf) && (anonymousClass0956 = this.LLJJI) != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJJI = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C765020Tzg(str, this, i, z, null), 2);
        return Unit.LIZ;
    }

    public final void jR2(boolean z, boolean z2, boolean z3) {
        eR2(z);
        if (z) {
            this.LLJJL = z2;
            ConcurrentHashSet<C0U3Q> concurrentHashSet = C0U3P.LIZ;
            C0U3P.LIZLLL(C0U3Q.KARAOKE);
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C23192096w(this, null, z3), 3);
            return;
        }
        if (z2) {
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C23189096t(this, null), 3);
            return;
        }
        ConcurrentHashSet<C0U3Q> concurrentHashSet2 = C0U3P.LIZ;
        C0U3P.LJ(C0U3Q.KARAOKE);
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C23191096v(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object kR2(java.util.List<X.C0U22> r8, boolean r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof X.C0U1Y
            if (r0 == 0) goto L6a
            r6 = r10
            X.0U1Y r6 = (X.C0U1Y) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6a
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 1
            if (r0 == 0) goto L44
            if (r0 != r4) goto L70
            X.C155000ia.LIZIZ(r1)
        L22:
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "SongList Size after Update: "
            r1.append(r0)
            X.0U1H r0 = r7.IQ2()
            java.util.concurrent.CopyOnWriteArrayList<T extends X.0U23> r0 = r0.LIZ
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "KaraokeViewModel"
            X.C20441214yg.LIZIZ(r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L44:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = X.C13LP.LJJJLL(r8)
            X.0U22 r3 = (X.C0U22) r3
            X.0U2Y r2 = r7.LL
            if (r3 == 0) goto L68
            X.0U2X r0 = r3.LJIILLIIL
            if (r0 == 0) goto L68
            long r0 = r0.LIZIZ
            java.lang.Long r0 = X.C2286608xc.LJFF(r0)
        L5b:
            boolean r0 = r2.LJJIIJ(r0)
            r6.LLILLL = r4
            java.lang.Object r0 = r7.SQ2(r3, r0, r9, r6)
            if (r0 != r5) goto L22
            return r5
        L68:
            r0 = 0
            goto L5b
        L6a:
            X.0U1Y r6 = new X.0U1Y
            r6.<init>(r7, r10)
            goto L12
        L70:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.kR2(java.util.List, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024d  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object SQ2(X.C0U22 r10, boolean r11, boolean r12, X.InterfaceC1364105Vn r13) {
        /*
            Method dump skipped, instruction units count: 668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.SQ2(X.0U22, boolean, boolean, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0065 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object JQ2(X.C0U0I r8, java.lang.String r9, long r10, boolean r12, X.InterfaceC1364105Vn<? super kotlin.Unit> r13) {
        /*
            r7 = this;
            boolean r0 = r13 instanceof X.C0U1R
            if (r0 == 0) goto L76
            r5 = r13
            X.0U1R r5 = (X.C0U1R) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L76
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r6 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r3 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L3f
            if (r0 == r1) goto L54
            if (r0 == r2) goto L37
            if (r0 != r3) goto L7c
            java.lang.Object r9 = r5.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r6)
        L2c:
            kotlin.text.a0.LJJJIL(r9)
            X.0THK r0 = r7.LLJL
            r0.LIZ(r9)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L37:
            java.lang.Object r9 = r5.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r6)
            goto L2c
        L3f:
            X.C155000ia.LIZIZ(r6)
            if (r12 == 0) goto L66
            X.0Tzi r0 = new X.0Tzi
            r0.<init>(r8, r10)
            r5.LL = r9
            r5.LLILZ = r1
            java.lang.Object r0 = r7.zQ2(r0, r5)
            if (r0 != r4) goto L5b
            return r4
        L54:
            java.lang.Object r9 = r5.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r6)
        L5b:
            r5.LL = r9
            r5.LLILZ = r2
            java.lang.Object r0 = r7.PQ2(r5)
            if (r0 != r4) goto L2c
            return r4
        L66:
            X.0Tzr r0 = new X.0Tzr
            r0.<init>(r8, r10)
            r5.LL = r9
            r5.LLILZ = r3
            java.lang.Object r0 = r7.zQ2(r0, r5)
            if (r0 != r4) goto L2c
            return r4
        L76:
            X.0U1R r5 = new X.0U1R
            r5.<init>(r7, r13)
            goto L12
        L7c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel.JQ2(X.0U0I, java.lang.String, long, boolean, X.05Vn):java.lang.Object");
    }
}
