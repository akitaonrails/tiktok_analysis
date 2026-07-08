package X;

import com.bytedance.forest.chain.fetchers.ResourceFetcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0q1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534280q1q extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ C1534160q1e LL;
    public final /* synthetic */ C1533790q13 LLILLJJLI;
    public final /* synthetic */ Function1<C1533790q13, Unit> LLILLL;
    public final /* synthetic */ ResourceFetcher LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Thread LLILZLL;
    public final /* synthetic */ C1533490q0Z LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1534280q1q(C1534160q1e c1534160q1e, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1, ResourceFetcher resourceFetcher, String str, Thread thread, C1533490q0Z c1533490q0Z) {
        super(1);
        this.LL = c1534160q1e;
        this.LLILLJJLI = c1533790q13;
        this.LLILLL = function1;
        this.LLILZ = resourceFetcher;
        this.LLILZIL = str;
        this.LLILZLL = thread;
        this.LLIZ = c1533490q0Z;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(C1533790q13 c1533790q13) {
        C1533790q13 c1533790q132 = c1533790q13;
        if (this.LL.LIZIZ) {
            C1533790q13 c1533790q133 = this.LLILLJJLI;
            c1533790q133.LJIIL = true;
            c1533790q133.LIZLLL.LJ(2, "ResourceLoaderChain# on cancel load");
            C1534250q1n.LIZ(C1534250q1n.LIZ, "ResourceFetcherChain", "ResourceLoaderChain# on cancel load");
            this.LLILLL.invoke(this.LLILLJJLI);
        } else {
            this.LLILZ.getTimer().LIZIZ();
            if (c1533790q132.LIZIZ) {
                c1533790q132.LJIIJ = this.LLILZIL;
                this.LLILLL.invoke(this.LLILLJJLI);
            } else {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("fetchAsync error:");
                sbLIZ.append(c1533790q132.LIZLLL);
                C1534250q1n.LIZIZ("ResourceFetcherChain", C2188811AlT.LIZIZ(sbLIZ), null);
                if (!Intrinsics.LJFF(this.LLILZLL, C786410Ut5.u3())) {
                    this.LL.LIZJ(this.LLIZ, this.LLILLJJLI, this.LLILLL);
                } else {
                    this.LL.LIZIZ(this.LLIZ, this.LLILLJJLI, this.LLILLL);
                }
            }
        }
        return Unit.LIZ;
    }
}
