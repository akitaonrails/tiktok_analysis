package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.06z4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1786006z4 extends C09AY implements Function0<Integer> {
    public C1786006z4() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJIJ = 0;
        if (C104100aN.LIZ().isNewUser() && C1784706yr.LIZ()) {
            C0CBW c0cbw = C0CBW.LIZ;
            if (!C0CBW.LIZIZ()) {
                iLJIJ = 1;
            }
        } else {
            iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "player_medialoader_enable_file_extend_buffer", true);
        }
        return Integer.valueOf(iLJIJ);
    }
}
