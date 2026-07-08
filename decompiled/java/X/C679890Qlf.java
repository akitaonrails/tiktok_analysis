package X;

import android.graphics.Rect;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Qlf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679890Qlf {
    public static void LIZ(Float f, Float f2, Float f3, Float f4, Float f5, Rect rect, C679910Qlh c679910Qlh) {
        Number number;
        float f6 = rect.left;
        float f7 = rect.top;
        float f8 = rect.right;
        float f9 = rect.bottom;
        if (f != null) {
            c679910Qlh.LIZ(f6, f7, f8, f9, f.floatValue());
            return;
        }
        if (f2 == null) {
            if (f3 == null) {
                if (f4 == null) {
                    if (f5 == null) {
                        number = 0;
                    } else {
                        number = f5;
                    }
                } else {
                    number = f4;
                }
            } else {
                number = f3;
            }
        } else {
            number = f2;
        }
        float fFloatValue = number.floatValue();
        if (f2 != null && Intrinsics.LJ(f2, f3)) {
            c679910Qlh.LIZ(f6, f7, f8, f9 + ((int) fFloatValue), fFloatValue);
            return;
        }
        if (f4 != null && Intrinsics.LJ(f4, f5)) {
            c679910Qlh.LIZ(f6, f7 - ((int) fFloatValue), f8, f9, fFloatValue);
            return;
        }
        if (f2 != null && Intrinsics.LJ(f2, f4)) {
            c679910Qlh.LIZ(f6, f7, f8 + ((int) fFloatValue), f9, fFloatValue);
            return;
        }
        if (f3 != null && Intrinsics.LJ(f3, f5)) {
            c679910Qlh.LIZ(f6 - ((int) fFloatValue), f7, f8, f9, fFloatValue);
            return;
        }
        if (f2 != null) {
            float f10 = (int) fFloatValue;
            c679910Qlh.LIZ(f6, f7, f8 + f10, f9 + f10, fFloatValue);
            return;
        }
        if (f4 != null) {
            float f11 = (int) fFloatValue;
            c679910Qlh.LIZ(f6, f7 - f11, f8 + f11, f9, fFloatValue);
        } else if (f3 != null) {
            float f12 = (int) fFloatValue;
            c679910Qlh.LIZ(f6 - f12, f7, f8, f9 + f12, fFloatValue);
        } else if (f5 != null) {
            float f13 = (int) fFloatValue;
            c679910Qlh.LIZ(f6 - f13, f7 - f13, f8, f9, fFloatValue);
        } else {
            c679910Qlh.LIZ(f6, f7, f8, f9, 0.0f);
        }
    }
}
