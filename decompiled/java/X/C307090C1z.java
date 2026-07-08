package X;

import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0C1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C307090C1z extends C09AY implements Function0<Integer> {
    public C307090C1z() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int i = 0;
        int iLJIJ = C0C64.LJIILLIIL().LJIJ(31744, 0, "golden_cache_video_file_inspect", true);
        if (iLJIJ > 0) {
            int iNextInt = AbstractC19994813Le.Default.nextInt() % 10;
            i = (iLJIJ + (iNextInt + ((((iNextInt ^ 10) & ((-iNextInt) | iNextInt)) >> 31) & 10))) - 5;
        }
        return Integer.valueOf(i);
    }
}
