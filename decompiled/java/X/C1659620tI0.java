package X;

import iyl.i3;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0tI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1659620tI0 implements InterfaceC1659200tHK {
    public final Function0<InterfaceC1460000o62> LIZ;

    @Override // X.InterfaceC1659200tHK
    public final void LIZIZ(C1654400t9a c1654400t9a, boolean z, i3 i3Var) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1659620tI0(Function0<? extends InterfaceC1460000o62> function0) {
        this.LIZ = function0;
    }

    @Override // X.InterfaceC1659200tHK
    public final boolean LIZJ(C1654400t9a c1654400t9a, i3 i3Var) {
        if (C1662060tLw.LIZJ(1000L, C1662060tLw.LIZIZ, "NewEditToolbarListViewAdapter")) {
            return true;
        }
        if (i3Var.LLILLL == C1EOF.SAVE_LOCAL) {
            if (C1662060tLw.LIZ(300L, c1654400t9a.LIZ)) {
                return true;
            }
            return false;
        }
        if (C1662060tLw.LIZIZ(c1654400t9a.LIZ)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1659200tHK
    public final void LIZ(C1654400t9a c1654400t9a, boolean z, i3 i3Var) {
        this.LIZ.invoke().Ws(i3Var.LLILLL.getType());
    }
}
