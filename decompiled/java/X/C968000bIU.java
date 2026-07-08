package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C968000bIU extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C1AZU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C968000bIU(C966020bFI c966020bFI, long j, C1AZU c1azu) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c1azu;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LJJI(this.LL, this.LLILLJJLI);
        return Unit.LIZ;
    }
}
