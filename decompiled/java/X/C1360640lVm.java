package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.repostfeed.model.RepostFeedEntranceResponse;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentMeta;
import com.ss.android.ugc.aweme.repostfeed.model.RepostNewContentUser;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lVm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.repostfeed.detail.RepostFeedEntranceRepository$requestEntranceInfo$1$1", f = "RepostFeedEntranceRepository.kt", l = {}, m = "invokeSuspend")
public final class C1360640lVm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RepostFeedEntranceResponse LL;
    public final /* synthetic */ List<RepostNewContentUser> LLILLJJLI;
    public final /* synthetic */ List<RepostNewContentMeta> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1360640lVm(RepostFeedEntranceResponse repostFeedEntranceResponse, List<RepostNewContentUser> list, List<RepostNewContentMeta> list2, InterfaceC1364105Vn<? super C1360640lVm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = repostFeedEntranceResponse;
        this.LLILLJJLI = list;
        this.LLILLL = list2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1360640lVm(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        List<RepostNewContentMeta> list;
        C1360650lVn c1360650lVn;
        C1360650lVn c1360650lVn2;
        C1C7U.LIZ("RepostFeedEntranceRepository@19c7.requestEntranceInfo$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        boolean z2 = this.LL.tabShownStatus;
        List<RepostNewContentUser> list2 = this.LLILLJJLI;
        List<RepostNewContentMeta> list3 = this.LLILLL;
        if (z2) {
            C1360680lVq.LIZ.getClass();
            Keva keva = C1360680lVq.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("repost_feed_entrance_shown_");
            sbLIZ.append(C1360680lVq.LIZ());
            keva.storeBoolean(C2188811AlT.LIZIZ(sbLIZ), true);
        }
        C1360680lVq.LIZ.getClass();
        if (!C1360680lVq.LIZLLL() && !z2) {
            z = false;
        } else {
            z = true;
        }
        C1360620lVk.LIZIZ = new C1360650lVn(z, list2, list3);
        if (((Number) C298720BnK.LIZ.getValue()).intValue() != 1 ? !(!C298720BnK.LIZIZ() || C1360620lVk.LIZ != null || C1360620lVk.LIZIZ == null) : !((c1360650lVn = C1360620lVk.LIZ) != null && (!(!c1360650lVn.LIZ) || (c1360650lVn2 = C1360620lVk.LIZIZ) == null || !c1360650lVn2.LIZ))) {
            C1360620lVk.LIZ = C1360620lVk.LIZIZ;
            if (C298720BnK.LIZIZ()) {
                C1360650lVn c1360650lVn3 = C1360620lVk.LIZ;
                if (c1360650lVn3 != null) {
                    list = c1360650lVn3.LIZJ;
                } else {
                    list = null;
                }
                C1360700lVs.LIZIZ(list);
            }
            Iterator it2 = ((List) C1360620lVk.LIZJ.getValue()).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1360660lVo) it2.next()).LIZ(C1360620lVk.LIZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostFeedEntranceRepository@19c7.requestEntranceInfo$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
