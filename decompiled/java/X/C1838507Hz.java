package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.07Hz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1838507Hz extends C09AY implements Function0<Boolean> {
    public C1838507Hz() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean z;
        try {
            z = true;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        if (C0C64.LJIILLIIL().LJIIZILJ(31744, 1, 2, "saf_move_main_trackers", true) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
