package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967930bIN extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1CXJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967930bIN(C1CXJ c1cxj, String str) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = c1cxj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        interfaceC965990bFF.LJJJZ(C1282000jSw.LJFF(this.LLILLJJLI), this.LL);
        return Unit.LIZ;
    }
}
