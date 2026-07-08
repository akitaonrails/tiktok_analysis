package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0uCr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1694870uCr extends C2217421BqW implements Function1<C1696000uEg, Unit> {
    public final /* synthetic */ InterfaceC1694690uCZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1694870uCr(InterfaceC1694690uCZ interfaceC1694690uCZ) {
        super(1, C1449605lu.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.LL = interfaceC1694690uCZ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C1696000uEg c1696000uEg) {
        float[] fArr = c1696000uEg.LIZ;
        InterfaceC1692950u9l interfaceC1692950u9lLJLIIL = this.LL.LJLIIL();
        if (interfaceC1692950u9lLJLIIL != null && interfaceC1692950u9lLJLIIL.LIZLLL()) {
            interfaceC1692950u9lLJLIIL.LJJIJLIJ(fArr);
        }
        return Unit.LIZ;
    }
}
