package X;

import Y.ARunnableS106S0100000_6;
import android.os.Handler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Gfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C421550Gfx {
    public final Handler LIZ;
    public final boolean LIZIZ;

    public final void LIZ(Function0<Unit> function0) {
        if (this.LIZIZ) {
            function0.invoke();
        } else {
            C786410Ut5.LJJZZIII(this.LIZ, new ARunnableS106S0100000_6((Function0) function0, 303));
        }
    }

    public C421550Gfx(Handler handler, boolean z) {
        this.LIZ = handler;
        this.LIZIZ = z;
    }
}
