package X;

import android.view.KeyEvent;
import androidx.compose.foundation.ClickableElement;
import androidx.compose.foundation.CombinedClickableElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0OuS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C634380OuS {
    public static final boolean LJFF(KeyEvent keyEvent) {
        long jLIZ = C634390OuT.LIZ(keyEvent.getKeyCode());
        if (C20069013fk.LIZ(jLIZ, C20069013fk.LJFF) || C20069013fk.LIZ(jLIZ, C20069013fk.LJIIIIZZ) || C20069013fk.LIZ(jLIZ, C20069013fk.LJIIL)) {
            return true;
        }
        return C20069013fk.LIZ(jLIZ, C20069013fk.LJII);
    }

    public static InterfaceC1685750ty9 LIZJ(InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, String str, Function0 function0, int i) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return C1685720ty6.LIZ(interfaceC1685750ty9, C1684360tvu.LIZ, new C634350OuP(z, str, null, function0));
    }

    public static InterfaceC1685750ty9 LJ(C1685760tyA c1685760tyA, boolean z, Function0 function0, Function0 function02, Function0 function03, int i) {
        Function0 function04 = function02;
        Function0 function05 = function0;
        boolean z2 = z;
        boolean z3 = true;
        if ((i & 1) != 0) {
            z2 = true;
        }
        if ((i & 16) != 0) {
            function05 = null;
        }
        if ((i & 32) != 0) {
            function04 = null;
        }
        if ((i & 64) == 0) {
            z3 = false;
        }
        return C1685720ty6.LIZ(c1685760tyA, C1684360tvu.LIZ, new C634360OuQ(z2, null, null, function05, function04, function03, null, z3));
    }

    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1680320tpO interfaceC1680320tpO, boolean z, String str, C20279814Wu c20279814Wu, Function0<Unit> function0) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ;
        if (interfaceC1680320tpO instanceof InterfaceC1693230uAD) {
            interfaceC1685750ty9LIZIZ = new ClickableElement(interfaceC595010NVj, (InterfaceC1693230uAD) interfaceC1680320tpO, z, str, c20279814Wu, function0);
        } else if (interfaceC1680320tpO == null) {
            interfaceC1685750ty9LIZIZ = new ClickableElement(interfaceC595010NVj, null, z, str, c20279814Wu, function0);
        } else if (interfaceC595010NVj != null) {
            interfaceC1685750ty9LIZIZ = C1680300tpM.LIZ(InterfaceC1685750ty9.LIZ, interfaceC595010NVj, interfaceC1680320tpO).LIZ(new ClickableElement(interfaceC595010NVj, null, z, str, c20279814Wu, function0));
        } else {
            interfaceC1685750ty9LIZIZ = C1685720ty6.LIZIZ(InterfaceC1685750ty9.LIZ, new C634330OuN(interfaceC1680320tpO, z, str, c20279814Wu, function0));
        }
        return interfaceC1685750ty9.LIZ(interfaceC1685750ty9LIZIZ);
    }

    public static final InterfaceC1685750ty9 LIZLLL(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1680320tpO interfaceC1680320tpO, boolean z, String str, C20279814Wu c20279814Wu, String str2, Function0<Unit> function0, Function0<Unit> function02, boolean z2, Function0<Unit> function03) {
        InterfaceC1685750ty9 interfaceC1685750ty9LIZIZ;
        if (interfaceC1680320tpO instanceof InterfaceC1693230uAD) {
            interfaceC1685750ty9LIZIZ = new CombinedClickableElement((InterfaceC1693230uAD) interfaceC1680320tpO, interfaceC595010NVj, c20279814Wu, str, str2, function03, function0, function02, z, z2);
        } else if (interfaceC1680320tpO == null) {
            interfaceC1685750ty9LIZIZ = new CombinedClickableElement(null, interfaceC595010NVj, c20279814Wu, str, str2, function03, function0, function02, z, z2);
        } else if (interfaceC595010NVj != null) {
            interfaceC1685750ty9LIZIZ = C1680300tpM.LIZ(InterfaceC1685750ty9.LIZ, interfaceC595010NVj, interfaceC1680320tpO).LIZ(new CombinedClickableElement(null, interfaceC595010NVj, c20279814Wu, str, str2, function03, function0, function02, z, z2));
        } else {
            interfaceC1685750ty9LIZIZ = C1685720ty6.LIZIZ(InterfaceC1685750ty9.LIZ, new C634370OuR(interfaceC1680320tpO, z, str, c20279814Wu, function03, str2, function0, function02, z2));
        }
        return interfaceC1685750ty9.LIZ(interfaceC1685750ty9LIZIZ);
    }
}
