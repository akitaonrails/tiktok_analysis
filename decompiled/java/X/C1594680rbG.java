package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ab.RefreshDuplicateConfig;
import com.ss.android.ugc.aweme.feed.data.ConsumeData;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeSaaSExtKt;
import com.ss.android.ugc.aweme.feed.model.KtfInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchServiceLowEnd;

/* JADX INFO: renamed from: X.0rbG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1594680rbG {
    public static String LIZ = "";

    public static boolean LIZ(Aweme aweme) {
        if (!C1594710rbJ.LIZ() || aweme == null || !AwemeSaaSExtKt.isLive(aweme)) {
            return false;
        }
        String aid = aweme.getAid();
        Keva keva = C1594670rbF.LIZ;
        if (C1594710rbJ.LIZ() && aid != null) {
            C1594670rbF.LIZ();
            ConsumeData consumeData = (ConsumeData) C1594670rbF.LIZIZ().LIZJ(aid);
            if (consumeData == null || !C1594720rbK.LIZIZ(aweme)) {
                return false;
            }
            C301980Bsa.LIZ.getClass();
            long jLIZ = C301980Bsa.LIZ();
            int deduplicationType = aweme.getDeduplicationType();
            int iLIZ = C1594720rbK.LIZ();
            if (iLIZ != 1) {
                if (iLIZ != 2) {
                    if (1 == deduplicationType && (consumeData.filterDuplicateTime <= 0 || (SystemClock.uptimeMillis() - consumeData.filterDuplicateTime) / 1000 >= jLIZ)) {
                        return false;
                    }
                } else {
                    long j = consumeData.clientAcceptanceTime;
                    long j2 = consumeData.liveCardShowTime;
                    if (j2 <= 0 && consumeData.liveCardLeaveTime <= 0 && j <= 0) {
                        return false;
                    }
                    long jMax = Math.max(consumeData.liveCardLeaveTime, j2);
                    if (!((RefreshDuplicateConfig) C1594710rbJ.LIZIZ.getValue()).realConsume) {
                        jMax = Math.max(j, jMax);
                    }
                    if ((consumeData.liveCardShowTime <= 0 || consumeData.liveCardLeaveTime >= 0) && (System.currentTimeMillis() - jMax) / 1000 >= jLIZ) {
                        return false;
                    }
                }
            } else {
                long j3 = consumeData.clientAcceptanceTime;
                if (j3 <= 0 || (System.currentTimeMillis() - j3) / 1000 >= jLIZ) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static boolean LIZIZ(C0SZ8 c0sz8) {
        if (c0sz8 != null && c0sz8.getAweme() != null && c0sz8.getAweme().isAd()) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(C0SZ8 c0sz8) {
        Aweme aweme;
        if (c0sz8 == null || (aweme = c0sz8.getAweme()) == null || aweme.getAwemeType() != 31) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Aweme aweme) {
        if (aweme == null || C729980SkG.LIZLLL(aweme) == null) {
            return false;
        }
        Aweme awemeLIZLLL = C729980SkG.LIZLLL(aweme);
        if (awemeLIZLLL.getAwemeType() != 502 && awemeLIZLLL.getAwemeType() != 501) {
            return false;
        }
        return true;
    }

    public static boolean LJ(Aweme aweme) {
        if (aweme != null && AwemeExtKt.isAdTraffic(aweme)) {
            return true;
        }
        return false;
    }

    public static boolean LJFF(C0SZ8 c0sz8) {
        if (c0sz8 != null && LJ(c0sz8.getAweme())) {
            return true;
        }
        return false;
    }

    public static boolean LJI(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 327) {
            return true;
        }
        return false;
    }

    public static boolean LJII(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 326) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIIZZ(Aweme aweme) {
        if (aweme != null && aweme.getAuthor() != null && TextUtils.equals(aweme.getAuthor().getUid(), C0XQ7.LJFF().getCurUser().getUid())) {
            return true;
        }
        return false;
    }

    public static boolean LJIIIZ(Aweme aweme) {
        KtfInfo ktfInfo;
        if (aweme == null || (ktfInfo = AwemeExtKt.getUploadMiscInfoStruct(aweme).ktfInfo) == null || !ktfInfo.showWarning) {
            return false;
        }
        return true;
    }

    public static boolean LJIIJ(Aweme aweme) {
        if (aweme != null && aweme.getAwemeType() == 328) {
            return true;
        }
        return false;
    }

    public static boolean LJIIJJI(C0SZ8 c0sz8) {
        if (c0sz8 != null && c0sz8.x3() != null && c0sz8.x3().getContentType() == 1) {
            return true;
        }
        return false;
    }

    public static void LJIIL(Aweme aweme) {
        if (aweme == null) {
            return;
        }
        if (C1157804fw.LIZ()) {
            if (((InterfaceC1600790rl7) ServiceManager.get().getService(ISearchServiceLowEnd.class)).LJIILL(aweme)) {
                return;
            }
        } else if (C1ER1.LIZIZ.LJIILL(aweme)) {
            return;
        }
        if (TextUtils.isEmpty(aweme.getAid())) {
            LIZ = "";
        } else {
            LIZ = aweme.getAid();
        }
    }
}
