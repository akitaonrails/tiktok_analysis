package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS547S0100000_3;

/* JADX INFO: renamed from: X.08EX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08EX<T> implements C01GW<T> {
    public final C01GW<T> LL;

    @Override // X.C01GW
    public final T getValue() {
        return this.LL.getValue();
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LL.isInitialized();
    }

    public C08EX(Function0<? extends T> function0) {
        this.LL = C452501pT.LIZ(EnumC452301pR.PUBLICATION, new AwS547S0100000_3(function0, (Function0<Unit>) 30));
    }
}
