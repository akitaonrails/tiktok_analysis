package X;

import android.content.Context;
import com.bytedance.android.livesdk.util.GlobalContext;

/* JADX INFO: renamed from: X.0US9, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0US9 implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 108;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        Context context = c500840JkY.LIZ;
        if (C804420Vh2.LJ(GlobalContext.getApplicationContext()) == EnumC804620VhM.MOBILE_2G) {
            C766270U4b.LJFF(2131854935, context);
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
