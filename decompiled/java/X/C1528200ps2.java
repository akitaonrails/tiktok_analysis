package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ps2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1528200ps2 {
    public static void LIZ(Function0 function0) {
        RunnableC1528190ps1 runnableC1528190ps1 = new RunnableC1528190ps1(0.2f, function0);
        System.currentTimeMillis();
        long j = runnableC1528190ps1.LLILZ;
        long j2 = runnableC1528190ps1.LLILZIL;
        long j3 = j + j2;
        runnableC1528190ps1.LLILZ = j2;
        runnableC1528190ps1.LLILZIL = j3;
        runnableC1528190ps1.LLILLL.schedule(new C521630Kcz(runnableC1528190ps1, 1), j3);
    }
}
