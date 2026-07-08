package X;

import Y.ARunnableS119S0100000_19;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iiS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1253180iiS {
    public FeedItemList LIZ;
    public Exception LIZIZ;
    public final C19EG LIZJ;
    public Boolean LIZLLL;
    public Boolean LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public final List<InterfaceC1253230iiX> LJIIIIZZ = new ArrayList();
    public final Map<String, Long> LJIIIZ = new LinkedHashMap();
    public final Object LJIIJ = new Object();
    public final C01GW LJIIJJI = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(11));
    public ARunnableS119S0100000_19 LJIIL;
    public Long LJIILIIL;

    public final ARunnableS119S0100000_19 LJFF() {
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", "start runnable");
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = new ARunnableS119S0100000_19(this, 10);
        C786410Ut5.LJLIIL(((Number) C267460Ae0.LIZ.getValue()).longValue(), C2113808Pw.LIZIZ.LL, aRunnableS119S0100000_19);
        return aRunnableS119S0100000_19;
    }

    public C1253180iiS(C19EG c19eg) {
        this.LIZJ = c19eg;
    }

    public static void LJI(FeedItemList feedItemList) {
        LogPbBean logPbBean;
        if (feedItemList != null && feedItemList.getItems() != null && (logPbBean = feedItemList.logPb) != null && logPbBean.getImprId() != null) {
            Iterator<Aweme> it2 = feedItemList.getItems().iterator();
            while (it2.hasNext()) {
                it2.next().setRequestId(feedItemList.logPb.getImprId());
            }
        }
    }

    public final void LIZ(boolean z) {
        synchronized (this.LJIIJ) {
            if (z) {
                try {
                    Boolean bool = Boolean.TRUE;
                    this.LIZLLL = bool;
                    if (!Intrinsics.LJFF(this.LJ, bool)) {
                        C1250680ieQ.LIZ.getClass();
                        C1250680ieQ.LJIILIIL(true);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            Boolean bool2 = this.LIZLLL;
            Boolean bool3 = Boolean.TRUE;
            if (Intrinsics.LJFF(bool2, bool3) && Intrinsics.LJFF(this.LJ, bool3)) {
                LIZIZ(false);
                return;
            }
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("hasPostApiBack : ");
            sbLIZ.append(this.LIZLLL);
            sbLIZ.append(", hasCompletedRequestedUser: ");
            sbLIZ.append(this.LJ);
            C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ));
            if (!Intrinsics.LJFF(this.LIZLLL, bool3) && Intrinsics.LJFF(this.LJ, bool3)) {
                C1250680ieQ.LIZ.getClass();
                C1250680ieQ.LJIILIIL(false);
            }
            if (Intrinsics.LJFF(this.LIZLLL, bool3) && !Intrinsics.LJFF(this.LJ, bool3)) {
                this.LJIIL = LJFF();
            }
        }
    }

    public final void LIZIZ(boolean z) {
        ARunnableS119S0100000_19 aRunnableS119S0100000_19 = this.LJIIL;
        if (aRunnableS119S0100000_19 != null) {
            C2113808Pw.LIZIZ.LL.removeCallbacks(aRunnableS119S0100000_19);
            this.LJIIL = null;
            int i = C2187451AjH.LIZ;
            C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", "remove runnable");
        }
        int size = ((ArrayList) this.LJIIIIZZ).size();
        int i2 = C2187451AjH.LIZ;
        C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", "callbackAwemeInfo callback");
        int i3 = 0;
        for (Object obj : (ArrayList) this.LJIIIIZZ) {
            int i4 = i3 + 1;
            if (i3 >= 0) {
                FeedItemList feedItemList = this.LIZ;
                ((InterfaceC1253230iiX) obj).LIZ(feedItemList, LIZJ(feedItemList), z);
                if (i3 == size - 1) {
                    ((ArrayList) this.LJIIIIZZ).clear();
                    this.LIZ = null;
                }
                i3 = i4;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    public final String LIZJ(FeedItemList feedItemList) {
        List<Aweme> awemeList;
        String strLJIJ;
        Aweme aweme;
        if (!((Boolean) C267160AdW.LIZ.getValue()).booleanValue()) {
            return this.LJFF;
        }
        if (C736460Sui.LIZIZ(this.LJFF)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getUserId userId ");
            sbLIZ.append(this.LJFF);
            C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ));
            return this.LJFF;
        }
        if (feedItemList != null && (awemeList = feedItemList.getAwemeList()) != null && !awemeList.isEmpty()) {
            List<Aweme> awemeList2 = feedItemList.getAwemeList();
            if (awemeList2 != null && (aweme = (Aweme) ListProtector.get(awemeList2, 0)) != null) {
                strLJIJ = C1017070cZd.LJIJ(aweme);
            } else {
                strLJIJ = null;
            }
            int i2 = C2187451AjH.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("getUserId awemeUserId ");
            sbLIZ2.append(strLJIJ);
            C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ2));
            return strLJIJ;
        }
        int i3 = C2187451AjH.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("getUserId feedItemList ");
        sbLIZ3.append(feedItemList);
        C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ3));
        return this.LJFF;
    }

    public final void LIZLLL(boolean z, Long l, Long l2) {
        synchronized (this.LJIIIZ) {
            try {
                if (!z) {
                    if (l != null && (!this.LJIIIZ.isEmpty()) && this.LJIIIZ.containsKey("post_api_cost_time")) {
                        Long l3 = (Long) ((LinkedHashMap) this.LJIIIZ).get("post_api_cost_time");
                        if (l3 != null) {
                            long jLongValue = l3.longValue();
                            Long l4 = this.LJIILIIL;
                            if (l4 != null) {
                                long jLongValue2 = l4.longValue();
                                C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                                Long lValueOf = Long.valueOf(jLongValue);
                                Long lValueOf2 = Long.valueOf(l.longValue() - jLongValue2);
                                c1250680ieQ.getClass();
                                C1250680ieQ.LJIIL(lValueOf, lValueOf2);
                            }
                        }
                        ((LinkedHashMap) this.LJIIIZ).clear();
                        return;
                    }
                    Long l5 = this.LJIILIIL;
                    if (l5 != null) {
                        long jLongValue3 = l5.longValue();
                        if (l != null) {
                            this.LJIIIZ.put("page_cost_time", Long.valueOf(l.longValue() - jLongValue3));
                        }
                    }
                } else {
                    if (l2 != null && (!this.LJIIIZ.isEmpty()) && this.LJIIIZ.containsKey("page_cost_time")) {
                        Long l6 = (Long) ((LinkedHashMap) this.LJIIIZ).get("page_cost_time");
                        if (l6 != null) {
                            long jLongValue4 = l6.longValue();
                            Long l7 = this.LJIILIIL;
                            if (l7 != null) {
                                l7.longValue();
                                C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                                Long lValueOf3 = Long.valueOf(jLongValue4);
                                c1250680ieQ2.getClass();
                                C1250680ieQ.LJIIL(l2, lValueOf3);
                            }
                        }
                        ((LinkedHashMap) this.LJIIIZ).clear();
                        return;
                    }
                    this.LJIIIZ.put("post_api_cost_time", l2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJ(final String str, final String str2, final int i, final boolean z) {
        ((ExecutorService) this.LJIIJJI.getValue()).submit(new Runnable() { // from class: X.0iil
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ProfileApiAdvanceRequestHelper@5c8a.requestPostApi$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ProfileApiAdvanceRequestHelper@5c8a.requestPostApi$1");
            }

            public final void LIZ() {
                long jCurrentTimeMillis = System.currentTimeMillis();
                C1253420iiq.LIZ.getClass();
                C1253420iiq.LJIIIIZZ = System.currentTimeMillis();
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("requestPostApi userId：");
                sbLIZ.append(this.LL.LJFF);
                C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ));
                try {
                    C846160XHi c846160XHi = new C846160XHi();
                    ((ArrayList) c846160XHi.LL).add(new C2259671DcT("check_preload", "true"));
                    String str3 = str;
                    C1250680ieQ c1250680ieQ = C1250680ieQ.LIZ;
                    int iOrdinal = EnumC1253390iin.START_REQUEST.ordinal();
                    Boolean bool = Boolean.TRUE;
                    Boolean boolValueOf = Boolean.valueOf(z);
                    c1250680ieQ.getClass();
                    C1250680ieQ.LJIILJJIL(false, iOrdinal, false, bool, null, null, boolValueOf);
                    C1253180iiS c1253180iiS = this.LL;
                    c1253180iiS.LIZ = C1255950imv.LJFF(true, c1253180iiS.LJFF, c1253180iiS.LJI, 0, 0L, 9, null, 0, 0, 2000, c846160XHi, str3, false, "fresh_set_data_list", str2, i);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("requestPostApi end：");
                    sbLIZ2.append(str3);
                    C1720106oR.LJI("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ2));
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    this.LL.LIZ(true);
                    C1253180iiS.LJI(this.LL.LIZ);
                    if (z) {
                        int iOrdinal2 = EnumC1253390iin.REQUEST_RETRY.ordinal();
                        c1250680ieQ.getClass();
                        C1250680ieQ.LJIILJJIL(false, iOrdinal2, true, bool, null, null, bool);
                    } else {
                        int iOrdinal3 = EnumC1253390iin.NO_CHUNK_END_SUCCESS.ordinal();
                        Boolean bool2 = Boolean.FALSE;
                        c1250680ieQ.getClass();
                        C1250680ieQ.LJIILJJIL(false, iOrdinal3, true, bool, null, null, bool2);
                    }
                    this.LL.LIZLLL(true, null, Long.valueOf(jCurrentTimeMillis2));
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1253180iiS c1253180iiS2 = this.LL;
                    c1253180iiS2.LIZIZ = e;
                    c1253180iiS2.LIZLLL = Boolean.TRUE;
                    synchronized (c1253180iiS2.LJIIJ) {
                        try {
                            int size = ((ArrayList) c1253180iiS2.LJIIIIZZ).size();
                            int i3 = 0;
                            for (Object obj : (ArrayList) c1253180iiS2.LJIIIIZZ) {
                                int i4 = i3 + 1;
                                if (i3 < 0) {
                                    C1697810uHb.LJIJI();
                                    throw null;
                                }
                                ((InterfaceC1253230iiX) obj).LIZIZ(e);
                                if (i3 == size - 1) {
                                    int i5 = C2187451AjH.LIZ;
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("requestPostApi error: ");
                                    sbLIZ3.append(e.getMessage());
                                    C1720106oR.LIZ("Profile_ApiAdvanceRequestHelper", C2188811AlT.LIZIZ(sbLIZ3));
                                    ((ArrayList) c1253180iiS2.LJIIIIZZ).clear();
                                    c1253180iiS2.LIZIZ = null;
                                }
                                i3 = i4;
                            }
                            C1253180iiS c1253180iiS3 = this.LL;
                            String str4 = str2;
                            c1253180iiS3.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            c2344009Gk.LJIIIIZZ("to_user_id", c1253180iiS3.LJFF);
                            c2344009Gk.LJIIIIZZ("enter_from", str4);
                            c2344009Gk.LIZJ(0, "is_success");
                            c2344009Gk.LJIIIIZZ("fail_info", e.getMessage());
                            if (e instanceof C0XIR) {
                                c2344009Gk.LJFF("response", ((C0XIR) e).getResponse());
                            }
                            C20684815ws.LJIILLIIL("profile_request_response", c2344009Gk.LIZ);
                            if (z) {
                                C1250680ieQ c1250680ieQ2 = C1250680ieQ.LIZ;
                                int iOrdinal4 = EnumC1253390iin.REQUEST_RETRY.ordinal();
                                Boolean bool3 = Boolean.TRUE;
                                c1250680ieQ2.getClass();
                                C1250680ieQ.LJIILJJIL(false, iOrdinal4, false, bool3, null, null, bool3);
                                return;
                            }
                            C1250680ieQ c1250680ieQ3 = C1250680ieQ.LIZ;
                            int iOrdinal5 = EnumC1253390iin.NO_CHUNK_END_FAILED.ordinal();
                            Boolean bool4 = Boolean.TRUE;
                            Boolean bool5 = Boolean.FALSE;
                            c1250680ieQ3.getClass();
                            C1250680ieQ.LJIILJJIL(false, iOrdinal5, false, bool4, null, null, bool5);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            throw th;
                        }
                    }
                }
            }
        });
    }
}
