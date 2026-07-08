package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Emi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C374780Emi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C374770Emh LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ float LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C374780Emi(C374770Emh c374770Emh, float f, float f2) {
        super(0);
        this.LL = c374770Emh;
        this.LLILLJJLI = f;
        this.LLILLL = f2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C374770Emh c374770Emh = this.LL;
        if (c374770Emh.LLJILJILJ) {
            c374770Emh.LIZIZ(this.LLILLJJLI, this.LLILLL);
            this.LL.LIZLLL();
        }
        return Unit.LIZ;
    }
}
