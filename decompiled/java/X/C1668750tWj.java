package X;

import androidx.compose.ui.draw.PainterElement;

/* JADX INFO: renamed from: X.0tWj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668750tWj {
    public static InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, AbstractC1676270tir abstractC1676270tir, InterfaceC1668050tVb interfaceC1668050tVb, InterfaceC1671600tbK interfaceC1671600tbK, float f, C1685400txa c1685400txa, int i) {
        boolean z;
        C1685400txa c1685400txa2 = c1685400txa;
        float f2 = f;
        InterfaceC1671600tbK interfaceC1671600tbK2 = interfaceC1671600tbK;
        InterfaceC1668050tVb interfaceC1668050tVb2 = interfaceC1668050tVb;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            InterfaceC1668050tVb.LIZ.getClass();
            interfaceC1668050tVb2 = C1668040tVa.LJFF;
        }
        if ((i & 8) != 0) {
            InterfaceC1671600tbK.LIZ.getClass();
            interfaceC1671600tbK2 = C1671610tbL.LJ;
        }
        if ((i & 16) != 0) {
            f2 = 1.0f;
        }
        if ((i & 32) != 0) {
            c1685400txa2 = null;
        }
        return interfaceC1685750ty9.LIZ(new PainterElement(abstractC1676270tir, z, interfaceC1668050tVb2, interfaceC1671600tbK2, f2, c1685400txa2));
    }
}
