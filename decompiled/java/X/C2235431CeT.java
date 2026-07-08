package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CeT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2235431CeT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2234651CdD LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2235431CeT(C2234651CdD c2234651CdD, String str, boolean z) {
        super(0);
        this.LL = c2234651CdD;
        this.LLILLJJLI = z;
        this.LLILLL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ.LJJIZ(this.LLILLL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
