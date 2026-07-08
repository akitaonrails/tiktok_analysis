package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1EBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2277201EBi extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC2277241EBm LL;
    public final /* synthetic */ Function1<InterfaceC2277241EBm, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2277201EBi(InterfaceC2277241EBm interfaceC2277241EBm, Function1<? super InterfaceC2277241EBm, Unit> function1) {
        super(0);
        this.LL = interfaceC2277241EBm;
        this.LLILLJJLI = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC2277241EBm interfaceC2277241EBm = this.LL;
        if (interfaceC2277241EBm != null) {
            this.LLILLJJLI.invoke(interfaceC2277241EBm);
        }
        return Unit.LIZ;
    }
}
