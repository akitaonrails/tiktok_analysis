package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0MxP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585250MxP {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;
    public static volatile boolean LIZJ;
    public static volatile RunnableC325920Cq6 LIZLLL;

    public static final void LIZ(String str) {
        if (((Number) C279850Axz.LIZ.getValue()).intValue() <= 0 || LIZJ || LIZLLL == null) {
            return;
        }
        if (str != null && Intrinsics.LJFF(str, C0ND6.LIZJ)) {
            return;
        }
        LIZJ = true;
        RunnableC325920Cq6 runnableC325920Cq6 = LIZLLL;
        if (runnableC325920Cq6 != null) {
            runnableC325920Cq6.run();
        }
    }
}
