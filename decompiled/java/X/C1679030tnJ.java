package X;

import androidx.compose.ui.layout.LayoutIdElement;

/* JADX INFO: renamed from: X.0tnJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679030tnJ {
    public static final Object LIZ(InterfaceC1673370teB interfaceC1673370teB) {
        InterfaceC1679180tnY interfaceC1679180tnY;
        Object objLJJJ = interfaceC1673370teB.LJJJ();
        if (!(objLJJJ instanceof InterfaceC1679180tnY) || (interfaceC1679180tnY = (InterfaceC1679180tnY) objLJJJ) == null) {
            return null;
        }
        return interfaceC1679180tnY.getLayoutId();
    }

    public static final InterfaceC1685750ty9 LIZIZ(InterfaceC1685750ty9 interfaceC1685750ty9, Object obj) {
        return interfaceC1685750ty9.LIZ(new LayoutIdElement(obj));
    }
}
