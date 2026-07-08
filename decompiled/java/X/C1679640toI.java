package X;

import androidx.compose.ui.draw.ShadowGraphicsLayerElement;

/* JADX INFO: renamed from: X.0toI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679640toI {
    public static final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, InterfaceC1680710tq1 interfaceC1680710tq1, boolean z, long j, long j2) {
        if (Float.compare(f, 0) > 0 || z) {
            return interfaceC1685750ty9.LIZ(new ShadowGraphicsLayerElement(f, interfaceC1680710tq1, z, j, j2));
        }
        return interfaceC1685750ty9;
    }

    public static InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, InterfaceC1680710tq1 interfaceC1680710tq1, long j, long j2, int i) {
        boolean z;
        long j3 = j2;
        long j4 = j;
        InterfaceC1680710tq1 interfaceC1680710tq12 = interfaceC1680710tq1;
        if ((i & 2) != 0) {
            interfaceC1680710tq12 = C1669430tXp.LIZ;
        }
        if ((i & 4) != 0 && Float.compare(f, 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            j4 = C1679650toJ.LIZ;
        }
        if ((i & 16) != 0) {
            j3 = C1679650toJ.LIZ;
        }
        return LIZ(interfaceC1685750ty9, f, interfaceC1680710tq12, z, j4, j3);
    }
}
