package X;

import androidx.compose.ui.focus.FocusTargetNode;
import p2.j1;

/* JADX INFO: renamed from: X.13eF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20059713eF {
    public static final C20045513bx LIZ(FocusTargetNode focusTargetNode) {
        C20053713dH c20053713dH;
        InterfaceC20055013dU interfaceC20055013dU;
        InterfaceC20060313eL focusOwner;
        j1 j1Var = focusTargetNode.LL.LLIZLLLIL;
        if (j1Var != null && (c20053713dH = j1Var.LLJILJILJ) != null && (interfaceC20055013dU = c20053713dH.LLJILLL) != null && (focusOwner = interfaceC20055013dU.getFocusOwner()) != null) {
            return focusOwner.LJII();
        }
        return null;
    }
}
