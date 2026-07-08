package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.ttnet.tnc.TNCManager;

/* JADX INFO: renamed from: X.0oxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1493430oxx {
    public static volatile InterfaceC1493510oy5 LIZ;
    public static final C1493450oxz LIZIZ;
    public static boolean LIZJ;
    public static volatile boolean LIZLLL;
    public static String LJ;

    static {
        new C1493520oy6();
        LIZIZ = new C1493450oxz();
    }

    public static boolean LIZ() {
        if (LIZ != null && C1493780oyW.LIZIZ == 9) {
            Logger.debug();
            C1493780oyW.LIZIZ = -1;
        }
        if (LIZ == null && !C1490250osp.LJFF.get()) {
            Logger.debug();
            TNCManager.LJI().LJIIIIZZ();
            C1493780oyW.LIZIZ = 9;
            return false;
        }
        if (LIZ != null && !LIZ.LJFF()) {
            return false;
        }
        if (!LIZJ || LIZLLL) {
            return true;
        }
        C1493780oyW.LIZIZ = 7;
        C1493780oyW.LIZJ = LJ;
        return false;
    }
}
