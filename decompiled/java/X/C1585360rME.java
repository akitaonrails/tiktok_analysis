package X;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rME, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1585360rME extends C09AY implements Function0<Set<AbstractC1585310rM9>> {
    public final /* synthetic */ C1585370rMF LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1585360rME(C1585370rMF c1585370rMF) {
        super(0);
        this.LL = c1585370rMF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Set<AbstractC1585310rM9> invoke() {
        return C093Y.LJ(this.LL.LIZ.getValue(), this.LL.LIZ(), this.LL.LIZJ.getValue());
    }
}
