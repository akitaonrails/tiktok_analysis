package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mEW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388380mEW {
    public final Function0<Unit> LIZ;
    public volatile TuxSheet LIZIZ;
    public volatile View LIZJ;
    public volatile AwS600S0100000_21 LIZLLL;
    public volatile boolean LJ;

    public final void LIZ() {
        Unit unit;
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        try {
            TuxSheet tuxSheet = this.LIZIZ;
            if (tuxSheet != null) {
                tuxSheet.dismissAllowingStateLoss();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        try {
            this.LIZ.invoke();
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
    }

    public C1388380mEW(AwS571S0100000_27 awS571S0100000_27) {
        this.LIZ = awS571S0100000_27;
    }
}
