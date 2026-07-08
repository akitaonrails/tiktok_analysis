package X;

import kotlin.jvm.internal.AwS59S0001000_17;

/* JADX INFO: renamed from: X.0f69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1114110f69 {
    public static volatile boolean LIZ;
    public static final ThreadLocal<Integer> LIZIZ = new ThreadLocal<>();

    public static final void LIZ(int i) {
        AwS59S0001000_17 awS59S0001000_17 = new AwS59S0001000_17(i, 0);
        if (LIZ) {
            awS59S0001000_17.invoke();
        }
    }

    public static final void LIZIZ(int i) {
        AwS59S0001000_17 awS59S0001000_17 = new AwS59S0001000_17(i, 1);
        if (LIZ) {
            awS59S0001000_17.invoke();
        }
    }
}
