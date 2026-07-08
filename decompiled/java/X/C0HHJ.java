package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0HHJ, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HHJ extends C09AY implements Function1<C2344009Gk, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HHJ(String str, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C2344009Gk c2344009Gk) {
        C2344009Gk c2344009Gk2 = c2344009Gk;
        c2344009Gk2.LJFF("expression", this.LL);
        c2344009Gk2.LIZJ(this.LLILLJJLI, "final_background_order");
        return Unit.LIZ;
    }
}
