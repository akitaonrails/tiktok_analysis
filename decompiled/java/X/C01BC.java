package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01BC, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01BC {
    public static long LIZJ;
    public static final /* synthetic */ int LIZLLL = 0;
    public int LIZ;
    public Function0<Unit> LIZIZ;

    public static void LIZ(Room room) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscription_sub_only_set_toast");
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        c474500IjALIZ.LIZ();
    }

    public final void LIZIZ(C20743716Ff c20743716Ff, boolean z, int i, Function0<Unit> function0) {
        int i2;
        float f;
        if (z) {
            i2 = this.LIZ & (~i);
        } else {
            i2 = this.LIZ | i;
        }
        this.LIZ = i2;
        if (function0 != null) {
            this.LIZIZ = function0;
        }
        if (c20743716Ff != null) {
            if (i2 == 0) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c20743716Ff);
            c20743716Ff.setAlpha(f);
        }
    }
}
