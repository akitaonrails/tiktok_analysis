package X;

import android.content.Context;

/* JADX INFO: renamed from: X.1DHU, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DHU {
    public static boolean LJ;
    public static boolean LJFF;
    public boolean LIZ = true;
    public final Context LIZIZ;
    public final C1DHX LIZJ;
    public final InterfaceC2208871Bcj LIZLLL;

    public final boolean LIZIZ() {
        return this.LIZLLL.LIZ(this.LIZIZ, this.LIZJ);
    }

    public static boolean LIZ(Context context) {
        if (C2206701BYe.LIZ(context).LIZ.getInt("key_camera_shake_mode", 0) == 0) {
            C2206701BYe.LIZ(context).LIZIZ(2);
            LJ = false;
            LJFF = false;
            return false;
        }
        if (C2206701BYe.LIZ(context).LIZ.getInt("key_camera_shake_mode", 0) != 1) {
            return false;
        }
        return true;
    }

    public C1DHU(Context context, C1DHX c1dhx, InterfaceC2208871Bcj interfaceC2208871Bcj) {
        this.LIZIZ = context;
        this.LIZJ = c1dhx;
        this.LIZLLL = interfaceC2208871Bcj;
    }
}
