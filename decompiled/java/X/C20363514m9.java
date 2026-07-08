package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.14m9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20363514m9 extends C09AY implements Function1<Boolean, Unit> {
    public final /* synthetic */ C20363214m6 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20363514m9(C20363214m6 c20363214m6) {
        super(1);
        this.LL = c20363214m6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (!bool.booleanValue()) {
            this.LL.LLJILJIL.clear();
            this.LL.LLJILJILJ = false;
        }
        return Unit.LIZ;
    }
}
