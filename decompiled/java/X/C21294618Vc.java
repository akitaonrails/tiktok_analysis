package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.18Vc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21294618Vc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C18VZ LL;
    public final /* synthetic */ C18UI LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21294618Vc(C18VZ c18vz, C18UI c18ui, boolean z) {
        super(0);
        this.LL = c18vz;
        this.LLILLJJLI = c18ui;
        this.LLILLL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C21295618Vm.LIZ().clear();
        this.LL.y7("success", this.LLILLJJLI);
        C18VZ c18vz = this.LL;
        C18UI c18ui = this.LLILLJJLI;
        if (C18VZ.o7(c18vz, c18ui.LIZIZ, c18ui.LIZ, true)) {
            this.LL.LLJJ.onNext(this.LLILLJJLI);
            this.LL.D5().eT1(this.LLILLJJLI.LIZ);
        } else if (this.LLILLL) {
            this.LL.S6(true, EnumC21295018Vg.UI_ACTION_OPEN_DEFAULT);
        }
        return Unit.LIZ;
    }
}
