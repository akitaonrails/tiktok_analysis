package X;

import Y.ARunnableS119S0100000_19;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.friendstab.ui.feed.panel.viewmodel.FriendsV3FeedListViewModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS385S0200000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0hpO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1219040hpO implements InterfaceC1603360rpG, C0PDP, InterfaceC1219090hpT {
    public final C2189821An6 LL;
    public FriendsV3FeedListViewModel LLILLL;
    public InterfaceC1209780haS LLILZ;
    public Fragment LLILZIL;
    public volatile boolean LLILZLL;
    public C1219030hpN LLIZ;
    public volatile boolean LLIZLLLIL;
    public AnonymousClass0956 LLJI;
    public C1219060hpQ LLJIJIL;
    public List<? extends Aweme> LLJILJIL;
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(740));
    public final Set<String> LLJ = new LinkedHashSet();

    @Override // X.InterfaceC1603360rpG
    public final /* synthetic */ boolean cannotLoadLatest() {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean deleteItem(String str) {
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final int getPageType(int i) {
        return 31;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1219030hpN LIZIZ() {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219040hpO.LIZIZ():X.0hpN");
    }

    public final boolean LIZLLL() {
        return ((Boolean) this.LLILLJJLI.getValue()).booleanValue();
    }

    public final boolean LJ() throws Throwable {
        Object c098200Yq;
        FriendsV3FeedListViewModel friendsV3FeedListViewModel = this.LLILLL;
        if (friendsV3FeedListViewModel == null) {
            return false;
        }
        try {
            friendsV3FeedListViewModel.getState();
            c098200Yq = Boolean.TRUE;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (!(thM5exceptionOrNullimpl instanceof C738120SxO)) {
                throw thM5exceptionOrNullimpl;
            }
            c098200Yq = Boolean.FALSE;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1603360rpG
    public final boolean isLoading() {
        Object c098200Yq;
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if ((anonymousClass0956 != null && anonymousClass0956.isActive()) || this.LLILZLL) {
            return true;
        }
        FriendsV3FeedListViewModel friendsV3FeedListViewModel = this.LLILLL;
        if (friendsV3FeedListViewModel != null && friendsV3FeedListViewModel.CQ2()) {
            try {
                C1223430hwT c1223430hwT = (C1223430hwT) friendsV3FeedListViewModel.getState();
                c1223430hwT.getClass();
                c098200Yq = Boolean.valueOf(c1223430hwT.getListState().LLILLJJLI instanceof C1623706Xj);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Boolean bool = Boolean.FALSE;
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = bool;
            }
            if (((Boolean) c098200Yq).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC1603360rpG
    public final void unInit() {
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJI = null;
        this.LLIZ = null;
        this.LLIZLLLIL = false;
        this.LLJ.clear();
        C07N3.LIZ = C13BV.INSTANCE;
        C07N3.LIZIZ = C08CX.INSTANCE;
        Set<String> set = C0T54.LIZ;
        synchronized (set) {
            try {
                set.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LLJIJIL = null;
        this.LLJILJIL = null;
        this.LLILZ = null;
        this.LLILLL = null;
        this.LLILZIL = null;
        this.LLILZLL = false;
    }

    public final void LJFF() {
        AbstractC1588120rQg abstractC1588120rQg;
        Fragment fragment;
        C1219030hpN c1219030hpNLIZIZ = LIZIZ();
        if (c1219030hpNLIZIZ == null || (abstractC1588120rQg = c1219030hpNLIZIZ.LIZJ) == null || !LIZ(c1219030hpNLIZIZ) || this.LLILZLL || (fragment = this.LLILZIL) == null) {
            return;
        }
        this.LLILZLL = true;
        C2487409ou.LIZJ(new ARunnableS119S0100000_19(this, 179));
        AnonymousClass0956 anonymousClass0956 = this.LLJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLJI = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C1219020hpM(abstractC1588120rQg, c1219030hpNLIZIZ, this, null), 3);
    }

    @Override // X.InterfaceC1219090hpT
    public final boolean LJIIJJI() {
        return !cannotLoadMore();
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean cannotLoadMore() throws Throwable {
        Object c098200Yq;
        if (!LIZLLL() || this.LLILLL == null) {
            return true;
        }
        if (this.LLIZLLLIL) {
            return !LIZ(this.LLIZ);
        }
        FriendsV3FeedListViewModel friendsV3FeedListViewModel = this.LLILLL;
        boolean z = friendsV3FeedListViewModel != null && friendsV3FeedListViewModel.CQ2();
        if (!LJ() || !z) {
            return !LIZ(LIZIZ());
        }
        if (this.LLILLL == null) {
            return true;
        }
        try {
            c098200Yq = Boolean.valueOf(!LJI(r0));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (!(thM5exceptionOrNullimpl instanceof C738120SxO)) {
                throw thM5exceptionOrNullimpl;
            }
            c098200Yq = Boolean.valueOf(!LIZ(LIZIZ()));
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5 A[PHI: r1
      0x00b5: PHI (r1v8 java.util.ArrayList) = (r1v5 java.util.ArrayList), (r1v10 java.util.ArrayList) binds: [B:42:0x0099, B:37:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C0PDP
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.ss.android.ugc.aweme.feed.model.Aweme> getAwemeList() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1219040hpO.getAwemeList():java.util.List");
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean isDataEmpty() throws Throwable {
        List<Aweme> awemeList = getAwemeList();
        return awemeList == null || awemeList.isEmpty();
    }

    @Override // X.InterfaceC1603360rpG
    public final Object getViewModel() {
        return this.LLILLL;
    }

    public C1219040hpO(C2189821An6 c2189821An6) {
        this.LL = c2189821An6;
    }

    public static boolean LIZ(C1219030hpN c1219030hpN) {
        if (c1219030hpN == null) {
            return false;
        }
        if (!c1219030hpN.LJ && c1219030hpN.LIZJ == null) {
            return false;
        }
        return true;
    }

    public static List LIZJ(C1223430hwT c1223430hwT) {
        Aweme awemeLIZIZ;
        c1223430hwT.getClass();
        List<InterfaceC1361290lWp> list = c1223430hwT.getListState().LLILZ;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1361290lWp interfaceC1361290lWp : list) {
                if (interfaceC1361290lWp instanceof InterfaceC1361270lWn) {
                    arrayList.add(interfaceC1361290lWp);
                }
            }
            ArrayList<InterfaceC1361270lWn> arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                Aweme aweme = ((C0OB8) obj).getAweme();
                if (aweme == null || (!C817650W5r.LIZ(aweme) && aweme.getAwemeType() != 101)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (InterfaceC1361270lWn interfaceC1361270lWn : arrayList2) {
                String strLIZ = C1588110rQf.LIZ(interfaceC1361270lWn);
                arrayList3.add(strLIZ);
                if (interfaceC1361270lWn instanceof InterfaceC1357880lRK) {
                    arrayList4.add(strLIZ);
                }
                Aweme aweme2 = interfaceC1361270lWn.getAweme();
                if (C729510SjV.LJJIJIL(aweme2) && (awemeLIZIZ = C1588330rR1.LIZIZ(aweme2.getAid())) != null) {
                    aweme2 = awemeLIZIZ;
                }
                arrayList5.add(aweme2);
            }
            LJIIIIZZ(arrayList3, arrayList4);
            return arrayList5;
        }
        C13BV c13bv = C13BV.INSTANCE;
        LJIIIIZZ(c13bv, c13bv);
        return c13bv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LJI(FriendsV3FeedListViewModel friendsV3FeedListViewModel) {
        Boolean boolValueOf;
        boolean zBooleanValue;
        boolean z;
        C1223430hwT c1223430hwT = (C1223430hwT) friendsV3FeedListViewModel.getState();
        c1223430hwT.getClass();
        C626160OhC c626160OhCLIZ = c1223430hwT.getListState().LLILLJJLI.LIZ();
        Boolean boolValueOf2 = null;
        if (c626160OhCLIZ != null) {
            boolValueOf = Boolean.valueOf(c626160OhCLIZ.LIZIZ);
        } else {
            boolValueOf = null;
        }
        C626160OhC c626160OhCLIZ2 = c1223430hwT.getListState().LL.LIZ();
        if (c626160OhCLIZ2 != null) {
            boolValueOf2 = Boolean.valueOf(c626160OhCLIZ2.LIZIZ);
        }
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else if (boolValueOf2 != null) {
            zBooleanValue = boolValueOf2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (friendsV3FeedListViewModel.LLJ != null) {
            z = true;
        } else {
            z = false;
        }
        if (!zBooleanValue && !z) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJII(FriendsV3FeedListViewModel friendsV3FeedListViewModel) {
        Object c098200Yq;
        ArrayList arrayList;
        boolean z;
        if (!LIZLLL()) {
            return;
        }
        boolean z2 = true;
        List<String> list = null;
        try {
            C1223430hwT c1223430hwT = (C1223430hwT) friendsV3FeedListViewModel.getState();
            AbstractC1588120rQg abstractC1588120rQg = friendsV3FeedListViewModel.LLJ;
            List<String> list2 = c1223430hwT.LLIZ;
            if (list2 != null) {
                arrayList = new ArrayList(list2);
            } else {
                arrayList = null;
            }
            C626160OhC c626160OhCLIZ = c1223430hwT.getListState().LLILLJJLI.LIZ();
            if (c626160OhCLIZ != null) {
                z = c626160OhCLIZ.LIZIZ;
            } else {
                C626160OhC c626160OhCLIZ2 = c1223430hwT.getListState().LL.LIZ();
                if (c626160OhCLIZ2 != null) {
                    z = c626160OhCLIZ2.LIZIZ;
                } else {
                    z = false;
                }
            }
            C1219060hpQ c1219060hpQ = new C1219060hpQ(abstractC1588120rQg, arrayList, z);
            if (!z && abstractC1588120rQg != null) {
                c1219060hpQ = new C1219060hpQ(abstractC1588120rQg, arrayList, true);
            }
            this.LLJIJIL = c1219060hpQ;
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            if (thM5exceptionOrNullimpl instanceof C738120SxO) {
                AbstractC1588120rQg abstractC1588120rQg2 = friendsV3FeedListViewModel.LLJ;
                if (abstractC1588120rQg2 != null) {
                    C1219060hpQ c1219060hpQ2 = this.LLJIJIL;
                    if (c1219060hpQ2 != null) {
                        list = c1219060hpQ2.LIZIZ;
                        z2 = c1219060hpQ2.LIZJ;
                    }
                    this.LLJIJIL = new C1219060hpQ(abstractC1588120rQg2, list, z2);
                    return;
                }
                return;
            }
            C0W17.LIZIZ("DetailFriendsV3Operator", thM5exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1603360rpG
    public final void bindView(InterfaceC1209780haS interfaceC1209780haS) {
        Object c098200Yq;
        Object c098200Yq2;
        this.LLILZ = interfaceC1209780haS;
        FriendsV3FeedListViewModel friendsV3FeedListViewModel = this.LLILLL;
        if (friendsV3FeedListViewModel == null) {
            return;
        }
        Fragment fragment = this.LLILZIL;
        if (fragment == null) {
            try {
                c098200Yq = interfaceC1209780haS.getFragment();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            fragment = (Fragment) c098200Yq;
            if (fragment == null) {
                return;
            }
        }
        friendsV3FeedListViewModel.asyncSubscribe(new C2217381BqS() { // from class: X.0hpR
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC636270OxV) obj).getRefreshState();
            }
        }, fragment, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, StrategyCenter.ENABLE_SMART_SERVICE), new AwS563S0100000_19(this, 3166), new AwS385S0200000_19(this, friendsV3FeedListViewModel, 122));
        friendsV3FeedListViewModel.asyncSubscribe(new C2217381BqS() { // from class: X.0hpS
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((InterfaceC636270OxV) obj).getLoadMoreState();
            }
        }, fragment, C736820SvI.LIZLLL(), new AwS598S0100000_19(this, 809), new AwS563S0100000_19(this, 3167), new AwS385S0200000_19(this, friendsV3FeedListViewModel, 123));
        try {
            this.LLJILJIL = LIZJ((C1223430hwT) friendsV3FeedListViewModel.getState());
            LJII(friendsV3FeedListViewModel);
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl != null && !(thM5exceptionOrNullimpl instanceof C738120SxO)) {
            C0W17.LIZIZ("DetailFriendsV3Operator", thM5exceptionOrNullimpl);
        }
    }

    @Override // X.InterfaceC1603360rpG
    public final boolean init(Fragment fragment) {
        FriendsV3FeedListViewModel friendsV3FeedListViewModel;
        this.LLILZIL = fragment;
        if (LIZLLL()) {
            AssemViewModel assemViewModel = C1603960rqE.LIZJ;
            if (assemViewModel instanceof FriendsV3FeedListViewModel) {
                friendsV3FeedListViewModel = (FriendsV3FeedListViewModel) assemViewModel;
            } else {
                friendsV3FeedListViewModel = null;
            }
            this.LLILLL = friendsV3FeedListViewModel;
            if (friendsV3FeedListViewModel != null) {
                C1603960rqE.LIZJ = null;
                Aweme awemeLIZ = C711950RwH.LIZ(this.LL.getAid());
                if (awemeLIZ != null && C817650W5r.LIZ(awemeLIZ)) {
                    this.LLILLL = null;
                }
            }
        }
        return true;
    }

    public static void LJIIIIZZ(List list, Collection collection) {
        C07N3.LIZ = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj : collection) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        C07N3.LIZIZ = C13LP.LLIIJI(arrayList);
        Set<String> set = C0T54.LIZ;
        Set<String> set2 = C07N3.LIZIZ;
        Set<String> set3 = C0T54.LIZ;
        synchronized (set3) {
            try {
                set3.clear();
                for (String str : set2) {
                    if (str.length() > 0) {
                        C0T54.LIZ.add(str);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1603360rpG
    public final void request(int i, C2189821An6 c2189821An6, int i2, boolean z) throws Throwable {
        FriendsV3FeedListViewModel friendsV3FeedListViewModel;
        boolean z2;
        FriendsV3FeedListViewModel friendsV3FeedListViewModel2;
        if (LIZLLL() && (friendsV3FeedListViewModel = this.LLILLL) != null) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 4) {
                        boolean zLJ = LJ();
                        FriendsV3FeedListViewModel friendsV3FeedListViewModel3 = this.LLILLL;
                        if (friendsV3FeedListViewModel3 != null && friendsV3FeedListViewModel3.CQ2()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (this.LLIZLLLIL) {
                            LJFF();
                            return;
                        }
                        if (zLJ && z2) {
                            FriendsV3FeedListViewModel friendsV3FeedListViewModel4 = this.LLILLL;
                            if (friendsV3FeedListViewModel4 == null) {
                                return;
                            }
                            AbstractC1588120rQg abstractC1588120rQg = friendsV3FeedListViewModel4.LLJ;
                            if ((abstractC1588120rQg == null && (abstractC1588120rQg = friendsV3FeedListViewModel4.LLJ) == null) || !friendsV3FeedListViewModel4.CQ2()) {
                                return;
                            }
                            C1223430hwT c1223430hwT = (C1223430hwT) friendsV3FeedListViewModel4.getState();
                            c1223430hwT.getClass();
                            if (c1223430hwT.getListState().LLILLJJLI instanceof C1623706Xj) {
                                return;
                            }
                            friendsV3FeedListViewModel4.manualListLoadMore(abstractC1588120rQg);
                            return;
                        }
                        if (!this.LLIZLLLIL && ((LJ() && ((friendsV3FeedListViewModel2 = this.LLILLL) == null || friendsV3FeedListViewModel2.CQ2())) || !LIZ(LIZIZ()))) {
                            return;
                        }
                        LJFF();
                        return;
                    }
                    return;
                }
                friendsV3FeedListViewModel.manualListLoadLatest(null);
                return;
            }
            friendsV3FeedListViewModel.manualListRefresh();
        }
    }
}
