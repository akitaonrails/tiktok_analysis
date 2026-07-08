package X;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NCF, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCF extends C09AY implements Function1<WeakReference<InterfaceC585880MyQ>, Boolean> {
    public final /* synthetic */ InterfaceC585880MyQ LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NCF(InterfaceC585880MyQ interfaceC585880MyQ) {
        super(1);
        this.LL = interfaceC585880MyQ;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(WeakReference<InterfaceC585880MyQ> weakReference) {
        boolean z;
        WeakReference<InterfaceC585880MyQ> weakReference2 = weakReference;
        if (weakReference2.get() != null && !Intrinsics.LJFF(weakReference2.get(), this.LL)) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
