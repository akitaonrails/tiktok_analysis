package X;

import com.ss.android.ugc.aweme.control.RequestCoordinatorImpl;
import com.ss.android.ugc.aweme.net.control.IRequestCoordinator;

/* JADX INFO: renamed from: X.0VG4, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VG4 implements IRequestCoordinator {
    public static final C0VG4 LIZIZ = new C0VG4();
    public final /* synthetic */ IRequestCoordinator LIZ;

    @Override // com.ss.android.ugc.aweme.net.control.IRequestCoordinator
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.net.control.IRequestCoordinator
    public final void LIZIZ() {
        this.LIZ.LIZIZ();
    }

    public C0VG4() {
        IRequestCoordinator iRequestCoordinator;
        Object objLIZ = C04TD.LIZ(IRequestCoordinator.class, false);
        if (objLIZ != null) {
            iRequestCoordinator = (IRequestCoordinator) objLIZ;
        } else {
            if (C04TD.LLLLLLZ == null) {
                synchronized (IRequestCoordinator.class) {
                    if (C04TD.LLLLLLZ == null) {
                        C04TD.LLLLLLZ = new RequestCoordinatorImpl();
                    }
                }
            }
            iRequestCoordinator = C04TD.LLLLLLZ;
        }
        this.LIZ = iRequestCoordinator;
    }
}
