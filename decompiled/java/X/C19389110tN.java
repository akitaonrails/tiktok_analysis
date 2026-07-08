package X;

import android.os.Build;
import android.view.View;
import android.widget.Magnifier;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10tN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19389110tN {
    public static final /* synthetic */ int LJ = 0;
    public final View LIZ;
    public final C19388410tG LIZIZ;
    public Magnifier LIZJ;
    public boolean LIZLLL;

    public C19389110tN(View view) {
        C19388410tG c19388410tG = new C19388410tG(0);
        this.LIZ = view;
        this.LIZIZ = c19388410tG;
        LIZ(new C19388510tH(this));
    }

    public static void LIZ(Function0 function0) {
        Object c098200Yq;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            try {
                function0.invoke();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
            C189200o6.m1boximpl(c098200Yq);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("executeSafely skipped: sdk=");
        sbLIZ.append(i);
        sbLIZ.append(" < Q");
        C2188811AlT.LIZIZ(sbLIZ);
    }
}
