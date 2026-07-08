package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BeY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C293280BeY {
    public static final boolean LIZ;

    static {
        LIZ = C0C64.LJIILLIIL().LJIJ(31744, 0, "show_suggest_search_words", true) != 0;
    }

    public static final int LIZ(Function0<Boolean> function0, Function0<Boolean> function02) {
        if (function0.invoke().booleanValue()) {
            return function02.invoke().booleanValue() ? 1 : 0;
        }
        if (LIZ) {
            return 1;
        }
        return 0;
    }
}
