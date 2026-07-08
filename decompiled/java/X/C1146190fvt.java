package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0fvt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146190fvt extends C09AY implements Function1<C1146210fvv, C1146210fvv> {
    public final /* synthetic */ List<EnumC1146170fvr> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ EnumC1146170fvr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1146190fvt(List<? extends EnumC1146170fvr> list, int i, EnumC1146170fvr enumC1146170fvr) {
        super(1);
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = enumC1146170fvr;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1146210fvv invoke(C1146210fvv c1146210fvv) {
        Pair pair = new Pair(this.LL, Integer.valueOf(this.LLILLJJLI));
        Pair pair2 = new Pair(this.LLILLL, Integer.valueOf(this.LLILLJJLI));
        c1146210fvv.getClass();
        return new C1146210fvv(pair, pair2);
    }
}
