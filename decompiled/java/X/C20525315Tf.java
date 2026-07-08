package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS610S0100000_31;
import njp.a;

/* JADX INFO: renamed from: X.15Tf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.topic.adapter.ExploreRecommendTopicAdapter$RecommendTopicViewHolder$tryPreloadTopicFeedList$1", f = "ExploreRecommendTopicAdapter.kt", l = {179, 183}, m = "invokeSuspend")
public final class C20525315Tf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C20529315Ut LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Context LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20525315Tf(C20529315Ut c20529315Ut, Long l, String str, Context context, InterfaceC1364105Vn<? super C20525315Tf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20529315Ut;
        this.LLILLL = l;
        this.LLILZ = str;
        this.LLILZIL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20525315Tf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreRecommendTopicAdapter$RecommendTopicViewHolder@ca27.tryPreloadTopicFeedList$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ExploreRecommendTopicAdapter$RecommendTopicViewHolder@ca27.tryPreloadTopicFeedList$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(3000L, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreRecommendTopicAdapter$RecommendTopicViewHolder@ca27.tryPreloadTopicFeedList$1");
                return objLJFF;
            }
        }
        C2153908cD c2153908cD = C2153908cD.LIZ;
        C15TZ c15tz = new C15TZ();
        this.LLILLJJLI.LLILLL = new C15TU(c15tz);
        C15TU c15tu = this.LLILLJJLI.LLILLL;
        if (c15tu != null) {
            Long l = this.LLILLL;
            String str = this.LLILZ;
            C15TH c15th = C15TH.PRELOAD_INSERT_CARD;
            AwS610S0100000_31 awS610S0100000_31 = new AwS610S0100000_31(this.LLILZIL, 573);
            this.LL = 2;
            if (c15tu.LIZIZ(l, str, "topic_popup_page", c15th, null, null, awS610S0100000_31, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreRecommendTopicAdapter$RecommendTopicViewHolder@ca27.tryPreloadTopicFeedList$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreRecommendTopicAdapter$RecommendTopicViewHolder@ca27.tryPreloadTopicFeedList$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
