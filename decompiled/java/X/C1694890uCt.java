package X;

import androidx.compose.foundation.text.handwriting.StylusHandwritingElement;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uCt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694890uCt {
    public static final C1696090uEp LIZ;

    static {
        float f = 40;
        float f2 = 10;
        LIZ = new C1696090uEp(f2, f, f2, f);
    }

    public static final InterfaceC1685750ty9 LIZ(C1685760tyA c1685760tyA, boolean z, boolean z2, Function0 function0) {
        if (z) {
            InterfaceC1685750ty9 interfaceC1685750ty9 = c1685760tyA;
            if (C1694930uCx.LIZ) {
                if (z2) {
                    StylusHoverIconModifierElement stylusHoverIconModifierElement = new StylusHoverIconModifierElement(C1692800u9W.LIZIZ, LIZ);
                    c1685760tyA.getClass();
                    interfaceC1685750ty9 = stylusHoverIconModifierElement;
                }
                return interfaceC1685750ty9.LIZ(new StylusHandwritingElement(function0));
            }
            return c1685760tyA;
        }
        return c1685760tyA;
    }
}
