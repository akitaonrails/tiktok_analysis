package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VT9, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VT9 {
    public static boolean LIZ;
    public static final C0VT8 LIZIZ = new C0VTB() { // from class: X.0VT8
        @Override // X.C0VTB
        public final void LIZ(String str) {
            if (Intrinsics.LJFF("MTS:LOWPOWER_ON", str)) {
                C0VT9.LIZ = true;
                C0VT7.LIZ().LIZIZ();
            } else {
                if (!Intrinsics.LJFF("MTS:LOWPOWER_OFF", str)) {
                    return;
                }
                C0VT9.LIZ = false;
                C0VT7.LIZ().LIZIZ();
            }
        }
    };
}
