package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0jKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277020jKu extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1276910jKj LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1277020jKu(C1276910jKj c1276910jKj) {
        super(0);
        this.LL = c1276910jKj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C20441214yg.LIZIZ(this.LL.LLILZIL, "seiUpdateHandler: invalidateSei");
        InterfaceC1276380jJs interfaceC1276380jJs = this.LL.LLJJJJ;
        if (interfaceC1276380jJs != null) {
            interfaceC1276380jJs.LIZIZ();
        }
        return Unit.LIZ;
    }
}
