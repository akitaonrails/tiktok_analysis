package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Mg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C574530Mg7 extends C09AY implements Function0<Unit> {
    public final /* synthetic */ InterfaceC574610MgF LL;
    public final /* synthetic */ float LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C574530Mg7(InterfaceC574610MgF interfaceC574610MgF, float f) {
        super(0);
        this.LL = interfaceC574610MgF;
        this.LLILLJJLI = f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.onCompileProgress(this.LLILLJJLI);
        return Unit.LIZ;
    }
}
