package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.explore.data.ExploreAwemeList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0quv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.performance.chunk.ExploreMainTopicChunkProcessRequest$observeState$2", f = "ExploreMainTopicChunkProcessRequest.kt", l = {189, 194}, m = "invokeSuspend")
public final class C1568430quv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function1<ExploreAwemeList, Unit> LLILZ;
    public final /* synthetic */ Function1<Throwable, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1568430quv(boolean z, int i, Function1<? super ExploreAwemeList, Unit> function1, Function1<? super Throwable, Unit> function12, InterfaceC1364105Vn<? super C1568430quv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = i;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1568430quv(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        InterfaceC346201Wa c1629806Zs;
        C1C7U.LIZ("ExploreMainTopicChunkProcessRequest@d89c.observeState$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2153908cD c2153908cD = C2153908cD.LIZ;
            AwS548S0100000_4 awS548S0100000_4 = new AwS548S0100000_4(th, 498);
            c2153908cD.getClass();
            C2153908cD.LIZ("explore_main_topic_chunk_process_request", awS548S0100000_4);
            C1AF0.LJFF(th, "explore_main_topic_chunk_process_request: async collect error");
            C20524815Ta.LIZIZ.set(EnumC1568420quu.CHUNK_COMPLETE);
            C2252331DDr c2252331DDr = C20524815Ta.LIZLLL;
            ExploreAwemeList exploreAwemeList = new ExploreAwemeList();
            this.LL = 2;
            if (c2252331DDr.emit(exploreAwemeList, this) == objLJFF) {
                C1C7U.LIZIZ("ExploreMainTopicChunkProcessRequest@d89c.observeState$2");
                return objLJFF;
            }
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    AnonymousClass0956 anonymousClass0956 = C20524815Ta.LJ;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    C20524815Ta.LJ = null;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2153908cD c2153908cD2 = C2153908cD.LIZ;
            if (!this.LLILLJJLI || (this.LLILLL != EnumC1568370qup.NORMAL_PREFETCH.getValue() && this.LLILLL != EnumC1568370qup.NO_PREFETCH.getValue())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C20524815Ta c20524815Ta = C20524815Ta.LIZ;
                c1629806Zs = C20524815Ta.LIZJ;
            } else {
                C20524815Ta c20524815Ta2 = C20524815Ta.LIZ;
                b bVar = C20524815Ta.LIZJ;
                if (bVar != null) {
                    c1629806Zs = new C1629806Zs(bVar);
                } else {
                    c1629806Zs = null;
                }
            }
            if (c1629806Zs != null) {
                C2325381G0q c2325381G0q = new C2325381G0q(new C328910Cuv(this.LLILZIL, null), new C861640Xr8(new C1568400qus(null, this.LLILZ, z), c1629806Zs), 0);
                this.LL = 1;
                if (C09IC.LJI(c2325381G0q, this) == objLJFF) {
                    C1C7U.LIZIZ("ExploreMainTopicChunkProcessRequest@d89c.observeState$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExploreMainTopicChunkProcessRequest@d89c.observeState$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
