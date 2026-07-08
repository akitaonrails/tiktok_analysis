package X;

import androidx.compose.foundation.layout.OffsetElement;
import androidx.compose.foundation.layout.OffsetPxElement;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS1S0000002_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0u2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688600u2k {
    public static final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Function1<? super InterfaceC1690500u5o, C1676820tjk> function1) {
        return interfaceC1685750ty9.LIZ(new OffsetPxElement(function1, new AwS604S0100000_25((Function1) function1, (Function1<? super EnumC1678550tmX, Boolean>) 647), true));
    }

    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new OffsetElement(f, f2, false, new AwS1S0000002_25(f, f2, 3)));
    }

    public static final InterfaceC1685750ty9 LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new OffsetElement(f, f2, true, new AwS1S0000002_25(f, f2, 4)));
    }

    public static InterfaceC1685750ty9 LIZLLL(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return LIZJ(interfaceC1685750ty9, f, f2);
    }
}
