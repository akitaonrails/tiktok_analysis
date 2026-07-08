package X;

import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0CLz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C312290CLz extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CM3 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C312290CLz(C0CM3 c0cm3) {
        super(0);
        this.LL = c0cm3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C0CM3 c0cm3 = this.LL;
        C0CME c0cme = c0cm3.LIZ;
        boolean z = c0cm3.LIZIZ;
        int i = c0cm3.LIZJ;
        String str = c0cm3.LJFF;
        int i2 = c0cm3.LJ;
        Function0<Unit> function0 = c0cm3.LJI;
        if (z) {
            boolean z2 = i2 == C0CM4.MAIN_THREAD.getType() || (i2 == C0CM4.DEFAULT.getType() && Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper()));
            C0CML cache$launcher_lazy_util_release = c0cme.getCache$launcher_lazy_util_release();
            boolean z3 = !z2;
            if (function0 != null) {
                C0CM8 c0cm8 = new C0CM8(i, c0cme, str, function0, z3);
                cache$launcher_lazy_util_release.getClass();
                if (i == C0CMJ.HIGH_PRIORITY.getType()) {
                    ((CopyOnWriteArrayList) cache$launcher_lazy_util_release.LIZLLL.getValue()).add(c0cm8);
                } else if (i == C0CMJ.TOP_PRIORITY.getType()) {
                    ((CopyOnWriteArrayList) cache$launcher_lazy_util_release.LJFF.getValue()).add(c0cm8);
                } else {
                    ((CopyOnWriteArrayList) cache$launcher_lazy_util_release.LJ.getValue()).add(0, c0cm8);
                }
            }
        } else if (function0 != null) {
            function0.invoke();
        }
        return Unit.LIZ;
    }
}
