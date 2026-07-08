package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0JkZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C500850JkZ implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 107;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        boolean zLIZIZ;
        Context context = c500840JkY.LIZ;
        try {
            zLIZIZ = C036E.LIZ.LIZIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            zLIZIZ = false;
        }
        if (!zLIZIZ) {
            C766270U4b.LJFF(2131851931, context);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
