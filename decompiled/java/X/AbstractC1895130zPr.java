package X;

import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zPr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1895130zPr implements InterfaceC1895290zQ7 {
    public abstract BaseTouchPointDataVM LJIIIZ();

    @Override // X.InterfaceC1895290zQ7
    public final void LJIIIIZZ(EnumC1895270zQ5 enumC1895270zQ5) {
        BaseTouchPointDataVM baseTouchPointDataVMLJIIIZ = LJIIIZ();
        if (baseTouchPointDataVMLJIIIZ != null) {
            baseTouchPointDataVMLJIIIZ.setState(new AwS607S0100000_28(enumC1895270zQ5, 23));
        }
    }
}
