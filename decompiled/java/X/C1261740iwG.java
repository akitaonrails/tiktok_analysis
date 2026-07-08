package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.relation.usercard.config.AuthCardFreqParams;

/* JADX INFO: renamed from: X.0iwG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261740iwG {
    public static final String LIZ() {
        String curUserId = C0XQ7.LJFF().getCurUserId();
        return curUserId == null ? "" : curUserId;
    }

    public static boolean LIZJ(C1261770iwJ c1261770iwJ) {
        EnumC1260230itp enumC1260230itp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("social_permission_card_freq_");
        sbLIZ.append(LIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        AuthCardFreqParams authCardFreqParams = new AuthCardFreqParams(10, 14, 14, 3);
        AbstractC1262510ixV abstractC1262510ixV = c1261770iwJ.LLILLJJLI;
        if (abstractC1262510ixV instanceof C1261850iwR) {
            enumC1260230itp = EnumC1260230itp.FOLLOWING_TAB;
        } else {
            enumC1260230itp = abstractC1262510ixV.LJFF;
        }
        C1903610zdX.LIZ.getClass();
        if (C1903610zdX.LIZIZ().showProfileFollowing || enumC1260230itp != EnumC1260230itp.FOLLOWING_TAB) {
            if (!C1903610zdX.LIZIZ().showProfileFriends && enumC1260230itp == EnumC1260230itp.FRIENDS_TAB) {
                return false;
            }
            if (!c1261770iwJ.LLILLJJLI.LIZLLL) {
                if (repo.getInt(LIZIZ(c1261770iwJ, "key_delete_count_"), 0) >= authCardFreqParams.maxDeleteCount) {
                    return false;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long lValueOf = Long.valueOf(repo.getLong(LIZIZ(c1261770iwJ, "key_delete_hide_ts_"), -1L));
                long jLongValue = lValueOf.longValue();
                if ((jLongValue != -1 && Math.abs((jCurrentTimeMillis - jLongValue) / 86400000) < authCardFreqParams.maxDeleteHideDays) || 0 != 0) {
                    lValueOf.longValue();
                    return false;
                }
                Long lValueOf2 = Long.valueOf(repo.getLong(LIZIZ(c1261770iwJ, "key_auto_hide_ts_"), -1L));
                long jLongValue2 = lValueOf2.longValue();
                if (jLongValue2 != -1 && Math.abs((jCurrentTimeMillis - jLongValue2) / 86400000) < authCardFreqParams.maxAutoHideDays) {
                    lValueOf2.longValue();
                    return false;
                }
                return true;
            }
            return true;
        }
        return false;
    }

    public static final String LIZIZ(C1261770iwJ c1261770iwJ, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(c1261770iwJ.LL.name());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
