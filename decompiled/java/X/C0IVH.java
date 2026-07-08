package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightColdStartOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSkylightRefreshOptSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IVH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IVH {
    public static final /* synthetic */ int LIZ = 0;

    public static final Pair<List<Room>, String> LIZJ() {
        C0IT7 c0it7;
        C0IT6 c0it6 = C0IT6.LIZ;
        C0IT6.LIZ();
        C0IT1 c0it1 = C0IT6.LIZLLL;
        String str = null;
        List<? extends Room> list = c0it1 != null ? c0it1.LIZ : null;
        C0IT6.LIZ();
        C0IT1 c0it12 = C0IT6.LIZLLL;
        if (c0it12 != null && (c0it7 = c0it12.LIZIZ) != null) {
            str = c0it7.LIZ;
        }
        return new Pair<>(list, str);
    }

    public static final boolean LIZIZ() {
        return LiveSkylightRefreshOptSetting.enableFollowAutoRefresh() && LiveSkylightRefreshOptSetting.INSTANCE.config().intervalFollowSecond >= 30;
    }

    public static final boolean LIZLLL() {
        int globalFetchStrategy = LiveSkylightColdStartOptSetting.getGlobalFetchStrategy();
        return (globalFetchStrategy == 1 || globalFetchStrategy == 2) && LiveSkylightColdStartOptSetting.getGlobalFetchStartAdvance();
    }

    public static final boolean LIZ(C0IVJ c0ivj) {
        boolean zEnableFollowColdPrefetch;
        List<? extends Room> list;
        Long lValueOf;
        long followExpireTime;
        int[] iArr = C0IVI.LIZ;
        int i = iArr[c0ivj.ordinal()];
        if (i != 1) {
            if (i == 2) {
                zEnableFollowColdPrefetch = LiveSkylightColdStartOptSetting.enableInboxColdPrefetch();
            } else {
                throw new C1954807lC();
            }
        } else {
            zEnableFollowColdPrefetch = LiveSkylightColdStartOptSetting.enableFollowColdPrefetch();
        }
        if (!zEnableFollowColdPrefetch) {
            return false;
        }
        C0IT6 c0it6 = C0IT6.LIZ;
        C0IT6.LIZ();
        C0IT1 c0it1 = C0IT6.LIZLLL;
        if (c0it1 != null && (list = c0it1.LIZ) != null && !list.isEmpty() && (lValueOf = Long.valueOf(c0it1.LIZIZ.LIZIZ)) != null) {
            lValueOf.longValue();
            int i2 = iArr[c0ivj.ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    followExpireTime = LiveSkylightColdStartOptSetting.getInboxExpireTime();
                } else {
                    throw new C1954807lC();
                }
            } else {
                followExpireTime = LiveSkylightColdStartOptSetting.getFollowExpireTime();
            }
            long jCurrentTimeMillis = (System.currentTimeMillis() - lValueOf.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            if (jCurrentTimeMillis > 0 && jCurrentTimeMillis <= followExpireTime) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJ(AwS568S0100000_24 awS568S0100000_24) {
        C0IV2 c0iv2;
        if (Intrinsics.LJFF("inbox_refresh", "inbox_refresh")) {
            c0iv2 = C0IV2.INBOX_REFRESH;
        } else if (Intrinsics.LJFF("inbox_refresh", "follow_page_refresh")) {
            c0iv2 = C0IV2.FOLLOW_PAGE_REFRESH;
        } else {
            c0iv2 = C0IV2.UNKNOWN;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C340601Tw(c0iv2, awS568S0100000_24, null), 3);
    }
}
