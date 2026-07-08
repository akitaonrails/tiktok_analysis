package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0zws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915600zws {
    public Function0<Unit> LIZ;

    public C1915600zws() {
        this(null);
    }

    public C1915600zws(Object obj) {
        this.LIZ = null;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onNewUserJourneyFinishEvent(C0DNB c0dnb) {
        if (!C622680Oba.LIZ(this)) {
            return;
        }
        C622680Oba.LIZLLL(this);
        Function0<Unit> function0 = this.LIZ;
        if (function0 != null) {
            function0.invoke();
        }
        this.LIZ = null;
    }
}
