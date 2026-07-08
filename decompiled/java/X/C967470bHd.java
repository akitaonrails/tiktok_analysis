package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bHd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C967470bHd extends C09AY implements Function0<Unit> {
    public final /* synthetic */ AbstractC967230bHF<T> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C967470bHd(AbstractC967230bHF<T> abstractC967230bHF) {
        super(0);
        this.LL = abstractC967230bHF;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.LJ();
        this.LL.LIZ.set(false);
        return Unit.LIZ;
    }
}
