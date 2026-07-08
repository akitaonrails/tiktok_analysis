package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bIH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967870bIH extends C09AY implements Function1<InterfaceC965990bFF, Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967870bIH(String str) {
        super(1);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC965990bFF interfaceC965990bFF) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSubscribeAuxStreamFailed, streamId: ");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("RustLinker", C2188811AlT.LIZIZ(sbLIZ));
        interfaceC965990bFF.LJLILLLLZI(this.LL);
        return Unit.LIZ;
    }
}
