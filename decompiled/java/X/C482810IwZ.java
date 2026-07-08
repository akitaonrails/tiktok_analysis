package X;

import Y.ARunnableS40S0300000_7;
import com.bytedance.android.live.base.model.feed.FeedExtra;
import com.bytedance.android.live.network.response.BaseListResponse;
import com.bytedance.android.livesdk.model.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0IwZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.follow.TopLiveBubbleManager$showTopLiveBubble$2", f = "TopLiveBubbleManager.kt", l = {474}, m = "invokeSuspend")
public final class C482810IwZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C482800IwY LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C19EG LLILZ;
    public final /* synthetic */ C0J70 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C482810IwZ(C482800IwY c482800IwY, String str, C19EG c19eg, C0J70 c0j70, InterfaceC1364105Vn<? super C482810IwZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c482800IwY;
        this.LLILLL = str;
        this.LLILZ = c19eg;
        this.LLILZIL = c0j70;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C482810IwZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        List<Long> list2;
        Object objLJIILLIIL = obj;
        C1C7U.LIZ("TopLiveBubbleManager@e3c2.showTopLiveBubble$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLJIILLIIL);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLJIILLIIL);
            String strLJIIJJI = this.LLILLJJLI.LJIIJJI();
            if (strLJIIJJI.length() == 0) {
                C482800IwY c482800IwY = this.LLILLJJLI;
                if (c482800IwY.LJIIIIZZ) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.showTopLiveBubble$2");
                    return unit;
                }
                c482800IwY.LJIIIIZZ = true;
                C482800IwY.LJIL(this.LLILLL, null);
                C482800IwY c482800IwY2 = this.LLILLJJLI;
                this.LL = 1;
                objLJIILLIIL = c482800IwY2.LJIILLIIL(this);
                if (objLJIILLIIL == objLJFF) {
                    C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.showTopLiveBubble$2");
                    return objLJFF;
                }
            } else {
                C482800IwY c482800IwY3 = this.LLILLJJLI;
                String str = this.LLILLL;
                c482800IwY3.getClass();
                C482800IwY.LJIJJLI(str, strLJIIJJI, null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.showTopLiveBubble$2");
                return unit2;
            }
        }
        BaseListResponse baseListResponse = (BaseListResponse) objLJIILLIIL;
        this.LLILLJJLI.LJIIIIZZ = false;
        String str2 = this.LLILLL;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_following_live_guide_request_result");
        c474500IjALIZ.LJJII(str2, "guide_scene");
        c474500IjALIZ.LJJII(C482870Iwf.LIZ(), "content_type");
        if (baseListResponse != null) {
            if (baseListResponse.data.isEmpty()) {
                String str3 = ((FeedExtra) baseListResponse.extra).noResultReason;
                if (str3 != null && str3.length() != 0) {
                    c474500IjALIZ.LJJII(str3, "fail_reason");
                } else {
                    c474500IjALIZ.LJJII("no_live", "fail_reason");
                }
                c474500IjALIZ.LJJII("", "room_id");
                c474500IjALIZ.LJJII("", "anchor_id");
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (T t : baseListResponse.data) {
                    Room room = t.getRoom();
                    if (room != null) {
                        arrayList.add(Long.valueOf(room.getId()));
                    }
                    Room room2 = t.getRoom();
                    if (room2 != null) {
                        arrayList2.add(Long.valueOf(room2.getOwnerUserId()));
                    }
                }
                c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, null, 62), "room_id");
                c474500IjALIZ.LJJII(C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62), "anchor_id");
            }
        } else {
            c474500IjALIZ.LJJII("error", "fail_reason");
        }
        c474500IjALIZ.LIZ();
        C482800IwY c482800IwY4 = this.LLILLJJLI;
        if (baseListResponse != null) {
            list = baseListResponse.data;
        } else {
            list = null;
        }
        c482800IwY4.getClass();
        InterfaceC482440Ivy interfaceC482440IvyUt = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).q4().k4().ut();
        if (interfaceC482440IvyUt != null) {
            list2 = ((C486690J6t) interfaceC482440IvyUt).LIZ;
        } else {
            list2 = null;
        }
        if (list != null) {
            Iterator it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                FeedItem feedItem = (FeedItem) it2.next();
                if (list2 != null && !list2.contains(Long.valueOf(feedItem.getRoom().getId()))) {
                    Room room3 = feedItem.getRoom();
                    if (room3 != null) {
                        C482800IwY c482800IwY5 = this.LLILLJJLI;
                        C19EG c19eg = this.LLILZ;
                        C0J70 c0j70 = this.LLILZIL;
                        String str4 = this.LLILLL;
                        String strLJIIJJI2 = c482800IwY5.LJIIJJI();
                        if (strLJIIJJI2.length() == 0) {
                            C0J9F.LIZLLL = true;
                            c0j70.LJ = room3;
                            c482800IwY5.LJIIJ = true;
                            PopupManager.LJIJI(new C1905800zh4(c19eg, c0j70, new ARunnableS40S0300000_7(c482800IwY5, c0j70, c19eg, 7)), true);
                        } else {
                            C482800IwY.LJIJJLI(str4, strLJIIJJI2, null);
                        }
                    }
                }
            }
        }
        Unit unit22 = Unit.LIZ;
        C1C7U.LIZIZ("TopLiveBubbleManager@e3c2.showTopLiveBubble$2");
        return unit22;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
