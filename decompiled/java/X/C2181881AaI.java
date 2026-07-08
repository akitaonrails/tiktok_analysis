package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1AaI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2181881AaI extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C2181461AZc LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2181881AaI(C2181461AZc c2181461AZc, String str) {
        super(0);
        this.LL = c2181461AZc;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C2181481AZe c2181481AZe = this.LL.LLJLL;
        if (c2181481AZe != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRTCView:");
            sbLIZ.append(this.LLILLJJLI);
            c2181481AZe.LJJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
