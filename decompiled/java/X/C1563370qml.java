package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS557S0100000_13;

/* JADX INFO: renamed from: X.0qml, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1563370qml {
    public static final <T> T LIZ(LifecycleOwner lifecycleOwner, EnumC682280QpW enumC682280QpW, Function0<? extends T> function0) {
        if (lifecycleOwner instanceof InterfaceC1563380qmm) {
            return (T) ((InterfaceC1563380qmm) lifecycleOwner).LLLIIL(enumC682280QpW, new AwS557S0100000_13(function0, 112));
        }
        if (!(lifecycleOwner.getLifecycle() instanceof InterfaceC1563360qmk)) {
            return function0.invoke();
        }
        InterfaceC1563360qmk interfaceC1563360qmk = (InterfaceC1563360qmk) lifecycleOwner.getLifecycle();
        if (!interfaceC1563360qmk.LIZIZ()) {
            return function0.invoke();
        }
        return (T) interfaceC1563360qmk.LIZ(enumC682280QpW, function0);
    }
}
