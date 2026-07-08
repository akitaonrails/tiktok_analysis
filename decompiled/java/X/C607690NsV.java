package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.repo.BatchEntry;
import com.ss.android.ugc.aweme.detail.repo.FollowInnerFeedPreloadResponse;
import com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NsV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.detail.vm.FollowInnerFeedVM$preloadByOuterFeed$1", f = "FollowInnerFeedVM.kt", l = {289}, m = "invokeSuspend")
public final class C607690NsV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ List<String> LLILLJJLI;
    public final /* synthetic */ EnumC1588650rRX LLILLL;
    public final /* synthetic */ FollowInnerFeedVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607690NsV(List<String> list, EnumC1588650rRX enumC1588650rRX, FollowInnerFeedVM followInnerFeedVM, InterfaceC1364105Vn<? super C607690NsV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = list;
        this.LLILLL = enumC1588650rRX;
        this.LLILZ = followInnerFeedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607690NsV(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean zIsEmpty;
        List<FollowFeed> list;
        FollowInnerFeedPreloadResponse followInnerFeedPreloadResponse;
        Set<Map.Entry<String, BatchEntry>> setEntrySet;
        Object objLIZ = obj;
        C1C7U.LIZ("FollowInnerFeedVM@437f.preloadByOuterFeed$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLIZ);
            } else {
                C155000ia.LIZIZ(objLIZ);
                List<String> list2 = this.LLILLJJLI;
                FollowInnerFeedVM followInnerFeedVM = this.LLILZ;
                ArrayList arrayList = new ArrayList();
                for (String str : list2) {
                    C607720NsY c607720NsY = followInnerFeedVM.BQ2().get(str);
                    if (c607720NsY != null && (list = c607720NsY.LIZ) != null) {
                        zIsEmpty = list.isEmpty();
                    } else {
                        zIsEmpty = true;
                    }
                    if (zIsEmpty) {
                        arrayList.add(str);
                    }
                }
                if (arrayList.isEmpty()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("FollowInnerFeedVM@437f.preloadByOuterFeed$1");
                    return unit;
                }
                C607680NsU c607680NsU = C607680NsU.LIZ;
                if (this.LLILLL != EnumC1588650rRX.NONE) {
                    z = true;
                } else {
                    z = false;
                }
                this.LL = 1;
                c607680NsU.getClass();
                objLIZ = C607680NsU.LIZ(arrayList, z, this);
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("FollowInnerFeedVM@437f.preloadByOuterFeed$1");
                    return objLJFF;
                }
            }
            followInnerFeedPreloadResponse = (FollowInnerFeedPreloadResponse) objLIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (followInnerFeedPreloadResponse.status_code != 0) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("FollowInnerFeedVM@437f.preloadByOuterFeed$1");
            return unit2;
        }
        Map<String, BatchEntry> map = followInnerFeedPreloadResponse.entries;
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            FollowInnerFeedVM followInnerFeedVM2 = this.LLILZ;
            Iterator<T> it2 = setEntrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                List<FollowFeed> list3 = ((BatchEntry) entry.getValue()).data;
                if (list3 != null) {
                    ArrayList<FollowFeed> arrayList2 = new ArrayList();
                    for (FollowFeed followFeed : list3) {
                        if (!AwemeSaaSExtKt.isLive(followFeed.getAweme())) {
                            arrayList2.add(followFeed);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
                    for (FollowFeed followFeed2 : arrayList2) {
                        followFeed2.setFromPreload(true);
                        arrayList3.add(followFeed2);
                    }
                    followInnerFeedVM2.BQ2().put(entry.getKey(), new C607720NsY(arrayList3, null, false, 0, 14));
                }
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("FollowInnerFeedVM@437f.preloadByOuterFeed$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
