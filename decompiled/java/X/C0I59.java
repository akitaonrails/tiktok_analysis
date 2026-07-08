package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0I59, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I59 {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(int i, int i2, C0I5A c0i5a) {
        if (((Boolean) C0BB3.LIZ.getValue()).booleanValue() && c0i5a != null) {
            if (c0i5a instanceof C460940I5s) {
                return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))));
            }
            if (c0i5a instanceof C0I83) {
                return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))));
            }
            if (c0i5a instanceof C0I5B) {
                if (i > 0 && i2 > 0) {
                    if (i >= i2) {
                        return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf((int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)) / i) * i2)));
                    }
                    return new Pair(Integer.valueOf((int) ((C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90)) / i2) * i)), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))));
                }
                return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))));
            }
            throw new C1954807lC();
        }
        if (i != 0 && i2 != 0) {
            float f = i / i2;
            if (f <= 0.75f) {
                return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))));
            }
            if (f <= 1.0f) {
                return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf((int) Math.min(Math.max(C418440Gaw.LIZIZ(90) / f, C418440Gaw.LIZIZ(90)), C418440Gaw.LIZIZ(120))));
            }
            return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))), Integer.valueOf((int) Math.min(Math.max(C418440Gaw.LIZIZ(120) / f, C418440Gaw.LIZIZ(40)), C418440Gaw.LIZIZ(90))));
        }
        return new Pair(Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(90))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(120))));
    }
}
