package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0b3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958570b3H extends C09AY implements Function1<InterfaceC954910axN, Unit> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C958570b3H(boolean z, long j, int i) {
        super(1);
        this.LL = z;
        this.LLILLJJLI = j;
        this.LLILLL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC954910axN interfaceC954910axN) {
        InterfaceC954910axN interfaceC954910axN2 = interfaceC954910axN;
        interfaceC954910axN2.LJIILIIL(Boolean.valueOf(this.LL), "isApplyAllowed");
        interfaceC954910axN2.LJIILIIL(Long.valueOf(this.LLILLJJLI), "groupChannelId");
        interfaceC954910axN2.LJIILIIL(Integer.valueOf(this.LLILLL), "playType");
        return Unit.LIZ;
    }
}
