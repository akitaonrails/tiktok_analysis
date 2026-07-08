package X;

import com.bytedance.forest.chain.fetchers.CDNFetcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q2N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534610q2N extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CDNFetcher LL;
    public final /* synthetic */ C1533490q0Z LLILLJJLI;
    public final /* synthetic */ C1533790q13 LLILLL;
    public final /* synthetic */ Function1<C1533790q13, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1534610q2N(CDNFetcher cDNFetcher, C1533490q0Z c1533490q0Z, C1533790q13 c1533790q13, Function1<? super C1533790q13, Unit> function1) {
        super(0);
        this.LL = cDNFetcher;
        this.LLILLJJLI = c1533490q0Z;
        this.LLILLL = c1533790q13;
        this.LLILZ = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.getTimer().LIZLLL("total");
        CDNFetcher cDNFetcher = this.LL;
        C1533490q0Z c1533490q0Z = this.LLILLJJLI;
        C1533790q13 c1533790q13 = this.LLILLL;
        cDNFetcher.doFetch(false, c1533490q0Z, c1533790q13, new C1534710q2X(cDNFetcher, this.LLILZ, c1533790q13));
        return Unit.LIZ;
    }
}
