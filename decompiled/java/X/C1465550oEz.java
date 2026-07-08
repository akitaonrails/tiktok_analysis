package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465550oEz {
    public static int LIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "story_edit_no_exit_save_draft", true);
    }

    public static boolean LIZIZ(InterfaceC1465590oF3 interfaceC1465590oF3) {
        if (Intrinsics.LJFF(interfaceC1465590oF3, C1465640oF8.LIZ)) {
            if (LIZ() == 3) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(interfaceC1465590oF3, C1465630oF7.LIZ)) {
            if (LIZ() == 3) {
                return true;
            }
            return false;
        }
        if (Intrinsics.LJFF(interfaceC1465590oF3, C1465670oFB.LIZ)) {
            if (LIZ() != 2) {
                return true;
            }
            return false;
        }
        if (!Intrinsics.LJFF(interfaceC1465590oF3, new InterfaceC1465590oF3() { // from class: X.0oF9
        }) && !Intrinsics.LJFF(interfaceC1465590oF3, C1465660oFA.LIZ)) {
            throw new C1954807lC();
        }
        if (LIZ() == 2 || LIZ() == 3) {
            return true;
        }
        return false;
    }
}
