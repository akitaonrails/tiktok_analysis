package androidx.lifecycle;

import X.InterfaceC1451105m9;
import X.InterfaceC1635506an;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC1635506an {
    public final /* synthetic */ Function1 function;

    public CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(Function1 function1) {
        this.function = function1;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
