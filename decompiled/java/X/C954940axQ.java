package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0axQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954940axQ extends C09AY implements Function1<InterfaceC954910axN, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C954940axQ(String str, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC954910axN interfaceC954910axN) {
        InterfaceC954910axN interfaceC954910axN2 = interfaceC954910axN;
        interfaceC954910axN2.LJIILIIL(this.LL, "source");
        interfaceC954910axN2.LJIILIIL(Integer.valueOf(this.LLILLJJLI), "retryTime");
        return Unit.LIZ;
    }
}
