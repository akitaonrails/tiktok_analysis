package X;

import com.bytedance.pumbaa.base2.interfaces.IStore;
import com.bytedance.pumbaa.impl.tt.TTStore;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.04uN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1247304uN {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static IStore LIZIZ;

    public static void LIZ() {
        IStore iStore;
        if (LIZ.compareAndSet(false, true)) {
            Object objLIZ = C04TD.LIZ(IStore.class, false);
            if (objLIZ != null) {
                iStore = (IStore) objLIZ;
            } else {
                if (C04TD.LJJJLIIL == null) {
                    synchronized (IStore.class) {
                        if (C04TD.LJJJLIIL == null) {
                            C04TD.LJJJLIIL = new TTStore();
                        }
                    }
                }
                iStore = C04TD.LJJJLIIL;
            }
            LIZIZ = iStore;
        }
    }
}
