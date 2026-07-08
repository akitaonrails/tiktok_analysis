package X;

import kotlin.jvm.internal.AFwS274S0000000_30;

/* JADX INFO: renamed from: X.13et, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20063713et {
    public static final C13DP LIZ = new C13DP(AFwS274S0000000_30.get$arr$(265));
    public static final C20064013ew LIZIZ = new InterfaceC20063613es() { // from class: X.13ew
        @Override // X.InterfaceC20063613es
        public final float LIZ(float f, float f2, float f3) {
            boolean z;
            float fAbs = Math.abs((f2 + f) - f);
            if (fAbs <= f3) {
                z = true;
            } else {
                z = false;
            }
            float f4 = (0.3f * f3) - (0.0f * fAbs);
            float f5 = f3 - f4;
            if (z && f5 < fAbs) {
                f4 = f3 - fAbs;
            }
            return f - f4;
        }
    };
}
