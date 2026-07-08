package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PZA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PZA {
    public static final C0PZA LIZ = new C0PZA();

    public static String LIZ(String str, C0PSX c0psx) {
        if (Intrinsics.LJFF(str, "switch_tab")) {
            if (c0psx == C0PSX.DEFAULT) {
                return C0PSX.CLICK_TAB.getValue();
            }
            return c0psx.getValue();
        }
        return "";
    }
}
