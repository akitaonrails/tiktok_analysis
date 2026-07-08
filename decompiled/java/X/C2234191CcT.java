package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1CcT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2234191CcT extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2234651CdD LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2234191CcT(C2234651CdD c2234651CdD, int i, boolean z, String str) {
        super(0);
        this.LL = c2234651CdD;
        this.LLILLJJLI = i;
        this.LLILLL = z;
        this.LLILZ = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LIZ.LJJ(this.LLILLJJLI, this.LLILZ, this.LLILLL);
        return Unit.LIZ;
    }
}
