package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS389S0200000_23;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0pyt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532450pyt extends C09AY implements Function0<Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C1532300pye LLILLJJLI;
    public final /* synthetic */ InterfaceC1532520pz0<Object, C1532340pyi> LLILLL;
    public final /* synthetic */ Function0<Boolean> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Object LLILZLL;
    public final /* synthetic */ Function2<Boolean, C1532340pyi, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1532450pyt(boolean z, C1532300pye c1532300pye, InterfaceC1532520pz0 interfaceC1532520pz0, AwS567S0100000_23 awS567S0100000_23, String str, Object obj, Function2 function2) {
        super(0);
        this.LL = z;
        this.LLILLJJLI = c1532300pye;
        this.LLILLL = interfaceC1532520pz0;
        this.LLILZ = awS567S0100000_23;
        this.LLILZIL = str;
        this.LLILZLL = obj;
        this.LLIZ = function2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (!this.LL || this.LLILLJJLI.LJIJ(this.LLILLL, this.LLILZ)) {
            this.LLILLJJLI.LJIILJJIL.add(this.LLILZIL);
            InterfaceC1532520pz0<Object, C1532340pyi> interfaceC1532520pz0 = this.LLILLL;
            interfaceC1532520pz0.LJ(new AwS389S0200000_23(this.LLILLJJLI, this.LLIZ, interfaceC1532520pz0, 16), this.LLILZLL);
        }
        return Unit.LIZ;
    }
}
