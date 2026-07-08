package X;

import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0j1X, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1265010j1X extends C09AY implements Function1<C1264900j1M, C1264900j1M> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Set<String> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1265010j1X(String str, String str2, String str3, Set set, boolean z) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = set;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C1264900j1M invoke(C1264900j1M c1264900j1M) {
        return C1264900j1M.LIZ(c1264900j1M, this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, null, null, this.LLILZIL, 0, 176);
    }
}
