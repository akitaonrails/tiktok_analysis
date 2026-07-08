package X;

import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: X.0pXk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1515620pXk<T> {
    public final C1515820pY4<T> LIZ;
    public final LinkedBlockingQueue<C1515640pXm> LIZIZ = new LinkedBlockingQueue<>();
    public volatile List<C1515640pXm> LIZJ;

    public C1515620pXk(C1515820pY4<T> c1515820pY4) {
        this.LIZ = c1515820pY4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean LIZ(C0POE c0poe, C1515640pXm c1515640pXm, String str) {
        InterfaceC1196330hEl interfaceC1196330hEl;
        int i = c1515640pXm.LIZ;
        if (i != -1) {
            if (i != 0) {
                if (i == 1) {
                    c0poe.onComplete();
                    return true;
                }
                return false;
            }
            Object obj = c1515640pXm.LIZIZ;
            if ((obj instanceof InterfaceC1196330hEl) && (interfaceC1196330hEl = (InterfaceC1196330hEl) obj) != null) {
                if (str == null) {
                    str = "preload";
                }
                interfaceC1196330hEl.setPreloadFlag(str);
            }
            c0poe.onNext(c1515640pXm.LIZIZ);
            return false;
        }
        c0poe.onFailed((Throwable) c1515640pXm.LIZIZ);
        return true;
    }
}
