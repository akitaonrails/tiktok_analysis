package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Zej, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C904910Zej {
    public final Function1<C898770ZNr, Boolean> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C904910Zej(Function1<? super C898770ZNr, Boolean> function1) {
        this.LIZ = function1;
    }

    public final boolean LIZ(C898770ZNr c898770ZNr) {
        return this.LIZ.invoke(c898770ZNr).booleanValue();
    }
}
