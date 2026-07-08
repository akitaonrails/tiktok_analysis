package X;

import androidx.compose.foundation.layout.PaddingElement;
import androidx.compose.foundation.layout.PaddingValuesElement;
import kotlin.jvm.internal.AwS0S0000004_25;
import kotlin.jvm.internal.AwS1S0000002_25;
import kotlin.jvm.internal.AwS265S0000000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tsw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1682520tsw {
    public static final C1682530tsx LIZ(float f, float f2) {
        return new C1682530tsx(f, f2, f, f2);
    }

    public static final float LJFF(InterfaceC1679150tnV interfaceC1679150tnV, EnumC1671200tag enumC1671200tag) {
        if (enumC1671200tag == EnumC1671200tag.Ltr) {
            return interfaceC1679150tnV.LIZJ(enumC1671200tag);
        }
        return interfaceC1679150tnV.LIZ(enumC1671200tag);
    }

    public static final float LJI(InterfaceC1679150tnV interfaceC1679150tnV, EnumC1671200tag enumC1671200tag) {
        if (enumC1671200tag == EnumC1671200tag.Ltr) {
            return interfaceC1679150tnV.LIZ(enumC1671200tag);
        }
        return interfaceC1679150tnV.LIZJ(enumC1671200tag);
    }

    public static final InterfaceC1685750ty9 LJII(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1679150tnV interfaceC1679150tnV) {
        return interfaceC1685750ty9.LIZ(new PaddingValuesElement(interfaceC1679150tnV, new AwS604S0100000_25(interfaceC1679150tnV, 10)));
    }

    public static final InterfaceC1685750ty9 LJIIIIZZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f) {
        return interfaceC1685750ty9.LIZ(new PaddingElement(f, f, f, f, true, new AwS265S0000000_25(f, 0)));
    }

    public static C1682530tsx LIZIZ(float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return new C1682530tsx(f, f2, f, f2);
    }

    public static final InterfaceC1685750ty9 LJIIIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2) {
        return interfaceC1685750ty9.LIZ(new PaddingElement(f, f2, f, f2, true, new AwS1S0000002_25(f, f2, 0)));
    }

    public static InterfaceC1685750ty9 LJIIJ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        return LJIIIZ(interfaceC1685750ty9, f, f2);
    }

    public static C1682530tsx LIZJ(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return new C1682530tsx(f, f2, f3, f4);
    }

    public static final InterfaceC1685750ty9 LIZLLL(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4) {
        return interfaceC1685750ty9.LIZ(new PaddingElement(f, f2, f3, f4, false, new AwS0S0000004_25(f, f2, f3, f4, 0)));
    }

    public static final InterfaceC1685750ty9 LJIIJJI(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4) {
        return interfaceC1685750ty9.LIZ(new PaddingElement(f, f2, f3, f4, true, new AwS0S0000004_25(f, f2, f3, f4, 1)));
    }

    public static InterfaceC1685750ty9 LJ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return LIZLLL(interfaceC1685750ty9, f, f2, f3, f4);
    }

    public static InterfaceC1685750ty9 LJIIL(InterfaceC1685750ty9 interfaceC1685750ty9, float f, float f2, float f3, float f4, int i) {
        if ((i & 1) != 0) {
            f = 0;
        }
        if ((i & 2) != 0) {
            f2 = 0;
        }
        if ((i & 4) != 0) {
            f3 = 0;
        }
        if ((i & 8) != 0) {
            f4 = 0;
        }
        return LJIIJJI(interfaceC1685750ty9, f, f2, f3, f4);
    }
}
