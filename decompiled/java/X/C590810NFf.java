package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.Feed0VVManager;
import com.ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.plugin.IPluginService;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NFf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nuf.NewUserFeedRequestTask$startRequest$1", f = "NewUserFeedRequestTask.kt", l = {}, m = "invokeSuspend")
public final class C590810NFf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C590820NFg LL;
    public final /* synthetic */ InterfaceC590840NFi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C590810NFf(C590820NFg c590820NFg, InterfaceC590840NFi interfaceC590840NFi, InterfaceC1364105Vn<? super C590810NFf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c590820NFg;
        this.LLILLJJLI = interfaceC590840NFi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C590810NFf(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FeedItemList feedItemListFetchFeedList;
        List<Aweme> items;
        List<Aweme> items2;
        String requestId;
        IPluginService iPluginService;
        String cdid;
        C1C7U.LIZ("NewUserFeedRequestTask@42e2.startRequest$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C590820NFg c590820NFg = this.LL;
        c590820NFg.getClass();
        FeedItemList feedItemList = null;
        try {
            C1601440rmA c1601440rmA = new C1601440rmA();
            c1601440rmA.LIZ = 0;
            c1601440rmA.LIZJ(0L);
            c1601440rmA.LIZLLL(0L);
            c1601440rmA.LJJIZ = "nuj_feed_cache_preload";
            c1601440rmA.LIZIZ(6);
            c1601440rmA.LIZIZ = c590820NFg.LIZLLL;
            c1601440rmA.LJIIJ = new InterfaceC1604690rrP() { // from class: X.0NFh
                @Override // X.InterfaceC1604690rrP
                public final String LIZ() {
                    return "";
                }

                @Override // X.InterfaceC1604690rrP
                public final String LIZIZ() {
                    return "";
                }
            };
            c1601440rmA.LJIJ = c590820NFg.LIZIZ;
            c1601440rmA.LJJI = false;
            C1602860roS.LIZ.getClass();
            String str = "";
            if (C1602860roS.LJ()) {
                boolean z = c590820NFg.LIZJ;
                c1601440rmA.LJJIJLIJ = z;
                if (z && (iPluginService = (IPluginService) PluggableExtentionKt.pluggableSpi$default(IPluginService.class, false, false, false, 14, null)) != null && (cdid = iPluginService.getCdid()) != null) {
                    c1601440rmA.LJJ = cdid;
                }
                int i = c590820NFg.LIZIZ;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                if (i != 5) {
                                    if (i == 30) {
                                        str = "paid_ads";
                                    }
                                } else {
                                    str = "before_swipeup_marked";
                                }
                            } else {
                                str = "before_swipeup";
                            }
                        } else {
                            str = "after_login";
                        }
                    } else {
                        str = "after_did";
                    }
                } else {
                    str = "cold_initial";
                }
                C1953307kx.LIZ.getClass();
                if (C1953307kx.LIZLLL(str)) {
                    c1601440rmA.LJJJJ = str;
                }
                C1602870roT.LIZIZ(str);
            }
            IFeedApi iFeedApi = (IFeedApi) PluggableExtentionKt.pluggableSpi$default(IFeedApi.class, false, false, false, 14, null);
            if (iFeedApi != null) {
                feedItemListFetchFeedList = iFeedApi.fetchFeedList(c1601440rmA.LIZ());
            } else {
                feedItemListFetchFeedList = null;
            }
            if (c590820NFg.LIZLLL == 4) {
                if (feedItemListFetchFeedList == null) {
                    items2 = null;
                    requestId = null;
                } else {
                    items2 = feedItemListFetchFeedList.getItems();
                    requestId = feedItemListFetchFeedList.getRequestId();
                }
                Feed0VVManager.LJ(0, requestId, items2, false);
            }
            if (feedItemListFetchFeedList == null) {
                items = null;
            } else {
                items = feedItemListFetchFeedList.getItems();
            }
            C1602870roT.LIZ(str, items);
            feedItemList = feedItemListFetchFeedList;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        this.LL.getClass();
        this.LLILLJJLI.LJ(feedItemList, this.LL.LIZ);
        this.LL.getClass();
        if (feedItemList != null) {
            C587820N3s.LIZ.getClass();
            C587820N3s.LIZ(feedItemList);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NewUserFeedRequestTask@42e2.startRequest$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
