package com.bytedance.android.live.rank.impl.page.presentation;

import X.AnonymousClass0950;
import X.AnonymousClass0951;
import X.AnonymousClass0956;
import X.C01GW;
import X.C09IC;
import X.C09IR;
import X.C09R3;
import X.C0YT0;
import X.C0YUW;
import X.C1094290eaB;
import X.C1153310g7N;
import X.C1157760gEY;
import X.C1158180gFE;
import X.C1161920gLG;
import X.C13LE;
import X.C1556340qbQ;
import X.C1777150wLZ;
import X.C1777200wLe;
import X.C1777910wMn;
import X.C1777920wMo;
import X.C1777950wMr;
import X.C1778060wN2;
import X.C1778070wN3;
import X.C1781060wRs;
import X.C1781090wRv;
import X.C1781120wRy;
import X.C1781130wRz;
import X.C1783580wVw;
import X.C1785300wYi;
import X.C1785310wYj;
import X.C1785320wYk;
import X.C1785330wYl;
import X.C1785340wYm;
import X.C1785350wYn;
import X.C1785360wYo;
import X.C1785370wYp;
import X.C1785380wYq;
import X.C1785390wYr;
import X.C1785440wYw;
import X.C1785460wYy;
import X.C1785470wYz;
import X.C1785480wZ0;
import X.C1785490wZ1;
import X.C1785600wZC;
import X.C1785730wZP;
import X.C1785800wZW;
import X.C1785810wZX;
import X.C1785820wZY;
import X.C1785830wZZ;
import X.C1785860wZc;
import X.C1785910wZh;
import X.C1785920wZi;
import X.C1786080wZy;
import X.C1807670x8n;
import X.C1809320xBS;
import X.C1811420xEq;
import X.C1864870yd3;
import X.C1954807lC;
import X.C1BNE;
import X.C20441214yg;
import X.C2188811AlT;
import X.C2217381BqS;
import X.C2252321DDq;
import X.C2252331DDr;
import X.C23250099c;
import X.C452501pT;
import X.C497740JfY;
import X.C790300UzM;
import X.C860990Xq5;
import X.C861050XqB;
import X.C861060XqC;
import X.C861610Xr5;
import X.C861890XrX;
import X.C862790Xsz;
import X.C862840Xt4;
import X.C875090YUp;
import X.EnumC1778940wOS;
import X.EnumC1778950wOT;
import X.EnumC1785890wZf;
import X.EnumC1811400xEo;
import X.EnumC452301pR;
import X.InterfaceC1777220wLg;
import X.InterfaceC1781110wRx;
import X.InterfaceC1781190wS5;
import X.InterfaceC1785410wYt;
import X.InterfaceC1785530wZ5;
import X.InterfaceC1785610wZD;
import X.InterfaceC1785620wZE;
import X.InterfaceC2217461Bqa;
import X.InterfaceC346201Wa;
import X.InterfaceC875080YUo;
import android.os.SystemClock;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes28.dex */
public final class CreatorRankingPageViewModel extends ViewModel {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLLFZ;
    public final C2252321DDq LL;
    public final AnonymousClass0951 LLILLJJLI;
    public final InterfaceC346201Wa<InterfaceC1785620wZE> LLILLL;
    public final InterfaceC346201Wa<C861610Xr5> LLILZ;
    public final InterfaceC346201Wa<C1785480wZ0> LLILZIL;
    public final InterfaceC346201Wa<C1785470wYz> LLILZLL;
    public final InterfaceC346201Wa<InterfaceC1781190wS5> LLIZ;
    public final C2252331DDr LLIZLLLIL;
    public final AnonymousClass0950 LLJ;
    public final C2252321DDq LLJI;
    public final AnonymousClass0951 LLJIJIL;
    public final C2252321DDq LLJILJIL;
    public final AnonymousClass0951 LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final C2252321DDq LLJJI;
    public final C861050XqB LLJJIII;
    public long LLJJIJI;
    public long LLJJIJIIJIL;
    public int LLJJIJIL;
    public Integer LLJJJ;
    public Long LLJJJIL;
    public DataChannel LLJJJJ;
    public AnonymousClass0956 LLJJJJJIL;
    public AnonymousClass0956 LLJJJJLIIL;
    public final C01GW LLJJL;
    public final Set<C861890XrX> LLJJLIIIJLLLLLLLZ;
    public final Set<Long> LLJL;
    public long LLJLIL;
    public volatile C0YUW LLJLILLLLZIIL;
    public volatile C1781130wRz LLJLL;
    public volatile C1781060wRs LLJLLIL;
    public volatile C1785800wZW LLJLLL;
    public volatile C1785810wZX LLJZ;
    public volatile C1786080wZy LLJZIJLIL;
    public volatile C1785350wYn LLL;
    public volatile C1777200wLe LLLF;
    public volatile C1785340wYm LLLFF;
    public volatile C1094290eaB LLLFFI;

    public final C1777200wLe CQ2() {
        C1777200wLe c1777200wLe = this.LLLF;
        if (c1777200wLe == null) {
            synchronized (this) {
                c1777200wLe = this.LLLF;
                if (c1777200wLe == null) {
                    C1777200wLe c1777200wLe2 = (C1777200wLe) C1807670x8n.LJIIJ();
                    this.LLLF = c1777200wLe2;
                    return c1777200wLe2;
                }
            }
        }
        return c1777200wLe;
    }

    public final InterfaceC1785610wZD DQ2() {
        C1094290eaB c1094290eaB = this.LLLFFI;
        if (c1094290eaB == null) {
            synchronized (this) {
                c1094290eaB = this.LLLFFI;
                if (c1094290eaB == null) {
                    C1094290eaB c1094290eaB2 = (C1094290eaB) C1807670x8n.LJ();
                    this.LLLFFI = c1094290eaB2;
                    return c1094290eaB2;
                }
            }
        }
        return c1094290eaB;
    }

    public final C1785350wYn GQ2() {
        C1785350wYn c1785350wYn = this.LLL;
        if (c1785350wYn == null) {
            synchronized (this) {
                c1785350wYn = this.LLL;
                if (c1785350wYn == null) {
                    C1785350wYn c1785350wYn2 = (C1785350wYn) C1807670x8n.LJIIIIZZ((C0YUW) C1807670x8n.LIZLLL((C862840Xt4) C1807670x8n.LIZ(), (C875090YUp) C1807670x8n.LIZIZ(), (C1809320xBS) C1807670x8n.LIZJ()), (C1094290eaB) C1807670x8n.LJ(), (C1785440wYw) C1807670x8n.LJI());
                    this.LLL = c1785350wYn2;
                    return c1785350wYn2;
                }
            }
        }
        return c1785350wYn;
    }

    public final C1785340wYm HQ2() {
        C1785340wYm c1785340wYm = this.LLLFF;
        if (c1785340wYm == null) {
            synchronized (this) {
                c1785340wYm = this.LLLFF;
                if (c1785340wYm == null) {
                    C1785340wYm c1785340wYm2 = (C1785340wYm) C1807670x8n.LJIIJJI();
                    this.LLLFF = c1785340wYm2;
                    return c1785340wYm2;
                }
            }
        }
        return c1785340wYm;
    }

    public final InterfaceC875080YUo IQ2() {
        C0YUW c0yuw = this.LLJLILLLLZIIL;
        if (c0yuw == null) {
            synchronized (this) {
                c0yuw = this.LLJLILLLLZIIL;
                if (c0yuw == null) {
                    C0YUW c0yuw2 = (C0YUW) C1807670x8n.LIZLLL((C862840Xt4) C1807670x8n.LIZ(), (C875090YUp) C1807670x8n.LIZIZ(), (C1809320xBS) C1807670x8n.LIZJ());
                    this.LLJLILLLLZIIL = c0yuw2;
                    return c0yuw2;
                }
            }
        }
        return c0yuw;
    }

    public final C1781130wRz JQ2() {
        C1781130wRz c1781130wRz = this.LLJLL;
        if (c1781130wRz == null) {
            synchronized (this) {
                c1781130wRz = this.LLJLL;
                if (c1781130wRz == null) {
                    C1781130wRz c1781130wRz2 = (C1781130wRz) C1807670x8n.LJIIZILJ((C1785600wZC) C1807670x8n.LJIILLIIL((C1781060wRs) C1807670x8n.LJIJI(), (C1785830wZZ) C1807670x8n.LJIJJ(), (C1785820wZY) C1807670x8n.LJIJ()), (C1785360wYo) C1807670x8n.LJIILL((C1785860wZc) C1807670x8n.LJIIIZ(), (C1777950wMr) C1807670x8n.LJIILJJIL()), (C1781060wRs) C1807670x8n.LJIJI(), (C1158180gFE) C1807670x8n.LJIILIIL());
                    this.LLJLL = c1781130wRz2;
                    return c1781130wRz2;
                }
            }
        }
        return c1781130wRz;
    }

    public final C1781060wRs KQ2() {
        C1781060wRs c1781060wRs = this.LLJLLIL;
        if (c1781060wRs == null) {
            synchronized (this) {
                c1781060wRs = this.LLJLLIL;
                if (c1781060wRs == null) {
                    C1781060wRs c1781060wRs2 = (C1781060wRs) C1807670x8n.LJIJI();
                    this.LLJLLIL = c1781060wRs2;
                    return c1781060wRs2;
                }
            }
        }
        return c1781060wRs;
    }

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(CreatorRankingPageViewModel.class, "repository", "getRepository()Lcom/bytedance/android/live/rank/impl/page/domain/repository/CreatorRankingPageRepository;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(CreatorRankingPageViewModel.class, "resultReducer", "getResultReducer()Lcom/bytedance/android/live/rank/impl/page/presentation/reducer/CreatorRankingPageResultReducer;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(CreatorRankingPageViewModel.class, "tabMetaReducer", "getTabMetaReducer()Lcom/bytedance/android/live/rank/impl/page/presentation/reducer/CreatorRankingTabMetaReducer;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(CreatorRankingPageViewModel.class, "rankItemActionUseCase", "getRankItemActionUseCase()Lcom/bytedance/android/live/rank/impl/page/domain/usecase/CreatorRankingRankItemActionUseCase;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(CreatorRankingPageViewModel.class, "countdownReducer", "getCountdownReducer()Lcom/bytedance/android/live/rank/impl/page/presentation/reducer/CountdownReducer;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS6 = new C2217381BqS(CreatorRankingPageViewModel.class, "bottomBarActionUseCase", "getBottomBarActionUseCase()Lcom/bytedance/android/live/rank/impl/page/domain/usecase/CreatorRankingBottomBarActionUseCase;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS7 = new C2217381BqS(CreatorRankingPageViewModel.class, "matchRecommendCoordinator", "getMatchRecommendCoordinator()Lcom/bytedance/android/live/rank/impl/page/presentation/coordinator/CreatorRankingMatchRecommendCoordinator;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS8 = new C2217381BqS(CreatorRankingPageViewModel.class, "actionEffectMapper", "getActionEffectMapper()Lcom/bytedance/android/live/rank/impl/page/presentation/mapper/CreatorRankingActionEffectMapper;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS9 = new C2217381BqS(CreatorRankingPageViewModel.class, "rankRenderModelFactory", "getRankRenderModelFactory()Lcom/bytedance/android/live/rank/impl/page/presentation/mapper/CreatorRankingRankRenderModelFactory;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS10 = new C2217381BqS(CreatorRankingPageViewModel.class, "frequencyControlRepository", "getFrequencyControlRepository()Lcom/bytedance/android/live/rank/impl/page/domain/repository/FrequencyControlRepository;", 0);
        c09r3.getClass();
        LLLFZ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5, c2217381BqS6, c2217381BqS7, c2217381BqS8, c2217381BqS9, c2217381BqS10};
    }

    public final long AQ2() {
        C861890XrX c861890XrX = (C861890XrX) this.LLJI.getValue();
        if (c861890XrX != null) {
            return c861890XrX.LIZIZ;
        }
        return 0L;
    }

    public final int BQ2() {
        RankTypeV2 rankTypeV2;
        C861890XrX c861890XrX = (C861890XrX) this.LLJI.getValue();
        if (c861890XrX == null || (rankTypeV2 = c861890XrX.LIZ) == null) {
            return 0;
        }
        return rankTypeV2.rankPhase;
    }

    public final C1785490wZ1 EQ2() {
        return (C1785490wZ1) this.LLJJL.getValue();
    }

    public final long FQ2() {
        C1785300wYi c1785300wYi;
        C1153310g7N c1153310g7N;
        Long l;
        C1785320wYk c1785320wYk = ((C1785460wYy) this.LL.getValue()).LJ;
        return (c1785320wYk == null || (c1785300wYi = c1785320wYk.LIZLLL) == null || (c1153310g7N = c1785300wYi.LIZ) == null || (l = c1153310g7N.LIZ) == null) ? this.LLJJIJIIJIL : l.longValue();
    }

    public final boolean LQ2() {
        IInteractService iInteractService;
        return !this.LLJILLL || ((iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class)) != null && iInteractService.VD());
    }

    public final void NQ2() {
        C1785300wYi c1785300wYi;
        C1777910wMn c1777910wMn;
        C1777920wMo c1777920wMo;
        InterfaceC1777220wLg c1556340qbQ;
        C1785320wYk c1785320wYk = ((C1785460wYy) this.LL.getValue()).LJ;
        if (c1785320wYk == null || (c1785300wYi = c1785320wYk.LIZLLL) == null || (c1777910wMn = c1785300wYi.LJ) == null || (c1777920wMo = c1777910wMn.LIZIZ) == null) {
            return;
        }
        if (this.LLJZIJLIL == null) {
            synchronized (this) {
                if (this.LLJZIJLIL == null) {
                    this.LLJZIJLIL = (C1786080wZy) C1807670x8n.LJFF();
                }
            }
        }
        int i = c1777920wMo.LIZ;
        String str = c1777920wMo.LIZIZ;
        String str2 = c1777920wMo.LIZJ;
        User user = c1777910wMn.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resolve enter action=");
        sbLIZ.append(i);
        sbLIZ.append(" buttonType=");
        sbLIZ.append(str2);
        C20441214yg.LIZIZ("CreatorRankingBottomBarActionUseCase", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 1) {
            if (i != 2) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("resolve unsupported action=");
                sbLIZ2.append(i);
                sbLIZ2.append(" buttonType=");
                sbLIZ2.append(str2);
                C20441214yg.LJIIL("CreatorRankingBottomBarActionUseCase", C2188811AlT.LIZIZ(sbLIZ2));
                return;
            }
            c1556340qbQ = new C1777150wLZ(user);
        } else if (str == null) {
            return;
        } else {
            c1556340qbQ = new C1556340qbQ(str);
        }
        CQ2();
        this.LLIZLLLIL.LIZJ(C1777200wLe.LIZ(c1556340qbQ));
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        C861050XqB c861050XqB = this.LLJJIII;
        AnonymousClass0956 anonymousClass0956 = c861050XqB.LJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c861050XqB.LJ = null;
        EQ2().LIZIZ();
        super.onCleared();
    }

    public CreatorRankingPageViewModel() {
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(new C1785460wYy(0));
        this.LL = c2252321DDqLIZ;
        AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILLJJLI = anonymousClass0951LIZIZ;
        this.LLILLL = C09IC.LJIILL(new C1864870yd3(anonymousClass0951LIZIZ, 0));
        this.LLILZ = C09IC.LJIILL(new C1864870yd3(anonymousClass0951LIZIZ, 1));
        this.LLILZIL = C09IC.LJIILL(new C1864870yd3(anonymousClass0951LIZIZ, 2));
        this.LLILZLL = C09IC.LJIILL(new C1864870yd3(anonymousClass0951LIZIZ, 3));
        this.LLIZ = C09IC.LJIILL(new C1864870yd3(anonymousClass0951LIZIZ, 4));
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LLIZLLLIL = c2252331DDrLIZIZ;
        this.LLJ = C09IC.LIZ(c2252331DDrLIZIZ);
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(null);
        this.LLJI = c2252321DDqLIZ2;
        this.LLJIJIL = C09IC.LIZIZ(c2252321DDqLIZ2);
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(null);
        this.LLJILJIL = c2252321DDqLIZ3;
        this.LLJILJILJ = C09IC.LIZIZ(c2252321DDqLIZ3);
        this.LLJJI = C1BNE.LIZ(new C861060XqC(0));
        this.LLJJIII = new C861050XqB(ViewModelKt.getViewModelScope(this));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C860990Xq5(this, null), 3);
        this.LLJJL = C452501pT.LIZ(EnumC452301pR.NONE, new AwS571S0100000_27(this, 92));
        this.LLJJLIIIJLLLLLLLZ = new LinkedHashSet();
        this.LLJL = new LinkedHashSet();
    }

    public final void OQ2(C861890XrX c861890XrX) {
        C1785300wYi c1785300wYi;
        C1778070wN3 c1778070wN3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchToKey key=");
        sbLIZ.append(c861890XrX);
        C20441214yg.LIZIZ("CreatorRankingPageViewModel", C2188811AlT.LIZIZ(sbLIZ));
        Object value = this.LLJI.getValue();
        if (Intrinsics.LJFF(value, c861890XrX)) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("switchToKey old=");
        sbLIZ2.append(value);
        sbLIZ2.append(" new=");
        sbLIZ2.append(c861890XrX);
        C20441214yg.LIZIZ("CreatorRankingPageViewModel", C2188811AlT.LIZIZ(sbLIZ2));
        C1785320wYk c1785320wYk = ((C1785460wYy) this.LL.getValue()).LJ;
        if (c1785320wYk != null && (c1785300wYi = c1785320wYk.LIZLLL) != null && (c1778070wN3 = c1785300wYi.LIZLLL) != null) {
            this.LLJJLIIIJLLLLLLLZ.add(c1778070wN3.LIZIZ);
        }
        C2252321DDq c2252321DDq = this.LL;
        c2252321DDq.setValue(xQ2((C1785460wYy) c2252321DDq.getValue(), true));
        this.LLJI.setValue(c861890XrX);
        C861050XqB c861050XqB = this.LLJJIII;
        C861060XqC c861060XqC = (C861060XqC) c861050XqB.LIZJ.getValue();
        Long lLIZ = C861050XqB.LIZ(c861890XrX, c861060XqC.LIZJ.get(c861890XrX), c861060XqC, SystemClock.elapsedRealtime());
        c861050XqB.LIZJ.setValue(C861050XqB.LIZLLL(C861060XqC.LIZ(c861060XqC, c861890XrX, lLIZ, null, null, false, 28), c861890XrX, lLIZ));
        c861050XqB.LIZJ();
        C1785490wZ1 c1785490wZ1EQ2 = EQ2();
        c1785490wZ1EQ2.LJFF = Integer.valueOf(c861890XrX.LIZ.type);
        if (!c1785490wZ1EQ2.LJ) {
            c1785490wZ1EQ2.LIZIZ();
        } else {
            c1785490wZ1EQ2.LIZLLL();
        }
        C2252321DDq c2252321DDq2 = this.LLJILJIL;
        RankTypeV2 rankTypeV2 = c861890XrX.LIZ;
        int i = this.LLJJIJIL;
        Integer num = this.LLJJJ;
        long j = c861890XrX.LIZIZ;
        C1811420xEq c1811420xEq = EnumC1811400xEo.Companion;
        int i2 = rankTypeV2.group_type;
        c1811420xEq.getClass();
        c2252321DDq2.setValue(new C1157760gEY(rankTypeV2, C1811420xEq.LIZ(i2), i, num, j));
        PQ2(c861890XrX);
        AnonymousClass0956 anonymousClass0956 = this.LLJJJJLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJJJJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJJJJJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C862790Xsz(this, c861890XrX, null), 3);
    }

    public final void PQ2(C861890XrX c861890XrX) {
        C861890XrX c861890XrX2;
        boolean z;
        C1785460wYy c1785460wYyLIZ;
        C1785380wYq c1785380wYqLIZJ = ((C0YUW) IQ2()).LIZJ(c861890XrX);
        C2252321DDq c2252321DDq = this.LL;
        C1781130wRz c1781130wRzJQ2 = JQ2();
        C1785460wYy c1785460wYy = (C1785460wYy) this.LL.getValue();
        C1157760gEY c1157760gEY = (C1157760gEY) this.LLJILJIL.getValue();
        boolean z2 = this.LLJILLL;
        boolean z3 = this.LLJJ;
        C1785360wYo c1785360wYo = c1781130wRzJQ2.LIZIZ;
        c1785360wYo.getClass();
        if (!c1785460wYy.LIZLLL.LIZ) {
            c1785360wYo.LIZ.getClass();
            c1785460wYyLIZ = C1785460wYy.LIZ(c1785460wYy, new C1785920wZi(C1785860wZc.LIZ(EnumC1785890wZf.LOADING, null, false)), null, null, null, null, null, 62);
        } else {
            C1785320wYk c1785320wYk = c1785460wYy.LJ;
            if (c1785320wYk != null) {
                c861890XrX2 = c1785320wYk.LIZ;
            } else {
                c861890XrX2 = null;
            }
            if (Intrinsics.LJFF(c861890XrX2, c861890XrX) && (c1785460wYy.LJ.LIZIZ instanceof C1785390wYr)) {
                z = true;
            } else {
                z = false;
            }
            if (c1785380wYqLIZJ != null) {
                c1785460wYyLIZ = C1785460wYy.LIZ(c1785460wYy, C1785730wZP.LIZ, null, null, null, c1785360wYo.LIZ(c1785460wYy, c861890XrX, c1785360wYo.LIZIZ(c861890XrX, c1785380wYqLIZJ, true, null, z2), c1785380wYqLIZJ, c1157760gEY, z2, z3, true, null), null, 46);
            } else if (!z) {
                C1785730wZP c1785730wZP = C1785730wZP.LIZ;
                c1785360wYo.LIZ.getClass();
                c1785460wYyLIZ = C1785460wYy.LIZ(c1785460wYy, c1785730wZP, null, null, null, c1785360wYo.LIZ(c1785460wYy, c861890XrX, new C1785910wZh(C1785860wZc.LIZ(EnumC1785890wZf.LOADING, null, false)), null, c1157760gEY, z2, z3, false, null), null, 46);
            } else {
                c1785460wYyLIZ = C1785460wYy.LIZ(c1785460wYy, C1785730wZP.LIZ, null, null, null, null, null, 62);
            }
        }
        c2252321DDq.setValue(c1785460wYyLIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [X.0wN3, X.0wWQ, X.0wYj] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onEvent(X.InterfaceC1785520wZ4 r33) {
        /*
            Method dump skipped, instruction units count: 1898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel.onEvent(X.0wZ4):void");
    }

    public final void vQ2(C0YT0 c0yt0) {
        C1785460wYy c1785460wYy;
        C1785320wYk c1785320wYk;
        C1785390wYr c1785390wYr;
        Long l;
        Long l2;
        C861890XrX c861890XrX = c0yt0.LIZ;
        if (c861890XrX.LIZ.type != RankTypeV2.LJJIIZ.type || c861890XrX.LIZIZ == -1 || (c1785320wYk = (c1785460wYy = (C1785460wYy) this.LL.getValue()).LJ) == null || !Intrinsics.LJFF(c1785320wYk.LIZ, c861890XrX)) {
            return;
        }
        InterfaceC1785410wYt interfaceC1785410wYt = c1785320wYk.LIZIZ;
        if ((interfaceC1785410wYt instanceof C1785390wYr) && (c1785390wYr = (C1785390wYr) interfaceC1785410wYt) != null && (l = c1785320wYk.LIZLLL.LIZ.LIZ) != null) {
            long jLongValue = l.longValue();
            Long l3 = c1785320wYk.LIZLLL.LIZ.LIZIZ;
            if (l3 != null) {
                long jLongValue2 = l3.longValue();
                List<C1785370wYp> list = c1785390wYr.LIZIZ.LIZIZ.LIZ;
                if ((list instanceof Collection) && list.isEmpty()) {
                    return;
                }
                Iterator<C1785370wYp> it2 = list.iterator();
                while (it2.hasNext()) {
                    User user = it2.next().LIZ;
                    if (user != null && user.getId() == jLongValue) {
                        C1785310wYj c1785310wYj = c1785320wYk.LIZLLL.LIZJ;
                        if (c1785310wYj.LIZLLL && Intrinsics.LJFF(c1785310wYj.LIZ, c861890XrX) && (l2 = c1785310wYj.LIZIZ) != null && l2.longValue() == jLongValue) {
                            return;
                        }
                        C20441214yg.LIZIZ("CreatorRankingPageViewModel", "activateInitialFocusHighlight key=" + c861890XrX + " userId=" + jLongValue + " rank=" + jLongValue2);
                        this.LL.setValue(C1785460wYy.LIZ(c1785460wYy, null, null, null, null, C1785320wYk.LIZ(c1785320wYk, C1785300wYi.LIZ(c1785320wYk.LIZLLL, null, new C1785310wYj(c861890XrX, Long.valueOf(jLongValue), Long.valueOf(jLongValue2), true), null, 27)), null, 47));
                        AnonymousClass0956 anonymousClass0956 = this.LLJJJJLIIL;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        this.LLJJJJLIIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1785330wYl(this, c861890XrX, jLongValue, null), 3);
                        return;
                    }
                }
            }
        }
    }

    public final void yQ2(InterfaceC1781110wRx interfaceC1781110wRx) {
        if (!Intrinsics.LJFF(interfaceC1781110wRx, C1781120wRy.LIZ)) {
            if (interfaceC1781110wRx instanceof C790300UzM) {
                Iterator<InterfaceC1785530wZ5> it2 = ((C790300UzM) interfaceC1781110wRx).LIZ.iterator();
                while (it2.hasNext()) {
                    this.LLIZLLLIL.LIZJ(it2.next());
                }
                return;
            }
            if (interfaceC1781110wRx instanceof C1781090wRv) {
                C1781090wRv c1781090wRv = (C1781090wRv) interfaceC1781110wRx;
                this.LL.setValue(c1781090wRv.LIZ);
                Iterator<InterfaceC1785530wZ5> it3 = c1781090wRv.LIZIZ.iterator();
                while (it3.hasNext()) {
                    this.LLIZLLLIL.LIZJ(it3.next());
                }
                C1778060wN2 c1778060wN2 = c1781090wRv.LIZJ;
                if (c1778060wN2 != null) {
                    C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), null, null, new C1783580wVw(this, c1778060wN2, null), 3);
                    return;
                }
                return;
            }
            throw new C1954807lC();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03ea A[PHI: r0
      0x03ea: PHI (r0v108 java.util.List<X.0wPM>) = (r0v88 java.util.List<X.0wPM>), (r0v110 java.util.List<X.0wPM>) binds: [B:146:0x03e8, B:144:0x03e4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0406 A[PHI: r0
      0x0406: PHI (r0v107 java.util.List<X.0wPM>) = (r0v88 java.util.List<X.0wPM>), (r0v108 java.util.List<X.0wPM>) binds: [B:146:0x03e8, B:156:0x0411] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x054e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x05a1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0811 A[PHI: r12
      0x0811: PHI (r12v3 java.lang.Long) = (r12v2 java.lang.Long), (r12v5 java.lang.Long) binds: [B:325:0x0849, B:313:0x080f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:320:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0938  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x093c  */
    /* JADX WARN: Removed duplicated region for block: B:355:0x0947  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x04ed A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02b1  */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.0wZE] */
    /* JADX WARN: Type inference failed for: r11v11, types: [X.0wZE] */
    /* JADX WARN: Type inference failed for: r11v13, types: [X.0wZE] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [X.0wZ0] */
    /* JADX WARN: Type inference failed for: r12v1, types: [X.0wZ0] */
    /* JADX WARN: Type inference failed for: r12v11, types: [X.0wZ0] */
    /* JADX WARN: Type inference failed for: r12v6, types: [X.0wZ0] */
    /* JADX WARN: Type inference failed for: r12v9, types: [X.0wZ0] */
    /* JADX WARN: Type inference failed for: r13v10, types: [X.0wYz] */
    /* JADX WARN: Type inference failed for: r13v3, types: [X.0wYz] */
    /* JADX WARN: Type inference failed for: r13v7, types: [X.0wYz] */
    /* JADX WARN: Type inference failed for: r13v8, types: [X.0wYz] */
    /* JADX WARN: Type inference failed for: r14v1, types: [X.0Xr5] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.0Xr5] */
    /* JADX WARN: Type inference failed for: r14v5, types: [X.0Xr5] */
    /* JADX WARN: Type inference failed for: r14v9, types: [X.0Xr5] */
    /* JADX WARN: Type inference failed for: r15v1, types: [X.0wYk] */
    /* JADX WARN: Type inference failed for: r15v2, types: [X.0wYk] */
    /* JADX WARN: Type inference failed for: r15v7, types: [X.0wYk] */
    /* JADX WARN: Type inference failed for: r16v1, types: [X.0gAh] */
    /* JADX WARN: Type inference failed for: r16v2, types: [X.0gAh] */
    /* JADX WARN: Type inference failed for: r16v4, types: [X.0gAh] */
    /* JADX WARN: Type inference failed for: r16v5, types: [X.0gAh] */
    /* JADX WARN: Type inference failed for: r16v7, types: [X.0gAh] */
    /* JADX WARN: Type inference failed for: r24v8, types: [X.0Xr5, X.0gAh, X.0wYk, X.0wYz, X.0wZE] */
    /* JADX WARN: Type inference failed for: r26v1, types: [X.0wYq] */
    /* JADX WARN: Type inference failed for: r33v0, types: [X.0wZ0] */
    /* JADX WARN: Type inference failed for: r33v4, types: [X.0Xr5] */
    /* JADX WARN: Type inference failed for: r34v0, types: [X.0wYz] */
    /* JADX WARN: Type inference failed for: r34v4, types: [X.0wYk] */
    /* JADX WARN: Type inference failed for: r35v0, types: [X.0Xr5] */
    /* JADX WARN: Type inference failed for: r37v0, types: [X.0gAh] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r3v60, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v62, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r48v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r49v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r51v0, types: [X.0wOT] */
    /* JADX WARN: Type inference failed for: r52v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v4, types: [X.0wYo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.0wWQ, X.0wYj, java.lang.Long] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
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
    public final void zQ2(X.C0YT0 r59) {
        /*
            Method dump skipped, instruction units count: 2850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel.zQ2(X.0YT0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object MQ2(X.InterfaceC1778050wN1 r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1783600wVy
            if (r0 == 0) goto L6d
            r5 = r8
            X.0wVy r5 = (X.C1783600wVy) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6d
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L9a
            java.lang.Object r3 = r5.LL
            java.lang.String r3 = (java.lang.String) r3
            X.C155000ia.LIZIZ(r1)
        L26:
            r6.DQ2()
            boolean r0 = X.C1094290eaB.LJFF()
            if (r0 == 0) goto L73
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L32:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r7 instanceof X.C1778040wN0
            if (r0 != 0) goto L3c
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3c:
            X.0wN0 r7 = (X.C1778040wN0) r7
            int r0 = r7.LIZJ
            if (r0 == r2) goto L45
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L45:
            com.bytedance.android.livesdk.livesetting.rank.LiveFriendsRankMatchNotificationPanelConfigSetting r1 = com.bytedance.android.livesdk.livesetting.rank.LiveFriendsRankMatchNotificationPanelConfigSetting.INSTANCE
            boolean r0 = r1.isEnable()
            if (r0 != 0) goto L50
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L50:
            java.lang.String r3 = r1.getSettingsLink()
            r6.DQ2()
            boolean r0 = X.C1094290eaB.LJFF()
            if (r0 == 0) goto L60
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L60:
            r5.LL = r3
            r5.LLILZ = r2
            r0 = 967(0x3c7, double:4.78E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r5)
            if (r0 != r4) goto L26
            return r4
        L6d:
            X.0wVy r5 = new X.0wVy
            r5.<init>(r6, r8)
            goto L12
        L73:
            r6.DQ2()
            X.C1094290eaB.LJI()
            java.lang.Class<com.bytedance.android.livesdkapi.host.IHostAction> r0 = com.bytedance.android.livesdkapi.host.IHostAction.class
            X.006A r1 = X.C1161920gLG.LIZJ(r0)
            com.bytedance.android.livesdkapi.host.IHostAction r1 = (com.bytedance.android.livesdkapi.host.IHostAction) r1
            if (r1 == 0) goto L98
            java.lang.String r0 = "live_inner_push"
            int r0 = r1.getCachedSettingItemStatus(r0)
            if (r0 != r2) goto L98
        L8b:
            X.1DDr r1 = r6.LLIZLLLIL
            X.0Xtz r0 = new X.0Xtz
            r0.<init>(r2, r3)
            r1.LIZJ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L98:
            r2 = 0
            goto L8b
        L9a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.rank.impl.page.presentation.CreatorRankingPageViewModel.MQ2(X.0wN1, X.05Vn):java.lang.Object");
    }

    public final C1785460wYy wQ2(C1785460wYy c1785460wYy, C861060XqC c861060XqC) {
        Long lValueOf;
        boolean z;
        boolean z2;
        String strLIZIZ;
        String strLIZIZ2;
        boolean z3;
        boolean z4;
        boolean z5;
        long jLongValue;
        int iIntValue;
        String strValueOf;
        char c;
        String strValueOf2;
        String strValueOf3;
        char c2;
        String strValueOf4;
        String strValueOf5;
        RankTypeV2 rankTypeV2;
        if (this.LLJZ == null) {
            synchronized (this) {
                if (this.LLJZ == null) {
                    this.LLJZ = (C1785810wZX) C1807670x8n.LJIIL();
                }
            }
        }
        C861890XrX c861890XrX = c861060XqC.LIZ;
        Long l = c861060XqC.LIZIZ;
        Integer numValueOf = null;
        if (l != null) {
            long jLongValue2 = l.longValue();
            if (jLongValue2 < 0) {
                jLongValue2 = 0;
            }
            lValueOf = Long.valueOf(jLongValue2);
        } else {
            lValueOf = null;
        }
        if (c861890XrX != null && (rankTypeV2 = c861890XrX.LIZ) != null) {
            numValueOf = Integer.valueOf(rankTypeV2.type);
        }
        if (numValueOf != null && lValueOf != null) {
            z = true;
        } else {
            z = false;
        }
        if (c1785460wYy.LIZIZ.LIZ.size() > 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z) {
            strLIZIZ = "";
        } else {
            if (lValueOf != null) {
                jLongValue = lValueOf.longValue();
            } else {
                jLongValue = 0;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            if (jLongValue < 0) {
                jLongValue = 0;
            }
            if (iIntValue == RankTypeV2.LIZ.type) {
                long j = jLongValue % ((long) 3600);
                long j2 = 60;
                long j3 = j / j2;
                long j4 = j % j2;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                if (j3 < 10) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    c2 = '0';
                    sbLIZ2.append('0');
                    sbLIZ2.append(j3);
                    strValueOf4 = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    c2 = '0';
                    strValueOf4 = String.valueOf(j3);
                }
                sbLIZ.append(strValueOf4);
                sbLIZ.append(':');
                if (j4 < 10) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(c2);
                    sbLIZ3.append(j4);
                    strValueOf5 = C2188811AlT.LIZIZ(sbLIZ3);
                } else {
                    strValueOf5 = String.valueOf(j4);
                }
                sbLIZ.append(strValueOf5);
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            } else {
                long j5 = 86400;
                long j6 = jLongValue / j5;
                long j7 = jLongValue % j5;
                long j8 = 3600;
                long j9 = j7 / j8;
                long j10 = j7 % j8;
                long j11 = 60;
                long j12 = j10 / j11;
                long j13 = j10 % j11;
                if (j6 > 1) {
                    strLIZIZ = C497740JfY.LJIJJ(2131843902, Long.valueOf(j6));
                } else {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    if (j9 < 10 && j6 <= 0) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append('0');
                        sbLIZ5.append(j9);
                        strValueOf = C2188811AlT.LIZIZ(sbLIZ5);
                    } else {
                        strValueOf = String.valueOf(j9 + ((j6 * j5) / j8));
                    }
                    sbLIZ4.append(strValueOf);
                    sbLIZ4.append(':');
                    if (j12 < 10) {
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        c = '0';
                        sbLIZ6.append('0');
                        sbLIZ6.append(j12);
                        strValueOf2 = C2188811AlT.LIZIZ(sbLIZ6);
                    } else {
                        c = '0';
                        strValueOf2 = String.valueOf(j12);
                    }
                    sbLIZ4.append(strValueOf2);
                    sbLIZ4.append(':');
                    if (j13 < 10) {
                        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                        sbLIZ7.append(c);
                        sbLIZ7.append(j13);
                        strValueOf3 = C2188811AlT.LIZIZ(sbLIZ7);
                    } else {
                        strValueOf3 = String.valueOf(j13);
                    }
                    sbLIZ4.append(strValueOf3);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
                }
            }
        }
        if (strLIZIZ.length() <= 0) {
            strLIZIZ2 = "";
        } else {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(C497740JfY.LJIJI(2131844593));
            sbLIZ8.append(' ');
            sbLIZ8.append(strLIZIZ);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ8);
        }
        C1785480wZ0 c1785480wZ0 = c1785460wYy.LIZIZ;
        if (c1785480wZ0.LJIIJ == EnumC1778940wOS.CURRENT_PERIOD) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (c1785460wYy.LIZJ.LJII == EnumC1778950wOT.CURRENT_PERIOD) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean z6 = false;
        if (z3 && !z2 && z) {
            z5 = true;
        } else {
            z5 = false;
            if (!z3 || z2 || !z) {
                strLIZIZ = "";
            }
        }
        C1785480wZ0 c1785480wZ0LIZ = C1785480wZ0.LIZ(c1785480wZ0, null, 0, null, false, false, null, 0, z5, strLIZIZ, false, null, false, null, 7807);
        C1785470wYz c1785470wYz = c1785460wYy.LIZJ;
        if (z4 && z2 && z) {
            z6 = true;
        } else if (!z4 || !z2 || !z) {
            strLIZIZ2 = "";
        }
        return C1785460wYy.LIZ(c1785460wYy, null, c1785480wZ0LIZ, C1785470wYz.LIZ(c1785470wYz, null, 0, null, false, z6, strLIZIZ2, false, null, null, 463), null, null, null, 57);
    }

    public final C1785460wYy xQ2(C1785460wYy c1785460wYy, boolean z) {
        C1778070wN3 c1778070wN3;
        C1785320wYk c1785320wYk = c1785460wYy.LJ;
        if (c1785320wYk == null || (c1778070wN3 = c1785320wYk.LIZLLL.LIZLLL) == null) {
            return c1785460wYy;
        }
        if (this.LLJL.remove(Long.valueOf(c1778070wN3.LIZ)) && z) {
            this.LLJJJIL = null;
        }
        return C1785460wYy.LIZ(c1785460wYy, null, null, null, null, C1785320wYk.LIZ(c1785320wYk, C1785300wYi.LIZ(c1785320wYk.LIZLLL, null, null, null, 23)), null, 47);
    }
}
