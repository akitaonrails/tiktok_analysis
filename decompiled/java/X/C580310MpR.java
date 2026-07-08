package X;

import android.text.TextUtils;

/* JADX INFO: renamed from: X.0MpR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580310MpR {
    public static long LIZ(int i, String str) {
        long maxShootingDuration = C0CHQ.LIZ().LJJJJJ().getMaxDurationResolver().getMaxShootingDuration(i);
        if (!C0CHQ.LIZ().LJJIIZI().LJIIJ(true)) {
            maxShootingDuration = 15000;
        }
        if (!TextUtils.isEmpty(str)) {
            long musicDuration = C1403010mc7.LIZ.getMusicService().getMusicDuration(str);
            if (musicDuration != -1) {
                return Math.min(maxShootingDuration, musicDuration);
            }
        }
        return maxShootingDuration;
    }
}
