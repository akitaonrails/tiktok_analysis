package X;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11HK, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C11HK implements C11HL, InterfaceC1635506an {
    public final /* synthetic */ Function0 LL;

    public C11HK(Function0 function0) {
        this.LL = function0;
    }

    @Override // X.C11HL
    public final /* synthetic */ void LIZ() {
        this.LL.invoke();
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return this.LL;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11HL) || !(obj instanceof InterfaceC1635506an)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((InterfaceC1635506an) obj).getFunctionDelegate());
    }
}
