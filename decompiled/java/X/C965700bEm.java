package X;

import android.os.Looper;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bEm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C965700bEm {
    public static volatile boolean LIZ;
    public static boolean LIZIZ;

    static {
        if (((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).isOffline()) {
            C965770bEt c965770bEt = new C965770bEt("init");
            C969310bKb c969310bKb = C969310bKb.LIZLLL;
            if (Intrinsics.LJFF(c969310bKb.LIZIZ, Looper.myLooper())) {
                c965770bEt.invoke();
            } else {
                c969310bKb.LIZ(new RunnableC966320bFm(c965770bEt));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        try {
            C965770bEt c965770bEt2 = new C965770bEt("init");
            C969310bKb c969310bKb2 = C969310bKb.LIZLLL;
            if (Intrinsics.LJFF(c969310bKb2.LIZIZ, Looper.myLooper())) {
                c965770bEt2.invoke();
            } else {
                c969310bKb2.LIZ(new RunnableC966320bFm(c965770bEt2));
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
