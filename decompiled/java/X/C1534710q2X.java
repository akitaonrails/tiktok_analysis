package X;

import com.bytedance.forest.chain.fetchers.CDNFetcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0q2X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1534710q2X extends C09AY implements Function1<C1533790q13, Unit> {
    public final /* synthetic */ CDNFetcher LL;
    public final /* synthetic */ Function1<C1533790q13, Unit> LLILLJJLI;
    public final /* synthetic */ C1533790q13 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1534710q2X(CDNFetcher cDNFetcher, Function1<? super C1533790q13, Unit> function1, C1533790q13 c1533790q13) {
        super(1);
        this.LL = cDNFetcher;
        this.LLILLJJLI = function1;
        this.LLILLL = c1533790q13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1533790q13 c1533790q13) {
        this.LL.getTimer().LIZJ("total");
        this.LLILLJJLI.invoke(this.LLILLL);
        return Unit.LIZ;
    }
}
