package X;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0CpI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325420CpI implements InterfaceC325430CpJ {
    public final LifecycleOwner LIZ;
    public final DataChannel LIZIZ;
    public final long LIZJ;
    public final InterfaceC325410CpH LIZLLL;
    public final C325440CpK LJ;
    public AnonymousClass0956 LJFF;
    public InterfaceC1090080eTO LJI;

    public final void LIZIZ() {
        AnonymousClass0956 anonymousClass0956;
        AnonymousClass0956 anonymousClass09562 = this.LJFF;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive() || (anonymousClass0956 = this.LJFF) == null) {
            return;
        }
        anonymousClass0956.LIZIZ(null);
    }

    @Override // X.InterfaceC325430CpJ
    public final void LIZ(boolean z) {
        if (!z) {
            LIZIZ();
            this.LIZLLL.LLLLZLLLI();
        }
    }

    public static void LIZJ(C325420CpI c325420CpI, long j, boolean z, int i) {
        boolean z2;
        if ((i & 2) != 0) {
            j = c325420CpI.LIZJ;
        }
        if ((i & 4) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        if (j >= 0) {
            c325420CpI.LIZIZ();
            c325420CpI.LJFF = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(c325420CpI.LIZ), null, null, new C325390CpF(0L, z2, c325420CpI, j, z, null), 3);
        }
    }

    public C325420CpI(LifecycleOwner lifecycleOwner, DataChannel dataChannel, long j, InterfaceC325410CpH interfaceC325410CpH, C325440CpK c325440CpK) {
        this.LIZ = lifecycleOwner;
        this.LIZIZ = dataChannel;
        this.LIZJ = j;
        this.LIZLLL = interfaceC325410CpH;
        this.LJ = c325440CpK;
    }
}
