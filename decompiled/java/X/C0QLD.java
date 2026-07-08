package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QLD, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QLD {
    public static final void LIZ(String str, String str2, C0QLZ c0qlz) {
        if (!C0BYT.LIZ()) {
            return;
        }
        if (Intrinsics.LJFF(str, EnumC669620QOi.SHOP.getTabName())) {
            if (c0qlz != null) {
                c0qlz.LJFF = str2;
            }
        } else if (Intrinsics.LJFF(str, EnumC669620QOi.TOP.getTabName())) {
            if (c0qlz == null) {
                return;
            }
            c0qlz.LJ = str2;
        } else {
            if (c0qlz == null) {
                return;
            }
            c0qlz.LJFF = str2;
        }
    }

    public static final void LIZIZ(String str, String str2, C0QLZ c0qlz) {
        if (!C0BYT.LIZ()) {
            return;
        }
        if (Intrinsics.LJFF(str, EnumC669620QOi.SHOP.getTabName())) {
            if (c0qlz != null) {
                c0qlz.LIZLLL = str2;
            }
        } else if (Intrinsics.LJFF(str, EnumC669620QOi.TOP.getTabName())) {
            if (c0qlz == null) {
                return;
            }
            c0qlz.LIZJ = str2;
        } else {
            if (c0qlz == null) {
                return;
            }
            c0qlz.LIZLLL = str2;
        }
    }
}
