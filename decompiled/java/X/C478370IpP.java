package X;

import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.feed.LiveTab;
import webcast.api.feed.LiveTabMG;
import webcast.api.feed.MGModuleInteraction;
import webcast.api.feed.MGModuleTab;
import webcast.api.feed.TabMGTopLive;

/* JADX INFO: renamed from: X.0IpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.hangout.component.livecard.view.MultiTopLivePlayFeedAssemV2$refreshTopModuleDataBySkylightAPI$1$onSuccess$1", f = "MultiTopLivePlayFeedAssemV2.kt", l = {940}, m = "invokeSuspend")
public final class C478370IpP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ BaseListResponse<FeedItem, FeedExtra> LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ MultiTopLivePlayFeedAssemV2 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C478370IpP(BaseListResponse<FeedItem, FeedExtra> baseListResponse, long j, MultiTopLivePlayFeedAssemV2 multiTopLivePlayFeedAssemV2, InterfaceC1364105Vn<? super C478370IpP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseListResponse;
        this.LLILZ = j;
        this.LLILZIL = multiTopLivePlayFeedAssemV2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C478370IpP c478370IpP = new C478370IpP(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c478370IpP.LLILLJJLI = obj;
        return c478370IpP;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<LiveTab> list;
        boolean z;
        List<MGModuleTab> list2;
        LiveTab next;
        List<MGModuleInteraction> list3;
        boolean z2;
        C1C7U.LIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                BaseListResponse<FeedItem, FeedExtra> baseListResponse = this.LLILLL;
                FeedExtra feedExtra = (FeedExtra) baseListResponse.extra;
                if (feedExtra != null && (list = feedExtra.tabs) != null) {
                    Iterator<LiveTab> it2 = list.iterator();
                    while (true) {
                        z = false;
                        list2 = null;
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (next.type == 2) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    LiveTab liveTab = next;
                    if (liveTab != null) {
                        LiveTabMG liveTabMG = (LiveTabMG) C19748512Ol.LIZJ.LJII(liveTab.content, LiveTabMG.class);
                        if (liveTabMG != null && liveTabMG.contentType == 2) {
                            z = true;
                        }
                        if (z) {
                            TabMGTopLive tabMGTopLive = liveTabMG.topLive;
                            if (tabMGTopLive != null) {
                                list3 = tabMGTopLive.interactionModule;
                            } else {
                                list3 = null;
                            }
                            if (tabMGTopLive != null) {
                                list2 = tabMGTopLive.tabModule;
                            }
                            C1DFH c1dfh = C0PEM.LIZ;
                            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                            C478380IpQ c478380IpQ = new C478380IpQ(list3, this.LLILZIL, liveTabMG, list2, null);
                            this.LL = 1;
                            if (C23250099c.LJI(this, abstractC2238408pq, c478380IpQ) == objLJFF) {
                                C1C7U.LIZIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1");
                                return objLJFF;
                            }
                        }
                    } else {
                        C477500Io0 c477500Io0 = C477500Io0.LIZ;
                        long j = this.LLILZ;
                        c477500Io0.getClass();
                        C477860Ioa.LJIIL(new C477910Iof(32, System.currentTimeMillis() - j, "top_module_ui_manual_refresh", "MultiTopLivePlayFeedAssemV2 # manualRefreshPage, onSuccess, mgTab == null", "empty", this.LLILLL.LIZLLL, "mgTab == null"));
                        Unit unit = Unit.LIZ;
                        C1C7U.LIZIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1");
                        return unit;
                    }
                } else {
                    long j2 = this.LLILZ;
                    C20441214yg.LJ("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 request top_module data is null");
                    C477500Io0.LIZ.getClass();
                    C477860Ioa.LJIIL(new C477910Iof(32, System.currentTimeMillis() - j2, "top_module_ui_manual_refresh", "MultiTopLivePlayFeedAssemV2 # manualRefreshPage, onSuccess, response.extra?.tabs is null", "empty", baseListResponse.LIZLLL, "response.extra?.tabs is null"));
                    Unit unit2 = Unit.LIZ;
                    C1C7U.LIZIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1");
                    return unit2;
                }
            }
            C477500Io0 c477500Io02 = C477500Io0.LIZ;
            long j3 = this.LLILZ;
            c477500Io02.getClass();
            C477860Ioa.LJIIL(new C477910Iof(96, System.currentTimeMillis() - j3, "top_module_ui_manual_refresh", "MultiTopLivePlayFeedAssemV2 # manualRefreshPage, onSuccess", "success", this.LLILLL.LIZLLL, (String) null));
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1");
            return unit3;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C477500Io0.LIZ.getClass();
            C477680IoI c477680IoILJIJ = C477500Io0.LJIJ(e);
            C477860Ioa.LJIIL(new C477910Iof("top_module_ui_manual_refresh", "MultiTopLivePlayFeedAssemV2 # manualRefreshPage, onSuccess, catch error", System.currentTimeMillis() - this.LLILZ, "error", this.LLILLL.LIZLLL, String.valueOf(c477680IoILJIJ.LIZ), c477680IoILJIJ.LIZIZ));
            C20441214yg.LJFF("MultiTopLivePlayCardFeedAssemV2", "PlayCardFeedAssemV2 Parse skylight data failed:", e);
            Unit unit4 = Unit.LIZ;
            C1C7U.LIZIZ("MultiTopLivePlayFeedAssemV2@7ad1.refreshTopModuleDataBySkylightAPI$1$onSuccess$1");
            return unit4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
