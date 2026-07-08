package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreTopicAwemeListResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0qux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreTopicFeedChunkProcessRequest$observeState$2", f = "ExploreTopicFeedChunkProcessRequest.kt", l = {158, 163}, m = "invokeSuspend")
public final class C1568450qux extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C15TZ LLILLJJLI;
    public final /* synthetic */ Function1<ExploreTopicAwemeListResponse, Unit> LLILLL;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1568450qux(C15TZ c15tz, Function1<? super ExploreTopicAwemeListResponse, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C1568450qux> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c15tz;
        this.LLILLL = function1;
        this.LLILZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568450qux(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreTopicFeedChunkProcessRequest@8a90.observeState$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS553S0100000_9 awS553S0100000_9 = new AwS553S0100000_9(th, 1787);
            c2153908cD.getClass();
            C2153908cD.LIZ("explore_topic_feed_chunk_process_request", awS553S0100000_9);
            C1AF0.LJFF(th, "explore_topic_feed_chunk_process_request: async collect error");
            this.LLILLJJLI.LIZ.set(EnumC1568470quz.CHUNK_COMPLETE);
            C2252331DDr c2252331DDr = this.LLILLJJLI.LIZJ;
            ExploreTopicAwemeListResponse exploreTopicAwemeListResponse = new ExploreTopicAwemeListResponse();
            this.LL = 2;
            if (c2252331DDr.emit(exploreTopicAwemeListResponse, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.observeState$2");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    AnonymousClass0956 anonymousClass0956 = this.LLILLJJLI.LIZLLL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    this.LLILLJJLI.LIZLLL = null;
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.observeState$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            b bVar = this.LLILLJJLI.LIZIZ;
            if (bVar != null) {
                C2325381G0q c2325381G0q = new C2325381G0q(new C592680NMk(this.LLILZ, null), new C861640Xr8(new C1568460quy(this.LLILLJJLI, null, this.LLILLL), new C1629806Zs(bVar)), 0);
                this.LL = 1;
                if (C09IC.LJI(c2325381G0q, this) == objLJFF) {
                    C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.observeState$2");
                    return objLJFF;
                }
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ExploreTopicFeedChunkProcessRequest@8a90.observeState$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
