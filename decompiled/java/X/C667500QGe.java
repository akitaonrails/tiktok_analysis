package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0QGe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667500QGe {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2804));
    public static boolean LIZIZ;

    public static C0QGY LIZ() {
        if (LIZIZ) {
            return C0QGY.DEFAULT;
        }
        int iIntValue = ((Number) LIZ.getValue()).intValue();
        return iIntValue != 1 ? iIntValue != 2 ? C0QGY.DEFAULT : C0QGY.ONLY_SHOW_WHEN_KEYBOARD_OPENED : C0QGY.ALWAYS_SHOW;
    }
}
