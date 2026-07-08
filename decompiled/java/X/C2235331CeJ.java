package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235331CeJ extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2234651CdD LL;
    public final /* synthetic */ C969130bKJ LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235331CeJ(C2234651CdD c2234651CdD, C969130bKJ c969130bKJ, String str) {
        super(0);
        this.LL = c2234651CdD;
        this.LLILLJJLI = c969130bKJ;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ.LLILLL(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
