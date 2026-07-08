package X;

import com.bytedance.android.livesdkapi.host.IHostIM;

/* JADX INFO: renamed from: X.0USC, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0USC implements InterfaceC759380Tqa {
    @Override // X.InterfaceC759380Tqa
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC759380Tqa
    public final int getErrorCode() {
        return 208;
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZIZ(C500840JkY c500840JkY, boolean z, C759360TqY c759360TqY) {
        boolean zJ71 = ((IHostIM) C1161920gLG.LIZJ(IHostIM.class)).j71();
        if (zJ71) {
            if (z) {
                C766270U4b.LIZLLL(2131832240);
            } else {
                C766270U4b.LIZLLL(2131832242);
            }
        }
        return Boolean.valueOf(zJ71);
    }

    @Override // X.InterfaceC759380Tqa
    public final Object LIZJ(C500840JkY c500840JkY, boolean z, C09AX c09ax) {
        return C759370TqZ.LIZ(this, c500840JkY, z, c09ax);
    }
}
