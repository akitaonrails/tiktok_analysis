package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967940bIO extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1AZU LLILLJJLI;
    public final /* synthetic */ C2231141CUe LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967940bIO(C966020bFI c966020bFI, String str, C1AZU c1azu, C2231141CUe c2231141CUe) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c1azu;
        this.LLILLL = c2231141CUe;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LJIIJ(this.LL, this.LLILLJJLI, this.LLILLL);
        return Unit.LIZ;
    }
}
