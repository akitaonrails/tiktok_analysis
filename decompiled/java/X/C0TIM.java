package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.0TIM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TIM {
    public static final C0TIM LIZ = new C0TIM();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(549));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(548));

    public static Keva LIZ() {
        return Keva.getRepo((String) LIZJ.getValue());
    }

    public static void LIZIZ(long j, long j2, long j3, long j4) {
        Keva kevaLIZ = LIZ();
        long jCurrentTimeMillis = System.currentTimeMillis();
        kevaLIZ.storeLong("collab_keva_value_history_follower_cnt", Math.max(j, ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowerCount()));
        kevaLIZ.storeLong("collab_keva_value_prev_check_time", jCurrentTimeMillis);
        kevaLIZ.storeLong("collab_keva_value_month_post_cnt", j2);
        kevaLIZ.storeLong("collab_keva_value_month_post_limit", j3);
        kevaLIZ.storeLong("collab_keva_value_follower_count_threshold", j4);
    }
}
