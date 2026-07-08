package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0axF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954830axF extends C09AY implements Function1<InterfaceC954910axN, Unit> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ long LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ InterfaceC954180awC LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C954830axF(int i, int i2, long j, int i3, InterfaceC954180awC interfaceC954180awC) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = j;
        this.LLILZ = i3;
        this.LLILZIL = interfaceC954180awC;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC954910axN interfaceC954910axN) {
        InterfaceC954910axN interfaceC954910axN2 = interfaceC954910axN;
        interfaceC954910axN2.LJIILIIL(Integer.valueOf(this.LL), "reply_status");
        interfaceC954910axN2.LJIILIIL(Integer.valueOf(this.LLILLJJLI), "source_type");
        interfaceC954910axN2.LJIILIIL(Long.valueOf(this.LLILLL), "from_uid");
        interfaceC954910axN2.LJIILIIL(Integer.valueOf(this.LLILZ), "rival_reply_status");
        interfaceC954910axN2.LJIILL(this.LLILZIL);
        return Unit.LIZ;
    }
}
