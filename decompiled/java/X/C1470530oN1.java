package X;

import com.ss.android.ugc.playerkit.exp.model.PlayerReuseConfig;

/* JADX INFO: renamed from: X.0oN1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1470530oN1 {
    public static boolean LIZ(AbstractC1470590oN7 abstractC1470590oN7) {
        if (C1474810oTv.LLJI().enableKernelReuse && LIZIZ(abstractC1470590oN7)) {
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(AbstractC1470590oN7 abstractC1470590oN7) {
        boolean z;
        boolean z2;
        PlayerReuseConfig playerReuseConfigLLJI = C1474810oTv.LLJI();
        if (playerReuseConfigLLJI.enableMixReuse || ((abstractC1470590oN7.LIZJ() == EnumC1469090oKh.VOD_PLAYER && playerReuseConfigLLJI.enableVodReuse) || (abstractC1470590oN7.LIZLLL() && playerReuseConfigLLJI.enableLiveReuse))) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC1470590oN7.LIZIZ() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (playerReuseConfigLLJI.disableNonMediaBoxPlayerReuse) {
            if (z2 && abstractC1470590oN7.LIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }
}
