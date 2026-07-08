package X;

import com.ss.android.ugc.aweme.lemon.Lemon8ProfileContentSyncConfig;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10G3, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10G3 {
    public static final C10G3 LIZ = new C10G3();

    public static C10G5 LIZ(C10G6 c10g6) {
        int iIntValue;
        boolean z;
        int i;
        int i2;
        if (c10g6.LJI) {
            return C10GF.LIZ("in user changing", null);
        }
        Lemon8ProfileContentSyncConfig lemon8ProfileContentSyncConfig = c10g6.LIZ;
        if (lemon8ProfileContentSyncConfig.showStyle == 7 && !c10g6.LJIIIIZZ) {
            return C10GF.LIZ("need publish in current session", null);
        }
        if (!lemon8ProfileContentSyncConfig.canShowPopup) {
            return C10GF.LIZ("can show popup false", null);
        }
        int i3 = c10g6.LIZJ;
        long j = c10g6.LIZLLL;
        long j2 = c10g6.LJFF;
        long jMax = Math.max(j, c10g6.LJ);
        Integer numValueOf = Integer.valueOf(c10g6.LIZ.minConfigShowDurationDay);
        if (numValueOf.intValue() > 0) {
            iIntValue = numValueOf.intValue();
        } else {
            iIntValue = 1;
        }
        if (j2 - jMax > ((long) iIntValue) * 86400000 && (c10g6.LIZ.showStyle == 8 || ((i2 = lemon8ProfileContentSyncConfig.minShowDurationDay) > 0 && i3 < lemon8ProfileContentSyncConfig.maxShowCount && j2 - j > ((long) i2) * 86400000))) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return C10GF.LIZ("show count is limit", C2097608Jq.LJIIIIZZ(new Pair("show_count", String.valueOf(i3)), new Pair("max_show_count", String.valueOf(lemon8ProfileContentSyncConfig.maxShowCount)), new Pair("last_show_time_stamp", String.valueOf(j)), new Pair("current_time_stamp", String.valueOf(j2)), new Pair("min_show_duration_day", String.valueOf(lemon8ProfileContentSyncConfig.minShowDurationDay))));
        }
        EnumC1876780ywG enumC1876780ywG = c10g6.LJII;
        if (enumC1876780ywG != EnumC1876780ywG.APPROVE) {
            if (C123100dR.LIZ(lemon8ProfileContentSyncConfig.uid) && Intrinsics.LJFF(lemon8ProfileContentSyncConfig.uid, c10g6.LIZIZ)) {
                return new C10G5(true, null, null, 14);
            }
            Pair[] pairArr = new Pair[2];
            String str = lemon8ProfileContentSyncConfig.uid;
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("setting_uid", str);
            pairArr[1] = new Pair("current_uid", c10g6.LIZIZ);
            return C10GF.LIZ("uid not match", C2097608Jq.LJIIIIZZ(pairArr));
        }
        if (enumC1876780ywG != null) {
            i = enumC1876780ywG.getI();
        } else {
            i = -1;
        }
        return C10GF.LIZ("auth status not match", C2097908Jt.LIZJ(new Pair("auth_status", String.valueOf(i))));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(com.ss.android.ugc.aweme.lemon.profile.L8ContentSyncLocalSkipConfig r14) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10G3.LIZIZ(com.ss.android.ugc.aweme.lemon.profile.L8ContentSyncLocalSkipConfig):boolean");
    }
}
