package X;

import java.util.Set;

/* JADX INFO: renamed from: X.0dSF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050930dSF {
    public static final Set<Integer> LIZ = C13LQ.LJLIIL(new Integer[]{Integer.valueOf(EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR.getTYPE()), Integer.valueOf(EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR_2.getTYPE()), Integer.valueOf(EnumC1430380nKG.GAME_LIVE_PARTNER_ANCHOR_3.getTYPE())});

    public static final Set<Integer> LIZ() {
        return LIZ;
    }

    public static final boolean LIZIZ(Integer num) {
        if (num != null && LIZ.contains(num)) {
            return true;
        }
        return false;
    }
}
