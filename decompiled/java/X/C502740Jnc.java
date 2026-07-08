package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502740Jnc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0KVZ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C502740Jnc(C0KVZ c0kvz) {
        super(0);
        this.LL = c0kvz;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.invalidate();
        return Unit.LIZ;
    }
}
