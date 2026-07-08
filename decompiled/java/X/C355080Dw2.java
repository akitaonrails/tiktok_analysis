package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: renamed from: X.0Dw2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C355080Dw2 {
    public static final void LIZ(C0E48 c0e48) {
        int i = 0;
        c0e48.getPlayer().pause(false);
        long jLLLLLLJ = C351220Dpo.LLLLLLJ(c0e48.getPlayer().Jh());
        long[] jArr = new long[2];
        c0e48.Bq(jArr);
        long j = jArr[0];
        long j2 = jArr[1];
        if (j >= jLLLLLLJ) {
            C0E55 player = c0e48.getPlayer();
            if (jLLLLLLJ != 0) {
                i = LSPassThroughRecordSizeConfig.DEFAULT;
            }
            player.LJIJI(j + ((long) i), C351110Dpd.LIZ);
            return;
        }
        if (jLLLLLLJ < j2) {
            return;
        }
        if (C351220Dpo.LLLLLLL(jLLLLLLJ) == c0e48.getPlayer().qq() && jLLLLLLJ - j2 <= 1000) {
            c0e48.getPlayer().LJIJI(jLLLLLLJ, C351110Dpd.LIZ);
        } else {
            c0e48.getPlayer().LJIJI(j2 - ((long) LSPassThroughRecordSizeConfig.DEFAULT), C351110Dpd.LIZ);
        }
    }
}
