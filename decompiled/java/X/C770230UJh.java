package X;

import com.bytedance.android.livesdkapi.host.IHostAction;

/* JADX INFO: renamed from: X.0UJh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770230UJh {
    public static final C770230UJh LIZ = new C770230UJh();

    public static boolean LIZLLL() {
        return ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isSupportFoldDevice();
    }

    public static int LIZ() {
        if (LIZLLL() && LJ()) {
            return 360;
        }
        return (int) C497740JfY.LJJI(C497740JfY.LJIIZILJ());
    }

    public static int LIZIZ() {
        return (LIZLLL() && LJ()) ? Math.min(((int) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) - 32, 720) : (int) C497740JfY.LJJI(C497740JfY.LJIIZILJ());
    }

    public static int LIZJ() {
        return (LIZLLL() && LJ()) ? Math.min(((int) C497740JfY.LJJI(C497740JfY.LJIILLIIL())) - 32, 720) : ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ())) - 32;
    }

    public static boolean LJ() {
        return C20642515q3.LJFF().getConfiguration().orientation == 2;
    }
}
