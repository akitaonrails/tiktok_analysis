package X;

import com.ss.android.ugc.aweme.control.NetControlImpl;
import com.ss.android.ugc.aweme.net.control.DispatchConfig;
import com.ss.android.ugc.aweme.net.control.INetControl;
import java.util.Set;

/* JADX INFO: renamed from: X.0osj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490190osj implements INetControl {
    public static final C1490190osj LIZIZ = new C1490190osj();
    public final /* synthetic */ INetControl LIZ;

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZ(EnumC2262571Dh9 enumC2262571Dh9) {
        this.LIZ.LIZ(enumC2262571Dh9);
    }

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZIZ(EnumC2262571Dh9 enumC2262571Dh9, DispatchConfig dispatchConfig) {
        this.LIZ.LIZIZ(enumC2262571Dh9, dispatchConfig);
    }

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZJ(EnumC2262571Dh9 enumC2262571Dh9) {
        this.LIZ.LIZJ(enumC2262571Dh9);
    }

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final void LIZLLL(EnumC2262571Dh9 enumC2262571Dh9) {
        this.LIZ.LIZLLL(enumC2262571Dh9);
    }

    @Override // com.ss.android.ugc.aweme.net.control.INetControl
    public final Set<EnumC2262571Dh9> LJ() {
        return this.LIZ.LJ();
    }

    public C1490190osj() {
        INetControl iNetControl;
        Object objLIZ = C04TD.LIZ(INetControl.class, false);
        if (objLIZ != null) {
            iNetControl = (INetControl) objLIZ;
        } else {
            if (C04TD.LLLLLLLZIL == null) {
                synchronized (INetControl.class) {
                    if (C04TD.LLLLLLLZIL == null) {
                        C04TD.LLLLLLLZIL = new NetControlImpl();
                    }
                }
            }
            iNetControl = C04TD.LLLLLLLZIL;
        }
        this.LIZ = iNetControl;
    }
}
