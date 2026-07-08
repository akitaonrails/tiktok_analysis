package X;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.VerticalAlignElement;

/* JADX INFO: renamed from: X.0u1k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687980u1k implements InterfaceC1675480tha {
    public static final C1687980u1k LIZ = new C1687980u1k();

    @Override // X.InterfaceC1675480tha
    public final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1296880jqw c1296880jqw) {
        return interfaceC1685750ty9.LIZ(new VerticalAlignElement(c1296880jqw));
    }

    @Override // X.InterfaceC1675480tha
    public final InterfaceC1685750ty9 LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, float f, boolean z) {
        if (f <= 0.0d) {
            C1679560toA.LIZ("invalid weight; must be greater than zero");
        }
        if (f > Float.MAX_VALUE) {
            f = Float.MAX_VALUE;
        }
        return interfaceC1685750ty9.LIZ(new LayoutWeightElement(f, z));
    }
}
