package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1AXp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181071AXp extends C09AY implements Function1<String, Unit> {
    public final /* synthetic */ C1AXM LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181071AXp(C1AXM c1axm) {
        super(1);
        this.LL = c1axm;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(String str) {
        String strLLIIII = this.LL.LLIIII(359);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL.LJLLL());
        sbLIZ.append(':');
        sbLIZ.append(str);
        C1AZW.LJIIJ(12, strLLIIII, C2188811AlT.LIZIZ(sbLIZ), null, null);
        return Unit.LIZ;
    }
}
