package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.0LFv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C540010LFv {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZLLL(int i) {
        return (int) ((i * 16.0f) / 9.0f);
    }

    public static Pair LIZ() {
        return new Pair(Integer.valueOf(C578540Mma.LIZ().recordPhotoCompileWidth), Integer.valueOf(LIZLLL(C578540Mma.LIZ().recordPhotoCompileWidth)));
    }

    public static EnumC540020LFw LIZIZ() {
        return C299870BpB.LIZ() == 0 ? EnumC540020LFw.NLE : EnumC540020LFw.MEDIA_PLAYER;
    }

    public static Pair LIZJ(int i) {
        if (i >= 4) {
            return new Pair(Integer.valueOf(C578540Mma.LIZ().recordVideoCompileWidth46), Integer.valueOf(LIZLLL(C578540Mma.LIZ().recordVideoCompileWidth46)));
        }
        return new Pair(Integer.valueOf(C578540Mma.LIZ().recordVideoCompileWidth123), Integer.valueOf(LIZLLL(C578540Mma.LIZ().recordVideoCompileWidth123)));
    }
}
