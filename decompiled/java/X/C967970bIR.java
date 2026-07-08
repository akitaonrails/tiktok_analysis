package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967970bIR extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ C954780axA LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967970bIR(C966020bFI c966020bFI, C954780axA c954780axA) {
        super(1);
        this.LL = c966020bFI;
        this.LLILLJJLI = c954780axA;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LLFF(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
