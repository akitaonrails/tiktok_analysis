package X;

import android.content.Intent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.10PU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10PU extends C09AY implements Function1<C10PV, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ Intent LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10PU(int i, int i2, Intent intent) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = intent;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C10PV c10pv) {
        c10pv.onActivityResult(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
