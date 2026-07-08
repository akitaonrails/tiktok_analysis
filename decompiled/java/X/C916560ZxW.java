package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZxW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C916560ZxW {
    public static final EnumC918990a1R LIZ(String str) {
        if (Intrinsics.LJFF(str, "double_zoom_guest")) {
            return EnumC918990a1R.ZOOM_GRID_GUEST;
        }
        if (Intrinsics.LJFF(str, "double_zoom_anchor")) {
            return EnumC918990a1R.ZOOM_GRID_ANCHOR;
        }
        for (EnumC918990a1R enumC918990a1R : EnumC918990a1R.values()) {
            if (Intrinsics.LJFF(enumC918990a1R.getBusinessType(), str)) {
                return enumC918990a1R;
            }
        }
        return EnumC918990a1R.NORMAL;
    }

    public static final boolean LIZIZ(EnumC918990a1R enumC918990a1R) {
        if (!Intrinsics.LJFF(enumC918990a1R.getBusinessType(), EnumC918990a1R.FLOAT.getBusinessType()) && !Intrinsics.LJFF(enumC918990a1R.getBusinessType(), EnumC918990a1R.GRID_FLOAT.getBusinessType())) {
            return false;
        }
        return true;
    }

    public static final boolean LIZJ(String str) {
        for (EnumC918990a1R enumC918990a1R : EnumC918990a1R.values()) {
            if (Intrinsics.LJFF(enumC918990a1R.toString(), str)) {
                return true;
            }
        }
        return false;
    }
}
