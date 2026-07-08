package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967950bIP extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ C1AZU LLILLJJLI;
    public final /* synthetic */ C969700bLE LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967950bIP(C966020bFI c966020bFI, long j, C1AZU c1azu, C969700bLE c969700bLE) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = c1azu;
        this.LLILLL = c969700bLE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LJII(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
