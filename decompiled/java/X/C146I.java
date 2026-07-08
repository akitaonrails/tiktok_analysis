package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.146I, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C146I extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C146I(String str) {
        super(0);
        this.LL = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        if (C0CN5.LJII() && !a0.LJJIIZI(this.LL, "main", false)) {
            C146K.LIZJ.put(this.LL, Long.valueOf(System.currentTimeMillis()));
        }
        return Unit.LIZ;
    }
}
