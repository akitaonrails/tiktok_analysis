package X;

import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bF6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965900bF6 {
    public static final void LIZ(Function0<Unit> function0) {
        C969310bKb c969310bKb = C969310bKb.LIZLLL;
        if (Intrinsics.LJFF(c969310bKb.LIZIZ, Looper.myLooper())) {
            function0.invoke();
        } else {
            c969310bKb.LIZ(new RunnableC966320bFm(function0));
        }
    }
}
