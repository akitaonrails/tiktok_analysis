package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.discover.model.Position;
import com.ss.android.ugc.aweme.topic.common.model.TopicRawInfo;
import com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM;
import com.ss.android.ugc.aweme.topic.search.api.RecommendTopicResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS375S0200000_9;
import njp.a;

/* JADX INFO: renamed from: X.0OAN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.topic.recommend.vm.TopicRecommendListVM$getRecommendList$1", f = "TopicRecommendListVM.kt", l = {83}, m = "invokeSuspend")
public final class C0OAN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TopicRecommendListVM LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0OAN(TopicRecommendListVM topicRecommendListVM, InterfaceC1364105Vn<? super C0OAN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = topicRecommendListVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0OAN(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? arrayList;
        Boolean boolValueOf;
        Object objLLLLIILLL = obj;
        C1C7U.LIZ("TopicRecommendListVM@c776.getRecommendList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(objLLLLIILLL);
            } else {
                C155000ia.LIZIZ(objLLLLIILLL);
                C0OAQ c0oaq = (C0OAQ) this.LLILLJJLI.LLIZ.getValue().getOperator();
                TopicRecommendListVM topicRecommendListVM = this.LLILLJJLI;
                String str = topicRecommendListVM.LLILLJJLI;
                if (str == null) {
                    str = null;
                }
                int type = topicRecommendListVM.vQ2().getType();
                this.LL = 1;
                objLLLLIILLL = c0oaq.LLLLIILLL(type, str, null, this);
                if (objLLLLIILLL == objLJFF) {
                    C1C7U.LIZIZ("TopicRecommendListVM@c776.getRecommendList$1");
                    return objLJFF;
                }
            }
            RecommendTopicResponse recommendTopicResponse = (RecommendTopicResponse) objLLLLIILLL;
            List<TopicRawInfo> list = recommendTopicResponse.topicInfoList;
            if (list != null) {
                TopicRecommendListVM topicRecommendListVM2 = this.LLILLJJLI;
                arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                for (TopicRawInfo topicRawInfo : list) {
                    ArrayList arrayList2 = new ArrayList();
                    String str2 = topicRawInfo.title;
                    boolean z = false;
                    if (str2 != null) {
                        arrayList2.add(new Position(0, str2.length() - 1));
                    }
                    String str3 = topicRecommendListVM2.LLILZ;
                    if (str3 != null) {
                        if (str3.length() == 0) {
                            z = true;
                        }
                        boolValueOf = Boolean.valueOf(z);
                    } else {
                        boolValueOf = null;
                    }
                    String str4 = topicRecommendListVM2.LLILLL;
                    if (str4 == null) {
                        str4 = null;
                    }
                    arrayList.add(new C0OAT(topicRawInfo, arrayList2, null, boolValueOf, str4, 4));
                }
            } else {
                arrayList = C13BV.INSTANCE;
            }
            this.LLILLJJLI.setState(new AwS375S0200000_9((List) arrayList, (List<C0OAT>) recommendTopicResponse, (RecommendTopicResponse) 180));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2276411E8h.LIZIZ.LIZLLL("topic", e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TopicRecommendListVM@c776.getRecommendList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
