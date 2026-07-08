package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.sync.IInitSyncHook;
import kotlin.jvm.internal.AwS567S0100000_23;

/* JADX INFO: renamed from: X.0qJl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1545390qJl implements IInitSyncHook {
    public static final C1545390qJl LIZIZ = new C1545390qJl();
    public final /* synthetic */ IInitSyncHook LIZ = (IInitSyncHook) ServiceManager.get().getService(IInitSyncHook.class, false, false);

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final InterfaceC1526670ppZ LIZ(C1519750peP c1519750peP) {
        return this.LIZ.LIZ(c1519750peP);
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final void LIZIZ(AwS567S0100000_23 awS567S0100000_23) {
        this.LIZ.LIZIZ(awS567S0100000_23);
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final boolean LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final String LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.sync.IInitSyncHook
    public final String LJ() {
        return this.LIZ.LJ();
    }
}
