package X;

import androidx.compose.foundation.gestures.DraggableElement;

/* JADX INFO: renamed from: X.05ao, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1380805ao {
    public static final C05PL LIZ = new C05PL(null);
    public static final C05PK LIZIZ = new C05PK(null);

    public static InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, InterfaceC1381005aq interfaceC1381005aq, EnumC1684030tvN enumC1684030tvN, boolean z, InterfaceC595010NVj interfaceC595010NVj, boolean z2, InterfaceC1631620sYq interfaceC1631620sYq, boolean z3, int i) {
        boolean z4 = z3;
        InterfaceC1631620sYq interfaceC1631620sYq2 = interfaceC1631620sYq;
        boolean z5 = z2;
        InterfaceC595010NVj interfaceC595010NVj2 = interfaceC595010NVj;
        boolean z6 = z;
        if ((i & 4) != 0) {
            z6 = true;
        }
        C05PL c05pl = null;
        if ((i & 8) != 0) {
            interfaceC595010NVj2 = null;
        }
        if ((i & 16) != 0) {
            z5 = false;
        }
        if ((i & 32) != 0) {
            c05pl = LIZ;
        }
        if ((i & 64) != 0) {
            interfaceC1631620sYq2 = LIZIZ;
        }
        if ((i & 128) != 0) {
            z4 = false;
        }
        return interfaceC1685750ty9.LIZ(new DraggableElement(interfaceC1381005aq, enumC1684030tvN, z6, interfaceC595010NVj2, z5, c05pl, interfaceC1631620sYq2, z4));
    }
}
