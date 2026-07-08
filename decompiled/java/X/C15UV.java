package X;

import Y.AfS7S0000100_24;
import Y.AfS8S0000100_31;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedApi;
import com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestRelatedParams;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import com.ss.android.ugc.aweme.explore.data.ExploreRelatedAwemeList;
import com.ss.android.ugc.aweme.explore.experiment.ExploreSearchRealTimeConfig;
import com.ss.android.ugc.aweme.explore.experiment.ExploreSearchRealTimeSettingModel;
import com.ss.android.ugc.aweme.explore.monitor.net.ExploreApiMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.music.model.RelatedAweme;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS221S0000000_31;
import org.json.JSONException;

/* JADX INFO: renamed from: X.15UV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15UV {
    public static String LIZJ;
    public static List<C20530015Va> LIZLLL;
    public static final C15UV LIZ = new C15UV();
    public static volatile AbstractC20528115Uh LIZIZ = C20528315Uj.LIZ;
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS221S0000000_31.get$arr$(156));

    public final void LJ() {
        synchronized (this) {
            try {
                LIZIZ = C20528315Uj.LIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ() {
        Boolean bool;
        if (!ComplianceServiceProvider.LJI().LJIIJ(false) || (bool = (Boolean) ComplianceServiceProvider.LJI().LJJIII().getValue()) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void LIZIZ(Throwable th, boolean z) {
        if (th instanceof C1494690ozz) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("explore query cronet error, isRelated");
            sbLIZ.append(z);
            sbLIZ.append(", rid ");
            sbLIZ.append(((C1494460ozc) th).traceCode);
            C2344809Gs.LIZLLL(6, "exploreFeed", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        if (th instanceof C0XIR) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("explore related query error, isRelated");
            sbLIZ2.append(z);
            sbLIZ2.append(" ,");
            sbLIZ2.append(((C0XIR) th).getResponse());
            C2344809Gs.LIZLLL(6, "exploreFeed", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("explore related query error, isRelated");
        sbLIZ3.append(z);
        sbLIZ3.append(" ,");
        sbLIZ3.append(th);
        C2344809Gs.LIZLLL(6, "exploreFeed", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJI(C11NZ<ExploreAwemeList> c11nz, int i) {
        if (i == 17) {
            return;
        }
        synchronized (this) {
            try {
                if (LIZIZ instanceof C20528315Uj) {
                    LIZIZ = new C20528015Ug(c11nz);
                    if (c11nz != null) {
                        c11nz.LJJLL(new C09JN() { // from class: X.15Ub
                            @Override // X.C09JN
                            public final void accept(Object obj) {
                                C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.saveFirstRefreshFetchQuery$1$1");
                                ExploreAwemeList exploreAwemeList = (ExploreAwemeList) obj;
                                synchronized (C15UV.LIZ) {
                                    try {
                                        if (C15UV.LIZIZ instanceof C20528015Ug) {
                                            C15UV.LIZIZ = new C20528215Ui(exploreAwemeList);
                                        }
                                    } catch (Throwable th) {
                                        TryCatchGuardChecker.doCheck(th);
                                        throw th;
                                    }
                                }
                                C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.saveFirstRefreshFetchQuery$1$1");
                            }
                        }, new C09JN() { // from class: X.15UP
                            @Override // X.C09JN
                            public final void accept(Object obj) throws JSONException {
                                C1C7U.LIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.saveFirstRefreshFetchQuery$1$2");
                                Throwable th = (Throwable) obj;
                                Map<String, String> mapLIZ = C1587310rPN.LIZ("/tiktok/feed/explore/v1", th);
                                ExploreApiMonitor exploreApiMonitor = ExploreApiMonitor.INSTANCE;
                                exploreApiMonitor.isSuccess(false);
                                exploreApiMonitor.errorMsg(mapLIZ);
                                exploreApiMonitor.end();
                                C15UV.LIZ.LJ();
                                C15UV.LIZIZ(th, false);
                                C1C7U.LIZIZ("ExploreFeedApi$RealExploreFeedApiService@f4c.saveFirstRefreshFetchQuery$1$2");
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJFF(long j, String str, boolean z) {
        int i;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", "homepage_explore");
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        c2344009Gk.LIZJ(i, "is_success");
        c2344009Gk.LIZLLL(System.currentTimeMillis() - j, "duration");
        if (z) {
            str = "";
        }
        c2344009Gk.LJIIIIZZ("errorMessage", str);
        C20684815ws.LJIILLIIL("explore_related_api", c2344009Gk.LIZ);
    }

    public static final C11JN LIZLLL(List list, int i, int i2, Long l) {
        Object c098200Yq;
        try {
            C01GW c01gw = C291500Bbg.LIZIZ;
            if (((ExploreSearchRealTimeConfig) c01gw.getValue()).enable) {
                C1DC6 c1dc6 = new C1DC6();
                C0R16 c0r16 = C0R16.LIZ;
                Long lValueOf = Long.valueOf(((ExploreSearchRealTimeConfig) c01gw.getValue()).expireSeconds);
                c0r16.getClass();
                c1dc6.LJII = C0R16.LIZIZ(lValueOf);
                if (((ExploreSearchRealTimeSettingModel) C1867170ygl.LIZIZ.getValue()).enableDeviceInfo) {
                    C1DC5.LIZ.getClass();
                    c1dc6.LIZLLL = C1DCC.LIZJ();
                }
                c098200Yq = c1dc6.build();
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        C1DC8 c1dc8 = (C1DC8) c098200Yq;
        long jCurrentTimeMillis = System.currentTimeMillis();
        ExploreFeedApi.ExploreFeedRetrofitService exploreFeedRetrofitService = (ExploreFeedApi.ExploreFeedRetrofitService) LJ.getValue();
        if (exploreFeedRetrofitService == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C1617730sCR c1617730sCR = (C1617730sCR) it2.next();
            arrayList.add(new ExploreFeedApi.ExploreAwemeReqestParam(c1617730sCR.LIZ, c1617730sCR.LIZIZ, i));
        }
        Integer numValueOf = Integer.valueOf(i2);
        Integer numValueOf2 = Integer.valueOf(C1583440rJ8.LIZ);
        C15TA.LIZ.getClass();
        C15O7<ExploreRelatedAwemeList> c15o7QueryRelatedExploreAwemeList = exploreFeedRetrofitService.queryRelatedExploreAwemeList(new ExploreFeedRequestRelatedParams(arrayList, numValueOf, numValueOf2, C15TA.LIZ(), Boolean.valueOf(LIZ()), c1dc8, l));
        if (c15o7QueryRelatedExploreAwemeList == null) {
            return null;
        }
        return C11NZ.LJIJJLI(new C2502409rK(c15o7QueryRelatedExploreAwemeList, 0)).LJJJJZI(new InterfaceC1487280oo2() { // from class: X.0sCQ
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                ExploreRelatedAwemeList exploreRelatedAwemeList = (ExploreRelatedAwemeList) obj;
                if (C123100dR.LIZ(exploreRelatedAwemeList.getRequestId())) {
                    List<? extends RelatedAweme> list2 = exploreRelatedAwemeList.relatedAwemes;
                    if (list2 != null) {
                        for (RelatedAweme relatedAweme : list2) {
                            List<Aweme> list3 = relatedAweme.awemeList;
                            if (list3 != null) {
                                int i3 = 0;
                                for (Aweme aweme : list3) {
                                    int i4 = i3 + 1;
                                    if (i3 >= 0) {
                                        Aweme awemeLLILLL = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(aweme);
                                        List<Aweme> list4 = relatedAweme.awemeList;
                                        if (list4 != null) {
                                            ListProtector.set(list4, i3, awemeLLILLL);
                                        }
                                        if (awemeLLILLL != null) {
                                            awemeLLILLL.setRequestId(exploreRelatedAwemeList.getRequestId());
                                            awemeLLILLL.setLogPbBean(exploreRelatedAwemeList.logPb);
                                            IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                                            sbLIZ.append(awemeLLILLL.getAid());
                                            sbLIZ.append("35");
                                            iRequestIdService.LIZIZ(i3, C2188811AlT.LIZIZ(sbLIZ), exploreRelatedAwemeList.getRequestId());
                                        }
                                        i3 = i4;
                                    } else {
                                        C1697810uHb.LJIJI();
                                        throw null;
                                    }
                                }
                            }
                        }
                    }
                    C584850Mwl.LIZ.LJI(exploreRelatedAwemeList.getRequestId(), exploreRelatedAwemeList.logPb);
                }
                return exploreRelatedAwemeList;
            }
        }).LJJIJIIJI(new AfS8S0000100_31(jCurrentTimeMillis, 0)).LJJIJIIJIL(new AfS7S0000100_24(jCurrentTimeMillis, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0256  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C11NZ<com.ss.android.ugc.aweme.explore.data.ExploreAwemeList> LIZJ(final boolean r25, boolean r26, int r27, java.lang.Integer r28, final int r29, kotlin.jvm.functions.Function0<X.C15VE> r30, final X.InterfaceC497601wk r31, com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride r32) {
        /*
            Method dump skipped, instruction units count: 651
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15UV.LIZJ(boolean, boolean, int, java.lang.Integer, int, kotlin.jvm.functions.Function0, X.01wk, com.ss.android.ugc.aweme.explore.api.ExploreFeedRequestOverride):X.11NZ");
    }
}
