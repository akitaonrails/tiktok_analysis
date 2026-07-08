package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0zwr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915590zwr {
    public Function0<Unit> LIZ;

    public C1915590zwr() {
        this(null);
    }

    public C1915590zwr(Object obj) {
        this.LIZ = null;
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onLoginPageCloseEvent(C0T0F c0t0f) {
        if (C622680Oba.LIZ(this)) {
            C622680Oba.LIZLLL(this);
            Function0<Unit> function0 = this.LIZ;
            if (function0 != null) {
                function0.invoke();
            }
            this.LIZ = null;
        }
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onPostRegistrationFinishEvent(C1915620zwu c1915620zwu) {
        if (C622680Oba.LIZ(this)) {
            C622680Oba.LIZLLL(this);
            Function0<Unit> function0 = this.LIZ;
            if (function0 != null) {
                function0.invoke();
            }
            this.LIZ = null;
        }
    }
}
