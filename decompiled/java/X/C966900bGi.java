package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C966900bGi extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ C966020bFI LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C966900bGi(C966020bFI c966020bFI, int i) {
        super(1);
        this.LL = c966020bFI;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LLD(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
