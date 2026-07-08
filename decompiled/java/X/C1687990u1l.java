package X;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;

/* JADX INFO: renamed from: X.0u1l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1687990u1l implements InterfaceC1686920u02 {
    public static final C1687990u1l LIZ = new C1687990u1l();

    public static final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1296860jqu c1296860jqu) {
        return interfaceC1685750ty9.LIZ(new HorizontalAlignElement(c1296860jqu));
    }

    @Override // X.InterfaceC1686920u02
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
