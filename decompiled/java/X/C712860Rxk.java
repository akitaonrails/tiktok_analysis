package X;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Rxk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712860Rxk extends C09AY implements Function1<C712920Rxq, C712920Rxq> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C712860Rxk(String str, String str2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C712920Rxq invoke(C712920Rxq c712920Rxq) {
        return C712920Rxq.LIZ(c712920Rxq, new Pair(this.LL, this.LLILLJJLI), null, null, 6);
    }
}
