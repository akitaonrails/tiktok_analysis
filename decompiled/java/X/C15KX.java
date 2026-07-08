package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15KX, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15KX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C15KT LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15KX(C15KT c15kt, int i, int i2) {
        super(0);
        this.LL = c15kt;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LLLILZ(this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
